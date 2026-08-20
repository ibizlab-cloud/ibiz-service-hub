package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBIDimension extends net.ibizsys.model.bi.IPSBISchemeObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取维度标记
	 * @return
	 */
	String getDimensionTag();
	
	
	/**
	 * 获取维度标记2
	 * @return
	 */
	String getDimensionTag2();
}