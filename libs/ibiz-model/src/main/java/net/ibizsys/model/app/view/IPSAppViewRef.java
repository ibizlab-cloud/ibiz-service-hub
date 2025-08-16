package net.ibizsys.model.app.view;



/**
 * 应用视图引用模型对象接口
 *
 */
public interface IPSAppViewRef extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取引用视图高度
	 * @return
	 */
	int getHeight();
	
	
	/**
	 * 获取打开模式
	 * @return
	 */
	java.lang.String getOpenMode();
	
	
	/**
	 * 获取引用者
	 * @return
	 */
	java.lang.Object getOwner();
	
	
	/**
	 * 获取视图父数据对象
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getParentDataJO();
	
	
	/**
	 * 获取引用视图打开模式
	 * @return
	 */
	java.lang.String getRealOpenMode();
	
	
	/**
	 * 获取引用视图标题
	 * @return
	 */
	java.lang.String getRealTitle();
	
	
	/**
	 * 获取引用视图标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getRealTitlePSLanguageRes();


	/**
	 * 获取引用视图标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getRealTitlePSLanguageResMust();
	
	
	/**
	 * 获取引用视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getRefPSAppView();


	/**
	 * 获取引用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getRefPSAppViewMust();
	
	
	/**
	 * 获取视图参数JO对象
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getViewParamJO();
	
	
	/**
	 * 获取引用视图宽度
	 * @return
	 */
	int getWidth();
}