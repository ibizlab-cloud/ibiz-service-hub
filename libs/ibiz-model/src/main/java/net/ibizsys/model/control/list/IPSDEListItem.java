package net.ibizsys.model.control.list;



/**
 * 实体列表部件项模型对象接口
 *
 */
public interface IPSDEListItem extends net.ibizsys.model.control.list.IPSListItem{

	
	
	/**
	 * 获取数据项名称
	 * @return
	 */
	java.lang.String getDataItemName();
	
	
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
	
	
	/**
	 * 获取值格式化
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取宽度
	 * @return
	 */
	int getWidth();
}