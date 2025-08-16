package net.ibizsys.central.cloud.open.core.spring.controller;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOpenUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCode;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCodeRequest;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.open.core.IOpenUtilSystemRuntime;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

@RestController()
@RequestMapping("")
public class OpenRestController {

		
	private static final Log log = LogFactory.getLog(OpenRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("Cloud开放平台服务已经启动"));
		iServiceHub.registerNamingService(ICloudUtilRuntime.CLOUDSERVICEURL_OPEN);
		
		iServiceHub.registerIgnoreAuthPattern("/open/callback/**");
		
		if(this.iCloudOpenUtilRuntime == null) {
			//通过服务网关需要注册开放平台功能组件
			iServiceHub.requireCloudUtilRuntime(IOpenUtilSystemRuntime.class, ICloudOpenUtilRuntime.class);
		}
	}
	

	@Autowired(required = false)
	private ICloudOpenUtilRuntime iCloudOpenUtilRuntime = null;

	protected ICloudOpenUtilRuntime getCloudOpenUtilRuntime() {
		if (this.iCloudOpenUtilRuntime == null) {
			try {
				this.iCloudOpenUtilRuntime = iServiceHub.getCloudUtilRuntime(IOpenUtilSystemRuntime.class, ICloudOpenUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud开放平台功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud开放平台功能模块"), ex);
			}
		}
		return this.iCloudOpenUtilRuntime;
	}

    @RequestMapping(method = RequestMethod.POST, value = "/open/{id}/syncorganizationunits")
    public void syncOrganizationUnits(@PathVariable("id") String id, @RequestBody(required=false) Map body) {
    	this.getCloudOpenUtilRuntime().syncOrganizationUnits(id);
    }
	
    @RequestMapping(method = RequestMethod.POST, value = "/open/{id}/sendmessages")
	public void sendMessages(@PathVariable("id") String id, @RequestBody MsgSendQueue[] msgSendQueues) {
    	this.getCloudOpenUtilRuntime().sendMessages(id, msgSendQueues);
	}
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/open/{id}/getopenuserbysnscode/{code}")
   	public OpenUser getOpenUserBySNSCode(@PathVariable("id") String id, @PathVariable("code") String code) {
       	return this.getCloudOpenUtilRuntime().getOpenUserBySNSCode(id, code);
   	}
    
    @RequestMapping(method = RequestMethod.GET, value = "/open/{id}/getopenuserbyauthcode/{code}")
   	public OpenUser getOpenUserByAuthCode(@PathVariable("id") String id, @PathVariable("code") String code) {
       	return this.getCloudOpenUtilRuntime().getOpenUserByAuthCode(id, code);
   	}
    
    @RequestMapping(method = RequestMethod.POST, value = "/open/{id}/createopenqrcode")
    public OpenQRCode createOpenQRCode(@PathVariable("id") String id, @RequestBody OpenQRCodeRequest request) {
    	return this.getCloudOpenUtilRuntime().createOpenQRCode(id, request);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/open/{id}/getopenuserbyqrcode/{code}")
   	public OpenUser getOpenUserByQRCode(@PathVariable("id") String id, @PathVariable("code") String code) {
       	return this.getCloudOpenUtilRuntime().getOpenUserByQRCode(id, code);
   	}
    
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/open/callback/{dcsystemid}/{id}") //@RequestBody(required=false) String requestBody, 
    public void executeCallback(@PathVariable("dcsystemid") String dcsystemid, @PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response) {
    	this.getCloudOpenUtilRuntime().executeCallback(String.format("%1$s|%2$s", dcsystemid, id), request, response);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/open/{id}/execute/{method}")
   	public Object execute(@PathVariable("id") String id, @PathVariable("method") String method, @RequestBody(required=false) Map<String, Object> data, HttpServletResponse response) {
    	if(AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE) {
    		response.setStatus(HttpStatus.FORBIDDEN.value());
    		return null;
    	}
       	//return this.getCloudOpenUtilRuntime().getOpenUserByQRCode(id, code);
    	return null;
   	}
    
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/open/callback/{dcsystemid}/{id}")
//    public void executeCallback(@PathVariable("dcsystemid") String dcsystemid, @PathVariable("id") String id, @RequestBody(required=false) String requestBody, HttpServletRequest request, HttpServletResponse response) {
//    	this.getCloudOpenUtilRuntime().executeCallback(String.format("%1$s|%2$s", dcsystemid, id), request, response);
//    }
    
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/open/callback/{id}")
//    public void executeCallback(@PathVariable("id") String id, @RequestBody(required=false) Object body, HttpServletRequest request, HttpServletResponse response) {
//    	this.getCloudOpenUtilRuntime().executeCallback(id, body, request, response);
//    }
}
