package net.ibizsys.model.control.panel;



/**
 * 面板直接内容项模型对象接口
 * <P>
 * 扩展父接口类型[RAWITEM]
 *
 */
public interface IPSPanelRawItem extends net.ibizsys.model.control.panel.IPSPanelItem
		,net.ibizsys.model.control.IPSRawItem
		,net.ibizsys.model.control.IPSRawItemContainer{

	
	
	/**
	 * 获取内容类型
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取Html内容
	 * @return
	 */
	java.lang.String getHtmlContent();
	
	
	/**
	 * 获取直接内容
	 * @return
	 */
	java.lang.String getRawContent();
}