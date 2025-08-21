package net.ibizsys.model.control.searchbar;



/**
 *
 */
public interface IPSSearchBarFilter extends net.ibizsys.model.control.searchbar.IPSSearchBarItem
		,net.ibizsys.model.control.IPSEditorContainer{

	
	
	/**
	 * 获取标题多语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题多语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取建立默认值
	 * @return
	 */
	java.lang.String getCreateDV();
	
	
	/**
	 * 获取建立默认值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CreateDefaultValueType}
	 * @return
	 */
	java.lang.String getCreateDVT();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getDataType();
	
	
	/**
	 * 获取表单项高度
	 * @return
	 */
	double getItemHeight();
	
	
	/**
	 * 获取表单项宽度
	 * @return
	 */
	double getItemWidth();
	
	
	/**
	 * 获取标签直接样式
	 * @return
	 */
	java.lang.String getLabelCssStyle();
	
	
	/**
	 * 获取标签位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LabelPos}
	 * @return
	 */
	java.lang.String getLabelPos();
	
	
	/**
	 * 获取标签宽度
	 * @return
	 */
	int getLabelWidth();
	
	
	/**
	 * 获取输出代码表配置模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.OutputCodeListMode}
	 * @return
	 */
	int getOutputCodeListConfigMode();
	
	
	/**
	 * 获取输入提示语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getPHPSLanguageRes();


	/**
	 * 获取输入提示语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getPHPSLanguageResMust();
	
	
	/**
	 * 获取属性搜索模式
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchMode();


	/**
	 * 获取属性搜索模式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchModeMust();
	
	
	/**
	 * 获取过滤项界面样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取过滤项界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取项图片对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取项图片对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取重置项名称
	 * @return
	 */
	java.lang.String getResetItemName();
	
	
	/**
	 * 获取重置项名称集合
	 * @return
	 */
	java.util.List<java.lang.String> getResetItemNames();
	
	
	/**
	 * 获取单位名称
	 * @return
	 */
	java.lang.String getUnitName();
	
	
	/**
	 * 获取单位宽度
	 * @return
	 */
	int getUnitNameWidth();
	
	
	/**
	 * 获取宽度
	 * @return
	 */
	double getWidth();
	
	
	/**
	 * 获取是否添加分隔栏
	 * @return
	 */
	boolean isAddSeparator();
	
	
	/**
	 * 获取是否允许空值输入
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否转换为代码项文本
	 * @return
	 */
	boolean isConvertToCodeItemText();
	
	
	/**
	 * 获取是否空白标签
	 * @return
	 */
	boolean isEmptyCaption();
	
	
	/**
	 * 获取是否启用项权限控制
	 * @return
	 */
	boolean isEnableItemPriv();
	
	
	/**
	 * 获取是否支持单位
	 * @return
	 */
	boolean isEnableUnitName();
	
	
	/**
	 * 获取是否隐藏表单项
	 * @return
	 */
	boolean isHidden();
	
	
	/**
	 * 获取是否需要代码表配置
	 * @return
	 */
	boolean isNeedCodeListConfig();
	
	
	/**
	 * 获取是否显示标题
	 * @return
	 */
	boolean isShowCaption();
}