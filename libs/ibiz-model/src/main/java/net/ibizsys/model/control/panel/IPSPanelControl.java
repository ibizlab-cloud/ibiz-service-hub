package net.ibizsys.model.control.panel;



/**
 * 面板部件项模型对象接口
 * <P>
 * 扩展父接口类型[CONTROL]
 *
 */
public interface IPSPanelControl extends net.ibizsys.model.control.panel.IPSPanelItem{

	
	
	/**
	 * 获取部件对象
	 * @return
	 */
	net.ibizsys.model.control.IPSControl getPSControl();


	/**
	 * 获取部件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControl getPSControlMust();
	
	
	/**
	 * 获取视图模型属性名称
	 * @return
	 */
	java.lang.String getViewFieldName();
}