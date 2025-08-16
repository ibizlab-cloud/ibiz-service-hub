package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑排序逻辑参数节点模型对象接口
 * <P>
 * 扩展父接口类型[SORTPARAM]
 *
 */
public interface IPSDESortParamLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标排序属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_CUSTOMDSTPARAM}
	 * @return
	 */
	java.lang.String getDstFieldName();
	
	
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
	 * 获取目标列表排序模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTSORTDIR}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortMode}
	 * @return
	 */
	java.lang.String getDstSortDir();
}