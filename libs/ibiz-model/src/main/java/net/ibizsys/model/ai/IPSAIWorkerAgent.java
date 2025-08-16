package net.ibizsys.model.ai;



/**
 *
 */
public interface IPSAIWorkerAgent extends net.ibizsys.model.ai.IPSAIFactoryObject{

	
	
	/**
	 * 获取代理动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AIWORKERAGENTPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getAgentParams();
	
	
	/**
	 * 获取AI工作者标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AIWORKERAGENTTAG}
	 * @return
	 */
	java.lang.String getAgentTag();
	
	
	/**
	 * 获取AI工作者标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AIWORKERAGENTTAG2}
	 * @return
	 */
	java.lang.String getAgentTag2();
	
	
	/**
	 * 获取AI工作者类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AIWORKERAGENTTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIWorkerAgentType}
	 * @return
	 */
	java.lang.String getAgentType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
}