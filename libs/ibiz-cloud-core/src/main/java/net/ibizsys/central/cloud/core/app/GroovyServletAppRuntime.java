package net.ibizsys.central.cloud.core.app;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import groovy.text.GStringTemplateEngine;
import groovy.text.Template;
import net.ibizsys.central.app.ApplicationRuntimeException;
import net.ibizsys.central.cloud.core.app.util.AppTemplateUtils;
import net.ibizsys.central.cloud.core.util.RestUtils;

public class GroovyServletAppRuntime extends ServletAppRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(GroovyServletAppRuntime.class);
	
	private GStringTemplateEngine engine = new GStringTemplateEngine();
	private Map<String, Template> templateCacheMap = new ConcurrentHashMap<String, Template>();
	private Map<String, String> templatePathMap = new HashMap<String, String>();
	private boolean enableTemplateCache = true; 
	private PathMatcher pathMatcher = new AntPathMatcher();
	private Object templateUtils = new AppTemplateUtils();
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	
		try {
			this.prepareTemplates();
		}
		catch (Exception ex) {
			throw new Exception(String.format("准备模板发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected boolean isEnableTemplateCache() {
		return enableTemplateCache;
	}

	


	protected void setEnableTemplateCache(boolean enableTemplateCache) {
		this.enableTemplateCache = enableTemplateCache;
	}

	protected void resetTemplates() {
		this.templateCacheMap.clear();
		this.templatePathMap.clear();
	}
	
	protected void prepareTemplates() throws Exception{
		
	}

	protected void reloadTemplates() throws Exception{
		this.resetTemplates();
		this.prepareTemplates();
	}
	
	protected Template registerTemplate(String pattern, String path) throws Exception{
		
		Resource resource = this.getResource(path);
		if(resource == null) {
			throw new Exception(String.format("无法获取指定模板资源[%1$s]", path));
		}
		
		if(!this.isEnableTemplateCache()) {
			this.templatePathMap.put(pattern, path);
		}
		
		try(InputStreamReader inputStreamReader = new InputStreamReader(resource.getInputStream())) {
			return this.registerTemplate(pattern, inputStreamReader);
		}
	}

	protected Template registerTemplate(String pattern, Reader reader) throws Exception{
		
		try {
			Template template = engine.createTemplate(reader);
			templateCacheMap.put(pattern, template);
			return template;
		}
		catch (Exception ex) {
			throw new Exception(String.format("编译模板[%1$s]发生异常，%2$s", pattern, ex.getMessage()), ex);
		}
	}
	
	protected Template unregisterTemplate(String pattern) {
		return this.templateCacheMap.remove(pattern);
	}


	
	protected Object getTemplateUtils() {
		return templateUtils;
	}

	protected void setTemplateUtils(Object templateUtils) {
		this.templateUtils = templateUtils;
	}

	@Override
	protected Resource onResolveResource(HttpServletRequest request, String requestPath) {
		
		for(java.util.Map.Entry<String, Template> entry : this.templateCacheMap.entrySet()) {
			
			if (pathMatcher.match(entry.getKey(), requestPath)) {
				
				Map<String, String> pathVariables = pathMatcher.extractUriTemplateVariables(entry.getKey(), requestPath);
				
				Map<String, Object> queryParams = RestUtils.queryString2Map(request.getQueryString());
				
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("app", this);
				params.put("sys", this.getSystemRuntime());
				params.put("req", request);
				params.put("path", pathVariables);
				params.put("query", queryParams);
				params.put("utils", getTemplateUtils());
				
				try {
					String content = this.getContent(request, requestPath, entry.getKey(), entry.getValue(), params);
				
					return new ByteArrayResource(content.getBytes("UTF-8")) {
						@Override
						public String getFilename() {
							return requestPath;
						}
	
						@Override
						public long lastModified() throws IOException {
							return System.currentTimeMillis();
						}
					};
				}
				catch (Exception ex) {
					throw new ApplicationRuntimeException(this, String.format("输出[%1$s]模板发生异常，%2$s", requestPath, ex.getMessage()), ex);
				}
			}
		}
		
		return super.onResolveResource(request, requestPath);
	}
	
	
	protected String getContent(HttpServletRequest request, String requestPath, String pattern, Template template, Map<String, Object> params) throws Exception{
		
		if(!this.isEnableTemplateCache()) {
			//重新编译
			template = this.registerTemplate(pattern, this.templatePathMap.get(pattern));
		}
		
		StringWriter sw = new StringWriter();
		template.make(params).writeTo(sw);
		return sw.toString();
		
	}
}
