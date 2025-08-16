package net.ibizsys.model.view;



/**
 * 界面行为模型基础对象接口
 *
 */
public interface IPSUIAction extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取行为级别
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ACTIONLEVEL}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionLevel}
	 * @return
	 */
	int getActionLevel();
	
	
	/**
	 * 获取行为操作目标
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ACTIONTARGET}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionTarget}
	 * @return
	 */
	java.lang.String getActionTarget();
	
	
	/**
	 * 获取确认信息语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CMPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCMPSLanguageRes();


	/**
	 * 获取确认信息语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCMPSLanguageResMust();
	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CAPPSLANRESID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取操作确认信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CONFIRMINFO}
	 * @return
	 */
	java.lang.String getConfirmMsg();
	
	
	/**
	 * 获取数据访问权限
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEOPPRIVID}
	 * @return
	 */
	java.lang.String getDataAccessAction();
	
	
	/**
	 * 获取弹窗关闭结果
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CLOSEEDITVIEW}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionDialogResult}
	 * @return
	 */
	java.lang.String getDialogResult();
	
	
	/**
	 * 获取前端应用视图，根据{@link #isFrontPDTView}优先处理预置视图，否则按应用类型计算对应的实体视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEVIEWBASEID}、{@link net.ibizsys.centralstudio.dto.DTO#FIELD_MOBPSDEVIEWID}、{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSPDTVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getFrontPSAppView();


	/**
	 * 获取前端应用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getFrontPSAppViewMust();
	
	
	/**
	 * 获取前台处理类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_FRONTPROTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionFrontType}
	 * @return
	 */
	java.lang.String getFrontProcessType();
	
	
	/**
	 * 获取完全代码标识，完全代码标识格式：{实体代码标识}_{界面行为代码标识}，解决不同实体的界面行为在同一个应用场合区分的问题
	 * @return
	 */
	java.lang.String getFullCodeName();
	
	
	/**
	 * 获取Html页面路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_HTMLPAGEURL}
	 * @return
	 */
	java.lang.String getHtmlPageUrl();
	
	
	/**
	 * 获取下一步界面行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_NEXTPSDEUIACTIONID}
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getNextPSUIAction();


	/**
	 * 获取下一步界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getNextPSUIActionMust();
	
	
	/**
	 * 获取界面行为图标对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取界面行为图标对象，不存在时抛出异常
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
	 * 获取参数项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAMITEM}
	 * @return
	 */
	java.lang.String getParamItem();
	
	
	/**
	 * 获取预置行为类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSUIACTIONID}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取刷新引用视图模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_RELOADDATA}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionReloadDataMode}
	 * @return
	 */
	int getRefreshMode();
	
	
	/**
	 * 获取成功信息语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SMPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSMPSLanguageRes();


	/**
	 * 获取成功信息语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSMPSLanguageResMust();
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取操作成功提示信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SUCCESSINFO}
	 * @return
	 */
	java.lang.String getSuccessMsg();
	
	
	/**
	 * 获取文本项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TEXTITEM}
	 * @return
	 */
	java.lang.String getTextItem();
	
	
	/**
	 * 获取操作超时时长（毫秒）
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TIMEOUT}
	 * @return
	 */
	long getTimeout();
	
	
	/**
	 * 获取操作提示信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TOOLTIPINFO}
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取操作提示语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TIPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取操作提示语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
	
	
	/**
	 * 获取界面行为模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_UIACTIONTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionType}
	 * @return
	 */
	java.lang.String getUIActionMode();
	
	
	/**
	 * 获取界面行为参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_UIACTIONPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getUIActionParamJO();
	
	
	/**
	 * 获取界面行为标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CODENAME}
	 * @return
	 */
	java.lang.String getUIActionTag();
	
	
	/**
	 * 获取界面行为类型
	 * @return
	 */
	java.lang.String getUIActionType();
	
	
	/**
	 * 获取界面逻辑附加类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_VLEXECMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionVLExecMode}
	 * @return
	 */
	java.lang.String getUILogicAttachMode();
	
	
	/**
	 * 获取界面逻辑类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_VIEWLOGICTYPE}
	 * @return
	 */
	java.lang.String getUILogicType();
	
	
	/**
	 * 获取值项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DATAITEM}
	 * @return
	 */
	java.lang.String getValueItem();
	
	
	/**
	 * 获取是否操作后关闭编辑视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CLOSEEDITVIEW}
	 * @return
	 */
	boolean isCloseEditView();
	
	
	/**
	 * 获取是否启用用户操作确认
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_USERCONFIRM}
	 * @return
	 */
	boolean isEnableConfirm();
	
	
	/**
	 * 获取是否启用按钮点击切换模式
	 * @return
	 */
	boolean isEnableToggleMode();
	
	
	/**
	 * 获取是否行为组
	 * @return
	 */
	boolean isGroup();
	
	
	/**
	 * 获取是否操作后刷新当前界面
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_RELOADDATA}
	 * @return
	 */
	boolean isReloadData();
	
	
	/**
	 * 获取是否显示处理提示
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BUSYINDICATOR}
	 * @return
	 */
	boolean isShowBusyIndicator();
}