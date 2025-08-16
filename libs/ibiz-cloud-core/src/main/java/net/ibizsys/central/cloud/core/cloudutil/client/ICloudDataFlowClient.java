package net.ibizsys.central.cloud.core.cloudutil.client;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;

/**
 * Cloud体系DataFlow组件客户端对象接口
 * @author lionlau
 *
 */
public interface ICloudDataFlowClient {

	@RequestMapping(method = {RequestMethod.POST}, value = { "/dataflow/{type}/{id}"})
	PortalAsyncAction start(@PathVariable("type") String type, @PathVariable("id") String id, @RequestBody(required=false) Object body);
	
}
