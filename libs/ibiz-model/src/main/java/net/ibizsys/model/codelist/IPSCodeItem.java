package net.ibizsys.model.codelist;



/**
 * 代码表项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO}运行时对象
 *
 */
public interface IPSCodeItem extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取背景颜色
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_BKCOLOR}
	 * @return
	 */
	java.lang.String getBKColor();
	
	
	/**
	 * 获取开始值
	 * @return
	 */
	java.lang.Double getBeginValue();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取文本颜色
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_COLOR}
	 * @return
	 */
	java.lang.String getColor();
	
	
	/**
	 * 获取数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_DATA}
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取结束值
	 * @return
	 */
	java.lang.Double getEndValue();
	
	
	/**
	 * 获取图标样式
	 * @return
	 */
	java.lang.String getIconCls();
	
	
	/**
	 * 获取图标样式(X)
	 * @return
	 */
	java.lang.String getIconClsX();
	
	
	/**
	 * 获取图标路径
	 * @return
	 */
	java.lang.String getIconPath();
	
	
	/**
	 * 获取图标路径(X)
	 * @return
	 */
	java.lang.String getIconPathX();
	
	
	/**
	 * 获取代码项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.codelist.IPSCodeItem> getPSCodeItems();
	
	/**
	 * 获取代码项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.codelist.IPSCodeItem getPSCodeItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置代码项集合
	 * @param list 代码项集合
	 */
	void setPSCodeItems(java.util.List<net.ibizsys.model.codelist.IPSCodeItem> list);
	
	
	/**
	 * 获取显示样式
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取显示样式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取图标对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图标对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取文本
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_PSCODEITEMNAME}
	 * @return
	 */
	java.lang.String getText();
	
	
	/**
	 * 获取文本样式
	 * @return
	 */
	java.lang.String getTextCls();
	
	
	/**
	 * 获取文本语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTextPSLanguageRes();


	/**
	 * 获取文本语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTextPSLanguageResMust();
	
	
	/**
	 * 获取提示信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_TOOLTIPINFO}
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取提示信息语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取提示信息语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
	
	
	/**
	 * 获取代码项数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_USERDATA}
	 * @return
	 */
	java.lang.String getUserData();
	
	
	/**
	 * 获取代码项数据2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_USERDATA2}
	 * @return
	 */
	java.lang.String getUserData2();
	
	
	/**
	 * 获取值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_CODEITEMVALUE}
	 * @return
	 */
	java.lang.String getValue();
	
	
	/**
	 * 获取是否默认代码项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_DEFAULTFLAG}
	 * @return
	 */
	boolean isDefault();
	
	
	/**
	 * 获取是否禁止选择
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_DISABLESELECT}
	 * @return
	 */
	boolean isDisableSelect();
	
	
	/**
	 * 获取是否包含开始值
	 * @return
	 */
	boolean isIncludeBeginValue();
	
	
	/**
	 * 获取是否包含结束值
	 * @return
	 */
	boolean isIncludeEndValue();
	
	
	/**
	 * 获取是否显示为空白
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO#FIELD_SHOWASEMPTY}
	 * @return
	 */
	boolean isShowAsEmtpy();
}