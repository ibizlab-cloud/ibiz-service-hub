package net.ibizsys.central.security;

import java.util.Map;

/**
 * 用户上下文运行时对象
 * @author lionlau
 *
 */
public interface IUserContextRuntime {


	/**
	 *  设置当前用户标识
	 * @param userid
	 */
	void setUserid(String userid);
	
	
	
	
	/**
	 * 设置当前用户名称
	 * @param username
	 */
	void setUsername(String username);
	
	
	/**
	 * 设置当前用户代码
	 * @param username
	 */
	void setUsercode(String usercode);
	

	/**
	 * 设置当前用户组织标识
	 * @param orgid
	 */
	void setOrgid(String orgid);
	
	
	
	/**
	 * 设置当前用户组织名称
	 * @param orgname
	 */
	void setOrgname(String orgname);

	
	/**
	 * 设置当前用户部门标识
	 * @param deptid
	 */
	void setDeptid(String deptid);
	
	
	
	/**
	 * 设置当前用户部门名称
	 * @param deptname
	 */
	void setDeptname(String deptname);
	
	
	/**
	 * 设置组织代码
	 * @param orgcode
	 */
	void setOrgcode(String orgcode);

	/**
	 * 设置部门代码
	 * @param orgcode
	 */
	void setDeptcode(String deptcode);
	
	
	/**
	 * 设置当前访问的远端地址
	 * @param remoteaddress
	 */
	void setRemoteaddress(String remoteaddress);
	
	
	
	/**
	 * 设置是否为超级用户
	 * @param superuser
	 * @return
	 */
	void setSuperuser(boolean superuser);
	

	/**
	 * 设置是否为当前系统管理员
	 * @param systemadmin
	 * @return
	 */
	void setSystemadmin(boolean systemadmin);
	
	
	/**
	 * 设置用户租户
	 * @param tenant
	 */
	void setTenant(String tenant);
	
	
	/**
	 * 设置用户当前的默认动态实例标识
	 * @param dynainstid	 
	 */
	void setDynainstid(String dynainstid);
	
	
	
	/**
	 * 设置用户当前的默认动态实例标识，仅用于设置草稿或是新建时
	 * 
	 * @param dynainsttag
	 */
	void setDynainsttag(String dynainsttag);
	

	/**
	 *  设置用户当前的操作的动态实例标记2，仅用于设置草稿或是新建时
	 * 
	 * @param dynainsttag2
	 */
	void setDynainsttag2(String dynainsttag2);
	
	
	
	/**
	 * 获取会话参数集合
	 * @return
	 */
	Map<String, Object> getSessionParams();
	
	/**
	 * 设置上级机构集合
	 * @param porg
	 */
	void setPorg(String porg);

	/**
	 * 设置下级机构集合
	 * @param porg
	 */
	void setSorg(String sorg);

	/**
	 * 设置上级部门集合
	 * @param porg
	 */
	void setPdept(String pdept);

	/**
	 * 设置下家部门集合
	 * @param porg
	 */
	void setSdept(String sdept);

	
//	/**
//	 * 设置系统标识
//	 * @param systemid
//	 */
//	void setSystemid(String systemid);
	/**
	 * 设置是否匿名用户
	 * @param anonymoususer
	 */
	void setAnonymoususer(boolean anonymoususer);
} 
