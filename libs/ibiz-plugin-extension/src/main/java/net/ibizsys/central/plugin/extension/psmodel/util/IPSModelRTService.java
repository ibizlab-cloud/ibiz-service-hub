package net.ibizsys.central.plugin.extension.psmodel.util;

import net.ibizsys.psmodel.core.util.IPSModel;

public interface IPSModelRTService <M extends IPSModel> extends net.ibizsys.psmodel.runtime.util.IPSModelRTService<M>{

	/**
	 * 行为：应用指定扩展模型
	 */
	final public static String METHOD_APPLY = "APPLY";

	/**
	 * 行为：应用指定扩展模型（仅应用，不通知）
	 */
	final public static String METHOD_APPLYONLY = "APPLYONLY";
	
	/**
	 * 行为：启用指定扩展模型
	 */
	final public static String METHOD_ENABLE = "ENABLE";

	/**
	 * 行为：禁用指定扩展模型
	 */
	final public static String METHOD_DISABLE = "DISABLE";
}
