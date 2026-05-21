package net.ibizsys.central.plugin.ai.sysutil;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.central.plugin.ai.addin.IOpenAIAdapter;

public interface ISysOpenAIServerUtilRuntime extends ISysUtilRuntime {

	/**
	 * 适配器插件前缀
	 */
	public final static String ADDIN_ADAPTER_PREFIX = "ADAPTER:";
	
	/**
	 * 默认适配器
	 */
	public final static String ADAPTER_DEFAULT = "DEFAULT";
	
	/**
	 * 判断是否存在指定设配器
	 * @param adapterName
	 * @return
	 */
	boolean containsAdapter(String adapterName);
	
	
	/**
	 * 注册适配器
	 * @param adapterName
	 * @param iOpenAIAdapter
	 */
	void registerAdapter(String adapterName, IOpenAIAdapter iOpenAIAdapter);
	
	/**
	 * 注销适配器
	 * @param adapterName
	 * @param iOpenAIAdapter
	 * @return
	 */
	boolean unregisterAdapter(String adapterName, IOpenAIAdapter iOpenAIAdapter);
	
	/**
	 * 获取适配器
	 * @param adapterName
	 * @param tryMode
	 * @return
	 */
	IOpenAIAdapter getAdapter(String adapterName, boolean tryMode);
	
	/**
	 * 交谈补全
	 * @param factoryId
	 * @param adapterName 适配器
	 * @param request
	 * @param body
	 * @return
	 */
	Object chatCompletion(String factoryId, String adapterName, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body);
	
	
	/**
	 * 获取模型
	 * @param factoryId
	 * @param request
	 * @param body
	 * @return
	 */
	Object getModels(String factoryId, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body);
	
	
	/**
	 * 重新加载Server
	 */
	void reload();
}
