package net.ibizsys.model.bi;



/**
 * 智能报表全局维度模型对象接口
 *
 */
public interface IPSSysBIDimension extends net.ibizsys.model.bi.IPSSysBISchemeObject
		,net.ibizsys.model.bi.IPSBIDimension{

	
	
	/**
	 * 获取维度架构集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBIHierarchy> getAllPSSysBIHierarchies();
	
	/**
	 * 获取维度架构集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBIHierarchy getPSSysBIHierarchy(Object objKey, boolean bTryMode);
	
	/**
	 * 设置维度架构集合
	 * @param list 维度架构集合
	 */
	void setPSSysBIHierarchies(java.util.List<net.ibizsys.model.bi.IPSSysBIHierarchy> list);
}