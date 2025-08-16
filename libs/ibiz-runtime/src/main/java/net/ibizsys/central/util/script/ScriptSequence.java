package net.ibizsys.central.util.script;

import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.script.IScriptEntity;

public class ScriptSequence implements IScriptSequence {

	private ISysSequenceRuntime iSysSequenceRuntime = null;
	public ScriptSequence(ISysSequenceRuntime iSysSequenceRuntime) {
		this.iSysSequenceRuntime = iSysSequenceRuntime;
	}
	
	protected ISysSequenceRuntime getSysSequenceRuntime() {
		return this.iSysSequenceRuntime;
	}

	@Override
	public Object value() {
		return value(null);
	}

	@Override
	public Object value(IScriptEntity iScriptEntity) {
		IEntityBase iEntityBase = null;
		if(iScriptEntity!=null) {
			iEntityBase = (IEntityBase)iScriptEntity.getReal();
		}
		try {
			return this.getSysSequenceRuntime().get(iEntityBase, null, null);
		} catch (Throwable ex) {
			return new SystemRuntimeException(getSysSequenceRuntime().getSystemRuntime(), getSysSequenceRuntime(), String.format("获取序列值发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	
}
