package net.ibizsys.model.dataentity.der;



/**
 * 实体聚合数据关系模型对象接口
 * <P>
 * 扩展父接口类型[DERAGGDATA]
 *
 */
public interface IPSDERAggData extends net.ibizsys.model.dataentity.der.IPSDERBase{

	
	
	/**
	 * 获取关系属性映射集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap> getPSDERAggDataDEFieldMaps();
	
	/**
	 * 获取关系属性映射集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap getPSDERAggDataDEFieldMap(Object objKey, boolean bTryMode);
	
	/**
	 * 设置关系属性映射集合
	 * @param list 关系属性映射集合
	 */
	void setPSDERAggDataDEFieldMaps(java.util.List<net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap> list);
	
	
	/**
	 * 获取源数据集对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_MINORPSDEDSID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getSourcePSDEDataSet();


	/**
	 * 获取源数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getSourcePSDEDataSetMust();
}