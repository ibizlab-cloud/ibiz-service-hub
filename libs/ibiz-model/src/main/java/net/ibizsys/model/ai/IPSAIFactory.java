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
	String getAIFactoryTag();
	
	
	/**
	 * 获取体系标记2
	 * @return
	 */
	String getAIFactoryTag2();
	
	
	/**
	 * 获取AI工厂类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIFactoryType}
	 * @return
	 */
	String getAIFactoryType();
	
	
	/**
	 * 获取AI平台类型
	 * @return
	 */
	String getAIPlatformType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
}