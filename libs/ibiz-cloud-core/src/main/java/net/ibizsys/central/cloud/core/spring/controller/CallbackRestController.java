package net.ibizsys.central.cloud.core.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.service.util.MethodHandlerBase;
import net.ibizsys.central.cloud.core.sysutil.ISysOpenUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.error.InternalServerErrorException;
import net.ibizsys.runtime.backend.SysBackendTaskPredefinedTypes;
import net.ibizsys.runtime.backend.SysBackendTaskTypes;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

@RestController()
@RequestMapping("")
public class CallbackRestController {

    private static final Log log = LogFactory.getLog(CallbackRestController.class);
    //protected static ObjectMapper MAPPER = new ObjectMapper();
    
    @Autowired
    IServiceHub iServiceHub;
    
    @PostConstruct
	protected void postConstruct(){
    	//忽略工作流回调认证，后续要进行确认，工作流引擎已经携带身份
    	//iServiceHub.registerIgnoreAuthPattern("/wfcallback/**");
	}
    

    @RequestMapping(method = RequestMethod.POST, value = "/wfcallback/{system}/{entity}/{type}/{action}/{token}")
	public ResponseEntity<Object> wfCallback(@PathVariable("system") String system, 
											  @PathVariable("entity") String entity,  @PathVariable("type") String actiontype, @PathVariable("action") String action,
											  @PathVariable("token") String token, @RequestBody Object objData, HttpServletRequest httpServletRequest) {
		try {
			//格式化兼容数据对象
			Map<String, Object> params = new HashMap<String, Object>();
			
			params.put("dename", entity);
			params.put("dEName", entity);
			params.put("actiontype", actiontype);
			params.put("action", action);
			if(objData!=null) {
				params.put("data", objData);
			}
			
			String strParam = MethodHandlerBase.MAPPER.writeValueAsString(params);
			ISystemRuntime iSystemRuntime = iServiceHub.getSystemRuntime(system);
			try {
				SystemRuntimeHolder.push(iSystemRuntime);
				Object objRet = iSystemRuntime.invokeBackendTask(SysBackendTaskTypes.PREDEFINED, SysBackendTaskPredefinedTypes.WFCALLBACK, null, strParam, EmployeeContext.getCurrentMust(), null);
				return ResponseEntity.ok(objRet);
			}
			finally {
				SystemRuntimeHolder.poll();
			}
		}
		catch(Throwable ex) {
			log.error(String.format("处理工作流回调发生异常，%1$s", ex.getMessage()), ex);
			throw new InternalServerErrorException(ex.getMessage());
		}
		finally {
			//UserContext.setCurrent(null);
		}
	}
    
    @RequestMapping(method = RequestMethod.POST, value = "/taskcallback/{system}/{tasktype}/{tasktag}")
   	public ResponseEntity<Object> taskCallback(@RequestHeader(value="srfsystemid") String srfsystemid, @RequestHeader(value="srfdcid") String srfdcid, @RequestHeader(value="srfdcsystemid") String srfdcsystemid, @PathVariable("system") String system, 
   			@PathVariable("tasktype") String tasktype, @PathVariable("tasktag") String tasktag,  @RequestBody(required=false) Object objData, HttpServletRequest httpServletRequest) {
 
    	//进行用户仿真
   		Employee dcEmployee = new Employee();
   		dcEmployee.setSrfdcid(srfdcid);
   		
   		EmployeeContext.fillEmployee(dcEmployee, httpServletRequest);
   		
   		
   	//	dcEmployee.setMdeptId(val)
   		EmployeeContext employeeContext = new EmployeeContext(dcEmployee, null, srfsystemid);
   		UserContext.setCurrent(employeeContext);
   		
   		try {
   			//格式化兼容数据对象
   			Map<String, Object> params = new HashMap<String, Object>();
   			
   			String strParam = MethodHandlerBase.MAPPER.writeValueAsString(params);
   			ISystemRuntime iSystemRuntime = iServiceHub.getSystemRuntime(system);
   			try {
   				SystemRuntimeHolder.push(iSystemRuntime);
   				Object objRet = iSystemRuntime.invokeBackendTask(tasktype, tasktag, null, strParam, employeeContext, null);
   	   			return ResponseEntity.ok(objRet);
	   		}
			finally {
				SystemRuntimeHolder.poll();
			}
   		}
   		catch(Throwable ex) {
   			log.error(String.format("处理任务回调发生异常，%1$s", ex.getMessage()), ex);
   			throw new InternalServerErrorException(ex.getMessage());
   		}
   		finally {
			UserContext.setCurrent(null);
		}
   	}
    
    @RequestMapping(method = RequestMethod.POST, value = "/opencallback/{system}/{opentype}/{opentag}")
   	public ResponseEntity<Object> openCallback(@RequestHeader(value="srfsystemid") String srfsystemid, @PathVariable(value="system") String system, @PathVariable(value="opentype") String opentype, @PathVariable(value="opentag") String opentag, @RequestBody(required=false) String body, HttpServletRequest httpServletRequest) {
   		
   		//进行用户仿真
   		Employee dcEmployee = new Employee();
   		
   		EmployeeContext.fillEmployee(dcEmployee, httpServletRequest);

   		EmployeeContext employeeContext = new EmployeeContext(dcEmployee, null, srfsystemid);
   		UserContext.setCurrent(employeeContext);
   		
   		try {
   			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(system);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysOpenUtilRuntime iSysOpenUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysOpenUtilRuntime.class, false);
			return ResponseEntity.ok(iSysOpenUtilRuntime.executeCallback(opentype, opentag, body));
   		}
   		catch(Throwable ex) {
   			log.error(String.format("处理开放平台回调发生异常，%1$s", ex.getMessage()), ex);
   			throw new InternalServerErrorException(ex.getMessage());
   		}
   		finally {
   			SystemRuntimeHolder.poll();
			UserContext.setCurrent(null);
		}
   	}
}
