package net.ibizsys.runtime.dataentity.ds;

import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;

/**
 * 实体数据集运行时对象
 * @author lionlau
 *
 */
public interface IDEDataSetRuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEDataSet
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet) throws Exception;
	
	
	/**
	 * 获取实体数据集模型对象
	 * @return
	 */
	IPSDEDataSet getPSDEDataSet();
	
	/**
	 * 执行
	 * @param args
	 * @return
	 */
	Object fetch(Object[] args) throws Throwable;
	
	
	/**
	 * 是否有效
	 * @return
	 */
	default boolean isValid(Object[] args) {
		return true;
	}
}
