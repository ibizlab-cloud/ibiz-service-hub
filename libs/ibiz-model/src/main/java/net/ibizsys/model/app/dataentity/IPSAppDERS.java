package net.ibizsys.model.app.dataentity;



/**
 * 应用实体关系模型对象接口
 *
 */
public interface IPSAppDERS extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取行为关系模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SADEActionRSMode}
	 * @return
	 */
	int getActionRSMode();
	
	
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
	 * 获取数据关系模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SADEDataRSMode}
	 * @return
	 */
	int getDataRSMode();
	
	
	/**
	 * 获取主实体代码标识
	 * @return
	 */
	java.lang.String getMajorDECodeName();
	
	
	/**
	 * 获取主实体代码标识2
	 * @return
	 */
	java.lang.String getMajorDECodeName2();
	
	
	/**
	 * 获取主实体名称
	 * @return
	 */
	java.lang.String getMajorDEName();
	
	
	/**
	 * 获取主应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getMajorPSAppDataEntity();


	/**
	 * 获取主应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getMajorPSAppDataEntityMust();
	
	
	/**
	 * 获取从实体代码标识
	 * @return
	 */
	java.lang.String getMinorDECodeName();
	
	
	/**
	 * 获取从实体代码标识2
	 * @return
	 */
	java.lang.String getMinorDECodeName2();
	
	
	/**
	 * 获取从实体名称
	 * @return
	 */
	java.lang.String getMinorDEName();
	
	
	/**
	 * 获取从应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getMinorPSAppDataEntity();


	/**
	 * 获取从应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getMinorPSAppDataEntityMust();
	
	
	/**
	 * 获取嵌套数据结果集
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getNestedPSAppDEDataSet();


	/**
	 * 获取嵌套数据结果集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getNestedPSAppDEDataSetMust();
	
	
	/**
	 * 获取关系项
	 * @return
	 */
	java.lang.String getParentFilter();
	
	
	/**
	 * 获取父关系连接属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getParentPSAppDEField();


	/**
	 * 获取父关系连接属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getParentPSAppDEFieldMust();
	
	
	/**
	 * 获取父关系连接文本属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getParentTextPSAppDEField();


	/**
	 * 获取父关系连接文本属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getParentTextPSAppDEFieldMust();
	
	
	/**
	 * 获取删除拒绝消息语言标记
	 * @return
	 */
	java.lang.String getRRMLanResTag();
	
	
	/**
	 * 获取关系模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppDERSMode}
	 * @return
	 */
	int getRSMode();
	
	
	/**
	 * 获取关系类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DERType}
	 * @return
	 */
	java.lang.String getRSType();
	
	
	/**
	 * 获取删除方式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DER1NRemoveActionType}
	 * @return
	 */
	int getRemoveActionType();
	
	
	/**
	 * 获取删除次序
	 * @return
	 */
	int getRemoveOrder();
	
	
	/**
	 * 获取删除拒绝消息
	 * @return
	 */
	java.lang.String getRemoveRejectMsg();
	
	
	/**
	 * 获取临时数据次序
	 * @return
	 */
	int getTempDataOrder();
	
	
	/**
	 * 获取是否数组模式
	 * @return
	 */
	boolean isArray();
	
	
	/**
	 * 获取是否数据建立关联输出
	 * @return
	 */
	boolean isEnableCreateDataRS();
	
	
	/**
	 * 获取是否数据获取关联输出
	 * @return
	 */
	boolean isEnableGetDataRS();
	
	
	/**
	 * 获取是否数据查询关联输出
	 * @return
	 */
	boolean isEnableSelectDataRS();
	
	
	/**
	 * 获取是否数据更新关联输出
	 * @return
	 */
	boolean isEnableUpdateDataRS();
	
	
	/**
	 * 获取是否主实体主模式
	 * @return
	 */
	boolean isMajorDEMajor();
}