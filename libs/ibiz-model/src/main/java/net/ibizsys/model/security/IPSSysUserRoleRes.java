package net.ibizsys.model.security;



/**
 * 系统用户角色资源能力模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysUserRoleResDTO}运行时对象
 *
 */
public interface IPSSysUserRoleRes extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取系统统一资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUserRoleResDTO#FIELD_PSSYSUNIRESID}
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes();


	/**
	 * 获取系统统一资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust();
	
	
	/**
	 * 获取系统统一资源代码，来自{@link #getPSSysUniRes}.{@link net.ibizsys.model.security.IPSSysUniRes#getResCode}
	 * @return
	 */
	java.lang.String getSysUniResCode();
}