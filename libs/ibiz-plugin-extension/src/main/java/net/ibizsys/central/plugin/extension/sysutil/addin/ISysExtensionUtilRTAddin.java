package net.ibizsys.central.plugin.extension.sysutil.addin;

import net.ibizsys.central.plugin.extension.sysutil.ISysExtensionUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface ISysExtensionUtilRTAddin extends IModelRTAddin{
	
	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ISysExtensionUtilRuntimeContext ctx, Object addinData) throws Exception;
}
