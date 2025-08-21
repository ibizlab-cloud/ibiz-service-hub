package net.ibizsys.model.dataentity.der;



/**
 * 实体聚合数据关系属性映射模型对象接口
 *
 */
public interface IPSDERAggDataDEFieldMap extends net.ibizsys.model.dataentity.der.IPSDERDEFieldMap{

	
	
	/**
	 * 获取钻取条件格式
	 * @return
	 */
	java.lang.String getDrillDownCondFormat();
	
	
	/**
	 * 获取公式列格式
	 * @return
	 */
	java.lang.String getFormulaFormat();
	
	
	/**
	 * 获取映射类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DERAggDataDEFMapType}
	 * @return
	 */
	java.lang.String getMapType();
	
	
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