package net.ibizsys.model.ai;



/**
 *
 */
public interface IPSAIChatAgent extends net.ibizsys.model.ai.IPSAIFactoryObject{

	
	
	/**
	 * 获取代理动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AICHATAGENTPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getAgentParams();
	
	
	/**
	 * 获取AI交谈标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AICHATAGENTTAG}
	 * @return
	 */
	java.lang.String getAgentTag();
	
	
	/**
	 * 获取AI交谈标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AICHATAGENTTAG2}
	 * @return
	 */
	java.lang.String getAgentTag2();
	
	
	/**
	 * 获取AI交谈类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AICHATAGENTTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIChatAgentType}
	 * @return
	 */
	java.lang.String getAgentType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
}