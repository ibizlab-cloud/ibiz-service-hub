package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import io.modelcontextprotocol.server.McpServerFeatures.AsyncToolSpecification;
import io.modelcontextprotocol.server.McpServerFeatures.SyncToolSpecification;
import io.modelcontextprotocol.server.McpSyncServerExchange;
import io.modelcontextprotocol.spec.McpSchema.CallToolResult;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.SysUAAUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.plugin.ai.addin.IHttpMcpServerTransportAgent;
import net.ibizsys.central.plugin.ai.addin.IMcpServerToolProvider;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * Mcp服务器工具提供器对象基类
 * @author lionlau
 *
 */
public abstract class McpServerToolProviderBase extends SysMcpServerUtilRTAddinBase implements IMcpServerToolProvider{
	
	private static final org.apache.commons.logging.Log log = LogFactory.getLog(McpServerToolProviderBase.class);
	
	private List<AsyncToolSpecification> asyncToolSpecificationList = null;
	private List<SyncToolSpecification> syncToolSpecificationList = null;
	
	
	@Override
	public List<AsyncToolSpecification> getAsyncToolSpecifications() {
		return this.asyncToolSpecificationList;
	}
	
	protected void setAsyncToolSpecifications(List<AsyncToolSpecification> asyncToolSpecificationList) {
		this.asyncToolSpecificationList = asyncToolSpecificationList;
	}
	

	@Override
	public List<SyncToolSpecification> getSyncToolSpecifications() {
		return this.syncToolSpecificationList;
	}
	
	protected void setSyncToolSpecifications(List<SyncToolSpecification> syncToolSpecificationList) {
		this.setSyncToolSpecifications(syncToolSpecificationList, false);
	}
	
	protected void setSyncToolSpecifications(List<SyncToolSpecification> syncToolSpecificationList, boolean bAsyncTool) {
		this.syncToolSpecificationList = syncToolSpecificationList;
		if(bAsyncTool) {
			List<AsyncToolSpecification> asyncToolSpecificationList = new ArrayList<AsyncToolSpecification>();
			if(!ObjectUtils.isEmpty(syncToolSpecificationList)) {
				for(SyncToolSpecification item : syncToolSpecificationList) {
					asyncToolSpecificationList.add(fromSync(item));
				}
			}
			this.setAsyncToolSpecifications(Collections.unmodifiableList(asyncToolSpecificationList));
		}
	}
	
	
	protected AsyncToolSpecification fromSync(SyncToolSpecification tool) {
		if (tool == null) {
			return null;
		}
		return new AsyncToolSpecification(tool.getTool(),
				(exchange, map) -> Mono
					.fromCallable(() -> tool.getCall().apply(new McpSyncServerExchange(exchange), map))
					.subscribeOn(Schedulers.boundedElastic()));
	}
	
	protected void registerSyncToolSpecification(SyncToolSpecification tool, boolean bAsyncTool) {
		List<SyncToolSpecification> syncToolSpecificationList = new ArrayList<SyncToolSpecification>();
		List<SyncToolSpecification> last = this.getSyncToolSpecifications();
		if(last != null) {
			syncToolSpecificationList.addAll(last);
		}
		syncToolSpecificationList.add(tool);
		this.setSyncToolSpecifications(syncToolSpecificationList);
		if(bAsyncTool) {
			AsyncToolSpecification asyncToolSpecification = fromSync(tool);
			this.registerAsyncToolSpecification(asyncToolSpecification);
		}
	}
	
	protected void registerAsyncToolSpecification(AsyncToolSpecification tool) {
		List<AsyncToolSpecification> asyncToolSpecificationList = new ArrayList<AsyncToolSpecification>();
		List<AsyncToolSpecification> last = this.getAsyncToolSpecifications();
		if(last != null) {
			asyncToolSpecificationList.addAll(last);
		}
		asyncToolSpecificationList.add(tool);
		this.setAsyncToolSpecifications(asyncToolSpecificationList);
	}
	
	protected CallToolResult executeUserContextAction(Map arguments, IAction iAction, Object[] args, boolean bCatch){
		Map map = (Map)arguments.get("srfemployee");
		String strSystemId = (String)arguments.get("srfsystemid");
		if(ObjectUtils.isEmpty(strSystemId)) {
			strSystemId = this.getSystemRuntime().getDeploySystemId();
		}
		String strAccessToken = (String)arguments.get("srfaccesstoken");
		AccessToken accessToken = null;
		if(StringUtils.hasLength(strAccessToken)) {
			accessToken = this.getContext().getModelRuntime().getAccessToken(strAccessToken, true, true);
		}
		if(accessToken != null && accessToken.getEmployee() != null) {
			Employee employee = new Employee();
			employee.putAll(accessToken.getEmployee());
			
			Collection<? extends GrantedAuthority> authorities = null;
			String strAuthorities = accessToken.getAuthorities();
			if(StringUtils.hasLength(strAuthorities)) {
				authorities = JsonUtils.as(strAuthorities, SysUAAUtilRuntimeBase.UAAGrantedAuthorityListType);
			}
			EmployeeContext employeeContext = new EmployeeContext(employee, null, strSystemId, authorities);
			UserContext.setCurrent(employeeContext);
		}
		else if(map != null) {
			Employee employee = new Employee();
			employee.putAll(map);
			
			Collection<? extends GrantedAuthority> authorities = null;
			String strAuthorities = (String)arguments.get(IHttpMcpServerTransportAgent.HEADER_AUTHORITIES);
			if(StringUtils.hasLength(strAuthorities)) {
				authorities = JsonUtils.as(strAuthorities, SysUAAUtilRuntimeBase.UAAGrantedAuthorityListType);
			}
			EmployeeContext employeeContext = new EmployeeContext(employee, null, strSystemId, authorities);
			UserContext.setCurrent(employeeContext);
		}
		else {
			UserContext.setCurrent(this.getContext().getDefaultUserContext());
		}
		
		if(accessToken != null && accessToken.getAppContext() != null) {
			UserContext.getCurrentMust().setAppContext(new AppContext(accessToken.getAppContext()));
		}
		else {
			String strAppContext = (String)arguments.get(IHttpMcpServerTransportAgent.HEADER_APPCONTEXT);
			if(StringUtils.hasLength(strAppContext)) {
				strAppContext = new String(Base64.getDecoder().decode(strAppContext));
				Map<String, Object> contexts = JsonUtils.asMap(strAppContext);
				UserContext.getCurrentMust().setAppContext(new AppContext(contexts));
			}
		}
		
		try {
			Object ret = iAction.execute(args);
			if(ret instanceof CallToolResult) {
				return (CallToolResult)ret;
			}
			if(ret != null) {
				 return new CallToolResult(ret.toString(), false);
			}
			return new CallToolResult(getEmptyResultInfo(), false);
		}
		catch (Throwable ex) {
			log.error(ex);
			if(bCatch) {
				return new CallToolResult(ex.getMessage(), true);
			}
			ExceptionUtils.rethrowRuntimeException(ex);
			return null;
		}
		finally {
			UserContext.setCurrent(null);
		}
	}
	
	protected String getEmptyResultInfo() {
		return "";
	}
}
