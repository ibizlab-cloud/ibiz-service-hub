package net.ibizsys.central.service.client;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class WebClientRep<T> implements IWebClientRep<T> {

	private T body = null;
	
	private Map<String, String> headers = null;
	private MultiValueMap<String, String> headersEx = null;
	private int statusCode = HttpStatus.OK.value();
	
	public WebClientRep(T body, MultiValueMap<String, String> headersMap) {
		this(body, headersMap, HttpStatus.OK.value());
	}
	
	public WebClientRep(T body, MultiValueMap<String, String> headersMap, int statusCode) {
		this.body = body;
		this.statusCode = statusCode;
		if(headersMap != null) {
			
			this.headersEx = new LinkedMultiValueMap<String, String>();
			this.headersEx.putAll(headersMap);
			
			this.headers = new LinkedHashMap<String, String>();
			this.headers.putAll(this.headersEx.toSingleValueMap());
		}
	}
	
	@Override
	public MultiValueMap<String, String> getHeaders(){
		return this.headersEx;
	}
	
	@Override
	public String getHeader(String strHeader) {
		if(this.headers != null) {
			return this.headers.get(strHeader);
		}
		return null;
	}
	
	@Override
	public List<String> getHeaderValues(String strHeader) {
		if(this.headersEx != null) {
			return this.headersEx.get(strHeader);
		}
		return null;
	}

	@Override
	public T getBody() {
		return this.body;
	}

	@Override
	public int getStatusCode() {
		return this.statusCode;
	}

	
}
