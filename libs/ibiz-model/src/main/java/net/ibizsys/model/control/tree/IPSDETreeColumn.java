package net.ibizsys.model.control.tree;



/**
 * 实体树表格列模型对象接口
 *
 */
public interface IPSDETreeColumn extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取列对齐
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
	 * 获取树视图列样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColStype}
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
	 * 获取数据项名称
	 * @return
	 */
	java.lang.String getDataItemName();
	
	
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
	 * 获取列绘制应用插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getRenderPSSysPFPlugin();


	/**
	 * 获取列绘制应用插件，不存在时抛出异常
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
	 * 获取是否支持展开（树节点），列标识为(text)支持展开
	 * @return
	 */
	boolean isEnableExpand();
	
	
	/**
	 * 获取是否支持排序
	 * @return
	 */
	boolean isEnableSort();
	
	
	/**
	 * 获取是否默认隐藏
	 * @return
	 */
	boolean isHideDefault();
}