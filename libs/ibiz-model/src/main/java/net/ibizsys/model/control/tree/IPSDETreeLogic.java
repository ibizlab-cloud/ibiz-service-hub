package net.ibizsys.model.control.tree;



/**
 * 实体树视图逻辑模型对象接口
 *
 */
public interface IPSDETreeLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取树表格列名称
	 * @return
	 */
	java.lang.String getPSDETreeColumnName();
	
	
	/**
	 * 获取树节点名称
	 * @return
	 */
	java.lang.String getPSDETreeNodeName();
}