package net.ibizsys.model.valuerule;



/**
 * 系统预置值规则模型对象接口
 *
 */
public interface IPSSysValueRule extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取自定义处理对象
	 * @return
	 */
	java.lang.String getCustomObject();
	
	
	/**
	 * 获取自定义参数
	 * @return
	 */
	java.lang.String getCustomParams();
	
	
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
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取正则式代码
	 * @return
	 */
	java.lang.String getRegExCode();
	
	
	/**
	 * 获取正则式代码2
	 * @return
	 */
	java.lang.String getRegExCode2();
	
	
	/**
	 * 获取正则式代码3
	 * @return
	 */
	java.lang.String getRegExCode3();
	
	
	/**
	 * 获取正则式代码4
	 * @return
	 */
	java.lang.String getRegExCode4();
	
	
	/**
	 * 获取值规则信息
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
	 * @return
	 */
	java.lang.String getRuleTag();
	
	
	/**
	 * 获取规则标记2
	 * @return
	 */
	java.lang.String getRuleTag2();
	
	
	/**
	 * 获取值规则类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ValueRuleType}
	 * @return
	 */
	java.lang.String getRuleType();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
	
	
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