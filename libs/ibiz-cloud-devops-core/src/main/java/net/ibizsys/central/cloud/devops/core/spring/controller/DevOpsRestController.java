package net.ibizsys.central.cloud.devops.core.spring.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tools.ant.filters.StringInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDevOpsUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.devops.core.IDevOpsUtilSystemRuntime;
import net.ibizsys.codegen.groovy.support.PSDataEntityExtension;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.runtime.util.EntityBase;

@RestController()
@RequestMapping("")
public class DevOpsRestController {

	private static final Log log = LogFactory.getLog(DevOpsRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		iServiceHub.registerIgnoreAuthPattern("/devcallback/**");
		iServiceHub.registerIgnoreAuthPattern("/devops/dynamodels/pssysapps/*/simple/**");

		log.debug(String.format("CloudDevOps服务已经启动"));
		iServiceHub.registerNamingService(ICloudUtilRuntime.CLOUDSERVICEURL_DEVOPS);
		if (this.iCloudDevOpsUtilRuntime == null) {
			// 通过服务网关需要注册DevOps功能组件
			iServiceHub.requireCloudUtilRuntime(IDevOpsUtilSystemRuntime.class, ICloudDevOpsUtilRuntime.class);
		}
	}

	@Autowired(required = false)
	private ICloudDevOpsUtilRuntime iCloudDevOpsUtilRuntime = null;

