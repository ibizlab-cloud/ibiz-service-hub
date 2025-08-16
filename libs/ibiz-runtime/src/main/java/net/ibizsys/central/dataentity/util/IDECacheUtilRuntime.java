package net.ibizsys.central.dataentity.util;

import org.springframework.data.domain.Page;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

/**
 * 实体缓存功能组件运行时对象
 * @author lionlau
 *
 */
public interface IDECacheUtilRuntime extends IDEUtilRuntime {

	/**
	 * 是否支持指定行为
	 * @param strActionName
	 * @param iPSDEAction
	 * @param args
	 * @return
	 */
	boolean isEnableAction(String strActionName, IPSDEAction iPSDEAction, Object[] args);
	
	
	
	
	
	/**
	 * 执行行为
	 * @param iPSDEAction
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable;
	
	
	
	/**
	 * 是否支持指定数据集
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param args
	 * @return
	 */
	boolean isEnableDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args);
	
	
	
	/**
	 * 获取结果集合
	 * @param iPSDEDataSet
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Page fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable;
	
	
	
}
