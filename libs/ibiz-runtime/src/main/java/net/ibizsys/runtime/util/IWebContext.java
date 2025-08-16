package net.ibizsys.runtime.util;

import java.util.List;

import org.springframework.util.MultiValueMap;

import net.ibizsys.runtime.util.script.IScriptUtil;

/**
 * Web请求上下文对象接口
 * @author lionlau
 *
 */
public interface IWebContext extends IScriptUtil{

	
	/**
	 * 获取参数集合
	 * @return
	 */
	MultiValueMap<String, String> getParameters();
	
	
	
	 /**
	  * 获取参数
	 * @param name
	 * @return
	 */
	String getParameter(String name);
	 
	
	/**
	 * 获取参数值集合
	 * @param name
	 * @return
	 */
	List<String> getParameterValues(String name);
	
	
	
	
	/**
	 * 获取参数名称集合
	 * @return
	 */
	List<String> getParameterNames();
	
	
	/**
	 * 获取返回头集合
	 * @return
	 */
	MultiValueMap<String, String> getHeaders();
	
	/**
	 * 获取返回头信息
	 * @param name
	 * @return
	 */
	String getHeader(String name);
	
	
	/**
	 * 获取返回头信息
	 * @param name
	 * @return
	 */
	List<String> getHeaderValues(String name);
	
	
	/**
	 * 获取返回头名称集合
	 * @return
	 */
	List<String> getHeaderNames();
	
	
//	/**
//	 * 获取实际请求对象
//	 * @return
//	 */
//	ServletRequest getRequest();
}
