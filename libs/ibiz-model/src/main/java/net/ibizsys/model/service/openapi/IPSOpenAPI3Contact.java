package net.ibizsys.model.service.openapi;



/**
 *
 */
public interface IPSOpenAPI3Contact extends net.ibizsys.model.service.openapi.IPSOpenAPI3Object{

	
	
	/**
	 * 获取联系人电子邮件地址
	 * @return
	 */
	String getEmail();
	
	
	/**
	 * 获取联系人URL地址
	 * @return
	 */
	String getUrl();
}