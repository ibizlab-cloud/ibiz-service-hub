package net.ibizsys.model.ai;



/**
 * AI工作者代理对象接口
 *
 */
public interface IPSAIWorkerAgent extends net.ibizsys.model.ai.IPSAIFactoryObject{

	
	
	/**
	 * 获取AI平台类型
	 * @return
	 */
	String getAIPlatformType();
	
	
	/**
	 * 获取代理信息
	 * @return
	 */
	String getAgentInfo();
	
	
	/**
	 * 获取代理动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getAgentParams();
	
	
	/**
	 * 获取AI工作者标记
	 * @return
	 */
	String getAgentTag();
	
	
	/**
	 * 获取AI工作者标记2
	 * @return
	 */
	String getAgentTag2();
	
	
	/**
	 * 获取AI工作者类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIWorkerAgentType}
	 * @return
	 */
	String getAgentType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
}