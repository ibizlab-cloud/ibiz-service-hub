package net.ibizsys.central.service.client;

import java.util.List;

import org.springframework.util.MultiValueMap;

public interface IWebClientRep<T> {

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
	 * 返回结果
	 * @return
	 */
	T getBody();
	
	
	
	/**
	 * 获取反馈状态码
	 * @return
	 */
	int getStatusCode();
	
}
