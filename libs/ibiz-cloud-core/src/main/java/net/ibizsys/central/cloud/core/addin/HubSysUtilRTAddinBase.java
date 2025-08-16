package net.ibizsys.central.cloud.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.sysutil.IHubSysUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.runtime.SystemRuntimeException;

public abstract class HubSysUtilRTAddinBase extends SysUtilRTAddinBase implements IHubSysUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(HubSysUtilRTAddinBase.class);

	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		if (this.isPrepareSysCloudClientUtilRuntime()) {
			if (this.getSysCloudClientUtilRuntime(true) == null) {
				prepareSysCloudClientUtilRuntime(false);
			}
		}
	}

	protected abstract IHubSysUtilRuntime getHubSysUtilRuntime();
	
	@Override
	protected ISysUtilRuntime getSysUtilRuntime() {
		return getHubSysUtilRuntime();
	}


	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		return this.getSysCloudClientUtilRuntime(false);
	}

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime(boolean bTryMode) {
		if (this.iSysCloudClientUtilRuntime != null || bTryMode) {
			return this.iSysCloudClientUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getHubSysUtilRuntime(), "未指定系统云体系客户端组件");
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

	
	@Override
	public Object executeAction(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) {
		if (iSystemRuntime == null) {
			iSystemRuntime = this.getSystemRuntime();
		}

		try {
			return this.onExecuteAction(iSystemRuntime, strAction, objBody, strKey, objTag);
		} catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getHubSysUtilRuntime(), String.format("插件[%1$s]执行操作[%2$s]发生异常，%3$s", this.getName(), strAction, ex.getMessage()), ex);
		}
	}

	protected Object onExecuteAction(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) throws Throwable {

		throw new Exception(String.format("无法识别的操作[%1$s]", strAction));
	}

	
	@Override
	protected Object onExecuteAction(String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
		return this.onExecuteAction(this.getSystemRuntime(), strAction, objBody, strKey, objTag);
	}
}
