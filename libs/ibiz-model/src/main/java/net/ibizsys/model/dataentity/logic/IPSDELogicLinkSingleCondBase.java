package net.ibizsys.model.dataentity.logic;



/**
 * 实体逻辑连接单项条件模型基础对象接口
 *
 */
public interface IPSDELogicLinkSingleCondBase extends net.ibizsys.model.dataentity.logic.IPSDELogicLinkCondBase{

	
	
	/**
	 * 获取值操作
	 * @return
	 */
	java.lang.String getCondOP();
	
	
	/**
	 * 获取目标属性名称
	 * @return
	 */
	java.lang.String getDstFieldName();
	
	net.ibizsys.model.dataentity.logic.IPSDELogicParamBase getDstLogicParam();

net.ibizsys.model.dataentity.logic.IPSDELogicParamBase getDstLogicParamMust();
	
	
	/**
	 * 获取参数类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFVRParamType}
	 * @return
	 */
	java.lang.String getParamType();
	
	
	/**
	 * 获取参数值
	 * @return
	 */
	java.lang.String getParamValue();
	
	
	/**
	 * 获取源逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParamBase getSrcLogicParam();


	/**
	 * 获取源逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParamBase getSrcLogicParamMust();
	
	
	/**
	 * 获取值（旧）
	 * @return
	 */
	java.lang.String getValue();
}