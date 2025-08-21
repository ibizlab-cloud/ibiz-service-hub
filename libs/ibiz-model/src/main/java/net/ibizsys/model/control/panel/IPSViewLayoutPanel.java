package net.ibizsys.model.control.panel;



/**
 * 视图布局面板模型对象接口
 *
 */
public interface IPSViewLayoutPanel extends net.ibizsys.model.control.panel.IPSSysLayoutPanel{

	
	
	/**
	 * 获取是否仅布局内容区
	 * @return
	 */
	boolean isLayoutBodyOnly();
	
	
	/**
	 * 获取是否使用默认布局
	 * @return
	 */
	boolean isUseDefaultLayout();
	
	
	/**
	 * 获取是否启用视图代理模式
	 * @return
	 */
	boolean isViewProxyMode();
}