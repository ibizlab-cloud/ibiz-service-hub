package net.ibizsys.central.cloud.dataflow.core.addin;

import net.ibizsys.central.cloud.core.util.domain.DataFlowAccess;

/**
 * 数据流平台提供者
 * @author lionlau
 *
 */
public interface IDataFlowPlatform extends ICloudDataFlowUtilRTAddin{

	/**
	 * 建立数据流平台访问代理对象
	 * @param aiAccess
	 * @return
	 */
	IDataFlowAccessAgent createDataFlowAccessAgent(DataFlowAccess dataFlowAccess);
}
