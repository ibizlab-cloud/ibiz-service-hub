package net.ibizsys.runtime.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Web请求上下文默认实现
 * 
 * @author lionlau
 *
 */
@JsonInclude(Include.NON_NULL)
public class WebContext implements IWebContext {

	@JsonIgnore
	private transient ServletRequest servletRequest = null;
	
	@JsonIgnore
	private transient MultiValueMap<String, String> parameterMap = new LinkedMultiValueMap<String, String>();
	
	@JsonIgnore
	private transient MultiValueMap<String, String> headerMap = new LinkedMultiValueMap<String, String>();
	
	public WebContext(ServletRequest servletRequest) {
		this.servletRequest = servletRequest;
		if(this.servletRequest != null) {
			Map<String, String[]> paramMap = servletRequest.getParameterMap();
			if(!ObjectUtils.isEmpty(paramMap)) {
				for(java.util.Map.Entry<String, String[]> entry : paramMap.entrySet()) {
					if(entry.getValue() != null && entry.getValue().length > 0) {
						this.parameterMap.put(entry.getKey(), Arrays.asList(entry.getValue()));
					}
				}
			}
			if(servletRequest instanceof HttpServletRequest) {
				HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
				java.util.Enumeration<String> headers = httpServletRequest.getHeaderNames();
				if(headers != null) {
					while(headers.hasMoreElements()) {
						String strHeader = headers.nextElement();
						java.util.Enumeration<String> values = httpServletRequest.getHeaders(strHeader);
						if(values != null) {
							List<String> list = new ArrayList<String>();
							while(values.hasMoreElements()) {
								list.add(values.nextElement());
							}
							headerMap.put(strHeader, list);
						}
					}
				}
			}
		}
	}
	//MultiValueMap<String, String> map = new LinkedCaseInsensitiveMultiValueMap<>();
	
	@Override
	@JsonIgnore
	public String getParameter(String name) {
		List<String> value = this.getParameterValues(name);
		if(!ObjectUtils.isEmpty(value)) {
			return value.get(0);
		}
		return null;
	}
	
	@Override
	@JsonIgnore
	public List<String> getParameterValues(String name) {
		Assert.hasLength(name, "传入参数键名无效");
		MultiValueMap<String, String> map = this.getParameters();
		if(!ObjectUtils.isEmpty(map)) {
			List<String> value = map.get(name);
			if(value == null) {
				for(java.util.Map.Entry<String, List<String>> entry : map.entrySet()) {
					if(name.equalsIgnoreCase(entry.getKey())) {
						return entry.getValue();
					}
				}
			}
			return value;
		}
		return null;
	}
	
	@Override
	@JsonProperty("parameters")
	public MultiValueMap<String, String> getParameters() {
		return this.parameterMap;
	}
	
	@JsonProperty("parameters")
	public void setParameters(MultiValueMap<String, String> parameterMap) {
		this.parameterMap.clear();
		if(!ObjectUtils.isEmpty(parameterMap)) {
			this.parameterMap.putAll(parameterMap);
		}
	}

	@Override
	@JsonIgnore
	public String getHeader(String name) {
		List<String> value = this.getHeaderValues(name);
		if(!ObjectUtils.isEmpty(value)) {
			return value.get(0);
		}
		return null;
	}
	
	@Override
	@JsonIgnore
	public List<String> getHeaderValues(String name) {
		Assert.hasLength(name, "传入头部键名无效");
		MultiValueMap<String, String> map = this.getHeaders();
		if(!ObjectUtils.isEmpty(map)) {
			List<String> value = map.get(name);
			if(value == null) {
				for(java.util.Map.Entry<String, List<String>> entry : map.entrySet()) {
					if(name.equalsIgnoreCase(entry.getKey())) {
						return entry.getValue();
					}
				}
			}
			return value;
		}
		return null;
	}
	
	@Override
	@JsonProperty("headers")
	public MultiValueMap<String, String> getHeaders() {
		return this.headerMap;
	}
	
	@JsonProperty("headers")
	public void setHeaders(MultiValueMap<String, String> headerMap) {
		this.headerMap.clear();
		if(!ObjectUtils.isEmpty(headerMap)) {
			this.headerMap.putAll(headerMap);
		}
	}
	
	
	//@Override
	@JsonIgnore
	public ServletRequest getRequest() {
		return this.servletRequest;
	}

	@Override
	@JsonIgnore
	public List<String> getParameterNames() {
		return new ArrayList<String>(this.parameterMap.keySet());
	}

	@Override
	@JsonIgnore
	public List<String> getHeaderNames() {
		return new ArrayList<String>(this.headerMap.keySet());
	}
	
	@Override
	public String toString() {
		return JsonUtils.toString(this);
	}

//	public static IWebContext getCurrent() {
//		if (ActionSessionManager.getCurrentSession() != null) {
//			return ActionSessionManager.getCurrentSession().getWebContext();
//		}
//		if (UserContext.getCurrent() != null) {
//			return UserContext.getCurrent().getWebContext();
//		}
//		return null;
//	}
	
	
	
//	/**
//	 * 新建应用上下文
//	 * @param 克隆对象 
//	 * @return
//	 */
//	public static IWebContext newInstance(IWebContext iWebContext) {
//		WebContext appContext = new WebContext();
//		if(iWebContext != null) {
//			iWebContext.copyTo(appContext);
//		}
//		return appContext;
//	}
	

	
	
	

}
