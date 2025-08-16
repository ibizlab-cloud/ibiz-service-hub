package net.ibizsys.model.dataentity.service;



/**
 * 服务接口实体关系模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDESARSDTO}运行时对象
 *
 */
public interface IPSDEServiceAPIRS extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取主接口对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESARSDTO#FIELD_PPSDESERVICEAPIID}
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPI getMajorPSDEServiceAPI();


	/**
	 * 获取主接口对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPI getMajorPSDEServiceAPIMust();
	
	
	/**
	 * 获取从接口对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESARSDTO#FIELD_CPSDESERVICEAPIID}
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPI getMinorPSDEServiceAPI();


	/**
	 * 获取从接口对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPI getMinorPSDEServiceAPIMust();
	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取关系对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESARSDTO#FIELD_PSDERID}
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDER();


	/**
	 * 获取关系对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust();
	
	
	/**
	 * 获取接口方法集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> getPSDEServiceAPIMethods();
	
	/**
	 * 获取接口方法集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethod(Object objKey, boolean bTryMode);
	
	/**
	 * 设置接口方法集合
	 * @param list 接口方法集合
	 */
	void setPSDEServiceAPIMethods(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> list);
	
	
	/**
	 * 获取关系项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESARSDTO#FIELD_CHILDFILTER}
	 * @return
	 */
	java.lang.String getParentFilter();
	
	
	/**
	 * 获取父数据标识实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getParentIdPSDEField();


	/**
	 * 获取父数据标识实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getParentIdPSDEFieldMust();
	
	
	/**
	 * 获取父类型过滤项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESARSDTO#FIELD_TYPEFILTER}
	 * @return
	 */
	java.lang.String getParentTypeFilter();
	
	
	/**
	 * 获取父数据类型实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getParentTypePSDEField();


	/**
	 * 获取父数据类型实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getParentTypePSDEFieldMust();
	
	
	/**
	 * 获取是否数组模式
	 * @return
	 */
	boolean isArray();
	
	
	/**
	 * 获取是否支持数据导出
	 * @return
	 */
	boolean isEnableDataExport();
	
	
	/**
	 * 获取是否支持数据导入
	 * @return
	 */
	boolean isEnableDataImport();
}