package net.ibizsys.central.plugin.gateway.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.cloud.gateway.mvc.ProxyExchange;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import net.ibizsys.central.cloud.core.app.ServiceAppRuntimeBase;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRequestMappingAdapter;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.plugin.gateway.util.ProxyMethodHandlerBase;

public abstract class ProxyAppRuntimeBase extends ServiceAppRuntimeBase implements IProxyAppRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ProxyAppRuntimeBase.class);

	private String proxyUrl = null;

	@Override
	protected void onInit() throws Exception {

		if (!StringUtils.hasLength(this.getBaseUrl())) {
			this.prepareBaseUrl();
		}
		super.onInit();

		this.registerIgnoreAuthPattern();
	}

	protected void registerIgnoreAuthPattern() {
		String ignoreAuthPattern = String.format("%1$s/**", this.getBaseUrl());
		ServiceHub.getInstance().registerIgnoreAuthPattern(ignoreAuthPattern);
	}

	
	
	protected String getProxyUrl() {
		return proxyUrl;
	}

	protected void setProxyUrl(String proxyUrl) {
		this.proxyUrl = proxyUrl;
	}


	@Override
	protected void onRegisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		this.registerDefaultMapping(iSysServiceAPIRequestMappingAdapter);
	}
	
	protected void registerDefaultMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		String path = String.format("%1$s/**", this.getBaseUrl());
		RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(path).methods(RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE).build();

		ProxyMethodHandlerBase methodHandlerBase = new ProxyMethodHandlerBase() {
			@Override
			protected ResponseEntity<?> onProxy(ProxyExchange<byte[]> proxy, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
				return doProxy(proxy, httpServletRequest, httpServletResponse);
			}

		};
		iSysServiceAPIRequestMappingAdapter.registerMapping(this, requestMappingInfo, methodHandlerBase, ProxyMethodHandlerBase.getProxyMethod());
	}
	
	protected ResponseEntity<?> doProxy(ProxyExchange<byte[]> proxy, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		
//		String value = null;
//		Cookie[] cookies = httpServletRequest.getCookies();
//		if(cookies != null) {
//			for(Cookie cookie : cookies) {
//				if("proxycookie".equals(cookie.getName())) {
//					value = cookie.getValue();
//					break;
//				}
//			}
//		}
		
//		if(!StringUtils.hasLength(value)) {
//			try {
//				httpServletResponse.sendRedirect("http://www.baidu.com");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return null;
//		}
	
		String path = proxy.path(this.getBaseUrl());
		
		ResponseEntity<byte[]> rep = null;
		switch (httpServletRequest.getMethod()) {
		case "GET":
			rep = proxy.uri(this.getProxyUrl() + path).get();
			break;
		case "HEAD":
			rep = proxy.uri(this.getProxyUrl() + path).head();
			break;
		case "POST":
			rep = proxy.uri(this.getProxyUrl() + path).post();
			break;
		case "PUT":
			rep = proxy.uri(this.getProxyUrl() + path).put();
			break;
		case "PATCH":
			rep = proxy.uri(this.getProxyUrl() + path).patch();
			break;
		case "DELETE":
			rep = proxy.uri(this.getProxyUrl() + path).delete();
			break;
		case "OPTIONS":
			rep = proxy.uri(this.getProxyUrl() + path).options();
			break;
		default:
			throw new RuntimeException(String.format("未支持的请求方式[%1$s]", httpServletRequest.getMethod()));
		}
		
		
//		if(!StringUtils.hasLength(value)) {
//			httpServletResponse.addHeader("Set-Cookie", "proxycookie=112; Path=/; HttpOnly");
//		}
//		
		return rep;
	}


}
