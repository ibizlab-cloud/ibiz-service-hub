package net.ibizsys.model.control.form;



/**
 * 实体表单成员模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getDetailType}
 *
 */
public interface IPSDEFormDetail extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_CAPPSLANRESID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取列水平对齐
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_COLALIGN}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	java.lang.String getColumnAlign();
	
	
	/**
	 * 获取内容高度
	 * @return
	 */
	double getContentHeight();
	
	
	/**
	 * 获取内容宽度
	 * @return
	 */
	double getContentWidth();
	
	
	/**
	 * 获取计数器标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_COUNTERID}
	 * @return
	 */
	java.lang.String getCounterId();
	
	
	/**
	 * 获取计数器模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_COUNTERMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeCounterMode}
	 * @return
	 */
	int getCounterMode();
	
	
	/**
	 * 获取成员直接样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_RAWCSSSTYLE}
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取成员样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_DETAILSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailStyle}
	 * @return
	 */
	java.lang.String getDetailStyle();
	
	
	/**
	 * 获取成员类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_DETAILTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FormDetailType}
	 * @return
	 */
	java.lang.String getDetailType();
	
	
	/**
	 * 获取动态样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_DYNACLASS}
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取高度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_HEIGHT}
	 * @return
	 */
	double getHeight();
	
	
	/**
	 * 获取标签直接样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_LABELRAWCSSSTYLE}
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
	 * 获取成员标签样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_LABELPSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getLabelPSSysCss();


	/**
	 * 获取成员标签样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getLabelPSSysCssMust();
	
	
	/**
	 * 获取模型状态
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_MODELSTATE}
	 * @return
	 */
	int getModelState();
	
	
	/**
	 * 获取应用计数器引用
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_PSSYSCOUNTERID}
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef();


	/**
	 * 获取应用计数器引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust();
	
	
	/**
	 * 获取表单成员动态逻辑
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFDCatGroupLogic> getPSDEFDGroupLogics();
	
	/**
	 * 获取表单成员动态逻辑的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFDCatGroupLogic getPSDEFDCatGroupLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表单成员动态逻辑
	 * @param list 表单成员动态逻辑
	 */
	void setPSDEFDCatGroupLogics(java.util.List<net.ibizsys.model.control.form.IPSDEFDCatGroupLogic> list);
	
	
	/**
	 * 获取布局设置
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayout getPSLayout();


	/**
	 * 获取布局设置，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayout getPSLayoutMust();
	
	
	/**
	 * 获取布局位置
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPos();


	/**
	 * 获取布局位置，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPosMust();
	
	
	/**
	 * 获取成员样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_PSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取成员样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取成员图标
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取成员图标，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取显示更多管理者，成员配置显式更多模式为受控内容(1)时获取配置为管理容器(2)的从父成员
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormDetail getShowMoreMgrPSDEFormDetail();


	/**
	 * 获取显示更多管理者，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormDetail getShowMoreMgrPSDEFormDetailMust();
	
	
	/**
	 * 获取显示更多模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_SHOWMOREMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FormDetailShowMoreMode}
	 * @return
	 */
	int getShowMoreMode();
	
	
	/**
	 * 获取宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_WIDTH}
	 * @return
	 */
	double getWidth();
	
	
	/**
	 * 获取是否重复输出内容
	 * @return
	 */
	boolean isRepeatContent();
	
	
	/**
	 * 获取是否显示标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_SHOWCAPTION}
	 * @return
	 */
	boolean isShowCaption();
}