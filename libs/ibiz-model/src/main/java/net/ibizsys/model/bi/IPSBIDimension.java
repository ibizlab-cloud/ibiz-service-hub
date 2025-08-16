package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBIDimension extends net.ibizsys.model.bi.IPSSysBISchemeObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取维度标记
	 * @return
	 */
	java.lang.String getDimensionTag();
	
	
	/**
	 * 获取维度标记2
	 * @return
	 */
	java.lang.String getDimensionTag2();
}