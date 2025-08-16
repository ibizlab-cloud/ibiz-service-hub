package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSEAIDE extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取映射实体标记
	 * @return
	 */
	java.lang.String getDETag();
	
	
	/**
	 * 获取映射实体标记2
	 * @return
	 */
	java.lang.String getDETag2();
	
	
	/**
	 * 获取实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
}