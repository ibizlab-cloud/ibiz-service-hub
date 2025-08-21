package net.ibizsys.model.dataentity.der;



/**
 * 1对多关系接口基类
 *
 */
public interface IPSDER1NBase extends net.ibizsys.model.dataentity.der.IPSDERBase{

	
	
	/**
	 * 获取克隆次序
	 * @return
	 */
	int getCloneOrder();
	
	
	/**
	 * 获取自定义导出次序
	 * @return
	 */
	int getCustomExportOrder();
	
	
	/**
	 * 获取自定义导出次序2
	 * @return
	 */
	int getCustomExportOrder2();
	
	
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
	
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getNestedPSDEDataSet();

net.ibizsys.model.dataentity.ds.IPSDEDataSet getNestedPSDEDataSetMust();
	
	net.ibizsys.model.dataentity.defield.IPSDEField getPickupPSDEField();

net.ibizsys.model.dataentity.defield.IPSDEField getPickupPSDEFieldMust();
	
	
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
	
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSet();

net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSetMust();
	
	
	/**
	 * 获取引用实体属性组
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getRefPSDEFGroup();


	/**
	 * 获取引用实体属性组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getRefPSDEFGroupMust();
	
	
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
}