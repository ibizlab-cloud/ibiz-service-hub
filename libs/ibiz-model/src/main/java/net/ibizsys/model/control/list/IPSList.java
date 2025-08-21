package net.ibizsys.model.control.list;



/**
 * 列表部件模型对象基础接口
 *
 */
public interface IPSList extends net.ibizsys.model.control.IPSMDAjaxControl
		,net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.IPSControlNavigatable{

	
	
	/**
	 * 获取无值显示内容
	 * @return
	 */
	java.lang.String getEmptyText();
	
	
	/**
	 * 获取无值内容语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes();


	/**
	 * 获取无值内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust();
	
	
	/**
	 * 获取项布局面板
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getItemPSLayoutPanel();


	/**
	 * 获取项布局面板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getItemPSLayoutPanelMust();
}