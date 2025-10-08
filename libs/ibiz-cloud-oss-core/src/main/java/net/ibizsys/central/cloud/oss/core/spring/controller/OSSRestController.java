package net.ibizsys.central.cloud.oss.core.spring.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOSSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.domain.DownloadTicket;
import net.ibizsys.central.cloud.core.util.error.InternalServerErrorException;
import net.ibizsys.central.cloud.oss.core.IOSSUtilSystemRuntime;
import net.ibizsys.central.cloud.oss.core.cloudutil.ISimpleFileStorageService;
import net.ibizsys.central.cloud.oss.core.util.domain.DownloadTicketMode;
import net.ibizsys.central.cloud.oss.core.util.domain.FileItem;
import net.ibizsys.runtime.util.EntityBase;

@RestController()
@RequestMapping("")
public class OSSRestController {

	private static final Log log = LogFactory.getLog(OSSRestController.class);

	@Autowired
	IServiceHub iServiceHub;
	
	@Value("${ibiz.cloud.oss.ignoreauth:true}")
	private boolean ignoreAuth;
	
	
	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("CloudOSS服务已经启动"));
		
		if(this.ignoreAuth) {
			iServiceHub.registerIgnoreAuthPattern("/ibizutil/download/**");
			iServiceHub.registerIgnoreAuthPattern("/ibizutil/downloadtxt/**");
		}
		
		iServiceHub.registerNamingService(ICloudUtilRuntime.CLOUDSERVICEURL_OSS);
		if(this.iCloudOSSUtilRuntime == null) {
			//通过服务网关需要注册OSS功能组件
			iServiceHub.requireCloudUtilRuntime(IOSSUtilSystemRuntime.class, ICloudOSSUtilRuntime.class);
		}
	}
	

	@Autowired(required=false)
	private ICloudOSSUtilRuntime iCloudOSSUtilRuntime = null;

	protected ICloudOSSUtilRuntime getCloudOSSUtilRuntime() {
		if (this.iCloudOSSUtilRuntime == null) {
			try {
				this.iCloudOSSUtilRuntime = iServiceHub.getCloudUtilRuntime(IOSSUtilSystemRuntime.class, ICloudOSSUtilRuntime.class, false);
			}
			catch(Throwable ex) {
				log.debug(String.format("未指定Cloud服务OSS功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud服务OSS功能模块"), ex);
			}
		}
		return this.iCloudOSSUtilRuntime;
	}

	private ISimpleFileStorageService iSimpleFileStorageService = null;
	protected ISimpleFileStorageService getSimpleFileStorageService() {
		if (this.iSimpleFileStorageService == null) {
			if(this.getCloudOSSUtilRuntime() instanceof ISimpleFileStorageService) {
				this.iSimpleFileStorageService = (ISimpleFileStorageService)this.getCloudOSSUtilRuntime();
			}
			if (this.iSimpleFileStorageService == null) {
				throw new SystemGatewayException(iServiceHub, String.format("Cloud服务OSS功能模块未提供简单文件存储服务功能"));
			}
		}
		return this.iSimpleFileStorageService;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/oss/object/{db}/{table}/create", "/oss/object/{db}/{table}"})
	public ResponseEntity<String> createObject(@PathVariable("db") String db, @PathVariable("table") String table, @RequestBody Map params) {
		if(!AuthenticationUser.isApiuser(AuthenticationUser.getCurrentMust()) && !AuthenticationUser.isSuperuser(AuthenticationUser.getCurrentMust())) {
			throw new RuntimeException("仅限API用户访问");
		}
		return ResponseEntity.ok(this.getCloudOSSUtilRuntime().createObject(db, table, params));
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value = {"/oss/object/{db}/{table}/{key}/update", "/oss/object/{db}/{table}/{key}"})
	public ResponseEntity<Integer> updateObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key, @RequestBody Map params) {
		if(!AuthenticationUser.isApiuser(AuthenticationUser.getCurrentMust()) && !AuthenticationUser.isSuperuser(AuthenticationUser.getCurrentMust())) {
			throw new RuntimeException("仅限API用户访问");
		}
		return ResponseEntity.ok(this.getCloudOSSUtilRuntime().updateObject(db, table, key, params, true));
	}

	@RequestMapping(method = RequestMethod.DELETE, value = {"/oss/object/{db}/{table}/{key}/delete", "/oss/object/{db}/{table}/{key}"})
	public ResponseEntity<Integer> deleteObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key) {
		if(!AuthenticationUser.isApiuser(AuthenticationUser.getCurrentMust()) && !AuthenticationUser.isSuperuser(AuthenticationUser.getCurrentMust())) {
			throw new RuntimeException("仅限API用户访问");
		}
		return ResponseEntity.ok(this.getCloudOSSUtilRuntime().deleteObject(db, table, key));
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/oss/object/{db}/{table}/{key}/get", "/oss/object/{db}/{table}/{key}"})
	public ResponseEntity<Map> getObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key) {
		if(!AuthenticationUser.isApiuser(AuthenticationUser.getCurrentMust()) && !AuthenticationUser.isSuperuser(AuthenticationUser.getCurrentMust())) {
			throw new RuntimeException("仅限API用户访问");
		}
		return ResponseEntity.ok(this.getCloudOSSUtilRuntime().getObject(db, table, key));
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = {"/oss/object/{db}/{table}/fetch"})
	public ResponseEntity<Object> fetchObjects(@PathVariable("db") String db, @PathVariable("table") String table, @RequestBody Map params) {
		if(!AuthenticationUser.isApiuser(AuthenticationUser.getCurrentMust()) && !AuthenticationUser.isSuperuser(AuthenticationUser.getCurrentMust())) {
			throw new RuntimeException("仅限API用户访问");
		}
		
		Page page = this.getCloudOSSUtilRuntime().fetchObjects(db, table, params);
		return RestUtils.sendBackPage(page, Map.class);
	}
	

