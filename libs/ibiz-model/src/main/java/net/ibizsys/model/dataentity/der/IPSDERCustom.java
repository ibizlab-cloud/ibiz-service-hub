package net.ibizsys.model.dataentity.der;



/**
 * 实体自定义关系模型对象接口
 * <P>
 * 扩展父接口类型[DERCUSTOM]
 *
 */
public interface IPSDERCustom extends net.ibizsys.model.dataentity.der.IPSDERBase
		,net.ibizsys.model.dataentity.der.IPSDER1NBase{

	
	
	/**
	 * 获取关系子类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DERSubType}
	 * @return
	 */
	java.lang.String getDERSubType();
	
	
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
	 * 获取一对多关系数据属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getOne2XDataPSDEField();


	/**
	 * 获取一对多关系数据属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getOne2XDataPSDEFieldMust();
	
	
	/**
	 * 获取父子类型
	 * @return
	 */
	java.lang.String getParentSubType();
	
	
	/**
	 * 获取父类型
	 * @return
	 */
	java.lang.String getParentType();
	
	
	/**
	 * 获取关系属性名称
	 * @return
	 */
	java.lang.String getPickupDEFName();
	
	
	/**
	 * 获取关系属性，使用关系属性{@link #getPickupDEFName}在从实体中尝试获取
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPickupPSDEField();


	/**
	 * 获取关系属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPickupPSDEFieldMust();
	
	
	/**
	 * 获取关系主信息属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPickupTextPSDEField();


	/**
	 * 获取关系主信息属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPickupTextPSDEFieldMust();
	
	
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
	 * 获取关系识别值
	 * @return
	 */
	java.lang.String getTypeValue();
	
	
	/**
	 * 获取是否启用物理化更新
	 * @return
	 */
	boolean isEnablePhysicalDEFieldUpdate();
}