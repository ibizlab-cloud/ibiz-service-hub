package net.ibizsys.central.cloud.core.security;


public interface IAuthenticationUserRuntime {

	/**
	 * 设置机构用户上下文对象
	 * @param employeeContext
	 */
	void setEmployeeContext(IEmployeeContext employeeContext);
	
	
	/**
	 * 设置当前Token信息
	 * @param strToken
	 */
	void setToken(String strToken);
	
	
	/**
	 * 设置过期间隔
	 * @param nExpirein
	 */
	void setExpirein(int nExpirein);
	
	
	
	/**
	 * 设置刷新Token信息
	 * @param refreshtoken
	 */
	void setRefreshtoken(String refreshtoken);
	
	
	
	/**
	 * 设置授权范围
	 * @param scope
	 */
	void setScope(String scope);
}
