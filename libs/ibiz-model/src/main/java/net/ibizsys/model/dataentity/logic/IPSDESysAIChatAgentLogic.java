package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑AI交谈代理调用节点模型对象接口
 * <P>
 * 扩展父接口类型[SYSAICHATAGENT]
 *
 */
public interface IPSDESysAIChatAgentLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取问题分类模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicSysAIChatCategoryMode}
	 * @return
	 */
	java.lang.String getCategoryMode();
	
	
	/**
	 * 获取分类重排序阈值
	 * @return
	 */
	java.lang.Double getCategoryReRankThreshold();
	
	
	/**
	 * 获取聊天请求附加模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicSysAIChatRequestAppendMode}
	 * @return
	 */
	java.lang.String getChatRequestAppendMode();
	
	
	/**
	 * 获取目标实体行为对象
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction();


	/**
	 * 获取目标实体行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust();
	
	
	/**
	 * 获取目标实体数据集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet();


	/**
	 * 获取目标实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust();
	
	
	/**
	 * 获取目标逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取目标实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity();


	/**
	 * 获取目标实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust();
	
	
	/**
	 * 获取历史消息数量
	 * @return
	 */
	int getHistoryCount();
	
	
	/**
	 * 获取资料库数量
	 * @return
	 */
	int getKnowledgeBaseCount();
	
	
	/**
	 * 获取最大智能自愈尝试次数
	 * @return
	 */
	java.lang.Integer getMaxSmartAttempts();
	
	
	/**
	 * 获取消息内容
	 * @return
	 */
	java.lang.String getMessage();
	
	
	/**
	 * 获取AI交谈代理
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgent();


	/**
	 * 获取AI交谈代理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgentMust();
	
	
	/**
	 * 获取AI工厂
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactory();


	/**
	 * 获取AI工厂，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactoryMust();
	
	
	/**
	 * 获取消息模板
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl();


	/**
	 * 获取消息模板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust();
	
	
	/**
	 * 获取调用服务接口
	 * @return
	 */
	net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPI();


	/**
	 * 获取调用服务接口，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPIMust();
	
	
	/**
	 * 获取重排序阈值
	 * @return
	 */
	java.lang.Double getReRankThreshold();
	
	
	/**
	 * 获取重入限制次数
	 * @return
	 */
	java.lang.Integer getReentryLimit();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust();
	
	
	/**
	 * 获取源逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParam();


	/**
	 * 获取源逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParamMust();
	
	
	/**
	 * 获取子类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicSysAIChatAgentType}
	 * @return
	 */
	java.lang.String getSubType();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getTitle();
}