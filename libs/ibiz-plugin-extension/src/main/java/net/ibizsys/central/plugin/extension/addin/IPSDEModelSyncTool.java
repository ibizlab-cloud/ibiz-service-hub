package net.ibizsys.central.plugin.extension.addin;

import net.ibizsys.model.dataentity.IPSDataEntity;

/**
 * 实体模型同步组件
 * @author lionlau
 *
 */
public interface IPSDEModelSyncTool extends IPSModelSyncTool {


	
	/**
	 * 同步实体对象
	 * @param iPSDataEntity
	 * @param param
	 */
	void sync(IPSDataEntity iPSDataEntity, Object param);
}
