package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑节点参数模型对象接口
 *
 */
public interface IPSDELogicNodeParam extends net.ibizsys.model.dataentity.logic.IPSDELogicNodeParamBase{

	
	
	/**
	 * 获取目标逻辑参数
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取表达式
	 * @return
	 */
	java.lang.String getExpression();
	
	
	/**
	 * 获取系统值序列对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSequence getPSSysSequence();


	/**
	 * 获取系统值序列对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSequence getPSSysSequenceMust();
	
	
	/**
	 * 获取系统值转换器对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator();


	/**
	 * 获取系统值转换器对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust();
	
	
	/**
	 * 获取动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getParams();
	
	
	/**
	 * 获取源逻辑参数
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParam();


	/**
	 * 获取源逻辑参数，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParamMust();
	
	
	/**
	 * 获取是否值输出转换
	 * @return
	 */
	boolean isOutTranslate();
}