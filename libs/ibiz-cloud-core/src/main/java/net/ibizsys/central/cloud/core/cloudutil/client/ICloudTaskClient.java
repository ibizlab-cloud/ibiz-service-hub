package net.ibizsys.central.cloud.core.cloudutil.client;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.runtime.util.Entity;

public interface ICloudTaskClient {

	@RequestMapping(method = RequestMethod.POST, value = "/job/{id}/execute")
	Entity executeTask(@PathVariable("id") String id, @RequestBody Map params);

	@RequestMapping(method = RequestMethod.GET, value = "/job/{id}/start")
	Boolean startTask(@PathVariable("id") String id);

	@RequestMapping(method = RequestMethod.GET, value = "/job/{id}/stop")
	Boolean stopTask(@PathVariable("id") String id);

}
