package net.ibizsys.central.cloud.core.spring.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.runtime.security.IUserContext;

@RestController()
@RequestMapping("")
@ConditionalOnProperty(prefix = "ibiz.servicehub", name = "r8gateway", havingValue = "true")
public class R8GatewayRestController {

	private static final Log log = LogFactory.getLog(R8GatewayRestController.class);

	@Autowired
	IServiceHub systemGateway;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("R8网关服务已经启动"));
	}

	/**
	 * @param systemid
	 *            系统
	 * @param scope
	 * @param entity
	 * @param method
	 * @param key
	 * @param requestData
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = { "/{systemid}/{scope}/{entity}/{method}", "/{systemid}/{scope}/{entity}/{method}/{key}" })
	public ResponseEntity<Object> call(@PathVariable(name = "systemid", required = true) String systemid, @PathVariable(name = "scope", required = true) String scope, @PathVariable(name = "entity", required = true) String entity, @PathVariable(name = "method", required = true) String method, @PathVariable(name = "key", required = false) String key, @RequestBody Object requestData) {
		try {
			Object obj = this.systemGateway.invokeAPIMethod(systemid, scope, entity, method, requestData, key, getUserContext(), null);
			return ResponseEntity.status(HttpStatus.OK).body(obj);
		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			throw new SystemGatewayException(this.systemGateway, String.format("调用系统服务接口发生异常，%s", e.getMessage()), e);
		}
	}

	/**
	 * @param systemid
	 * @param scope
	 * @param pentity
	 * @param pkey
	 * @param entity
	 * @param method
	 * @param key
	 * @param requestData
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = { "/{systemid}/{scope}/{pentity}/{pkey}/{entity}/{method}", "/{systemid}/{scope}/{pentity}/{pkey}/{entity}/{method}/{key}" })
	public ResponseEntity<Object> call(@PathVariable(name = "systemid", required = true) String systemid, @PathVariable(name = "scope", required = true) String scope, @PathVariable(name = "pentity", required = true) String pentity, @PathVariable(name = "pkey", required = true) String pkey, @PathVariable(name = "entity", required = true) String entity, @PathVariable(name = "method", required = true) String method, @PathVariable(name = "key", required = false) String key, @RequestBody Object requestData) {
		try {
			Object obj = this.systemGateway.invokeAPIMethod(systemid, scope, pentity, pkey, entity, method, requestData, key, getUserContext(), null);
			return ResponseEntity.status(HttpStatus.OK).body(obj);
		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			throw new SystemGatewayException(this.systemGateway, String.format("调用系统服务接口发生异常，%s", e.getMessage()), e);
		}
	}

	/**
	 * @param systemid
	 * @param scope
	 * @param pentity
	 * @param pkey
	 * @param entity
	 * @param importtag
	 * @param multipartFile
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = { "/{systemid}/{scope}/{entity}/importdata", "/{systemid}/{scope}/{pentity}/{pkey}/{entity}/importdata" })
	public ResponseEntity<Object> importData(@PathVariable(name = "systemid", required = true) String systemid, @PathVariable(name = "scope", required = true) String scope, @PathVariable(name = "pentity", required = false) String pentity, @PathVariable(name = "pkey", required = false) String pkey, @PathVariable(name = "entity", required = true) String entity, @RequestParam(name = "srfimporttag", required = false) String importtag, @RequestParam(name = "file", required = true) MultipartFile multipartFile) {
		try {
			Object obj = this.systemGateway.invokeAPIImportData(systemid, scope, pentity, pkey, entity, importtag, multipartFile, getUserContext(), null);
			return ResponseEntity.status(HttpStatus.OK).body(obj);
		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			throw new SystemGatewayException(this.systemGateway, String.format("调用系统服务接口进行数据导入发生异常，%s", e.getMessage()), e);
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/{systemid}/{scope}/{entity}/importdata2", "/{systemid}/{scope}/{pentity}/{pkey}/{entity}/importdata2" })
	public ResponseEntity<Object> importData2(@PathVariable(name = "systemid", required = true) String systemid, @PathVariable(name = "scope", required = true) String scope, @PathVariable(name = "pentity", required = false) String pentity, @PathVariable(name = "pkey", required = false) String pkey, @PathVariable(name = "entity", required = true) String entity, @RequestParam(name = "srfimporttag", required = false) String importtag, @RequestParam(name = "file", required = true) MultipartFile multipartFile) {
		try {
			Object obj = this.systemGateway.invokeAPIImportData2(systemid, scope, pentity, pkey, entity, importtag, multipartFile, getUserContext(), null);
			return ResponseEntity.status(HttpStatus.OK).body(obj);
		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			throw new SystemGatewayException(this.systemGateway, String.format("调用系统服务接口进行数据导入发生异常，%s", e.getMessage()), e);
		}
	}

	/**
	 * @param systemid
	 * @param scope
	 * @param pentity
	 * @param pkey
	 * @param entity
	 * @param importtag
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = { "/{systemid}/{scope}/{entity}/importtemplate", "/{systemid}/{scope}/{pentity}/{pkey}/{entity}/importtemplate" })
	public ResponseEntity<Object> getImportTemplate(@PathVariable(name = "systemid", required = true) String systemid, @PathVariable(name = "scope", required = true) String scope, @PathVariable(name = "pentity", required = false) String pentity, @PathVariable(name = "pkey", required = false) String pkey, @PathVariable(name = "entity", required = true) String entity, @RequestParam(name = "srfimporttag", required = false) String importtag) {
		try {

			ByteArrayOutputStream bos = new ByteArrayOutputStream();

			this.systemGateway.invokeAPIGetImportTemplate(systemid, scope, pentity, pkey, entity, importtag, getUserContext(), bos);
			String strTemplateName = "数据导入模板.xlsx";
			HttpHeaders headers = new HttpHeaders();
			headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
			headers.add("Pragma", "no-cache");
			headers.add("Expires", "0");
			headers.add("charset", "utf-8");
			// 设置下载文件名
			String strFileName = new String(URLEncoder.encode(strTemplateName, "utf-8").getBytes("utf-8"), "iso8859-1");
			headers.add("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, URLEncoder.encode(strTemplateName, "utf-8")));
			return ResponseEntity.status(HttpStatus.OK).headers(headers).body(new InputStreamResource(new ByteArrayInputStream(bos.toByteArray())));

		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			throw new SystemGatewayException(this.systemGateway, String.format("调用系统服务接口获取数据导入模板发生异常，%s", e.getMessage()), e);
		}
	}

	/**
	 * @param systemid
	 * @param scope
	 * @param pentity
	 * @param pkey
	 * @param entity
	 * @param exporttag
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = { "/{systemid}/{scope}/{entity}/exportdata/{method}/{key}", "/{systemid}/{scope}/{pentity}/{pkey}/{entity}/exportdata/{method}/{key}", "/{systemid}/{scope}/{entity}/exportdata/{method}", "/{systemid}/{scope}/{pentity}/{pkey}/{entity}/exportdata/{method}" })
	public ResponseEntity<Object> exportData(@PathVariable(name = "systemid", required = true) String systemid, @PathVariable(name = "scope", required = true) String scope, @PathVariable(name = "pentity", required = false) String pentity, @PathVariable(name = "pkey", required = false) String pkey, @PathVariable(name = "entity", required = true) String entity, @PathVariable(name = "method", required = true) String method, @PathVariable(name = "key", required = false) String key, @RequestParam(name = "srfexporttag", required = false) String exporttag, @RequestBody Object requestData) {

		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			this.systemGateway.invokeAPIExportData(systemid, scope, pentity, pkey, entity, exporttag, method, requestData, key, getUserContext(), bos);
			String strTemplateName = "数据导出.xlsx";

			HttpHeaders headers = new HttpHeaders();
			headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
			headers.add("Pragma", "no-cache");
			headers.add("Expires", "0");
			headers.add("charset", "utf-8");
			// 设置下载文件名
			String strFileName = new String(URLEncoder.encode(strTemplateName, "utf-8").getBytes("utf-8"), "iso8859-1");
			headers.add("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, URLEncoder.encode(strTemplateName, "utf-8")));
			return ResponseEntity.status(HttpStatus.OK).headers(headers).body(new InputStreamResource(new ByteArrayInputStream(bos.toByteArray())));
		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			throw new SystemGatewayException(this.systemGateway, String.format("调用系统服务接口导出数据发生异常，%s", e.getMessage()), e);
		}
	}

	protected IUserContext getUserContext() {
		return EmployeeContext.getCurrentMust();
	}

}
