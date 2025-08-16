package net.ibizsys.central.cloud.core.cloudutil.client;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ICloudLogClient {

	 @RequestMapping(method = RequestMethod.POST, value = "/log")
	 Boolean logs(List<net.ibizsys.runtime.util.domain.Log> list);
	 
	 
	 @RequestMapping(method = RequestMethod.POST, value = "/console")
	 Boolean sendConsoleMessages(List<net.ibizsys.runtime.util.domain.Log> list);
	 
}
