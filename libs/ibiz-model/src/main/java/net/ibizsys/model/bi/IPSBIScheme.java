package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBIScheme extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取搜索引擎类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIEngineType}
	 * @return
	 */
	java.lang.String getBIEngineType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取体系标记
	 * @return
	 */
	java.lang.String getSchemeTag();
	
	
	/**
	 * 获取体系标记2
	 * @return
	 */
	java.lang.String getSchemeTag2();
	
	
	/**
	 * 获取智能报表体系唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
}