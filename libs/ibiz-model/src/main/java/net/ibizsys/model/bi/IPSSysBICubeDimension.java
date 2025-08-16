package net.ibizsys.model.bi;



/**
 * 智能报表立方体维度模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO}运行时对象
 *
 */
public interface IPSSysBICubeDimension extends net.ibizsys.model.bi.IPSBICubeDimension
		,net.ibizsys.model.bi.IPSSysBICubeObject{

	
	
	/**
	 * 获取立方体维度层级集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBICubeLevel> getAllPSSysBICubeLevels();
	
	/**
	 * 获取立方体维度层级集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBICubeLevel getPSSysBICubeLevel(Object objKey, boolean bTryMode);
	
	/**
	 * 设置立方体维度层级集合
	 * @param list 立方体维度层级集合
	 */
	void setPSSysBICubeLevels(java.util.List<net.ibizsys.model.bi.IPSSysBICubeLevel> list);
	
	
	/**
	 * 获取智能报表维度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO#FIELD_PSSYSBIDIMENSIONID}
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBIDimension getPSSysBIDimension();


	/**
	 * 获取智能报表维度，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBIDimension getPSSysBIDimensionMust();
}