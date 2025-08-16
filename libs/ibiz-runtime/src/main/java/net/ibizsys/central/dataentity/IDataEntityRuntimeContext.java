package net.ibizsys.central.dataentity;

import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

/**
 * 业务中台实体运行时上下文对象接口
 * @author lionlau
 *
 */
public interface IDataEntityRuntimeContext extends net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext {

	/**
	 * 获取实体运行时对象
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	
	/**
	 * 获取系统数据库体系运行时
	 * @return
	 */
	ISysDBSchemeRuntime getSysDBSchemeRuntime();
	
	
	
	/**
	 * 执行实际行为
	 * @param strActionName
	 * @param iPSDEAction
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Object executeActionReal(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable;
	
	
	/**
	 * 执行实际数据集合获取
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Object fetchDataSetReal(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable;
}
