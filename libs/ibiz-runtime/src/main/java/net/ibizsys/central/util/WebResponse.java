package net.ibizsys.central.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import net.ibizsys.runtime.util.JsonUtils;

@JsonInclude(Include.NON_NULL)
public class WebResponse implements IWebResponse {

	@JsonIgnore
	private transient MultiValueMap<String, String> headerMap = new LinkedMultiValueMap<String, String>();
	
	@JsonIgnore
	private transient Object body = null;
	
	@JsonIgnore
	private transient int nStatusCode = HttpStatus.OK.value();
	
	@JsonIgnore
	private transient String strContentType = null;
	
	
	@Override
	@JsonProperty("headers")
	public MultiValueMap<String, String> getHeaders() {
		return this.headerMap;
	}
	
	@JsonProperty("headers")
	public void setHeaders(MultiValueMap<String, String> map) {
		this.headerMap.clear();
		if(!ObjectUtils.isEmpty(map)) {
			this.headerMap.putAll(map);
		}
	}

	@Override
	@JsonIgnore
	public String getHeader(String strHeader) {
		List<String> list = this.getHeaderValues(strHeader);
		if(!ObjectUtils.isEmpty(list)) {
			return list.get(0);
		}
		return null;
	}

	@Override
	@JsonIgnore
	public List<String> getHeaderValues(String strHeader) {
		Assert.hasLength(strHeader, "传入头部键名无效");
		return this.headerMap.get(strHeader);
	}
	
	@Override
	@JsonIgnore
	public List<String> getHeaderNames() {
		return new ArrayList<String>(this.headerMap.keySet());
	}

	@Override
	@JsonIgnore
	public void addHeader(String strHeader, String strValue) {
		Assert.hasLength(strHeader, "传入头部键名无效");
		Assert.hasLength(strValue, "传入头部值无效");
		List<String> list = this.headerMap.get(strHeader);
		if(list == null) {
			list = new ArrayList<String>();
			this.headerMap.put(strHeader, list);
		}
		if(!list.contains(strValue)) {
			list.add(strValue);
		}
	}
	
	@Override
	@JsonIgnore
	public void addHeaderValues(String strHeader, List<String> value) {
		Assert.hasLength(strHeader, "传入头部键名无效");
		Assert.notEmpty(value, "传入头部值无效");
		
		List<String> list = this.headerMap.get(strHeader);
		if(list == null) {
			list = new ArrayList<String>();
			this.headerMap.put(strHeader, list);
		}
		for(String strValue : value) {
			if(!list.contains(strValue)) {
				list.add(strValue);
			}
		}
	}

	@Override
	@JsonIgnore
	public void setHeader(String strHeader, String strValue) {
		Assert.hasLength(strHeader, "传入头部键名无效");
		Assert.hasLength(strValue, "传入头部值无效");
		List<String> list = this.headerMap.get(strHeader);
		if(list == null) {
			list = new ArrayList<String>();
			this.headerMap.put(strHeader, list);
		}
		list.clear();
		list.add(strValue);
	}

	@Override
	@JsonIgnore
	public void setHeaderValues(String strHeader, List<String> value) {
		Assert.hasLength(strHeader, "传入头部键名无效");
		if(ObjectUtils.isEmpty(value)) {
			this.headerMap.remove(strHeader);
		}
		else {
			List<String> list = this.headerMap.get(strHeader);
			if(list == null) {
				list = new ArrayList<String>();
				this.headerMap.put(strHeader, list);
			}
			list.clear();
			for(String strValue : value) {
				if(!list.contains(strValue)) {
					list.add(strValue);
				}
			}
		}
	}

	@Override
	@JsonIgnore
	public void resetHeader(String strHeader) {
		Assert.hasLength(strHeader, "传入头部键名无效");
		this.headerMap.remove(strHeader);
	}

	@Override
	@JsonIgnore
	public void resetHeader(String strHeader, String strValue) {
		Assert.hasLength(strHeader, "传入头部键名无效");
		Assert.hasLength(strValue, "传入头部值无效");
		List<String> list = this.headerMap.get(strHeader);
		if(list == null) {
			return;
		}
		list.remove(strValue);
	}

	@Override
	@JsonProperty("body")
	public Object getBody() {
		return this.body;
	}

	@Override
	@JsonProperty("body")
	public void setBody(Object body) {
		this.body = body;
	}

	@Override
	@JsonProperty("statusCode")
	public int getStatusCode() {
		return this.nStatusCode;
	}

	@Override
	@JsonProperty("statusCode")
	public void setStatusCode(int nStatusCode) {
		this.nStatusCode = nStatusCode;
	}

	@Override
	@JsonProperty("contentType")
	public String getContentType() {
		return this.strContentType;
	}

	@Override
	@JsonProperty("contentType")
	public void setContentType(String strContentType) {
		this.strContentType = strContentType;
	}

	@Override
	public String toString() {
		return JsonUtils.toString(this);
	}

}
