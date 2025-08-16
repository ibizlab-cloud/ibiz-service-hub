package net.ibizsys.runtime.dataentity.action;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;

/**
 * 实体行为插件运行时对象接口
 * @author lionlau
 *
 */
public interface IDEActionPluginRuntime{

	/**
	 * 执行实体行为插件
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEAction
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable ;
}
