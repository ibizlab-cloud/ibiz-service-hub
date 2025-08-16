package net.ibizsys.central.plugin.cloud.service;

import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.service.client.IWebClientRep;

/**
 * 自动Cloud服务客户端运行时对象
 * @author lionlau
 *
 */
public class AutoCloudServiceClientRuntime extends CloudServiceClientRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AutoCloudServiceClientRuntime.class);
	
	public final static String AUTHPARAM_APPDATA = "APPDATA";
	
	private boolean bOutsideCloud = false;
	
	@Override
	protected void onInit() throws Exception {
		// TODO Auto-generated method stub
		super.onInit();
	}
	
	@Override
	protected void setServiceUrl(String strServiceUrl) {
		super.setServiceUrl(strServiceUrl);
		if(StringUtils.hasLength(strServiceUrl)) {
			if(strServiceUrl.toLowerCase().indexOf("lb://") == 0) {
				this.bOutsideCloud = false;
			}
			else {
				this.bOutsideCloud = true;
			}
		}
		else {
			this.bOutsideCloud = false;
		}
	}
	
	
	
	/**
	 * 是否为外部的Cloud体系
	 * @return
	 */
	public boolean isOutsideCloud() {
		return this.bOutsideCloud;
	}
	
	protected void setOutsideCloud(boolean bOutsideCloud) {
		this.bOutsideCloud = bOutsideCloud;
	}
	
	@Override
	protected IAuthenticationUser getCurrentAuthenticationUser() {
		if(isOutsideCloud()) {
			return null;
		}
		return super.getCurrentAuthenticationUser();
	}
	
	
	@Override
	protected IEmployeeContext getCurrentEmployeeContext() {
		if(isOutsideCloud()) {
			return null;
		}
		return super.getCurrentEmployeeContext();
	}
	
	@Override
	public void setHeaders(Map<String, ?> headers) {
		if(headers != null && isOutsideCloud()) {
			if(StringUtils.hasLength(this.getAuthParam())) {
				if(this.getAuthParam().equalsIgnoreCase(AUTHPARAM_APPDATA)) {
					Map<String, Object> headers2 = (Map<String, Object>)headers;
					headers2.put("srfsystemid", this.getAuthParam2());
					headers2.put("srforgid",  this.getAuthParam3());
				}
			}
		}
		
		super.setHeaders(headers);
	}
	
	@Override
	public void setTokenTimeout(long nTokenTimeout) {
		super.setTokenTimeout(nTokenTimeout);
		
		if(StringUtils.hasLength(this.getAuthParam()) && isOutsideCloud()) {
			if(this.getAuthParam().equalsIgnoreCase(AUTHPARAM_APPDATA)) {
				if(nTokenTimeout > 0) {
					//请求AppData数据
					try {
						IWebClientRep<String> webClientRep = this.getWebClient().get(String.format("%1$s/appdata", this.getServiceUrl()), null, null, null);
						log.debug(webClientRep.getBody());
					} catch (Throwable ex) {
						log.error(ex);
					}
				}
			}
		}
	}
}
