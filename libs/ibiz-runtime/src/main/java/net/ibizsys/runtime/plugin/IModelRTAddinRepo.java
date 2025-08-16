package net.ibizsys.runtime.plugin;

import java.util.Map;

public interface IModelRTAddinRepo {

	/**
	 * 获取指定类型及前缀的插件集合
	 * @param cls
	 * @param strTypePrefix
	 * @return
	 */
	<T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix);
	
	
	
	/**
	 * 获取指定类型及前缀的插件
	 * @param cls
	 * @param strTypePrefix
	 * @param bTryMode
	 * @return
	 */
	<T> T getAddin(Class<T> cls, String strTypePrefix, boolean bTryMode);
}
