package net.ibizsys.central.service.client;

import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntimeException;
import net.ibizsys.central.service.RequestMethods;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class WebClientBase implements IWebClient {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(WebClientBase.class);
	
	private static final String[] SECURITY_KEYS = {"login", "client", "username", "password", "secret", "token", "authorization"};
	
	@Deprecated
	public static ObjectMapper MAPPER = new ObjectMapper();
	
	/**
	 * 输出转换对象
	 */
	@Deprecated
	public static ObjectMapper OUTMAPPER = new ObjectMapper();
	
	/**
	 * 获取输入Mapper对象
	 * @return
	 */
	public static ObjectMapper getInputMapper() {
		return MAPPER;
	}
	
	/**
	 * 设置输入Mapper对象
	 * @param mapper
	 */
	public static void setInputMapper(ObjectMapper mapper) {
		if(mapper == null) {
			WebClientBase.MAPPER = new ObjectMapper();
		}
		else {
			WebClientBase.MAPPER = mapper;
		}
	}
	
	/**
	 * 获取输出Mapper对象
	 * @return
	 */
	public static ObjectMapper getOutputMapper() {
		return OUTMAPPER;
	}
	
	/**
	 * 设置输出Mapper对象
	 * @param mapper
	 */
	public static void setOutputMapper(ObjectMapper mapper) {
		if(mapper == null) {
			WebClientBase.OUTMAPPER = new ObjectMapper();
		}
		else {
			WebClientBase.OUTMAPPER = mapper;
		}
	}
	
	private static int maxFileSize = 128 * 1024 * 1024;
	
	public static int getMaxFileSize() {
		return maxFileSize;
	}
	
	public static void setMaxFileSize(int nMaxFileSize) {
		maxFileSize = nMaxFileSize;
	}
	
	
	private static int maxRequestSize = 128 * 1024 * 1024;
	
	public static int getMaxRequestSize() {
		return maxRequestSize;
	}
	
	public static void setMaxRequestSize(int nMaxRequestSize) {
		maxRequestSize = nMaxRequestSize;
	}
	
	
	private static int maxInMemorySize = 128 * 1024 * 1024;
	
	public static int getMaxInMemorySize() {
		return maxInMemorySize;
	}
	
	public static void setMaxInMemorySize(int nMaxInMemorySize) {
		maxInMemorySize = nMaxInMemorySize;
	}
	
	
	private ISystemRuntime iSystemRuntime;
	private ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime;
	
	private String strServiceUrl = null;
	private Map<String, Object> globalHeaderMap = null;
	
	public WebClientBase() {
		
	}
	

	@Override
	public void init(ISystemRuntime iSystemRuntime) throws Exception {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象无效");
		this.iSystemRuntime = iSystemRuntime;
		this.onInit();
	}

	@Override
	public void init(ISystemRuntime iSystemRuntime, String strServiceUrl, Map<String, ?> headers) throws Exception {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象无效");
		this.iSystemRuntime = iSystemRuntime;
		this.strServiceUrl = strServiceUrl;
		if (headers != null) {
			this.setHeaders(headers);
		}
		this.onInit();
	}

	@Override
	public void init(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime) throws Exception {
		Assert.notNull(iSubSysServiceAPIRuntime, "传入外部服务接口运行时上下文对象无效");
		this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
		this.iSystemRuntime = this.iSubSysServiceAPIRuntime.getSystemRuntime();
		this.setServiceUrl(iSubSysServiceAPIRuntime.getServiceUrl());
		this.onInit();
	}
	
	@Override
	public void init(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime, String strServiceUrl) throws Exception {
		Assert.notNull(iSubSysServiceAPIRuntime, "传入外部服务接口运行时上下文对象无效");
		this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
		this.iSystemRuntime = this.iSubSysServiceAPIRuntime.getSystemRuntime();
		this.setServiceUrl(strServiceUrl);
		this.onInit();
	}
	
	protected void onInit() throws Exception{
		
	}

	
	@Override
	public <T> T getProxyClient(Class<?> cls) {
		WebClientInvocationHandler<T> webClientInvocationHandler = new WebClientInvocationHandler(this, cls);
		return webClientInvocationHandler.getProxyClient();
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}

	protected ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		return this.iSubSysServiceAPIRuntime;
	}

	protected void setHeaders(Map<String, ?> headers) {
		Map<String, Object> map = null;
		if (headers != null) {
			map = new ConcurrentHashMap<String, Object>();
			map.putAll(headers);
		}
		this.globalHeaderMap = map;
	}

	@Override
	public Map<String, ?> getHeaders() {
		ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = getSubSysServiceAPIRuntime();
		if(iSubSysServiceAPIRuntime != null) {
			return iSubSysServiceAPIRuntime.getHeaders();
		}
		return this.globalHeaderMap;
	}
	
	

	@Override
	public Map<String, ?> getHeaders(boolean bAuthMode) {
		ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = getSubSysServiceAPIRuntime();
		if(iSubSysServiceAPIRuntime != null) {
			return iSubSysServiceAPIRuntime.getHeaders(bAuthMode);
		}
		return this.globalHeaderMap;
	}

	@Override
	public String getServiceUrl() {
		return this.strServiceUrl;
	}

	protected void setServiceUrl(String strServiceUrl) {
		this.strServiceUrl = strServiceUrl;
	}

	@Override
	public <T> IWebClientRep<T> get(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable {
		try {
			if(log.isDebugEnabled()) {
				log.debug(String.format("GET[%1$s], uri=%2$s, header=%3$s, queries=%4$s", strUri, getDebugParamString(uriParams), getDebugParamString(headers), getDebugParamString(queries)));
			}
			return this.onGet(strUri, uriParams, headers, queries, cls, objTag);
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	protected <T> IWebClientRep<T> onGet(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public <T> IWebClientRep<T> get(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, TypeReference<T> type, Object objTag) throws Throwable {
		IWebClientRep<String> rep = this.get(strUri, uriParams, headers, queries, String.class, objTag);
		try {
			//转换实际内容
			T t = null;
			if(StringUtils.hasLength(rep.getBody())) {
				//t = this.getSystemRuntime().deserialize(rep.getBody(), type);
				t = MAPPER.readValue(rep.getBody(), type);
			}
			return new WebClientRep<T>(t, rep.getHeaders());
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	@Override
	public <T> IWebClientRep<T> post(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable {
		try {
			if(log.isDebugEnabled()) {
				log.debug(String.format("POST[%1$s], uri=%2$s, header=%3$s, queries=%4$s, body=%5$s", strUri, getDebugParamString(uriParams), getDebugParamString(headers), getDebugParamString(queries), getDebugParamString(objBody)));
			}
			return this.onPost(strUri, uriParams, headers, queries, getBodyContent(objBody, strContentType), strContentType, cls, objTag);
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}	
	}

	protected <T> IWebClientRep<T> onPost(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public <T> IWebClientRep<T> post(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, TypeReference<T> type, Object objTag) throws Throwable {
		IWebClientRep<String> rep = this.post(strUri, uriParams, headers, queries, objBody, strContentType, String.class, objTag);
		try {
			//转换实际内容
			T t = null;
			if(StringUtils.hasLength(rep.getBody())) {
				//t = this.getSystemRuntime().deserialize(rep.getBody(), type);
				t = MAPPER.readValue(rep.getBody(), type);
			}
			return new WebClientRep<T>(t, rep.getHeaders());
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	@Override
	public <T> IWebClientRep<T> put(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable {
		try {
			if(log.isDebugEnabled()) {
				log.debug(String.format("PUT[%1$s], uri=%2$s, header=%3$s, queries=%4$s, body=%5$s", strUri, getDebugParamString(uriParams), getDebugParamString(headers), getDebugParamString(queries), getDebugParamString(objBody)));
			}
			return this.onPut(strUri, uriParams, headers, queries,  getBodyContent(objBody, strContentType), strContentType, cls, objTag);
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}	
	}

	protected <T> IWebClientRep<T> onPut(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public <T> IWebClientRep<T> put(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, TypeReference<T> type, Object objTag) throws Throwable {
		IWebClientRep<String> rep = this.put(strUri, uriParams, headers, queries, objBody, strContentType, String.class, objTag);
		try {
			//转换实际内容
			T t = null;
			if(StringUtils.hasLength(rep.getBody())) {
				//t = this.getSystemRuntime().deserialize(rep.getBody(), type);
				t = MAPPER.readValue(rep.getBody(), type);
			}
			return new WebClientRep<T>(t, rep.getHeaders());
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	@Override
	public <T> IWebClientRep<T> patch(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable {
		try {
			if(log.isDebugEnabled()) {
				log.debug(String.format("PATCH[%1$s], uri=%2$s, header=%3$s, queries=%4$s, body=%5$s", strUri, getDebugParamString(uriParams), getDebugParamString(headers), getDebugParamString(queries), getDebugParamString(objBody)));
			}
			return this.onPatch(strUri, uriParams, headers, queries, getBodyContent(objBody, strContentType), strContentType, cls, objTag);
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	protected <T> IWebClientRep<T> onPatch(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public <T> IWebClientRep<T> patch(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, TypeReference<T> type, Object objTag) throws Throwable {
		IWebClientRep<String> rep = this.patch(strUri, uriParams, headers, queries, objBody, strContentType, String.class, objTag);
		try {
			//转换实际内容
			T t = null;
			if(StringUtils.hasLength(rep.getBody())) {
				//t = this.getSystemRuntime().deserialize(rep.getBody(), type);
				t = MAPPER.readValue(rep.getBody(), type);
			}
			return new WebClientRep<T>(t, rep.getHeaders());
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	@Override
	public <T> IWebClientRep<T> delete(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable {
		try {
			if(log.isDebugEnabled()) {
				log.debug(String.format("DELETE[%1$s], uri=%2$s, header=%3$s, queries=%4$s", strUri, getDebugParamString(uriParams), getDebugParamString(headers), getDebugParamString(queries)));
			}
			return this.onDelete(strUri, uriParams, headers, queries, cls, objTag);
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	protected <T> IWebClientRep<T> onDelete(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public <T> IWebClientRep<T> delete(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, TypeReference<T> type, Object objTag) throws Throwable {
		IWebClientRep<String> rep = this.delete(strUri, uriParams, headers, queries, String.class, objTag);
		try {
			//转换实际内容
			T t = null;
			if(StringUtils.hasLength(rep.getBody())) {
				//t = this.getSystemRuntime().deserialize(rep.getBody(), type);
				t = MAPPER.readValue(rep.getBody(), type);
			}
			return new WebClientRep<T>(t, rep.getHeaders());
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	@Override
	public <T> IWebClientRep<T> head(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable {
		try {
			if(log.isDebugEnabled()) {
				log.debug(String.format("HEADER[%1$s], uri=%2$s, header=%3$s, queries=%4$s", strUri, getDebugParamString(uriParams), getDebugParamString(headers), getDebugParamString(queries)));
			}
			return this.onHead(strUri, uriParams, headers, queries, cls, objTag);
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	protected <T> IWebClientRep<T> onHead(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public <T> IWebClientRep<T> head(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, TypeReference<T> type, Object objTag) throws Throwable {
		IWebClientRep<String> rep = this.head(strUri, uriParams, headers, queries, String.class, objTag);
		try {
			//转换实际内容
			T t = null;
			if(StringUtils.hasLength(rep.getBody())) {
				//t = this.getSystemRuntime().deserialize(rep.getBody(), type);
				t = MAPPER.readValue(rep.getBody(), type);
			}
			return new WebClientRep<T>(t, rep.getHeaders());
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}
	
	

//	@Override
//	public <T> IWebClientRep<T> options(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objData, Class<T> cls, Object objTag) throws Throwable {
//		try {
//			return this.onOptions(strUri, uriParams, headers, objData, cls, objTag);
//		}
//		catch (Throwable ex) {
//			throw dealException(ex);
//		}
//	}
//
//	protected <T> IWebClientRep<T> onOptions(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objData, Class<T> cls, Object objTag) throws Throwable {
//		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), "没有实现", Errors.NOTIMPL);
//	}
//
//	@Override
//	public <T> IWebClientRep<T> trace(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objData, Class<T> cls, Object objTag) throws Throwable {
//		try {
//			return this.onTrace(strUri, uriParams, headers, objData, cls, objTag);
//		}
//		catch (Throwable ex) {
//			throw dealException(ex);
//		}
//	}
//
//	protected <T> IWebClientRep<T> onTrace(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objData, Class<T> cls, Object objTag) throws Throwable {
//		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), "没有实现", Errors.NOTIMPL);
//	}

	@Override
	public IWebClientRep<String> get(String strUri, Map<String, ?> uriParams) throws Throwable {
		return this.get(strUri, uriParams, null);
	}


	@Override
	public IWebClientRep<String> get(String strUri, Map<String, ?> uriParams, Map<String, ?> headers) throws Throwable {
		return this.get(strUri, uriParams, headers, null);
	}


	@Override
	public IWebClientRep<String> get(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries) throws Throwable {
		return this.get(strUri, uriParams, headers, queries, String.class, null);
	}


	@Override
	public IWebClientRep<String> post(String strUri, Map<String, ?> uriParams, Object objBody) throws Throwable {
		return this.post(strUri, uriParams, null, objBody);
	}


	@Override
	public IWebClientRep<String> post(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objBody) throws Throwable {
		return this.post(strUri, uriParams, headers, null, objBody);
	}


	@Override
	public IWebClientRep<String> post(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody) throws Throwable {
		return this.post(strUri, uriParams, headers, queries, objBody, null, String.class, null);
	}


	@Override
	public IWebClientRep<String> put(String strUri, Map<String, ?> uriParams, Object objBody) throws Throwable {
		return this.put(strUri, uriParams, null, objBody);
	}


	@Override
	public IWebClientRep<String> put(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objBody) throws Throwable {
		return this.put(strUri, uriParams, headers, null, objBody);
	}


	@Override
	public IWebClientRep<String> put(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody) throws Throwable {
		return this.put(strUri, uriParams, headers, queries, objBody, null, String.class, null);
	}


	@Override
	public IWebClientRep<String> delete(String strUri, Map<String, ?> uriParams) throws Throwable {
		return this.delete(strUri, uriParams, null);
	}


	@Override
	public IWebClientRep<String> delete(String strUri, Map<String, ?> uriParams, Map<String, ?> headers) throws Throwable {
		return this.delete(strUri, uriParams, headers, null);
	}


	@Override
	public IWebClientRep<String> delete(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries) throws Throwable {
		return this.delete(strUri, uriParams, headers, queries, String.class, null);
	}


	@Override
	public IWebClientRep<?> upload(String strUri, Map<String, ?> uriParams, Object objFile) throws Throwable {
		return this.upload(strUri, uriParams, null, objFile);
	}


	@Override
	public IWebClientRep<?> upload(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objFile) throws Throwable {
		return this.upload(strUri, uriParams, headers, null, objFile);
	}


	@Override
	public IWebClientRep<?> upload(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile) throws Throwable {
		return this.upload(strUri, uriParams, headers, queries, objFile, null);
	}


	@Override
	public IWebClientRep<?> download(String strUri, Map<String, ?> uriParams, Object objFile) throws Throwable {
		return this.download(strUri, uriParams, null, objFile);
	}


	@Override
	public IWebClientRep<?> download(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Object objFile) throws Throwable {
		return this.download(strUri, uriParams, headers, null, objFile);
	}


	@Override
	public IWebClientRep<?> download(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile) throws Throwable {
		return this.download(strUri, uriParams, headers, queries, objFile, null);
	}
	
	


	@Override
	public IWebClientRep<String> get(String strUri) throws Throwable {
		return this.get(strUri, null);
	}


	@Override
	public IWebClientRep<String> post(String strUri, Object objBody) throws Throwable {
		return this.post(strUri, null, objBody);
	}


	@Override
	public IWebClientRep<String> put(String strUri, Object objBody) throws Throwable {
		return this.put(strUri, null, objBody);
	}


	@Override
	public IWebClientRep<String> delete(String strUri) throws Throwable {
		return this.delete(strUri, null);
	}


	@Override
	public IWebClientRep<?> upload(String strUri, Object objFile) throws Throwable {
		return this.upload(strUri, null, objFile);
	}


	@Override
	public IWebClientRep<?> download(String strUri, Object objFile) throws Throwable {
		return this.download(strUri, null, objFile);
	}


	@Override
	public IWebClientRep<?> upload(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile, Object objTag) throws Throwable {
		try {
			if(log.isDebugEnabled()) {
				log.debug(String.format("UPLOAD[%1$s], uri=%2$s, header=%3$s, queries=%4$s", strUri, getDebugParamString(uriParams), getDebugParamString(headers), getDebugParamString(queries)));
			}
			return this.onUpload(strUri, uriParams, headers, queries, objFile, objTag);
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	protected IWebClientRep<?> onUpload(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile, Object objTag) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IWebClientRep<?> download(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile, Object objTag) throws Throwable {
		try {
			if(log.isDebugEnabled()) {
				log.debug(String.format("DOWNLOAD[%1$s], uri=%2$s, header=%3$s, queries=%4$s", strUri, getDebugParamString(uriParams), getDebugParamString(headers), getDebugParamString(queries)));
			}
			return this.onDownload(strUri, uriParams, headers, queries, objFile, objTag);
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}

	protected IWebClientRep<?> onDownload(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objData, Object objTag) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), "没有实现", Errors.NOTIMPL);
	}

	@Override
	public <T> IWebClientRep<T> execute(String strMethod, String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objData, String strContentType, Class<T> cls, Object objTag) throws Throwable {
		Assert.hasLength(strMethod, "未传入请求方式");

		if (RequestMethods.POST.equalsIgnoreCase(strMethod)) {
			return this.post(strUri, uriParams, headers, queries, objData, strContentType, cls, objTag);
		}
		if (RequestMethods.PUT.equalsIgnoreCase(strMethod)) {
			return this.put(strUri, uriParams, headers, queries, objData, strContentType, cls, objTag);
		}
		if (RequestMethods.PATCH.equalsIgnoreCase(strMethod)) {
			return this.patch(strUri, uriParams, headers, queries, objData, strContentType, cls, objTag);
		}
		

		
//		if ("UPLOAD".equalsIgnoreCase(strMethod)) {
//			return this.upload(strUri, uriParams, headers, queries, objData, objTag);
//		}
//		if ("DOWNLOAD".equalsIgnoreCase(strMethod)) {
//			return this.download(strUri, uriParams, headers, queries, objData, objTag);
//		}
		
		if(queries == null && objData!=null) {
			if(objData instanceof Map) {
				queries = (Map)objData;
			}
			else
				if(objData instanceof IEntity) {
					queries = ((IEntity)objData).any();
				}
		}
		
		if (RequestMethods.GET.equalsIgnoreCase(strMethod)) {
			return this.get(strUri, uriParams, headers, queries, cls, objTag);
		}
		
		if (RequestMethods.HEAD.equalsIgnoreCase(strMethod)) {
			return this.head(strUri, uriParams, headers, queries, cls, objTag);
		}
		
		if (RequestMethods.DELETE.equalsIgnoreCase(strMethod)) {
			return this.delete(strUri, uriParams, headers, queries, cls, objTag);
		}
		
//		if (RequestMethods.TRACE.equalsIgnoreCase(strMethod)) {
//			return this.trace(strUri, uriParams, headers, objData, cls, objTag);
//		}
//		
//		if (RequestMethods.OPTIONS.equalsIgnoreCase(strMethod)) {
//			return this.options(strUri, uriParams, headers, objData, cls, objTag);
//		}

		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), String.format("无法识别的请求方式[%1$s]", strMethod));
	}
	
	
	@Override
	public <T> IWebClientRep<T> execute(String strMethod, String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objData, String strContentType, TypeReference<T> type, Object objTag) throws Throwable {
		Assert.hasLength(strMethod, "未传入请求方式");
		IWebClientRep<String> rep = this.execute(strMethod, strUri, uriParams, headers, queries, objData, strContentType, String.class, objTag);
		try {
			//转换实际内容
			T t = null;
			if(StringUtils.hasLength(rep.getBody())) {
				//t = this.getSystemRuntime().deserialize(rep.getBody(), type);
				t = MAPPER.readValue(rep.getBody(), type);
			}
			return new WebClientRep<T>(t, rep.getHeaders());
		}
		catch (Throwable ex) {
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.WEBCLIENT, ex.getMessage(), null);
			throw dealException(ex);
		}
	}
	
	
	/**
	 * 将传入参数转换成Web请求参数
	 *
	 * @param params
	 * @return
	 */
	public static String getUrlParams(Object params) throws Exception {
		return getUrlParams(params, true);
	}
	
	
	/**
	 * 将传入Map转换成Web请求参数
	 *
	 * @param map
	 * @return
	 */
	public static String getUrlParams(Map<String, ?> map) throws Exception {
		return getUrlParams(map, true);
	}
	
	
	/**
	 * 将传入参数转换成Web请求参数
	 *
	 * @param params
	 * @return
	 */
	public static String getUrlParams(Object params, boolean bEncode) throws Exception {
		if (params == null) {
			return "";
		}
		Map map = null;
		if(params instanceof Map) {
			map = (Map) params;
		}
		else
			if(params instanceof IEntity) {
				map = ((IEntity)params).any();
			}
			else {
				throw new Exception("无法识别的请求参数对象");
			}
		
			
		return getUrlParams(map, bEncode);
	}
	
	
	/**
	 * 将传入Map转换成Web请求参数
	 *
	 * @param map
	 * @return
	 */
	public static String getUrlParams(Map<String, ?> map, boolean bEncode) throws Exception {
		if (map == null) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		boolean bFirst = true;
		for (Map.Entry<String, ?> entry : map.entrySet()) {
			if (entry.getValue() == null) {
				continue;
			} else {
				if (bFirst) {
					bFirst = false;
				} else {
					sb.append("&");
				}
				if (bEncode && (entry.getValue() instanceof String)) {
					sb.append(entry.getKey() + "=" + URLEncoder.encode((String) entry.getValue(), "UTF-8"));
				} else {
					sb.append(entry.getKey() + "=" + entry.getValue());
				}
			}
		}
		return sb.toString();
	}
	
	protected Throwable dealException(Throwable ex) {
		if(ex instanceof ISubSysServiceAPIRuntimeException) {
			if(((ISubSysServiceAPIRuntimeException)ex).getStatusCode() == HttpStatus.UNAUTHORIZED.value()) {
				if(this.getSubSysServiceAPIRuntime() != null) {
					this.getSubSysServiceAPIRuntime().requestToken();
				}
			}
		}
		return ex;
	}
	
	protected String getDebugParamString(Object objValue) {
		if(ObjectUtils.isEmpty(objValue)) {
			return null;
		}
		
		String strDebugString = null;
		try {
			//return (String)this.getSystemRuntime().serialize(objValue);
			if(objValue instanceof String) {
				strDebugString = (String)objValue;
			}
			strDebugString = getOutputMapper().writeValueAsString(objValue);
		}
		catch(Throwable ex) {
			return ex.getMessage();
		}
		
		String strDebugString2 = strDebugString.toLowerCase();
		for(String strToken : SECURITY_KEYS) {
			if(strDebugString2.indexOf(strToken) != -1) {
				return "******";
			}
		}
		return strDebugString;
	}
	

	
	
	protected Object getBodyContent(Object objValue, String strContentType) throws JsonProcessingException {
		if(ObjectUtils.isEmpty(objValue)) {
			return objValue;
		}
		
		if(!StringUtils.hasLength(strContentType) || strContentType.equals(MediaType.APPLICATION_JSON_VALUE)) {
			if(!(objValue instanceof String)){
				return getOutputMapper().writeValueAsString(objValue);
			}
		}
		
		return objValue;
	}
	
//	@Override
//	public Object serialize(Object obj) {
//		Assert.notNull(obj, "不能传入空对象");
//		try {
//			return JsonUtils.MAPPER.writeValueAsString(obj);
//		} catch (Exception ex) {
//			throw new SystemRuntimeException(this, String.format("序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
//		}
//	}
//
//	@Override
//	public <T> T deserialize(Object objData, Class<T> cls) {
//		if (!(objData instanceof String)) {
//			throw new SystemRuntimeException(this, String.format("无法识别的输入数据"));
//		}
//		Assert.hasLength((String) objData, "不能传入空数据");
//		try {
//			return (T) JsonUtils.MAPPER.readValue((String) objData, cls);
//
//		} catch (Exception ex) {
//			throw new SystemRuntimeException(this, String.format("反序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
//		}
//	}
//
//	@Override
//	public <T> T deserialize(Object objData, TypeReference<T> type) {
//		if (!(objData instanceof String)) {
//			throw new SystemRuntimeException(this, String.format("无法识别的输入数据"));
//		}
//		Assert.hasLength((String) objData, "不能传入空数据");
//		try {
//			return (T) JsonUtils.MAPPER.readValue((String) objData, type);
//
//		} catch (Exception ex) {
//			throw new SystemRuntimeException(this, String.format("反序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
//		}
//	}
}
