package net.ibizsys.model.control.form;



/**
 * 实体表单多项数据部件成员模型对象接口
 * <P>
 * 扩展父接口类型[MDCTRL]
 *
 */
public interface IPSDEFormMDCtrl extends net.ibizsys.model.control.form.IPSDEFormDetail
		,net.ibizsys.model.control.form.IPSDEFormGroupBase{

	
	
	/**
	 * 获取界面行为组展开模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UGExtractMode}
	 * @return
	 */
	java.lang.String getActionGroupExtractMode();
	
	
	/**
	 * 获取内建操作
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FormMDCtrlAction}
	 * @return
	 */
	int getBuildInActions();
	
	
	/**
	 * 获取内容部件
	 * @return
	 */
	net.ibizsys.model.control.IPSControl getContentPSControl();


	/**
	 * 获取内容部件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControl getContentPSControlMust();
	
	
	/**
	 * 获取内容类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FormDetailMDCtrlType}
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取部件参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getCtrlParams();
	
	
	/**
	 * 获取绑定属性
	 * @return
	 */
	java.lang.String getFieldName();
	
	
	/**
	 * 获取应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取调用表单项更新
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdate();


	/**
	 * 获取调用表单项更新，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdateMust();
	
	
	/**
	 * 获取界面行为组对象
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup();


	/**
	 * 获取界面行为组对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust();
	
	
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
	 * 获取是否1:1数据表单
	 * @return
	 */
	boolean isOne2OneForm();
}