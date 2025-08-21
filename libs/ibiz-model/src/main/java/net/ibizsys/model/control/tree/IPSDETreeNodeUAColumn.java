package net.ibizsys.model.control.tree;



/**
 * 实体表格界面行为操作列模型对象接口
 * <P>
 * 扩展父接口类型[UAGRIDCOLUMN]
 *
 */
public interface IPSDETreeNodeUAColumn extends net.ibizsys.model.control.tree.IPSDETreeNodeColumn{

	
	
	/**
	 * 获取界面行为组
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup();


	/**
	 * 获取界面行为组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroupMust();
}