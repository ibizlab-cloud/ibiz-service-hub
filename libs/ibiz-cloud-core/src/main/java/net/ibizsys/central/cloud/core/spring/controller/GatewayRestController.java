package net.ibizsys.central.cloud.core.spring.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.runtime.security.IUserContext;

@RestController()
@RequestMapping("")
public class GatewayRestController {

	private static final Log log = LogFactory.getLog(GatewayRestController.class);

	@Autowired
	IServiceHub systemGateway;

	@GetMapping(value = {"/{systemid}/appdata","/{systemid}/appdata/{srfdcsystemid}"})
	public ResponseEntity<AppData> getAppData(@RequestHeader(value = "srfsystemid", defaultValue = "undefined") String srfsystemid, @RequestHeader(value = "srforgid", defaultValue = "undefined") String srforgid, @PathVariable(name = "systemid", required = true) String systemid, @PathVariable(name = "srfdcsystemid", required = false) String srfdcsystemid) {
		if ("undefined".equals(srfsystemid)) {
			srfsystemid = null;
		}
		if ("undefined".equals(srforgid)) {
			srforgid = null;
		}

		try {
			AppData appData = StringUtils.hasLength(srfdcsystemid)?
					this.systemGateway.invokeGetAppData(systemid, srfdcsystemid, AuthenticationUser.getCurrentMust(), null):
					this.systemGateway.invokeGetAppData(systemid, srfsystemid, srforgid, AuthenticationUser.getCurrentMust(), null);
			return ResponseEntity.status(HttpStatus.OK).body(appData);
		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			throw new SystemGatewayException(this.systemGateway, String.format("调用系统获取应用数据发生异常，%s", e.getMessage()), e);
		}
	}

	

	@RequestMapping(method = RequestMethod.POST, value = { "/{systemid}/devops/{method}", "/{systemid}/devops/{method}/{key}" })
	public ResponseEntity<Object> executeDevOpsAction(@PathVariable(name = "systemid", required = true) String systemid, @PathVariable(name = "method", required = true) String method, @PathVariable(name = "key", required = false) String key, @RequestBody Object requestData) {
		try {
			Object obj = this.systemGateway.invokeDevOpsAction(systemid, method, requestData, key, getDevOpsUserContext(), null);
			return ResponseEntity.status(HttpStatus.OK).body(obj);
		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			throw new SystemGatewayException(this.systemGateway, String.format("调用系统DevOps操作接口发生异常，%s", e.getMessage()), e);
		}
	}
	
	protected IUserContext getDevOpsUserContext() {
		return this.getUserContext();
	}
	
	
	protected IUserContext getUserContext() {
		return EmployeeContext.getCurrentMust();
	}

}
