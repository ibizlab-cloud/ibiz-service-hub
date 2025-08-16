package net.ibizsys.central.plugin.open.sysutil.addin;

import net.ibizsys.central.plugin.open.sysutil.ISysOpenUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface ISysOpenUtilRTAddin extends IModelRTAddin{
	
	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ISysOpenUtilRuntimeContext ctx, Object addinData) throws Exception;
}
