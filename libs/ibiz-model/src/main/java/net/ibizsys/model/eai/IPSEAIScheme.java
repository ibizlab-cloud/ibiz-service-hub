package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSEAIScheme extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取体系标记
	 * @return
	 */
	String getSchemeTag();
	
	
	/**
	 * 获取体系标记2
	 * @return
	 */
	String getSchemeTag2();
}