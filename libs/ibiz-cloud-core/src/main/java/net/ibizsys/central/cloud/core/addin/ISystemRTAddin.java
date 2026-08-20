package net.ibizsys.central.cloud.core.addin;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.util.KeyValueUtils;

public interface ISystemRTAddin extends net.ibizsys.runtime.addin.ISystemRTAddin {

	/**
	 * 初始化
	 * @param iSystemRuntimeContext
	 * @param strId
	 * @param data
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, String strId, Object data) throws Exception;
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.runtime.plugin.IModelRTAddin#init(net.ibizsys.runtime.IModelRuntimeContext, java.lang.Object)
	 */
	default void init(IModelRuntimeContext ctx, Object data) throws Exception {
		init((ISystemRuntimeContext)ctx, KeyValueUtils.genUniqueId(), data);
	}
	
	
	/**
	 * 获取成员标识
	 * @return
	 */
	String getId();
	
	/**
	 * 安装功能
	 * @throws Throwable
	 */
	void install() throws Exception;

	
	/**
	 * 是否已经安装
	 * @return
	 */
	boolean isInstalled();
	
	/**
	 * 卸载功能
	 */
	void uninstall();
	
}
