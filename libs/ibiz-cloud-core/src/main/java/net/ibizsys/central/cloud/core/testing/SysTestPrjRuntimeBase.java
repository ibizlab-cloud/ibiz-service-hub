package net.ibizsys.central.cloud.core.testing;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.yaml.snakeyaml.Yaml;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.res.ISysFileResourceRuntime;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.testing.ISysTestPrjRuntimeContext;
import net.ibizsys.central.testing.SysTestPrjRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogLevels;

public abstract class SysTestPrjRuntimeBase extends net.ibizsys.central.testing.SysTestPrjRuntimeBase implements ISysTestPrjRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysTestPrjRuntimeBase.class);

	private ISysFileResourceRuntime configSysFileResourceRuntime = null;
	
	private boolean enableCloudReload = false;

	private boolean bInstalled = false;
	
	private boolean bConfigFromResource = false;
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}

	
	@Override
	protected ISysTestPrjRuntimeContext createSysTestPrjRuntimeContext() {
		return new SysTestPrjRuntimeContextBase(super.createSysTestPrjRuntimeContext()) {

			@Override
			public File getProjectFile(String strPath, boolean bTryMode) throws Exception {
				File file = SysTestPrjRuntimeBase.this.getFile(strPath, true);
				if(file == null && !bTryMode) {
					throw new Exception(String.format("指定文件[%1$s]不存在", strPath));
				}
				
				return file;
			}
		};
	}

	
	@Override
	public synchronized void install() throws Exception {
		if (!this.bInstalled) {
			this.onInstall();

			this.bInstalled = true;
		}
	}

	protected void onInstall() throws Exception {

		prepareConfig();

		this.onRegisterDEMethodPluginRuntimes();

		listenReloadSignal();

	}
	
	protected void prepareConfig() throws Exception {

		if (this.getPSModelObject().getPSSysResource() == null) {
			log.warn(String.format("测试项目组件[%1$s]未指定配置资源", this.getName()));
			return;
		}
		ISysResourceRuntime iSysResourceRuntime = this.getSystemRuntime().getSysResourceRuntime(this.getPSModelObject().getPSSysResource());
		if (iSysResourceRuntime instanceof ISysFileResourceRuntime) {
			this.setConfigFromResource(false);
			this.setConfigSysFileResourceRuntime((ISysFileResourceRuntime) iSysResourceRuntime);
		}
	}
	
	@Override
	public IServiceSystemRuntime getSystemRuntime() {
		return (IServiceSystemRuntime)super.getSystemRuntime();
	}

	@Override
	public ISysFileResourceRuntime getConfigSysFileResourceRuntime(boolean bTryMode) {
		if (this.configSysFileResourceRuntime != null || bTryMode) {
			return this.configSysFileResourceRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("未指定测试配置系统文件资源运行时对象"));
	}

	protected void setConfigSysFileResourceRuntime(ISysFileResourceRuntime templSysFileResourceRuntime) {
		this.configSysFileResourceRuntime = templSysFileResourceRuntime;
	}

	public boolean isConfigFromResource() {
		return this.bConfigFromResource;
	}

	protected void setConfigFromResource(boolean bConfigFromResource) {
		this.bConfigFromResource = bConfigFromResource;
	}
	

	protected void onRegisterDEMethodPluginRuntimes() throws Exception {

		
	}
	
	protected String getReloadSignalId() {
		return String.format("%1$s%2$s-%3$s", NacosServiceHubSettingBase.DATAID_RELOADSIGNAL_PREFIX, this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-")).toLowerCase();
	}


	protected void listenReloadSignal() throws Exception {
		if (!(this.getSystemRuntime() instanceof IServiceSystemRuntime)) {
			return;
		}

		String strReloadSignalId = getReloadSignalId();
		log.debug(String.format("测试项目[%1$s]监控重载配置[%2$s]", this.getName(), strReloadSignalId));
		((IServiceSystemRuntime) this.getSystemRuntime()).getConfigListenerRepo().addConfigListener(strReloadSignalId, new IConfigListener() {
			@Override
			public void receiveConfigInfo(String configInfo) {
				log.debug(String.format("%1$s接收到重载信号", getConfigFolder()));
				getSystemRuntime().threadRun(new Runnable() {
					@Override
					public void run() {
						localReload();
					}
				});

			}
		});
		this.enableCloudReload = true;
	}

	protected boolean isEnableCloudReload() {
		return this.enableCloudReload;
	}
	
	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}

	@Override
	public void reload() {
		try {
			if (this.isEnableCloudReload() && ServiceHub.getInstance().getServiceHubSetting().isPublishConfig()) {
				String strReloadSignalId = getReloadSignalId();
				Map<String, String> map = new LinkedHashMap<String, String>();
				map.put("reloaddate", DateUtils.getCurTimeString2());
				this.onFillReloadSignal(map);
				ServiceHub.getInstance().publishConfig(strReloadSignalId, map);
				return;
			}
			
			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysTestPrjRuntimeException.rethrow(this, ex);
			throw new SysTestPrjRuntimeException(this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onFillReloadSignal(Map<String, String> map) throws Throwable {

	}
	
	public void localReload() {
		try {
			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysTestPrjRuntimeException.rethrow(this, ex);
			throw new SysTestPrjRuntimeException(this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onReload() throws Throwable {
		this.onReload(false);
	}
	
	protected void onReload(boolean bFirst) throws Throwable {
		// 重新加载资源
		if(!bFirst) {
			if (this.getConfigSysFileResourceRuntime(true) != null) {
				this.getConfigSysFileResourceRuntime(false).reload();
			}
		}
	}
	
	@Override
	public AccessToken getWebhookAccessToken(String strToken, boolean tryMode) {
		try {
			return this.onGetWebhookAccessToken(strToken, tryMode);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysTestPrjRuntimeException.rethrow(this, ex);
			throw new SysTestPrjRuntimeException(this, String.format("获取Webhook凭证发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected AccessToken onGetWebhookAccessToken(String strToken, boolean tryMode) throws Throwable {
		return this.getWebhookAccessToken(strToken, true, tryMode);
	}

	/**
	 * 获取访问凭证数据对象
	 * 
	 * @param iSystemRuntime
	 * @param strToken
	 * @param bValid
	 * @param bTryMode
	 * @return
	 */
	protected AccessToken getWebhookAccessToken(String strToken, boolean bValid, boolean bTryMode) throws Exception {

		AccessToken accessToken = null;
		String strAccessTokenId = String.format("%1$s%2$s-%3$s--webhook--%4$s", NacosServiceHubSettingBase.DATAID_ACCESSTOKEN_PREFIX, this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-"), strToken).toLowerCase();
		String strConfig = ServiceHub.getInstance().getConfig(strAccessTokenId);
		if (!ObjectUtils.isEmpty(strConfig)) {
			Yaml yaml = new Yaml();
			accessToken = JsonUtils.as(yaml.loadAs(strConfig, Map.class), AccessToken.class);
		}

		if (accessToken == null) {
			if (bTryMode) {
				return null;
			}
			throw new Exception("凭证不存在");
		}
		if (bValid) {
			// 判断有效
			if (DataTypeUtils.asBoolean(accessToken.getDisabled(), false)) {
				if (bTryMode) {
					return null;
				}
				throw new Exception("凭证已禁用");
			}

			java.sql.Timestamp expiresTime = accessToken.getExpiresTime();
			if (expiresTime != null) {
				if (expiresTime.getTime() < System.currentTimeMillis()) {
					if (bTryMode) {
						return null;
					}
					throw new Exception("凭证已过期");
				}
			}
		}

		return accessToken;
	}
	
	
	
	@Override
	public Object run(String strPath, Map<String, Object> params) {
		try {
			return this.onRun(strPath, params);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysTestPrjRuntimeException.rethrow(this, ex);
			throw new SysTestPrjRuntimeException(this, String.format("运行测试发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onRun(String strPath, Map<String, Object> params) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public File getFile(String strPath, boolean bTryMode) {
		try {
			return this.onGetFile(strPath, bTryMode);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysTestPrjRuntimeException.rethrow(this, ex);
			throw new SysTestPrjRuntimeException(this, String.format("获取项目文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected File onGetFile(String strPath, boolean bTryMode) throws Throwable {
		ISysFileResourceRuntime iSysFileResourceRuntime = this.getConfigSysFileResourceRuntime(false);
		File rootFile = iSysFileResourceRuntime.getFile(null);
		File realFile = new File(rootFile, strPath);
		if(realFile.exists()) {
			return realFile;
		}
		if(bTryMode) {
			return null;
		}
		
		throw new Exception(String.format("指定文件[%1$s]不存在", strPath));
	}


	@Override
	public void uninstall() {
		try {
			onUninstall();
		} catch (Throwable ex) {
			log.error(String.format("卸载测试项目[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("卸载测试项目[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}

	protected void onUninstall() throws Throwable {
		
	}

	
	
}
