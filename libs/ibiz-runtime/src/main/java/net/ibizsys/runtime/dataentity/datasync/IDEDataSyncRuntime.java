package net.ibizsys.runtime.dataentity.datasync;

import net.ibizsys.model.dataentity.datasync.IPSDEDataSync;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;

/**
 * 实体数据同步运行时接口
 * @author lionlau
 *
 */
public interface IDEDataSyncRuntime extends IModelRuntime{

	/**
	 * 初始化实体数据同步运行时	
	 * @param iDataEntityRuntimeBase
	 * @param iPSDEDataSync
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBase iDataEntityRuntimeBase, IPSDEDataSync iPSDEDataSync) throws Exception;
	
	
	
	/**
	 * 获取实体数据同步模型对象
	 * @return
	 */
	IPSDEDataSync getPSDEDataSync();
	
	
	
	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
}
