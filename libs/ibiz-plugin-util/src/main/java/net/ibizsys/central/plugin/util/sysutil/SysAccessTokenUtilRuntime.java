package net.ibizsys.central.plugin.util.sysutil;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysAccessTokenUtilRuntime;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.ExceptionUtils;

public class SysAccessTokenUtilRuntime extends AccessTokenDESyncUtilRuntime implements ISysAccessTokenUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysAccessTokenUtilRuntime.class);
	private boolean enableCloudReload = false;
	
	
	@Override
	protected void onUninstall() throws Throwable {
		this.enableCloudReload = false;
		super.onUninstall();
	}
	
	protected String getReloadSignalId() {
		return String.format("%1$s%2$s-%3$s", NacosServiceHubSettingBase.DATAID_RELOADSIGNAL_PREFIX, this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-")).toLowerCase();
	}

	protected void listenReloadSignal() throws Exception {
		if (!(this.getSystemRuntime() instanceof IServiceSystemRuntime)) {
			return;
		}

		if (isEnableCloudReload()) {
			log.warn(String.format("%1$s已经监控重载配置，不能重复监控", getFullName()));
			return;
		}

		String strReloadSignalId = getReloadSignalId();
		log.debug(String.format("%1$s监控重载配置[%2$s]", this.getFullName(), strReloadSignalId));
		((IServiceSystemRuntime) this.getSystemRuntime()).getConfigListenerRepo().addConfigListener(strReloadSignalId, new IConfigListener() {
			@Override
			public void receiveConfigInfo(String configInfo) {
				log.debug(String.format("%1$s接收到重载信号", getConfigFolder()));
				localReload();
			}
		});
		this.enableCloudReload = true;
	}

	protected boolean isEnableCloudReload() {
		return this.enableCloudReload;
	}

	@Override
	public void reload() {
		try {
			if (this.isEnableCloudReload()) {
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
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onFillReloadSignal(Map<String, String> map) throws Throwable {

	}

	public void localReload() {
		try {
			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onReload() throws Throwable {

	}
}
