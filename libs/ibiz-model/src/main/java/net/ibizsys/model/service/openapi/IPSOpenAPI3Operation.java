package net.ibizsys.model.service.openapi;



/**
 *
 */
public interface IPSOpenAPI3Operation extends net.ibizsys.model.service.openapi.IPSOpenAPI3Object{

	
	
	/**
	 * 获取操作标识
	 * @return
	 */
	String getOperationId();
	
	
	/**
	 * 获取操作摘要
	 * @return
	 */
	String getSummary();
}