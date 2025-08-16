package net.ibizsys.central.log;

import net.ibizsys.model.dataentity.IPSDataEntity;

public interface IModelRTDELogSupportable extends IModelRTLogSupportable{

	/**
	 * 获取日志数据对象
	 * @return
	 */
	IPSDataEntity getLogPSDataEntity();
	
}
