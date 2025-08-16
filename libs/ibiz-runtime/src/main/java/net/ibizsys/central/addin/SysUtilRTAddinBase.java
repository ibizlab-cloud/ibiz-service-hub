package net.ibizsys.central.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.sysutil.ISysNotifyUtilRuntime;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class SysUtilRTAddinBase extends ModelRTAddinBase implements ISysUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysUtilRTAddinBase.class);

	private ISysNotifyUtilRuntime iSysNotifyUtilRuntime = null;
	private ISysUniStateUtilRuntime iSysUniStateUtilRuntime = null;
	

	@Override
	protected void prepareDefaultSetting() throws Exception {

		super.prepareDefaultSetting();
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		if (this.isPrepareSysNotifyUtilRuntime()) {
			if (this.getSysNotifyUtilRuntime(true) == null) {
				prepareSysNotifyUtilRuntime(false);
			}
		}
		if (this.isPrepareSysUniStateUtilRuntime()) {
			if (this.getSysUniStateUtilRuntime(true) == null) {
				prepareSysUniStateUtilRuntime(false);
			}
		}
	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {

		super.onPrepareDefaultSetting();
	}


	protected abstract ISysUtilRuntime getSysUtilRuntime();
	

	protected ISystemRuntime getSystemRuntime() {
		return getSysUtilRuntime().getSystemRuntime();
	}

	

	protected ISysNotifyUtilRuntime getSysNotifyUtilRuntime() {
		return this.getSysNotifyUtilRuntime(false);
	}

	protected ISysNotifyUtilRuntime getSysNotifyUtilRuntime(boolean bTryMode) {
		if (this.iSysNotifyUtilRuntime != null || bTryMode) {
			return this.iSysNotifyUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSysUtilRuntime(), "未指定系统通知功能组件");
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
		if (this.iSysUniStateUtilRuntime != null || bTryMode) {
			return this.iSysUniStateUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSysUtilRuntime(), "未指定系统统一状态功能组件");
	}

	protected void setSysUniStateUtilRuntime(ISysUniStateUtilRuntime iSysUniStateUtilRuntime) {
		this.iSysUniStateUtilRuntime = iSysUniStateUtilRuntime;
	}

	protected void prepareSysUniStateUtilRuntime(boolean bTryMode) throws Exception {
		this.setSysUniStateUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, bTryMode));
	}

	protected boolean isPrepareSysUniStateUtilRuntime() {
		return false;
	}

//	@Override
//	public Object executeAction(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) {
//		if (iSystemRuntime == null) {
//			iSystemRuntime = this.getSystemRuntime();
//		}
//
//		try {
//			return this.onExecuteAction(iSystemRuntime, strAction, objBody, strKey, objTag);
//		} catch (Throwable ex) {
//			throw new SystemRuntimeException(this.getSystemRuntime(), this.getHubSysUtilRuntime(), String.format("插件[%1$s]执行操作[%2$s]发生异常，%3$s", this.getName(), strAction, ex.getMessage()), ex);
//		}
//	}
//
//	protected Object onExecuteAction(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
//
//		throw new Exception(String.format("无法识别的操作[%1$s]", strAction));
//	}

}
