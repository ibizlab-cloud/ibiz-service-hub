package net.ibizsys.central.cloud.ai.core.addin;

import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import io.jsonwebtoken.lang.Assert;
import net.ibizsys.central.cloud.ai.core.cloudutil.ICloudAIUtilRuntimeContext;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.cloud.core.util.domain.McpServer;
import net.ibizsys.central.plugin.ai.addin.IHttpMcpServerTransportAgent;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class McpServerAgentBase extends CloudAIUtilRTAddinBase implements IMcpServerAgent {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(McpServerAgentBase.class);
	
	private long nTokenTimeout = 0;
	private int nDefaultTokenTimeout = 0;
	private String strMcpServerId = null;
	private String strToken = null;
	private String strType = null;
	private String strTokenDigest = null;
	private boolean bStarted = false;
	private boolean bRunAuthTimer = false;
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private ISysUAAUtilRuntime iSysUAAUtilRuntime = null;
	
	@Override
	public void init(ICloudAIUtilRuntimeContext ctx, McpServer mcpServer) throws Exception {
		this.setMcpServerId(mcpServer.getId());
		this.setType(mcpServer.getType());
		this.setDefaultTokenTimeout(60*60*1000);
		super.init(ctx, mcpServer);
	}
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();
		
	}
	
	@Override
	public void start() throws Exception {
		if(this.bStarted) {
			log.warn("McpServer代理代理已经启动");
			return;
		}
		this.onStart();
		this.bStarted = true;
	}
	
	protected void onStart() throws Exception{
		this.bRunAuthTimer = true;
		runAuthTimer();
	}
	
	@Override
	public void stop() throws Exception{
		if(!this.bStarted) {
			return;
		}
		this.bStarted = false;
		this.onStop();
	}
	
	protected void onStop() throws Exception{
		this.bRunAuthTimer = false;
	}
	
	public boolean isStarted() {
		return this.bStarted;
	}
	
	@Override
	public McpServer getAgentData() {
		//return this.getContext().getMcpServer(this.getMcpServerId());
		return (McpServer)getAddinData();
	}
	

	@Override
	public String getType() {
		return this.strType;
	}
	
	protected void setType(String strType) {
		this.strType = strType;
	}
	
	protected String getMcpServerId() {
		return this.strMcpServerId;
	}
	
	protected void setMcpServerId(String strMcpServerId) {
		this.strMcpServerId = strMcpServerId;
	}
	

	protected long getTokenTimeout() {
		return this.nTokenTimeout;
	}

	public void setTokenTimeout(long nTokenTimeout) {
		this.nTokenTimeout = nTokenTimeout;
	}

	protected int getDefaultTokenTimeout() {
		return this.nDefaultTokenTimeout;
	}

	protected void setDefaultTokenTimeout(int nDefaultTokenTimeout) {
		this.nDefaultTokenTimeout = nDefaultTokenTimeout;
	}


	protected synchronized String getToken() {
		if(StringUtils.hasLength(this.strToken)) {
			String strDigest = calcTokenDigest(this.strToken);
			if(!strDigest.equals(this.strTokenDigest)) {
				this.strToken = "";
				log.warn(String.format("Token摘要信息不一致，重新请求"));
			}
			else {
				return this.strToken;
			}
		}
		if(!StringUtils.hasLength(this.strToken)) {
			this.requestToken(true);
		}
		return this.strToken;
	}
	
	protected void setToken(String strToken) {
		this.strToken = strToken;
		if(StringUtils.hasLength(strToken)) {
			this.strTokenDigest = this.calcTokenDigest(strToken);
		}
		else {
			this.strTokenDigest = "";
		}
	}
	
	
	protected String calcTokenDigest(String strToken) {
		McpServer agentData = this.getAgentData();
		return KeyValueUtils.genUniqueId(agentData.getAccessKey(), agentData.getSecretKey(), strToken);
	}
	
	
	protected void requestTokenIf(boolean bImmediately) {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 60000) {
			return;
		}
		this.requestToken(bImmediately);
	}

	protected void requestToken() {
		this.requestToken(false);
	}

	protected void requestToken(boolean bImmediately) {
		if (bImmediately) {
			onRequestToken();
		} else {
			this.setTokenTimeout(0);
		}
	}

	protected void onRequestToken() {
		
		McpServer mcpServer = this.getAgentData();
		try {
			if(DataTypeUtils.getIntegerValue(mcpServer.getDisabled(), 0) == 1) {
				throw new Exception("已被禁用");
			}
		}
		catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAIUtilRuntime(), String.format("McpServer代理[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
		
		
		try {
			long nLastTokenTimeout = this.getTokenTimeout();
			this.setToken(doRequestToken());
			if (this.getTokenTimeout() == nLastTokenTimeout) {
				this.setTokenTimeout(System.currentTimeMillis() + this.getDefaultTokenTimeout());
			}
			
			//this.getSystemRuntime().logEvent(LogLevels.ERROR, LogCats.AI_MCPSERVER, String.format("McpServer代理[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			
			
		} catch (Throwable ex) {
			log.error(String.format("McpServer代理[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.AI_MCPSERVER, String.format("McpServer代理[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			// 下一个时间周期继续认证
			this.setTokenTimeout(0);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAIUtilRuntime(), String.format("McpServer代理[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected String doRequestToken() throws Throwable{
		throw new Exception("没有实现");
	}
	
	protected void runAuthTimer() {
		runAuthTimer(false);
	}

	protected void runAuthTimer(boolean bTimerOnly) {
		if(!this.bRunAuthTimer) {
			return;
		}
		
		if(!bTimerOnly) {
			try {
				onAuthTimer();
			} catch (Throwable ex) {
				log.error(String.format("McpServer代理[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
				getSystemRuntime().log(LogLevels.ERROR,  LogCats.AI_MCPSERVER, String.format("McpServer代理[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}
		
		
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runAuthTimer();
			}
		}, System.currentTimeMillis() + 20000, "AuthTimer_McpServer_" + this.getMcpServerId());
	}

	protected void onAuthTimer() {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 120000) {
			return;
		}

		// 执行认证
		onRequestToken();
	}
	
	
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if(this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
	
	protected ISysUAAUtilRuntime getSysUAAUtilRuntime() {
		if(this.iSysUAAUtilRuntime == null) {
			this.iSysUAAUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysUAAUtilRuntime.class, false);
		}
		return this.iSysUAAUtilRuntime;
	}
	
	protected Map<String, Object> getAdditionalHeaders() {
		IEmployeeContext employeeContext = EmployeeContext.getCurrent();
		if (employeeContext == null) {
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(ISysUAAUtilRuntime.HEADER_DCID, employeeContext.getTenant());
		map.put(ISysUAAUtilRuntime.HEADER_DCSYSTEMID, employeeContext.getDcsystemid());
		map.put(ISysUAAUtilRuntime.HEADER_SYSTEMID, employeeContext.getSystemid());
		if(StringUtils.hasLength(employeeContext.getOrgid())) {
			map.put(ISysUAAUtilRuntime.HEADER_ORGID, employeeContext.getOrgid());
		}
		
		map.put(ISysUAAUtilRuntime.HEADER_USERID, employeeContext.getUserid());
		if(StringUtils.hasLength(employeeContext.getUsername())) {
			try {
				map.put(ISysUAAUtilRuntime.HEADER_USERNAME, URLEncoder.encode(employeeContext.getUsername(), "UTF-8"));
			} catch (Exception ex) {
				log.error(ex);
				map.put(ISysUAAUtilRuntime.HEADER_USERNAME, employeeContext.getUsername());
			}
		}
		
		if(StringUtils.hasLength(employeeContext.getUsercode())) {
			map.put(ISysUAAUtilRuntime.HEADER_USERCODE, employeeContext.getUsercode());
		}
		
		if(StringUtils.hasLength(employeeContext.getOrgcode())) {
			map.put(ISysUAAUtilRuntime.HEADER_ORGCODE, employeeContext.getOrgcode());
		}
		
		if(StringUtils.hasLength(employeeContext.getDeptid())) {
			map.put(ISysUAAUtilRuntime.HEADER_DEPTID, employeeContext.getDeptid());
		}
		
		if(StringUtils.hasLength(employeeContext.getDeptcode())) {
			map.put(ISysUAAUtilRuntime.HEADER_DEPTCODE, employeeContext.getDeptcode());
		}
		
		if(StringUtils.hasLength(employeeContext.getPorg())) {
			map.put(ISysUAAUtilRuntime.HEADER_PORGIDS, employeeContext.getPorg());
		}
		
		if(StringUtils.hasLength(employeeContext.getSorg())) {
			map.put(ISysUAAUtilRuntime.HEADER_SORGIDS, employeeContext.getSorg());
		}
		
		if(StringUtils.hasLength(employeeContext.getPdept())) {
			map.put(ISysUAAUtilRuntime.HEADER_PDEPTIDS, employeeContext.getPdept());
		}
		
		if(StringUtils.hasLength(employeeContext.getSdept())) {
			map.put(ISysUAAUtilRuntime.HEADER_SDEPTIDS, employeeContext.getSdept());
		}
		
		if(!ObjectUtils.isEmpty(employeeContext.getAuthorities())) {
			map.put(IHttpMcpServerTransportAgent.HEADER_AUTHORITIES, JsonUtils.toString(employeeContext.getAuthorities()));
		}
		
		if(employeeContext.isSuperuser()) {
			map.put(IHttpMcpServerTransportAgent.HEADER_SUPERUSER, "1");
		}
		
		
		return map;
	}
	

	@Override
	public List<ChatTool> getTools() {
		return this.onGetTools();
	}
	
	protected List<ChatTool> onGetTools() {
		return Collections.emptyList();
	}

	@Override
	public boolean containsTool(String strToolName) {
		Assert.hasLength(strToolName, "未传入工具名称");
		final List<ChatTool> list = this.getTools();
		if(!ObjectUtils.isEmpty(list)) {
			for(ChatTool chatTool : list) {
				if(chatTool.getFunction() != null && strToolName.equals(chatTool.getFunction().getName())) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String callTool(String strToolName, Object arg, String strAppContextData) throws Throwable {
		Assert.hasLength(strToolName, "未传入工具名称");
		return onCallTool(strToolName, arg, strAppContextData);
	}
	
	
	protected String onCallTool(String strToolName, Object arg, String strAppContextData) throws Throwable {
		throw new Exception(String.format("未支持工具[%1$s]", strToolName));
	}
	
	
}
