package net.ibizsys.central.plugin.extension.dataentity.util;

import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.central.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.dataentity.util.IDEUtilRuntimeContext;

public interface IDEExtensionUtilRuntimeContext extends IDEUtilRuntimeContext{

	/**
	 * 获取实体扩展功能运行时对象
	 * @return
	 */
	default IDEExtensionUtilRuntime getDEExtensionUtilRuntime() {
		return getModelRuntime();
	}
	
	
	@Override
	IDEExtensionUtilRuntime getModelRuntime();
	
	
	/**
	 * 获取实体功能相关的扩展配置套装
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	V2SystemExtensionSuite getV2SystemExtensionSuite(boolean bTryMode) throws Exception;
	
	
	
	/**
	 * 执行逻辑
	 * @param iDELogicRuntime
	 * @param args
	 * @param tag
	 * @return
	 * @throws Throwable
	 */
	Object executeLogic(IDELogicRuntime iDELogicRuntime, Object[] args, Object tag) throws Throwable;
}
