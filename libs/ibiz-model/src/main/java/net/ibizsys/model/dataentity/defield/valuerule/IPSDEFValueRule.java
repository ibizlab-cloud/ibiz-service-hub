package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则模型对象接口
 *
 */
public interface IPSDEFValueRule extends net.ibizsys.model.dataentity.defield.IPSDEFieldObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码名称 
	 * @return
	 */
	String getCodeName();
	
	
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
	 * 获取规则标记
	 * @return
	 */
	String getRuleTag();
	
	
	/**
	 * 获取规则标记2
	 * @return
	 */
	String getRuleTag2();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	String getScriptCode();
	
	
	/**
	 * 获取是否默认检查
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
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否支持后台执行
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否支持前台执行
	 * @return
	 */
	boolean isEnableFront();
}