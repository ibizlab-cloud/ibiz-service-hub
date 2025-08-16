package net.ibizsys.runtime.dataentity;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.IModelRuntimeContext;

/**
 * 实体运行时上下文接口
 * @author lionlau
 *
 */
public interface IDataEntityRuntimeContext extends IDataEntityRuntimeBaseContext, IModelRuntimeContext{

	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	
	/**
	 * 执行实际行为
	 * @param iPSDEAction
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Object executeActionReal(IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable;
	
	
	/**
	 * 执行实际数据集合获取
	 * @param iPSDEDataSet
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Object fetchDataSetReal(IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable;
	
	
	
	
	
	/**
	 * 触发实体事件
	 * @param event
	 * @param params
	 */
	void fireDataEntityEvent(String event, Object[] params);
	
	
	
	@Override
	default IModelRuntime getModelRuntime() {
		return getDataEntityRuntime();
	}
}
