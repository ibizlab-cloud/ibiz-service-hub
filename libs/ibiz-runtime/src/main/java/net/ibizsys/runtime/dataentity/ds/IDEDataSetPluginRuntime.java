package net.ibizsys.runtime.dataentity.ds;

import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;

/**
 * 实体数据集插件运行时对象接口
 * @author lionlau
 *
 */
public interface IDEDataSetPluginRuntime{

	/**
	 * 获取实体数据集
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEDataSet
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable ;
}
