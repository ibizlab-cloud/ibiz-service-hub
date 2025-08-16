package net.ibizsys.central.plugin.extension.dataentity.util;

import net.ibizsys.central.plugin.extension.addin.IPSModelTranspilerEx;

public interface IDEExtensionUtilRuntime extends net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime {

	/**
	 * 获取模型转译器对象扩展
	 * @param cls
	 * @param iPSModel
	 * @param bTryMode
	 * @return
	 */
	IPSModelTranspilerEx getPSModelTranspilerEx(Class<?> cls, net.ibizsys.psmodel.core.util.IPSModel iPSModel, boolean bTryMode);
}
