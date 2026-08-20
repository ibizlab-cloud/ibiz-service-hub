package net.ibizsys.central.cloud.core.spring.controller;

import java.io.IOException;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.testing.ISysTestPrjRuntime;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

@RestController()
@RequestMapping("")
@ConditionalOnProperty(prefix = "ibiz.servicehub", name = "testgateway", havingValue = "true", matchIfMissing = true)
public class TestGatewayRestController {

	private static final Logger logger = LoggerFactory.getLogger(TestGatewayRestController.class);

	/**
	 * 统一资源
	 */
	public final static String UNIRES_DEVOPS_TEST = "UNIRES_DEVOPS_TEST";
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(TestGatewayRestController.class);
	
	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
	}
	

	
	@PostMapping(value = {"/{id}/test/projects/{project_id}", "/{id}/test/projects/{project_id}/run"})
	@ResponseStatus(HttpStatus.OK)
	public Object run(@PathVariable("id") String id, @PathVariable("project_id") String project_id, @RequestParam("path") String path, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(EmployeeContext.getCurrentMust(), UNIRES_DEVOPS_TEST)) {
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("未授权测试功能"));
				return null;
			}
			
			ISysTestPrjRuntime iSysTestPrjRuntime = (ISysTestPrjRuntime)iSystemRuntime.getSysTestPrjRuntime(project_id, true);
			if(iSysTestPrjRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定测试项目[%1$s]不存在", project_id));
				return null;
			}
			
			return iSysTestPrjRuntime.run(path, body);
		}
		catch (Throwable ex) {
			logger.error(String.format("运行测试发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("运行测试发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
	}
	

}
