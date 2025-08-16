package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.util.domain.Department;
import net.ibizsys.central.cloud.core.util.domain.Organization;

/**
 * 系统组织功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysOUUtilRuntime extends net.ibizsys.central.sysutil.ISysUtilRuntime{

	/**
	 * 获取当前机构用户所在租户的全部组织
	 * @return
	 */
	java.util.Collection<Organization> getAllOrganizations();
	
	
	
	
	/**
	 * 获取当前机构用户所在租户的全部组织
	 * @return
	 */
	java.util.Collection<Department> getAllDepartments();
	
	
}
