package net.ibizsys.runtime.security;

/**
 * 系统用户角色默认模式
 * 
 * @author lionlau
 *
 */
public class SysUserRoleDefaultModes {

	/**
	 * 无，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String NONE = "NONE";
	/**
	 * 普通用户，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String USER = "USER";
	/**
	 * 管理员，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String ADMIN = "ADMIN";
	
	/**
	 * 授权访问用户，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String ACCESSUSER = "ACCESSUSER";
	/**
	 * 授权访问管理员，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String ACCESSADMIN = "ACCESSDMIN";
	

}
