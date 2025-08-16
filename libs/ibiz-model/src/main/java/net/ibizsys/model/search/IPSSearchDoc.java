package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSearchDoc extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CODENAME}
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DOCPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getDocParams();
	
	
	/**
	 * 获取文档标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DOCTAG}
	 * @return
	 */
	java.lang.String getDocTag();
	
	
	/**
	 * 获取文档标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DOCTAG2}
	 * @return
	 */
	java.lang.String getDocTag2();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取副本数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_REPLICAS}
	 * @return
	 */
	int getReplicas();
	
	
	/**
	 * 获取分片数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SHARDS}
	 * @return
	 */
	int getShards();
}