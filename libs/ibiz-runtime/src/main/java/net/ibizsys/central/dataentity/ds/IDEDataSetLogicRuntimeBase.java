package net.ibizsys.central.dataentity.ds;

import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

/**
 * 实体数据集逻辑附加运行时逻辑基础对象
 * @author lionlau
 *
 */
public interface IDEDataSetLogicRuntimeBase {

	/**
	 * 执行实体数据集逻辑附加插件
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEDataSet
	 * @param args
	 * @param ret
	 * @throws Throwable
	 */
	Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object ret) throws Throwable ;
	
	
	
	/**
	 * 获取附加模式
	 * @return
	 */
	java.lang.String getAttachMode();
}
