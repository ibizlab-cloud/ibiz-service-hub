package net.ibizsys.central;

import net.ibizsys.model.dataentity.IPSDataEntity;

/**
 * 业务中台系统运行时上下文
 * @author lionlau
 *
 */
public interface ISystemRuntimeContext extends net.ibizsys.runtime.ISystemRuntimeContext {

	/**
	 * 获取系统运行时对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	/**
	 * 通过实体获取持久化对象
	 * @param iPSDataEntity
	 * @return
	 */
	ISystemPersistentAdapter getSystemPersistentAdapter(IPSDataEntity iPSDataEntity) throws Exception;
	
	
	
	/**
	 * 获取传入实体的存储模式
	 * @param iPSDataEntity
	 * @return
	 */
	int getStorageMode(IPSDataEntity iPSDataEntity);
}
