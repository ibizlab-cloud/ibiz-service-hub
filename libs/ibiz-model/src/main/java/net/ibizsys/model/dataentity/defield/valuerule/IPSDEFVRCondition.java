package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则条件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEFVRCondDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getCondType}
 *
 */
public interface IPSDEFVRCondition extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取条件标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFVRCondDTO#FIELD_CONDTAG}
	 * @return
	 */
	java.lang.String getCondTag();
	
	
	/**
	 * 获取条件标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFVRCondDTO#FIELD_CONDTAG2}
	 * @return
	 */
	java.lang.String getCondTag2();
	
	
	/**
	 * 获取条件项类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFVRCondDTO#FIELD_CONDTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFVRType}
	 * @return
	 */
	java.lang.String getCondType();
	
	
	/**
	 * 获取规则信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFVRCondDTO#FIELD_RULEINFO}
	 * @return
	 */
	java.lang.String getRuleInfo();
	
	
	/**
	 * 获取规则信息语言资源标记
	 * @return
	 */
	java.lang.String getRuleInfoLanResTag();
	
	
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFVRCondDTO#FIELD_KEYCONDFLAG}
	 * @return
	 */
	boolean isKeyCond();
	
	
	/**
	 * 获取是否逻辑取反
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFVRCondDTO#FIELD_GROUPNOTFLAG}
	 * @return
	 */
	boolean isNotMode();
	
	
	/**
	 * 获取是否检查失败忽略，恒为false
	 * @return
	 */
	boolean isTryMode();
}