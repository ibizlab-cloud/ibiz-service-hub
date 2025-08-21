package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSearchDoc extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getDocParams();
	
	
	/**
	 * 获取文档标记
	 * @return
	 */
	java.lang.String getDocTag();
	
	
	/**
	 * 获取文档标记2
	 * @return
	 */
	java.lang.String getDocTag2();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取副本数
	 * @return
	 */
	int getReplicas();
	
	
	/**
	 * 获取分片数
	 * @return
	 */
	int getShards();
}