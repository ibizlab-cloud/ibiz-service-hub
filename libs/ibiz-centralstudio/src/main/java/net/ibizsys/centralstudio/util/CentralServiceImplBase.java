package net.ibizsys.centralstudio.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import reactor.core.publisher.Mono;


public abstract class CentralServiceImplBase {

	private static ExchangeFilterFunction exchangeFilterFunction = null;
	
	public static void setExchangeFilterFunction(ExchangeFilterFunction exchangeFilterFunction) {
		CentralServiceImplBase.exchangeFilterFunction = exchangeFilterFunction;
		
	}
	
	public static ExchangeFilterFunction getExchangeFilterFunction(){
		return CentralServiceImplBase.exchangeFilterFunction;
	}

	private static ObjectMapper mapper = null;
	
	public static ObjectMapper getMapper() {
		if(CentralServiceImplBase.mapper == null) {
			CentralServiceImplBase.mapper = new ObjectMapper();
		}
		return CentralServiceImplBase.mapper;
	}
	
	public static void setMapper(ObjectMapper mapper) {
		CentralServiceImplBase.mapper = mapper;
	}
	
	private static Map<String, WebClient> webClientMap = new HashMap<String, WebClient>();
	
	protected WebClient getWebClient() {
		
		WebClient webClient = webClientMap.get(this.getServiceUrl());
		if(webClient != null) {
			return webClient;
		}
		
		if(StringUtils.hasLength(this.getServiceUrl())) {
			if(this.getServiceUrl().indexOf("lb://") == 0) {
				webClient = WebClient.builder().codecs(configurer -> configurer
		                .defaultCodecs()
		                .maxInMemorySize(16 * 1024 * 1024)).filter(getExchangeFilterFunction()).baseUrl(this.getServiceUrl()).build();
			}
			else {
				webClient = WebClient.builder().codecs(configurer -> configurer
		                .defaultCodecs()
		                .maxInMemorySize(16 * 1024 * 1024)).baseUrl(this.getServiceUrl()).build();
			}
		}
		else {
			webClient = WebClient.builder().codecs(configurer -> configurer
	                .defaultCodecs()
	                .maxInMemorySize(16 * 1024 * 1024)).build();
		}
		
		webClientMap.put(this.getServiceUrl(), webClient);
		return webClient;
	}
	
