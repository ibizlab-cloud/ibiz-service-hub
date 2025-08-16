package net.ibizsys.model.ba;



/**
 *
 */
public interface IPSSysBDColumn extends net.ibizsys.model.ba.IPSSysBDTableObject
		,net.ibizsys.model.ba.IPSBDColumn{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
}