package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSSysBICubeLevel extends net.ibizsys.model.bi.IPSBICubeLevel
		,net.ibizsys.model.bi.IPSSysBICubeDimensionObject{

	
	
	/**
	 * 获取智能报表维度架构
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBIHierarchy getPSSysBIHierarchy();


	/**
	 * 获取智能报表维度架构，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBIHierarchy getPSSysBIHierarchyMust();
	
	
	/**
	 * 获取智能报表维度层级
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBILevel getPSSysBILevel();


	/**
	 * 获取智能报表维度层级，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBILevel getPSSysBILevelMust();
}