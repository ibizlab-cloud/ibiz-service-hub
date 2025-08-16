package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSysSearchDocObject extends net.ibizsys.model.search.IPSSearchDocObject
		,net.ibizsys.model.search.IPSSysSearchSchemeObject{

	
	
	/**
	 * 获取全文检索文档
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDoc();


	/**
	 * 获取全文检索文档，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDocMust();
}