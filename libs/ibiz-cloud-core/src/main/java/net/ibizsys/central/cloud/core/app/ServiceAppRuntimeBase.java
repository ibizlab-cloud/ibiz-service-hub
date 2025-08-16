package net.ibizsys.central.cloud.core.app;

import org.springframework.util.StringUtils;

import net.ibizsys.central.app.ApplicationRuntime;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRequestMappingAdapter;

public abstract class ServiceAppRuntimeBase extends ApplicationRuntime implements IServiceAppRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ServiceAppRuntimeBase.class);

	private String baseUrl = null;

	@Override
	protected void onInit() throws Exception {

		if (!StringUtils.hasLength(this.getBaseUrl())) {
			this.prepareBaseUrl();
		}
		super.onInit();

		this.registerIgnoreAuthPattern();
	}

	protected void registerIgnoreAuthPattern() {
		
	}

	protected void prepareBaseUrl() throws Exception {
		this.setBaseUrl(String.format("/%1$s/%2$s", this.getSystemRuntime().getServiceId(), this.getPSApplication().getCodeName()).toLowerCase());
	}

	@Override
	public String getBaseUrl() {
		return this.baseUrl;
	}

	protected void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	

	

	@Override
	public void registerMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		iSysServiceAPIRequestMappingAdapter.registerMapping(this);
		this.onRegisterMapping(iSysServiceAPIRequestMappingAdapter);
	}

	protected void onRegisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		
	}
	

	@Override
	public void unregisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		iSysServiceAPIRequestMappingAdapter.unregisterMapping(this);
		onUnregisterMapping(iSysServiceAPIRequestMappingAdapter);
	}

	protected void onUnregisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {

	}

}
