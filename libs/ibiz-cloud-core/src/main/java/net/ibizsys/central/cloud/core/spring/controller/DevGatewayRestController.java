package net.ibizsys.central.cloud.core.spring.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tools.ant.filters.StringInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.app.IApplicationRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.app.IHotAppRuntimeBase;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysHotCodeUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

@RestController()
@RequestMapping("")
@ConditionalOnProperty(prefix = "ibiz.servicehub", name = "devgateway", havingValue = "true", matchIfMissing = true)
public class DevGatewayRestController {

	private static final Logger logger = LoggerFactory.getLogger(DevGatewayRestController.class);

	public static final String UTF_8 = "UTF-8";
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DevGatewayRestController.class);
	
	/**
	 * 统一资源：热代码
	 */
	public final static String UNIRES_DEVOPS_HOTCODE = "UNIRES_DEVOPS_HOTCODE";
	
	/**
	 * 统一资源：代码生成
	 */
	public final static String UNIRES_DEVOPS_CODEGEN = "UNIRES_DEVOPS_CODEGEN";
	
	/**
	 * 统一资源：测试
	 */
	public final static String UNIRES_DEVOPS_TEST = "UNIRES_DEVOPS_TEST";  
	
	
	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
	}
	
	
	@GetMapping(value = "/{id}/dev/dynamodels")
	@ResponseStatus(HttpStatus.OK)
	public void downloadDynaModel(@PathVariable("id") String id, @RequestParam(name="path", defaultValue="PSSYSTEM.json") String path, HttpServletRequest request, HttpServletResponse response) throws IOException {

		boolean pushSystemRuntime = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			pushSystemRuntime = true;
			SystemRuntimeHolder.push(iSystemRuntime);
			
			if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(EmployeeContext.getCurrentMust(), UNIRES_DEVOPS_CODEGEN)) {
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("未授权代码生成功能"));
				return;
			}
			
			String strContent = null;
			File file = new File(iSystemRuntime.getPSModelFolderPath(), path);
			if (file == null || !file.exists()) {
				IPSModelObject iPSModelObject = iSystemRuntime.getPSSystemService().getCachePSModelObject(path, true);
				if(iPSModelObject != null && iPSModelObject.getObjectNode() != null) {
					strContent = iPSModelObject.getObjectNode().toPrettyString();
				}
				else {
					response.sendError(HttpStatus.NOT_FOUND.value());
					return ;
				}
			}
			
	
			String strAcceptEncoding = request.getHeader(HttpHeaders.ACCEPT_ENCODING);
			boolean bGZip = false;
			if (StringUtils.hasLength(strAcceptEncoding)) {
				bGZip = strAcceptEncoding.indexOf("gzip") != -1;
			}
	
			response.setHeader("charset", "utf-8");
			response.setContentType("application/json;charset=UTF-8");
			if (bGZip) {
				response.setHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
			}
			
			ObjectNode node = null;
			if(StringUtils.hasLength(strContent)) {
				node = JsonUtils.toObjectNode(strContent);
			}
			else {
				node = JsonUtils.toObjectNode(file);
			}
			
			optimizeNode(new File(iSystemRuntime.getPSModelFolderPath()), node);
			
			node.remove("cache");
			
			this.sendRespose(response, node.toPrettyString(), bGZip);
			
		}
		catch (Throwable ex) {
			logger.error(String.format("访问模型发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("访问模型发生异常，%1$s", ex.getMessage()));
			return;
		}
		finally {
			if(pushSystemRuntime)
				SystemRuntimeHolder.poll();
		}
	}

	protected void optimizeNode(File rootFolder, ObjectNode objectNode) {
		
		java.util.Iterator<String> fieldNames = objectNode.fieldNames();
		List<String> nameList = new ArrayList<String>();
		while(fieldNames.hasNext()) {
			nameList.add(fieldNames.next());
		}
		
		for(String strFieldName : nameList) {
			JsonNode jsonNode = objectNode.remove(strFieldName);
			if(jsonNode instanceof ObjectNode) {
				//判断是否为有动态路径
				JsonNode refNode = jsonNode.path("modelref");
				if(!refNode.isMissingNode() && refNode.asBoolean(false)) {
					//引用数据
					optimizeNode(rootFolder, (ObjectNode)jsonNode);
					objectNode.set(strFieldName, jsonNode);
					continue;
				}
				
				JsonNode fieldNode = jsonNode.path("dynaModelFilePath");
				if(fieldNode.isMissingNode()) {
					//没有路径，返回
					optimizeNode(rootFolder, (ObjectNode)jsonNode);
					objectNode.set(strFieldName, jsonNode);
					continue;
				}
				
				String strPath = fieldNode.asText();
				if(!StringUtils.hasLength(strPath)) {
					optimizeNode(rootFolder, (ObjectNode)jsonNode);
					objectNode.set(strFieldName, jsonNode);
					continue;
				}
				
				File file = new File(rootFolder, strPath);
				if(!file.exists()) {
					optimizeNode(rootFolder, (ObjectNode)jsonNode);
					objectNode.set(strFieldName, jsonNode);
					continue;
				}
				
				ObjectNode newNode = objectNode.putObject(strFieldName);
				newNode.put("modelref", true);
				newNode.put("path", strPath);
				
				continue;
			}
			
			if(jsonNode instanceof ArrayNode) {
				
				ArrayNode arrayNode = (ArrayNode)jsonNode;
				if(arrayNode.size() == 0) {
					//返回
					objectNode.set(strFieldName, jsonNode);
					continue;
				}
				
				JsonNode node = arrayNode.get(0);
				if(node instanceof ObjectNode) {
					ArrayNode newArray = objectNode.putArray(strFieldName);
					for(int i = 0;i<arrayNode.size();i++) {
						node = arrayNode.get(i);
						
						JsonNode refNode = node.path("modelref");
						if(!refNode.isMissingNode() && refNode.asBoolean(false)) {
							//引用数据
							optimizeNode(rootFolder, (ObjectNode)node);
							newArray.add(node);
							continue;
						}
						
						JsonNode fieldNode = node.path("dynaModelFilePath");
						if(fieldNode.isMissingNode()) {
							//没有路径，返回
							optimizeNode(rootFolder, (ObjectNode)node);
							newArray.add(node);
							continue;
						}
						
						String strPath = fieldNode.asText();
						if(!StringUtils.hasLength(strPath)) {
							optimizeNode(rootFolder, (ObjectNode)node);
							newArray.add(node);
							continue;
						}
						
						File file = new File(rootFolder, strPath);
						if(!file.exists()) {
							optimizeNode(rootFolder, (ObjectNode)node);
							newArray.add(node);
							continue;
						}
						
						ObjectNode newNode =newArray.addObject();
						newNode.put("modelref", true);
						newNode.put("path", strPath);
					}
				}
				else {
					//放回
					objectNode.set(strFieldName, jsonNode);
					continue;
				}
				
				
				continue;
			}
			
			objectNode.set(strFieldName, jsonNode);
		}
	}
	
	
	@PostMapping(value = {"/{id}/dev/hotcodes/{hotcode_id}", "/{id}/dev/hotcodes/{hotcode_id}/compile"})
	@ResponseStatus(HttpStatus.OK)
	public Object compile(@PathVariable("id") String id, @PathVariable("hotcode_id") String hotcode_id, @RequestParam("path") String path, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(EmployeeContext.getCurrentMust(), UNIRES_DEVOPS_HOTCODE)) {
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("未授权热代码功能"));
				return null;
			}
			
			ISysUtilRuntime iSysUtilRuntime = (ISysUtilRuntime)iSystemRuntime.getSysUtilRuntime(hotcode_id, true);
			if(iSysUtilRuntime == null || !(iSysUtilRuntime instanceof ISysHotCodeUtilRuntime)) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定热代码组件[%1$s]不存在", hotcode_id));
				return null;
			}
			
			return ((ISysHotCodeUtilRuntime)iSysUtilRuntime).compile(path, body);
		}
		catch (Throwable ex) {
			logger.error(String.format("编译代码发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("编译代码发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
	}
	
	
	@PostMapping(value = {"/{id}/dev/hotcodes/{hotcode_id}/reload"})
	@ResponseStatus(HttpStatus.OK)
	public void reload(@PathVariable("id") String id, @PathVariable("hotcode_id") String hotcode_id, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(EmployeeContext.getCurrentMust(), UNIRES_DEVOPS_HOTCODE)) {
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("未授权热代码功能"));
				return;
			}
			
			ISysUtilRuntime iSysUtilRuntime = (ISysUtilRuntime)iSystemRuntime.getSysUtilRuntime(hotcode_id, true);
			if(iSysUtilRuntime == null || !(iSysUtilRuntime instanceof ISysHotCodeUtilRuntime)) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定热代码组件[%1$s]不存在", hotcode_id));
				return;
			}
			
			((ISysHotCodeUtilRuntime)iSysUtilRuntime).reload();
		}
		catch (Throwable ex) {
			logger.error(String.format("重载代码发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("重载代码发生异常，%1$s", ex.getMessage()));
			return;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
	}
	
	
	@PostMapping(value = {"/{id}/dev/hotcodes/{hotcode_id}/codegen"})
	@ResponseStatus(HttpStatus.OK)
	public Object generate(@PathVariable("id") String id, @PathVariable("hotcode_id") String hotcode_id, @RequestParam(name="path", required=false) String path, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(EmployeeContext.getCurrentMust(), UNIRES_DEVOPS_CODEGEN)) {
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("未授权代码生成功能"));
				return null;
			}
			
			ISysUtilRuntime iSysUtilRuntime = (ISysUtilRuntime)iSystemRuntime.getSysUtilRuntime(hotcode_id, true);
			if(iSysUtilRuntime == null || !(iSysUtilRuntime instanceof ISysHotCodeUtilRuntime)) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定热代码组件[%1$s]不存在", hotcode_id));
				return null;
			}
			
			return ((ISysHotCodeUtilRuntime)iSysUtilRuntime).generate(path, body);
		}
		catch (Throwable ex) {
			logger.error(String.format("生成代码发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("生成代码发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
	}
	
	
	
	@PostMapping(value = {"/{id}/dev/hotcodes/{hotcode_id}/test"})
	@ResponseStatus(HttpStatus.OK)
	public Object run(@PathVariable("id") String id, @PathVariable("hotcode_id") String hotcode_id, @RequestParam("path") String path, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(EmployeeContext.getCurrentMust(), UNIRES_DEVOPS_TEST)) {
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("未授权测试功能"));
				return null;
			}
			
			ISysUtilRuntime iSysUtilRuntime = (ISysUtilRuntime)iSystemRuntime.getSysUtilRuntime(hotcode_id, true);
			if(iSysUtilRuntime == null || !(iSysUtilRuntime instanceof ISysHotCodeUtilRuntime)) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定热代码组件[%1$s]不存在", hotcode_id));
				return null;
			}
			
			return ((ISysHotCodeUtilRuntime)iSysUtilRuntime).runTest(path, body);
		}
		catch (Throwable ex) {
			logger.error(String.format("运行测试发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("运行测试发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
	}
	
	
	@PostMapping(value = {"/{id}/dev/hotapps/{hotapp_id}/reload"})
	@ResponseStatus(HttpStatus.OK)
	public void reloadHotApp(@PathVariable("id") String id, @PathVariable("hotapp_id") String hotapp_id, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(EmployeeContext.getCurrentMust(), UNIRES_DEVOPS_HOTCODE)) {
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("未授权热代码功能"));
				return;
			}
			
			IApplicationRuntime iApplicationRuntime = iSystemRuntime.getApplicationRuntime(hotapp_id, true);
			if(iApplicationRuntime == null || !(iApplicationRuntime instanceof IHotAppRuntimeBase)) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定热应用[%1$s]不存在", hotapp_id));
				return;
			}
			
			((IHotAppRuntimeBase)iApplicationRuntime).reload();
		}
		catch (Throwable ex) {
			logger.error(String.format("重载代码发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("重载代码发生异常，%1$s", ex.getMessage()));
			return;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
	}
	
	
	@PostMapping(value = {"/{id}/dev/hotapps/{hotapp_id}/codegen"})
	@ResponseStatus(HttpStatus.OK)
	public Object generateHotApp(@PathVariable("id") String id, @PathVariable("hotapp_id") String hotapp_id, @RequestParam(name="path", required=false) String path, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(EmployeeContext.getCurrentMust(), UNIRES_DEVOPS_CODEGEN)) {
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("未授权代码生成功能"));
				return null;
			}
			
			IApplicationRuntime iApplicationRuntime = iSystemRuntime.getApplicationRuntime(hotapp_id, true);
			if(iApplicationRuntime == null || !(iApplicationRuntime instanceof IHotAppRuntimeBase)) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定热应用[%1$s]不存在", hotapp_id));
				return null;
			}
			
			return ((IHotAppRuntimeBase)iApplicationRuntime).generate(path, body);
		}
		catch (Throwable ex) {
			logger.error(String.format("生成代码发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("生成代码发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
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
}
