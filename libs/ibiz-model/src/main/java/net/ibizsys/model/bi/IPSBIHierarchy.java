package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBIHierarchy extends net.ibizsys.model.bi.IPSBIDimensionObject{

	
	
	/**
	 * 获取维度架构标记
	 * @return
	 */
	java.lang.String getHierarchyTag();
	
	
	/**
	 * 获取维度架构标记2
	 * @return
	 */
	java.lang.String getHierarchyTag2();
	
	
	/**
	 * 获取维度架构类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIHierarchyType}
	 * @return
	 */
	java.lang.String getHierarchyType();
	
	
	/**
	 * 获取实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
}