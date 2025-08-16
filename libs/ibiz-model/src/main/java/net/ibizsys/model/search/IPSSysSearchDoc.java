package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSysSearchDoc extends net.ibizsys.model.search.IPSSysSearchSchemeObject
		,net.ibizsys.model.search.IPSSearchDoc{

	
	
	/**
	 * 获取检索属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.search.IPSSysSearchField> getAllPSSysSearchFields();
	
	/**
	 * 获取检索属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.search.IPSSysSearchField getPSSysSearchField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置检索属性集合
	 * @param list 检索属性集合
	 */
	void setPSSysSearchFields(java.util.List<net.ibizsys.model.search.IPSSysSearchField> list);
}