package net.ibizsys.central.cloud.core.spring.controller;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ErrorException;

@RestController()
@RequestMapping("")
@ConditionalOnProperty(prefix = "ibiz.servicehub", name = "localgateway", havingValue = "true", matchIfMissing=true)
public class LocalGatewayRestController {

	private static final Log log = LogFactory.getLog(LocalGatewayRestController.class);
	public final static String LOCALIP = "127.0.0.1";
	
	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		iServiceHub.registerIgnoreAuthPattern("/local/**");
		log.debug(String.format("本地网关服务已经启动"));
		
	}

	
	@RequestMapping(method = RequestMethod.POST, value = { "/local/{systemid}/{entity}/{method}", "/local/{systemid}/{entity}/{method}/{key}" })
	public ResponseEntity<Object> call(@PathVariable(name = "systemid", required = true) String systemid, @PathVariable(name = "entity", required = true) String entity, @PathVariable(name = "method", required = true) String method, @PathVariable(name = "key", required = false) String key, @RequestBody(required=false) Object requestData) {
		try {
			Object obj = this.iServiceHub.invokeDEMethod(systemid, entity, method, ObjectUtils.isEmpty(requestData)?key:requestData, getUserContext(systemid), null);
			return ResponseEntity.status(HttpStatus.OK).body(obj);
		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			throw new SystemGatewayException(this.iServiceHub, String.format("调用系统服务接口发生异常，%s", e.getMessage()), e);
		}
	}

	
	protected IUserContext getUserContext(String systemid) throws Exception {
		
		String ipaddr = null;
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if (requestAttributes instanceof ServletRequestAttributes) {
			ipaddr = ((ServletRequestAttributes) requestAttributes).getRequest().getRemoteAddr();
		}
		
		if (!testLocalIp(ipaddr)) {
			throw new ErrorException("未授权访问IP", net.ibizsys.runtime.util.Errors.ACCESSDENY);
		}
		
   		Employee dcEmployee = new Employee();
   		//dcEmployee.setSrfdcid(srfdcid);
   		
   		EmployeeContext.fillEmployee(dcEmployee, ((ServletRequestAttributes) requestAttributes).getRequest());
   		
   		EmployeeContext employeeContext = new EmployeeContext(dcEmployee, null, systemid);
   		return employeeContext;
	}
	
	protected boolean testLocalIp(String ipaddr) {
		return LOCALIP.equals(ipaddr);
	}

}
