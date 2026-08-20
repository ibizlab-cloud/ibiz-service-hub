package net.ibizsys.model.service.openapi;



/**
 *
 */
public interface IPSOpenAPI3Info extends net.ibizsys.model.service.openapi.IPSOpenAPI3Object{

	
	
	/**
	 * 获取版本
	 * @return
	 */
	String getAPIVersion();
	
	
	/**
	 * 获取服务条款路径
	 * @return
	 */
	String getTermsOfService();
	
	
	/**
	 * 获取抬头
	 * @return
	 */
	String getTitle();
}