	protected ICloudDevOpsUtilRuntime getCloudDevOpsUtilRuntime() {
		if (this.iCloudDevOpsUtilRuntime == null) {
			try {
				this.iCloudDevOpsUtilRuntime = iServiceHub.getCloudUtilRuntime(IDevOpsUtilSystemRuntime.class, ICloudDevOpsUtilRuntime.class, false);

			} catch (Throwable ex) {
				log.error(String.format("获取CloudDevOps功能组件发生异常，%1$s", ex.getMessage()), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定CloudDevOps功能组件"), ex);
			}

		}
		return this.iCloudDevOpsUtilRuntime;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/devcallback/{system}/{action}/{token}")
	public ResponseEntity<Object> devCallback(@PathVariable("system") String system, @PathVariable("action") String action, @PathVariable("token") String token, HttpServletRequest httpServletRequest) {

		if (!this.getCloudDevOpsUtilRuntime().isEnableDevCallback()) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("DevOps组件未启用开发回调");
		}

		if (StringUtils.hasLength(this.getCloudDevOpsUtilRuntime().getCallbackToken())) {
			if (!this.getCloudDevOpsUtilRuntime().getCallbackToken().equals(token)) {
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body("回调凭证不正确");
			}
		}

		Map<String, Object> queryParams = RestUtils.queryString2Map(httpServletRequest.getQueryString());
		Object objRet = this.getCloudDevOpsUtilRuntime().executeDevSystemAction(system, action, queryParams);
		return ResponseEntity.ok(objRet);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/devcallback/srfcloudplatform/{action}/{token}")
	public ResponseEntity<Object> devCallback(@PathVariable("action") String action, @PathVariable("token") String token, @RequestBody(required = false) Map body) {

		if (!this.getCloudDevOpsUtilRuntime().isEnableDevCallback()) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("DevOps组件未启用开发回调");
		}

		if (StringUtils.hasLength(this.getCloudDevOpsUtilRuntime().getCallbackToken())) {
			if (!this.getCloudDevOpsUtilRuntime().getCallbackToken().equals(token)) {
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body("回调凭证不正确");
			}
		}

		Object objRet = this.getCloudDevOpsUtilRuntime().executeCloudPlatformAction(action, body);
		return ResponseEntity.ok(objRet);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/devops/systems/{id}/publish")
	public void publishSystem(@PathVariable("id") String id, @RequestBody(required = false) Map body) {

		if (AuthenticationUser.getCurrentMust().getSuperuser() != EntityBase.BOOLEAN_TRUE && !AuthenticationUser.isDevuser(AuthenticationUser.getCurrentMust())) {
			throw new RuntimeException("必须平台管理员才能进行此操作");
		}

		if (body == null) {
			body = new HashMap<String, Object>();
		}

		// 发布系统
		this.getCloudDevOpsUtilRuntime().publishSystem(id, body);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/devops/systems/{id}/modeldigest")
	public ResponseEntity<String> getSystemModelDigest(@PathVariable("id") String id) {

		if (AuthenticationUser.getCurrentMust().getSuperuser() != EntityBase.BOOLEAN_TRUE && !AuthenticationUser.isDevuser(AuthenticationUser.getCurrentMust()) && AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
			throw new RuntimeException("必须平台管理员才能进行此操作");
		}

		return ResponseEntity.ok(this.getCloudDevOpsUtilRuntime().getSystemModelDigest(id));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/devops/systems/{id}")
	public ResponseEntity<net.ibizsys.central.cloud.core.util.domain.System> getSystem(@PathVariable("id") String id) {

		if (AuthenticationUser.getCurrentMust().getSuperuser() != EntityBase.BOOLEAN_TRUE && !AuthenticationUser.isDevuser(AuthenticationUser.getCurrentMust()) && AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
			throw new RuntimeException("必须平台管理员才能进行此操作");
		}

		return ResponseEntity.ok(this.getCloudDevOpsUtilRuntime().getSystem(id));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/devops/systems")
	public ResponseEntity<Collection<net.ibizsys.central.cloud.core.util.domain.System>> getSystems() {

		if (AuthenticationUser.getCurrentMust().getSuperuser() != EntityBase.BOOLEAN_TRUE && !AuthenticationUser.isDevuser(AuthenticationUser.getCurrentMust()) && AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
			throw new RuntimeException("必须平台管理员才能进行此操作");
		}

		return ResponseEntity.ok(this.getCloudDevOpsUtilRuntime().getAllSystems());
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/devops/debug-systems/{id}/{method}", "/devops/debug-systems/{id}/{method}/{key}" })
	public ResponseEntity<Object> executeDebugSystemAction(@PathVariable("id") String id, @PathVariable(name = "method", required = true) String method, @PathVariable(name = "key", required = false) String key, @RequestBody(required = false) Object body) {

		if (AuthenticationUser.getCurrentMust().getSuperuser() != EntityBase.BOOLEAN_TRUE && !AuthenticationUser.isDevuser(AuthenticationUser.getCurrentMust()) && AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
			throw new RuntimeException("必须平台管理员才能进行此操作");
		}

		if (body == null) {
			body = new HashMap<String, Object>();
		}

		// 执行系统操作
		Object objRet = this.getCloudDevOpsUtilRuntime().executeDebugSystemAction(id, method, body, key);
		return ResponseEntity.ok(objRet);
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/devops/systems/{id}/{method}", "/devops/systems/{id}/{method}/{key}" })
	public ResponseEntity<Object> executeSystemAction(@PathVariable("id") String id, @PathVariable(name = "method", required = true) String method, @PathVariable(name = "key", required = false) String key, @RequestBody(required = false) Object body) {

		if (AuthenticationUser.getCurrentMust().getSuperuser() != EntityBase.BOOLEAN_TRUE && !AuthenticationUser.isDevuser(AuthenticationUser.getCurrentMust()) && AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
			throw new RuntimeException("必须平台管理员才能进行此操作");
		}

		if (body == null) {
			body = new HashMap<String, Object>();
		}

		// 执行系统操作
		Object objRet = this.getCloudDevOpsUtilRuntime().executeSystemAction(id, method, body, key);
		return ResponseEntity.ok(objRet);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/devops/dcsystems/{id}/publish")
	public void publishDCSystem(@PathVariable("id") String id, @RequestBody(required = false) Map body) {

		if (AuthenticationUser.getCurrentMust().getSuperuser() != 1) {

			if (EmployeeContext.getCurrent() != null && EmployeeContext.getCurrent().isSuperuser()) {
				// 机构管理员，判断系统归属
				DCSystem dcSystem = this.getCloudDevOpsUtilRuntime().getDCSystem(id);
				if (!dcSystem.getSrfdcid().equals(EmployeeContext.getCurrent().getTenant())) {
					// 租户不一致
					throw new RuntimeException("必须平台管理员才能进行此操作");
				}
			} else {
				throw new RuntimeException("必须平台管理员才能进行此操作");
			}
		}

		if (body == null) {
			body = new HashMap<String, Object>();
		}

		// 发布系统
		this.getCloudDevOpsUtilRuntime().publishDCSystem(id, body);
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/devops/dcsystems/{id}/{method}", "/devops/dcsystems/{id}/{method}/{key}" })
	public ResponseEntity<Object> executeDCSystemAction(@PathVariable("id") String id, @PathVariable(name = "method", required = true) String method, @PathVariable(name = "key", required = false) String key, @RequestBody(required = false) Object body) {

		if (AuthenticationUser.getCurrentMust().getSuperuser() != 1) {

			if (EmployeeContext.getCurrent() != null && EmployeeContext.getCurrent().isSuperuser()) {
				// 机构管理员，判断系统归属
				DCSystem dcSystem = this.getCloudDevOpsUtilRuntime().getDCSystem(id);
				if (!dcSystem.getSrfdcid().equals(EmployeeContext.getCurrent().getTenant())) {
					// 租户不一致
					throw new RuntimeException("必须平台管理员才能进行此操作");
				}
			} else {
				throw new RuntimeException("必须平台管理员才能进行此操作");
			}
		}

		if (body == null) {
			body = new HashMap<String, Object>();
		}

		// 执行系统操作
		Object objRet = this.getCloudDevOpsUtilRuntime().executeDCSystemAction(id, method, body, key);
		return ResponseEntity.ok(objRet);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = { "/devops/dynamodelapi/{id}/{model}", "/devops/dynamodelapi/{id}/{model}/{key}", "/devops/dynamodelapi/{id}/{model}/{key}/{method}",
			"/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}", "/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}/{key}", "/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}/{key}/{method}",
			"/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}", "/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}", "/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}/{method}"})
	public ResponseEntity<Object> invokeDynaModelAPIGetMethod(@PathVariable("id") String id, @PathVariable(name = "model", required = true) String model
			, @PathVariable(name = "key", required = false) String key
			, @PathVariable(name = "method", required = false) String method, HttpServletRequest req, HttpServletResponse response) {
		return ResponseEntity.ok(invokeDynaModelAPI(id, null, null, model, key, StringUtils.hasLength(method)?method:"GET", null, req, response));
	}
	
	@RequestMapping(method = RequestMethod.GET, value = { "/devops/dynamodelapi/{id}/{model}/fetch{method}"
			,"/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}/fetch{method}"
			,"/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/fetch{method}"
	})
	public ResponseEntity<?> invokeDynaModelAPIFetchMethod(@PathVariable("id") String id, @PathVariable(name = "pmodel", required = false) String pmodel, @PathVariable(name = "pkey", required = false) String pkey
			, @PathVariable(name = "model", required = true) String model
			, @PathVariable(name = "method", required = true) String method, HttpServletRequest req, HttpServletResponse response) {
		Object ret = invokeDynaModelAPI(id, pmodel, pkey, model, null, "fetch"+method, null, req, response);
		if(ret instanceof Page) {
			return RestUtils.sendBackPage((Page)ret);
		}
		return ResponseEntity.ok(ret);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = { "/devops/dynamodelapi/{id}/{model}/fetch{method}"
			,"/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}/fetch{method}"
			,"/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/fetch{method}"
	})
	public ResponseEntity<?> invokeDynaModelAPIFetchMethod(@PathVariable("id") String id, @PathVariable(name = "pmodel", required = false) String pmodel, @PathVariable(name = "pkey", required = false) String pkey
			, @PathVariable(name = "model", required = true) String model
			, @PathVariable(name = "method", required = true) String method, @RequestBody(required = false) Object body, HttpServletRequest req, HttpServletResponse response) {
		Object ret = invokeDynaModelAPI(id, pmodel, pkey, model, null, "fetch"+method, body, req, response);
		if(ret instanceof Page) {
			return RestUtils.sendBackPage((Page)ret);
		}
		return ResponseEntity.ok(ret);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = { "/devops/dynamodelapi/{id}/{model}/{key}", "/devops/dynamodelapi/{id}/{model}/{key}/{method}"
			,"/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}/{key}", "/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}/{key}/{method}"
			,"/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}", "/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}/{method}"})
	public ResponseEntity<Object> invokeDynaModelAPIPostMethod(@PathVariable("id") String id, @PathVariable(name = "model", required = true) String model
			, @PathVariable(name = "key", required = false) String key
			, @PathVariable(name = "method", required = false) String method
			, @RequestBody(required = false) Object body
			, HttpServletRequest req, HttpServletResponse response) {
		return ResponseEntity.ok(invokeDynaModelAPI(id, null, null, model, key, StringUtils.hasLength(method)?method:"CREATE", body, req, response));
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = { "/devops/dynamodelapi/{id}/{model}/{key}", "/devops/dynamodelapi/{id}/{model}/{key}/{method}"
			,"/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}/{key}", "/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}/{key}/{method}"
			,"/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}", "/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}/{method}"})
	public ResponseEntity<Object> invokeDynaModelAPIPutMethod(@PathVariable("id") String id, @PathVariable(name = "model", required = true) String model
			, @PathVariable(name = "key", required = false) String key
			, @PathVariable(name = "method", required = false) String method
			, @RequestBody(required = false) Object body
			, HttpServletRequest req, HttpServletResponse response) {
		return ResponseEntity.ok(invokeDynaModelAPI(id, null, null, model, key, StringUtils.hasLength(method)?method:"UPDATE", body, req, response));
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = { "/devops/dynamodelapi/{id}/{model}/{key}", "/devops/dynamodelapi/{id}/{model}/{key}/{method}"
			,"/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}/{key}", "/devops/dynamodelapi/{id}/{pmodel}/{pkey}/{model}/{key}/{method}"
			,"/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}", "/devops/dynamodelapi/{id}/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}/{method}"})
	public ResponseEntity<Object> invokeDynaModelAPIDeleteMethod(@PathVariable("id") String id, @PathVariable(name = "model", required = true) String model
			, @PathVariable(name = "key", required = false) String key
			, @PathVariable(name = "method", required = false) String method
			, HttpServletRequest req, HttpServletResponse response) {
		return ResponseEntity.ok(invokeDynaModelAPI(id, null, null, model, key, StringUtils.hasLength(method)?method:"REMOVE", null, req, response));
	}
	
	protected Object invokeDynaModelAPI(String id, String pmodel, String pkey, String model
			, String key
			, String method
			, Object body
			, HttpServletRequest req, HttpServletResponse response) {
		
		if (AuthenticationUser.getCurrentMust().getSuperuser() != 1) {
			throw new RuntimeException("必须平台管理员才能进行此操作");
		}
		
		if(body==null) {
			body = RestUtils.queryString2Map(req.getQueryString());
		}
		
		return this.getCloudDevOpsUtilRuntime().invokeDynaModelAPI(id, pmodel, pkey, model, method, key, body);
	}
	

	@RequestMapping(method = RequestMethod.POST, value = "/devops/dynamodels/{id}/publish")
	public void publishDynaModel(@PathVariable("id") String id, @RequestBody(required = false) Map body) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		if (!StringUtils.hasLength(iEmployeeContext.getTenant()) || !iEmployeeContext.isSuperuser()) {
			throw new RuntimeException("必须机构管理员才能进行此操作");
		}

		if (body == null) {
			body = new HashMap<String, Object>();
		}
		// 发布动态模型
		this.getCloudDevOpsUtilRuntime().publishDynaModel(id, body);

	}

	@GetMapping(value = "/devops/dynamodels/pssysapps/{app}/**")
	@ResponseStatus(HttpStatus.OK)
	public void downloadAppDynaModel(@PathVariable("app") String app, HttpServletRequest req, HttpServletResponse response) throws IOException {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		String strUri = req.getRequestURI();
		strUri = strUri.substring(28);

		// 如指定查询内容则默认为缓存标记
		String strCacheTag = req.getQueryString();
		File configFile = null;
		if (strUri.indexOf("PSSYSAPP.hub.json") != -1) {
			configFile = this.getCloudDevOpsUtilRuntime().getHubAppDynaModelFile(iEmployeeContext.getSystemid(), iEmployeeContext.getOrgid(), app);
			// 关闭缓存
			strCacheTag = null;
		} else {
			String strConfigPath = this.getCloudDevOpsUtilRuntime().getMetaDynaModelPath(iEmployeeContext.getSystemid(), iEmployeeContext.getOrgid());
			configFile = new File(strConfigPath + "/PSSYSAPPS" + strUri);
		}

		if (!configFile.exists()) {
			response.sendError(HttpStatus.NOT_FOUND.value());
			return;
		}

		if (!StringUtils.hasLength(strCacheTag)) {
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "0");
		} else {
			response.setHeader("Cache-Control", "max-age=2592000");
		}

		String strAcceptEncoding = req.getHeader(HttpHeaders.ACCEPT_ENCODING);
		boolean bGZip = false;
		if (StringUtils.hasLength(strAcceptEncoding)) {
			bGZip = strAcceptEncoding.indexOf("gzip") != -1;
		}

		response.setHeader("charset", "utf-8");
		response.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", configFile.getName(), getFileName(configFile.getName())));
		response.setContentType("application/json;charset=UTF-8");
		if (bGZip) {
			response.setHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
		}
		// response.setContentType("application/json");

		this.sendRespose(response, configFile, bGZip);
	}

	@GetMapping(value = "/devops/dynamodels/pssysapps/{app}/subapps/{subapp}/**")
	@ResponseStatus(HttpStatus.OK)
	public void downloadAppSubAppModel(@PathVariable("app") String app, @PathVariable("subapp") String subapp, HttpServletRequest req, HttpServletResponse response) throws IOException {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		String strUri = req.getRequestURI();
		strUri = strUri.substring(28);
		
		strUri = strUri.substring(app.length() + 9);
		strUri = strUri.substring(subapp.length() + 1);

		// 如指定查询内容则默认为缓存标记
		String strCacheTag = req.getQueryString();

		// String strConfigPath =
		// "C:\\SRFEX_FILE\\dynamodelpath\\c41\\c41782efc3d9c3a3ff2a683467320d72";
		String strConfigPath = this.getCloudDevOpsUtilRuntime().getHubSubAppDynaModelPath(iEmployeeContext.getSystemid(), iEmployeeContext.getOrgid(), app, subapp);

		File configFile = new File(strConfigPath + strUri);
		if (!configFile.exists()) {
			response.sendError(HttpStatus.NOT_FOUND.value());
			return;
		}

		if (!StringUtils.hasLength(strCacheTag)) {
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "0");
		} else {
			response.setHeader("Cache-Control", "max-age=2592000");
		}

		String strAcceptEncoding = req.getHeader(HttpHeaders.ACCEPT_ENCODING);
		boolean bGZip = false;
		if (StringUtils.hasLength(strAcceptEncoding)) {
			bGZip = strAcceptEncoding.indexOf("gzip") != -1;
		}

		response.setHeader("charset", "utf-8");
		response.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", configFile.getName(), getFileName(configFile.getName())));
		response.setContentType("application/json;charset=UTF-8");
		if (bGZip) {
			response.setHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
		}
		// response.setContentType("application/json");

		this.sendRespose(response, configFile, bGZip);
	}

	@GetMapping(value = "/devops/dynamodels/pssysapps/{app}/simple/**")
	@ResponseStatus(HttpStatus.OK)
	public void downloadAppSimpleModel(@RequestHeader(value = "srfdcsystem") String srfdcsystem, @PathVariable("app") String app, HttpServletRequest req, HttpServletResponse response) throws IOException {

		String strUri = req.getRequestURI();
		strUri = strUri.substring(28);

		strUri = strUri.substring(app.length() + 8);
		strUri = "/" + app + strUri;

		if (strUri.indexOf(".simple.json") == -1) {
			response.sendError(HttpStatus.FORBIDDEN.value());
			return;
		}

		// 如指定查询内容则默认为缓存标记
		String strCacheTag = req.getQueryString();

		// String strConfigPath =
		// "C:\\SRFEX_FILE\\dynamodelpath\\c41\\c41782efc3d9c3a3ff2a683467320d72";
		String strConfigPath = this.getCloudDevOpsUtilRuntime().getMetaDynaModelPath(srfdcsystem);

		File configFile = new File(strConfigPath + "/PSSYSAPPS" + strUri);
		if (!configFile.exists()) {
			response.sendError(HttpStatus.NOT_FOUND.value());
			return;
		}

		if (!StringUtils.hasLength(strCacheTag)) {
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "0");
		} else {
			response.setHeader("Cache-Control", "max-age=2592000");
		}

		String strAcceptEncoding = req.getHeader(HttpHeaders.ACCEPT_ENCODING);
		boolean bGZip = false;
		if (StringUtils.hasLength(strAcceptEncoding)) {
			bGZip = strAcceptEncoding.indexOf("gzip") != -1;
		}

		response.setHeader("charset", "utf-8");
		response.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", configFile.getName(), getFileName(configFile.getName())));
		response.setContentType("application/json;charset=UTF-8");
		if (bGZip) {
			response.setHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
		}
		// response.setContentType("application/json");

		this.sendRespose(response, configFile, bGZip);
	}
	
	@GetMapping(value = "/devops/jsonschemas/pssysapps/{app}/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void downloadAppDEJsonSchema(@PathVariable("app") String app, @PathVariable("id") String id, HttpServletRequest req, HttpServletResponse response) throws IOException {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		
		String strConfigPath = this.getCloudDevOpsUtilRuntime().getMetaDynaModelPath(iEmployeeContext.getSystemid(), iEmployeeContext.getOrgid());
		//String strConfigPath = "E:\\Workspace\\idea\\LS\\ls-core\\src\\main\\resources\\model\\com\\sa\\szpg";
		
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(strConfigPath, false);
		
		IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();
		java.util.List<IPSApplication> psApplicationList = iPSSystem.getAllPSApps();
		if(ObjectUtils.isEmpty(psApplicationList)) {
			response.sendError(HttpStatus.NOT_FOUND.value());
			return;
		}
		
		IPSApplication iPSApplication = null;
		for(IPSApplication item : psApplicationList) {
			if(!StringUtils.hasLength(item.getPKGCodeName())) {
				continue;
			}
			if(item.getPKGCodeName().equalsIgnoreCase(app)) {
				iPSApplication = item;
				break;
			}
		}
		
		if(iPSApplication == null) {
			response.sendError(HttpStatus.NOT_FOUND.value());
			return;
		}
		
		java.util.List<IPSAppDataEntity> psAppDataEntityList = iPSApplication.getAllPSAppDataEntities();
		if(ObjectUtils.isEmpty(psAppDataEntityList)) {
			response.sendError(HttpStatus.NOT_FOUND.value());
			return;
		}
		
		IPSAppDataEntity iPSAppDataEntity = null;
		for(IPSAppDataEntity item : psAppDataEntityList) {
			if(!StringUtils.hasLength(item.getCodeName())) {
				continue;
			}
			if(item.getCodeName().equalsIgnoreCase(id)) {
				iPSAppDataEntity = item;
				break;
			}
		}
		
		if(iPSAppDataEntity == null) {
			response.sendError(HttpStatus.NOT_FOUND.value());
			return;
		}
		
		String strContent = PSDataEntityExtension.getJsonSchema(iPSAppDataEntity);
		// 如指定查询内容则默认为缓存标记
		String strCacheTag = req.getQueryString();
		if (!StringUtils.hasLength(strCacheTag)) {
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "0");
		} else {
			response.setHeader("Cache-Control", "max-age=2592000");
		}
		

		String strAcceptEncoding = req.getHeader(HttpHeaders.ACCEPT_ENCODING);
		boolean bGZip = false;
		if (StringUtils.hasLength(strAcceptEncoding)) {
			bGZip = strAcceptEncoding.indexOf("gzip") != -1;
		}

		String strFileName = iPSAppDataEntity.getCodeName()+".json";
		
		response.setHeader("charset", "utf-8");
		response.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, getFileName(strFileName)));
		response.setContentType("application/json;charset=UTF-8");
		if (bGZip) {
			response.setHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
		}
		// response.setContentType("application/json");

		this.sendRespose(response, strContent, bGZip);
	}
	

	protected void sendRespose(HttpServletResponse response, File file, boolean bGZip) {
		BufferedInputStream bis = null;
		// BufferedOutputStream bos = null;
		OutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			// bos = new BufferedOutputStream(response.getOutputStream());
			if (bGZip) {
				bos = new GZIPOutputStream(response.getOutputStream());
			} else {
				bos = new BufferedOutputStream(response.getOutputStream());
			}

			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
			if (bGZip && bos instanceof GZIPOutputStream) {
				((GZIPOutputStream) bos).finish();
			}
		} catch (Exception e) {
			// throw e;
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {

				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {

				}
			}
		}
	}
	
	protected void sendRespose(HttpServletResponse response, String strContent, boolean bGZip) {
		BufferedInputStream bis = null;
		// BufferedOutputStream bos = null;
		OutputStream bos = null;
		try {
			bis = new BufferedInputStream(new StringInputStream(strContent, "UTF-8"));
			// bos = new BufferedOutputStream(response.getOutputStream());
			if (bGZip) {
				bos = new GZIPOutputStream(response.getOutputStream());
			} else {
				bos = new BufferedOutputStream(response.getOutputStream());
			}

			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
			if (bGZip && bos instanceof GZIPOutputStream) {
				((GZIPOutputStream) bos).finish();
			}
		} catch (Exception e) {
			// throw e;
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {

				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {

				}
			}
		}
	}

	//
	protected String getFileName(String fileName) {
		try {
			return new String(fileName.getBytes("utf-8"), "iso8859-1");// 防止中文乱码
		} catch (UnsupportedEncodingException ex) {
			log.error(ex);
		}
		return fileName;
	}

}
