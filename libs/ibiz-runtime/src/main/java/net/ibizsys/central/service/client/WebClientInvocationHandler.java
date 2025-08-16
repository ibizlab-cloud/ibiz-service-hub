package net.ibizsys.central.service.client;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.PageRequest;
import net.ibizsys.runtime.util.DataTypeUtils;

public class WebClientInvocationHandler<T> implements InvocationHandler{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(WebClientInvocationHandler.class);
	
	private IWebClient iWebClient = null;
	private Class<T> cls = null;
	private T t = null;
	
	public WebClientInvocationHandler(IWebClient iWebClient, Class<T> cls) {
		this.iWebClient = iWebClient;
		this.cls = cls;
		this.t = (T)Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] {cls}, this);
	}
	
	public WebClientInvocationHandler(ISystemRuntime iSystemRuntime, IWebClient iWebClient, Class<T> cls) {
		this.iWebClient = iWebClient;
		this.cls = cls;
		try {
			this.t = (T)Proxy.newProxyInstance(iSystemRuntime.getGroovyClassLoader(), new Class[] {cls}, this);
		}
		catch (Throwable ex) {
			log.error(ex);
			this.t = (T)Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] {cls}, this);
		}
	}
	
	
	protected IWebClient getWebClient() {
		return this.iWebClient;
	}
	
	protected Class<T> getIntCls(){
		return this.cls;
	}
	
	public T getProxyClient() {
		return t;
	}
	
	@Override
	public Object invoke(Object arg0, Method method, Object[] arg2) throws Throwable {
		
		Class<?> returnType = method.getReturnType();
		//获取返回值
		Map<String, Object> uriParams = new LinkedHashMap<String, Object>();
		Map<String, Object> headers = new LinkedHashMap<String, Object>();
		Map<String, Object> queries = new LinkedHashMap<String, Object>();
		Object objBody = null;
		Annotation[][] annotations = method.getParameterAnnotations();
		int nParamCount = method.getParameterCount();
		for(int i = 0;i<nParamCount;i++) {
			if(annotations[i].length == 0) {
				continue;
			}
			
			Annotation annotation = annotations[i][0];
			if(annotation instanceof RequestHeader) {
				RequestHeader requestHeader = (RequestHeader)annotation;
				if(StringUtils.hasLength(requestHeader.name())) {
					headers.put(requestHeader.name(), arg2[i]);
				}
				else {
					headers.put(requestHeader.value(), arg2[i]);
				}
				
				continue;
			}
			
			if(annotation instanceof PathVariable) {
				PathVariable pathVariable = (PathVariable)annotation;
				if(StringUtils.hasLength(pathVariable.name())) {
					uriParams.put(pathVariable.name(), arg2[i]);
				}
				else {
					uriParams.put(pathVariable.value(), arg2[i]);
				}
				continue;
			}
			
			if(annotation instanceof RequestParam) {
				RequestParam requestParam = (RequestParam)annotation;
				if(StringUtils.hasLength(requestParam.name())) {
					queries.put(requestParam.name(), arg2[i]);
				}
				else {
					queries.put(requestParam.value(), arg2[i]);
				}
				continue;
			}
			
			
			if(annotation instanceof RequestBody) {
				objBody = arg2[i];
				continue;
			}
			
			log.warn(String.format("不支持的参数注解[%1$s]", annotation));
		}
		
		
		String strUri = null;
		String strMethod = null;
		RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
		if(requestMapping != null) {
			strUri = requestMapping.value()[0];
			strMethod = requestMapping.method()[0].toString();
		}
		else {
			GetMapping getMapping = method.getAnnotation(GetMapping.class);
			if(getMapping != null) {
				strUri = getMapping.value()[0];
				strMethod = RequestMethod.GET.toString();
			}
			else
			{
				PostMapping postMapping = method.getAnnotation(PostMapping.class);
				if(postMapping != null) {
					strUri = postMapping.value()[0];
					strMethod = RequestMethod.POST.toString();
				}
				else
				{
					PutMapping putMapping = method.getAnnotation(PutMapping.class);
					if(putMapping != null) {
						strUri = putMapping.value()[0];
						strMethod = RequestMethod.PUT.toString();
					}
					else
					{
						DeleteMapping deleteMapping = method.getAnnotation(DeleteMapping.class);
						if(deleteMapping != null) {
							strUri = deleteMapping.value()[0];
							strMethod = RequestMethod.DELETE.toString();
						}
					}
				}
			}
		}
		
		if(StringUtils.hasLength(strUri)) {
			if(IWebClientRep.class.isAssignableFrom(returnType)) {
				return this.getWebClient().execute(strMethod, strUri, uriParams, headers, queries, objBody, null, returnType, null);
			}
			
			if(Page.class.isAssignableFrom(returnType)) {
				
				Class<?> itemCls = null;
				Type genericReturnType = method.getGenericReturnType();
				if (genericReturnType instanceof ParameterizedType) {
					
					Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
					if(actualTypeArguments != null && actualTypeArguments.length !=0) {
						Type type = actualTypeArguments[0];
						if (type instanceof Class<?>) {
							itemCls = (Class<?>) type;
						} else if (type instanceof WildcardType) {
							WildcardType wildcardType = (WildcardType) type;
							itemCls = (Class<?>) wildcardType.getUpperBounds()[0];
						}
					}
				}

				
				List contentList = new ArrayList<>();
				IWebClientRep<String> rep = this.getWebClient().execute(strMethod, strUri, uriParams, headers, queries, objBody, null, String.class, null);
				if(!ObjectUtils.isEmpty(rep.getBody())) {
					List<?> list = WebClientBase.MAPPER.readValue(rep.getBody(), List.class);
					if(!ObjectUtils.isEmpty(list)) {
						for(Object objItem: list) {
							if(itemCls == null) {
								EntityDTO dto = WebClientBase.MAPPER.convertValue(objItem, EntityDTO.class);
								//Map dto = WebClientBase.MAPPER.convertValue(objItem, Map.class);
								contentList.add(dto);
							}
							else {
								Object item = WebClientBase.MAPPER.convertValue(objItem, itemCls);
								contentList.add(item);
							}
						}
					}
				}
				
				int nTotal = DataTypeUtils.getIntegerValue(rep.getHeader("x-total"), 0);
				int nSize = DataTypeUtils.getIntegerValue(rep.getHeader("x-per-page"), 0);
				int nPage = DataTypeUtils.getIntegerValue(rep.getHeader("x-page"), 0);
				
				return new PageImpl(contentList, PageRequest.of(nPage, nSize, 0), nTotal);
			}
			
			
			return this.getWebClient().execute(strMethod, strUri, uriParams, headers, queries, objBody, null, returnType, null).getBody();
		}
		
		
		
		
		throw new Exception(String.format("无法识别的方法[%1$s]", method.getName()));
	}

}
