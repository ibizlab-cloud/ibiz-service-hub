package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSysSearchDEField extends net.ibizsys.model.search.IPSSearchDEField
		,net.ibizsys.model.search.IPSSysSearchDEObject{

	
	
	/**
	 * 获取检索文档属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSSEARCHFIELDID}
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchField getPSSysSearchField();


	/**
	 * 获取检索文档属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchField getPSSysSearchFieldMust();
}