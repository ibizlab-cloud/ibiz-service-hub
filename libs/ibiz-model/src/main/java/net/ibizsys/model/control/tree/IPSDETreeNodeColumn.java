package net.ibizsys.model.control.tree;



/**
 * 实体树节点表格列模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getColumnType}
 *
 */
public interface IPSDETreeNodeColumn extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取单元格样式对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_CELLPSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getCellPSSysCss();


	/**
	 * 获取单元格样式对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getCellPSSysCssMust();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取表格列样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_GRIDCOLSTYLE}
	 * @return
	 */
	java.lang.String getColumnStyle();
	
	
	/**
	 * 获取列类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColType}
	 * @return
	 */
	java.lang.String getColumnType();
	
	
	/**
	 * 获取列数据项名称
	 * @return
	 */
	java.lang.String getDataItemName();
	
	
	/**
	 * 获取无权限显示模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_NOPRIVDM}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NoPrivDisplayMode}
	 * @return
	 */
	int getNoPrivDisplayMode();
	
	
	/**
	 * 获取树视图列
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_PSDETREECOLID}
	 * @return
	 */
	net.ibizsys.model.control.tree.IPSDETreeColumn getPSDETreeColumn();


	/**
	 * 获取树视图列，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.tree.IPSDETreeColumn getPSDETreeColumnMust();
	
	
	/**
	 * 获取列前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getRenderPSSysPFPlugin();


	/**
	 * 获取列前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getRenderPSSysPFPluginMust();
	
	
	/**
	 * 获取是否支持行编辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_ENABLEROWEDIT}
	 * @return
	 */
	boolean isEnableRowEdit();
}