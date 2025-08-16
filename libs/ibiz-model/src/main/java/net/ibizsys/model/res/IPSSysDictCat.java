package net.ibizsys.model.res;



/**
 *
 */
public interface IPSSysDictCat extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取词条分类标记
	 * @return
	 */
	java.lang.String getDictCatTag();
	
	
	/**
	 * 获取词条分类标记2
	 * @return
	 */
	java.lang.String getDictCatTag2();
	
	
	/**
	 * 获取是否用户词典
	 * @return
	 */
	boolean isUserDictCat();
}