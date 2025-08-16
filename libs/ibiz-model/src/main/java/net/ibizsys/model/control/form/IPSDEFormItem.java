package net.ibizsys.model.control.form;



/**
 * 表单项模型对象接口
 * <P>
 * 扩展父接口类型[FORMITEM]
 *
 */
public interface IPSDEFormItem extends net.ibizsys.model.control.form.IPSDEFormDetail
		,net.ibizsys.model.control.IPSEditorContainer{

	
	
	/**
	 * 获取标题，非空白标题时返回配置的标题内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取动态标题绑定值项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_LEVELTAG}
	 * @return
	 */
	java.lang.String getCaptionItemName();
	
	
	/**
	 * 获取建立默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_CREATEDV}
	 * @return
	 */
	java.lang.String getCreateDV();
	
	
	/**
	 * 获取建立默认值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_CREATEDVT}
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
	 * 获取启用条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_ENABLECOND}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditItemEnableCond}
	 * @return
	 */
	int getEnableCond();
	
	
	/**
	 * 获取绑定属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_FIELDNAME}
	 * @return
	 */
	java.lang.String getFieldName();
	
	
	/**
	 * 获取忽略输入模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_IGNOREINPUT}
	 * @return
	 */
	int getIgnoreInput();
	
	
	/**
	 * 获取输入提示信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_INPUTTIP}
	 * @return
	 */
	java.lang.String getInputTip();
	
	
	/**
	 * 获取输入提示信息语言标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_INPUTTIPLANRESTAG}
	 * @return
	 */
	java.lang.String getInputTipLanResTag();
	
	
	/**
	 * 获取输入提示全局标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_INPUTTIPUNIQUETAG}
	 * @return
	 */
	java.lang.String getInputTipUniqueTag();
	
	
	/**
	 * 获取输入提示链接
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_INPUTTIPURL}
	 * @return
	 */
	java.lang.String getInputTipUrl();
	
	
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
	 * 获取标签动态样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_LABELDYNACLASS}
	 * @return
	 */
	java.lang.String getLabelDynaClass();
	
	
	/**
	 * 获取标签位置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_LABELPOS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LabelPos}
	 * @return
	 */
	java.lang.String getLabelPos();
	
	
	/**
	 * 获取标签宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_LABELWIDTH}
	 * @return
	 */
	int getLabelWidth();
	
	
	/**
	 * 获取无权限显示模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_NOPRIVDM}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NoPrivDisplayMode}
	 * @return
	 */
	int getNoPrivDisplayMode();
	
	
	/**
	 * 获取输出代码表配置模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_CODELISTCONFIGMODE}
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
	 * 获取应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取表单项更新
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_PSDEFIUPDATEID}
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdate();


	/**
	 * 获取表单项更新，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdateMust();
	
	
	/**
	 * 获取表单项图片对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取表单项图片对象，不存在时抛出异常
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
	 * 获取更新默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_UPDATEDV}
	 * @return
	 */
	java.lang.String getUpdateDV();
	
	
	/**
	 * 获取更新默认值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_UPDATEDVT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CreateDefaultValueType}
	 * @return
	 */
	java.lang.String getUpdateDVT();
	
	
	/**
	 * 获取值格式化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_VALUEFORMAT}
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取是否允许空值输入
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_ALLOWEMPTY}
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否复合表单项
	 * @return
	 */
	boolean isCompositeItem();
	
	
	/**
	 * 获取是否转换为代码项文本
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_CONVERTCITEXT}
	 * @return
	 */
	boolean isConvertToCodeItemText();
	
	
	/**
	 * 获取是否空白标签
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_EMPTYCAPTION}
	 * @return
	 */
	boolean isEmptyCaption();
	
	
	/**
	 * 获取是否提供锚点
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_ENABLEANCHOR}
	 * @return
	 */
	boolean isEnableAnchor();
	
	
	/**
	 * 获取是否支持输入提示
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_ENABLEINPUTTIP}
	 * @return
	 */
	boolean isEnableInputTip();
	
	
	/**
	 * 获取是否启用项权限控制
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_ENABLEITEMPRIV}
	 * @return
	 */
	boolean isEnableItemPriv();
	
	
	/**
	 * 获取是否支持单位
	 * @return
	 */
	boolean isEnableUnitName();
	
	
	/**
	 * 获取是否隐藏表单项，计算编辑器类型为隐藏项(HIDDEN)
	 * @return
	 */
	boolean isHidden();
	
	
	/**
	 * 获取是否输入提示支持关闭
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_INPUTTIPCLOSABLE}
	 * @return
	 */
	boolean isInputTipClosable();
	
	
	/**
	 * 获取是否需要代码表配置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_NEEDCODELISTCONFIG}
	 * @return
	 */
	boolean isNeedCodeListConfig();
}