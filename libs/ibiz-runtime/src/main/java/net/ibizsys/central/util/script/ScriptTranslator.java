package net.ibizsys.central.util.script;

import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;

public class ScriptTranslator implements IScriptTranslator {

	private ISysTranslatorRuntime iSysTranslatorRuntime = null;
	public ScriptTranslator(ISysTranslatorRuntime iSysTranslatorRuntime) {
		this.iSysTranslatorRuntime = iSysTranslatorRuntime;
	}
	
	protected ISysTranslatorRuntime getSysTranslatorRuntime() {
		return this.iSysTranslatorRuntime;
	}


	@Override
	public Object in(Object objValue) {
		try {
			return getSysTranslatorRuntime().translate(objValue, true, null, null, null);
		}
		catch (Throwable ex) {
			return new SystemRuntimeException(getSysTranslatorRuntime().getSystemRuntime(), getSysTranslatorRuntime(), String.format("输入转换发生异常，%1$s", ex.getMessage()), ex);
		}	
	}

	@Override
	public Object out(Object objValue) {
		try {
			return getSysTranslatorRuntime().translate(objValue, false, null, null, null);
		}
		catch (Throwable ex) {
			return new SystemRuntimeException(getSysTranslatorRuntime().getSystemRuntime(), getSysTranslatorRuntime(), String.format("输出转换发生异常，%1$s", ex.getMessage()), ex);
		}	
	}
}
