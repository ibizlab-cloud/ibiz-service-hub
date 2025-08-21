package net.ibizsys.model.dataentity.priv;



/**
 * 实体用户角色模型对象接口
 *
 */
public interface IPSDEUserRole extends net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.dataentity.priv.IPSDEDataRange{

	
	
	/**
	 * 获取自定义条件
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取实体数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取授权操作标识集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv> getPSDEUserRoleOPPrivs();
	
	/**
	 * 获取授权操作标识集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv getPSDEUserRoleOPPriv(Object objKey, boolean bTryMode);
	
	/**
	 * 设置授权操作标识集合
	 * @param list 授权操作标识集合
	 */
	void setPSDEUserRoleOPPrivs(java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv> list);
	
	
	/**
	 * 获取用户数据范围对象
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR();


	/**
	 * 获取用户数据范围对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDRMust();
	
	
	/**
	 * 获取用户数据范围对象2
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2();


	/**
	 * 获取用户数据范围对象2，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2Must();
	
	
	/**
	 * 获取角色标记
	 * @return
	 */
	java.lang.String getRoleTag();
	
	
	/**
	 * 获取是否全部数据
	 * @return
	 */
	boolean isAllData();
	
	
	/**
	 * 获取是否默认角色
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否系统保留
	 * @return
	 */
	boolean isSystemReserved();
}