//	@Autowired
//	private FileService fileService;
//                                              
	@PostMapping(value = "${ibiz.cloud.oss.uploadpath:/ibizutil/upload}")
	public ResponseEntity<FileItem> upload(@RequestParam("file") MultipartFile multipartFile, @RequestParam(value = "preview", required = false, defaultValue="false") boolean preview){
//		String strPreview = null;
//		String strQueryString = request.getQueryString();
//		Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
//		if (map != null) {
//			strPreview = (String) map.get("preview");
//		}
		return ResponseEntity.ok().body(getSimpleFileStorageService().uploadFile(null, multipartFile, preview));
	}

	@GetMapping(value = "${ibiz.cloud.oss.downloadpath:/ibizutil/download/{id}}")
	@ResponseStatus(HttpStatus.OK)
	public void download(@PathVariable String id, HttpServletResponse response, HttpServletRequest request){
		
		boolean bApiUser = false;
		if(AuthenticationUser.getCurrent() != null && AuthenticationUser.getCurrentMust().getApiuser() == EntityBase.BOOLEAN_TRUE) {
			bApiUser = true;
		}
		
		switch(this.getSimpleFileStorageService().getDownloadTicketMode()) {
		case INCLUSION:
			this.getSimpleFileStorageService().downloadFileByTicket(null, id, response, bApiUser);
			return;
		case EXCLUSION:
			this.getSimpleFileStorageService().downloadFileByTicket(null, id, response, bApiUser);
			return;
		default:
			break;
		}
		
		this.getSimpleFileStorageService().downloadFile(null, id, response);
		
	}
	
	@GetMapping(value = "${ibiz.cloud.oss.downloadtxt:/ibizutil/downloadtxt/{id}}")
	@ResponseStatus(HttpStatus.OK)
	public void downloadText(@PathVariable String id, HttpServletResponse response, HttpServletRequest request){
		
		boolean bApiUser = false;
		if(AuthenticationUser.getCurrent() != null && AuthenticationUser.getCurrentMust().getApiuser() == EntityBase.BOOLEAN_TRUE) {
			bApiUser = true;
		}
		
		switch(this.getSimpleFileStorageService().getDownloadTicketMode()) {
		case INCLUSION:
			this.getSimpleFileStorageService().downloadTextByTicket(null, id, response, bApiUser);
			return;
		case EXCLUSION:
			this.getSimpleFileStorageService().downloadTextByTicket(null, id, response, bApiUser);
			return;
		default:
			break;
		}
		
		this.getSimpleFileStorageService().downloadText(null, id, response);
		
	}
	
	
	@PostMapping(value = "${ibiz.cloud.oss.uploadpath2:/ibizutil/upload/{cat}}")
	public ResponseEntity<FileItem> upload(@PathVariable String cat, @RequestParam("file") MultipartFile multipartFile, @RequestParam(value = "preview", required = false, defaultValue="false") boolean preview){
		return ResponseEntity.ok().body(getSimpleFileStorageService().uploadFile(cat, multipartFile, preview));
	}
	
	
