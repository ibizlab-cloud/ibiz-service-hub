package net.ibizsys.model.security;



/**
 * 系统用户角色数据能力模型对象接口
 *
 */
public interface IPSSysUserRoleData extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取实体能力角色
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEUserRole getPSDEUserRole();


	/**
	 * 获取实体能力角色，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEUserRole getPSDEUserRoleMust();
	
	
	/**
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
}