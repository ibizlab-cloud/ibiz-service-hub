package net.ibizsys.central;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;

public interface IModelRuntimeProvider extends net.ibizsys.runtime.IModelRuntimeProvider{

	/**
	 * 建立实体运行时
	 * @param iPSDataEntity
	 * @return
	 */
	default IDataEntityRuntime createDataEntityRuntime(IPSDataEntity iPSDataEntity) {
		return null;
	}
	
}
