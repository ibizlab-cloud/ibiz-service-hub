package net.ibizsys.central.cloud.saas.ebsx.cloudutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.IUAAGrantedAuthority;
import net.ibizsys.central.cloud.core.security.UAADEAuthority;
import net.ibizsys.central.cloud.core.security.UAARoleAuthority;
import net.ibizsys.central.cloud.core.security.UAAUniResAuthority;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.Application;
import net.ibizsys.central.cloud.core.util.domain.CodeItem;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.cloud.core.util.domain.Config;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.DepCenter;
import net.ibizsys.central.cloud.core.util.domain.Department;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MetaDynaModel;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.core.util.domain.OrgSystem;
import net.ibizsys.central.cloud.core.util.domain.Organization;
import net.ibizsys.central.cloud.core.util.domain.PermissionType;
import net.ibizsys.central.cloud.core.util.domain.Role;
import net.ibizsys.central.cloud.core.util.domain.SysAudit;
import net.ibizsys.central.cloud.core.util.domain.SysEvent;
import net.ibizsys.central.cloud.core.util.domain.SysLog;
import net.ibizsys.central.cloud.core.util.domain.SysPO;
import net.ibizsys.central.cloud.core.util.domain.User;
import net.ibizsys.central.cloud.core.util.domain.UserRole;
import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFGroup;
import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.cloud.saas.core.cloudutil.CloudSaaSUtilRuntimeBase;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.dto.DictCatalogDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.dto.DictOptionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.IDictCatalogService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.IDictOptionService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.disk.dto.SDFileDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.DstConfigDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDynaModelDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaDynaModelService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.log.dto.SysAuditDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.log.dto.SysEventDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.log.dto.SysLogDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.log.dto.SysPODTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgTemplateDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.DepartmentDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.EmployeeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.OrganizationDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IEmployeeService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.ApplicationDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.AuthLogDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.CenterDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DCEmployeeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DCSystemDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OpenAccessDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OpenUserDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.PermissionActionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.PermissionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.RoleDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.RolePermissionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.SystemDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserRoleDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IAuthLogService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCEmployeeService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenUserService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IRoleService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserRoleService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFDefinitionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFGroupDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFInstanceDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFMemberDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFDefinitionService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFMemberService;
import net.ibizsys.central.cloud.saas.ebsx.util.StaticDict;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.central.util.UserContextActionBuilder;
import net.ibizsys.runtime.security.SysUserRoleDefaultModes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.domain.File;
import net.ibizsys.runtime.util.domain.Log;
import net.ibizsys.runtime.util.domain.LogTypes;

public class EBSXCloudSaaSUtilRuntime extends CloudSaaSUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(EBSXCloudSaaSUtilRuntime.class);

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
	}

//	protected DCSystemDTO getDCSystemDTO(String strDCSystemId) throws Throwable {
//		String strEmployeeCacheTag = String.format("saas-dcsystemdto-%1$s", strDCSystemId);
//		DCSystemDTO dcSystemDTO = this.getSysCacheUtilRuntime(false).get(strEmployeeCacheTag, DCSystemDTO.class);
//		if (dcSystemDTO == null) {
//			dcSystemDTO = EBSXSystemRuntime.getInstance().getDCSystemService().get(strDCSystemId);
//			this.getSysCacheUtilRuntime(false).set(strEmployeeCacheTag, dcSystemDTO);
//		}
//		return dcSystemDTO;
//	}
//
//	protected DCSystemDTO getDCSystemDTO() throws Throwable {
//		IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
//		return this.getDCSystemDTO(employeeContext.getSystemid(), employeeContext.getTenant(), employeeContext.getOrgid());
//	}
//
//	protected DCSystemDTO getDCSystemDTO(String strSystemId, String strDCId, String strOrgId) throws Throwable {
//		String strEmployeeCacheTag = String.format("saas-dcsystemdto-%1$s-%2$s", strSystemId, strOrgId);
//		DCSystemDTO dcSystemDTO = this.getSysCacheUtilRuntime(false).get(strEmployeeCacheTag, DCSystemDTO.class);
//		if (dcSystemDTO == null) {
//
//			SearchContextDTO searchContextDTO = new SearchContextDTO();
//			searchContextDTO.eq(IDCSystemService.FIELD_SRFDCID, strDCId).eq(IDCSystemService.FIELD_SYSTEMID, strSystemId);
//
//			dcSystemDTO = EBSXSystemRuntime.getInstance().getDCSystemService().selectOne(searchContextDTO, false);
//			this.getSysCacheUtilRuntime(false).set(strEmployeeCacheTag, dcSystemDTO);
//		}
//		return dcSystemDTO;
//	}

	@Override
	protected Employee onGetEmployeeByDC(IAuthenticationUser iAuthenticationUser, String strDCId, String strSystemId) throws Throwable {

		IDCEmployeeService iDCEmployeeService = EBSXSystemRuntime.getInstance().getDCEmployeeService();

		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.eq(IDCEmployeeService.FIELD_UAAUSERID, iAuthenticationUser.getUserid()).eq(IDCEmployeeService.FIELD_SRFDCID, strDCId);

		DCEmployeeDTO dcEmployeeDTO = iDCEmployeeService.selectOne(searchContextDTO, true);
		if (dcEmployeeDTO == null) {
			throw new UsernameNotFoundException(String.format("无法获取指定机构用户"));
		}

		Employee employee = new Employee();
		dcEmployeeDTO.copyTo(employee, true);

		if(StringUtils.hasLength(strSystemId)) {
			DCSystem dcSystem = getDCSystem(strSystemId, dcEmployeeDTO.getSrfdcid());
			employee.setDCSystemId(dcSystem.getDCSystemId());
		}

		// 补充其它信息
		this.fillEmployee(employee, dcEmployeeDTO, strSystemId);

		return employee;

	}

	@Override
	protected Employee onGetEmployee(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId) throws Throwable {

		IDCEmployeeService iDCEmployeeService = EBSXSystemRuntime.getInstance().getDCEmployeeService();

		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.eq(IDCEmployeeService.FIELD_UAAUSERID, iAuthenticationUser.getUserid()).eq(IDCEmployeeService.FIELD_ORGID, strOrgId);

		DCEmployeeDTO dcEmployeeDTO = iDCEmployeeService.selectOne(searchContextDTO, true);
		if (dcEmployeeDTO == null) {
			throw new UsernameNotFoundException(String.format("无法获取指定机构用户"));
		}

		//DCSystemDTO dcSystemDTO = getDCSystemDTO(strSystemId, dcEmployeeDTO.getSrfdcid(), strOrgId);
		DCSystem dcSystem = getDCSystem(strSystemId, dcEmployeeDTO.getSrfdcid());

		Employee employee = new Employee();
		dcEmployeeDTO.copyTo(employee, true);

		// 补充其它信息
		employee.setDCSystemId(dcSystem.getDCSystemId());

		this.fillEmployee(employee, dcEmployeeDTO, strSystemId);

		return employee;
	}

	/**
	 *
	 * @param employee
	 * @param dcEmployeeDTO
	 * @param strSystemId
	 * @throws Throwable
	 */
	protected void fillEmployee(Employee employee, DCEmployeeDTO dcEmployeeDTO, String strSystemId) throws Throwable {
		//进入租户状态
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			EmployeeContext.setCurrent(new EmployeeContext(employee, null, strSystemId));


			if(!StringUtils.hasLength(employee.getMqttTopic()) && StringUtils.hasLength(strSystemId)) {
				employee.setMqttTopic(this.getPortalMqttTopic(employee, strSystemId));
			}


			//计算是否为系统管理员
			if(!DataTypeUtils.getBooleanValue(employee.getSuperUser(), false)) {

				SearchContextDTO userRoleFilter = new SearchContextDTO().limit(1).count(false)
						.eq(IUserRoleService.FIELD_USERID, dcEmployeeDTO.getUserId())
						.eq(IUserRoleService.FIELD_DCSYSTEMID, employee.getDCSystemId())
						.eq(IUserRoleService.FIELD_USERMODE, SysUserRoleDefaultModes.ACCESSADMIN);

				Page <UserRoleDTO> page2 = EBSXSystemRuntime.getInstance().getUserRoleService().fetchDefault(userRoleFilter);
				if(!ObjectUtils.isEmpty(page2) && !ObjectUtils.isEmpty(page2.getContent())) {
					//设置为管理员
					employee.setSuperUser(EntityBase.BOOLEAN_TRUE);
				}
			}


			//填充机构及部门集合
			if(StringUtils.hasLength(dcEmployeeDTO.getMDeptId())) {
				Collection<Department> departments = this.getAllDepartments();
				if(!ObjectUtils.isEmpty(departments)) {
					Map<String, Department> departmentMap = new HashMap<String, Department>();
					departments.forEach(t -> {
						departmentMap.put(t.getDeptId(), t);
					});

					Set<String> pDeptIds = this.getPDeptIds(dcEmployeeDTO.getMDeptId(), departmentMap, null);
					if(!ObjectUtils.isEmpty(pDeptIds)) {
						employee.setPDeptIds(StringUtils.collectionToDelimitedString(pDeptIds, ","));
					}

					Set<String> sDeptIds = this.getSDeptIds(dcEmployeeDTO.getMDeptId(), departmentMap, null);
					if(!ObjectUtils.isEmpty(sDeptIds)) {
						employee.setSDeptIds(StringUtils.collectionToDelimitedString(sDeptIds, ","));
					}
				}
			}


			if(StringUtils.hasLength(dcEmployeeDTO.getOrgId())) {
				Collection<Organization> organizations = this.getAllOrganizations();
				if(!ObjectUtils.isEmpty(organizations)) {
					Map<String, Organization> organizationMap = new HashMap<String, Organization>();
					organizations.forEach(t -> {
						organizationMap.put(t.getOrgId(), t);
					});

					Set<String> pOrgIds = this.getPOrgIds(dcEmployeeDTO.getOrgId(), organizationMap, null);
					if(!ObjectUtils.isEmpty(pOrgIds)) {
						employee.setPOrgIds(StringUtils.collectionToDelimitedString(pOrgIds, ","));
					}

					Set<String> sOrgIds = this.getSOrgIds(dcEmployeeDTO.getOrgId(), organizationMap, null);
					if(!ObjectUtils.isEmpty(sOrgIds)) {
						employee.setSOrgIds(StringUtils.collectionToDelimitedString(sOrgIds, ","));
					}
				}
			}

		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}


	}

	protected Set<String> getPDeptIds(String strDeptId, Map<String, Department> departmentMap, Set<String> deptids) {
		if(deptids == null) {
			deptids = new HashSet<String>();
		}

		Department department = departmentMap.get(strDeptId);
		if(department == null) {
			log.warn(String.format("无法获取指定组织部门[%1$s]", strDeptId));
			return deptids;
		}

		String strPDeptId = department.getParentDeptId();
		if(StringUtils.hasLength(strPDeptId)) {
			if(!deptids.contains(strPDeptId)) {
				deptids.add(strPDeptId);
				return this.getPDeptIds(strPDeptId, departmentMap, deptids);
			}
		}

		return deptids;
	}

	protected Set<String> getSDeptIds(String strDeptId, Map<String, Department> departmentMap, Set<String> deptids2) {
		if(deptids2 == null) {
			deptids2 = new HashSet<String>();
		}
		final Set<String> deptids = deptids2;
		departmentMap.forEach((k,v) -> {
			if(strDeptId.equals(v.getParentDeptId())){
				String strSDeptId = v.getDeptId();
				if(!deptids.contains(strSDeptId)) {
					deptids.add(strSDeptId);
					getSDeptIds(strSDeptId, departmentMap, deptids);
				}
			}
		});
		return deptids;
	}

	protected Set<String> getPOrgIds(String strOrgId, Map<String, Organization> orgMap, Set<String> orgids) {
		if(orgids == null) {
			orgids = new HashSet<String>();
		}

		Organization organization = orgMap.get(strOrgId);
		if(organization == null) {
			log.warn(String.format("无法获取指定组织部门[%1$s]", strOrgId));
			return orgids;
		}

		String strPOrgId = organization.getParentOrgId();
		if(StringUtils.hasLength(strPOrgId)) {
			if(!orgids.contains(strPOrgId)) {
				orgids.add(strPOrgId);
				return this.getPOrgIds(strPOrgId, orgMap, orgids);
			}
		}

		return orgids;
	}

	protected Set<String> getSOrgIds(String strOrgId, Map<String, Organization> orgMap, Set<String> orgids2) {
		if(orgids2 == null) {
			orgids2 = new HashSet<String>();
		}
		final Set<String> orgids = orgids2;
		orgMap.forEach((k,v) -> {
			if(strOrgId.equals(v.getParentOrgId())){
				String strSOrgId = v.getOrgId();
				if(!orgids.contains(strSOrgId)) {
					orgids.add(strSOrgId);
					getSOrgIds(strSOrgId, orgMap, orgids);
				}
			}
		});
		return orgids;
	}

	@Override
	protected Employee onGetEmployee(String id) throws Throwable {

		EmployeeDTO employeeDTO = EBSXSystemRuntime.getInstance().getEmployeeService().get(id);

		Employee employee = new Employee();
		employee.putAll(employeeDTO.any());

		return employee;
	}

	@Override
	protected Department onGetDepartment(String id) throws Throwable {

		DepartmentDTO departmentDTO = EBSXSystemRuntime.getInstance().getDepartmentService().get(id);

		Department department = new Department();
		departmentDTO.copyTo(department, true);

		return department;
	}


	@Override
	protected MetaDynaModel onGetMetaDynaModel(String strSystemId, String strOrgId) throws Throwable{

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		IMetaDynaModelService iMetaDynaModelService = EBSXSystemRuntime.getInstance().getMetaDynaModelService();
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.count(false).limit(1);//.eq(IDCSystemService.FIELD_SRFDCID, dcSystemDTO.getSrfdcid());
		searchContextDTO.eq(IMetaDynaModelService.FIELD_SYSTEMID, strSystemId);
		searchContextDTO.eq(IMetaDynaModelService.FIELD_STATUS, "1");
		searchContextDTO.nvl(IMetaDynaModelService.FIELD_PDYNAINSTID);
		searchContextDTO.eq(IMetaDynaModelService.FIELD_SRFDCID, iEmployeeContext.getTenant());

		if (StringUtils.hasLength(strOrgId)) {
			// searchContextDTO.eq(MetaDynaModelDTO.field_, objValue);
		} else {
			//
		}

		List<MetaDynaModelDTO> list = iMetaDynaModelService.selectView(searchContextDTO);
		if (ObjectUtils.isEmpty(list)) {
			throw new Exception(String.format("无法获取机构系统默认动态模型配置"));
		}

		MetaDynaModel dcDynaModel = new MetaDynaModel();
		list.get(0).copyTo(dcDynaModel, true);
		return dcDynaModel;
	}

