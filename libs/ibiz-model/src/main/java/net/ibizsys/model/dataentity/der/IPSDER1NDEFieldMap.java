package net.ibizsys.model.dataentity.der;



/**
 * 实体1：N关系属性映射模型对象接口
 *
 */
public interface IPSDER1NDEFieldMap extends net.ibizsys.model.dataentity.der.IPSDERDEFieldMap{

	
	
	/**
	 * 获取映射类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DER1NDEFMapType}
	 * @return
	 */
	java.lang.String getMapType();
	
	
	/**
	 * 获取从实体数据查询
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getMinorPSDEDataQuery();


	/**
	 * 获取从实体数据查询，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getMinorPSDEDataQueryMust();
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
}