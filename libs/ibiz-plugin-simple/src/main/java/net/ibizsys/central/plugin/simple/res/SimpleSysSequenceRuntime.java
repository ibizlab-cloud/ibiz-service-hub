package net.ibizsys.central.plugin.simple.res;

import java.util.Random;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.res.SysSequenceRuntimeBase;
import net.ibizsys.runtime.util.IEntityBase;

public class SimpleSysSequenceRuntime extends SysSequenceRuntimeBase {

	@Override
	public Object get(IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		return (new Random()).nextInt(1000);
	}

}
