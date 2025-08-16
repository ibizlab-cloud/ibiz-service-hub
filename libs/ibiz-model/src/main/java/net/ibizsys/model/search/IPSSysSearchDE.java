package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSysSearchDE extends net.ibizsys.model.search.IPSSearchDE
		,net.ibizsys.model.search.IPSSysSearchDocObject{

	
	
	/**
	 * 获取检索实体属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.search.IPSSysSearchDEField> getAllPSSysSearchDEFields();
	
	/**
	 * 获取检索实体属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.search.IPSSysSearchDEField getPSSysSearchDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置检索实体属性集合
	 * @param list 检索实体属性集合
	 */
	void setPSSysSearchDEFields(java.util.List<net.ibizsys.model.search.IPSSysSearchDEField> list);
}