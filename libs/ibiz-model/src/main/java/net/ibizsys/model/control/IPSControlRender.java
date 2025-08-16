package net.ibizsys.model.control;



/**
 * 界面部件绘制器模型对象接口
 *
 */
public interface IPSControlRender extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取布局面板模型
	 * @return
	 */
	java.lang.String getLayoutPanelModel();
	
	
	/**
	 * 获取布局面板
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanel();


	/**
	 * 获取布局面板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanelMust();
	
	
	/**
	 * 获取前端插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取绘制器名称
	 * @return
	 */
	java.lang.String getRenderName();
	
	
	/**
	 * 获取绘制器类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ControlRenderType}
	 * @return
	 */
	java.lang.String getRenderType();
}