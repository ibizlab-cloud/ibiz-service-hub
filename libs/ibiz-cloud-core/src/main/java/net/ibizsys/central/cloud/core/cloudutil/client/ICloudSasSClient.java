package net.ibizsys.central.cloud.core.cloudutil.client;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Cloud体系SaaS组件客户端对象接口
 * @author lionlau
 *
 */
public interface ICloudSasSClient {

	@RequestMapping(method = {RequestMethod.POST}, value = { "/saas/{type}/{id}/{method}"})
	Object invokeSaaSFunc(@PathVariable("type") String type, @PathVariable("id") String id, @PathVariable("method") String method, @RequestBody(required=false) Object body);
	
}
