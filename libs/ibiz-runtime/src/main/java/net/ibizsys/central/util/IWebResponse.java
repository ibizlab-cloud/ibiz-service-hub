package net.ibizsys.central.util;

import java.util.List;

import org.springframework.util.MultiValueMap;

/**
 * Http 反馈对象
 * @author lionlau
 *
 */
public interface IWebResponse {

	
	
	/**
	 * 获取返回头集合
	 * @return
	 */
	MultiValueMap<String, String> getHeaders();
	
	/**
	 * 获取返回头信息
	 * @param strHeader
	 * @return
	 */
	String getHeader(String strHeader);
	
	
	/**
	 * 获取返回头信息
	 * @param strHeader
	 * @return
	 */
	List<String> getHeaderValues(String strHeader);
	
	
	/**
	 * 获取返回头键名集合
	 * @return
	 */
	List<String> getHeaderNames();
	
	/**
	 * 附加头部值
	 * @param strHeader
	 * @param strValue
	 */
	void addHeader(String strHeader, String strValue);
	
	
	/**
	 * 设置头部值
	 * @param strHeader
	 * @param strValue
	 */
	void setHeader(String strHeader, String strValue);
	
	
	/**
	 * 设置头部值
	 * @param strHeader
	 * @param list
	 */
	void setHeaderValues(String strHeader, List<String> list);
	
	
	/**
	 * 附加头部值
	 * @param strHeader
	 * @param list
	 */
	void addHeaderValues(String strHeader, List<String> list);
	
	/**
	 * 重置头部
	 * @param strHeader
	 */
	void resetHeader(String strHeader);
	
	
	/**
	 * 重置头部
	 * @param strHeader
	 * @param strValue
	 */
	void resetHeader(String strHeader, String strValue);
	
	
	/**
	 * 返回结果
	 * @return
	 */
	Object getBody();
	
	
	
	/**
	 * 设置反馈结果
	 * @param body
	 */
	void setBody(Object body);
	
	
	/**
	 * 获取反馈状态码
	 * @return
	 */
	int getStatusCode();
	
	
	
	/**
	 * 设置反馈状态码
	 * @param nStatusCode
	 */
	void setStatusCode(int nStatusCode);
	
	
	
	/**
	 * 获取内容类型
	 * @return
	 */
	String getContentType();
	
	
	/**
	 * 设置内容类型
	 * @param strContentType
	 */
	void setContentType(String strContentType);
}
