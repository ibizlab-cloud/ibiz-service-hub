package net.ibizsys.model.valuerule;



/**
 * 系统预置值规则模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO}运行时对象
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_CUSTOMOBJ}
	 * @return
	 */
	java.lang.String getCustomObject();
	
	
	/**
	 * 获取自定义参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_CUSTOMPARAMS}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_REGEXPCODE}
	 * @return
	 */
	java.lang.String getRegExCode();
	
	
	/**
	 * 获取正则式代码2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_REGEXPCODE2}
	 * @return
	 */
	java.lang.String getRegExCode2();
	
	
	/**
	 * 获取正则式代码3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_REGEXPCODE3}
	 * @return
	 */
	java.lang.String getRegExCode3();
	
	
	/**
	 * 获取正则式代码4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_REGEXPCODE4}
	 * @return
	 */
	java.lang.String getRegExCode4();
	
	
	/**
	 * 获取值规则信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_RULEINFO}
	 * @return
	 */
	java.lang.String getRuleInfo();
	
	
	/**
	 * 获取规则标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_RULETAG}
	 * @return
	 */
	java.lang.String getRuleTag();
	
	
	/**
	 * 获取规则标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_RULETAG2}
	 * @return
	 */
	java.lang.String getRuleTag2();
	
	
	/**
	 * 获取值规则类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_RULETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ValueRuleType}
	 * @return
	 */
	java.lang.String getRuleType();
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_SCRIPT}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO#FIELD_RULEHOLDER}
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否支持前台执行
	 * @return
	 */
	boolean isEnableFront();
}