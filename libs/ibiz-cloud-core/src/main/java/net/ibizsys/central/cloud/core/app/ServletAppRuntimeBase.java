package net.ibizsys.central.cloud.core.app;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

import net.ibizsys.central.app.ApplicationRuntimeBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;

/**
 * @author lionlau
 *
 */
public abstract class ServletAppRuntimeBase extends ApplicationRuntimeBase implements IServletAppRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ServletAppRuntimeBase.class);

	private String baseUrl = null;
	private String resourceRoot = null;
	private boolean fromClassPathResource = false;
	private int requestPathOffset = 0;
	
	

	@Override
	protected void onInit() throws Exception {

		if(!StringUtils.hasLength(this.getBaseUrl())) {
			this.prepareBaseUrl();
		}
		super.onInit();
		
		if(!StringUtils.hasLength(this.getResourceRoot())) {
			this.prepareResourceRoot();
		}
		
		this.registerIgnoreAuthPattern();
	}

	
	protected void registerIgnoreAuthPattern() {
		
	}

	
	protected void prepareBaseUrl() throws Exception{
		this.setBaseUrl(String.format("/%1$s/%2$s/%3$s", ServiceHub.getInstance().getServletAppBaseUrl(), this.getSystemRuntime().getServiceId(), this.getPSApplication().getCodeName()).toLowerCase());
		this.requestPathOffset = this.getBaseUrl().length() - 1 - ServiceHub.getInstance().getServletAppBaseUrl().length();
	}

	
	@Override
	public String getBaseUrl() {
		return this.baseUrl;
	}
	
	
	protected void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	protected String getResourceRoot() {
		return this.resourceRoot;
	}
	
	protected void setResourceRoot(String resourceRoot) {
		this.resourceRoot = resourceRoot;
	}
	
	protected void prepareResourceRoot() throws Exception{
		
	}

	
	

	protected boolean isFromClassPathResource() {
		return this.fromClassPathResource;
	}


	protected void setFromClassPathResource(boolean fromClassPathResource) {
		this.fromClassPathResource = fromClassPathResource;
	}


	@Override
	public Resource resolveResource(HttpServletRequest request, String requestPath) {
		if(requestPath.indexOf("/") == 0) {
			requestPath = requestPath.substring(this.requestPathOffset);
		}
		else {
			requestPath = requestPath.substring(this.requestPathOffset-1);
		}
		
		if(requestPath.indexOf("/") == 0) {
			requestPath = requestPath.substring(1);
		}
		
		if(!StringUtils.hasLength(requestPath)) {
			requestPath = getStartPage();
		}
		return onResolveResource(request, requestPath);
		
//		//request.getServletContext().
//		//return new FileSystemResource("I:\\code\\SA\\86E2A266-4D1E-49F0-A12D-D636905457A3\\trunk\\srv_PSCore3\\SLN\\doc\\"+ requestPath.substring(7));
//		return null;
	}
	
	
	protected String getStartPage() {
		return "index.html";
	}
	
	protected Resource onResolveResource(HttpServletRequest request, String requestPath) {
		
		return this.getResource(requestPath);
	}
	
	
	protected Resource getResource(String requestPath) {

		String fullPath = String.format("%1$s%2$s%3$s", getResourceRoot(), File.separator, requestPath);
		
		if(isFromClassPathResource()) {
			ClassPathResource classPathResource = new ClassPathResource(fullPath);
			if(classPathResource.exists()) {
				return classPathResource;
			}
			return null;
		}
		
		File file = new File(fullPath);
		if(file.exists()) {
			return new FileSystemResource(file);
		}
		
		return null;
	}

}
