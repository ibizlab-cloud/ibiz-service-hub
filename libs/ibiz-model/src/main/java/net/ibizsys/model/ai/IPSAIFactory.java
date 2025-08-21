package net.ibizsys.model.ai;



/**
 * AI工厂对象接口
 *
 */
public interface IPSAIFactory extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取AI工厂动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getAIFactoryParams();
	
	
	/**
	 * 获取体系标记
	 * @return
	 */
	java.lang.String getAIFactoryTag();
	
	
	/**
	 * 获取体系标记2
	 * @return
	 */
	java.lang.String getAIFactoryTag2();
	
	
	/**
	 * 获取AI工厂类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIFactoryType}
	 * @return
	 */
	java.lang.String getAIFactoryType();
	
	
	/**
	 * 获取AI平台类型
	 * @return
	 */
	java.lang.String getAIPlatformType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
}