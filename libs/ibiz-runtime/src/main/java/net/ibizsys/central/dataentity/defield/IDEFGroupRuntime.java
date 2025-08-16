package net.ibizsys.central.dataentity.defield;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.dataentity.defield.IPSDEFGroup;
import net.ibizsys.model.dataentity.defield.IPSDEField;

/**
 * 实体属性组运行时对象
 * @author lionlau
 *
 */
public interface IDEFGroupRuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEFGroup
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEFGroup iPSDEFGroup) throws Exception;
	
	
		
	/**
	 * 获取属性值规则模型对象
	 * @return
	 */
	IPSDEFGroup getPSDEFGroup();

	/**
	 * 判断是否存在传入属性
	 * @param iPSDEField
	 * @return
	 */
	boolean contains(IPSDEField iPSDEField);
}
