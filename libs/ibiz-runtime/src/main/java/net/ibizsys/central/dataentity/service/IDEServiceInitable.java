package net.ibizsys.central.dataentity.service;

import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;

public interface IDEServiceInitable {

	/**
	 * 初始化
	 * @param iSystemRuntime
	 * @param iDataEntityRuntimeContext
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception;
}
