package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则条件模型对象接口
 *
 */
public interface IPSDEFVRCondition extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取条件标记
	 * @return
	 */
	String getCondTag();
	
	
	/**
	 * 获取条件标记2
	 * @return
	 */
	String getCondTag2();
	
	
	/**
	 * 获取条件项类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFVRType}
	 * @return
	 */
	String getCondType();
	
	
	/**
	 * 获取规则信息
	 * @return
	 */
	String getRuleInfo();
	
	
	/**
	 * 获取规则信息语言资源标记
	 * @return
	 */
	String getRuleInfoLanResTag();
	
	
	/**
	 * 获取规则信息语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getRuleInfoPSLanguageRes();


	/**
	 * 获取规则信息语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getRuleInfoPSLanguageResMust();
	
	
	/**
	 * 获取是否关键条件
	 * @return
	 */
	boolean isKeyCond();
	
	
	/**
	 * 获取是否逻辑取反
	 * @return
	 */
	boolean isNotMode();
	
	
	/**
	 * 获取是否检查失败忽略，恒为false
	 * @return
	 */
	boolean isTryMode();
}