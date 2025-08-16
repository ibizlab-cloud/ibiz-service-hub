package net.ibizsys.model.ai;



/**
 *
 */
public interface IPSAIPipelineAgent extends net.ibizsys.model.ai.IPSAIFactoryObject{

	
	
	/**
	 * 获取代理动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AIPIPELINEAGENTPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getAgentParams();
	
	
	/**
	 * 获取AI生产线标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AIPIPELINEAGENTTAG}
	 * @return
	 */
	java.lang.String getAgentTag();
	
	
	/**
	 * 获取AI生产线标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AIPIPELINEAGENTTAG2}
	 * @return
	 */
	java.lang.String getAgentTag2();
	
	
	/**
	 * 获取AI工作者类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AIPIPELINEAGENTTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIPipelineAgentType}
	 * @return
	 */
	java.lang.String getAgentType();
	
	
	/**
	 * 获取代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CODENAME}
	 * @return
	 */
	java.lang.String getCodeName();
}