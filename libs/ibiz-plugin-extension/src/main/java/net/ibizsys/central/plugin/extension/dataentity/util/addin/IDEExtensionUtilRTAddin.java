package net.ibizsys.central.plugin.extension.dataentity.util.addin;

import net.ibizsys.central.plugin.extension.dataentity.util.IDEExtensionUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IDEExtensionUtilRTAddin extends IModelRTAddin{
	
	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(IDEExtensionUtilRuntimeContext ctx, Object addinData) throws Exception;
}
