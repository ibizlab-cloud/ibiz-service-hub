package net.ibizsys.central.plugin.cloud.service;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIDERuntime;
import net.ibizsys.central.service.SubSysServiceAPIRuntime;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * Cloud服务接口客户端运行时
 * 
 * @author lionlau
 *
 */
public class CloudServiceClientRuntime extends SubSysServiceAPIRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(CloudServiceClientRuntime.class);

	public final static String APITAG_CLOUDCLIENT = "CLOUDCLIENT";
	
	/**
	 * CloudAI 服务
	 */
	public final static String CLOUDSERVICE_AI = "_CLOUD_AI_";
	

	private IPSSubSysServiceAPI defaultPSSubSysServiceAPI = null;
	
	private ISysUAAUtilRuntime iSysUAAUtilRuntime = null;

	@Override
	protected void onInit() throws Exception {

		super.onInit();
		
		if(this.getSysUAAUtilRuntime(true)==null){
			this.prepareSysUAAUtilRuntime(!isPrepareSysUAAUtilRuntime());
		}
	}
	
	protected ISysUAAUtilRuntime getSysUAAUtilRuntime() {
		return this.getSysUAAUtilRuntime(false);
	}
	
	protected ISysUAAUtilRuntime getSysUAAUtilRuntime(boolean bTryMode) {
		if(this.iSysUAAUtilRuntime != null || bTryMode) {
			return this.iSysUAAUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定系统UAA功能组件");
	}
	
	protected void setSysUAAUtilRuntime(ISysUAAUtilRuntime iSysUAAUtilRuntime) {
		this.iSysUAAUtilRuntime = iSysUAAUtilRuntime;
	}
	
	protected void prepareSysUAAUtilRuntime(boolean bTryMode) throws Exception {
		this.setSysUAAUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysUAAUtilRuntime.class, bTryMode));
	}
	
	protected boolean isPrepareSysUAAUtilRuntime() {
		return true;
	}
	
	@Override
	protected ISubSysServiceAPIDERuntime createSubSysServiceAPIDERuntime(IPSSubSysServiceAPIDE iPSSubSysServiceAPIDE) throws Exception {
		if(iPSSubSysServiceAPIDE.getPSSysSFPlugin() == null) {
			if(StringUtils.hasLength(iPSSubSysServiceAPIDE.getName()) && iPSSubSysServiceAPIDE.getName().indexOf("_CLOUD_") == 0) {
				if(CLOUDSERVICE_AI.equalsIgnoreCase(iPSSubSysServiceAPIDE.getName())) {
					return new CloudServiceAIClientRuntime();
				}
			}
		}
		return super.createSubSysServiceAPIDERuntime(iPSSubSysServiceAPIDE);
	}
	
	

	protected IPSSubSysServiceAPI getDefaultPSSubSysServiceAPI() {
		if (this.defaultPSSubSysServiceAPI == null) {
			String strFullModelPath = "/sysmodel/cloudclient/PSSUBSYSSERVICEAPIS/CloudClient.json";
			ObjectNode objectNode;
			try {
				objectNode = (ObjectNode) JsonUtils.MAPPER.readTree(this.getClass().getResourceAsStream(strFullModelPath));
				this.defaultPSSubSysServiceAPI = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getSystemRuntime().getPSSystem(), IPSSubSysServiceAPI.class, objectNode);
			} catch (IOException ex) {
				throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("获取默认外部服务接口模型发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		return this.defaultPSSubSysServiceAPI;
	}

	@Override
	public Map<String, ?> getHeaders() {
		IEmployeeContext employeeContext = getCurrentEmployeeContext();
		if (employeeContext == null) {
			return super.getHeaders();
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		IAuthenticationUser authenticationUser = getCurrentAuthenticationUser();
		if(authenticationUser != null) {
			//认证用户非API用户，使用当前用户Token
			if(authenticationUser.getApiuser() == 0
					&& StringUtils.hasLength(authenticationUser.getToken())
					&& StringUtils.hasLength(authenticationUser.getUserid())
					&& StringUtils.hasLength(employeeContext.getUaauserid())
					&& authenticationUser.getUserid().equals(employeeContext.getUaauserid())) {
				String strTokenHeader = this.getSysUAAUtilRuntime().getTokenHeader();
				if(StringUtils.hasLength(strTokenHeader)) {
					String strTokenPrefix = this.getSysUAAUtilRuntime().getTokenPrefix();
					if(StringUtils.hasLength(strTokenPrefix)) {
						map.put(strTokenHeader, String.format("%1$s%2$s", strTokenPrefix, authenticationUser.getToken()));
					}
					else {
						map.put(strTokenHeader, authenticationUser.getToken());
					}
					map.put(ISysUAAUtilRuntime.HEADER_SYSTEMID, employeeContext.getSystemid());
					if(StringUtils.hasLength(employeeContext.getOrgid())) {
						map.put(ISysUAAUtilRuntime.HEADER_ORGID, employeeContext.getOrgid());
					}
					return map;
				}
			}
		}
		
		// 补充用户上下文
		Map<String, ?> globalHeader = super.getHeaders();
		if (globalHeader != null) {
			map.putAll(globalHeader);
		}

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
		
		return map;
	}
	
	protected IEmployeeContext getCurrentEmployeeContext() {
		return EmployeeContext.getCurrent();
	}
	
	protected IAuthenticationUser getCurrentAuthenticationUser() {
		return AuthenticationUser.getCurrent();
	}


	@Override
	protected String getMethodScriptCode() {
		String strMethodScriptCode = super.getMethodScriptCode();
		if (StringUtils.hasLength(strMethodScriptCode)) {
			return strMethodScriptCode;
		}
		return this.getDefaultPSSubSysServiceAPI().getMethodScriptCode();
	}

	@Override
	protected String getAuthScriptCode() {
		String strAuthScriptCode = super.getAuthScriptCode();
		if (StringUtils.hasLength(strAuthScriptCode)) {
			return strAuthScriptCode;
		}
		
		//使用认知模式
		return this.getDefaultPSSubSysServiceAPI().getAuthScriptCode();
	}

	@Override
	public String getAccessTokenUrl() {
		String strAccessTokenUrl = super.getAccessTokenUrl();
		if (StringUtils.hasLength(strAccessTokenUrl)) {
			return strAccessTokenUrl;
		}
		return this.getSystemRuntimeSetting().getParam(ISysCloudClientUtilRuntime.CLOUDCLIENTUTIL_CONFIGFOLDER + ".accesstokenurl", null);
	}

	@Override
	public String getClientId() {
		String strClientId = super.getClientId();
		if (StringUtils.hasLength(strClientId)) {
			return strClientId;
		}

		// 如外部已经定义了认证路径，则以外部配置为主
		String strAccessTokenUrl = super.getAccessTokenUrl();
		if (StringUtils.hasLength(strAccessTokenUrl)) {
			return strClientId;
		}

		return this.getSystemRuntimeSetting().getParam(ISysCloudClientUtilRuntime.CLOUDCLIENTUTIL_CONFIGFOLDER + ".clientid", null);
	}

	@Override
	public String getClientSecret() {
		String strClientSecret = super.getClientSecret();
		if (StringUtils.hasLength(strClientSecret)) {
			return strClientSecret;
		}

		// 如外部已经定义了认证路径，则以外部配置为主
		String strAccessTokenUrl = super.getAccessTokenUrl();
		if (StringUtils.hasLength(strAccessTokenUrl)) {
			return strClientSecret;
		}

		return this.getSystemRuntimeSetting().getParam(ISysCloudClientUtilRuntime.CLOUDCLIENTUTIL_CONFIGFOLDER + ".clientsecret", null);
	}
	
	
	@Override
	protected long getRenewTokenInterval() {
		return 600000l;
	}

}
