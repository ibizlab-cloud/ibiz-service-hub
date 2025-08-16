package net.ibizsys.central.cloud.core.service;

import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.service.SysServiceAPIRuntimeException;
import net.ibizsys.runtime.security.IUserContext;

public abstract class LocalSysRestServiceAPIRuntimeBase extends SysRestServiceAPIRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(LocalSysRestServiceAPIRuntimeBase.class);

	public final static String LOCALIP = "127.0.0.1";

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		
	}
	
	@Override
	protected void registerIgnoreAuthPatterns() {
		String serviceUrl = this.getBaseUrl();
		if (StringUtils.hasLength(serviceUrl)) {
			serviceUrl = serviceUrl + "/**";
			ServiceHub.getInstance().registerIgnoreAuthPattern(serviceUrl);
			log.debug(String.format("忽略认证路径[%s]", serviceUrl));
		}
	}

	@Override
	protected void testAccessUser() throws Throwable {
		// super.testAccessUser()

		// 进一步判断访问地址
		String ipaddr = null;
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if (requestAttributes instanceof ServletRequestAttributes) {
			ipaddr = ((ServletRequestAttributes) requestAttributes).getRequest().getRemoteAddr();
		}
		if (!testLocalIp(ipaddr)) {
			throw new SysServiceAPIRuntimeException(this, "未授权访问IP", net.ibizsys.runtime.util.Errors.ACCESSDENY);
		}
	}
	
	protected boolean testLocalIp(String ipaddr) {
		return LOCALIP.equals(ipaddr);
	}

	/**
	 * 获取默认用户上下文
	 * 
	 * @return
	 */
	protected IUserContext getUserContext() {

		return this.getSystemRuntime().createDefaultUserContext();
	}
	
	
}
