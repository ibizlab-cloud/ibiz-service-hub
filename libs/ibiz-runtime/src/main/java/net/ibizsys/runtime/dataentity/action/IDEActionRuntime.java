package net.ibizsys.runtime.dataentity.action;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.util.IAction;

/**
 * 实体行为运行时对象
 * @author lionlau
 *
 */
public interface IDEActionRuntime extends IDataEntityModelRuntime, IAction{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEAction
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction) throws Exception;
	
	
	/**
	 * 获取实体行为模型对象
	 * @return
	 */
	IPSDEAction getPSDEAction();
	
	/**
	 * 执行
	 * @param args
	 * @return
	 */
	Object execute(Object[] args) throws Throwable;
	
	
	
	
	/**
	 * 是否有效
	 * @return
	 */
	default boolean isValid(Object[] args) {
		return true;
	}
}
