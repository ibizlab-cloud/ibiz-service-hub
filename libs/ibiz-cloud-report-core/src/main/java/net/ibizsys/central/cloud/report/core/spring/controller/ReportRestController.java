package net.ibizsys.central.cloud.report.core.spring.controller;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudReportUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.report.core.IReportUtilSystemRuntime;

@RestController()
@RequestMapping("")
public class ReportRestController {

	private static final Log log = LogFactory.getLog(ReportRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("CloudReport服务已经启动"));
		
		iServiceHub.registerIgnoreAuthPattern("/report/**");
		
		iServiceHub.registerNamingService("ibizcloud-report");
	}


	@Autowired(required=false)
	private ICloudReportUtilRuntime iCloudReportUtilRuntime = null;

	protected ICloudReportUtilRuntime getCloudReportUtilRuntime() {
		if (this.iCloudReportUtilRuntime == null) {
			try {
				this.iCloudReportUtilRuntime = iServiceHub.getCloudUtilRuntime(IReportUtilSystemRuntime.class, ICloudReportUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud服务报表功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud服务报表功能模块"), ex);
			}
		}
		return this.iCloudReportUtilRuntime;
	}

	@RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = {"/report/{plugin}/{action}", "/report/{plugin}"})
   	public Object execute(@PathVariable("plugin") String plugin, @PathVariable(name="action", required=false) String action, @RequestBody(required=false) Object body, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		
		if(!StringUtils.hasLength(action)) {
			return null;
		}
		
		Map<String, String> headerMap = RestUtils.header2Map(httpServletRequest);
		
		String strXToken = headerMap.get(ICloudReportUtilRuntime.HEADER_X_TOKEN);
		String strXDCId = headerMap.get(ICloudReportUtilRuntime.HEADER_X_DCID);
		
		String strAuthorization = headerMap.get(ICloudReportUtilRuntime.HEADER_AUTHORIZATION);
		if(StringUtils.hasLength(strAuthorization)) {
			String strAuthorizationPrefix = "Bearer";
			if(headerMap.containsKey(ICloudReportUtilRuntime.HEADER_AUTHORIZATION_PREFIX)) {
				strAuthorizationPrefix = headerMap.get(ICloudReportUtilRuntime.HEADER_AUTHORIZATION_PREFIX);
			}
			if(StringUtils.hasLength(strAuthorizationPrefix)) {
				strAuthorizationPrefix += " ";
			}
			if(strAuthorization.length() > strAuthorizationPrefix.length()) {
				strAuthorization = strAuthorization.substring(strAuthorizationPrefix.length()).trim();
			}
		}
		
		IAuthenticationUser iAuthenticationUser = null;
		IEmployeeContext iEmployeeContext = null;
		if(StringUtils.hasLength(strAuthorization)) {
			iAuthenticationUser = this.getCloudReportUtilRuntime().getAuthenticationUser(strAuthorization, strXToken);
			if(StringUtils.hasLength(strXDCId)) {
				iEmployeeContext = this.getCloudReportUtilRuntime().getEmployeeContext(iAuthenticationUser, strXDCId, null);
			}
		}
		
		if(iEmployeeContext == null) {
			httpServletResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
			return null;
		}
		
		try {
			AuthenticationUser.setCurrent(iAuthenticationUser, iEmployeeContext);
			return this.getCloudReportUtilRuntime().executeReportAction(plugin, action, body);
		}
		finally {
			AuthenticationUser.setCurrent(null, null);
		}
   	}
	
}
