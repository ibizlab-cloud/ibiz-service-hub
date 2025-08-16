package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑节点参数模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO}运行时对象
 *
 */
public interface IPSDELogicNodeParam extends net.ibizsys.model.dataentity.logic.IPSDELogicNodeParamBase{

	
	
	/**
	 * 获取目标逻辑参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO#FIELD_DSTPSDLPARAMID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO#FIELD_DIRECTCODE}
	 * @return
	 */
	java.lang.String getExpression();
	
	
	/**
	 * 获取系统值序列对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO#FIELD_PSSYSSEQUENCEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO#FIELD_PSSYSTRANSLATORID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO#FIELD_PARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getParams();
	
	
	/**
	 * 获取源逻辑参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO#FIELD_SRCPSDLPARAMID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO#FIELD_INOUTFLAG}
	 * @return
	 */
	boolean isOutTranslate();
}