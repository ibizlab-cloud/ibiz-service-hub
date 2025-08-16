package net.ibizsys.central.cloud.core.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import net.ibizsys.central.service.SysServiceAPIRuntimeException;

/**
 * 系统Restful服务接口运行时对象基类
 * 
 * @author lionlau
 *
 */
@RestController //这个注解必须有
public class SysRestServiceAPIRuntimeBase extends SysServiceAPIRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysRestServiceAPIRuntimeBase.class);
	
	private Map<String, RequestMappingInfo> requestMappingInfoMap = new HashMap<String, RequestMappingInfo>();
	private SysRestServiceAPIRuntimeBase proxyObject = null;
	
	public SysRestServiceAPIRuntimeBase() {
		
	}
	
	@Override
	protected void onInit() throws Exception {
		
		
		super.onInit();
	}
	
	@Override
	protected void prepareBaseUrl() throws Exception {
		//判断是否有注解
		RequestMapping requestMapping = this.getClass().getAnnotation(RequestMapping.class);
		if(requestMapping != null) {
			if(!ObjectUtils.isEmpty(requestMapping.path())) {
				this.setBaseUrl(requestMapping.path()[0]);
				return;
			}
			if(!ObjectUtils.isEmpty(requestMapping.value())) {
				this.setBaseUrl(requestMapping.value()[0]);
				return;
			}
		}
		super.prepareBaseUrl();
	}
	
	private SysRestServiceAPIRuntimeBase getSelf() {
		return this;
	}
	
	protected SysRestServiceAPIRuntimeBase getProxyObject() {
		return this.getProxyObject(false);
	}
	
	protected SysRestServiceAPIRuntimeBase getProxyObject(boolean bTryMode) {
		if(this.proxyObject != null || bTryMode) {
			return this.proxyObject;
		}
		throw new SysServiceAPIRuntimeException(this, String.format("代理对象无效"));
	}
	
	protected void setProxyObject(SysRestServiceAPIRuntimeBase proxyObject) {
		this.proxyObject = proxyObject;
	}
	
	

	protected void prepareProxyObject()  throws Exception{
		MethodInterceptor methodInterceptor = new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				RequestMappingInfo requestMappingInfo = requestMappingInfoMap.get(method.getName());
				if(requestMappingInfo == null){
					if(!method.isAccessible()) {
						method.setAccessible(true);
					}
					return method.invoke(getSelf(), args);
				}
				
				testAccessUser();
				try {
					return method.invoke(getSelf(), args);
				}
				catch (InvocationTargetException ex) {
					String causeMsg = ex.getMessage();
					causeMsg = ex.getCause() != null ? ex.getCause().getMessage() : causeMsg;
					log.error(String.format("执行方法[%1$s]发生异常，%2$s", method.getName(),causeMsg), ex.getCause());
					throw ex.getCause();
				}catch (Throwable ex) {
					//log.error(String.format("请求[%1$s]发生异常，%2$s",requestMappingInfo..getRequestURI(), ex.getMessage()), ex);
					log.error(String.format("执行方法[%1$s]发生异常，%2$s", method.getName(), ex.getMessage()), ex);
					throw ex;
				}
			}
		};
		
		this.setProxyObject((SysRestServiceAPIRuntimeBase)Enhancer.create(this.getClass(), methodInterceptor));
	}
	
	@Override
	protected void onRegisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		super.onRegisterMapping(iSysServiceAPIRequestMappingAdapter);
		
		//构建代理对象
		if(this.getProxyObject(true) == null) {
			this.prepareProxyObject();
		}
		

		registerMapping(iSysServiceAPIRequestMappingAdapter, this.getClass());
	}

	protected void registerMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter, Class<?> cls) throws Exception {

		Method[] methods = cls.getMethods();
		if (ObjectUtils.isEmpty(methods)) {
			return;
		}

		for (Method method : methods) {
			RequestMappingInfo requestMappingInfo = iSysServiceAPIRequestMappingAdapter.registerMapping(this, this.getProxyObject(), method);
			if(requestMappingInfo != null) {
				this.requestMappingInfoMap.put(method.getName(), requestMappingInfo);
			}
		}
	}

	

}
