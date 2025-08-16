package net.ibizsys.central.res;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.ResourceType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.res.IPSSysResource;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.LogLevels;

public abstract class SysResourceRuntimeBase extends SystemModelRuntimeBase implements ISysResourceRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysResourceRuntimeBase.class);
	private IPSSysResource iPSSysResource = null;

	private String strResourceUri = null;

	private String strResourceParam = null;

	private String strResourceParam2 = null;

	private String strAccessTokenUrl = null;

	private String strClientId = null;

	private String strClientSecret = null;

	private String strAuthMode = null;

	private String strAuthParam = null;

	private String strAuthParam2 = null;
	
	private String strContent = null;
	
	private String strLogCat = null;
	
	/**
	 * 获取系统预置资源的配置目录
	 * @param iPSSysBDScheme
	 * @return
	 */
	public static String getConfigFolder(IPSSysResource iPSSysResource) {
		return ISystemRuntimeSetting.CONFIGFOLDER_SYSRESOURCE + "." + PSModelUtils.calcUniqueTag(iPSSysResource.getPSSystemModule(), iPSSysResource.getResTag());
	}
	

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysResource iPSSysResource) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysResource = iPSSysResource;

		this.strLogCat = this.iPSSysResource.getResTag();
		this.setConfigFolder(getConfigFolder(iPSSysResource));

		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {
		
		this.setContent(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".content", this.getPSSysResource().getContent()));
		// 计算服务路径
		this.setResourceUri(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".resourceuri", this.getPSSysResource().getResourceUri()));
		
		if(!StringUtils.hasLength(this.getResourceUri())) {
			if(ResourceType.ZIPFILE.value.equals(this.getPSSysResource().getResourceType())
					|| ResourceType.GITPROJECT.value.equals(this.getPSSysResource().getResourceType())) {
				this.setResourceUri(this.getContent());
			}
		}
		
		
		// this.setServiceParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder()
		// + ".resourceparam", this.getPSSysResource().getr()));
		// this.setServiceParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder()
		// + ".resourceparam2", this.getPSSysResource().getServiceParam2()));
		this.setAuthMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authmode", this.getPSSysResource().getAuthMode()));
		this.setAccessTokenUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".accesstokenurl", this.getPSSysResource().getAuthAccessTokenUrl()));
		this.setClientId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientid", this.getPSSysResource().getAuthClientId()));
		this.setClientSecret(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientsecret", this.getPSSysResource().getAuthClientSecret()));

		this.setAuthParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam", this.getPSSysResource().getAuthParam()));
		this.setAuthParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam2", this.getPSSysResource().getAuthParam2()));

		super.onInit();
	}

	@Override
	public IPSSysResource getPSSysResource() {
		return this.iPSSysResource;
	}

	@Override
	public String getId() {
		return getPSSysResource().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysResource().getName();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysResource();
	}

	@Override
	public String getContent() {
		return this.strContent;
	}
	
	protected void setContent(String strContent) {
		this.strContent = strContent;
	}

	@Override
	public String getResourceUri() {
		return this.strResourceUri;
	}

	protected void setResourceUri(String strResourceUri) {
		this.strResourceUri = strResourceUri;
	}

	@Override
	public String getResourceParam() {
		return this.strResourceParam;
	}

	protected void setResourceParam(String strResourceParam) {
		this.strResourceParam = strResourceParam;
	}

	@Override
	public String getResourceParam2() {
		return this.strResourceParam2;
	}

	protected void setResourceParam2(String strResourceParam2) {
		this.strResourceParam2 = strResourceParam2;
	}

	@Override
	public String getAuthParam() {
		return this.strAuthParam;
	}

	protected void setAuthParam(String strAuthParam) {
		this.strAuthParam = strAuthParam;
	}

	@Override
	public String getAuthParam2() {
		return this.strAuthParam2;
	}

	protected void setAuthParam2(String strAuthParam2) {
		this.strAuthParam2 = strAuthParam2;
	}

	@Override
	public String getAccessTokenUrl() {
		return this.strAccessTokenUrl;
	}

	protected void setAccessTokenUrl(String strAccessTokenUrl) {
		this.strAccessTokenUrl = strAccessTokenUrl;
	}

	@Override
	public String getClientId() {
		return this.strClientId;
	}

	protected void setClientId(String strClientId) {
		this.strClientId = strClientId;
	}

	@Override
	public String getClientSecret() {
		return this.strClientSecret;
	}

	protected void setClientSecret(String strClientSecret) {
		this.strClientSecret = strClientSecret;
	}

	@Override
	public String getAuthMode() {
		return this.strAuthMode;
	}

	protected void setAuthMode(String strAuthMode) {
		this.strAuthMode = strAuthMode;
	}

	protected String getResourceParam(String strKey, String strDefault) {
		if (this.getPSSysResource().getResourceParams() != null) {
			JsonNode node = this.getPSSysResource().getResourceParams().get(strKey);
			if (node != null) {
				return node.asText(strDefault);
			}
		}
		return strDefault;
	}

	protected int getResourceParam(String strKey, int nDefault) {
		if (this.getPSSysResource().getResourceParams() != null) {
			JsonNode node = this.getPSSysResource().getResourceParams().get(strKey);
			if (node != null) {
				return node.asInt(nDefault);
			}
		}
		return nDefault;
	}

	protected double getResourceParam(String strKey, double fDefault) {
		if (this.getPSSysResource().getResourceParams() != null) {
			JsonNode node = this.getPSSysResource().getResourceParams().get(strKey);
			if (node != null) {
				return node.asDouble(fDefault);
			}
		}
		return fDefault;
	}

	
	protected void executeAction(String strActionName, IAction iAction) {
		this.executeAction(strActionName, iAction, null, Object.class, getLogPOTime());
	}
	
	
	protected Object executeAction(String strActionName, IAction iAction, Object[] args) {
		return this.executeAction(strActionName, iAction, args, Object.class, getLogPOTime());
	}
	
	
	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, Class<T> cls) {
		return this.executeAction(strActionName, iAction, args, cls, getLogPOTime());
	}
	

	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, TypeReference<T> type) {
		return this.executeAction(strActionName, iAction, args, type, getLogPOTime());
	}
	

	/**
	 * 使用闭包的方式执行行为，提供缓存及性能监测
	 * @param strActionName
	 * @param iAction
	 * @param args
	 * @param cls
	 * @param nPOTime
	 * @return
	 * @throws Throwable
	 */
	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, Class<T> cls, int nPOTime) {
		try {
			long nBeginTime = System.currentTimeMillis();
			Object objRet = iAction.execute(args);
			long bEndTime = System.currentTimeMillis();
			if(bEndTime - nBeginTime > nPOTime) {
				log.warn(String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime));
				this.getSystemRuntime().logPO(LogLevels.WARN, getLogCat(), String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime), this.getLogicName(), strActionName, bEndTime - nBeginTime, null);
			}
			return (T)objRet;
		}
		catch (Throwable ex) {
			log.error(String.format("%1$s[%2$s]发生异常，%3$s", this.getLogicName(), strActionName, ex.getMessage()), ex);
			throw dealException(String.format("%1$s发生异常，%2$s", strActionName, ex.getMessage()), ex);
		}
	}
	
	/**
	 * 使用闭包的方式执行行为，提供缓存及性能监测
	 * @param strActionName
	 * @param iAction
	 * @param args
	 * @param cls
	 * @param nPOTime
	 * @return
	 * @throws Throwable
	 */
	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, TypeReference<T> type, int nPOTime) {
		try {
			long nBeginTime = System.currentTimeMillis();
			Object objRet = iAction.execute(args);
					long bEndTime = System.currentTimeMillis();
			if(bEndTime - nBeginTime > nPOTime) {
				log.warn(String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime));
				this.getSystemRuntime().logPO(LogLevels.WARN, getLogCat(), String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime), this.getLogicName(), strActionName, bEndTime - nBeginTime, null);
			}
			return (T)objRet;
		}
		catch (Throwable ex) {
			log.error(String.format("%1$s[%2$s]发生异常，%3$s", this.getLogicName(), strActionName, ex.getMessage()), ex);
			throw dealException(String.format("%1$s发生异常，%2$s", strActionName, ex.getMessage()), ex);
		}
	}
	
	@Override
	public void reload() {
		try {
			this.onReload();
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			throw dealException(String.format("%1$s发生异常，%2$s", "重载资源", ex.getMessage()), ex);
		}
	}
	
	protected void onReload() throws Throwable {
		
	}
	
	protected RuntimeException dealException(String strMessage, Throwable ex) {
		this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("%1$s%2$s", getLogicName(), strMessage), null);
//		if(ex instanceof ISystemRuntimeException) {
//			return (RuntimeException)ex;
//		}
		return new SystemRuntimeException(this.getSystemRuntimeBase(), this, strMessage, ex);
	}
	
	

	
	
	protected String getLogCat() {
		return this.strLogCat;
	}
	
	
	protected int getLogPOTime() {
		return ActionSessionManager.getLogPOTime();
	}
	
}
