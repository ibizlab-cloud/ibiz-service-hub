package net.ibizsys.central.cloud.core.spring.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tools.ant.filters.StringInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.IHubSysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUtilContainerOnly;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.util.Inflector;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

@RestController()
@RequestMapping("")
@ConditionalOnProperty(prefix = "ibiz.servicehub", name = "extensiongateway", havingValue = "true", matchIfMissing = true)
public class ExtensionGatewayRestController {

	private static final Log log = LogFactory.getLog(ExtensionGatewayRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		iServiceHub.registerIgnoreAuthPattern("/*/extension/dynamodels/pssysapps/*/simple/**");
		iServiceHub.registerIgnoreAuthPattern("/*/extension/webhooks/**");
	}

	@RequestMapping(method = RequestMethod.GET, value = { "/{id}/extension/webhooks/{key}" })
	public ResponseEntity<Object> invokeWebHook(@PathVariable("id") String id, @PathVariable(name = "key") String key, HttpServletRequest req, HttpServletResponse response) {

		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);

			Object param = RestUtils.queryString2Map(req.getQueryString());
			Object ret = null;

			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				ret = ((IHubSysExtensionUtilRuntime) iSysExtensionUtilRuntime).invokeWebHook(iSystemRuntime, key, param);
			} else {
				ret = iSysExtensionUtilRuntime.invokeWebHook(key, param);
			}
			return ResponseEntity.ok(ret);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = { "/{id}/extension/dynamodelapi/{model}", "/{id}/extension/dynamodelapi/{model}/{key}", "/{id}/extension/dynamodelapi/{model}/{key}/{method}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}/{key}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}/{key}/{method}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}/{method}" })
	public ResponseEntity<Object> invokeDynaModelAPIGetMethod(@PathVariable("id") String id, @PathVariable(name = "model", required = true) String model, @PathVariable(name = "key", required = false) String key, @PathVariable(name = "method", required = false) String method, HttpServletRequest req, HttpServletResponse response) {
		return ResponseEntity.ok(invokeDynaModelAPI(id, null, null, model, key, StringUtils.hasLength(method) ? method : "GET", null, req, response));
	}

	@RequestMapping(method = RequestMethod.GET, value = { "/{id}/extension/dynamodelapi/{model}/fetch{method}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}/fetch{method}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/fetch{method}" })
	public ResponseEntity<?> invokeDynaModelAPIFetchMethod(@PathVariable("id") String id, @PathVariable(name = "pmodel", required = false) String pmodel, @PathVariable(name = "pkey", required = false) String pkey, @PathVariable(name = "model", required = true) String model, @PathVariable(name = "method", required = true) String method, HttpServletRequest req, HttpServletResponse response) {
		Object ret = invokeDynaModelAPI(id, pmodel, pkey, model, null, "fetch" + method, null, req, response);
		if (ret instanceof Page) {
			return RestUtils.sendBackPage((Page) ret);
		}
		return ResponseEntity.ok(ret);
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/{id}/extension/dynamodelapi/{model}/fetch{method}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}/fetch{method}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/fetch{method}" })
	public ResponseEntity<?> invokeDynaModelAPIFetchMethod(@PathVariable("id") String id, @PathVariable(name = "pmodel", required = false) String pmodel, @PathVariable(name = "pkey", required = false) String pkey, @PathVariable(name = "model", required = true) String model, @PathVariable(name = "method", required = true) String method, @RequestBody(required = false) Object body, HttpServletRequest req, HttpServletResponse response) {
		Object ret = invokeDynaModelAPI(id, pmodel, pkey, model, null, "fetch" + method, body, req, response);
		if (ret instanceof Page) {
			return RestUtils.sendBackPage((Page) ret);
		}
		return ResponseEntity.ok(ret);
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/{id}/extension/dynamodelapi/{model}", "/{id}/extension/dynamodelapi/{model}/{key}", "/{id}/extension/dynamodelapi/{model}/{key}/{method}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}/{key}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}/{key}/{method}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}/{method}" })
	public ResponseEntity<Object> invokeDynaModelAPIPostMethod(@PathVariable("id") String id, @PathVariable(name = "model", required = true) String model, @PathVariable(name = "key", required = false) String key, @PathVariable(name = "method", required = false) String method, @RequestBody(required = false) Object body, HttpServletRequest req, HttpServletResponse response) {
		return ResponseEntity.ok(invokeDynaModelAPI(id, null, null, model, key, StringUtils.hasLength(method) ? method : "CREATE", body, req, response));
	}

	@RequestMapping(method = RequestMethod.PUT, value = { "/{id}/extension/dynamodelapi/{model}/{key}", "/{id}/extension/dynamodelapi/{model}/{key}/{method}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}/{key}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}/{key}/{method}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}/{method}" })
	public ResponseEntity<Object> invokeDynaModelAPIPutMethod(@PathVariable("id") String id, @PathVariable(name = "model", required = true) String model, @PathVariable(name = "key", required = false) String key, @PathVariable(name = "method", required = false) String method, @RequestBody(required = false) Object body, HttpServletRequest req, HttpServletResponse response) {
		return ResponseEntity.ok(invokeDynaModelAPI(id, null, null, model, key, StringUtils.hasLength(method) ? method : "UPDATE", body, req, response));
	}

	@RequestMapping(method = RequestMethod.DELETE, value = { "/{id}/extension/dynamodelapi/{model}/{key}", "/{id}/extension/dynamodelapi/{model}/{key}/{method}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}/{key}", "/{id}/extension/dynamodelapi/{pmodel}/{pkey}/{model}/{key}/{method}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}", "/{id}/extension/dynamodelapi/{ppmodel}/{ppkey}/{pmodel}/{pkey}/{model}/{key}/{method}" })
	public ResponseEntity<Object> invokeDynaModelAPIDeleteMethod(@PathVariable("id") String id, @PathVariable(name = "model", required = true) String model, @PathVariable(name = "key", required = false) String key, @PathVariable(name = "method", required = false) String method, HttpServletRequest req, HttpServletResponse response) {
		return ResponseEntity.ok(invokeDynaModelAPI(id, null, null, model, key, StringUtils.hasLength(method) ? method : "REMOVE", null, req, response));
	}

	protected Object invokeDynaModelAPI(String id, String pmodel, String pkey, String model, String key, String method, Object body, HttpServletRequest req, HttpServletResponse response) {

		// if(EmployeeContext.getCurrentMust().isSuperuser()) {
		// throw new RuntimeException("必须系统管理员才能进行此操作");
		// }
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
			if (body == null) {
				body = RestUtils.queryString2Map(req.getQueryString());
			}
			
			//处理应用上下文
			Map<String, String> context = getDynaModelAPIAppContext(id, req.getRequestURI(), model);
			if(!ObjectUtils.isEmpty(context)) {
				IAppContext iAppContext = UserContext.getCurrentMust().getAppContext();
				if (iAppContext == null) {
					iAppContext = new AppContext();
					UserContext.getCurrentMust().setAppContext(iAppContext);
				}
				
				for(java.util.Map.Entry<String, String> entry : context.entrySet()) {
					iAppContext.set(entry.getKey(), entry.getValue());
				}
			}

			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				return ((IHubSysExtensionUtilRuntime) iSysExtensionUtilRuntime).invokeDynaModelAPI(iSystemRuntime, pmodel, pkey, model, method, key, body);
			} else {
				return iSysExtensionUtilRuntime.invokeDynaModelAPI(pmodel, pkey, model, method, key, body);
			}
		}
		finally {
			SystemRuntimeHolder.poll();
		}
		
	}
	
	protected Map<String, String> getDynaModelAPIAppContext(String id, String strUrl, String strModel){
		String strBaseUrl = String.format("/%1$s/extension/dynamodelapi", id).toLowerCase();
		int nPos = strUrl.indexOf(strBaseUrl);
		if(nPos != 0) {
			return null;
		}
		
		String strRealUrl = strUrl.substring(strBaseUrl.length() + 1);
		if(!StringUtils.hasLength(strRealUrl)) {
			return null;
		}
		//按照 / 分隔
		String[] items = strRealUrl.split("[/]");
		
		Map<String, String> context = new LinkedHashMap<String, String>();
		
		for(int i = 0;i<items.length/2;i++) {
			String strDEServiceCodeName = items[i*2];
			String strValue = items[i*2+1];
			
			
			if(strDEServiceCodeName.equals(strModel)) {
				break;
			}
			
			String strPModel = Inflector.getInstance().singularize(strDEServiceCodeName);
			context.put(strPModel.toUpperCase(), strValue);
		}
		
		return context;
	}

	@GetMapping(value = "/{id}/extension/jsonschemas/pssysapps/{app}/{appde}")
	@ResponseStatus(HttpStatus.OK)
	public void downloadAppDataEntityJsonSchema(@PathVariable("id") String id, @PathVariable("app") String app, @PathVariable("appde") String appde, HttpServletRequest req, HttpServletResponse response) throws IOException {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
	
			Object param = RestUtils.queryString2Map(req.getQueryString());
			File configFile = null;
	
			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				configFile = ((IHubSysExtensionUtilRuntime) iSysExtensionUtilRuntime).getAppDataEntityJsonSchema(iSystemRuntime, app, appde, param, true);
			} else {
				configFile = iSysExtensionUtilRuntime.getAppDataEntityJsonSchema(app, appde, param, true);
			}
	
			if (configFile == null || !configFile.exists()) {
				response.sendError(HttpStatus.NOT_FOUND.value());
				return;
			}
	
			// 如指定查询内容则默认为缓存标记
			String strCacheTag = req.getQueryString();
			if (StringUtils.hasLength(strCacheTag)) {
				strCacheTag = null;
				if(param instanceof Map) {
					strCacheTag = (String)((Map)param).get("dynamodeltag");
				}
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
			this.sendRespose(response, configFile, bGZip);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
		
	}

	@GetMapping(value = "/{id}/extension/dynamodels/pssysapps/{app}/**")
	@ResponseStatus(HttpStatus.OK)
	public void downloadAppDynaModel(@PathVariable("id") String id, @PathVariable("app") String app, HttpServletRequest req, HttpServletResponse response) throws IOException {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		String strUri = req.getRequestURI();
		strUri = strUri.substring(32 + id.length());

		Object param = RestUtils.queryString2Map(req.getQueryString());

		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
	
			File configFile = null;
			String strCacheTag = req.getQueryString();
	
			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				if (strUri.indexOf("PSSYSAPP.hub.json") != -1) {
					configFile = ((IHubSysExtensionUtilRuntime) iSysExtensionUtilRuntime).getHubAppDynaModelFile(iSystemRuntime, app, param, true);
					// 关闭缓存
					strCacheTag = null;
				} else {
					configFile = ((IHubSysExtensionUtilRuntime) iSysExtensionUtilRuntime).getAppDynaModelFile(iSystemRuntime, app, strUri, param, true);
				}
			} else {
				if (strUri.indexOf("PSSYSAPP.hub.json") != -1) {
					configFile = iSysExtensionUtilRuntime.getHubAppDynaModelFile(app, param, true);
					// 关闭缓存
					strCacheTag = null;
				} else {
					configFile = iSysExtensionUtilRuntime.getAppDynaModelFile(app, strUri, param, true);
				}
			}
	
			if (configFile == null || !configFile.exists()) {
				response.sendError(HttpStatus.NOT_FOUND.value());
				return;
			}
	
			if (StringUtils.hasLength(strCacheTag)) {
				strCacheTag = null;
				if(param instanceof Map) {
					strCacheTag = (String)((Map)param).get("dynamodeltag");
				}
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
		finally {
			SystemRuntimeHolder.poll();
		}
	}

	@GetMapping(value = "/{id}/extension/dynamodels/pssysapps/{app}/simple/**")
	@ResponseStatus(HttpStatus.OK)
	public void downloadAppSimpleModel(@PathVariable("id") String id, @PathVariable("app") String app, HttpServletRequest req, HttpServletResponse response) throws IOException {

		String strUri = req.getRequestURI();
		strUri = strUri.substring(32 + id.length());

		strUri = strUri.substring(app.length() + 8);
		strUri = "/" + app + strUri;

		if (strUri.indexOf(".simple.json") == -1) {
			response.sendError(HttpStatus.FORBIDDEN.value());
			return;
		}

		// 如指定查询内容则默认为缓存标记
		String strCacheTag = req.getQueryString();

		Object param = RestUtils.queryString2Map(req.getQueryString());
		
		// String strConfigPath =
		// "C:\\SRFEX_FILE\\dynamodelpath\\c41\\c41782efc3d9c3a3ff2a683467320d72";
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
			
			File configFile = null;
			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				configFile = ((IHubSysExtensionUtilRuntime) iSysExtensionUtilRuntime).getAppSimpleModelFile(iSystemRuntime, app, strUri, param, true);
			} else {
				configFile = iSysExtensionUtilRuntime.getAppSimpleModelFile(app, strUri, param, true);
			}
	
			if (configFile == null || !configFile.exists()) {
				response.sendError(HttpStatus.NOT_FOUND.value());
				return;
			}

