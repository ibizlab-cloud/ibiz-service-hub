package net.ibizsys.model.service.openapi;



/**
 *
 */
public interface IPSOpenAPI3Parameter extends net.ibizsys.model.service.openapi.IPSOpenAPI3Object{

	
	
	/**
	 * 获取输入方式
	 * @return
	 */
	java.lang.String getIn();
	
	
	/**
	 * 获取是否必须输入
	 * @return
	 */
	boolean isRequired();
}