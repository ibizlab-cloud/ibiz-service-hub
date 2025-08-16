package net.ibizsys.central.dataentity;

import net.ibizsys.central.IDynaInstRuntime;
import net.ibizsys.central.ISystemRuntime;

/**
 * 实体模型运行时实现基类对象
 * @author lionlau
 *
 */
public abstract class DataEntityModelRuntimeBase extends net.ibizsys.runtime.dataentity.DataEntityModelRuntimeBase implements IDataEntityModelRuntime{

	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime)super.getDataEntityRuntime();
	}
		
	@Override
	public IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime() {
		return (IDynaInstDataEntityRuntime)super.getDynaInstDataEntityRuntime();
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
