package net.ibizsys.model.dataentity.priv;



/**
 * 实体操作标识模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO}运行时对象
 *
 */
public interface IPSDEOPPriv extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO#FIELD_LOGICNAME}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO#FIELD_MAPPSDEOPPRIVNAME}
	 * @return
	 */
	java.lang.String getMapPSDEOPPrivName();
	
	
	/**
	 * 获取映射关系对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO#FIELD_PSDERID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO#FIELD_PSSYSUNIRESID}
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
	 * 获取是否映射系统统一资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO#FIELD_MAPSYSUNIRESMODE}
	 * @return
	 */
	boolean isMapSysUniRes();
	
	
	/**
	 * 获取是否系统保留
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO#FIELD_SYSTEMFLAG}
	 * @return
	 */
	boolean isSystemReserved();
}