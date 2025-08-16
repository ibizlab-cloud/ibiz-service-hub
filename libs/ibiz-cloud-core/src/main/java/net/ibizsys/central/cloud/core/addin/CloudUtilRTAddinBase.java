package net.ibizsys.central.cloud.core.addin;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysNotifyUtilRuntime;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.IConfigEntity;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class CloudUtilRTAddinBase extends ModelRTAddinBase  {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudUtilRTAddinBase.class);
	
	private ICloudSaaSUtilRuntime iCloudSaaSUtilRuntime = null;
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private ISysNotifyUtilRuntime iSysNotifyUtilRuntime = null;
	private ISysUniStateUtilRuntime iSysUniStateUtilRuntime = null;
	private IConfigEntity iConfigEntity = null;

	private String strServiceUrl = null;
	
	private String strAccessTokenUr = null;

	private String strClientId = null;

	private String strClientSecret = null;
	
	private boolean bEnabled = true;
	
	@Override
	protected void prepareDefaultSetting() throws Exception {
		if(isPrepareConfigEntity()) {
			prepareConfigEntityIf();
		}
		super.prepareDefaultSetting();
	}
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		if(this.getCloudSaaSUtilRuntime(true) == null) {
			this.prepareCloudSaaSUtilRuntime();
		}
		
		if(this.isPrepareSysCloudClientUtilRuntime()) {
			if(this.getSysCloudClientUtilRuntime(true) == null) {
				this.prepareSysCloudClientUtilRuntime(false);
			}
		}
		
		if(this.isPrepareSysNotifyUtilRuntime()) {
			if(this.getSysNotifyUtilRuntime(true) == null) {
				this.prepareSysNotifyUtilRuntime(false);
			}
		}
		
		if(this.isPrepareSysUniStateUtilRuntime()) {
			if(this.getSysUniStateUtilRuntime(true) == null) {
				this.prepareSysUniStateUtilRuntime(false);
			}
		}
	}
	
	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		
		if(this.getConfigEntity(true)!=null) {
			this.setServiceUrl(this.getConfigEntity().getString("serviceurl", this.getServiceUrl()));
			this.setAccessTokenUrl(this.getConfigEntity().getString("accesstokenurl", this.getAccessTokenUrl()));
			this.setClientId(this.getConfigEntity().getString("clientid", this.getClientId()));
			this.setClientSecret(this.getConfigEntity().getString("clientsecret", this.getClientSecret()));
		}
		
		super.onPrepareDefaultSetting();
	}
	
	
	protected boolean isPrepareConfigEntity() {
		return false;
	}
	
	
	protected void prepareConfigEntityIf() throws Exception{
		if(this.getConfigEntity(true) == null) {
			this.prepareConfigEntity();
		}
	}

	
	protected void prepareConfigEntity() throws Exception{
		String strCloudConfigId = this.getCloudConfigId();
		if(!StringUtils.hasLength(strCloudConfigId)) {
			log.warn(String.format("未定义Cloud配置标识，忽略配置加载"));
			return ;
		}
		
		//读取配置
		String strConfig = ServiceHub.getInstance().getConfig(strCloudConfigId);
		try {
			this.setConfigEntity(new ConfigEntity(strConfig));
		}
		catch(Throwable ex) {
			throw new Exception(String.format("加载配置对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	/**
	 * 获取配置对象
	 * @param bTryMode
	 * @return
	 */
	protected IConfigEntity getConfigEntity(boolean bTryMode) {
		if(this.iConfigEntity != null || bTryMode) {
			return this.iConfigEntity;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudUtilRuntime(), "未指定插件配置对象");
	}
	
	
	/**
	 * 获取配置对象
	 * @return
	 */
	protected IConfigEntity getConfigEntity() {
		return getConfigEntity(false);
	}
	
	/**
	 * 设置配置对象
	 * @param iConfigEntity
	 */
	protected void setConfigEntity(IConfigEntity iConfigEntity) {
		this.iConfigEntity = iConfigEntity;
	}
	
	public String getServiceUrl() {
		return this.strServiceUrl;
	}


	protected void setServiceUrl(String strServiceUrl) {
		this.strServiceUrl = strServiceUrl;
	}
	
	public String getAccessTokenUrl() {
		return this.strAccessTokenUr;
	}

	protected void setAccessTokenUrl(String strAccessTokenUr) {
		this.strAccessTokenUr = strAccessTokenUr;
	}

	public String getClientId() {
		return this.strClientId;
	}

	protected void setClientId(String strClientId) {
		this.strClientId = strClientId;
	}

	public String getClientSecret() {
		return this.strClientSecret;
	}

	protected void setClientSecret(String strClientSecret) {
		this.strClientSecret = strClientSecret;
	}
	
	public boolean isEnabled() {
		return this.bEnabled;
	}


	protected void setEnabled(boolean bEnabled) {
		this.bEnabled = bEnabled;
	}
	
	
	
	protected abstract ICloudUtilRuntime getCloudUtilRuntime();
	
	protected abstract ISystemRuntime getSystemRuntime();
	
	protected ICloudSaaSUtilRuntime getCloudSaaSUtilRuntime() {
		return getCloudSaaSUtilRuntime(false);
	}
	
	protected ICloudSaaSUtilRuntime getCloudSaaSUtilRuntime(boolean bTryMode) {
		if(this.iCloudSaaSUtilRuntime != null || bTryMode) {
			return this.iCloudSaaSUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudUtilRuntime(), "未指定Cloud体系SaaS管理功能组件");
	}
	
	protected void setCloudSaaSUtilRuntime(ICloudSaaSUtilRuntime iCloudSaaSUtilRuntime) {
		this.iCloudSaaSUtilRuntime = iCloudSaaSUtilRuntime;
	}
	
	protected void prepareCloudSaaSUtilRuntime() throws Exception{
		this.setCloudSaaSUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ICloudSaaSUtilRuntime.class, false));
	}
	
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		return this.getSysCloudClientUtilRuntime(false);
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime(boolean bTryMode) {
		if(this.iSysCloudClientUtilRuntime != null || bTryMode) {
			return this.iSysCloudClientUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudUtilRuntime(), "未指定系统云体系客户端组件");
	}
	
	protected void setSysCloudClientUtilRuntime(ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime) {
		this.iSysCloudClientUtilRuntime = iSysCloudClientUtilRuntime;
	}
	
	protected void prepareSysCloudClientUtilRuntime(boolean bTryMode) throws Exception {
		this.setSysCloudClientUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, bTryMode));
	}
	
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return false;
	}
	
	protected ISysNotifyUtilRuntime getSysNotifyUtilRuntime() {
		return this.getSysNotifyUtilRuntime(false);
	}
	
	protected ISysNotifyUtilRuntime getSysNotifyUtilRuntime(boolean bTryMode) {
		if(this.iSysNotifyUtilRuntime != null || bTryMode) {
			return this.iSysNotifyUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudUtilRuntime(), "未指定系统通知功能组件");
	}
	
	protected void setSysNotifyUtilRuntime(ISysNotifyUtilRuntime iSysNotifyUtilRuntime) {
		this.iSysNotifyUtilRuntime = iSysNotifyUtilRuntime;
	}
	
	protected void prepareSysNotifyUtilRuntime(boolean bTryMode) throws Exception {
		this.setSysNotifyUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysNotifyUtilRuntime.class, bTryMode));
	}
	
	protected boolean isPrepareSysNotifyUtilRuntime() {
		return false;
	}
	
	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime() {
		return getSysUniStateUtilRuntime(false);
	}
	
	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime(boolean bTryMode) {
		if(this.iSysUniStateUtilRuntime != null || bTryMode) {
			return this.iSysUniStateUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudUtilRuntime(), "未指定系统统一状态功能组件");
	}
	
	protected void setSysUniStateUtilRuntime(ISysUniStateUtilRuntime iSysUniStateUtilRuntime) {
		this.iSysUniStateUtilRuntime = iSysUniStateUtilRuntime;
	}
	
	protected void prepareSysUniStateUtilRuntime(boolean bTryMode) throws Exception{
		this.setSysUniStateUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, bTryMode));
	}
	
	protected boolean isPrepareSysUniStateUtilRuntime() {
		return false;
	}
	
	/**
	 * 获取Cloud配置前缀
	 * @return
	 */
	protected String getCloudConfigIdPrefix() {
		return null;
	}
	
	
	/**
	 * 获取Cloud配置标识
	 * @return
	 */
	protected String getCloudConfigId() {
		if(!StringUtils.hasLength(this.getCloudConfigIdPrefix())) {
			return null;
		}
		
		String strAddinTag = null;
		if(this.getAddinData() instanceof String){
			strAddinTag = (String)this.getAddinData();
		}
		
		if(!StringUtils.hasLength(strAddinTag)) {
			return null;
		}
		strAddinTag = strAddinTag.replace(":", "-");
		return String.format("%1$s%2$s", this.getCloudConfigIdPrefix(), strAddinTag).toLowerCase();
	}
}
