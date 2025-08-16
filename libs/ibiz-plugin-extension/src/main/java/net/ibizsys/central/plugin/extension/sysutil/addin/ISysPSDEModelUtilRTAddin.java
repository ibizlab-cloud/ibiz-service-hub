package net.ibizsys.central.plugin.extension.sysutil.addin;

import net.ibizsys.central.plugin.extension.sysutil.ISysPSDEModelUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface ISysPSDEModelUtilRTAddin extends IModelRTAddin{
	
	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ISysPSDEModelUtilRuntimeContext ctx, Object addinData) throws Exception;
}