//	@PostMapping(value = "${ibiz.cloud.oss.uploadpath2:/ibizutil/upload2/{cat}}")
//	public ResponseEntity<FileItem> upload2(@PathVariable String cat, @RequestParam("file") MultipartFile multipartFile, HttpServletRequest request){
//		return ResponseEntity.ok().body(getSimpleFileStorageService().uploadFile(cat, multipartFile, true));
//	}
	

	@GetMapping(value = "${ibiz.cloud.oss.downloadpath2:/ibizutil/download/{cat}/{id}}")
	@ResponseStatus(HttpStatus.OK)
	public void download(@PathVariable String cat, @PathVariable String id, HttpServletResponse response){
		boolean bApiUser = false;
		if(AuthenticationUser.getCurrent() != null && AuthenticationUser.getCurrentMust().getApiuser() == EntityBase.BOOLEAN_TRUE) {
			bApiUser = true;
		}
		
		switch(this.getSimpleFileStorageService().getDownloadTicketMode()) {
		case INCLUSION:
			if(this.getSimpleFileStorageService().containsDownloadTicketFolder(cat)) {
				this.getSimpleFileStorageService().downloadFileByTicket(cat, id, response, bApiUser);
				return;
			}
			break;
		case EXCLUSION:
			if(!this.getSimpleFileStorageService().containsDownloadTicketFolder(cat)) {
				this.getSimpleFileStorageService().downloadFileByTicket(cat, id, response, bApiUser);
				return;
			}
			break;
		default:
			break;
		}
		
		this.getSimpleFileStorageService().downloadFile(cat, id, response);
	}
	
	@GetMapping(value = "${ibiz.cloud.oss.downloadtxt2:/ibizutil/downloadtxt/{cat}/{id}}")
	@ResponseStatus(HttpStatus.OK)
	public void downloadText(@PathVariable String cat, @PathVariable String id, HttpServletResponse response){
		boolean bApiUser = false;
		if(AuthenticationUser.getCurrent() != null && AuthenticationUser.getCurrentMust().getApiuser() == EntityBase.BOOLEAN_TRUE) {
			bApiUser = true;
		}
		
		switch(this.getSimpleFileStorageService().getDownloadTicketMode()) {
		case INCLUSION:
			if(this.getSimpleFileStorageService().containsDownloadTicketFolder(cat)) {
				this.getSimpleFileStorageService().downloadTextByTicket(cat, id, response, bApiUser);
				return;
			}
			break;
		case EXCLUSION:
			if(!this.getSimpleFileStorageService().containsDownloadTicketFolder(cat)) {
				this.getSimpleFileStorageService().downloadTextByTicket(cat, id, response, bApiUser);
				return;
			}
			break;
		default:
			break;
		}
		
		this.getSimpleFileStorageService().downloadText(cat, id, response);
	}
	
	@GetMapping(value = "${ibiz.cloud.oss.createdownloadticketpath:/ibizutil/createdownloadticket/{id}}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<DownloadTicket> createDownloadTicket(@PathVariable String id, HttpServletResponse response){
		if(this.getSimpleFileStorageService().getDownloadTicketMode() == DownloadTicketMode.DISABLED) {
			throw new InternalServerErrorException("不支持");
		}
		
		if(AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
    		response.setStatus(HttpStatus.FORBIDDEN.value());
    		return null;
    	}
		
		return ResponseEntity.ok().body(getSimpleFileStorageService().createDownloadTicket(null, id, -1));
	}
	
	
	@GetMapping(value = "${ibiz.cloud.oss.createdownloadticketpath2:/ibizutil/createdownloadticket/{cat}/{id}}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<DownloadTicket> createDownloadTicket(@PathVariable String cat, @PathVariable String id, HttpServletResponse response){
		if(this.getSimpleFileStorageService().getDownloadTicketMode() == DownloadTicketMode.DISABLED) {
			throw new InternalServerErrorException("不支持");
		}
		
		if(AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
    		response.setStatus(HttpStatus.FORBIDDEN.value());
    		return null;
    	}
		
		return ResponseEntity.ok().body(getSimpleFileStorageService().createDownloadTicket(cat, id, -1));
	}
	

	
	@PostMapping(value = "${ibiz.cloud.oss.downloadpath3:/ibizutil/download}")
	@ResponseStatus(HttpStatus.OK)
	public void download(@RequestBody List<JsonNode> list, HttpServletResponse response, @RequestParam(value = "packmode", required = false, defaultValue=ISimpleFileStorageService.PACKMODE_DEFAULT) String packmode){
		if(this.getSimpleFileStorageService().getDownloadTicketMode() != DownloadTicketMode.DISABLED) {
			throw new InternalServerErrorException("不支持");
		}
		File file= getSimpleFileStorageService().getFile(null, list, packmode);
		response.setHeader("Content-Disposition", "attachment;filename="+getFileName(file.getName()));
		this.sendResponse(response, file);
	}
	
	
	@PostMapping(value = "${ibiz.cloud.oss.downloadpath4:/ibizutil/download/{cat}}")
	@ResponseStatus(HttpStatus.OK)
	public void download(@PathVariable String cat, @RequestBody List<JsonNode> list, HttpServletResponse response, @RequestParam(value = "packmode", required = false, defaultValue=ISimpleFileStorageService.PACKMODE_DEFAULT) String packmode){
		if(this.getSimpleFileStorageService().getDownloadTicketMode() != DownloadTicketMode.DISABLED) {
			throw new InternalServerErrorException("不支持");
		}
		File file= getSimpleFileStorageService().getFile(cat, list, packmode);
		response.setHeader("Content-Disposition", "attachment;filename="+getFileName(file.getName()));
		this.sendResponse(response, file);
	}
	
//
//
	protected void sendResponse(HttpServletResponse response, File file){
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			bos = new BufferedOutputStream(response.getOutputStream());
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		}
		catch (Exception e) {
			log.error(e);
		}
		finally {
			if (bis != null) {
				try {
					bis.close();
				}
				catch (IOException e) {
					log.error(e);
				}
			}
			if (bos != null) {
				try {
					bos.close();
				}
				catch (IOException e) {
					log.error(e);
				}
			}
		}
	}
//
	protected String getFileName(String fileName){
		try {
			return new String(fileName.getBytes("utf-8"),"iso8859-1");//防止中文乱码
		}
		catch (UnsupportedEncodingException ex) {
			log.error(ex);
		}
		return fileName;
	}
}
