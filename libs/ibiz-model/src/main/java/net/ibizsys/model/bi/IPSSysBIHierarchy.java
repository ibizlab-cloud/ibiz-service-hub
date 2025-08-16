package net.ibizsys.model.bi;



/**
 * 智能报表维度层次体系模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysBIHierarchyDTO}运行时对象
 *
 */
public interface IPSSysBIHierarchy extends net.ibizsys.model.bi.IPSBIHierarchy
		,net.ibizsys.model.bi.IPSSysBIDimensionObject{

	
	
	/**
	 * 获取全部数据标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBIHierarchyDTO#FIELD_ALLCAPTION}
	 * @return
	 */
	java.lang.String getAllCaption();
	
	
	/**
	 * 获取维度架构集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBILevel> getAllPSSysBILevels();
	
	/**
	 * 获取维度架构集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBILevel getPSSysBILevel(Object objKey, boolean bTryMode);
	
	/**
	 * 设置维度架构集合
	 * @param list 维度架构集合
	 */
	void setPSSysBILevels(java.util.List<net.ibizsys.model.bi.IPSSysBILevel> list);
	
	
	/**
	 * 获取是否启用全部数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBIHierarchyDTO#FIELD_HASALL}
	 * @return
	 */
	boolean hasAll();
}