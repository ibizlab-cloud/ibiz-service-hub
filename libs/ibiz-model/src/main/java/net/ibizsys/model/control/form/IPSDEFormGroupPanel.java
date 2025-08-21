package net.ibizsys.model.control.form;



/**
 * 实体表单分组面板成员模型对象接口
 * <P>
 * 扩展父接口类型[GROUPPANEL]
 *
 */
public interface IPSDEFormGroupPanel extends net.ibizsys.model.control.form.IPSDEFormDetail
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
	 * @return
	 */
	int getBuildInActions();
	
	
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
	 * 获取是否信息面板模式
	 * @return
	 */
	boolean isInfoGroupMode();
}