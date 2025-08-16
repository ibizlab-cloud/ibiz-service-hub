package net.ibizsys.model.ba;



/**
 *
 */
public interface IPSBDScheme extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取大数据库类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BDType}
	 * @return
	 */
	java.lang.String getBDType();
	
	
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
}