package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSearchScheme extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取默认文档副本
	 * @return
	 */
	int getDefaultDocReplicas();
	
	
	/**
	 * 获取默认文档分片
	 * @return
	 */
	int getDefaultDocShards();
	
	
	/**
	 * 获取体系标记
	 * @return
	 */
	java.lang.String getSchemeTag();
	
	
	/**
	 * 获取体系标记2
	 * @return
	 */
	java.lang.String getSchemeTag2();
	
	
	/**
	 * 获取搜索引擎类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SearchEngineType}
	 * @return
	 */
	java.lang.String getSearchEngineType();
}