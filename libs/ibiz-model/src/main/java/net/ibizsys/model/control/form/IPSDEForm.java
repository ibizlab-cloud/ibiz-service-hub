package net.ibizsys.model.control.form;



/**
 * 实体表单模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEFormDTO}运行时对象
 *
 */
public interface IPSDEForm extends net.ibizsys.model.control.IPSAjaxControl
		,net.ibizsys.model.control.layout.IPSLayoutContainer
		,net.ibizsys.model.control.IPSControlContainer{

	
	
	/**
	 * 获取默认标签宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_LABELWIDTH}
	 * @return
	 */
	int getDefaultLabelWidth();
	
	
	/**
	 * 获取表单功能模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_FUNCMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FormFuncMode}
	 * @return
	 */
	java.lang.String getFormFuncMode();
	
	
	/**
	 * 获取表单样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_FORMSTYLE}
	 * @return
	 */
	java.lang.String getFormStyle();
	
	
	/**
	 * 获取表单宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_FORMWIDTH}
	 * @return
	 */
	double getFormWidth();
	
	
	/**
	 * 获取应用实体属性输入提示集合
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_PSDEFINPUTTIPSETID}
	 * @return
	 */
	net.ibizsys.model.app.res.IPSAppDEFInputTipSet getPSAppDEFInputTipSet();


	/**
	 * 获取应用实体属性输入提示集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.res.IPSAppDEFInputTipSet getPSAppDEFInputTipSetMust();
	
	
	/**
	 * 获取表单项更新集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFormItemUpdate> getPSDEFormItemUpdates();
	
	/**
	 * 获取表单项更新集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdate(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表单项更新集合
	 * @param list 表单项更新集合
	 */
	void setPSDEFormItemUpdates(java.util.List<net.ibizsys.model.control.form.IPSDEFormItemUpdate> list);
	
	
	/**
	 * 获取表单项值规则集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFormItemVR> getPSDEFormItemVRs();
	
	/**
	 * 获取表单项值规则集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFormItemVR getPSDEFormItemVR(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表单项值规则集合
	 * @param list 表单项值规则集合
	 */
	void setPSDEFormItemVRs(java.util.List<net.ibizsys.model.control.form.IPSDEFormItemVR> list);
	
	
	/**
	 * 获取表单项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> getPSDEFormItems();
	
	/**
	 * 获取表单项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFormItem getPSDEFormItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表单项集合
	 * @param list 表单项集合
	 */
	void setPSDEFormItems(java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> list);
	
	
	/**
	 * 获取表单分页集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFormPage> getPSDEFormPages();
	
	/**
	 * 获取表单分页集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFormPage getPSDEFormPage(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表单分页集合
	 * @param list 表单分页集合
	 */
	void setPSDEFormPages(java.util.List<net.ibizsys.model.control.form.IPSDEFormPage> list);
	
	
	/**
	 * 获取表单分页头部位置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_TABHEADERPOS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TabHeaderPos}
	 * @return
	 */
	java.lang.String getTabHeaderPos();
	
	
	/**
	 * 获取是否启用表单项过滤器
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_ENABLEITEMFILTER}
	 * @return
	 */
	boolean isEnableItemFilter();
	
	
	/**
	 * 获取是否移动端部件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_MOBFLAG}
	 * @return
	 */
	boolean isMobileControl();
	
	
	/**
	 * 获取是否隐藏分页头部
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_SHOWTABHEADER}
	 * @return
	 */
	boolean isNoTabHeader();
}