package net.ibizsys.model.res;



/**
 *
 */
public interface IPSSysI18N extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取系统语言资源集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSLanguageRes> getAllPSLanguageReses();
	
	/**
	 * 获取系统语言资源集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSLanguageRes getPSLanguageRes(Object objKey, boolean bTryMode);
	
	/**
	 * 设置系统语言资源集合
	 * @param list 系统语言资源集合
	 */
	void setPSLanguageRes(java.util.List<net.ibizsys.model.res.IPSLanguageRes> list);
	
	
	/**
	 * 获取系统语言集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysLan> getAllPSSysLans();
	
	/**
	 * 获取系统语言集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysLan getPSSysLan(Object objKey, boolean bTryMode);
	
	/**
	 * 设置系统语言集合
	 * @param list 系统语言集合
	 */
	void setPSSysLans(java.util.List<net.ibizsys.model.res.IPSSysLan> list);
}