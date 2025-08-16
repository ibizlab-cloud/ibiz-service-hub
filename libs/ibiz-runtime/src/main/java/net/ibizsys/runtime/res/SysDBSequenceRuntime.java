package net.ibizsys.runtime.res;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统数据库值序列运行时对象
 * @author lionlau
 *
 */
public class SysDBSequenceRuntime extends SysSequenceRuntimeBase {

	@Override
	public Object get(IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) {
	
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), "没有实现",Errors.NOTIMPL);
	}

}
