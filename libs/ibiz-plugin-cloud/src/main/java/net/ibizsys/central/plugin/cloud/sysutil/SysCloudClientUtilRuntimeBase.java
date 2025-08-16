package net.ibizsys.central.plugin.cloud.sysutil;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.plugin.cloud.service.client.APIWebClientInvocationHandler;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统云体系客户端组件运行时对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class SysCloudClientUtilRuntimeBase extends SysUtilRuntimeBase implements ISysCloudClientUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysCloudClientUtilRuntimeBase.class);

	private ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = null;
	
	private Map<String, String> serviceUrlMap = new ConcurrentHashMap<String, String>();
	
	private Map<String, IWebClient> rawServiceClientMap = new ConcurrentHashMap<String, IWebClient>();
	private Map<String, IWebClient> serviceClientMap = new ConcurrentHashMap<String, IWebClient>();
	private Map<String, APIWebClientInvocationHandler> apiServiceClientMap = new ConcurrentHashMap<String, APIWebClientInvocationHandler>();

	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}

	@Override
	protected void prepareDefaultSetting() throws Exception {
		
		//准备Cloud服务路径
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_CONF, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_CONF);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_WF, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_WF);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_UAA, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_UAA);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_OSS, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_OSS);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_SAAS, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_SAAS);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_OU, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_OU);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_DEVOPS, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_DEVOPS);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_LOG, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_LOG);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_PORTAL, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_NOTIFY, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_NOTIFY);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_TASK, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_TASK);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_OPEN, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_OPEN);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_AI, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_AI);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_KB, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_KB);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_DATAFLOW, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_DATAFLOW);
		setServiceUrl(ICloudUtilRuntime.CLOUDSERVICE_EXTENSION, "lb://" + ICloudUtilRuntime.CLOUDSERVICEURL_EXTENSION);
		
		
		//优先读取系统自身设置
		this.setServiceUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceurl", null));
		if (StringUtils.hasLength(this.getServiceUrl())) {
			this.setClientId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientid", this.getPSSysUtil().getAuthClientId()));
			this.setClientSecret(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientsecret", this.getPSSysUtil().getAuthClientSecret()));
			this.setAuthMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authmode", this.getPSSysUtil().getAuthMode()));
			this.setAccessTokenUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".accesstokenurl", null));
		} else {
			this.setServiceUrl(this.getSystemRuntimeSetting().getParam(CLOUDCLIENTUTIL_CONFIGFOLDER + ".serviceurl", null));
			this.setClientId(this.getSystemRuntimeSetting().getParam(CLOUDCLIENTUTIL_CONFIGFOLDER + ".clientid", this.getPSSysUtil().getAuthClientId()));
			this.setClientSecret(this.getSystemRuntimeSetting().getParam(CLOUDCLIENTUTIL_CONFIGFOLDER + ".clientsecret", this.getPSSysUtil().getAuthClientSecret()));
			this.setAuthMode(this.getSystemRuntimeSetting().getParam(CLOUDCLIENTUTIL_CONFIGFOLDER + ".authmode", this.getPSSysUtil().getAuthMode()));
			this.setAccessTokenUrl(this.getSystemRuntimeSetting().getParam(CLOUDCLIENTUTIL_CONFIGFOLDER + ".accesstokenurl", null));
		}
	}


	
	
	@Override
	protected void onInstall() throws Exception {
		super.onInstall();

//		if (this.getSubSysServiceAPIRuntime(true) == null) {
//			prepareSubSysServiceAPIRuntime();
//			if (this.getSubSysServiceAPIRuntime(true) == null) {
//				throw new Exception("未指定Cloud服务客户端对象");
//			}
//		}
	}

	protected void setSubSysServiceAPIRuntime(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime) {
		this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
	}

	@Override
	public ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		return this.getSubSysServiceAPIRuntime(false);
	}

	protected ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime(boolean bTryMode) {
		if (this.iSubSysServiceAPIRuntime != null || bTryMode) {
			return this.iSubSysServiceAPIRuntime;
		}
		
		this.prepareSubSysServiceAPIRuntime();
		if(this.iSubSysServiceAPIRuntime != null) {
			return this.iSubSysServiceAPIRuntime;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定Cloud服务客户端对象");
	}

	protected synchronized void prepareSubSysServiceAPIRuntime() {
		if(this.getSubSysServiceAPIRuntime(true)!=null) {
			return;
		}
		this.executeAction("准备Cloud服务客户端", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onPrepareSubSysServiceAPIRuntime();
				return true;
			}
		}, null, Boolean.class);
	}
	
	protected abstract void onPrepareSubSysServiceAPIRuntime() throws Throwable;

	
	@Override
	public IWebClient getRawServiceClient(String strServiceType) {
		IWebClient iWebClient = rawServiceClientMap.get(strServiceType);
		if(iWebClient == null) {
			String strServiceUrl = this.getServiceUrl(strServiceType);
			iWebClient = this.executeAction("准备直接服务客户端", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return onGetRawServiceClient(strServiceType, strServiceUrl);
				}
			}, null, IWebClient.class);
			rawServiceClientMap.put(strServiceType, iWebClient);
		}
		return iWebClient;
	}
	
	protected IWebClient onGetRawServiceClient(String strServiceType, String strServiceUrl) throws Throwable{
		IWebClient iWebClient = this.getSystemRuntime().createWebClient(strServiceUrl);
		iWebClient.init(this.getSystemRuntime(), strServiceUrl, null);
		return iWebClient;
	}
	
	
	@Override
	public IWebClient getServiceClient(String strServiceType) {
		IWebClient iWebClient = serviceClientMap.get(strServiceType);
		if(iWebClient == null) {
			String strServiceUrl = this.getServiceUrl(strServiceType);
			iWebClient = this.executeAction("准备服务客户端", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return onGetServiceClient(strServiceType, strServiceUrl);
				}
			}, null, IWebClient.class);
			serviceClientMap.put(strServiceType, iWebClient);
			//要求认证
			this.getSubSysServiceAPIRuntime().requestTokenIf(true);
		}
		return iWebClient;
	}
	
	protected IWebClient onGetServiceClient(String strServiceType, String strServiceUrl) throws Throwable{
		IWebClient iWebClient = this.getSystemRuntime().createWebClient(strServiceUrl);
		iWebClient.init(this.getSubSysServiceAPIRuntime(), strServiceUrl);
		return iWebClient;
	}
	

	@Override
	public <T> T getServiceClient(String strServiceType, Class<?> cls) {
		IWebClient iWebClient  = this.getServiceClient(strServiceType);
		return iWebClient.getProxyClient(cls);
	}

	public String getServiceUrl(String strServiceType) {
		String strServiceUrl = serviceUrlMap.get(strServiceType);
		if(StringUtils.hasLength(strServiceUrl)) {
			return strServiceUrl;
		}
		if((strServiceType.indexOf("http://") == 0)
				|| (strServiceType.indexOf("https://") == 0)
				|| (strServiceType.indexOf("lb://") == 0)) {
			return strServiceType;
		}
		log.warn(String.format("未定义Cloud服务[%1$s]路径，使用默认路径", strServiceType));
		return this.getServiceUrl();
	}
	
	protected void setServiceUrl(String strServiceType, String strServiceUrl) {
		serviceUrlMap.put(strServiceType, strServiceUrl);
	}
	
	
	@Override
	public <T> T getServiceClient(String strServiceType, Class<?> cls, boolean bAPIUserOnly) {
		IWebClient iWebClient  = this.getServiceClient(strServiceType);
		T t = iWebClient.getProxyClient(cls);
		if(bAPIUserOnly) {
			String strTag = String.format("%1$s|%2$s", strServiceType, cls.getName());
			APIWebClientInvocationHandler apiWebClientProxyObject = apiServiceClientMap.get(strTag);
			if(apiWebClientProxyObject == null) {
				apiWebClientProxyObject = new APIWebClientInvocationHandler(t, cls);
				apiServiceClientMap.put(strTag, apiWebClientProxyObject);
			}
			return (T)apiWebClientProxyObject.getProxyObject();
		}
		return t;
	}
	
}
