package net.ibizsys.model.control.tree;



/**
 * 实体树视图逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDETreeLogicDTO}运行时对象
 *
 */
public interface IPSDETreeLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取树表格列名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeLogicDTO#FIELD_PSDETREECOLNAME}
	 * @return
	 */
	java.lang.String getPSDETreeColumnName();
	
	
	/**
	 * 获取树节点名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeLogicDTO#FIELD_PSDETREENODENAME}
	 * @return
	 */
	java.lang.String getPSDETreeNodeName();
}