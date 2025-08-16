package net.ibizsys.central.cloud.portal.core.spring.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudPortalUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalMessage;
import net.ibizsys.central.cloud.portal.core.IPortalUtilSystemRuntime;
import net.ibizsys.runtime.util.EntityBase;

@RestController()
@RequestMapping("")
public class PortalRestController {

	private static final Log log = LogFactory.getLog(PortalRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@Autowired(required=false)
	private ICloudPortalUtilRuntime iCloudPortalUtilRuntime = null;
	
	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("CloudPortal服务已经启动"));
		
		iServiceHub.registerNamingService(ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL);
		if(this.iCloudPortalUtilRuntime == null) {
			//通过服务网关需要注册Portal功能组件
			iServiceHub.requireCloudUtilRuntime(IPortalUtilSystemRuntime.class, ICloudPortalUtilRuntime.class);
		}
	}


	protected ICloudPortalUtilRuntime getCloudPortalUtilRuntime() {
		if (this.iCloudPortalUtilRuntime == null) {
			try {
				this.iCloudPortalUtilRuntime = iServiceHub.getCloudUtilRuntime(IPortalUtilSystemRuntime.class, ICloudPortalUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud服务应用门户功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud服务应用门户功能模块"), ex);
			}
		}
		return this.iCloudPortalUtilRuntime;
	}
	
	
	/**
	 * 客户端向门户登记正在打开数据
	 * @param entity
	 * @param key
	 * @param action
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.GET}, value = {"/portal/markopendata/{entity}/{key}/{action}", "/portal/markopendata/{entity}/{key}"})
	public List<PortalMessage> markOpenData(@PathVariable("entity") String entity, @PathVariable("key") String key, @PathVariable(name="action", required=false) String action) {
		return this.getCloudPortalUtilRuntime().markOpenData(entity, key, action, null);
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/portal/markopendata/{entity}/{key}/{action}", "/portal/markopendata/{entity}/{key}"})
	public List<PortalMessage> markOpenData(@PathVariable("entity") String entity, @PathVariable("key") String key, @PathVariable(name="action", required=false) String action, @RequestBody(required=false) Map params) {
		return this.getCloudPortalUtilRuntime().markOpenData(entity, key, action, params);
	}
	
	
    @RequestMapping(method = RequestMethod.POST, value = {"/portal/asyncaction/create", "/portal/asyncaction"})
    public ResponseEntity<PortalAsyncAction> createAsyncAction(@RequestBody Map params) {
    	PortalAsyncAction objRet = this.getCloudPortalUtilRuntime().createAsyncAction(params);
    	
    	return ResponseEntity.status(HttpStatus.OK).body(objRet);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = {"/portal/asyncaction/{id}/get", "/portal/asyncaction/{id}"})
    public ResponseEntity<PortalAsyncAction> getAsyncAction(@PathVariable("id") String id) {
    	PortalAsyncAction objRet = this.getCloudPortalUtilRuntime().getAsyncAction(id);
    	return ResponseEntity.status(HttpStatus.OK).body(objRet);
    }
	
    @RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction/{id}/execute")
    public ResponseEntity<PortalAsyncAction> executeAsyncAction(@PathVariable("id") String id, @RequestBody Map params) {
    	PortalAsyncAction objRet = this.getCloudPortalUtilRuntime().executeAsyncAction(id, params);
    	return ResponseEntity.status(HttpStatus.OK).body(objRet);
    }
    
    
	
    @RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction/{id}/error")
    public ResponseEntity<PortalAsyncAction> errorAsyncAction(@PathVariable("id") String id, @RequestBody Map params) {
    	PortalAsyncAction objRet = this.getCloudPortalUtilRuntime().errorAsyncAction(id, params);
    	return ResponseEntity.status(HttpStatus.OK).body(objRet);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction/{id}/finish")
    public ResponseEntity<PortalAsyncAction> finishAsyncAction(@PathVariable("id") String id, @RequestBody Map params) {
    	PortalAsyncAction objRet = this.getCloudPortalUtilRuntime().finishAsyncAction(id, params);
    	return ResponseEntity.status(HttpStatus.OK).body(objRet);
    }
    
    
    @RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction/finished")
    public List<PortalAsyncAction> listFinishAsyncActions(@RequestBody(required=false) Map params) {
    	List<PortalAsyncAction> list = this.getCloudPortalUtilRuntime().selectFinishedAsyncActions(params);
    	return list;
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction/executing")
    public List<PortalAsyncAction> listExecutingAsyncActions(@RequestBody(required=false) Map params) {
    	List<PortalAsyncAction> list = this.getCloudPortalUtilRuntime().selectExecutingAsyncActions(params);
    	return list;
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction/error")
    public List<PortalAsyncAction> listErrorAsyncActions(@RequestBody(required=false) Map params) {
    	List<PortalAsyncAction> list = this.getCloudPortalUtilRuntime().selectErrorAsyncActions(params);
    	return list;
    }
    
    
    @RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction/all")
    public List<PortalAsyncAction> listAllAsyncActions(@RequestBody(required=false) Map params) {
    	List<PortalAsyncAction> list = this.getCloudPortalUtilRuntime().selectAllAsyncActions(params);
    	return list;
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/portal/registeremployee")
    public void registerEmployee(@RequestBody Employee employee, HttpServletResponse httpServletResponse) {
    	if(AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
    		httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
    		return;
    	}
    	this.getCloudPortalUtilRuntime().registerEmployee(employee);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = {"/portal/notifyemployee/{id}/{dcsystemid}", "/portal/notifyemployee/{id}"})
    public void notifyEmployee(@PathVariable("id") String id, @PathVariable(value="dcsystemid", required=false) String dcsystemid, @RequestBody PortalMessage portalMessage, HttpServletResponse httpServletResponse) {
    	if(AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
    		httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
    		return;
    	}
    	this.getCloudPortalUtilRuntime().notifyEmployee(id, dcsystemid, portalMessage);
    }
    
    
    @RequestMapping(method = RequestMethod.POST, value = {"/portal/notifyemployees/{mode}/{id}"})
    public void notifyEmployees(@PathVariable("mode") String mode, @PathVariable("id") String id, @RequestBody PortalMessage portalMessage, HttpServletResponse httpServletResponse) {
    	if(AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
    		httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
    		return;
    	}
    	this.getCloudPortalUtilRuntime().notifyEmployees(mode, id, portalMessage);
    }
    
    @RequestMapping(method = {RequestMethod.POST}, value = {"/portal/collaborate/{entity}/{key}/{action}", "/portal/collaborate/{entity}/{key}"})
	public void collaborate(@PathVariable("entity") String entity, @PathVariable("key") String key, @PathVariable(name="action", required=false) String action, @RequestBody(required=false) Map params) {
		this.getCloudPortalUtilRuntime().collaborate(entity, key, action, params);
	}
}
