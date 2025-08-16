package net.ibizsys.model.codelist;



/**
 *
 */
public interface IPSThresholdGroup extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取开始值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getBeginValuePSDEField();


	/**
	 * 获取开始值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getBeginValuePSDEFieldMust();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取自定义条件
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取阈值数据存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDataPSDEField();


	/**
	 * 获取阈值数据存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDataPSDEFieldMust();
	
	
	/**
	 * 获取结束值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEndValuePSDEField();


	/**
	 * 获取结束值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEndValuePSDEFieldMust();
	
	
	/**
	 * 获取图标样式值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEField();


	/**
	 * 获取图标样式值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEFieldMust();
	
	
	/**
	 * 获取数据集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取阈值项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.codelist.IPSThreshold> getPSThresholds();
	
	/**
	 * 获取阈值项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.codelist.IPSThreshold getPSThreshold(Object objKey, boolean bTryMode);
	
	/**
	 * 设置阈值项集合
	 * @param list 阈值项集合
	 */
	void setPSThresholds(java.util.List<net.ibizsys.model.codelist.IPSThreshold> list);
	
	
	/**
	 * 获取文本值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEField();


	/**
	 * 获取文本值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEFieldMust();
	
	
	/**
	 * 获取阈值组标记
	 * @return
	 */
	java.lang.String getThresholdGroupTag();
	
	
	/**
	 * 获取阈值组标记2
	 * @return
	 */
	java.lang.String getThresholdGroupTag2();
	
	
	/**
	 * 获取阈值组类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ThresholdGroupType}
	 * @return
	 */
	java.lang.String getThresholdGroupType();
}