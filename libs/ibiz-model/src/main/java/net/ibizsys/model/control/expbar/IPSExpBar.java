package net.ibizsys.model.control.expbar;



/**
 * 导航栏模型基础对象接口
 *
 */
public interface IPSExpBar extends net.ibizsys.model.control.IPSAjaxControl
		,net.ibizsys.model.control.IPSControlContainer{

	
	
	/**
	 * 获取应用计数器引用
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef();


	/**
	 * 获取应用计数器引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust();
	
	
	/**
	 * 获取标题图标
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取标题图标，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取抬头
	 * @return
	 */
	java.lang.String getTitle();
	
	
	/**
	 * 获取抬头语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();


	/**
	 * 获取抬头语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取导航栏数据部件名称
	 * @return
	 */
	java.lang.String getXDataControlName();
	
	
	/**
	 * 获取是否支持计数器
	 * @return
	 */
	boolean isEnableCounter();
	
	
	/**
	 * 获取是否支持搜索
	 * @return
	 */
	boolean isEnableSearch();
	
	
	/**
	 * 获取是否显示标题栏
	 * @return
	 */
	boolean isShowTitleBar();
}