//			String strConfigPath = iSystemRuntime.getPSSystemService().getPSModelFolderPath();// this.getCloudDevOpsUtilRuntime().getMetaDynaModelPath(srfdcsystem);
//	
//			File configFile = new File(strConfigPath + "/PSSYSAPPS" + strUri);
//			if (!configFile.exists()) {
//				response.sendError(HttpStatus.NOT_FOUND.value());
//				return;
//			}
	
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
		finally {
			SystemRuntimeHolder.poll();
		}
	}

	@GetMapping(value = "/{id}/extension/dynamodels/pssysapps/{app}/subapps/{subapp}/**")
	@ResponseStatus(HttpStatus.OK)
	public void downloadHubSubAppModel(@PathVariable("id") String id, @PathVariable("app") String app, @PathVariable("subapp") String subapp, HttpServletRequest req, HttpServletResponse response) throws IOException {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		String strUri = req.getRequestURI();
		strUri = strUri.substring(32 + id.length());

		strUri = strUri.substring(app.length() + 9);
		strUri = strUri.substring(subapp.length() + 1);

		// 如指定查询内容则默认为缓存标记
		String strCacheTag = req.getQueryString();
		Object param = RestUtils.queryString2Map(req.getQueryString());

		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
	
			File configFile = null;
			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				configFile = ((IHubSysExtensionUtilRuntime) iSysExtensionUtilRuntime).getHubSubAppDynaModelFile(iSystemRuntime, app, subapp, strUri, param, true);
			} else {
				configFile = iSysExtensionUtilRuntime.getHubSubAppDynaModelFile(app, subapp, strUri, param, true);
			}
	
			if (configFile == null || !configFile.exists()) {
				response.sendError(HttpStatus.NOT_FOUND.value());
				return;
			}
			//String strCacheTag = null;
			if (StringUtils.hasLength(strCacheTag)) {
				strCacheTag = null;
				if(param instanceof Map) {
					strCacheTag = (String)((Map)param).get("dynamodeltag");
				}
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
			this.sendRespose(response, configFile, bGZip);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}

	@GetMapping(value = "/{id}/extension/jsonschemas/pssysapps/{app}/subapps/{subapp}/{appde}")
	@ResponseStatus(HttpStatus.OK)
	public void downloadHubSubAppDataEntityJsonSchema(@PathVariable("id") String id, @PathVariable("app") String app, @PathVariable("subapp") String subapp, @PathVariable("appde") String appde, HttpServletRequest req, HttpServletResponse response) throws IOException {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
	
			Object param = RestUtils.queryString2Map(req.getQueryString());
			File configFile = null;
	
			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				configFile = ((IHubSysExtensionUtilRuntime) iSysExtensionUtilRuntime).getHubSubAppDataEntityJsonSchema(iSystemRuntime, app, subapp, appde, param, true);
			} else {
				configFile = iSysExtensionUtilRuntime.getHubSubAppDataEntityJsonSchema(app, subapp, appde, param, true);
			}
	
			if (configFile == null || !configFile.exists()) {
				response.sendError(HttpStatus.NOT_FOUND.value());
				return;
			}
	
			// 如指定查询内容则默认为缓存标记
			String strCacheTag = req.getQueryString();
			if (StringUtils.hasLength(strCacheTag)) {
				strCacheTag = null;
				if(param instanceof Map) {
					strCacheTag = (String)((Map)param).get("dynamodeltag");
				}
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
			this.sendRespose(response, configFile, bGZip);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}

	@RequestMapping(method = { RequestMethod.GET }, value = { "/{id}/extension/dictionaries/codelist/{code}" })
	public ResponseEntity<CodeList> getCodeList(@PathVariable("id") String id, @PathVariable("code") String code, @RequestParam(name = "trymode", required = false, defaultValue = "false") String trymode, @RequestParam(name = "size", required = false) Integer maxSize, HttpServletRequest req, HttpServletResponse response) throws IOException {
		Object param = RestUtils.queryString2Map(req.getQueryString());
		boolean bTryMode = trymode.equalsIgnoreCase("true");
		if(maxSize == null || maxSize<=0) {
			maxSize = Integer.MAX_VALUE;
		}

		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
	
			CodeList codeList;
			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				codeList = ((IHubSysExtensionUtilRuntime) iSysExtensionUtilRuntime).getCodeList(iSystemRuntime, code, maxSize, param, bTryMode);
			} else {
				codeList = iSysExtensionUtilRuntime.getCodeList(code, maxSize, param, bTryMode);
			}
			
			return ResponseEntity.status(HttpStatus.OK).body(codeList);
		}
		finally {
			SystemRuntimeHolder.poll();
		}

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

	protected String getFileName(String fileName) {
		try {
			return new String(fileName.getBytes("utf-8"), "iso8859-1");// 防止中文乱码
		} catch (UnsupportedEncodingException ex) {
			log.error(ex);
		}
		return fileName;
	}

}
