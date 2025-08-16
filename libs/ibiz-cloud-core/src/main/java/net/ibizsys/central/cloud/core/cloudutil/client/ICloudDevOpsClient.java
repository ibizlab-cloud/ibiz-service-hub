package net.ibizsys.central.cloud.core.cloudutil.client;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Cloud体系DevOps组件客户端对象接口
 * @author lionlau
 *
 */
public interface ICloudDevOpsClient {

	@RequestMapping(method = RequestMethod.POST, value = "/devops/systems/{id}/publish")
    void publishSystem(@PathVariable("id") String id, @RequestBody(required=false) Map body);
	
	@RequestMapping(method = RequestMethod.GET, value = "/devops/systems/{id}/modeldigest")
	String getSystemModelDigest(@PathVariable("id") String id);
    
	@RequestMapping(method = RequestMethod.POST, value = "/devops/dcsystems/{id}/publish")
    void publishDCSystem(@PathVariable("id") String id, @RequestBody(required=false) Map body);
	
	@RequestMapping(method = RequestMethod.POST, value = "/devops/dcsystems/{id}/{method}")
    void executeDCSystemAction(@PathVariable("id") String id, @PathVariable(name = "method") String method, @RequestBody(required=false) Object body);
	
    
    @RequestMapping(method = RequestMethod.POST, value = "/devops/dynamodels/{id}/publish")
    void publishDynaModel(@PathVariable("id") String id, @RequestBody(required=false) Map body);
	
    @RequestMapping(method = RequestMethod.GET, value = "/devcallback/{system}/{action}/{token}")
    void invokeDevCallback(@PathVariable("system") String system, @PathVariable("action") String action, @PathVariable("token") String token);

    @RequestMapping(method = RequestMethod.GET, value = "/devcallback/{system}/{action}/{token}")
    void invokeDevCallback(@PathVariable("system") String system, @PathVariable("action") String action, @PathVariable("token") String token, @RequestParam(value = "THREADMODE", required=false) Boolean threadMode);

}
