package net.ibizsys.central.cloud.core.cloudutil;

import net.ibizsys.central.cloud.core.util.domain.Department;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.Organization;

/**
 * 云体系组织功能组件接口
 * @author lionlau
 *
 */
public interface ICloudOUUtilRuntime extends ICloudUtilRuntime{

	/**
	 * 获取当前用户所在租户的全部组织
	 * @return
	 */
	java.util.Collection<Organization> getAllOrganizations();
	
	
	
	
	/**
	 * 获取当前机构用户所在租户的全部组织
	 * @return
	 */
	java.util.Collection<Department> getAllDepartments();
	
	
	
	/**
	 * 获取传入组织的全部部门
	 * @param strOrgId 
	 * @return
	 */
	java.util.Collection<Department> getDepartmentsByOrg(String strOrgId);
	
	
	/**
	 * 获取传入部门的子部门
	 * @param strDeptId
	 * @param  bRecursive 是否递归
	 * @return
	 */
	java.util.Collection<Department> getDepartmentsByDept(String strDeptId);
	
	
	
	/**
	 * 获取当前机构的全部人员
	 * @param strOrgId 
	 * @return
	 */
	java.util.Collection<Employee> getAllEmployees();
	
	
	/**
	 * 获取传入组织的全部人员
	 * @param strOrgId 
	 * @return
	 */
	java.util.Collection<Employee> getEmployeesByOrg(String strOrgId);
	
	
	/**
	 * 获取传入部门的全部人员
	 * @param strDeptId 
	 * @return
	 */
	java.util.Collection<Employee> getEmployeesByDept(String strDeptId);
	
	
	
	/**
	 * 获取指定部门
	 * @param strDeptId
	 * @return
	 */
	Department getDepartment(String strDeptId);
	
	
//	
//	
//	/**
//	 * 获取传入机构的父机构
//	 * @param strOrgId 机构标识
//	 * @return
//	 */
//	Organization getParentOrganizations(String strOrgId);
//	
//	
//	/**
//	 * 获取传入组织的子组织
//	 * @param strOrgId 组织标识
//	 * @return
//	 */
//	java.util.Collection<Organization> getSubOrganizations(String strOrgId);
	
}



