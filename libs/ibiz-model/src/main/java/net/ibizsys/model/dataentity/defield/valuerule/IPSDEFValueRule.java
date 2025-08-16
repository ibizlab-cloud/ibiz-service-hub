package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO}运行时对象
 *
 */
public interface IPSDEFValueRule extends net.ibizsys.model.dataentity.defield.IPSDEFieldObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码名称 
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取实体属性值规则条件
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition getPSDEFVRGroupCondition();


	/**
	 * 获取实体属性值规则条件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition getPSDEFVRGroupConditionMust();
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取规则信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO#FIELD_RULEINFO}
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
	 * 获取规则标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO#FIELD_RULETAG}
	 * @return
	 */
	java.lang.String getRuleTag();
	
	
	/**
	 * 获取规则标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO#FIELD_RULETAG2}
	 * @return
	 */
	java.lang.String getRuleTag2();
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否默认检查
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO#FIELD_CHECKDEFAULT}
	 * @return
	 */
	boolean isCheckDefault();
	
	
	/**
	 * 获取是否自定义脚本代码
	 * @return
	 */
	boolean isCustomCode();
	
	
	/**
	 * 获取是否默认规则 
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO#FIELD_DEFAULTMODE}
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否支持后台执行
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO#FIELD_RULEHOLDER}
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否支持前台执行
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO#FIELD_RULEHOLDER}
	 * @return
	 */
	boolean isEnableFront();
}