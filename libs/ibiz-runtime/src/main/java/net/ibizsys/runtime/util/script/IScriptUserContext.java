package net.ibizsys.runtime.util.script;

public interface IScriptUserContext extends IScriptUtil{

	/**
	 * 获取当前用户标识
	 * @return
	 */
	String getUserid();
	
	
	
	/**
	 * 获取当前用户名称
	 * @return
	 */
	String getUsername();
	
	
	/**
	 * 获取当前用户组织标识
	 * @return
	 */
	String getOrgid();
	
	
	
	/**
	 * 获取当前用户组织名称
	 * @return
	 */
	String getOrgname();
	
	
	/**
	 * 获取当前用户部门标识
	 * @return
	 */
	String getDeptid();
	
	
	
	/**
	 * 获取当前用户部门名称
	 * @return
	 */
	String getDeptname();
	
	
	/**
	 * 获取当前访问的远端地址
	 * @return
	 */
	String getRemoteaddress();
	
	
	/**
	 * 从当前用户会话获取指定键的值，键名常量在 net.ibizsys.runtime.security.UserSessionKeys 定义
	 * @param strKey
	 * @return
	 */
	Object session(String strKey);
}
