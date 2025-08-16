package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑节点参数模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO}运行时对象
 *
 */
public interface IPSDEUILogicNodeParam extends net.ibizsys.model.dataentity.logic.IPSDELogicNodeParamBase{

	
	
	/**
	 * 获取目标逻辑参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParam();


	/**
	 * 获取目标逻辑参数，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParamMust();
	
	
	/**
	 * 获取表达式
	 * @return
	 */
	java.lang.String getExpression();
	
	
	/**
	 * 获取源逻辑参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELNParamDTO#FIELD_SRCPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParam();


	/**
	 * 获取源逻辑参数，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParamMust();
}