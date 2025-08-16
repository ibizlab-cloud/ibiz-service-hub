package net.ibizsys.model.app.view;



/**
 * 应用实体工作流动态编辑视图模型对象接口
 * <P>
 * 扩展父接口类型[DEWFDYNAEDITVIEW]
 *
 */
public interface IPSAppDEWFDynaEditView extends net.ibizsys.model.app.view.IPSAppDEWFEditView
		,net.ibizsys.model.app.view.IPSAppDEWFDynaActionView{

	
	
	/**
	 * 获取附加界面行为组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.view.IPSUIActionGroup> getPSUIActionGroups();
	
	/**
	 * 获取附加界面行为组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置附加界面行为组集合
	 * @param list 附加界面行为组集合
	 */
	void setPSUIActionGroups(java.util.List<net.ibizsys.model.view.IPSUIActionGroup> list);
}