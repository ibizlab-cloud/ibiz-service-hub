package net.ibizsys.central.cloud.saas.core.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.saas.core.ISaaSUtilSystemRuntime;

@RestController()
@RequestMapping("")
public class SaaSRestController {

	private static final Log log = LogFactory.getLog(SaaSRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("CloudSaaS服务已经启动"));
		iServiceHub.registerNamingService("ibizcloud-saas");
	}


	
	private ICloudSaaSUtilRuntime iCloudSaaSUtilRuntime = null;

	protected ICloudSaaSUtilRuntime getCloudSaaSUtilRuntime() {
		if (this.iCloudSaaSUtilRuntime == null) {
			try {
				this.iCloudSaaSUtilRuntime = iServiceHub.getCloudUtilRuntime(ISaaSUtilSystemRuntime.class, ICloudSaaSUtilRuntime.class, false);
			}
			catch(Throwable ex) {
				log.error(String.format("未指定Cloud体系SaaS功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud体系SaaS功能模块"), ex);
			}
		}
		return this.iCloudSaaSUtilRuntime;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/saas/{func}/{id}/{method}")
	public Object invokeSaaSFunc(@PathVariable("func") String func, @PathVariable("id") String id, @PathVariable("method") String method, @RequestBody(required = false) Map body) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
//		if (!StringUtils.hasLength(iEmployeeContext.getTenant()) || !iEmployeeContext.isSuperuser()) {
//			throw new RuntimeException("必须机构管理员才能进行此操作");
//		}

		if (body == null) {
			body = new HashMap<String, Object>();
		}
		
		return this.getCloudSaaSUtilRuntime().invokeSaaSFunc(func, id, method, body);
	}
	
//	@GetMapping(value = "/uaa/getbydcsystem/{srfdcsystem}")
//	public ResponseEntity<List<OrgSystem>> getOrgSystems(@PathVariable("srfdcsystem") String srfdcsystem) {
//		IAuthenticationUser authenticationUser = AuthenticationUser.getCurrentMust();
//
//		//String strDCId = this.getCloudSaaSUtilRuntime().getDCId(srfdcsystem, authenticationUser.getUserid());
//
//		List<OrgSystem> orgSystemList = this.getCloudSaaSUtilRuntime().getOrgSystems(srfdcsystem, authenticationUser.getUserid());
//		// 欠缺权限
//
//		if (ObjectUtils.isEmpty(orgSystemList)) {
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
//		}
//
//		return ResponseEntity.ok().body(orgSystemList);
//	}
//
//	@GetMapping(value = "/appdata")
//	public ResponseEntity<AppData> getAppData(@RequestHeader(value="srfsystemid",defaultValue="undefined") String srfsystemid,
//			@RequestHeader(value="srforgid",defaultValue="undefined") String srforgid) {
//		if("undefined".equals(srfsystemid)) {
//			srfsystemid = null;
//		}
//		if("undefined".equals(srforgid)) {
//			srforgid = null;
//		}
//		
//		IAuthenticationUser authenticationUser = AuthenticationUser.getCurrentMust();
//		AppData appData =this.getCloudSaaSUtilRuntime().getAppData(srfsystemid, srforgid, authenticationUser);
//	
//		return ResponseEntity.ok().body(appData);
//	}
}
