package net.ibizsys.model.control.form;



/**
 * 实体表单IFrame面板成员模型对象接口
 * <P>
 * 扩展父接口类型[IFRAME]
 *
 */
public interface IPSDEFormIFrame extends net.ibizsys.model.control.form.IPSDEFormDetail{

	
	
	/**
	 * 获取嵌入Url路径
	 * @return
	 */
	java.lang.String getIFrameUrl();
	
	
	/**
	 * 获取链接应用视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getLinkPSAppView();


	/**
	 * 获取链接应用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getLinkPSAppViewMust();
	
	
	/**
	 * 获取界面刷新触发表单项
	 * @return
	 */
	java.lang.String getRefreshItems();
}