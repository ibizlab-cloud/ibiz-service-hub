package net.ibizsys.central.cloud.core.addin;

import net.ibizsys.runtime.SystemRuntimeException;

public abstract class SysUtilRTAddinBase extends net.ibizsys.central.addin.SysUtilRTAddinBase implements ISysUtilRTAddin {

	@Override
	public Object executeAction(String strAction, Object objBody, String strKey, Object objTag) {
		try {
			return this.onExecuteAction(strAction, objBody, strKey, objTag);
		} catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSysUtilRuntime(), String.format("插件[%1$s]执行操作[%2$s]发生异常，%3$s", this.getName(), strAction, ex.getMessage()), ex);
		}
	}

	protected Object onExecuteAction(String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
		throw new Exception(String.format("无法识别的操作[%1$s]", strAction));
	}
}
