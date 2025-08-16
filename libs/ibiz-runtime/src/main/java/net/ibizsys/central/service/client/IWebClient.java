package net.ibizsys.central.service.client;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;

public interface IWebClient {

	/**
	 * 初始化
	 * @param iSystemRuntime
	 * @throws Exception
	 */
	void init(ISystemRuntime iSystemRuntime) throws Exception;
	
	
	/**
	 * 初始化，传入服务基路径及全局请求头
	 * @param iSystemRuntime
	 * @param strServiceUrl
	 * @param headers
	 * @throws Exception
	 */
	void init(ISystemRuntime iSystemRuntime, String strServiceUrl, Map<String, ?> headers) throws Exception;
	
	
	/**
	 * 初始化，传入外部服务接口
	 * @param iSubSysServiceAPIRuntime
	 * @throws Exception
	 */
	void init(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime) throws Exception;
	
	
	
	/**
	 * 初始化，传入外部服务接口（额外指定服务地址）
	 * @param iSubSysServiceAPIRuntime
	 * @param strServiceUrl 
	 * @throws Exception
	 */
	void init(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime, String strServiceUrl) throws Exception;
	
	
	
	/**
	 * 获取当前系统运行时
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	
	
	
	
	/**
	 * 获取代理客户端
	 * @param cls
	 * @return
	 */
	<T> T getProxyClient(Class<?> cls);
	
	
	/**
	 * 获取基本服务路径
	 * @return
	 */
	String getServiceUrl();
	
	
	/**
	 * 获取全局请求头内容
	 * @return
	 */
	Map<String, ?> getHeaders();
	
	
	/**
	 * 获取全局请求头内容
	 * @param bAuthMode 认证模式
	 * @return
	 */
	Map<String, ?> getHeaders(boolean bAuthMode);
	
	
	/**
	 * 执行 get 操作
	 * @param strUri
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> get(String strUri) throws Throwable;
	
	
	/**
	 * 执行 get 操作
	 * @param strUri
	 * @param uriParams
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> get(String strUri, Map<String, ?> uriParams) throws Throwable;
	
	
	/**
	 * 执行 get 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> get(String strUri, Map<String, ?> uriParams, Map<String, ?> headers) throws Throwable;
	
	
	
	/**
	 * 执行 get 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> get(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries) throws Throwable;
	

	/**
	 * 执行 get 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param cls
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> get(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable;
	
	

	/**
	 * 执行 get 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param type
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> get(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, TypeReference<T> type, Object objTag) throws Throwable;
	
	
	/**
	 * 执行  post 操作
	 * @param strUri
	 * @param uriParams
	 * @param objBody 内容
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> post(String strUri, Object objBody) throws Throwable;
	
	/**
	 * 执行  post 操作
	 * @param strUri
	 * @param uriParams
	 * @param objBody 内容
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> post(String strUri, Map<String, ?> uriParams, Object objBody) throws Throwable;
	
	
	
	/**
	 * 执行  post 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param objBody 内容
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> post(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objBody) throws Throwable;
	
	
	/**
	 * 执行  post 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objBody 内容
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> post(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody) throws Throwable;
	
	
	/**
	 * 执行  post 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objBody 内容
	 * @param strContentType 内容类型
	 * @param cls
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> post(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable;
	
	
	/**
	 * 执行  post 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objBody 内容
	 * @param strContentType 内容类型
	 * @param type
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> post(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, TypeReference<T> type, Object objTag) throws Throwable;
	
	
	/**
	 * 执行  put 操作
	 * @param strUri
	 * @param objBody 内容
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> put(String strUri, Object objBody) throws Throwable;
	
	
	/**
	 * 执行  put 操作
	 * @param strUri
	 * @param uriParams
	 * @param objBody 内容
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> put(String strUri, Map<String, ?> uriParams, Object objBody) throws Throwable;
	
	
	/**
	 * 执行  put 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param objBody 内容
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> put(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objBody) throws Throwable;
	

	/**
	 * 执行  put 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objBody 内容
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> put(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody) throws Throwable;
	
	
	/**
	 * 执行  put 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objBody 内容
	 * @param strContentType 内容类型
	 * @param cls
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> put(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable;
	
	
	/**
	 * 执行  put 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objBody 内容
	 * @param strContentType 内容类型
	 * @param type
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> put(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, TypeReference<T> type, Object objTag) throws Throwable;
	
	
	/**
	 * 执行 delete 操作
	 * @param strUri
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> delete(String strUri) throws Throwable;
	
	
	/**
	 * 执行 delete 操作
	 * @param strUri
	 * @param uriParams
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> delete(String strUri, Map<String, ?> uriParams) throws Throwable;
	
	/**
	 * 执行 delete 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> delete(String strUri, Map<String, ?> uriParams, Map<String, ?> headers) throws Throwable;
	
	/**
	 * 执行 delete 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<String> delete(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries) throws Throwable;
	

	/**
	 * 执行 delete 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param cls
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> delete(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable;
	
	/**
	 * 执行 delete 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param type
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> delete(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, TypeReference<T> type, Object objTag) throws Throwable;
	
	
	
	/**
	 * 执行  patch 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objBody
	 * @param strContentType
	 * @param cls
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> patch(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable;
	
	
	/**
	 * 执行  patch 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objBody
	 * @param strContentType
	 * @param type
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> patch(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, TypeReference<T> type, Object objTag) throws Throwable;
	
	
	/**
	 * 执行 head 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> head(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable;
	

	/**
	 * 执行 head 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param type
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> head(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, TypeReference<T> type, Object objTag) throws Throwable;
	
	
	
//	/**
//	 * 执行 options 操作
//	 * @param strUri
//	 * @param uriParams
//	 * @param headers
//	 * @return
//	 * @throws Throwable
//	 */
//	<T> IWebClientRep<T> options(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objData, Class<T> cls, Object objTag) throws Throwable;
//	
//	
//	/**
//	 * 执行 trace 操作
//	 * @param strUri
//	 * @param uriParams
//	 * @param headers
//	 * @return
//	 * @throws Throwable
//	 */
//	<T> IWebClientRep<T> trace(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objData, Class<T> cls, Object objTag) throws Throwable;
	
	
	/**
	 * 执行  上传文件 操作
	 * @param strUri
	 * @param objFile 文件
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<?> upload(String strUri, Object objFile) throws Throwable;
	
	
	/**
	 * 执行  上传文件 操作
	 * @param strUri
	 * @param uriParams
	 * @param objFile 文件
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<?> upload(String strUri, Map<String, ?> uriParams, Object objFile) throws Throwable;
	
	
	/**
	 * 执行  上传文件 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param objFile 文件
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<?> upload(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objFile) throws Throwable;
	
	
	/**
	 * 执行  上传文件 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objFile 文件
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<?> upload(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile) throws Throwable;
	
	
	/**
	 * 执行  上传文件 操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objFile 文件
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<?> upload(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile, Object objTag) throws Throwable;

	
	/**
	 * 执行  下载文件  操作
	 * @param strUri
	 * @param objFile
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<?> download(String strUri, Object objFile) throws Throwable;
	
	
	/**
	 * 执行  下载文件  操作
	 * @param strUri
	 * @param uriParams
	 * @param objFile
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<?> download(String strUri, Map<String, ?> uriParams, Object objFile) throws Throwable;
	
	
	/**
	 * 执行  下载文件  操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param objFile
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<?> download(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objFile) throws Throwable;
	

	/**
	 * 执行  下载文件  操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objFile
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<?> download(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile) throws Throwable;
	
	
	/**
	 * 执行  下载文件  操作
	 * @param strUri
	 * @param uriParams
	 * @param headers
	 * @param queries
	 * @param objFile
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	IWebClientRep<?> download(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile, Object objTag) throws Throwable;
	
	
	/**
	 * 执行 请求 操作
	 * @param strMethod 方法
	 * @param strUri
	 * @param uriParams uri 参数
	 * @param headers
	 * @param queries 查询参数
	 * @param objData 内容对象
	 * @param strContentType 内容类型
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> execute(String strMethod, String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objData, String strContentType, Class<T> cls, Object objTag) throws Throwable;

	
	
	/**
	 * 执行 请求 操作
	 * @param strMethod 方法
	 * @param strUri
	 * @param uriParams uri 参数
	 * @param headers
	 * @param queries 查询参数
	 * @param objData 内容对象
	 * @param strContentType 内容类型
	 * @return
	 * @throws Throwable
	 */
	<T> IWebClientRep<T> execute(String strMethod, String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objData, String strContentType, TypeReference<T> type, Object objTag) throws Throwable;
	
	
}
