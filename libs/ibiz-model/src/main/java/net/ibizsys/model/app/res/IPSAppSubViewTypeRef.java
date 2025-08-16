package net.ibizsys.model.app.res;



/**
 * 应用前端视图子样式引用模型对象接口
 * <P>
 * 定义前端应用对视图子样式的引用，根据使用自动计算
 *
 */
public interface IPSAppSubViewTypeRef extends net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取前端模板插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端模板插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取视图布局面板
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSViewLayoutPanel getPSViewLayoutPanel();


	/**
	 * 获取视图布局面板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSViewLayoutPanel getPSViewLayoutPanelMust();
	
	
	/**
	 * 获取插件代码
	 * @return
	 */
	java.lang.String getPluginCode();
	
	
	/**
	 * 获取引用标记
	 * @return
	 */
	java.lang.String getRefTag();
	
	
	/**
	 * 获取类型代码
	 * @return
	 */
	java.lang.String getTypeCode();
	
	
	/**
	 * 获取视图模型
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getViewModel();
	
	
	/**
	 * 获取标准视图类型
	 * @return
	 */
	java.lang.String getViewType();
	
	
	/**
	 * 获取是否仅扩展界面样式
	 * @return
	 */
	boolean isExtendStyleOnly();
	
	
	/**
	 * 获取是否全局默认替换
	 * @return
	 */
	boolean isReplaceDefault();
}