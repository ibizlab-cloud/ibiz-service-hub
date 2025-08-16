package net.ibizsys.model.app.view;



/**
 * 应用实体树表格视图模型对象接口
 * <P>
 * 扩展父接口类型[DETREEGRIDVIEW,DETREEGRIDVIEW9]
 *
 */
public interface IPSAppDETreeGridView extends net.ibizsys.model.app.view.IPSAppDEMultiDataView{

	
	
	/**
	 * 获取表格行激活模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridRowActiveMode}
	 * @return
	 */
	int getGridRowActiveMode();
	
	
	/**
	 * 获取是否支持行编辑
	 * @return
	 */
	boolean isEnableRowEdit();
	
	
	/**
	 * 获取是否视图默认进入行编辑
	 * @return
	 */
	boolean isRowEditDefault();
}