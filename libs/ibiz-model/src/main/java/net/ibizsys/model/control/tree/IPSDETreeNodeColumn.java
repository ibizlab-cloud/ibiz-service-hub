package net.ibizsys.model.control.tree;



/**
 * 实体树节点表格列模型基础对象接口
 *
 */
public interface IPSDETreeNodeColumn extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取单元格样式对象
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
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NoPrivDisplayMode}
	 * @return
	 */
	int getNoPrivDisplayMode();
	
	
	/**
	 * 获取树视图列
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
	 * @return
	 */
	boolean isEnableRowEdit();
}