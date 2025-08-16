package net.ibizsys.model.control.list;



/**
 * 实体列表部件项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO}运行时对象
 *
 */
public interface IPSDEListItem extends net.ibizsys.model.control.list.IPSListItem{

	
	
	/**
	 * 获取数据项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_PSDELISTITEMNAME}
	 * @return
	 */
	java.lang.String getDataItemName();
	
	
	/**
	 * 获取界面行为组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_PSDEUAGROUPID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_VALUEFORMAT}
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_WIDTH}
	 * @return
	 */
	int getWidth();
}