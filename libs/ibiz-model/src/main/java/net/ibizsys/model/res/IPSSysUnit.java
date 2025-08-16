package net.ibizsys.model.res;



/**
 *
 */
public interface IPSSysUnit extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取名称语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes();


	/**
	 * 获取名称语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust();
	
	
	/**
	 * 获取单位标记
	 * @return
	 */
	java.lang.String getUnitTag();
	
	
	/**
	 * 获取单位标记2
	 * @return
	 */
	java.lang.String getUnitTag2();
}