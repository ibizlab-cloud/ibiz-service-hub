package net.ibizsys.runtime.dataentity.defield;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体属性值规则运行时对象
 * @author lionlau
 *
 */
public interface IDEFValueRuleRuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEFValueRule
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDEFValueRule iPSDEFValueRule) throws Exception;
	
	
	/**
	 * 获取属性模型对象
	 * @return
	 */
	IPSDEField getPSDEField();
	
	/**
	 * 获取属性值规则模型对象
	 * @return
	 */
	IPSDEFValueRule getPSDEFValueRule();
	
	
	/**
	 * 判断传入值是否符合规则
	 * @param objValue
	 * @param iEntityBase
	 * @param entityError
	 * @return
	 * @throws Throwable
	 */
	boolean test(Object objValue, IEntityBase iEntityBase, EntityError entityError) throws Throwable;
}
