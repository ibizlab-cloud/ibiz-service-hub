package net.ibizsys.model.control.panel;



/**
 * 视图布局面板模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO}运行时对象
 *
 */
public interface IPSViewLayoutPanel extends net.ibizsys.model.control.panel.IPSSysLayoutPanel{

	
	
	/**
	 * 获取是否仅布局内容区
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO#FIELD_BODYONLYFLAG}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO#FIELD_VIEWLAYOUTFLAG}
	 * @return
	 */
	boolean isViewProxyMode();
}