package net.ibizsys.runtime.res;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统值规则运行时对象
 * @author lionlau
 *
 */
public interface ISysValueRuleRuntime extends IModelRuntime {

	
	/**
	 * 初始化系统值规则运行时
	 * @param iSystemRuntimeBaseContext
	 * @param iPSSysValueRule
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysValueRule iPSSysValueRule) throws Exception;
	
	/**
	 * 测试值规则
	 * @param objSrcValue
	 * @return
	 */
	boolean test(Object objSrcValue) throws Throwable;
	
	
	/**
	 * 测试值规则
	 * @param objSrcValue
	 * @param objEntity
	 * @param iPSDEField 
	 * @param iDataEntityRuntimeBase
	 * @return
	 */
	boolean test(Object objSrcValue, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntimeBase iDataEntityRuntimeBase) throws Throwable;
}
