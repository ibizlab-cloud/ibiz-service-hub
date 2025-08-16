package net.ibizsys.runtime.dataentity.datasync;

import net.ibizsys.runtime.util.domain.DataSyncIn;

/**
 * 实体数据同步（输入）运行时对象接口
 * @author lionlau
 *
 */
public interface IDEDataSyncInRuntime extends IDEDataSyncRuntime{

	/**
	 * 接收数据
	 * @param dataSyncIns
	 */
	void recv(DataSyncIn[] dataSyncIns);
}
