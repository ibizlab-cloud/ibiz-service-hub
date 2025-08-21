package net.ibizsys.model.control.tree;



/**
 * 实体树表格界面行为操作列模型对象接口
 *
 */
public interface IPSDETreeUAColumn extends net.ibizsys.model.control.tree.IPSDETreeColumn{

	
	
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