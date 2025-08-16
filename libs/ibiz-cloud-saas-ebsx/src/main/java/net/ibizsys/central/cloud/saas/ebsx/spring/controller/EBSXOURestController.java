package net.ibizsys.central.cloud.saas.ebsx.spring.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zalando.problem.ThrowableProblem;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOUUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.domain.Department;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.Organization;
import net.ibizsys.central.cloud.core.util.error.InternalServerErrorException;
import net.ibizsys.central.cloud.ou.core.IOUUtilSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.DepartmentDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.EmployeeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IDepartmentService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IEmployeeService;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 兼容旧版本接口
 * 
 * @author lionlau
 *
 */
@RestController()
@RequestMapping("")
public class EBSXOURestController {

	private static final Log log = LogFactory.getLog(EBSXOURestController.class);
	// protected static ObjectMapper MAPPER = new ObjectMapper();

	public final static String ORGID_ALL = "alls";

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("CloudOU服务（旧版）已经启动"));
		iServiceHub.registerNamingService("ebsx-oldou");
		if (this.iCloudOUUtilRuntime == null) {
			// 通过服务网关需要注册OU功能组件
			iServiceHub.requireCloudUtilRuntime(IOUUtilSystemRuntime.class, ICloudOUUtilRuntime.class);
		}
		
		//iServiceHub.registerIgnoreAuthPattern("/ebsx/oldou/test/**");
	}

	@Autowired(required = false)
	private ICloudOUUtilRuntime iCloudOUUtilRuntime = null;

	protected ICloudOUUtilRuntime getCloudOUUtilRuntime() {
		if (this.iCloudOUUtilRuntime == null) {
			try {
				this.iCloudOUUtilRuntime = iServiceHub.getCloudUtilRuntime(IOUUtilSystemRuntime.class, ICloudOUUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定CloudOU功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定CloudOU功能模块"), ex);
			}
		}
		return this.iCloudOUUtilRuntime;
	}

	// @PreAuthorize("quickTest('SYS_EMP', 'NONE')")
	// @ApiOperation(value = "获取流程选择用户查询", tags = {"人员" } ,notes = "获取流程选择用户查询")
	@RequestMapping(method = RequestMethod.GET, value = "/ebsx/oldou/ibzemployees/fetchwfselect")
	public ResponseEntity<Collection<EmployeeDTO>> fetchwfselect(HttpServletRequest httpServletRequest) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		try {
			Map context = RestUtils.queryString2Map(httpServletRequest.getQueryString());
			IEmployeeService iEmployeeService = EBSXSystemRuntime.getInstance().getEmployeeService();
			SearchContextDTO searchContextDTO = (SearchContextDTO) iEmployeeService.createSearchContextDTO(context);
			// searchContextDTO.eq(IEmployeeService.FIELD_SRFDCID,
			// iEmployeeContext.getTenant());
			return RestUtils.sendBackPage(iEmployeeService.fetchWFSelect(searchContextDTO), EmployeeDTO.class);
		} catch (Throwable ex) {
			if (ex instanceof ThrowableProblem) {
				throw (ThrowableProblem) ex;
			}
			throw new InternalServerErrorException(ex.getMessage());
		}

		// sendBackPage();

		// Page<EmployeeDTO> page = iEmployeeService.fetch
		//
		// Page<Employee> domains = EmployeeService.searchWFSelect(context) ;
		// List<EmployeeDTO> list = EmployeeMapping.toDto(domains.getContent());
		// return ResponseEntity.status(HttpStatus.OK)
		// .header("x-page",
		// String.valueOf(context.getPageable().getPageNumber()))
		// .header("x-per-page",
		// String.valueOf(context.getPageable().getPageSize()))
		// .header("x-total", String.valueOf(domains.getTotalElements()))
		// .body(list);

		// throw new InternalServerErrorException("没有实现");
	}

	@GetMapping(value = { "/ebsx/oldou/ibzemployees/{userId}/oumaps", "/ebsx/oldou/sysemployees/{userId}/oumaps" })
	public ResponseEntity<Map<String, Set<String>>> getOUMapsByUserId(@PathVariable("userId") String userId) {
		// Employee emp=iibzEmployeeService.get(userId);
		// String orgid="nullorgid";
		// if(!StringUtils.isEmpty(emp.getOrgid()))
		// orgid=emp.getOrgid();
		// String deptid="nulldeptid";
		// if(!StringUtils.isEmpty(emp.getMdeptid()))
		// deptid=emp.getMdeptid();
		// return ResponseEntity.ok(this.getMaps(orgid,deptid));

		throw new InternalServerErrorException("没有实现");
	}

	@GetMapping(value = { "/ebsx/oldou/ibzdepartments/{deptId}/emp", "/ebsx/oldou/sysdepartments/{deptId}/emp" })
	public ResponseEntity<Map> getEmpByDept(@PathVariable("deptId") String deptId) {
		// Map map=new LinkedHashMap<>();
		// List<Employee> list=ouCoreService.getEmpByDept(deptId);
		// for(Employee emp:list)
		// map.put(emp.getUserid(),emp);
		// return ResponseEntity.ok(map);
		throw new InternalServerErrorException("没有实现");
	}

	// @GetMapping(value={"/ebsx/oldou/ibzdepartments/{deptId}/fatheremp","/ebsx/oldou/sysdepartments/{deptId}/fatheremp"})
	// public ResponseEntity<Map> getFatherEmpByDept(@PathVariable("deptId")
	// String deptId)
	// {
	// Map map=new LinkedHashMap<>();
	// List<Employee> list=ouCoreService.getParentEmpByDept(deptId,false);
	// for(Employee emp:list)
	// map.put(emp.getUserid(),emp);
	// return ResponseEntity.ok(map);
	// }
	//
	// @GetMapping(value={"/ebsx/oldou/ibzdepartments/{deptId}/parentemp","/ebsx/oldou/sysdepartments/{deptId}/parentemp"})
	// public ResponseEntity<Map> getParentEmpByDept(@PathVariable("deptId")
	// String deptId)
	// {
	// Map map=new LinkedHashMap<>();
	// List<Employee> list=ouCoreService.getParentEmpByDept(deptId,true);
	// for(Employee emp:list)
	// map.put(emp.getUserid(),emp);
	// return ResponseEntity.ok(map);
	// }
	//
	// @GetMapping(value={"/ebsx/oldou/ibzdepartments/{deptId}/subemp","/ebsx/oldou/sysdepartments/{deptId}/subemp"})
	// public ResponseEntity<Map> getSubEmpByDept(@PathVariable("deptId") String
	// deptId)
	// {
	// Map map=new LinkedHashMap<>();
	// List<Employee> list=ouCoreService.getSubEmpByDept(deptId);
	// for(Employee emp:list)
	// map.put(emp.getUserid(),emp);
	// return ResponseEntity.ok(map);
	// }
	//
	//
	// @GetMapping(value={"/ibzorganizations/{orgId}/emp","/sysorganizations/{orgId}/emp"})
	// public ResponseEntity<Map> getEmpByOrg(@PathVariable("orgId") String
	// orgId)
	// {
	// Map map=new LinkedHashMap<>();
	// List<Employee> list=ouCoreService.getEmpByOrg(orgId);
	// for(Employee emp:list)
	// map.put(emp.getUserid(),emp);
	// return ResponseEntity.ok(map);
	// }
	//
	// @GetMapping(value={"/ibzorganizations/{orgId}/fatheremp","/sysorganizations/{orgId}/fatheremp"})
	// public ResponseEntity<Map> getFatherEmpByOrg(@PathVariable("orgId")
	// String orgId)
	// {
	// Map map=new LinkedHashMap<>();
	// List<Employee> list=ouCoreService.getParentEmpByOrg(orgId,false);
	// for(Employee emp:list)
	// map.put(emp.getUserid(),emp);
	// return ResponseEntity.ok(map);
	// }
	//
	// @GetMapping(value={"/ibzorganizations/{orgId}/parentemp","/sysorganizations/{orgId}/parentemp"})
	// public ResponseEntity<Map> getParentEmpByOrg(@PathVariable("orgId")
	// String orgId)
	// {
	// Map map=new LinkedHashMap<>();
	// List<Employee> list=ouCoreService.getParentEmpByOrg(orgId,true);
	// for(Employee emp:list)
	// map.put(emp.getUserid(),emp);
	// return ResponseEntity.ok(map);
	// }
	//
	// @GetMapping(value={"/ibzorganizations/{orgId}/subemp","/sysorganizations/{orgId}/subemp"})
	// public ResponseEntity<Map> getSubEmpByOrg(@PathVariable("orgId") String
	// orgId)
	// {
	// Map map=new LinkedHashMap<>();
	// List<Employee> list=ouCoreService.getSubEmpByOrg(orgId);
	// for(Employee emp:list)
	// map.put(emp.getUserid(),emp);
	// return ResponseEntity.ok(map);
	// }
	//
	// @GetMapping(value={"/ibzorganizations/picker","/sysorganizations/picker"})
	// public ResponseEntity<List<OrgNode>> getPicker()
	// {
	// List<OrgNode> list=ouCoreService.getOrgNode("alls");
	// return ResponseEntity.ok(list);
	// }
	//
	@GetMapping(value = { "/ebsx/oldou/ibzorganizations/{orgId}/ibzdepartments/picker", "/ebsx/oldou/sysorganizations/{orgId}/sysdepartments/picker" })
	public ResponseEntity<Collection<ObjectNode>> fetchDeptNodesByOrg(@PathVariable("orgId") String orgId) {

		EmployeeContext.getCurrentMust();
		List<ObjectNode> list = new ArrayList<ObjectNode>();

		// 获取机构全部部门
		Collection<Department> departments = this.getCloudOUUtilRuntime().getDepartmentsByOrg(orgId);
		if (!ObjectUtils.isEmpty(departments)) {

			List<Department> rootList = getDepartments(null, departments);
			if (!ObjectUtils.isEmpty(rootList)) {
				for (Department department : rootList) {
					list.add(this.getDeptNode(department, departments));
				}
			}
		}
		return ResponseEntity.ok(list);
	}

	protected ObjectNode getDeptNode(Department department, Collection<Department> departments) {

		ObjectNode objectNode = JsonUtils.createObjectNode();

		objectNode.put("id", department.getDeptId());
		objectNode.put("label", department.getDeptName());
		objectNode.put("code", department.getDeptCode());
		objectNode.put("level", department.getDeptLevel());
		objectNode.put("bcode", department.getBCode());
		try {
			objectNode.put("disabled", !DataTypeUtils.getBooleanValue(department.getIsValid(), true));
		} catch (Exception ex) {
			log.error(ex);
			objectNode.put("disabled", false);
		}

		// @JSONField(name = "filter")
		// @JsonProperty("filter")
		// private List<String> filter = new ArrayList<>();

		List<Department> childList = this.getDepartments(department.getDeptId(), departments);
		if (!ObjectUtils.isEmpty(childList)) {

			ArrayNode arrayNode = objectNode.putArray("children");
			for (Department sub : childList) {
				arrayNode.add(getDeptNode(sub, departments));
			}

			objectNode.put("isLeaf", false);
		} else {
			objectNode.put("isLeaf", true);
		}

		return objectNode;

		//
		// @JSONField(name = "id")
		// @JsonProperty("id")
		// private String deptid;
		//
		// @JSONField(name = "label")
		// @JsonProperty("label")
		// private String deptname;
		//
		// @JSONField(name = "code")
		// @JsonProperty("code")
		// private String deptcode;
		//
		// @JSONField(name = "level")
		// @JsonProperty("level")
		// private Integer deptlevel;
		//
		// @JSONField(name = "bcode")
		// @JsonProperty("bcode")
		// private String bcode;
		//
		// @JSONField(name = "filter")
		// @JsonProperty("filter")
		// private List<String> filter = new ArrayList<>();
		//
		// private List<DeptNode> children = new ArrayList<>();
		//
		// private boolean disabled = false;
		//
		// public boolean getIsLeaf()
		// {
		// return children.size()==0;
		// }

	}

	protected List<Department> getDepartments(String strPDeptId, Collection<Department> departments) {
		List<Department> list = null;
		for (Department department : departments) {
			if (StringUtils.hasLength(strPDeptId)) {
				if (strPDeptId.equals(department.getParentDeptId())) {
					if (list == null) {
						list = new ArrayList<Department>();
					}
					list.add(department);
				}
			} else {
				if (!StringUtils.hasLength(department.getParentDeptId())) {
					if (list == null) {
						list = new ArrayList<Department>();
					}
					list.add(department);
				}
			}
		}
		return list;
	}

	@GetMapping(value = { "/ebsx/oldou/ibzorganizations/{orgId}/ibzemployees/picker", "/ebsx/oldou/sysorganizations/{orgId}/sysemployees/picker" })
	public ResponseEntity<List<ObjectNode>> fetchEmployeeNodesByOrg(@PathVariable("orgId") String orgId) {

		EmployeeContext.getCurrentMust();
		List<ObjectNode> list = new ArrayList<ObjectNode>();

		// 获取组织全部人员
		Collection<Employee> employees = this.getCloudOUUtilRuntime().getEmployeesByOrg(orgId);
		if (!ObjectUtils.isEmpty(employees)) {
			for (Employee employee : employees) {
				list.add(this.getEmployeeNode(employee));
			}
		}
		return ResponseEntity.ok(list);

	}

	protected ObjectNode getEmployeeNode(Employee employee) {

		/*
		 * 
		 * 
		 * private String loginname;
		 * 
		 * private String domains;
		 * 
		 * private String username;
		 * 
		 * 
		 * @JsonFormat(pattern="yyyy-MM-dd", locale = "zh" , timezone="GMT+8")
		 * 
		 * @JSONField(format="yyyy-MM-dd") private Timestamp birthday;
		 * 
		 * 
		 */
		ObjectNode objectNode = JsonUtils.createObjectNode();

		objectNode.put("id", employee.getUserId());
		objectNode.put("label", employee.getPersonName());
		objectNode.put("code", employee.getUserCode());
		objectNode.put("ccode", employee.getBCode());
		objectNode.put("level", employee.getShowOrder());
		objectNode.put("mdeptid", employee.getMDeptId());
		objectNode.put("mdeptname", employee.getMDeptName());
		objectNode.put("group", employee.getMDeptName());
		objectNode.put("mdeptcode", employee.getMDeptCode());
		objectNode.put("postid", employee.getPostId());
		objectNode.put("postname", employee.getPostName());
		objectNode.put("postcode", employee.getPostCode());
		objectNode.put("orgid", employee.getOrgId());
		objectNode.put("orgname", employee.getOrgName());
		objectNode.put("orgcode", employee.getOrgCode());
		objectNode.put("nickname", employee.getNickName());
		objectNode.put("sex", employee.getSex());
		objectNode.put("certcode", employee.getCertCode());
		objectNode.put("phone", employee.getPhone());
		objectNode.put("email", employee.getEmail());
		objectNode.put("avatar", employee.getAvatar());
		objectNode.put("addr", employee.getAddr());
		if (employee.getBirthday() != null) {
			objectNode.put("birthday", DateUtils.toDateString(employee.getBirthday()));
		}

		return objectNode;

	}

	@GetMapping(value = { "/ebsx/oldou/ibzorganizations/picker", "/ebsx/oldou/sysorganizations/picker" })
	public ResponseEntity<List<ObjectNode>> fetchAllOrgNodes() {
		return this.fetchOrgNodesByOrg(ORGID_ALL);
	}

	@GetMapping(value = { "/ebsx/oldou/ibzorganizations/{orgId}/suborg/picker", "/ebsx/oldou/sysorganizations/{orgId}/suborg/picker" })
	public ResponseEntity<List<ObjectNode>> fetchOrgNodesByOrg(@PathVariable("orgId") String orgId) {

		EmployeeContext.getCurrentMust();

		List<ObjectNode> list = new ArrayList<ObjectNode>();
		Collection<Organization> organizationList = this.getCloudOUUtilRuntime().getAllOrganizations();
		if (!ObjectUtils.isEmpty(organizationList)) {
			Map<String, Organization> orgMap = new HashMap<String, Organization>();
			if (ORGID_ALL.equals(orgId)) {
				orgId = "";
			}

			boolean bAll = !StringUtils.hasLength(orgId);
			for (Organization organization : organizationList) {
				if (bAll) {
					if (StringUtils.hasLength(organization.getParentOrgId())) {
						continue;
					}
				} else {
					if (!orgId.equals(organization.getParentOrgId())) {
						continue;
					}
				}

				ObjectNode orgNode = getOrgNode(organization, organizationList, orgMap);
				if (orgNode != null) {
					list.add(orgNode);
				}
			}
		}
		return ResponseEntity.ok(list);
	}

	protected ObjectNode getOrgNode(Organization organization, Collection<Organization> organizations, Map<String, Organization> orgMap) {

		if (orgMap.containsKey(organization.getOrgId())) {
			throw new RuntimeException(String.format("组织[%1$s]出现递归", organization.getOrgName()));
		}

		orgMap.put(organization.getOrgId(), organization);

		/*
		 * @JSONField(name = "id")
		 * 
		 * @JsonProperty("id") private String orgid;
		 * 
		 * @JSONField(name = "label")
		 * 
		 * @JsonProperty("label") private String orgname;
		 * 
		 * @JSONField(name = "code")
		 * 
		 * @JsonProperty("code") private String orgcode;
		 * 
		 * @JSONField(name = "level")
		 * 
		 * @JsonProperty("level") private Integer orglevel;
		 * 
		 * @JSONField(name = "parentorgid")
		 * 
		 * @JsonProperty("parentorgid") private String parentorgid;
		 * 
		 * @JSONField(name = "filter")
		 * 
		 * @JsonProperty("filter") private List<String> filter = new
		 * ArrayList<>();
		 * 
		 * private List<OrgNode> children = new ArrayList<>();
		 * 
		 * private boolean disabled = false;
		 * 
		 * public boolean getIsLeaf() { return children.size()==0; }
		 * 
		 */

		ObjectNode objectNode = JsonUtils.createObjectNode();

		objectNode.put("id", organization.getOrgId());
		objectNode.put("label", organization.getOrgName());
		objectNode.put("code", organization.getOrgCode());
		objectNode.put("level", organization.getOrgLevel());
		objectNode.put("parentorgid", organization.getParentOrgId());
		try {
			objectNode.put("disabled", !DataTypeUtils.getBooleanValue(organization.getIsValid(), true));
		} catch (Exception ex) {
			log.error(ex);
			objectNode.put("disabled", false);
		}

		// @JSONField(name = "filter")
		// @JsonProperty("filter")
		// private List<String> filter = new ArrayList<>();

		List<Organization> childList = this.getOrganizations(organization.getOrgId(), organizations);
		if (!ObjectUtils.isEmpty(childList)) {

			ArrayNode arrayNode = objectNode.putArray("children");
			for (Organization sub : childList) {
				arrayNode.add(getOrgNode(sub, organizations, orgMap));
			}

			objectNode.put("isLeaf", false);
		} else {
			objectNode.put("isLeaf", true);
		}

		return objectNode;
	}

	protected List<Organization> getOrganizations(String strPOrgId, Collection<Organization> organizations) {
		List<Organization> list = null;
		for (Organization organization : organizations) {
			if (StringUtils.hasLength(strPOrgId)) {
				if (strPOrgId.equals(organization.getParentOrgId())) {
					if (list == null) {
						list = new ArrayList<Organization>();
					}
					list.add(organization);
				}
			} else {
				if (!StringUtils.hasLength(organization.getParentOrgId())) {
					if (list == null) {
						list = new ArrayList<Organization>();
					}
					list.add(organization);
				}
			}
		}
		return list;
	}

	//
	// @GetMapping(value={"/ibzorganizations/{orgId}/suborg/ibzdepartments/picker","/sysorganizations/{orgId}/suborg/sysdepartments/picker"})
	// public ResponseEntity<List<DeptNode>>
	// getSubOrgDeptPicker(@PathVariable("orgId") String orgId)
	// {
	// List<DeptNode> list=ouCoreService.getOrgDeptNode(orgId);
	// return ResponseEntity.ok(list);
	// }
	//
	//

	//
	//
	// @GetMapping(value="/sysorganizations/{orgId}/suborg/sysdepartments")
	// public ResponseEntity<List<DepartmentDTO>>
	// getSubOrgDept(@PathVariable("orgId") String orgId ,
	// DepartmentSearchContext context)
	// {
	// List<Department> list=ouCoreService.getSubOrgDept(orgId,context);
	// return ResponseEntity.ok(DepartmentMapping.toDto(list));
	// }
	//
	// @GetMapping(value="/sysorganizations/{orgId}/suporg/sysdepartments")
	// public ResponseEntity<List<DepartmentDTO>>
	// getSupOrgDept(@PathVariable("orgId") String orgId ,
	// DepartmentSearchContext context)
	// {
	// List<Department> list=ouCoreService.getSupOrgDept(orgId,context);
	// return ResponseEntity.ok(DepartmentMapping.toDto(list));
	// }
	//
	// /**
	// * 查询同级单位的部门
	// * @param orgId
	// * @param context
	// * @return
	// */
	// @GetMapping(value="/sysorganizations/{orgId}/sameporg/sysdepartments")
	// public ResponseEntity<List<DepartmentDTO>>
	// getSameLevelDept(@PathVariable("orgId") String orgId ,
	// DepartmentSearchContext context)
	// {
	// List<Department>
	// list=ouCoreService.getSameLevelOrgDept(orgId,context,false);
	// return ResponseEntity.ok(DepartmentMapping.toDto(list));
	// }
	//
	// /**
	// * 查询同级和上级单位的部门
	// * @param orgId
	// * @param context
	// * @return
	// */
	// @GetMapping(value="/sysorganizations/{orgId}/sameporgincporg/sysdepartments")
	// public ResponseEntity<List<DepartmentDTO>>
	// getSamePorgLevelDept(@PathVariable("orgId") String orgId ,
	// DepartmentSearchContext context)
	// {
	// List<Department>
	// list=ouCoreService.getSameLevelOrgDept(orgId,context,true);
	// return ResponseEntity.ok(DepartmentMapping.toDto(list));
	// }
	//
	//
	// private Map<String, Set<String>> getMaps(String orgid,String deptid)
	// {
	// Map<String, Set<String>> map=new LinkedHashMap<>();
	// OrgMap storemap=ouCoreService.getOrgModel(orgid);
	// map.put("parentorg",storemap.getParent());
	// map.put("suborg",storemap.getSub());
	// map.put("fatherorg",storemap.getFather());
	//
	// DeptMap storedeptmap=ouCoreService.getDeptModel(deptid);
	// map.put("parentdept",storedeptmap.getParent());
	// map.put("subdept",storedeptmap.getSub());
	// map.put("fatherdept",storedeptmap.getFather());
	// return map;
	// }
	//
	//
	//
	// @RequestMapping(method = {RequestMethod.GET}, value =
	// {"/dictionarys/catalogs/Ibzou{catalog}","/dictionarys/codelist/Ibzou{catalog}"})
	// public ResponseEntity<JSONObject> getCodeList(@PathVariable("catalog")
	// String catalog, SearchContextBase context) {
	// return
	// ResponseEntity.status(HttpStatus.OK).body(getItems("Ibzou"+catalog,context));
	// }
	//
	//
	// @RequestMapping(method = {RequestMethod.GET}, value =
	// {"/dictionarys/catalogs/Ibzou{code}/options","/dictionarys/codelist/Ibzou{code}/items"})
	// public ResponseEntity<List> getCodeItems(@PathVariable("code") String
	// code, SearchContextBase context) {
	// return ResponseEntity.status(HttpStatus.OK).body((List)
	// getItems("Ibzou"+code,context).get("items"));
	// }
	//
	//
	// @RequestMapping(method = {RequestMethod.POST}, value =
	// {"/dictionarys/catalogs/Ibzou{catalog}","/dictionarys/codelist/Ibzou{catalog}"})
	// public ResponseEntity<JSONObject> codeList(@PathVariable("catalog")
	// String catalog,@RequestBody(required = false) SearchContextBase context)
	// {
	// return
	// ResponseEntity.status(HttpStatus.OK).body(getItems("Ibzou"+catalog,context));
	// }
	//
	//
	// @RequestMapping(method = {RequestMethod.POST}, value =
	// {"/dictionarys/catalogs/Ibzou{code}/options","/dictionarys/codelist/Ibzou{code}/items"})
	// public ResponseEntity<List> codeItems(@PathVariable("code") String
	// code,@RequestBody(required = false) SearchContextBase context) {
	// return ResponseEntity.status(HttpStatus.OK).body((List)
	// getItems("Ibzou"+code,context).get("items"));
	// }
	//
	//
	// public JSONObject getItems(String catalog, SearchContextBase context) {
	//
	// QueryWrapperContext searchContext=null;
	// if("IbzouOrg".equalsIgnoreCase(catalog))
	// {
	// if(context!=null)
	// searchContext=JSON.toJavaObject((JSONObject)JSON.toJSON(context.getParams()),
	// SysOrganizationSearchContext.class);
	//
	// }
	// else
	// if("IbzouDept".equalsIgnoreCase(catalog)||"IbzouOrgSector".equalsIgnoreCase(catalog))
	// {
	// if(context!=null)
	// searchContext=JSON.toJavaObject((JSONObject)JSON.toJSON(context),
	// DepartmentSearchContext.class);
	// }
	// else
	// if("IbzouUser".equalsIgnoreCase(catalog)||"IbzouOperator".equalsIgnoreCase(catalog)||"IbzouEmp".equalsIgnoreCase(catalog)||"IbzouPerson".equalsIgnoreCase(catalog))
	// {
	// if(context!=null)
	// searchContext=JSON.toJavaObject((JSONObject)JSON.toJSON(context),
	// EmployeeSearchContext.class);
	// }
	//
	// if(searchContext==null||StringUtils.isEmpty(searchContext.getSelectCond().getSqlSegment()))
	// return ouCoreService.getItems(catalog);
	// else
	// return ouCoreService.getItems(catalog,searchContext);
	//
	//
	// }
	//
	@GetMapping(value = { "/ebsx/oldou/ibzorganizations/{srfdcId}/orgtreedata", "/ebsx/oldou/sysorganizations/{srfdcId}/orgtreedata" })
	public ResponseEntity<List<ObjectNode>> fetchOrgNodesByDC(@PathVariable("srfdcId") String srfdcId) {

		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();

		if (iAuthenticationUser.getSuperuser() != 1 && iAuthenticationUser.getApiuser() != 1) {
			throw new RuntimeException("必须平台管理员才能进行此操作");
		}

		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();

		Employee employee = new Employee();
		employee.setUserId(iAuthenticationUser.getUserid());
		employee.setPersonName(iAuthenticationUser.getUsername());
		employee.setSrfdcid(srfdcId);

		IEmployeeContext iEmployeeContext = new EmployeeContext(employee, null, null);
		EmployeeContext.setCurrent(iEmployeeContext);
		try {
			return this.fetchOrgNodesByOrg(ORGID_ALL);
		} finally {

			EmployeeContext.setCurrent(lastEmployeeContext);
		}

	}

	@GetMapping(value = { "/ebsx/oldou/sysdepartments/{deptId}/emp/picker", "/ebsx/oldou/ibzdepartments/{deptId}/emp/picker", "/ebsx/oldou/ibzdepartments/{deptId}/ibzemployees/picker" })
	public ResponseEntity<List<ObjectNode>> fetchEmployeeNodeByDept(@PathVariable("deptId") String deptId) {

		EmployeeContext.getCurrentMust();
		List<ObjectNode> list = new ArrayList<ObjectNode>();

		// 获取部门全部人员
		Collection<Employee> employees = this.getCloudOUUtilRuntime().getEmployeesByDept(deptId);
		if (!ObjectUtils.isEmpty(employees)) {
			for (Employee employee : employees) {
				list.add(this.getEmployeeNode(employee));
			}
		}
		return ResponseEntity.ok(list);

	}

	//
	// @GetMapping(value={"/ebsx/oldou/sysdepartments/{deptId}/fatheremp/picker","/ebsx/oldou/ibzdepartments/{deptId}/fatheremp/picker"})
	// public ResponseEntity<List<EmpNode>>
	// getFatherEmpByDept2(@PathVariable("deptId") String deptId)
	// {
	// List<Employee> list=ouCoreService.getParentEmpByDept(deptId,false);
	// return ResponseEntity.ok(emp2NodeMapping.toDto(list));
	// }
	//
	// @GetMapping(value={"/ebsx/oldou/sysdepartments/{deptId}/parentemp/picker","/ebsx/oldou/ibzdepartments/{deptId}/parentemp/picker"})
	// public ResponseEntity<List<EmpNode>>
	// getParentEmpByDept2(@PathVariable("deptId") String deptId)
	// {
	// List<Employee> list=ouCoreService.getParentEmpByDept(deptId,true);
	// return ResponseEntity.ok(emp2NodeMapping.toDto(list));
	// }
	//
	// @GetMapping(value={"/ebsx/oldou/sysdepartments/{deptId}/subemp/picker","/ebsx/oldou/ibzdepartments/{deptId}/subemp/picker"})
	// public ResponseEntity<List<EmpNode>>
	// getSubEmpByDept2(@PathVariable("deptId") String deptId)
	// {
	// List<Employee> list=ouCoreService.getSubEmpByDept(deptId);
	// return ResponseEntity.ok(emp2NodeMapping.toDto(list));
	// }
	//
	// @GetMapping(value={"/sysorganizations/{orgId}/emp/picker","/ibzorganizations/{orgId}/emp/picker"})
	// public ResponseEntity<List<EmpNode>> getEmpByOrg2(@PathVariable("orgId")
	// String orgId)
	// {
	// List<Employee> list=ouCoreService.getEmpByOrg(orgId);
	// return ResponseEntity.ok(emp2NodeMapping.toDto(list));
	// }
	//
	// @GetMapping(value={"/sysorganizations/{orgId}/parentemp/picker","/ibzorganizations/{orgId}/parentemp/picker"})
	// public ResponseEntity<List<EmpNode>>
	// getParentEmpByOrg2(@PathVariable("orgId") String orgId)
	// {
	// List<Employee> list=ouCoreService.getParentEmpByOrg(orgId,true);
	// return ResponseEntity.ok(emp2NodeMapping.toDto(list));
	// }
	//
	// @GetMapping(value={"/sysorganizations/{orgId}/subemp/picker","/ibzorganizations/{orgId}/subemp/picker"})
	// public ResponseEntity<List<EmpNode>>
	// getSubEmpByOrg2(@PathVariable("orgId") String orgId)
	// {
	// List<Employee> list=ouCoreService.getSubEmpByOrg(orgId);
	// return ResponseEntity.ok(emp2NodeMapping.toDto(list));
	// }
	//
	// @Autowired
	// public IEmployeeService EmployeeService;
	//
	// @Autowired
	// public EmployeeMapping EmployeeMapping;
	//
	// @Autowired
	// public IDepartmentService DepartmentService;
	//
	// @Autowired
	// public IWFMemberService wfmemberService;
	//
	// @Autowired
	// public WFMemberMapping wfmemberMapping;
	//
	// @Autowired
	// public ISysOrganizationService sysorganizationService;
	//
	// @Autowired
	// @Lazy
	// public SysOrganizationMapping sysorganizationMapping;
	//
	//
	// @ApiOperation(value = "获取DEFAULT", tags = {"部门" } ,notes = "获取DEFAULT")
	// @RequestMapping(method= RequestMethod.GET ,
	// value={"/ebsx/oldou/sysdepartments/fetchdefault",
	// "/ebsx/oldou/ibzdepartments/fetchdefault"})
	// public ResponseEntity<List<DepartmentDTO>>
	// fetchdefault(DepartmentSearchContext context) {
	// Page<Department> domains = DepartmentService.searchDefault(context) ;
	// List<DepartmentDTO> list = DepartmentMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }

	// @ApiOperation(value = "获取排除数据", tags = {"部门" } ,notes = "获取排除数据")
	@RequestMapping(method = RequestMethod.GET, value = { "/ebsx/oldou/sysdepartments/fetchexclude", "/ebsx/oldou/ibzdepartments/fetchexclude" })
	public ResponseEntity<Collection<DepartmentDTO>> fetchexclude(HttpServletRequest httpServletRequest) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		try {
			Map context = RestUtils.queryString2Map(httpServletRequest.getQueryString());
			IDepartmentService iDepartmentService = EBSXSystemRuntime.getInstance().getDepartmentService();
			SearchContextDTO searchContextDTO = (SearchContextDTO) iDepartmentService.createSearchContextDTO(context);
			// searchContextDTO.eq(IDepartmentService.FIELD_SRFDCID,
			// iEmployeeContext.getTenant());
			return RestUtils.sendBackPage(iDepartmentService.fetchExclude(searchContextDTO), DepartmentDTO.class);
		} catch (Throwable ex) {
			if (ex instanceof ThrowableProblem) {
				throw (ThrowableProblem) ex;
			}
			throw new InternalServerErrorException(ex.getMessage());
		}

		//
		// Page<Department> domains = DepartmentService.searchExclude(context) ;
		// List<DepartmentDTO> list =
		// DepartmentMapping.toDto(domains.getContent());
		// return ResponseEntity.status(HttpStatus.OK)
		// .header("x-page",
		// String.valueOf(context.getPageable().getPageNumber()))
		// .header("x-per-page",
		// String.valueOf(context.getPageable().getPageSize()))
		// .header("x-total", String.valueOf(domains.getTotalElements()))
		// .body(list);
	}
	//
	// @ApiOperation(value = "根据单位机构获取DEFAULT", tags = {"部门" } ,notes =
	// "根据单位机构获取DEFAULT")
	// @RequestMapping(method= RequestMethod.GET ,
	// value={"/sysorganizations/{sysorganization_id}/sysdepartments/fetchdefault",
	// "/ibzorganizations/{sysorganization_id}/ibzdepartments/fetchdefault"})
	// public ResponseEntity<List<DepartmentDTO>>
	// fetchDepartmentDefaultBySysOrganization(@PathVariable("sysorganization_id")
	// String sysorganization_id,DepartmentSearchContext context) {
	// context.setN_orgid_eq(sysorganization_id);
	// Page<Department> domains = DepartmentService.searchDefault(context) ;
	// List<DepartmentDTO> list = DepartmentMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	// @ApiOperation(value = "根据单位机构获取排除数据", tags = {"部门" } ,notes =
	// "根据单位机构获取排除数据")
	// @RequestMapping(method= RequestMethod.GET ,
	// value={"/sysorganizations/{sysorganization_id}/sysdepartments/fetchexclude",
	// "/ibzorganizations/{sysorganization_id}/ibzdepartments/fetchexclude"})
	// public ResponseEntity<List<DepartmentDTO>>
	// fetchDepartmentExcludeBySysOrganization(@PathVariable("sysorganization_id")
	// String sysorganization_id,DepartmentSearchContext context) {
	// context.setN_orgid_eq(sysorganization_id);
	// Page<Department> domains = DepartmentService.searchExclude(context) ;
	// List<DepartmentDTO> list = DepartmentMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	//
	// @ApiOperation(value = "获取DEFAULT", tags = {"单位机构" } ,notes = "获取DEFAULT")
	// @RequestMapping(method= RequestMethod.GET ,
	// value={"/sysorganizations/fetchdefault",
	// "/ibzorganizations/fetchdefault"})
	// public ResponseEntity<List<SysOrganizationDTO>>
	// fetchdefault(SysOrganizationSearchContext context) {
	// Page<SysOrganization> domains =
	// sysorganizationService.searchDefault(context) ;
	// List<SysOrganizationDTO> list =
	// sysorganizationMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	//
	//
	// @ApiOperation(value = "获取DEFAULT", tags = {"人员" } ,notes = "获取DEFAULT")
	// @RequestMapping(method= RequestMethod.GET ,
	// value={"/ebsx/oldou/sysemployees/fetchdefault",
	// "/ebsx/oldou/ibzemployees/fetchdefault"})
	// public ResponseEntity<List<EmployeeDTO>>
	// fetchdefault(EmployeeSearchContext context) {
	// Page<Employee> domains = EmployeeService.searchDefault(context) ;
	// List<EmployeeDTO> list = EmployeeMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	//
	// @ApiOperation(value = "根据单位机构获取DEFAULT", tags = {"人员" } ,notes =
	// "根据单位机构获取DEFAULT")
	// @RequestMapping(method= RequestMethod.GET ,
	// value={"/sysorganizations/{sysorganization_id}/sysemployees/fetchdefault",
	// "/ibzorganizations/{sysorganization_id}/sysemployees/fetchdefault"})
	// public ResponseEntity<List<EmployeeDTO>>
	// fetchEmployeeDefaultBySysOrganization(@PathVariable("sysorganization_id")
	// String sysorganization_id, EmployeeSearchContext context) {
	// context.setN_orgid_eq(sysorganization_id);
	// Page<Employee> domains = EmployeeService.searchDefault(context) ;
	// List<EmployeeDTO> list = EmployeeMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	//
	//
	// @ApiOperation(value = "根据单位机构部门获取DEFAULT", tags = {"人员" } ,notes =
	// "根据单位机构部门获取DEFAULT")
	// @RequestMapping(method= RequestMethod.GET ,
	// value={"/sysorganizations/{sysorganization_id}/sysdepartments/{Department_id}/sysemployees/fetchdefault",
	// "/ibzorganizations/{sysorganization_id}/ibzdepartments/{Department_id}/ibzemployees/fetchdefault"})
	// public ResponseEntity<List<EmployeeDTO>>
	// fetchEmployeeDefaultBySysOrganizationDepartment(@PathVariable("sysorganization_id")
	// String sysorganization_id, @PathVariable("Department_id") String
	// Department_id,EmployeeSearchContext context) {
	// context.setN_mdeptid_eq(Department_id);
	// Page<Employee> domains = EmployeeService.searchDefault(context) ;
	// List<EmployeeDTO> list = EmployeeMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	//
	//
	// @ApiOperation(value = "获取DEFAULT", tags = {"成员" } ,notes = "获取DEFAULT")
	// @RequestMapping(method= RequestMethod.GET ,
	// value="/wfmembers/fetchdefault")
	// public ResponseEntity<List<WFMemberDTO>>
	// fetchdefault(WFMemberSearchContext context) {
	// Page<WFMember> domains = wfmemberService.searchDefault(context) ;
	// List<WFMemberDTO> list = wfmemberMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	// @PreAuthorize("@WFMemberRuntime.quickTest('READ')")
	// @ApiOperation(value = "获取排除数据", tags = {"成员" } ,notes = "获取排除数据")
	// @RequestMapping(method= RequestMethod.GET ,
	// value="/wfmembers/fetchexclude")
	// public ResponseEntity<List<WFMemberDTO>>
	// fetchexclude(WFMemberSearchContext context) {
	// Page<WFMember> domains = wfmemberService.searchExclude(context) ;
	// List<WFMemberDTO> list = wfmemberMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	//
	// @ApiOperation(value = "根据角色/用户组获取DEFAULT", tags = {"成员" } ,notes =
	// "根据角色/用户组获取DEFAULT")
	// @RequestMapping(method= RequestMethod.GET ,
	// value="/wfgroups/{wfgroup_id}/wfmembers/fetchdefault")
	// public ResponseEntity<List<WFMemberDTO>>
	// fetchWFMemberDefaultByWFGroup(@PathVariable("wfgroup_id") String
	// wfgroup_id, WFMemberSearchContext context) {
	// AuthenticationUser user = AuthenticationUser.getAuthenticationUser();
	// if(user == null)
	// throw new BadRequestAlertException("获取用户信息失败","","");
	// context.setN_groupid_eq(String.format("%s-%s",user.getSrfdcid(),wfgroup_id));
	// Page<WFMember> domains = wfmemberService.searchDefault(context) ;
	// List<WFMemberDTO> list = wfmemberMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	//
	// @ApiOperation(value = "根据角色/用户组获取排除数据", tags = {"成员" } ,notes =
	// "根据角色/用户组获取排除数据")
	// @RequestMapping(method= RequestMethod.GET ,
	// value="/wfgroups/{wfgroup_id}/wfmembers/fetchexclude")
	// public ResponseEntity<List<WFMemberDTO>>
	// fetchWFMemberExcludeByWFGroup(@PathVariable("wfgroup_id") String
	// wfgroup_id,WFMemberSearchContext context) {
	// AuthenticationUser user = AuthenticationUser.getAuthenticationUser();
	// if(user == null)
	// throw new BadRequestAlertException("获取用户信息失败","","");
	// context.setN_groupid_eq(String.format("%s-%s",user.getSrfdcid(),wfgroup_id));
	// Page<WFMember> domains = wfmemberService.searchExclude(context) ;
	// List<WFMemberDTO> list = wfmemberMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	//
	// @ApiOperation(value = "根据多部门/角色/用户组获取排除数据", tags = {"成员" } ,notes =
	// "根据多部门/角色/用户组获取排除数据")
	// @RequestMapping(method= RequestMethod.GET ,
	// value="/wfgroups/{wfgroup_id}/wfmembers/selectmultideptuser")
	// public ResponseEntity<List<WFMemberDTO>>
	// fetchWFMemberExcludeByWFGroupAndDept(@PathVariable("wfgroup_id") String
	// wfgroup_id,WFMemberSearchContext context) {
	// AuthenticationUser user = AuthenticationUser.getAuthenticationUser();
	// if(user == null){
	// throw new BadRequestAlertException("获取用户信息失败","","");
	// }
	// context.setN_groupid_eq(String.format("%s-%s",user.getSrfdcid(),wfgroup_id));
	// List<WFMember> domains = wfmemberService.selectMultiDeptUser(context) ;
	// List<WFMemberDTO> list = wfmemberMapping.toDto(domains);
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.size()))
	// .body(list);
	// }
	//
	// @ApiOperation(value = "根据单位机构部门人员获取DEFAULT", tags = {"成员" } ,notes =
	// "根据单位机构部门人员获取DEFAULT")
	// @RequestMapping(method= RequestMethod.GET ,
	// value={"/sysorganizations/{sysorganization_id}/sysdepartments/{Department_id}/sysemployees/{Employee_id}/wfmembers/fetchdefault",
	// "/ibzorganizations/{sysorganization_id}/ibzdepartments/{Department_id}/ibzemployees/{Employee_id}/wfmembers/fetchdefault"})
	// public ResponseEntity<List<WFMemberDTO>>
	// fetchWFMemberDefaultBySysOrganizationDepartmentEmployee(@PathVariable("sysorganization_id")
	// String sysorganization_id, @PathVariable("Department_id") String
	// Department_id, @PathVariable("Employee_id") String
	// Employee_id,WFMemberSearchContext context) {
	// context.setN_userid_eq(Employee_id);
	// Page<WFMember> domains = wfmemberService.searchDefault(context) ;
	// List<WFMemberDTO> list = wfmemberMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }
	//
	// @ApiOperation(value = "根据单位机构部门人员获取排除数据", tags = {"成员" } ,notes =
	// "根据单位机构部门人员获取排除数据")
	// @RequestMapping(method= RequestMethod.GET ,
	// value={"/sysorganizations/{sysorganization_id}/sysdepartments/{Department_id}/sysemployees/{Employee_id}/wfmembers/fetchexclude",
	// "/ibzorganizations/{sysorganization_id}/ibzdepartments/{Department_id}/ibzemployees/{Employee_id}/wfmembers/fetchexclude"})
	// public ResponseEntity<List<WFMemberDTO>>
	// fetchWFMemberExcludeBySysOrganizationDepartmentEmployee(@PathVariable("sysorganization_id")
	// String sysorganization_id, @PathVariable("Department_id") String
	// Department_id, @PathVariable("Employee_id") String
	// Employee_id,WFMemberSearchContext context) {
	// context.setN_userid_eq(Employee_id);
	// Page<WFMember> domains = wfmemberService.searchExclude(context) ;
	// List<WFMemberDTO> list = wfmemberMapping.toDto(domains.getContent());
	// return ResponseEntity.status(HttpStatus.OK)
	// .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
	// .header("x-per-page",
	// String.valueOf(context.getPageable().getPageSize()))
	// .header("x-total", String.valueOf(domains.getTotalElements()))
	// .body(list);
	// }

	
//	@GetMapping(value = { "/ebsx/oldou/test/{srfdcId}/orgtreedata", "/ebsx/oldou/test/{srfdcId}/orgtreedata" })
//	public ResponseEntity<String> fetchOrgNodesByDC2(@PathVariable("srfdcId") String srfdcId) {
//		IEmployeeContext employeeContext  = EmployeeContext.getCurrent();
//		EmployeeContext.setCurrent(null);
//		try {
//			ISysCloudClientUtilRuntime iSysCloudClientRuntime = iServiceHub.getCloudUtilRuntime(null, ISysCloudClientUtilRuntime.class, false);
//			Map<String, String> params = new HashMap<String, String>();
//			params.put("srfdcId", srfdcId);
//			String strRet = iSysCloudClientRuntime.getServiceClient("lb://ebsx-oldou").get("/ebsx/oldou/ibzorganizations/{srfdcId}/orgtreedata", params, null, null, String.class, null).getBody();
//			return ResponseEntity.ok(strRet);
//		}
//		catch (Throwable e) {
//			throw new RuntimeException(e);
//		}
//		finally{
//			EmployeeContext.setCurrent(employeeContext);
//		}
//	}
}
