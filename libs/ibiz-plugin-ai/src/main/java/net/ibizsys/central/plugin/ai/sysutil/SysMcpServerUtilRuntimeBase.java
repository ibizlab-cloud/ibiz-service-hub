package net.ibizsys.central.plugin.ai.sysutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import io.modelcontextprotocol.server.McpAsyncServer;
import io.modelcontextprotocol.server.McpServer;
import io.modelcontextprotocol.server.McpServerFeatures;
import io.modelcontextprotocol.spec.McpSchema.ServerCapabilities;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.plugin.ai.addin.IMcpServerToolProvider;
import net.ibizsys.central.plugin.ai.addin.IMcpServerTransportAgent;
import net.ibizsys.central.plugin.ai.addin.IMcpServerTransportProvider;
import net.ibizsys.central.plugin.ai.sysutil.addin.DefaultMcpServerToolProvider;
import net.ibizsys.central.plugin.ai.sysutil.addin.HttpSseMcpServerTransportProvider;
import net.ibizsys.central.plugin.ai.sysutil.addin.ISysMcpServerUtilRTAddin;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;


/**
 * 系统Mcp服务器功能组件运行时基类
 * @author lionlau
 *
 */
public abstract class SysMcpServerUtilRuntimeBase extends SysUtilRuntimeBase implements ISysMcpServerUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysMcpServerUtilRuntimeBase.class);
	//private static final Logger logger = LoggerFactory.getLogger(SysMcpServerUtilRuntimeBase.class);
	
	
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysMcpServerUtilRTAddin.class, "*:" + ADDIN_TRANSPORT_PREFIX + TRANSPORT_HTTP_SSE, HttpSseMcpServerTransportProvider.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysMcpServerUtilRTAddin.class, "*:" + ADDIN_TOOL_PREFIX + TOOL_DEFAULT, DefaultMcpServerToolProvider.class);
		//RuntimeObjectFactory.getInstance().registerObjectIf(ISysMcpServerUtilRTAddin.class, "*:" + ADDIN_TOOL_PREFIX + TOOL_AIFACTORY, AIFactoryMcpServerToolProvider.class);
	}
	
	
	@Override
	protected ISysMcpServerUtilRuntimeContext createModelRuntimeContext() {
		return new SysMcpServerUtilRuntimeContextBase<ISysMcpServerUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {

			@Override
			public String getBaseUrl() {
				return getSelf().getBaseUrl();
			}

			@Override
			public IUserContext getDefaultUserContext() {
				return getSelf().getDefaultUserContext();
			}
			
			@Override
			public boolean isDefaultUserOnly() {
				return getSelf().isDefaultUserOnly();
			}
		};
	}
	
	
	private Map<String, IMcpServerTransportProvider> mcpServerTransportProviderMap = null;
	
	private Map<String, IMcpServerTransportAgent> mcpServerTransportAgentMap = new ConcurrentHashMap<String, IMcpServerTransportAgent>();
	private Map<String, Object> mcpServerMap = new ConcurrentHashMap<String, Object>();
	
	private Map<String, IMcpServerToolProvider> mcpServerToolProviderMap = null;
	
	private Map<String, List<IMcpServerToolProvider>> mcpServerToolProviderMap2 = new HashMap<String, List<IMcpServerToolProvider>>();
	
	private Map<String, AccessToken> accessTokenMap = new ConcurrentHashMap<String, AccessToken>();
	
	public final static AccessToken EmptyAccessToken = new AccessToken(); 
	//private final McpSchema.ServerCapabilities serverCapabilities;
	
	private String strBaseUrl = null;
	private IUserContext defaultUserContext = null;
	private boolean bDefaultUserOnly = true;
	private String strTokenPrefix = "Bearer ";
	private List<McpServerFeatures.AsyncToolSpecification> asyncToolSpecificationList = null;
	
	
	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		
		this.strBaseUrl = this.getSystemRuntimeSetting().getParam(this.getConfigFolder()+".baseurl", this.getBaseUrl());
		if(!StringUtils.hasLength(this.getBaseUrl()) ) {
			this.strBaseUrl = String.format("http://%1$s:%2$s/%3$s/mcp", ServiceHub.getInstance().getIPAddress(), ServiceHub.getInstance().getPort(), this.getSystemRuntime().getServiceId());
		}
		
		String strTokenPrefix = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".tokenprefix", this.strTokenPrefix);
		if(StringUtils.hasLength(strTokenPrefix)) {
			this.setTokenPrefix(strTokenPrefix);
		}
		
		this.bDefaultUserOnly = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".defaultuseronly", isDefaultUserOnly());
		Map<String, Object> employeeMap = this.getSystemRuntimeSetting().getParams(this.getConfigFolder()+".employee", null);
		if(!ObjectUtils.isEmpty(employeeMap)) {
			Employee employee = new Employee();
	    	employee.putAll(employeeMap);
	    	this.defaultUserContext = new EmployeeContext(employee, null, this.getSystemRuntime().getDeploySystemId());
		}
		
		super.onPrepareDefaultSetting();
	}
	
	protected String getBaseUrl() {
		return this.strBaseUrl;
	}
	
	
	protected IUserContext getDefaultUserContext() {
		if(defaultUserContext == null) {
			return (IUserContext)this.getSystemRuntime().createDefaultUserContext();
		}
		else {
			return defaultUserContext;
		}
	}
	
	protected boolean isDefaultUserOnly() {
		return this.bDefaultUserOnly;
	}
	
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();
		
		prepareConfig();
	}
	
	@Override
	protected void onInstall() throws Exception {
		
		super.onInstall();
	
		this.mcpServerTransportProviderMap = this.getAddins(IMcpServerTransportProvider.class, ADDIN_TRANSPORT_PREFIX);
		this.mcpServerToolProviderMap = this.getAddins(IMcpServerToolProvider.class, ADDIN_TOOL_PREFIX);
		
		this.listenReloadSignal();
	}
	
	
	protected void listenReloadSignal() throws Exception {
		if (!(this.getSystemRuntime() instanceof IServiceSystemRuntime)) {
			return;
		}

		String strReloadSignalId = String.format("%1$s%2$s-%3$s", NacosServiceHubSettingBase.DATAID_RELOADSIGNAL_PREFIX, this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-")).toLowerCase();
		log.debug(String.format("McpServer组件[%1$s]监控重载配置[%2$s]", this.getName(), strReloadSignalId));
		((IServiceSystemRuntime) this.getSystemRuntime()).getConfigListenerRepo().addConfigListener(strReloadSignalId, new IConfigListener() {
			@Override
			public void receiveConfigInfo(String configInfo) {
				log.debug(String.format("%1$s接收到重载信号", getConfigFolder()));
				reload();
			}
		});
	}
	
	@Override
	public void reload() {
		try {
			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onReload() throws Throwable {
		this.accessTokenMap.clear();
	}
	
	public String getTokenPrefix() {
		return strTokenPrefix;
	}

	protected void setTokenPrefix(String strTokenPrefix) {
		this.strTokenPrefix = strTokenPrefix;
	}
	
	
	@Override
	public AccessToken getAccessToken(String strToken, boolean bValid, boolean bTryMode) {
		Assert.hasLength(strToken, "传入凭证无效");
		if(strToken.indexOf(this.getTokenPrefix()) != 0) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("传入凭证无效"));
		}
		
		strToken = strToken.substring(this.getTokenPrefix().length()).trim();
		if(!StringUtils.hasLength(strToken)) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("传入凭证无效"));
		}
		try {
			return this.onGetAccessToken(strToken.toLowerCase(), bValid, bTryMode);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("获取凭证发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected AccessToken onGetAccessToken(String strToken, boolean bValid, boolean bTryMode) throws Throwable{
		AccessToken accessToken = this.accessTokenMap.get(strToken);
		if(accessToken == null) {
			//获取
			String strAccessTokenId = String.format("%1$s%2$s-%3$s--%4$s", NacosServiceHubSettingBase.DATAID_ACCESSTOKEN_PREFIX, this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-"), strToken).toLowerCase();
			String strConfig = ServiceHub.getInstance().getConfig(strAccessTokenId);
			if(ObjectUtils.isEmpty(strConfig)) {
				accessToken = EmptyAccessToken;
			}
			else {
				Yaml yaml = new Yaml();
				accessToken = JsonUtils.as(yaml.loadAs(strConfig, Map.class), AccessToken.class);
			}
			this.accessTokenMap.put(strToken, accessToken);
		}
		if(accessToken == EmptyAccessToken) {
			if(bTryMode) {
				return null;
			}
			throw new Exception("凭证不存在");
		}
		if(bValid) {
			//判断有效
			if(DataTypeUtils.asBoolean(accessToken.getDisabled(), false)) {
				if(bTryMode) {
					return null;
				}
				throw new Exception("凭证已禁用");
			}
			
			java.sql.Timestamp expiresTime = accessToken.getExpiresTime();
			if(expiresTime != null) {
				if(expiresTime.getTime() < System.currentTimeMillis()) {
					if(bTryMode) {
						return null;
					}
					throw new Exception("凭证已过期");
				}
			}
		}
		
		return accessToken;
	}
	
	@Override
	protected void onUninstall() throws Throwable {
		
		if(!ObjectUtils.isEmpty(this.mcpServerToolProviderMap)) {
			this.mcpServerToolProviderMap.clear();
		}
		
		if(!ObjectUtils.isEmpty(this.mcpServerToolProviderMap2)) {
			this.mcpServerToolProviderMap2.clear();
		}
		
		this.resetTransportAgents();
		
		super.onUninstall();
	}

	protected void prepareConfig() throws Exception {


	}
	
	
	private SysMcpServerUtilRuntimeBase getSelf() {
		return this;
	}
	
	@Override
	protected ISysMcpServerUtilRuntimeContext getModelRuntimeContext() {
		return (ISysMcpServerUtilRuntimeContext)super.getModelRuntimeContext();
	}
	

	@Override
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(getModelRuntimeContext(), ISysMcpServerUtilRTAddin.class, String.format("%1$s:",this.getFullUniqueTag()));
	}
	
	
	@Override
	public IMcpServerTransportAgent getTransportAgent(String strType, boolean bTryMode) {
		Assert.hasLength(strType, "传入传输类型无效");
		String strType2 = strType.toUpperCase();
		return (IMcpServerTransportAgent)executeAction("获取传输代理", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				
				Object item = mcpServerTransportAgentMap.get(strType2);
				if (item != null) {
					return (IMcpServerTransportAgent) item;
				}
				
				IMcpServerTransportAgent iTransportAgent = onGetTransportAgent(strType2, bTryMode);
				if(iTransportAgent != null)  {
					mcpServerTransportAgentMap.put(strType2, iTransportAgent);
				}
				return iTransportAgent;
				
			}
		}, null);
	}

	
	
	protected IMcpServerTransportAgent onGetTransportAgent(String strType, boolean bTryMode) throws Throwable {
		
		IMcpServerTransportProvider iMcpServerTransportProvider = this.mcpServerTransportProviderMap.get(strType);
		if(iMcpServerTransportProvider == null) {
			if(bTryMode) {
				return null;
			}
			throw new Exception(String.format("传输代理[%1$s]提供方无效", strType));
		}
		
		IMcpServerTransportAgent iTransportAgent = iMcpServerTransportProvider.createMcpServerTransportAgent(strType);
		iTransportAgent.init(this.getModelRuntimeContext(), strType);
		iTransportAgent.start();
		this.prepareTransportAgent(iTransportAgent);
		return iTransportAgent;
	}
	
	protected void prepareTransportAgent(IMcpServerTransportAgent iTransportAgent) throws Throwable {
		McpAsyncServer asyncServer = McpServer.async(iTransportAgent)
			    .serverInfo(this.getName(), "1.0.0")
			    .capabilities(ServerCapabilities.builder()
			        .resources(false, true)     // Enable resource support
			        .tools(true)                // Enable tool support
			        .prompts(true)              // Enable prompt support
			        .logging()                  // Enable logging support
			        //.completions()              // Enable completions support
			        .build())
			    .build();
		
		this.mcpServerMap.put(iTransportAgent.getType(), asyncServer);
		

		List<McpServerFeatures.AsyncToolSpecification> list = this.getAsyncToolSpecifications();
		if(!ObjectUtils.isEmpty(list)) {
			for(McpServerFeatures.AsyncToolSpecification asyncToolSpecification : list) {
				asyncServer.addTool(asyncToolSpecification).subscribe();
			}
		}
	}
	
	protected List<McpServerFeatures.AsyncToolSpecification> getAsyncToolSpecifications() {
		//this.asyncToolSpecificationList  = null;
		if(this.asyncToolSpecificationList == null ) {
			Map<String, IMcpServerToolProvider> map = new LinkedHashMap<String, IMcpServerToolProvider>();
			for(String key : this.mcpServerToolProviderMap2.keySet()) {
				List<IMcpServerToolProvider> list = this.mcpServerToolProviderMap2.get(key);
				if(ObjectUtils.isEmpty(list)) {
					continue;
				}
				
				map.put(key, list.get(0));
			}
			
			for(String key : this.mcpServerToolProviderMap.keySet()) {
				if(map.containsKey(key)) {
					continue;
				}
				
				IMcpServerToolProvider iMcpServerToolProvider = this.mcpServerToolProviderMap.get(key);
				if(!iMcpServerToolProvider.isEnabled()) {
					continue;
				}
				
				map.put(key, iMcpServerToolProvider);
			}
			
			List<McpServerFeatures.AsyncToolSpecification> allList = new ArrayList<McpServerFeatures.AsyncToolSpecification>();
			for(IMcpServerToolProvider iMcpServerToolProvider : map.values()) {
				List<McpServerFeatures.AsyncToolSpecification> list = iMcpServerToolProvider.getAsyncToolSpecifications();
				if(ObjectUtils.isEmpty(list)) {
					continue;
				}
				allList.addAll(list);
			}
			if(this.asyncToolSpecificationList == null) {
				this.asyncToolSpecificationList = allList;
			}
		}
		return this.asyncToolSpecificationList;
	}
	
	protected void resetAsyncToolSpecifications() {
		this.asyncToolSpecificationList = null;
	}
	
	protected void destoryTransportAgent(IMcpServerTransportAgent iTransportAgent) throws Throwable {
		Object server = this.mcpServerMap.get(iTransportAgent.getType());
		if(server instanceof McpAsyncServer) {
			((McpAsyncServer)server).close();
			return;
		}
	}
	
	@Override
	public boolean resetTransportAgent(String strType) {
		Assert.hasLength(strType, "传入传输类型无效");
		String strType2 = strType.toUpperCase();
		return (boolean)executeAction("重置传输代理", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				Object item = mcpServerTransportAgentMap.remove(strType2);
				if(item instanceof IMcpServerTransportAgent) {
					try {
						destoryTransportAgent((IMcpServerTransportAgent)item);
					}
					catch (Throwable ex) {
						log.error(ex);
					}
					try {
						((IMcpServerTransportAgent)item).stop();
					}
					catch (Throwable ex) {
						log.error(ex);
					}
					
				}
				return item!=null;
			}
		}, null);
	}
	
	@Override
	public void resetTransportAgents() {
		Collection<IMcpServerTransportAgent> agents = Collections.unmodifiableCollection(this.mcpServerTransportAgentMap.values());
		this.mcpServerTransportAgentMap.clear();
		if(!ObjectUtils.isEmpty(agents)) {
			for(IMcpServerTransportAgent iMcpServerTransportAgent : agents) {
				try {
					destoryTransportAgent(iMcpServerTransportAgent);
				}
				catch (Throwable ex) {
					log.error(ex);
				}
				try {
					iMcpServerTransportAgent.stop();
				}
				catch (Throwable ex) {
					log.error(ex);
				}
			}
		}
	}
	
	
	@Override
	public boolean containsMcpServerToolProvider(String strToolProviderName) {
		Assert.hasLength(strToolProviderName, "未传入工具提供器名称");
		strToolProviderName = strToolProviderName.toUpperCase();
		List<IMcpServerToolProvider> list = this.mcpServerToolProviderMap2.get(strToolProviderName);
		if(!ObjectUtils.isEmpty(list)) {
			return true;
		}
		
		IMcpServerToolProvider iMcpServerTool = this.mcpServerToolProviderMap.get(strToolProviderName);
		if(iMcpServerTool != null) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public void registerMcpServerToolProvider(String strToolProviderName, IMcpServerToolProvider iMcpServerTool) {
		Assert.hasLength(strToolProviderName, "未传入工具提供器名称");
		Assert.notNull(iMcpServerTool, "未传入工具提供器对象");
		strToolProviderName = strToolProviderName.toUpperCase();
		synchronized (this.mcpServerToolProviderMap2) {
			List<IMcpServerToolProvider> last = this.mcpServerToolProviderMap2.get(strToolProviderName);
			List<IMcpServerToolProvider> list = new ArrayList<IMcpServerToolProvider>();
			if(last != null) {
				list.addAll(last);
			}
			if(!list.contains(iMcpServerTool)) {
				list.add(iMcpServerTool);
				Collections.sort(list, new Comparator<IMcpServerToolProvider>() {
					@Override
					public int compare(IMcpServerToolProvider o1, IMcpServerToolProvider o2) {
						return Integer.compare(o1.getPriority(), o2.getPriority());
					}
				});
			}
			this.mcpServerToolProviderMap2.put(strToolProviderName, list);
			resetAsyncToolSpecifications();
		}
	}

	@Override
	public boolean unregisterMcpServerToolProvider(String strToolProviderName, IMcpServerToolProvider iMcpServerTool) {
		Assert.hasLength(strToolProviderName, "未传入工具提供器名称");
		Assert.notNull(iMcpServerTool, "未传入工具提供器对象");
		strToolProviderName = strToolProviderName.toUpperCase();
		synchronized (this.mcpServerToolProviderMap2) {
			List<IMcpServerToolProvider> last = this.mcpServerToolProviderMap2.get(strToolProviderName);
			List<IMcpServerToolProvider> list = new ArrayList<IMcpServerToolProvider>();
			if(last != null) {
				list.addAll(last);
			}
			if(list.contains(iMcpServerTool)) {
				list.remove(iMcpServerTool);
				this.mcpServerToolProviderMap2.put(strToolProviderName, list);
				resetAsyncToolSpecifications();
				return true;
			}
			return false;			
		}
	}
	
}
