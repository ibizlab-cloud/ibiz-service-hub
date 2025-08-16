package net.ibizsys.central.res;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.IDynaInstRuntime;
import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.runtime.SystemRuntimeException;

public abstract class SysLogicRuntimeBase extends net.ibizsys.runtime.res.SysLogicRuntimeBase implements ISysLogicRuntime,ISystemModelRuntime {

	private static final Log log = LogFactory.getLog(SysLogicRuntimeBase.class);
	
	@Override
	public Object execute(Object... args) {
		return this.execute(args, null, null);
	}

	@Override
	public Object execute(Object[] args, Object logicParam, Object logicParam2) {
		try {
			return this.onExecute(args, logicParam, logicParam2);
		}
		catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("执行系统预置逻辑发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object onExecute(Object[] args, Object logicParam, Object logicParam2) throws Throwable {
		throw new Exception("没有实现"); 
	}
	

	@Override
	public ISystemRuntime getSystemRuntime() {
		return (ISystemRuntime)super.getSystemRuntime();
	}
	
	

	@Override
	public IDynaInstRuntime getDynaInstRuntime() {
		return (IDynaInstRuntime)super.getDynaInstRuntime();
	}
}
