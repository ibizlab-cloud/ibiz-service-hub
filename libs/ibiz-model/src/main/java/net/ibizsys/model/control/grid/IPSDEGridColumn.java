package net.ibizsys.model.control.grid;



/**
 * 实体表格列模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getColumnType}
 *
 */
public interface IPSDEGridColumn extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取聚合值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_AGGFIELD}
	 * @return
	 */
	java.lang.String getAggField();
	
	
	/**
	 * 获取聚合模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_AGGMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAggMode}
	 * @return
	 */
	java.lang.String getAggMode();
	
	
	/**
	 * 获取聚合值格式化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_AGGVALUEFORMAT}
	 * @return
	 */
	java.lang.String getAggValueFormat();
	
	
	/**
	 * 获取列水平对齐
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_ALIGN}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	java.lang.String getAlign();
	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_CAPPSLANRESID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取单元格样式对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_CELLPSSYSCSSID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_GRIDCOLSTYLE}
	 * @return
	 */
	java.lang.String getColumnStyle();
	
	
	/**
	 * 获取列类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_GRIDCOLTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColType}
	 * @return
	 */
	java.lang.String getColumnType();
	
	
	/**
	 * 获取列数据项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_DATAITEMS}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_HEADERPSSYSCSSID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_HIDEDEFAULT}
	 * @return
	 */
	int getHideMode();
	
	
	/**
	 * 获取无权限显示模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_NOPRIVDM}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NoPrivDisplayMode}
	 * @return
	 */
	int getNoPrivDisplayMode();
	
	
	/**
	 * 获取头部图片对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_PSSYSIMAGEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_WIDTH}
	 * @return
	 */
	int getWidth();
	
	
	/**
	 * 获取列宽单位
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_WIDTHUNIT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColWidthUnitType}
	 * @return
	 */
	java.lang.String getWidthUnit();
	
	
	/**
	 * 获取是否支持行编辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_ENABLEROWEDIT}
	 * @return
	 */
	boolean isEnableRowEdit();
	
	
	/**
	 * 获取是否支持排序
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_NOSORT}
	 * @return
	 */
	boolean isEnableSort();
	
	
	/**
	 * 获取是否隐藏数据项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_HIDDENDATAITEM}
	 * @return
	 */
	boolean isHiddenDataItem();
	
	
	/**
	 * 获取是否默认隐藏
	 * @return
	 */
	boolean isHideDefault();
}