package net.ibizsys.model.control.grid;



/**
 * 实体表格列模型基础对象接口
 *
 */
public interface IPSDEGridColumn extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取聚合值存储属性
	 * @return
	 */
	java.lang.String getAggField();
	
	
	/**
	 * 获取聚合模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAggMode}
	 * @return
	 */
	java.lang.String getAggMode();
	
	
	/**
	 * 获取聚合值格式化
	 * @return
	 */
	java.lang.String getAggValueFormat();
	
	
	/**
	 * 获取列水平对齐
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	java.lang.String getAlign();
	
	
	/**
	 * 获取标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
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
	 * 获取Excel导出标题
	 * @return
	 */
	java.lang.String getExcelCaption();
	
	
	/**
	 * 获取头部样式对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getHeaderPSSysCss();


	/**
	 * 获取头部样式对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getHeaderPSSysCssMust();
	
	
	/**
	 * 获取隐藏模式
	 * @return
	 */
	int getHideMode();
	
	
	/**
	 * 获取无权限显示模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NoPrivDisplayMode}
	 * @return
	 */
	int getNoPrivDisplayMode();
	
	
	/**
	 * 获取头部图片对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取头部图片对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
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
	 * 获取列宽
	 * @return
	 */
	int getWidth();
	
	
	/**
	 * 获取列宽单位
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColWidthUnitType}
	 * @return
	 */
	java.lang.String getWidthUnit();
	
	
	/**
	 * 获取是否支持行编辑
	 * @return
	 */
	boolean isEnableRowEdit();
	
	
	/**
	 * 获取是否支持排序
	 * @return
	 */
	boolean isEnableSort();
	
	
	/**
	 * 获取是否隐藏数据项
	 * @return
	 */
	boolean isHiddenDataItem();
	
	
	/**
	 * 获取是否默认隐藏
	 * @return
	 */
	boolean isHideDefault();
}