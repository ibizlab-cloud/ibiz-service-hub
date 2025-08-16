package net.ibizsys.runtime.res;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统值序列运行时
 * @author lionlau
 *
 */
public interface ISysSequenceRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化值序列运行时
	 * @param iSystemRuntimeBase
	 * @param iPSSysSequence
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysSequence iPSSysSequence) throws Exception;

	
	
	/**
	 * 获取序列值
	 * @param iEntityBase
	 * @param iPSDEField 
	 * @param entityDataEntityRuntime
	 * @return
	 */
	Object get(IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable;
}
