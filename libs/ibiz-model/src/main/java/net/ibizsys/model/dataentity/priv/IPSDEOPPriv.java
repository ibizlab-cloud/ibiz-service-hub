package net.ibizsys.model.dataentity.priv;



/**
 * 实体操作标识模型对象接口
 *
 */
public interface IPSDEOPPriv extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取映射实体名称，等同{@link #getMapPSDER}.getMajorDEName()
	 * @return
	 */
	java.lang.String getMapPSDEName();
	
	
	/**
	 * 获取映射实体操作标识
	 * @return
	 */
	java.lang.String getMapPSDEOPPrivName();
	
	
	/**
	 * 获取映射关系对象
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getMapPSDER();


	/**
	 * 获取映射关系对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getMapPSDERMust();
	
	
	/**
	 * 获取映射实体对象，等同{@link #getMapPSDER}.getMajorPSDataEntity()
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getMapPSDataEntity();


	/**
	 * 获取映射实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getMapPSDataEntityMust();
	
	
	/**
	 * 获取系统统一资源
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getMapPSSysUniRes();


	/**
	 * 获取系统统一资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getMapPSSysUniResMust();
	
	
	/**
	 * 获取统一资源代码，等同{@link #getMapPSSysUniRes}.getResCode()
	 * @return
	 */
	java.lang.String getMapSysUniResCode();
	
	
	/**
	 * 获取操作标识类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEOPPrivType}
	 * @return
	 */
	java.lang.String getOPPrivType();
	
	
	/**
	 * 获取属性组
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroup();


	/**
	 * 获取属性组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroupMust();
	
	
	/**
	 * 获取是否映射系统统一资源
	 * @return
	 */
	boolean isMapSysUniRes();
	
	
	/**
	 * 获取是否系统保留
	 * @return
	 */
	boolean isSystemReserved();
}