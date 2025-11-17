package net.ibizsys.model.ai;



/**
 * AI交谈代理模型对象接口
 *
 */
public interface IPSSysAIChatAgent extends net.ibizsys.model.ai.IPSSysAIFactoryObject
		,net.ibizsys.model.ai.IPSAIChatAgent{

	
	
	/**
	 * 获取AI平台值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getAIPlatformPSDEField();


	/**
	 * 获取AI平台值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getAIPlatformPSDEFieldMust();
	
	
	/**
	 * 获取默认标志值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDefaultFlagPSDEField();


	/**
	 * 获取默认标志值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDefaultFlagPSDEFieldMust();
	
	
	/**
	 * 获取动态模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIAgentDynamicMode}
	 * @return
	 */
	int getDynamicMode();
	
	
	/**
	 * 获取启用问题建议
	 * @return
	 */
	java.lang.Boolean getEnableSuggestedQuestions();
	
	
	/**
	 * 获取启用问题建议值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEnableSuggestedQuestionsPSDEField();


	/**
	 * 获取启用问题建议值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEnableSuggestedQuestionsPSDEFieldMust();
	
	
	/**
	 * 获取启用思考链
	 * @return
	 */
	java.lang.Boolean getEnableThinking();
	
	
	/**
	 * 获取启用思考链值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEnableThinkingPSDEField();


	/**
	 * 获取启用思考链值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEnableThinkingPSDEFieldMust();
	
	
	/**
	 * 获取启用调用工具
	 * @return
	 */
	java.lang.Boolean getEnableTools();
	
	
	/**
	 * 获取调用工具值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEnableToolsPSDEField();


	/**
	 * 获取调用工具值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEnableToolsPSDEFieldMust();
	
	
	/**
	 * 获取AI生成模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIGenerationMode}
	 * @return
	 */
	java.lang.String getGenerationMode();
	
	
	/**
	 * 获取生成模式值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getGenerationModePSDEField();


	/**
	 * 获取生成模式值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getGenerationModePSDEFieldMust();
	
	
	/**
	 * 获取最大输入token数
	 * @return
	 */
	java.lang.Integer getMaxInputTokens();
	
	
	/**
	 * 获取最大输入token数值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMaxInputTokensPSDEField();


	/**
	 * 获取最大输入token数值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMaxInputTokensPSDEFieldMust();
	
	
	/**
	 * 获取最大token数
	 * @return
	 */
	java.lang.Integer getMaxTokens();
	
	
	/**
	 * 获取最大token数值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMaxTokensPSDEField();


	/**
	 * 获取最大token数值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMaxTokensPSDEFieldMust();
	
	
	/**
	 * 获取记忆对话轮数
	 * @return
	 */
	java.lang.Integer getMemoryMaxTurns();
	
	
	/**
	 * 获取记忆对话轮数值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMemoryMaxTurnsPSDEField();


	/**
	 * 获取记忆对话轮数值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMemoryMaxTurnsPSDEFieldMust();
	
	
	/**
	 * 获取记忆模式
	 * @return
	 */
	java.lang.String getMemoryMode();
	
	
	/**
	 * 获取记忆模式值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMemoryModePSDEField();


	/**
	 * 获取记忆模式值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMemoryModePSDEFieldMust();
	
	
	/**
	 * 获取名称值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getNamePSDEField();


	/**
	 * 获取名称值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getNamePSDEFieldMust();
	
	
	/**
	 * 获取实体数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取实体逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogic();


	/**
	 * 获取实体逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogicMust();
	
	
	/**
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
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
	 * 获取权限统一资源对象
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes();


	/**
	 * 获取权限统一资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust();
	
	
	/**
	 * 获取流模式
	 * @return
	 */
	java.lang.Boolean getStream();
	
	
	/**
	 * 获取启用流值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getStreamPSDEField();


	/**
	 * 获取启用流值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getStreamPSDEFieldMust();
	
	
	/**
	 * 获取建议提示词
	 * @return
	 */
	java.lang.String getSuggestionPrompt();
	
	
	/**
	 * 获取建议提示词值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSuggestionPromptPSDEField();


	/**
	 * 获取建议提示词值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSuggestionPromptPSDEFieldMust();
	
	
	/**
	 * 获取系统提示词
	 * @return
	 */
	java.lang.String getSystemPrompt();
	
	
	/**
	 * 获取系统提示词值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSystemPromptPSDEField();


	/**
	 * 获取系统提示词值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSystemPromptPSDEFieldMust();
	
	
	/**
	 * 获取随机性参数
	 * @return
	 */
	java.lang.Double getTemperature();
	
	
	/**
	 * 获取随机性参数值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTemperaturePSDEField();


	/**
	 * 获取随机性参数值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTemperaturePSDEFieldMust();
	
	
	/**
	 * 获取工具调用超限提示语
	 * @return
	 */
	java.lang.String getToolExceedMessage();
	
	
	/**
	 * 获取工具调用超限提示语值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getToolExceedMessagePSDEField();


	/**
	 * 获取工具调用超限提示语值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getToolExceedMessagePSDEFieldMust();
	
	
	/**
	 * 获取最大工具调用次数
	 * @return
	 */
	java.lang.Integer getToolMaxCalls();
	
	
	/**
	 * 获取最大工具调用次数值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getToolMaxCallsPSDEField();


	/**
	 * 获取最大工具调用次数值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getToolMaxCallsPSDEFieldMust();
	
	
	/**
	 * 获取概率核采样
	 * @return
	 */
	java.lang.Double getTopP();
	
	
	/**
	 * 获取概率核采样值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTopPPSDEField();


	/**
	 * 获取概率核采样值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTopPPSDEFieldMust();
	
	
	/**
	 * 获取截断策略
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AITrimmingStrategy}
	 * @return
	 */
	java.lang.String getTrimmingStrategy();
	
	
	/**
	 * 获取截断策略值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTrimmingStrategyPSDEField();


	/**
	 * 获取截断策略值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTrimmingStrategyPSDEFieldMust();
	
	
	/**
	 * 获取唯一标记值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUniqueTagPSDEField();


	/**
	 * 获取唯一标记值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUniqueTagPSDEFieldMust();
	
	
	/**
	 * 获取欢迎消息
	 * @return
	 */
	java.lang.String getWelcomeMessage();
	
	
	/**
	 * 获取欢迎消息值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWelcomeMessagePSDEField();


	/**
	 * 获取欢迎消息值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWelcomeMessagePSDEFieldMust();
}