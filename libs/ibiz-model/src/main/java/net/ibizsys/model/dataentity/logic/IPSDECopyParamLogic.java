package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑拷贝逻辑参数节点模型对象接口
 * <P>
 * 扩展父接口类型[COPYPARAM]
 *
 */
public interface IPSDECopyParamLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取拷贝属性集合
	 * @return
	 */
	java.util.List<java.lang.String> getCopyFields();
	
	
	/**
	 * 获取目标逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取源逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_SRCPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParam();


	/**
	 * 获取源逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParamMust();
	
	
	/**
	 * 获取是否仅拷贝不存在属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM9}
	 * @return
	 */
	boolean isCopyIfNotExists();
}