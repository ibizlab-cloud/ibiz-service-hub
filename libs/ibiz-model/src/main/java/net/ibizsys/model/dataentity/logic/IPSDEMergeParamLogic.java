package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑合并列表逻辑参数节点模型对象接口
 * <P>
 * 扩展父接口类型[MERGEPARAM]
 *
 */
public interface IPSDEMergeParamLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取拷贝属性集合
	 * @return
	 */
	java.util.List<java.lang.String> getCopyFields();
	
	
	/**
	 * 获取目标逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取目标参数合并属性
	 * @return
	 */
	java.lang.String getDstParamMergeField();
	
	
	/**
	 * 获取合并模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELNMergeParamMode}
	 * @return
	 */
	java.lang.String getMergeMode();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust();
	
	
	/**
	 * 获取源逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParam();


	/**
	 * 获取源逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParamMust();
	
	
	/**
	 * 获取源参数合并属性
	 * @return
	 */
	java.lang.String getSrcParamMergeField();
	
	
	/**
	 * 获取是否仅拷贝不存在属性
	 * @return
	 */
	boolean isCopyIfNotExists();
	
	
	/**
	 * 获取是否合并到指定属性
	 * @return
	 */
	boolean isMergeIntoField();
}