//	@Override
//	protected MetaDynaModel onGetDefaultMetaDynaModel() throws Throwable{
//		IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
//		//DCSystemDTO dcSystemDTO = getDCSystemDTO();
//	//	DCSystem dcSystem = this.getDCSystemBySystem(employeeContext.getSystemid());
//
//		IMetaDynaModelService iMetaDynaModelService = EBSXSystemRuntime.getInstance().getMetaDynaModelService();
//		SearchContextDTO searchContextDTO = new SearchContextDTO();
//		searchContextDTO.count(false).limit(1);//.eq(IDCSystemService.FIELD_SRFDCID, dcSystemDTO.getSrfdcid());
//		searchContextDTO.eq(IMetaDynaModelService.FIELD_SYSTEMID, employeeContext.getSystemid());
//		searchContextDTO.eq(IMetaDynaModelService.FIELD_STATUS, "1");
//		searchContextDTO.nvl(IMetaDynaModelService.FIELD_PDYNAINSTID);
//		
//		if (StringUtils.hasLength(employeeContext.getOrgid())) {
//			// searchContextDTO.eq(MetaDynaModelDTO.field_, objValue);
//		} else {
//			//
//		}
//
//		Page<MetaDynaModelDTO> page = iMetaDynaModelService.fetchDefault(searchContextDTO);
//		if (ObjectUtils.isEmpty(page.getContent())) {
//			throw new Exception(String.format("无法获取组织系统默认动态模型配置"));
//		}
//
//		MetaDynaModel dcDynaModel = new MetaDynaModel();
//		page.getContent().get(0).copyTo(dcDynaModel, true);
//		return dcDynaModel;
//
//	}

	@Override
	protected List<WFDefinition> onGetWFDefinitions(String strSystemTag, String strModuleInstTag, String strModuleInstTag2, String strDataEntity, String strAppName) throws Throwable {
		MetaDynaModel dcDynaModel = null;
		if (!StringUtils.hasLength(strModuleInstTag)) {
			dcDynaModel = this.getDefaultMetaDynaModel();
		} else {
			dcDynaModel = this.getMetaDynaModel(strModuleInstTag, strModuleInstTag2);
		}

		IWFDefinitionService iWFDefinitionService = EBSXSystemRuntime.getInstance().getWFDefinitionService();
		SearchContextDTO searchContext = new SearchContextDTO();
		if(strDataEntity.split("-").length>1) {
			//增强获取指定工作流的流程版本
			searchContext.count(false).limit(Integer.MAX_VALUE).ll(WFDefinitionDTO.FIELD_DEFINITIONKEY, "wf" + dcDynaModel.getConfigId() + "-" + strSystemTag + "-" + strDataEntity + "v").eq(WFDefinitionDTO.FIELD_MODELENABLE, 1).sort("modelversion,desc");
		}else {
			searchContext.count(false).limit(Integer.MAX_VALUE).ll(WFDefinitionDTO.FIELD_DEFINITIONKEY, "wf" + dcDynaModel.getConfigId() + "-" + strSystemTag + "-" + strDataEntity + "-").eq(WFDefinitionDTO.FIELD_MODELENABLE, 1).sort("modelversion,desc");
		}
		List<WFDefinition> wfDefinitionList = new ArrayList<WFDefinition>();
		List<WFDefinitionDTO> list = iWFDefinitionService.selectDefault(searchContext);
		if (!ObjectUtils.isEmpty(list)) {
			for (WFDefinitionDTO item : list) {
				WFDefinition wfDefinition = new WFDefinition();
				item.copyTo(wfDefinition, true);
				wfDefinitionList.add(wfDefinition);
			}
		}

		return wfDefinitionList;
	}

	@Override
	protected WFDefinition onGetWFDefinition(String strSystemTag, String strModuleInstTag, String strModuleInstTag2, String strDataEntity, String strWFDefinitionId, String strAppName) throws Throwable {
		MetaDynaModel dcDynaModel = null;
		if (!StringUtils.hasLength(strModuleInstTag)) {
			dcDynaModel = this.getDefaultMetaDynaModel();
		} else {
			dcDynaModel = this.getMetaDynaModel(strModuleInstTag, strModuleInstTag2);
		}

		IWFDefinitionService iWFDefinitionService = EBSXSystemRuntime.getInstance().getWFDefinitionService();
		SearchContextDTO searchContext = new SearchContextDTO();
		if(strWFDefinitionId.split("-").length>1) {
			searchContext.ll(IWFDefinitionService.FIELD_DEFINITIONKEY, "wf" + dcDynaModel.getConfigId() + "-" + strSystemTag + "-" + strDataEntity + "-").eq(IWFDefinitionService.FIELD_MODELENABLE, 1).eq(IWFDefinitionService.FIELD_DEFINITIONKEY, strWFDefinitionId);
		}else {
			searchContext.ll(IWFDefinitionService.FIELD_DEFINITIONKEY, "wf" + dcDynaModel.getConfigId() + "-" + strSystemTag + "-" + strDataEntity + "-" + strWFDefinitionId + "v").eq(IWFDefinitionService.FIELD_MODELENABLE, 1).sort("modelversion,desc");
		}
		WFDefinitionDTO item = iWFDefinitionService.selectOne(searchContext, false);
		WFDefinition wfDefinition = new WFDefinition();
		item.copyTo(wfDefinition, true);
		return wfDefinition;
		// try {
		//
		// }
		// catch(Throwable ex) {
		// throw new Exception(String.format("获取流程定义[%1$s]发生异常，%2$s",
		// strWFDefinitionId, ex.getMessage()), ex);
		// }

		// throw new SystemRuntimeException(this.getSystemRuntimeBase(), this,
		// String.format("无法获取指定流程定义[%1$s]", strWFDefinitionId),
		// Errors.INVALIDDATAKEYS);
	}

	@Override
	protected WFDefinition onGetWFDefinition(String strSystemTag, String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppName) throws Throwable {

		if (!StringUtils.hasLength(strProcessDefinitionKey)) {
			String instanceId = DigestUtils.md5DigestAsHex(String.format("%s||%s||%s", strSystemTag, strDataEntity, strKey).getBytes());
			try {
				WFInstanceDTO wfInstanceDTO = EBSXSystemRuntime.getInstance().getWFInstanceService().get(instanceId);
				strProcessDefinitionKey = wfInstanceDTO.getProcessDefinitionKey();
			} catch (Throwable ex) {
				throw new Exception(String.format("获取默认流程实例发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		WFDefinitionDTO item = EBSXSystemRuntime.getInstance().getWFDefinitionService().get(strProcessDefinitionKey);
		WFDefinition wfDefinition = new WFDefinition();
		item.copyTo(wfDefinition, true);
		return wfDefinition;

		// if(StringUtils.isEmpty(processdefinitionKey)){
		// String instanceId =
		// DigestUtils.md5DigestAsHex(String.format("%s||%s||%s"
		// ,system,entity,businessKey).getBytes());
		// instance.setId(instanceId);
		// if(!instanceService.checkKey(instance)){
		// throw new
		// BadRequestAlertException(String.format("流程实例[%s]不存在",instanceId),"","");
		// }
		// instance = instanceService.get(instanceId);
		// processdefinitionKey = instance.getProcessdefinitionkey();
		// }
		//
		// if(StringUtils.isEmpty(processdefinitionKey)){
		// throw new BadRequestAlertException("未能获取流程定义","","");
		// }
		//
		// WFProcessDefinition definition = new WFProcessDefinition();
		// definition.setDefinitionkey(processdefinitionKey);
		// if(!iwfProcessDefinitionService.checkKey(definition)){
		// throw new
		// BadRequestAlertException(String.format("未能获取到流程定义[%s]",processdefinitionKey),"","");
		// }
		// definition = iwfProcessDefinitionService.get(processdefinitionKey);
	}

//	@Override
//	protected AppData onGetAppData(String strSystemId, IEmployeeContext iEmployeeContext) throws Throwable {
//
//		AppData appData = new AppData();
//		Entity context = new Entity();
//
//		if (StringUtils.hasLength(strSystemId) && !SYSTEMID_PORTAL.equalsIgnoreCase(strSystemId)) {
//			
//			context.set("srfdcid", iEmployeeContext.getTenant());
//			context.set("srfsystemid", strSystemId);
//			context.set("srfdcsystemid", iEmployeeContext.getDcsystemid());
//			if (StringUtils.hasLength(iEmployeeContext.getOrgid())) {
//				context.set("srforgid", iEmployeeContext.getOrgid());
//			}
//
//			context.set("srfuserid", iEmployeeContext.getUserid());
//			context.set("srfusername", iEmployeeContext.getUsername());
//			context.set("srfpersonid", iEmployeeContext.getUserid());
//			context.set("srfpersonname", iEmployeeContext.getUsername());
//			context.set("srfusercode", iEmployeeContext.getUsercode());
//			context.set("srforgsectorid", iEmployeeContext.getDeptid());
//			context.set("srforgsectorname", iEmployeeContext.getDeptname());
//			context.set("srforgsectorcode", iEmployeeContext.getDeptcode());
//
//
////			Collection<GrantedAuthority> Authorities = this.getAuthorities(dcEmployee.getDCSystemId(), iAuthenticationUser);
////			Collection<GrantedAuthority> Authorities2 = this.getAuthoritiesByUserId(iAuthenticationUser.getUserid());
//		} else {
//			context.set("srfuserid", iEmployeeContext.getUserid());
//			context.set("srfusername", iEmployeeContext.getUsername());
//			context.set("srfpersonid", iEmployeeContext.getUserid());
//			context.set("srfpersonname", iEmployeeContext.getUsername());
//			context.set("srfusercode", iEmployeeContext.getUsercode());
//		}
//		
//		// if(DataTypeUtils.getIntegerValue(iAuthenticationUser.getSuperuser(),0)
//		// == 1) {
//		//
//		//
//		//
//		// }
//		// else {
//		//
//		//
//		// throw new UnauthorizedException("未指定机构系统标识");
//		// }
//		//
//		//
//		// }
//		//
//
//		// "": "0100",
//		// context.set(strName, objValue);
//		// context.set("srfusername", iAuthenticationUser.ge);
//		//
//		// "": "e60c6647fb1237ac7a45859316d5de64",
//		// // "srfdcid": "aibizhi",
//		// "srforgname": "内部单位222",
//		// "srfusername": "埃毕致管理员",
//		// "srfusercode": "0100",
//		// "srfuserid": "1390213070426775554",
//		// "srfpersonid": "0100",
//		// "srforgsectorbc": null,
//		// "srfusermode": "",
//		// "srfsystemid": "5e9faa649d11a39a2ca77dcf8f89a4a7",
//		// "srfsdept": "'1','1TESET'",
//		// "srforgcode": "1",
//		// "srfsorg": "'1'",
//		// "srfpersonname": "埃毕致管理员",
//		// "srforgsectorid": "1",
//		// "srfloginname": "ibzadmin",
//		// "srflocale": null,
//		// "srftimezone": "",
//		// "srforgid": "1",
//		// "srfdcsystemid": "e60c6647fb1237ac7a45859316d5de64",
//		// "srfpdept": null,
//		// "srforgsectorname": "上海总部222",
//		// "srfporg": null,
//		// "srforgsectorcode": "1"
//		//
//
//		appData.setContext(context);
//		return appData;
//	}

	// protected void reloadDynaModelConfig(){
	// try {
	// this.onReloadDynaModelConfig();
	// }
	// catch(Throwable ex) {
	// log.error(String.format("%1$s刷新动态实例配置发生异常，%2$s", this.getLogicName(),
	// ex.getMessage()), ex);
	// throw dealException(String.format("刷新动态实例配置发生异常，%1$s", ex.getMessage()),
	// ex);
	// }
	// }
	//
	// protected void onReloadDynaModelConfig() throws Throwable {
	//
	// IMetaDynaModelService iMetaDynaModelService =
	// EBSXSystemRuntime.getInstance().getMetaDynaModelService();
	// SearchContextDTO searchContextDTO = new SearchContextDTO();
	// searchContextDTO.count(false).limit(Integer.MAX_VALUE);
	// Page<MetaDynaModelDTO> page =
	// iMetaDynaModelService.fetchIgnoreCenter(searchContextDTO);
	// if(page != null && page.getContent() != null) {
	// for(MetaDynaModelDTO metaDynaModelDTO : page.getContent()) {
	// String strActiveTag = metaDynaModelDTO.getActiveTag();
	// if (!ObjectUtils.isEmpty(strActiveTag)) {
	// moduleDynaModelMap.put(strActiveTag, metaDynaModelDTO.getConfigid());
	//// dynaModelPath.put(strActiveTag, metaDynaModelDTO.getConfigid());
	// //log.debug(String.format("动态模型标记:%1$s , 当前已激活动态模型 : {}" ,strActiveTag
	// ,metaDynaModelDTO.getConfigid());
	//// DynaModelPath.put(dynaModel.getDynaModelid(), dynaModel.getConfigid());
	//// log.debug("流程实例标记:{} , 当前已激活动态模型 : {}" ,dynaModel.getDynaModelid()
	// ,dynaModel.getConfigid());
	// }
	// }
	// }
	//
	//
	// }

	@Override
	protected List<OrgSystem> onGetOrgSystems(IAuthenticationUser iAuthenticationUser, String strDCSystemId) throws Throwable {

		DCSystem dcSystem = getDCSystem(strDCSystemId);

		// 查出所有组织身份
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.eq(IDCEmployeeService.FIELD_UAAUSERID, iAuthenticationUser.getUserid()).eq(IDCEmployeeService.FIELD_SRFDCID, dcSystem.getSrfdcid());
		searchContextDTO.setPageable(SearchContextDTO.STARTPAGE, 2000, 0);
		searchContextDTO.setCount(false);

		List<OrgSystem> orgSystemList = new ArrayList<OrgSystem>();
		Page<DCEmployeeDTO> page = EBSXSystemRuntime.getInstance().getDCEmployeeService().fetchDefault(searchContextDTO);
		if (ObjectUtils.isEmpty(page.getContent())) {
			return orgSystemList;
		}


		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();

		Employee employee = new Employee();
		employee.setUserId("SYSTEM");
		employee.setPersonName("系统管理员");
		employee.setSrfdcid(dcSystem.getSrfdcid());

		IEmployeeContext iEmployeeContext = new EmployeeContext(employee, null, null);
		EmployeeContext.setCurrent(iEmployeeContext);
		try {

			for (DCEmployeeDTO dcEmployeeDTO : page.getContent()) {
				if (!StringUtils.hasLength(dcEmployeeDTO.getOrgId())) {
					continue;
				}
				if (DataTypeUtils.getIntegerValue(dcEmployeeDTO.getSuperUser(), 0) == 0) {

					SearchContextDTO userRoleFilter = new SearchContextDTO().limit(1).count(false)
							.eq(IUserRoleService.FIELD_USERID, dcEmployeeDTO.getUserId())
							.param(IRoleService.FIELD_DCSYSTEMID, dcSystem.getDCSystemId());

					Page <UserRoleDTO> page2 = EBSXSystemRuntime.getInstance().getUserRoleService().fetchAccessDCSystem(userRoleFilter);
					if(ObjectUtils.isEmpty(page2) || ObjectUtils.isEmpty(page2.getContent())) {
						SearchContextDTO roleFilter = new SearchContextDTO().limit(1).count(false)
								.param(IRoleService.FIELD_DCSYSTEMID, dcSystem.getDCSystemId());
						Page <RoleDTO> page3 = EBSXSystemRuntime.getInstance().getRoleService().fetchCheckAuthorizeall(roleFilter);
						if(ObjectUtils.isEmpty(page3) || ObjectUtils.isEmpty(page3.getContent())) {
							log.debug(String.format("系统[%1$s]未授予用户[%2$s]访问权限", dcSystem.getDCSystemName(), dcEmployeeDTO.getUserId()));
							continue;
						}
					}


					// UserRoleSearchContext accessSearchContext = new
					// UserRoleSearchContext();
					//// accessSearchContext.setN_dcsystemid_eq(dcSystem.getDcsystemid());
					// accessSearchContext.setN_usermode_in("ACCESSUSER,ACCESSADMIN");
					// accessSearchContext.setN_userid_eq(employee.getUserid());
					// accessSearchContext.getSelectCond().apply("((T11.GLOBALFLAG =
					// 1) OR ((T11.GLOBALFLAG IS NULL) OR (T11.GLOBALFLAG = 0) AND
					// T11.DCSYSTEMID={0}))", dcSystem.getDcsystemid());
					// List<UserRole> sysUserRoles =
					// sysUserRoleService.select(accessSearchContext);
					// if (sysUserRoles.size() == 0) {
					// log.error(String.format("系统[%s]未授予用户[%s]访问权限。",
					// dcSystem.getDcsystemname(), curUser.getUsername()));
					// continue;
					// }
				}
				OrgSystem orgSystem = new OrgSystem();
				orgSystem.setSystemId(dcSystem.getSystemId());
				orgSystem.setOrgId(dcEmployeeDTO.getOrgId());
				orgSystem.setOrgName(dcEmployeeDTO.getOrgName());
				orgSystem.setDCSystemId(dcSystem.getDCSystemId());
				orgSystemList.add(orgSystem);
			}


		} finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}




		return orgSystemList;
	}

	@Override
	protected User onGetUserByName(String strName) throws Throwable {
		IUserService iUserService = EBSXSystemRuntime.getInstance().getUserService();
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		User user = new User();
		//先查询用户是否存在
		searchContextDTO.eq("loginname", strName);
		UserDTO sysUserDTO = iUserService.selectOne(searchContextDTO, true);
		if (sysUserDTO != null) {
			sysUserDTO.copyTo(user, true);
			return user;
		}
		// QueryWrapper<User> conds = new QueryWrapper<User>();
		String[] data = strName.split("[|,@]");
		String loginname = "";
		String domains = "";
		if (data.length > 0)
			loginname = data[0].trim();
		if (data.length > 1)
			domains = data[1].trim();
		if (!ObjectUtils.isEmpty(loginname)) {
			// conds.eq("loginname", loginname);
			searchContextDTO.eq("loginname", loginname);
		}

		if (!ObjectUtils.isEmpty(domains)) {
			// conds.eq("domains", domains);
			searchContextDTO.eq("domains", domains);
		}

		// User sysUser = sysUserService.getOne(conds, false);
		// if (sysUser == null) {
		// throw new BadRequestAlertException("用户名密码错误","IBZUSER",username);
		// } else {
		// sysUser.setUsername(username);
		// }

		sysUserDTO = iUserService.selectOne(searchContextDTO, true);
		if (sysUserDTO == null) {
			// if (bTryMode) {
			// return null;
			// }
			throw new UsernameNotFoundException("指定用户不存在");
		}

		sysUserDTO.copyTo(user, true);
		return user;
	}

	@Override
	protected User onGetUserByName(String strSystemId, String strOrgId, String strName) throws Throwable {
		return onGetUserByName(strName);
	}


	@Override
	protected void onChangePassword(String strUserId, String oldpassword, String newpassword) throws Throwable {
		UserDTO user = new UserDTO();
		user.setUserId(strUserId);
		user.set("oldpassword", oldpassword);
		user.setPassword(newpassword);
		EBSXSystemRuntime.getInstance().getUserService().changePwd(user);
	}

	@Override
	protected List<Employee> onGetEmployees(String[] ids) throws Throwable {

		IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();

		IEmployeeService employeeService = EBSXSystemRuntime.getInstance().getEmployeeService();

		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.count(false).limit(Integer.MAX_VALUE)
				// .eq(IEmployeeService.FIELD_SRFDCID, dcSystemDTO.getSrfdcid())
				.eq(IEmployeeService.FIELD_ORGID, employeeContext.getOrgid()).in(IEmployeeService.FIELD_USERID, StringUtils.arrayToDelimitedString(ids, ","));

		List<Employee> employeeList = new ArrayList<Employee>();
		List<EmployeeDTO> list = employeeService.selectDefault(searchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for (EmployeeDTO item : list) {
				Employee employee = new Employee();
				item.copyTo(employee, true);
				employeeList.add(employee);
			}
		}

		return employeeList;
	}

	@Override
	protected Collection<Employee> onGetEmployeesByOrg(String strOrgId) throws Throwable {
		IEmployeeService employeeService = EBSXSystemRuntime.getInstance().getEmployeeService();

		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.count(false).limit(Integer.MAX_VALUE)
				.eq(IEmployeeService.FIELD_ORGID, strOrgId).sort("showorder");

		List<Employee> employeeList = new ArrayList<Employee>();
		List<EmployeeDTO> list = employeeService.selectDefault(searchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for (EmployeeDTO item : list) {
				Employee employee = new Employee();
				item.copyTo(employee, true);
				employeeList.add(employee);
			}
		}

		return employeeList;
	}

	@Override
	protected Collection<Employee> onGetEmployeesByDept(String strDeptId) throws Throwable {
		IEmployeeService employeeService = EBSXSystemRuntime.getInstance().getEmployeeService();

		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.count(false).limit(Integer.MAX_VALUE)
				.eq(IEmployeeService.FIELD_MDEPTID, strDeptId).sort("showorder");

		List<Employee> employeeList = new ArrayList<Employee>();
		List<EmployeeDTO> list = employeeService.selectDefault(searchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for (EmployeeDTO item : list) {
				Employee employee = new Employee();
				item.copyTo(employee, true);
				employeeList.add(employee);
			}
		}

		return employeeList;
	}



	@Override
	protected Config onGetConfig(String strConfigType, String strTargetType, boolean bTryMode, boolean bTryGlobal) throws Throwable {
		IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
//		return new CacheableActionBuilder(this.getSysCacheUtilRuntime(false)).tags(employeeContext.getSystemid(), strConfigType, strTargetType, employeeContext.getUserid()).action(new IAction() {
//			@Override
//			public Object execute(Object[] args) throws Throwable {
//				String strKey = KeyValueUtils.genUniqueId(employeeContext.getSystemid(), strConfigType, strTargetType, employeeContext.getUserid());
//				DstConfigDTO dstConfigDTO = EBSXSystemRuntime.getInstance().getDstConfigService().get(strKey, bTryMode);
//				Config config = new Config();
//				if (dstConfigDTO != null) {
//					dstConfigDTO.copyTo(config, true);
//				}
//				return config;
//			}
//		}).build().get(Config.class);


		String strKey = KeyValueUtils.genUniqueId(employeeContext.getSystemid(), strConfigType, strTargetType, employeeContext.getUserid());
		DstConfigDTO dstConfigDTO = EBSXSystemRuntime.getInstance().getDstConfigService().get(strKey, bTryMode);
		if(dstConfigDTO == null && bTryGlobal) {
			 strKey = KeyValueUtils.genUniqueId(employeeContext.getSystemid(), strConfigType, strTargetType, "__GLOBAL__");
			 dstConfigDTO = EBSXSystemRuntime.getInstance().getDstConfigService().get(strKey, bTryMode);
		}
		Config config = new Config();
		if (dstConfigDTO != null) {
			dstConfigDTO.copyTo(config, true);
		}
		return config;
	}

	@Override
	protected Config onSaveConfig(String strConfigType, String strTargetType, Object objConfig, boolean bAsGlobal) throws Throwable {
		IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
		String strConfig = (objConfig != null) ? (String) this.getSystemRuntime().serialize(objConfig) : null;

		DstConfigDTO dstConfigDTO = new DstConfigDTO();
		String strKey = KeyValueUtils.genUniqueId(employeeContext.getSystemid(), strConfigType, strTargetType, employeeContext.getUserid());
		dstConfigDTO.setCfgId(strKey);
		dstConfigDTO.setSystemId(employeeContext.getSystemid());
		dstConfigDTO.setUserId(employeeContext.getUserid());
		dstConfigDTO.setCfgType(strConfigType);
		dstConfigDTO.setTargetType(strTargetType);
		dstConfigDTO.setCfg(strConfig);

		EBSXSystemRuntime.getInstance().getDstConfigService().save(dstConfigDTO);

		Config config = new Config();
		dstConfigDTO.copyTo(config, true);
		
		if(bAsGlobal) {
			 strKey = KeyValueUtils.genUniqueId(employeeContext.getSystemid(), strConfigType, strTargetType,  "__GLOBAL__");
			dstConfigDTO.setCfgId(strKey);
			dstConfigDTO.setSystemId(employeeContext.getSystemid());
			dstConfigDTO.setUserId( "__GLOBAL__");
			dstConfigDTO.setCfgType(strConfigType);
			dstConfigDTO.setTargetType(strTargetType);
			dstConfigDTO.setCfg(strConfig);
			EBSXSystemRuntime.getInstance().getDstConfigService().save(dstConfigDTO);
		}
		
		
		return config;

//		return new CacheableActionBuilder(this.getSysCacheUtilRuntime(false)).tags(employeeContext.getSystemid(), strConfigType, strTargetType, employeeContext.getUserid()).action(new IAction() {
//			@Override
//			public Object execute(Object[] args) throws Throwable {
//				DstConfigDTO dstConfigDTO = new DstConfigDTO();
//				String strKey = KeyValueUtils.genUniqueId(employeeContext.getSystemid(), strConfigType, strTargetType, employeeContext.getUserid());
//				dstConfigDTO.setCfgId(strKey);
//				dstConfigDTO.setSystemId(employeeContext.getSystemid());
//				dstConfigDTO.setUserId(employeeContext.getUserid());
//				dstConfigDTO.setCfgType(strConfigType);
//				dstConfigDTO.setTargetType(strTargetType);
//				dstConfigDTO.setCfg(strConfig);
//
//				EBSXSystemRuntime.getInstance().getDstConfigService().save(dstConfigDTO);
//
//				Config config = new Config();
//				dstConfigDTO.copyTo(config, true);
//				return config;
//			}
//		}).build().save(Config.class);
	}

	@Override
	protected void onRemoveConfig(String strConfigType, String strTargetType) throws Throwable{
		IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
		String strKey = KeyValueUtils.genUniqueId(employeeContext.getSystemid(), strConfigType, strTargetType, employeeContext.getUserid());
		EBSXSystemRuntime.getInstance().getDstConfigService().remove(Arrays.asList(strKey));
	}

	@Override
	protected CodeList onGetCodeList(String strCodeListTag, boolean bTryMode) throws Throwable {
		return onGetCodeList(strCodeListTag,bTryMode,Integer.MAX_VALUE);
	}

	@Override
	protected CodeList onGetCodeList(String strCodeListTag, boolean bTryMode, Integer maxSize) throws Throwable {

		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.eq(IDictCatalogService.FIELD_CCODE, strCodeListTag);

		DictCatalogDTO dictCatalogDTO = EBSXSystemRuntime.getInstance().getDictCatalogService().selectOne(searchContextDTO, bTryMode);
		if(dictCatalogDTO == null) {
			return null;
		}

		List<DictOptionDTO> options = EBSXSystemRuntime.getInstance().getDictOptionService().selectDefault(new SearchContextDTO().limit(maxSize).count(false)
				.sort("SHOWORDER")
				.eq(IDictOptionService.FIELD_CID, dictCatalogDTO.getId()));

		CodeList codeList = new CodeList();
		codeList.setId(dictCatalogDTO.getId());
		codeList.setName(dictCatalogDTO.getName());
		codeList.setCode(dictCatalogDTO.getCode());

		if(!ObjectUtils.isEmpty(options)) {
			List<CodeItem> codeItemList = new ArrayList<CodeItem>();
			for(DictOptionDTO option : options) {
				CodeItem codeItem = new CodeItem();
				codeItem.setValue(option.getValue());
				codeItem.setText(option.getLabel());
				codeItem.setIconClass(option.getIconClass());
				codeItem.setShowOrder(option.getShowOrder());
				codeItem.setDisabled(DataTypeUtils.getBooleanValue(option.getDisabled(), false));
				codeItem.setPValue(option.getParent());
				codeItemList.add(codeItem);
			}
			codeList.setItems(codeItemList);
		}

		return codeList;

	}
	@Override
	protected Collection<IUAAGrantedAuthority> onGetGrantedAuthorities(IEmployeeContext iEmployeeContext) throws Throwable {
		return new UserContextActionBuilder(iEmployeeContext)
				.action(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {

						Set<IUAAGrantedAuthority> authorities = new LinkedHashSet<>();

						// SysPermissionActionSearchContext sysPermissionActionSearchContext =
						// new SysPermissionActionSearchContext();
						SearchContextDTO sysPermissionActionSearchContext = new SearchContextDTO().all();
						// sysPermissionActionSearchContext.set("userid",userId);
						// sysPermissionActionSearchContext.set("dcsystemid",dcSystem.getDcsystemid());
						sysPermissionActionSearchContext.set("userid", iEmployeeContext.getUserid());
						sysPermissionActionSearchContext.set("dcsystemid", iEmployeeContext.getDcsystemid());
						List<PermissionActionDTO> actions = EBSXSystemRuntime.getInstance().getPermissionActionService().selectAuthority(sysPermissionActionSearchContext);

						SearchContextDTO sysPermissionSearchContext = new SearchContextDTO().all();
						// sysPermissionSearchContext.getSelectCond().apply(perMissionFind,
						// userId, dcSystem.getDcsystemid());
						sysPermissionSearchContext.set("userid", iEmployeeContext.getUserid());
						sysPermissionSearchContext.set("dcsystemid", iEmployeeContext.getDcsystemid());
						List<PermissionDTO> permissions = EBSXSystemRuntime.getInstance().getPermissionService().selectAuthority(sysPermissionSearchContext);
						for (PermissionDTO permission : permissions) {
							if (permission.getPermissionType().equals(PermissionType.OPPRIV.toString())) {
								UAADEAuthority authority = new UAADEAuthority();
								authority.setSystemid(permission.getPSSystemId());
								authority.setName(permission.getPermissionName());
								authority.setEntity(permission.getEntityName());
								authority.setIsAllData(permission.getIsAllData());
								authority.setEnableorgdr(permission.getEnableOrgDR());
								authority.setEnabledeptdr(permission.getEnableDeptDR());
								authority.setEnabledeptbc(permission.getEnableDeptBC());
								authority.setOrgdr(permission.getOrgDR());
								authority.setDeptdr(permission.getDeptDR());
								authority.setDeptbc(permission.getDeptBC());
								authority.setBscope(permission.getBScope());
								authority.setDeAction(actions.stream().filter(f -> f.getPermissionId().equals(permission.getPermissionId())).map(m -> {
									Map<String, String> action = new HashMap<>();
									if (!ObjectUtils.isEmpty(m.getOPPriv())) {
										action.put(m.getOPPriv(), ObjectUtils.isEmpty(m.getBScope()) ? "" : m.getBScope());
									}
									return action;
								}).collect(Collectors.toList()));
								authorities.add(authority);
							} else if (permission.getPermissionType().equals(PermissionType.APPMENU.toString())) {
								/**
								 * 源代码中没有
								 */
//								 UAAMenuAuthority authority = new UAAMenuAuthority();
//								 authority.setSystemid(permission.getPssystemid());
//								 authority.setName(permission.getPermissionname());
//								 authority.setMenuTag(permission.getPermissiontag());
//								 authorities.add(authority);
							} else if (permission.getPermissionType().equals(PermissionType.UNIRES.toString())) {
								UAAUniResAuthority authority = new UAAUniResAuthority();
								authority.setSystemid(permission.getPSSystemId());
								authority.setName(permission.getPermissionName());
								authority.setAuthority(permission.getPermissionTag());
								authorities.add(authority);
							}
						}

						// 系统角色
						SearchContextDTO sysRoleSearchContext = new SearchContextDTO().all();
						String sysRoleFind = "(T1.DCSYSTEMID IS NULL OR T1.DCSYSTEMID = '%1$s') AND EXISTS (SELECT 1 FROM IBZUSER_ROLE T2" + " WHERE T1.SYS_ROLEID = T2.SYS_ROLEID AND T2.ISVALID = 1 AND T2.USERID = '%2$s' )";
						// sysRoleSearchContext.getSelectCond().apply(sysRoleFind,
						// dcSystem.getDcsystemid(), userId);
						sysRoleSearchContext.custom(String.format(sysRoleFind, iEmployeeContext.getDcsystemid(), iEmployeeContext.getUserid()));
						List<RoleDTO> sysRoles = EBSXSystemRuntime.getInstance().getRoleService().selectDefault(sysRoleSearchContext);
						for (RoleDTO sysRole : sysRoles) {
							UAARoleAuthority authority = new UAARoleAuthority();
							authority.setName(sysRole.getRoleName());
							authority.setAuthority(sysRole.getRoleTag());
							authorities.add(authority);
						}
						return authorities;
					}
				})
				.build().execute(new TypeReference<Collection<IUAAGrantedAuthority>>() {});

	}

//	public Collection<GrantedAuthority> getAuthorities(String strDCSystemId) throws Throwable {
//
//		IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
//
//		Set<GrantedAuthority> authorities = new LinkedHashSet<>();
//
//		// SysPermissionActionSearchContext sysPermissionActionSearchContext =
//		// new SysPermissionActionSearchContext();
//		SearchContextDTO sysPermissionActionSearchContext = new SearchContextDTO();
//		// sysPermissionActionSearchContext.set("userid",userId);
//		// sysPermissionActionSearchContext.set("dcsystemid",dcSystem.getDcsystemid());
//		sysPermissionActionSearchContext.set("userid", employeeContext.getUserid());
//		sysPermissionActionSearchContext.set("dcsystemid", strDCSystemId);
//		List<PermissionActionDTO> actions = EBSXSystemRuntime.getInstance().getPermissionActionService().selectAuthority(sysPermissionActionSearchContext);
//
//		SearchContextDTO sysPermissionSearchContext = new SearchContextDTO();
//		// sysPermissionSearchContext.getSelectCond().apply(perMissionFind,
//		// userId, dcSystem.getDcsystemid());
//		sysPermissionSearchContext.set("userid", employeeContext.getUserid());
//		sysPermissionSearchContext.set("dcsystemid", strDCSystemId);
//		List<PermissionDTO> permissions = EBSXSystemRuntime.getInstance().getPermissionService().selectAuthority(sysPermissionSearchContext);
//		for (PermissionDTO permission : permissions) {
//			if (permission.getPermissionType().equals(PermissionType.OPPRIV.toString())) {
//				UAADEAuthority authority = new UAADEAuthority();
//				authority.setSystemid(permission.getPSSystemId());
//				authority.setName(permission.getPermissionName());
//				authority.setEntity(permission.getEntityName());
//				authority.setEnableorgdr(permission.getEnableOrgDR());
//				authority.setEnabledeptdr(permission.getEnableDeptDR());
//				authority.setEnabledeptbc(permission.getEnableDeptBC());
//				authority.setOrgdr(permission.getOrgDR());
//				authority.setDeptdr(permission.getDeptDR());
//				authority.setDeptbc(permission.getDeptBC());
//				authority.setBscope(permission.getBScope());
//				authority.setDeAction(actions.stream().filter(f -> f.getPermissionId().equals(permission.getPermissionId())).map(m -> {
//					Map<String, String> action = new HashMap<>();
//					if (!ObjectUtils.isEmpty(m.getOPPriv())) {
//						action.put(m.getOPPriv(), ObjectUtils.isEmpty(m.getBScope()) ? "" : m.getBScope());
//					}
//					return action;
//				}).collect(Collectors.toList()));
//				authorities.add(authority);
//			} else if (permission.getPermissionType().equals(PermissionType.APPMENU.toString())) {
//				// UAAMenuAuthority authority = new UAAMenuAuthority();
//				// authority.setSystemid(permission.getPssystemid());
//				// authority.setName(permission.getPermissionname());
//				// authority.setMenuTag(permission.getPermissiontag());
//				// authorities.add(authority);
//			} else if (permission.getPermissionType().equals(PermissionType.UNIRES.toString())) {
//				UAAUniResAuthority authority = new UAAUniResAuthority();
//				authority.setSystemid(permission.getPSSystemId());
//				authority.setName(permission.getPermissionName());
//				authority.setAuthority(permission.getPermissionTag());
//				authorities.add(authority);
//			}
//		}
//
//		// 系统角色
//		SearchContextDTO sysRoleSearchContext = new SearchContextDTO();
//		String sysRoleFind = "(T1.DCSYSTEMID IS NULL OR T1.DCSYSTEMID = '%1$s') AND EXISTS (SELECT 1 FROM IBZUSER_ROLE T2" + " WHERE T1.SYS_ROLEID = T2.SYS_ROLEID AND T2.ISVALID = 1 AND T2.USERID = '%2$s' )";
//		// sysRoleSearchContext.getSelectCond().apply(sysRoleFind,
//		// dcSystem.getDcsystemid(), userId);
//		sysRoleSearchContext.custom(String.format(sysRoleFind, strDCSystemId, employeeContext.getUserid()));
//		List<RoleDTO> sysRoles = EBSXSystemRuntime.getInstance().getRoleService().selectDefault(sysRoleSearchContext);
//		for (RoleDTO sysRole : sysRoles) {
//			UAARoleAuthority authority = new UAARoleAuthority();
//			authority.setName(sysRole.getRoleName());
//			authority.setAuthority(sysRole.getRoleTag());
//			authorities.add(authority);
//		}
//
//		return authorities;
//	}

	protected Collection<GrantedAuthority> getAuthoritiesByUserId(String userId) throws Throwable {
		Set<GrantedAuthority> authorities = new LinkedHashSet<>();
		Set<String> roleIds = getRoleIdsByUserId(userId);
		if (roleIds.size() > 0) {
			roleIds.forEach(roleid -> authorities.add(new SimpleGrantedAuthority("ROLE_" + roleid)));
			String ids = "";
			for (String id : roleIds) {

				if (!org.springframework.util.StringUtils.isEmpty(ids))
					ids += ",";
				ids += ("'" + id + "'");
			}
			String sql = " SELECT distinct t21.PERMISSIONTYPE, t1.SYS_PERMISSIONID FROM IBZROLE_PERMISSION t1  INNER JOIN IBZPERMISSION t21 ON t1.SYS_PERMISSIONID = t21.SYS_PERMISSIONID where sys_roleid in (" + ids + ")";
			Set<String> apps = new HashSet<>();

			List<RolePermissionDTO> rolePermissionDTOList = EBSXSystemRuntime.getInstance().getRolePermissionService().executeSelectSQL(sql, null);
			rolePermissionDTOList.forEach(item -> {
				String permissiontype = item.getPermissionType();// .getString("PERMISSIONTYPE");
				String permissionid = item.getPermissionId();// .getString("SYS_PERMISSIONID");
				if (org.springframework.util.StringUtils.isEmpty(permissionid) || org.springframework.util.StringUtils.isEmpty(permissiontype))
					return;
				if (PermissionType.APPMENU.toString().equals(permissiontype)) {
					// 补充应用访问权
					String appid = permissionid.split("-")[0].toLowerCase() + "-" + permissionid.split("-")[1].toLowerCase();
					if (!apps.contains(appid)) {
						apps.add(appid);
						authorities.add(new SimpleGrantedAuthority(permissiontype + "_" + appid));
					}
				}
				if (PermissionType.OPPRIV.toString().equals(permissiontype))
					authorities.add(new SimpleGrantedAuthority(permissionid));
				else
					authorities.add(new SimpleGrantedAuthority(permissiontype + "_" + permissionid));
			});

			// rolePermissionService.select(sql,null).forEach(item->{
			// String permissiontype=item.getString("PERMISSIONTYPE");
			// String permissionid=item.getString("SYS_PERMISSIONID");
			// if(org.springframework.util.StringUtils.isEmpty(permissionid)||
			// org.springframework.util.StringUtils.isEmpty(permissiontype))
			// return;
			// if(PermissionType.APPMENU.toString().equals(permissiontype))
			// {
			// //补充应用访问权
			// String appid =
			// permissionid.split("-")[0].toLowerCase()+"-"+permissionid.split("-")[1].toLowerCase();
			// if(!apps.contains(appid)){
			// apps.add(appid);
			// authorities.add(new
			// SimpleGrantedAuthority(permissiontype+"_"+appid));
			// }
			// }
			// if(PermissionType.OPPRIV.toString().equals(permissiontype))
			// authorities.add(new SimpleGrantedAuthority(permissionid));
			// else
			// authorities.add(new
			// SimpleGrantedAuthority(permissiontype+"_"+permissionid));
			// });

		}

		return authorities;
	}

	/**
	 * 获取用户所属角色
	 *
	 * @param userId
	 *            用户标识
	 * @return
	 */
	protected Set<String> getRoleIdsByUserId(String userId) throws Throwable {

		Set<String> roleIds = new HashSet<>();
		// List<SysUserRole> userRoles = userRoleService.selectByUserid(userId);
		SearchContextDTO searchContextDTO = new SearchContextDTO().all();
		searchContextDTO.eq(IUserRoleService.FIELD_USERID, userId);
		List<UserRoleDTO> userRoleDTOList = EBSXSystemRuntime.getInstance().getUserRoleService().selectDefault(searchContextDTO);
		if (ObjectUtils.isEmpty(userRoleDTOList)) {
			// if (userRoles.size() == 0) {
			//多租户模式没有默认角色
			//roleIds.add(ICloudUAAUtilRuntime.ROLE_USERS);
			return roleIds;
		}

		for(UserRoleDTO userRoleDTO : userRoleDTOList) {
			roleIds.add(userRoleDTO.getRoleId());
		}

		//查询当前租户全部子角色
		List<RoleDTO> roles = EBSXSystemRuntime.getInstance().getRoleService().selectDefault(
				new SearchContextDTO().all().nn(IRoleService.FIELD_PROLEID));

		if(ObjectUtils.isEmpty(roles)) {
			return roleIds;
		}

		List<RoleDTO> backupRoleDTOList = new ArrayList<RoleDTO>();
		//逐角色展开
		while(true) {

			while(roles.size()>0) {
				RoleDTO roleDTO = roles.remove(0);
				if(roleIds.contains(roleDTO.getPRoleId())) {
					roleIds.add(roleDTO.getRoleId());
				}
				else {
					backupRoleDTOList.add(roleDTO);
				}
			}

			if(backupRoleDTOList.size() == 0) {
				break;
			}

			roles.addAll(backupRoleDTOList);
			backupRoleDTOList.clear();
		}


		return roleIds;
	}





	@Override
	protected void onLog(SysLog sysLog) throws Throwable {
		IEmployeeContext employeeContext = EmployeeContext.getCurrent();

		SysLogDTO sysLogDTO = new SysLogDTO();
		sysLog.copyTo(sysLogDTO);
		sysLogDTO.setLogCat(sysLog.getCat());
		sysLogDTO.setLogInfo(sysLog.getInfo());

		if(employeeContext != null) {
			sysLogDTO.setDCSystemId(employeeContext.getDcsystemid());
			sysLogDTO.setSrfdcid(employeeContext.getTenant());
		}



		EBSXSystemRuntime.getInstance().getSysLogService().create(sysLogDTO);
	}

	@Override
	protected void onLogAudit(SysAudit sysAudit) throws Throwable {
		IEmployeeContext employeeContext = EmployeeContext.getCurrent();

		SysAuditDTO sysAuditDTO = new SysAuditDTO();
		sysAudit.copyTo(sysAuditDTO);
		sysAuditDTO.setAuditCat(sysAudit.getCat());
		sysAuditDTO.setAuditInfo(sysAudit.getInfo());

		if(employeeContext != null) {
			sysAuditDTO.setDCSystemId(employeeContext.getDcsystemid());
			sysAuditDTO.setSrfdcid(employeeContext.getTenant());
		}


		EBSXSystemRuntime.getInstance().getSysAuditService().create(sysAuditDTO);

	}

	@Override
	protected void onLogEvent(SysEvent sysEvent) throws Throwable {
		IEmployeeContext employeeContext = EmployeeContext.getCurrent();

		SysEventDTO sysEventDTO = new SysEventDTO();
		sysEvent.copyTo(sysEventDTO);
		sysEventDTO.setEventCat(sysEvent.getCat());
		sysEventDTO.setEventInfo(sysEvent.getInfo());

		if(employeeContext != null) {
			sysEventDTO.setSrfdcid(employeeContext.getTenant());
			sysEventDTO.setDCSystemId(employeeContext.getDcsystemid());
		}


		EBSXSystemRuntime.getInstance().getSysEventService().create(sysEventDTO);

	}

	@Override
	protected void onLogPO(SysPO sysPO) throws Throwable {
		IEmployeeContext employeeContext = EmployeeContext.getCurrent();

		SysPODTO sysPODTO = new SysPODTO();
		sysPO.copyTo(sysPODTO);
		sysPODTO.setPOCat(sysPO.getCat());
		sysPODTO.setPOInfo(sysPO.getInfo());
		sysPODTO.setDEName(sysPO.getDE());
		sysPODTO.setTime(sysPO.getTime());

		if(employeeContext != null) {
			sysPODTO.setSrfdcid(employeeContext.getTenant());
			sysPODTO.setDCSystemId(employeeContext.getDcsystemid());
		}


		EBSXSystemRuntime.getInstance().getSysPOService().create(sysPODTO);
	}

	@Override
	protected void onLog(List<Log> list) throws Throwable {

		IEmployeeContext employeeContext = EmployeeContext.getCurrent();

		String strUserId = null;
		if(employeeContext != null) {
			strUserId = employeeContext.getUserid();
		}
		else {
			strUserId = AuthenticationUser.getCurrentMust().getUserid();
		}


		List<SysLogDTO> sysLogDTOList = null;
		List<SysAuditDTO> sysAuditDTOList = null;
		List<SysPODTO> sysPODTOList = null;
		List<SysEventDTO> sysEventDTOList = null;

		for(Log log : list) {
			if(LogTypes.NORMAL.equals(log.getLogType())) {
				SysLogDTO sysLogDTO = new SysLogDTO();
				sysLogDTO.setSysLogId(KeyValueUtils.genUniqueId());
				//sysLogDTO.setLogCat(log.getLogCat());
				sysLogDTO.setLogCat(getRealCatName(log.getLogCat()));
				sysLogDTO.setSysLogName(log.getLogName());
				if(!StringUtils.hasLength(sysLogDTO.getSysLogName())) {
					sysLogDTO.setSysLogName(log.getInfo());
				}
				if(StringUtils.hasLength(sysLogDTO.getSysLogName())) {
					sysLogDTO.setSysLogName(getRealLogName(sysLogDTO.getSysLogName()));
				}
				sysLogDTO.setLogLevel(log.getLogLevel());
				sysLogDTO.setLogInfo(log.getInfo());
				sysLogDTO.setCreateDate(log.getLogTime());
				sysLogDTO.setCreateMan(log.getUserId());

				sysLogDTO.setOPPersonId(log.getUserId());
				sysLogDTO.setDCSystemId((String)log.get("dcsystemid"));
				sysLogDTO.setSrfdcid(log.getTenant());
				sysLogDTO.setUserData(log.getUserData());
				sysLogDTO.setUserData2(log.getUserData2());
				if(sysLogDTOList == null) {
					sysLogDTOList = new ArrayList<SysLogDTO>();
				}
				sysLogDTOList.add(sysLogDTO);
				continue;
			}




			if(LogTypes.AUDIT.equals(log.getLogType())) {
				SysAuditDTO sysAuditDTO = new SysAuditDTO();
				sysAuditDTO.setSysAuditId(KeyValueUtils.genUniqueId());
				//sysAuditDTO.setAuditCat(log.getLogCat());
				sysAuditDTO.setAuditCat(getRealCatName(log.getLogCat()));
				sysAuditDTO.setSysAuditName(log.getLogName());
				if(!StringUtils.hasLength(sysAuditDTO.getSysAuditName())) {
					sysAuditDTO.setSysAuditName(log.getInfo());
				}
				if(StringUtils.hasLength(sysAuditDTO.getSysAuditName())) {
					sysAuditDTO.setSysAuditName(getRealLogName(sysAuditDTO.getSysAuditName()));
				}
				sysAuditDTO.setLogLevel(log.getLogLevel());
				sysAuditDTO.setAuditInfo(log.getInfo());
				sysAuditDTO.setCreateDate(log.getLogTime());
				sysAuditDTO.setCreateMan(log.getUserId());

				sysAuditDTO.setOPPersonId(log.getUserId());
				sysAuditDTO.setDCSystemId((String)log.get("dcsystemid"));
				sysAuditDTO.setSrfdcid(log.getTenant());
				sysAuditDTO.setAddress(log.getRemoteAddress());
//				sysAuditDTO.setUserData(log.getUserData());
//				sysAuditDTO.setUserData2(log.getUserData2());

				if(sysAuditDTOList == null) {
					sysAuditDTOList = new ArrayList<SysAuditDTO>();
				}
				sysAuditDTOList.add(sysAuditDTO);
				continue;
			}

			if(LogTypes.PO.equals(log.getLogType())) {
				SysPODTO sysPODTO = new SysPODTO();
				sysPODTO.setSysPOId(KeyValueUtils.genUniqueId());
				sysPODTO.setPOCat(getRealCatName(log.getLogCat()));
				sysPODTO.setSysPOName(log.getLogName());
				if(!StringUtils.hasLength(sysPODTO.getSysPOName())) {
					sysPODTO.setSysPOName(log.getInfo());
				}
				if(StringUtils.hasLength(sysPODTO.getSysPOName())) {
					sysPODTO.setSysPOName(getRealLogName(sysPODTO.getSysPOName()));
				}
				sysPODTO.setLogLevel(log.getLogLevel());
				sysPODTO.setPOInfo(log.getInfo());
				sysPODTO.setCreateDate(log.getLogTime());
				sysPODTO.setCreateMan(log.getUserId());

				sysPODTO.setDEName(log.getActionOwner());
				sysPODTO.setAction(log.getAction());
				if(!StringUtils.hasLength(sysPODTO.getAction())) {
					//修复早期ACTION属性BUG
					Object action = log.get("owner");
					if(action instanceof String) {
						sysPODTO.setAction((String)action);
					}
				}
				if(log.getActionDuration() != null) {
					sysPODTO.setTime(log.getActionDuration().longValue());
				}


				sysPODTO.setDCSystemId((String)log.get("dcsystemid"));
				sysPODTO.setSrfdcid(log.getTenant());
//				sysPODTO.setUserData(log.getUserData());
//				sysPODTO.setUserData2(log.getUserData2());

				//sysPODTO.setAddress(log.getRemoteAddress());

				if(sysPODTOList == null) {
					sysPODTOList = new ArrayList<SysPODTO>();
				}
				sysPODTOList.add(sysPODTO);
				continue;
			}

			if(LogTypes.EVENT.equals(log.getLogType())) {
				SysEventDTO sysEventDTO = new SysEventDTO();
				sysEventDTO.setSysEventId(KeyValueUtils.genUniqueId());
				sysEventDTO.setEventCat(getRealCatName(log.getLogCat()));
				sysEventDTO.setSysEventName(log.getLogName());
				if(!StringUtils.hasLength(sysEventDTO.getSysEventName())) {
					sysEventDTO.setSysEventName(log.getInfo());
				}
				if(StringUtils.hasLength(sysEventDTO.getSysEventName())) {
					sysEventDTO.setSysEventName(getRealLogName(sysEventDTO.getSysEventName()));
				}
				sysEventDTO.setLogLevel(log.getLogLevel());
				sysEventDTO.setEventInfo(log.getInfo());
				sysEventDTO.setCreateDate(log.getLogTime());
				sysEventDTO.setCreateMan(log.getUserId());

				sysEventDTO.setOPPersonId(log.getUserId());
				sysEventDTO.setDCSystemId((String)log.get("dcsystemid"));
				sysEventDTO.setSrfdcid(log.getTenant());
//				sysEventDTO.setUserData(log.getUserData());
//				sysEventDTO.setUserData2(log.getUserData2());

				if(sysEventDTOList == null) {
					sysEventDTOList = new ArrayList<SysEventDTO>();
				}
				sysEventDTOList.add(sysEventDTO);
				continue;
			}

		}


		java.sql.Timestamp currentTime = new java.sql.Timestamp(System.currentTimeMillis());
		//String strDCSystemId = employeeContext.getDcsystemid();

		if(!ObjectUtils.isEmpty(sysLogDTOList)) {
			for(SysLogDTO sysLogDTO : sysLogDTOList) {
				if(sysLogDTO.getCreateDate() == null) {
					sysLogDTO.setCreateDate(currentTime);
				}
				if(!StringUtils.hasLength(sysLogDTO.getCreateMan())) {
					sysLogDTO.setCreateMan(strUserId);
				}
				sysLogDTO.setUpdateDate(sysLogDTO.getCreateDate());
				sysLogDTO.setUpdateMan(sysLogDTO.getCreateMan());
			}
			EBSXSystemRuntime.getInstance().getSysLogService().rawCreate(sysLogDTOList, true);
		}

		if(!ObjectUtils.isEmpty(sysAuditDTOList)) {
			for(SysAuditDTO sysAuditDTO : sysAuditDTOList) {
				if(sysAuditDTO.getCreateDate() == null) {
					sysAuditDTO.setCreateDate(currentTime);
				}
				if(!StringUtils.hasLength(sysAuditDTO.getCreateMan())) {
					sysAuditDTO.setCreateMan(strUserId);
				}
				sysAuditDTO.setUpdateDate(sysAuditDTO.getCreateDate());
				sysAuditDTO.setUpdateMan(sysAuditDTO.getCreateMan());
			}
			EBSXSystemRuntime.getInstance().getSysAuditService().rawCreate(sysAuditDTOList, true);
		}

		if(!ObjectUtils.isEmpty(sysPODTOList)) {
			for(SysPODTO sysPODTO : sysPODTOList) {
				if(sysPODTO.getCreateDate() == null) {
					sysPODTO.setCreateDate(currentTime);
				}
				if(!StringUtils.hasLength(sysPODTO.getCreateMan())) {
					sysPODTO.setCreateMan(strUserId);
				}
				sysPODTO.setUpdateDate(sysPODTO.getCreateDate());
				sysPODTO.setUpdateMan(sysPODTO.getCreateMan());
			}
			EBSXSystemRuntime.getInstance().getSysPOService().rawCreate(sysPODTOList, true);
		}


		if(!ObjectUtils.isEmpty(sysEventDTOList)) {
			for(SysEventDTO sysEventDTO : sysEventDTOList) {
				if(sysEventDTO.getCreateDate() == null) {
					sysEventDTO.setCreateDate(currentTime);
				}
				if(!StringUtils.hasLength(sysEventDTO.getCreateMan())) {
					sysEventDTO.setCreateMan(strUserId);
				}
				sysEventDTO.setUpdateDate(sysEventDTO.getCreateDate());
				sysEventDTO.setUpdateMan(sysEventDTO.getCreateMan());
			}
			EBSXSystemRuntime.getInstance().getSysEventService().rawCreate(sysEventDTOList, true);
		}
	}
	
	@Override
	protected void onSaveOSSFile(File file) throws Throwable {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		
		SDFileDTO sdFileDTO = new SDFileDTO();
		sdFileDTO.setId(file.getFileId());
		sdFileDTO.setName(file.getFileName());
		sdFileDTO.setFolder(file.getFolder());
		sdFileDTO.setOwnerType(file.getOwnerType());
		sdFileDTO.setOwnerId(file.getOwnerId());
		if(file.getFileSize()!=null) {
			sdFileDTO.setFileSize(file.getFileSize().intValue());
		}
		sdFileDTO.setExtension(file.getFileExt());
		sdFileDTO.setFilePath(file.getLocalPath());
		sdFileDTO.setDigestCode(file.getDigestCode());
		String strDCSystemId = DataTypeUtils.asString(file.get("dcsystemid"), null);
		if(iEmployeeContext != null) {
			if(!StringUtils.hasLength(strDCSystemId)) {
				strDCSystemId = iEmployeeContext.getDcsystemid();
			}
		}
		
		sdFileDTO.setDCSystemId(strDCSystemId);
		
		EBSXSystemRuntime.getInstance().getSDFileService().save(sdFileDTO);
		
	}

	protected String getRealCatName(String strCatName) {
		if(!StringUtils.hasLength(strCatName)) {
			return null;
		}

		if(strCatName.length()<=60) {
			return strCatName;
		}

		String strRealCatName = "";
		String[] items = strCatName.split("[.]");
		for(int i = 0;i<items.length - 1;i++) {
			if(items[i].length() > 0) {
				strRealCatName += items[i].substring(0,1);
			}
			strRealCatName += ".";
		}
		strRealCatName += items[items.length - 1];
		if(strRealCatName.length() > 60) {
			strRealCatName = strRealCatName.substring(0, 60);
		}
		return strRealCatName;
	}

	protected String getRealLogName(String strLogName) {
		if(!StringUtils.hasLength(strLogName)) {
			return null;
		}

		int nPos = strLogName.indexOf("\r\n");
		if(nPos != -1) {
			strLogName = strLogName.substring(0, nPos);
		}

		if(strLogName.length() > 200) {
			return strLogName.substring(0,190) + "...";
		}

		return strLogName;
	}

	@Override
	protected Collection<Department> onGetAllDepartments() throws Throwable {
		List<DepartmentDTO> list =  EBSXSystemRuntime.getInstance().getDepartmentService().selectDefault(new SearchContextDTO().all().sort("showorder;deptcode"));
		List<Department> departmentList = new ArrayList<Department>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				Department department = new Department();
				t.copyTo(department, true);
				departmentList.add(department);
			});
		}
		return departmentList;
	}


	@Override
	protected Collection<Organization> onGetAllOrganizations() throws Throwable {
		List<OrganizationDTO> list =  EBSXSystemRuntime.getInstance().getOrganizationService().selectDefault(new SearchContextDTO().all().sort("showorder;orgcode"));

		List<Organization> organizationList = new ArrayList<Organization>();
		if(!ObjectUtils.isEmpty(list)) {

			list.forEach(t -> {
				Organization organization = new Organization();
				t.copyTo(organization, true);
				organizationList.add(organization);
			});
		}





		return organizationList;
	}

	@Override
	protected Collection<Employee> onGetAllEmployees() throws Throwable {
		List<EmployeeDTO> list =  EBSXSystemRuntime.getInstance().getEmployeeService().selectDefault(new SearchContextDTO().all().sort("showorder"));
		List<Employee> employeeList = new ArrayList<Employee>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				Employee employee = new Employee();
				t.copyTo(employee, true);
				employeeList.add(employee);
			});
		}
		return employeeList;
	}


	@Override
	protected Collection<net.ibizsys.central.cloud.core.util.domain.System> onGetAllSystems() throws Throwable {
		List<SystemDTO> list =  EBSXSystemRuntime.getInstance().getSystemService().selectDefault(new SearchContextDTO().all());
		List<net.ibizsys.central.cloud.core.util.domain.System> systemList = new ArrayList<net.ibizsys.central.cloud.core.util.domain.System>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				net.ibizsys.central.cloud.core.util.domain.System system = new net.ibizsys.central.cloud.core.util.domain.System();
				t.copyTo(system, true);
				systemList.add(system);
			});
		}
		return systemList;
	}

	@Override
	protected Collection<Application> onGetAllApplications() throws Throwable {
		List<ApplicationDTO> list =  EBSXSystemRuntime.getInstance().getApplicationService().selectDefault(new SearchContextDTO().all());
		List<net.ibizsys.central.cloud.core.util.domain.Application> applicationList = new ArrayList<net.ibizsys.central.cloud.core.util.domain.Application>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				net.ibizsys.central.cloud.core.util.domain.Application application = new net.ibizsys.central.cloud.core.util.domain.Application();
				t.copyTo(application, true);
				applicationList.add(application);
			});
		}
		return applicationList;
	}

	@Override
	protected Collection<Application> onGetApplications(String strSystemId) throws Throwable {

		Collection<Application> allApplications = this.getAllApplications();
		List<net.ibizsys.central.cloud.core.util.domain.Application> applicationList = new ArrayList<net.ibizsys.central.cloud.core.util.domain.Application>();
		if(!ObjectUtils.isEmpty(allApplications)) {
			allApplications.forEach(t -> {
				if(strSystemId.equals(t.getSystemId())) {
					applicationList.add(t);
				}

			});
		}
		return applicationList;
	}


	@Override
	protected Collection<DepCenter> onGetAllDepCenters() throws Throwable {
		List<CenterDTO> list =  EBSXSystemRuntime.getInstance().getCenterService().selectDefault(new SearchContextDTO().all());
		List<DepCenter> depCenterList = new ArrayList<DepCenter>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				DepCenter depCenter = new DepCenter();
				t.copyTo(depCenter, true);
				depCenterList.add(depCenter);
			});
		}
		return depCenterList;
	}


	@Override
	protected Collection<DCSystem> onGetAllDCSystems() throws Throwable {
		List<DCSystemDTO> list =  EBSXSystemRuntime.getInstance().getDCSystemService().selectDefault(new SearchContextDTO().all());
		List<net.ibizsys.central.cloud.core.util.domain.DCSystem> dcSystemList = new ArrayList<net.ibizsys.central.cloud.core.util.domain.DCSystem>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				net.ibizsys.central.cloud.core.util.domain.DCSystem dcSystem = new net.ibizsys.central.cloud.core.util.domain.DCSystem();
				t.copyTo(dcSystem, true);
				dcSystemList.add(dcSystem);
			});
		}
		return dcSystemList;
	}

	@Override
	protected Collection<Role> onGetAllGlobalRoles() throws Throwable {
		List<RoleDTO> list =  EBSXSystemRuntime.getInstance().getRoleService().selectDefault(new SearchContextDTO().all().eq(IRoleService.FIELD_GLOBALFLAG, 1));
		List<net.ibizsys.central.cloud.core.util.domain.Role> roleList = new ArrayList<net.ibizsys.central.cloud.core.util.domain.Role>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				net.ibizsys.central.cloud.core.util.domain.Role role = new net.ibizsys.central.cloud.core.util.domain.Role();
				t.copyTo(role, true);
				roleList.add(role);
			});
		}
		return roleList;
	}

	@Override
	protected Collection<UserRole> onGetGlobalUserRoles(String strRoleId) throws Throwable {

		Role role = this.getGlobalRole(strRoleId);

		List<UserRoleDTO> list =  EBSXSystemRuntime.getInstance().getUserRoleService().selectDefault(
				new SearchContextDTO().all().eq(IUserRoleService.FIELD_SYS_ROLEID, role.getRoleId()).eq(IUserRoleService.FIELD_ISVALID, 1));
		List<net.ibizsys.central.cloud.core.util.domain.UserRole> userRoles = new ArrayList<net.ibizsys.central.cloud.core.util.domain.UserRole>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				net.ibizsys.central.cloud.core.util.domain.UserRole userRole = new net.ibizsys.central.cloud.core.util.domain.UserRole();
				t.copyTo(userRole, true);
				userRoles.add(userRole);
			});
		}
		return userRoles;
	}


	@Override
	protected Collection<Role> onGetSystemRoles(String strDCSystemId) throws Throwable {
		List<RoleDTO> list =  EBSXSystemRuntime.getInstance().getRoleService().selectDefault(new SearchContextDTO().all().eq(IRoleService.FIELD_GLOBALFLAG, 0).eq(IRoleService.FIELD_DCSYSTEMID, strDCSystemId));
		List<net.ibizsys.central.cloud.core.util.domain.Role> roleList = new ArrayList<net.ibizsys.central.cloud.core.util.domain.Role>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				net.ibizsys.central.cloud.core.util.domain.Role role = new net.ibizsys.central.cloud.core.util.domain.Role();
				t.copyTo(role, true);
				roleList.add(role);
			});
		}
		return roleList;
	}

	@Override
	protected Collection<UserRole> onGetSystemUserRoles(String strDCSystemId, String strRoleId) throws Throwable {

		Role role = this.getSystemRole(strDCSystemId, strRoleId, false);

		List<UserRoleDTO> list =  EBSXSystemRuntime.getInstance().getUserRoleService().selectDefault(
				new SearchContextDTO().all().eq(IUserRoleService.FIELD_SYS_ROLEID, role.getRoleId()).eq(IUserRoleService.FIELD_ISVALID, 1));
		List<net.ibizsys.central.cloud.core.util.domain.UserRole> userRoles = new ArrayList<net.ibizsys.central.cloud.core.util.domain.UserRole>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				net.ibizsys.central.cloud.core.util.domain.UserRole userRole = new net.ibizsys.central.cloud.core.util.domain.UserRole();
				t.copyTo(userRole, true);
				userRoles.add(userRole);
			});
		}
		return userRoles;
	}


	@Override
	protected Collection<WFGroup> onGetAllWFGroups() throws Throwable {
		List<WFGroupDTO> list =  EBSXSystemRuntime.getInstance().getWFGroupService().selectDefault(new SearchContextDTO().all());
		List<net.ibizsys.central.cloud.core.util.domain.WFGroup> wfGroupList = new ArrayList<net.ibizsys.central.cloud.core.util.domain.WFGroup>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				net.ibizsys.central.cloud.core.util.domain.WFGroup wfGroup = new net.ibizsys.central.cloud.core.util.domain.WFGroup();
				t.copyTo(wfGroup, true);
				wfGroupList.add(wfGroup);
			});
		}
		return wfGroupList;
	}

	@Override
	protected Collection<WFMember> onGetWFMembers(String strWFGroupId) throws Throwable {

		WFGroup wfGroup = this.getWFGroup(strWFGroupId);

		List<WFMemberDTO> list =  EBSXSystemRuntime.getInstance().getWFMemberService().selectDefault(
				new SearchContextDTO().all().eq(IWFMemberService.FIELD_GROUPID, wfGroup.getId()));
		List<net.ibizsys.central.cloud.core.util.domain.WFMember> wfMemberList = new ArrayList<net.ibizsys.central.cloud.core.util.domain.WFMember>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				net.ibizsys.central.cloud.core.util.domain.WFMember wfMember = new net.ibizsys.central.cloud.core.util.domain.WFMember();
				t.copyTo(wfMember, true);
				wfMemberList.add(wfMember);
			});
		}
		return wfMemberList;
	}


	@Override
	protected OpenAccess onGetOpenAccess(String strOpenAccessId) throws Throwable {

//		OpenAccessDTO dto = EBSXSystemRuntime.getInstance().getOpenAccessService().get(strOpenAccessId);
//		OpenAccess openAccess = new OpenAccess();
//		dto.copyTo(openAccess, true);
//		return openAccess;

		return this.onGetOpenAccess(strOpenAccessId, false);
	}

	@Override
	protected OpenAccess onGetOpenAccess(String strOpenAccessId, boolean bTryMode) throws Throwable {

		OpenAccessDTO dto = EBSXSystemRuntime.getInstance().getOpenAccessService().get(strOpenAccessId, bTryMode);
		if(dto == null) {
			return null;
		}
		OpenAccess openAccess = new OpenAccess();
		dto.copyTo(openAccess, true);
		return openAccess;
	}


	@Override
	protected OpenUser onGetOpenUser(String strOpenType, String strUserId) throws Throwable {
		Employee employee = this.getEmployee(strUserId);

		OpenUserDTO dto = EBSXSystemRuntime.getInstance().getOpenUserService().selectOne(new SearchContextDTO().eq(IOpenUserService.FIELD_OPEN_TYPE, strOpenType.toLowerCase()).eq(IOpenUserService.FIELD_MOBILE, employee.getPhone()), true);
		if(dto == null) {
			//仿真
			OpenUser openUser = new OpenUser();
			openUser.setSysUserId(strUserId);
			openUser.setOpenUserName(employee.getPersonName());
			return openUser;
		}
		else {
			OpenUser openUser = new OpenUser();
			dto.copyTo(openUser, true);
			return openUser;
		}
	}


	@Override
	protected Collection<MsgTemplate> onGetAllMsgTemplates() throws Throwable {
		List<MsgTemplateDTO> list =  EBSXSystemRuntime.getInstance().getMsgTemplateService().selectDefault(new SearchContextDTO().all());
		List<net.ibizsys.central.cloud.core.util.domain.MsgTemplate> msgTemplateList = new ArrayList<net.ibizsys.central.cloud.core.util.domain.MsgTemplate>();
		if(!ObjectUtils.isEmpty(list)) {
			list.forEach(t -> {
				net.ibizsys.central.cloud.core.util.domain.MsgTemplate msgTemplate = new net.ibizsys.central.cloud.core.util.domain.MsgTemplate();
				t.copyTo(msgTemplate, true);
				msgTemplateList.add(msgTemplate);
			});
		}
		return msgTemplateList;
	}

	@Override
	protected User onGetUserByOpenUser(OpenUser openUser) throws Throwable {

		IEmployeeService employeeService = EBSXSystemRuntime.getInstance().getEmployeeService();
		EmployeeDTO employeeDTO = null;
		//判断是否已经绑定EMP
		if(StringUtils.hasLength(openUser.getSysUserId())) {
			employeeDTO = employeeService.get(openUser.getSysUserId(), true);
			if(employeeDTO == null) {
				throw new Exception(String.format("开放用户[%1$s]手机号码[%2$s]绑定机构用户不存在", openUser.getOpenUserName(), openUser.getMobile()));
			}
		}
		else {
			//产生标识直接获取
			if(StringUtils.hasLength(openUser.getOpenType()) && StringUtils.hasLength(openUser.getUserId())) {
				String strUserCode = String.format("%s%s", openUser.getOpenType(), openUser.getUserId());
				SearchContextDTO searchContextDTO = new SearchContextDTO();
				searchContextDTO.eq(IEmployeeService.FIELD_FROMOPENUSERTAG, strUserCode);
				employeeDTO = employeeService.selectOne(searchContextDTO, true);
			}
			
			if(employeeDTO == null) {
				//获取电话号码获取
				if(!StringUtils.hasLength(openUser.getMobile())) {
					throw new Exception(String.format("开放用户[%1$s]未指定手机号码，无法匹配机构用户", openUser.getOpenUserName()));
				}

				SearchContextDTO searchContextDTO = new SearchContextDTO();
				searchContextDTO.eq(IEmployeeService.FIELD_PHONE, openUser.getMobile());

				employeeDTO = employeeService.selectOne(searchContextDTO, true);
				if(employeeDTO == null) {
					throw new Exception(String.format("开放用户[%1$s]手机号码[%2$s]未绑定机构用户", openUser.getOpenUserName(), openUser.getMobile()));
				}
			}
		}

		IUserService iUserService = EBSXSystemRuntime.getInstance().getUserService();

		User user = new User();
		iUserService.get(employeeDTO.getUAAUserId()).copyTo(user, true);
		return user;

	}



	@Override
	protected void prepareSysCacheUtilRuntime() {
		this.setSysCacheUtilRuntime(this.getSystemRuntime().getSysCacheUtilRuntime(false));
	}

	@Override
	protected void onLogAuthInfo(User user, String strAuthAgent) throws Throwable{
		if(DataTypeUtils.asInteger(user.getApiUser(), 0)==1){
			return;
		}
		IAuthLogService authLogService = EBSXSystemRuntime.getInstance().getAuthLogService();
		AuthLogDTO authLog = new AuthLogDTO();
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		String strAddress = "";
		String userAgent= "";
		if (requestAttributes instanceof ServletRequestAttributes) {
			HttpServletRequest httpServletRequest = ((ServletRequestAttributes) requestAttributes).getRequest();
			strAddress = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_FORWARDEDFOR);
			if (!StringUtils.hasLength(strAddress)) {
				strAddress = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_REALIP);
				if (!StringUtils.hasLength(strAddress)) {
					strAddress = httpServletRequest.getRemoteAddr();
				}
			}
			else {
				String[] addresses = strAddress.split("[,]");
				if(addresses != null && addresses.length> 0) {
					strAddress = addresses[0];
				}
			}
			
			userAgent = httpServletRequest.getHeader("User-Agent");
			if (!StringUtils.hasLength(strAddress)) {
				strAddress = httpServletRequest.getRemoteAddr();
			}
		}

		java.sql.Timestamp currentTime = new java.sql.Timestamp(System.currentTimeMillis());
		authLog.setLogId(KeyValueUtils.genUniqueId());
		authLog.setIPAddr(strAddress);
		authLog.setUserAgent(userAgent);
		authLog.setUserName(user.getUserName());
		authLog.setUserId(user.getUserId());
		authLog.setPersonName(user.getPersonName());
		authLog.setAuthAgent(strAuthAgent);
		authLog.setAuthTime(currentTime);
		authLog.setAuthCode(StaticDict.AuthCode.ITEM_200.getValue());
		authLogService.rawCreate(Arrays.asList(authLog));
	}
}
