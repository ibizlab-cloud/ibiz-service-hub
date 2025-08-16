package net.ibizsys.central.cloud.ou.core.cloudutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOUUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.Department;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.Organization;
import net.ibizsys.central.cloud.ou.core.util.domain.DeptModel;
import net.ibizsys.central.cloud.ou.core.util.domain.OrgModel;
import net.ibizsys.central.util.CacheableActionBuilder;
import net.ibizsys.runtime.util.IAction;

public abstract class CloudOUUtilRuntimeBase  extends CloudUtilRuntimeBase implements ICloudOUUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudOUUtilRuntimeBase.class);

	@Override
	public Collection<Organization> getAllOrganizations() {
		return this.executeAction("获取机构全部组织", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAllOrganizations();
			}
		}, null, OrganizationListType);
	}

	protected Collection<Organization> onGetAllOrganizations() throws Throwable{
		return this.getCloudSaaSUtilRuntime().getAllOrganizations();
	}
	
	@Override
	public Collection<Department> getAllDepartments() {
		return this.executeAction("获取机构全部部门", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAllDepartments();
			}
		}, null, DepartmentListType);
	}
	
	protected Collection<Department> onGetAllDepartments() throws Throwable{
		return this.getCloudSaaSUtilRuntime().getAllDepartments();
	}
	
	@Override
	public Collection<Department> getDepartmentsByOrg(String strOrgId) {
		return this.executeAction("获取组织全部部门", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetDepartmentsByOrg(strOrgId);
			}
		}, null, DepartmentListType);
	}
	
	protected Collection<Department> onGetDepartmentsByOrg(String strOrgId) throws Throwable{
		return this.getCloudSaaSUtilRuntime().getDepartmentsByOrg(strOrgId);
	}
	
	
	@Override
	public Collection<Employee> getAllEmployees() {
		return this.executeAction("获取机构全部人员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAllEmployees();
			}
		}, null, EmployeeListType);
	}
	
	protected Collection<Employee> onGetAllEmployees() throws Throwable{
		return this.getCloudSaaSUtilRuntime().getAllEmployees();
	}
	
	

	@Override
	public Collection<Department> getDepartmentsByDept(String strDeptId) {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		return this.executeAction("获取部门子部门", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Department.class.getSimpleName()))
						.tags("ouutil", "dept", strDeptId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetDepartmentsByDept(strDeptId);
							}
						}).build().get(DepartmentListType);
				
			}
		}, null, DepartmentListType);
	}

	protected Collection<Department> onGetDepartmentsByDept(String strDeptId) throws Throwable{
		List<Department> list = new ArrayList<Department>();
		Collection<Department> departments = this.getAllDepartments();
		if(!ObjectUtils.isEmpty(departments)) {
			for(Department department : departments) {
				if(strDeptId.equals(department.getParentDeptId())) {
					list.add(department);
					continue;
				}
			}
		}
		return list;
	}
	
	
	
	@Override
	public Collection<Employee> getEmployeesByOrg(String strOrgId) {
		return this.executeAction("获取组织全部人员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetEmployeesByOrg(strOrgId);
			}
		}, null, EmployeeListType);
	}
	
	protected Collection<Employee> onGetEmployeesByOrg(String strOrgId) throws Throwable{
		return this.getCloudSaaSUtilRuntime().getEmployeesByOrg(strOrgId);
	}
	

	@Override
	public Collection<Employee> getEmployeesByDept(String strDeptId) {
		return this.executeAction("获取部门全部人员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetEmployeesByDept(strDeptId);
			}
		}, null, EmployeeListType);
	}
	
	protected Collection<Employee> onGetEmployeesByDept(String strDeptId) throws Throwable{
		return this.getCloudSaaSUtilRuntime().getEmployeesByDept(strDeptId);
	}
	
	@Override
	public Department getDepartment(String strDeptId) {
		return this.executeAction("获取部门", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetDepartment(strDeptId);
			}
		}, null, Department.class);
	}
	
	protected Department onGetDepartment(String strDeptId) throws Throwable{
		return this.getCloudSaaSUtilRuntime().getDepartment(strDeptId);
	}
	

	public OrgModel getOrgModel(String strOrgId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		return this.executeAction("获取机构模型", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Organization.class.getSimpleName()))
						.tags("model", strOrgId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetOrgModel(strOrgId);
							}
						}).build().get(OrgModel.class);
			}
		}, null, OrgModel.class);
	}
	
	protected OrgModel onGetOrgModel(String strOrgId) throws Throwable{
		
		Map<String, Organization> organizationMap = new HashMap<String, Organization>();
		Collection<Organization> organizations = this.getAllOrganizations();
		if(!ObjectUtils.isEmpty(organizations)) {
			organizations.forEach(t -> {
				organizationMap.put(t.getOrgId(), t);
			});
		}
		
		Organization organization = organizationMap.get(strOrgId);
		if(organization == null) {
			throw new Exception(String.format("无法获取指定机构[%1$s]", strOrgId));
		}
		
		OrgModel orgModel = new OrgModel();
		orgModel.setOrganization(organization);
		
		//勾结全部上级及下级组织
		fillOrgModelSubOrgIds(organization.getOrgId(), orgModel, organizationMap);
		fillOrgModelSuperOrgIds(organization.getOrgId(), orgModel, organizationMap);
		
		return orgModel;
	}
	
	protected void fillOrgModelSubOrgIds(String strOrgId, OrgModel orgModel, Map<String, Organization> organizationMap) {
		for(Organization organization : organizationMap.values()) {
			if(strOrgId.equals(organization.getParentOrgId())) {
				if(orgModel.getSubOrgIds().add(organization.getOrgId())) {
					this.fillOrgModelSubOrgIds(organization.getOrgId(), orgModel, organizationMap);
				}
			}
		}
		
	}
	
	protected void fillOrgModelSuperOrgIds(String strOrgId, OrgModel orgModel, Map<String, Organization> organizationMap) {
		
		Organization organization = organizationMap.get(strOrgId);
		if(organization == null) {
			return;
		}
		
		String strParentOrgId = organization.getParentOrgId();
		if(!StringUtils.hasLength(strParentOrgId)) {
			return;
		}
		
		if(orgModel.getSuperOrgIds().add(strParentOrgId)) {
			this.fillOrgModelSuperOrgIds(strParentOrgId, orgModel, organizationMap);
		}
	}
	
	
	public DeptModel getDeptModel(String strDeptId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		return this.executeAction("获取部门模型", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Department.class.getSimpleName()))
						.tags("model", strDeptId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetDeptModel(strDeptId);
							}
						}).build().get(DeptModel.class);
			}
		}, null, DeptModel.class);
	}
	
	protected DeptModel onGetDeptModel(String strDeptId) throws Throwable{
		
		Map<String, Department> departmentMap = new HashMap<String, Department>();
		Collection<Department> departments = this.getAllDepartments();
		if(!ObjectUtils.isEmpty(departments)) {
			departments.forEach(t -> {
				departmentMap.put(t.getDeptId(), t);
			});
		}
		
		Department department = departmentMap.get(strDeptId);
		if(department == null) {
			throw new Exception(String.format("无法获取指定部门[%1$s]", strDeptId));
		}
		
		DeptModel deptModel = new DeptModel();
		deptModel.setDepartment(department);
		
		//勾结全部上级及下级部门（非条线）
		fillDeptModelSubDeptIds(department.getDeptId(), deptModel, departmentMap);
		fillDeptModelSuperDeptIds(department.getDeptId(), deptModel, departmentMap);
		
		return deptModel;
	}
	
	protected void fillDeptModelSubDeptIds(String strDeptId, DeptModel deptModel, Map<String, Department> departmentMap) {
		for(Department department : departmentMap.values()) {
			if(strDeptId.equals(department.getParentDeptId())) {
				if(deptModel.getSubDeptIds().add(department.getDeptId())) {
					this.fillDeptModelSubDeptIds(department.getDeptId(), deptModel, departmentMap);
				}
			}
		}
		
	}
	
	protected void fillDeptModelSuperDeptIds(String strDeptId, DeptModel deptModel, Map<String, Department> departmentMap) {
		
		Department department = departmentMap.get(strDeptId);
		if(department == null) {
			return;
		}
		
		String strParentDeptId = department.getParentDeptId();
		if(!StringUtils.hasLength(strParentDeptId)) {
			return;
		}
		
		if(deptModel.getSuperDeptIds().add(strParentDeptId)) {
			this.fillDeptModelSuperDeptIds(strParentDeptId, deptModel, departmentMap);
		}
	}
	
}
