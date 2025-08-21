package net.ibizsys.model.dataentity.der;



/**
 * 实体1：N关系模型对象接口
 * <P>
 * 扩展父接口类型[DER1N]
 *
 */
public interface IPSDER1N extends net.ibizsys.model.dataentity.der.IPSDERBase
		,net.ibizsys.model.dataentity.der.IPSDER1NBase{

	
	
	/**
	 * 获取附加约束主属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getERMajorPSDEF();


	/**
	 * 获取附加约束主属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getERMajorPSDEFMust();
	
	
	/**
	 * 获取附加约束从属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getERMinorPSDEF();


	/**
	 * 获取附加约束从属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getERMinorPSDEFMust();
	
	
	/**
	 * 获取导出引用数据模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DERExportMajorModel}
	 * @return
	 */
	int getExportMajorModel();
	
	
	/**
	 * 获取外键名称
	 * @return
	 */
	java.lang.String getFKeyName();
	
	
	/**
	 * 获取主实体父关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDER1N getMajorPPSDER1N();


	/**
	 * 获取主实体父关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDER1N getMajorPPSDER1NMust();
	
	
	/**
	 * 获取主控次序
	 * @return
	 */
	int getMasterOrder();
	
	
	/**
	 * 获取主从关系类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DER1NMasterRS}
	 * @return
	 */
	int getMasterRS();
	
	
	/**
	 * 获取从实体父关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDER1N getMinorPPSDER1N();


	/**
	 * 获取从实体父关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDER1N getMinorPPSDER1NMust();
	
	
	/**
	 * 获取嵌套成员数据集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getNestedPSDEDataSet();


	/**
	 * 获取嵌套成员数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getNestedPSDEDataSetMust();
	
	
	/**
	 * 获取关系属性映射集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap> getPSDER1NDEFieldMaps();
	
	/**
	 * 获取关系属性映射集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap getPSDER1NDEFieldMap(Object objKey, boolean bTryMode);
	
	/**
	 * 设置关系属性映射集合
	 * @param list 关系属性映射集合
	 */
	void setPSDER1NDEFieldMaps(java.util.List<net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap> list);
	
	
	/**
	 * 获取一对多关系数据属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField getPSOne2ManyDataDEField();


	/**
	 * 获取一对多关系数据属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField getPSOne2ManyDataDEFieldMust();
	
	
	/**
	 * 获取外键属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSPickupDEField getPSPickupDEField();


	/**
	 * 获取外键属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSPickupDEField getPSPickupDEFieldMust();
	
	
	/**
	 * 获取外键文本属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSLinkDEField getPSPickupTextDEField();


	/**
	 * 获取外键文本属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSLinkDEField getPSPickupTextDEFieldMust();
	
	
	/**
	 * 获取关系属性名称
	 * @return
	 */
	java.lang.String getPickupDEFName();
	
	
	/**
	 * 获取删除拒绝消息语言标记
	 * @return
	 */
	java.lang.String getRRMLanResTag();
	
	
	/**
	 * 获取删除拒绝消息语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getRRMPSLanguageRes();


	/**
	 * 获取删除拒绝消息语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getRRMPSLanguageResMust();
	
	
	/**
	 * 获取引用实体数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSet();


	/**
	 * 获取引用实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSetMust();
	
	
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
	 * 获取同步数据模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DERDataSyncAction}
	 * @return
	 */
	int getSyncDataMode();
	
	
	/**
	 * 获取临时数据次序
	 * @return
	 */
	int getTempDataOrder();
	
	
	/**
	 * 获取是否支持克隆
	 * @return
	 */
	boolean isCloneRS();
	
	
	/**
	 * 获取是否关系属性回写，从关系属性中计算
	 * @return
	 */
	boolean isEnableDEFieldWriteBack();
	
	
	/**
	 * 获取是否启用附加约束
	 * @return
	 */
	boolean isEnableExtRestrict();
	
	
	/**
	 * 获取是否启用外键
	 * @return
	 */
	boolean isEnableFKey();
	
	
	/**
	 * 获取是否启用父关系等价
	 * @return
	 */
	boolean isEnablePDEREQ();
	
	
	/**
	 * 获取是否启用物理化更新
	 * @return
	 */
	boolean isEnablePhysicalDEFieldUpdate();
	
	
	/**
	 * 获取是否嵌套操作，主从关系{@link #getMasterRS}指定嵌套归关系
	 * @return
	 */
	boolean isNestedRS();
	
	
	/**
	 * 获取是否递归关系，主从关系{@link #getMasterRS}指定递归关系（需要主从实体一致）
	 * @return
	 */
	boolean isRecursiveRS();
}