	protected CentralServiceSession getSession() {
		try {
			return CentralServiceSession.getCurrent();
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	
	protected boolean containsContext(String strName) {
		try {
			return CentralServiceSession.getCurrent().containsContext(strName);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	protected String getServiceUrl() {
		try {
			return CentralServiceSession.getCurrent().getServiceUrl();
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	protected <T> T executeGet(String strUri, Object objKey, Class<T> cls) throws Throwable {
		CentralServiceSession csServiceSession = CentralServiceSession.getCurrent();
		Object lastKey = csServiceSession.getContext("key");
		csServiceSession.setContext("key", this.getKey(objKey));
		try {
			Mono<ResponseEntity<T>> mono = getWebClient().get().uri(strUri, csServiceSession.getContextMap())
					.header("Authorization", "Bearer " + getAuthorizationBearer(csServiceSession))
					.header("srfsystemid", csServiceSession.getSystemId())
					.header("srforgid", csServiceSession.getOrgId())
					.retrieve().toEntity(cls);
			return mono.block().getBody();
		}
		catch (WebClientResponseException ex) {
			String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
			if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
				ObjectNode objNode = (ObjectNode) getMapper().readTree(strError);
				if (objNode.get("message") != null) {
					String strMessage = objNode.get("message").asText();
					throw new Exception(strMessage, ex);
				}
			}
			throw ex;
		}
		finally {
			csServiceSession.setContext("key", lastKey);
		}
	}
	
	protected <T> T executeDelete(String strUri, Object objKey, Class<T> cls) throws Throwable {
		CentralServiceSession csServiceSession = CentralServiceSession.getCurrent();
		Object lastKey = csServiceSession.getContext("key");
		csServiceSession.setContext("key", this.getKey(objKey));
		try {
			Mono<ResponseEntity<T>> mono = getWebClient().delete().uri(strUri, csServiceSession.getContextMap())
					.header("Authorization", "Bearer " + getAuthorizationBearer(csServiceSession))
					.header("srfsystemid", csServiceSession.getSystemId())
					.header("srforgid", csServiceSession.getOrgId())
					.retrieve().toEntity(cls);
			return mono.block().getBody();
		}
		catch (WebClientResponseException ex) {
			String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
			if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
				ObjectNode objNode = (ObjectNode) getMapper().readTree(strError);
				if (objNode.get("message") != null) {
					String strMessage = objNode.get("message").asText();
					throw new Exception(strMessage, ex);
				}
			}
			throw ex;
		}
		finally {
			csServiceSession.setContext("key", lastKey);
		}
	}
	

	protected <T> T executePost(String strUri, Object objBody, Class<T> cls) throws Throwable {
		CentralServiceSession csServiceSession = CentralServiceSession.getCurrent();
		Object lastKey = csServiceSession.getContext("key");
		csServiceSession.setContext("key", this.getKey(objBody));
		try {
			Mono<ResponseEntity<T>> mono = getWebClient().post().uri(strUri, csServiceSession.getContextMap())
					.header("Authorization", "Bearer " + getAuthorizationBearer(csServiceSession))
					.header("srfsystemid", csServiceSession.getSystemId())
					.header("srforgid", csServiceSession.getOrgId())
					.bodyValue(objBody).retrieve().toEntity(cls);
			return mono.block().getBody();
		}
		catch (WebClientResponseException ex) {
			String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
			if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
				ObjectNode objNode = (ObjectNode) getMapper().readTree(strError);
				if (objNode.get("message") != null) {
					String strMessage = objNode.get("message").asText();
					throw new Exception(strMessage, ex);
				}
			}
			throw ex;
		}
		finally {
			csServiceSession.setContext("key", lastKey);
		}
	}
	
	protected <T> T executePut(String strUri, Object objBody, Class<T> cls) throws Throwable {
		CentralServiceSession csServiceSession = CentralServiceSession.getCurrent();
		Object lastKey = csServiceSession.getContext("key");
		csServiceSession.setContext("key", this.getKey(objBody));
		try {
			Mono<ResponseEntity<T>> mono = getWebClient().put().uri(strUri, csServiceSession.getContextMap())
					.header("Authorization", "Bearer " + getAuthorizationBearer(csServiceSession))
					.header("srfsystemid", csServiceSession.getSystemId())
					.header("srforgid", csServiceSession.getOrgId())
					.bodyValue(objBody).retrieve().toEntity(cls);
			return mono.block().getBody();
		}
		catch (WebClientResponseException ex) {
			String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
			if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
				ObjectNode objNode = (ObjectNode) getMapper().readTree(strError);
				if (objNode.get("message") != null) {
					String strMessage = objNode.get("message").asText();
					throw new Exception(strMessage, ex);
				}
			}
			throw ex;
		}
		finally {
			csServiceSession.setContext("key", lastKey);
		}
	}
	
	
	protected <T> Page<T> executeFetch(String strUri, ISearchContext iSearchContext, Class<T> cls) throws Throwable {

		CentralServiceSession csServiceSession = CentralServiceSession.getCurrent();
		try {
			Mono<ResponseEntity<List<T>>> mono = getWebClient().post().uri(strUri, csServiceSession.getContextMap())
					.header("Authorization", "Bearer " + getAuthorizationBearer(csServiceSession))
					.header("srfsystemid", csServiceSession.getSystemId())
					.header("srforgid", csServiceSession.getOrgId())
					.bodyValue(iSearchContext).retrieve().toEntityList(cls);

			ResponseEntity<List<T>> responseEntity = mono.block();

			List<String> list = responseEntity.getHeaders().get("x-total");
			if (list != null && list.size() > 0) {
				return new PageImpl<>(responseEntity.getBody(), iSearchContext.getPageable(), Integer.valueOf(list.get(0)));
			} else {
				return new PageImpl<>(responseEntity.getBody());
			}
		} catch (WebClientResponseException ex) {
			String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
			if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
				ObjectNode objNode = (ObjectNode) getMapper().readTree(strError);
				if (objNode.get("message") != null) {
					String strMessage = objNode.get("message").asText();
					throw new Exception(strMessage, ex);
				}
			}

			throw ex;
		}
	}
	
	protected Object getKey(Object arg) {
		if(arg instanceof List) {
			return StringUtils.collectionToDelimitedString((List)arg, ";");
		}
		
		if(arg instanceof ICentralEntityDTO) {
			return ((ICentralEntityDTO)arg).getSrfkey();
		}
		
		return arg;
	}
	
	
	protected String getAuthorizationBearer(CentralServiceSession csServiceSession) throws Throwable {
		String strBearer = csServiceSession.getBearer();
		if (StringUtils.hasLength(strBearer)) {
			return strBearer;
		}

//		try {
//			Map<String, String> bodyMap = new LinkedHashMap<String, String>();
//			bodyMap.put("loginname", psModelServiceSession.getUserName());
//			bodyMap.put("password", psModelServiceSession.getPassword());
//
//			Mono<Map> mono = getWebClient().post().uri(psModelServiceSession.getAccessTokenUrl()).bodyValue(bodyMap).retrieve().bodyToMono(Map.class);
//
//			Map t = mono.block();
//
//			String strToken = (String) t.get("token");
//			psModelServiceSession.setBearer(strToken);
//
//			return strToken;
//
//		} catch (WebClientResponseException ex) {
//			String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
//			if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
//				ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
//				if (objNode.get("message") != null) {
//					String strMessage = objNode.get("message").asText();
//					throw new Exception(strMessage, ex);
//				}
//			}
//
//			throw ex;
//		}

		return null;
	}
	
}
