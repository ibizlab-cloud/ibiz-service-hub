package net.ibizsys.central.cloud.core.service;

import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import net.ibizsys.central.ISystemGatewayContext;

public abstract class SysServiceAPIRequestMappingAdapterBase implements ISysServiceAPIRequestMappingAdapter{

	private RequestMappingHandlerMapping requestMappingHandlerMapping = null;
	private ISysServiceAPIDocAdapter sysServiceAPIDocAdapter = null;
	private ISystemGatewayContext systemGatewayContext = null;
	
	@Override
	public void init(ISystemGatewayContext systemGatewayContext, RequestMappingHandlerMapping requestMappingHandlerMapping, ISysServiceAPIDocAdapter iSysServiceAPIDocAdapter) throws Exception {
		this.setSystemGatewayContext(systemGatewayContext);
		this.setRequestMappingHandlerMapping(requestMappingHandlerMapping);
		this.setSysServiceAPIDocAdapter(iSysServiceAPIDocAdapter);
		this.onInit();
	}
	
	protected void onInit() throws Exception{
		
	}

	@Override
	public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
		return requestMappingHandlerMapping;
	}

	protected void setRequestMappingHandlerMapping(RequestMappingHandlerMapping requestMappingHandlerMapping) {
		this.requestMappingHandlerMapping = requestMappingHandlerMapping;
	}

	@Override
	public ISysServiceAPIDocAdapter getSysServiceAPIDocAdapter() {
		return sysServiceAPIDocAdapter;
	}

	protected void setSysServiceAPIDocAdapter(ISysServiceAPIDocAdapter sysServiceAPIDocAdapter) {
		this.sysServiceAPIDocAdapter = sysServiceAPIDocAdapter;
	}

	protected ISystemGatewayContext getSystemGatewayContext() {
		return systemGatewayContext;
	}

	protected void setSystemGatewayContext(ISystemGatewayContext systemGatewayContext) {
		this.systemGatewayContext = systemGatewayContext;
	}

	
	
}
