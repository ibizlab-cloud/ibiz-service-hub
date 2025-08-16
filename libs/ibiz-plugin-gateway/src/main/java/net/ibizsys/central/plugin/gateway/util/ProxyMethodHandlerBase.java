package net.ibizsys.central.plugin.gateway.util;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.cloud.gateway.mvc.ProxyExchange;
import org.springframework.http.ResponseEntity;

import net.ibizsys.central.cloud.core.service.util.MethodHandlerBase;

public abstract class ProxyMethodHandlerBase extends MethodHandlerBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ProxyMethodHandlerBase.class);
	
	private static Method proxyMethod = null;
	public static Method getProxyMethod() {
		if(ProxyMethodHandlerBase.proxyMethod == null) {
			for(Method method : ProxyMethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("proxy")) {
					ProxyMethodHandlerBase.proxyMethod = method;
					break;
				}
			}
		}
		return ProxyMethodHandlerBase.proxyMethod;
	}
	
	public ResponseEntity<?> proxy(ProxyExchange<byte[]> proxy, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)  {
       return this.onProxy(proxy, httpServletRequest, httpServletResponse);
    }
	
	protected ResponseEntity<?> onProxy(ProxyExchange<byte[]> proxy, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		throw new RuntimeException("没有实现");
	}
	
}
