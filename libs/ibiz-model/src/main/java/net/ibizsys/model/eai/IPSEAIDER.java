package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSEAIDER extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.eai.IPSEAIDEObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取实体关系映射标记
	 * @return
	 */
	java.lang.String getDERTag();
	
	
	/**
	 * 获取实体关系映射标记2
	 * @return
	 */
	java.lang.String getDERTag2();
	
	
	/**
	 * 获取实体关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDER();


	/**
	 * 获取实体关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust();
}