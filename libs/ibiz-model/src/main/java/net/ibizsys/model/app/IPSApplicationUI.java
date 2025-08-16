package net.ibizsys.model.app;



/**
 * 应用界面设置模型对象接口
 *
 */
public interface IPSApplicationUI extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取自动填充最小触发字符数
	 * @return
	 */
	int getACMinChars();
	
	
	/**
	 * 获取无权限按钮显示模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BtnNoPrivDisplayMode}
	 * @return
	 */
	int getButtonNoPrivDisplayMode();
	
	
	/**
	 * 获取默认应用视图界面样式
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getDefaultAppViewPSSysCss();


	/**
	 * 获取默认应用视图界面样式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getDefaultAppViewPSSysCssMust();
	
	
	/**
	 * 获取默认控件样式
	 * @return
	 */
	java.lang.String getDefaultControlStyle();
	
	
	/**
	 * 获取表单项无值显示内容
	 * @return
	 */
	java.lang.String getFormItemEmptyText();
	
	
	/**
	 * 获取表单项无权限显示模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NoPrivDisplayMode}
	 * @return
	 */
	int getFormItemNoPrivDisplayMode();
	
	
	/**
	 * 获取表格列启用过滤器模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEGridColLinkMode}
	 * @return
	 */
	int getGridColumnEnableFilter();
	
	
	/**
	 * 获取表格列启用链接模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEGridColLinkMode}
	 * @return
	 */
	int getGridColumnEnableLink();
	
	
	/**
	 * 获取表格列无权限显示模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NoPrivDisplayMode}
	 * @return
	 */
	int getGridColumnNoPrivDisplayMode();
	
	
	/**
	 * 获取表格行默认激活模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridRowActiveMode}
	 * @return
	 */
	int getGridRowActiveMode();
	
	
	/**
	 * 获取多数据部件默认无值显示内容
	 * @return
	 */
	java.lang.String getMDCtrlEmptyText();
	
	
	/**
	 * 获取多数据部件默认无值内容语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getMDCtrlEmptyTextPSLanguageRes();


	/**
	 * 获取多数据部件默认无值内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getMDCtrlEmptyTextPSLanguageResMust();
	
	
	/**
	 * 获取主菜单对齐
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppIndexViewMenuAlign}
	 * @return
	 */
	java.lang.String getMainMenuAlign();
	
	
	/**
	 * 获取前端模板样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSPFSTYLEID}
	 * @return
	 */
	java.lang.String getPFStyle();
	
	
	/**
	 * 获取前端模板
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSPFID}
	 * @return
	 */
	java.lang.String getPFType();
	
	
	/**
	 * 获取应用界面样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppUIStyle}
	 * @return
	 */
	java.lang.String getUIStyle();
	
	
	/**
	 * 获取是否自动转换12列至24列布局
	 * @return
	 */
	boolean isEnableCol12ToCol24();
	
	
	/**
	 * 获取是否支持动态数据看板
	 * @return
	 */
	boolean isEnableDynaDashboard();
	
	
	/**
	 * 获取是否支持搜索条件存储
	 * @return
	 */
	boolean isEnableFilterStorage();
	
	
	/**
	 * 获取是否启用界面模型增强
	 * @return
	 */
	boolean isEnableUIModelEx();
	
	
	/**
	 * 获取是否表格默认支持定制
	 * @return
	 */
	boolean isGridEnableCustomized();
	
	
	/**
	 * 获取是否表格默认启用全屏
	 * @return
	 */
	boolean isGridForceFit();
	
	
	/**
	 * 获取是否输出表单项更新权限标记
	 * @return
	 */
	boolean isOutputFormItemUpdatePrivTag();
}