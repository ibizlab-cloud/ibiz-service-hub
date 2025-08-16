package net.ibizsys.central.cloud.core.service;

public interface ISysServiceAPIRuntime extends net.ibizsys.central.service.ISysServiceAPIRuntime {

	/**
	 * 反馈头部参数：自定义提示消息
	 */
	public final static String HEADER_MESSAGE = "x-message";
	
	/**
	 * 反馈头部参数：当前页码
	 */
	public final static String HEADER_PAGE = "x-page";
	
	/**
	 * 反馈头部参数：每页记录数
	 */
	public final static String HEADER_PERPAGE = "x-per-page";
	
	/**
	 * 反馈头部参数：总记录数
	 */
	public final static String HEADER_TOTAL = "x-total";
	
	/**
	 * 反馈头部参数：总记录数（忽略权限）
	 */
	public final static String HEADER_TOTALX = "x-totalx";
	
	/**
	 * 反馈头部参数：总页数
	 */
	public final static String HEADER_TOTALPAGES = "x-total-pages";
	
	
	/**
	 * 反馈头部参数：当前动态模型标记
	 */
	public final static String HEADER_DYNAMODELTAG = "x-dyna-model-tag";
	

	
	/**
	 * 注册服务接口映射
	 * @param iSysServiceAPIRequestMappingAdapter
	 * @throws Exception
	 */
	void registerMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception;
	
	
	
	/**
	 * 注销服务接口映射
	 * @param iSysServiceAPIRequestMappingAdapter
	 * @throws Exception
	 */
	void unregisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception;
	
	
	
	
	/**
	 * 获取基础服务路径
	 * @return
	 */
	String getBaseUrl();
	
	
	
	/**
	 * 是否支持匿名用户访问
	 * @return
	 */
	boolean isEnableAnonymousUser();
	
	/**
	 * 实体交互补全操作
	 * @param strScope
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strACTag
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEChatCompletion(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strACTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	/**
	 * 异步导入数据
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param strOSSFileId
	 * @param strImportSchemaId
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEAsyncImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable;

	

	/**
	 * 异步导入数据2
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param strOSSFileId
	 * @param strImportSchemaId
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEAsyncImportData2(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable;
}
