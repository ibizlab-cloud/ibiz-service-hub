package net.ibizsys.runtime;

import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;

public interface IModelRuntimeProvider {

	/**
	 * 建立实体运行时
	 * @param iPSDataEntity
	 * @return
	 */
	default IDataEntityRuntime createDataEntityRuntime(IPSDataEntity iPSDataEntity) {
		return null;
	}
}
