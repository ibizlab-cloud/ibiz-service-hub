package net.ibizsys.model.ai;



/**
 * AI工厂生产线代理对象接口
 *
 */
public interface IPSAIPipelineAgent extends net.ibizsys.model.ai.IPSAIFactoryObject{

	
	
	/**
	 * 获取AI平台类型
	 * @return
	 */
	java.lang.String getAIPlatformType();
	
	
	/**
	 * 获取代理动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getAgentParams();
	
	
	/**
	 * 获取AI生产线标记
	 * @return
	 */
	java.lang.String getAgentTag();
	
	
	/**
	 * 获取AI生产线标记2
	 * @return
	 */
	java.lang.String getAgentTag2();
	
	
	/**
	 * 获取AI工作者类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIPipelineAgentType}
	 * @return
	 */
	java.lang.String getAgentType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
}