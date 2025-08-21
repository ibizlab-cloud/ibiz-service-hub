package net.ibizsys.model.app;



/**
 * 应用语言模型对象接口
 *
 */
public interface IPSAppLan extends net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取语言资源项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSLanguageItem> getAllPSLanguageItems();
	
	/**
	 * 获取语言资源项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSLanguageItem getPSLanguageItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置语言资源项集合
	 * @param list 语言资源项集合
	 */
	void setPSLanguageItems(java.util.List<net.ibizsys.model.res.IPSLanguageItem> list);
	
	
	/**
	 * 获取语言
	 * @return
	 */
	java.lang.String getLanguage();
}