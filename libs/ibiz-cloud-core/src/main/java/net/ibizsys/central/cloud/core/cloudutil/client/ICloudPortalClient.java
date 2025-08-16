package net.ibizsys.central.cloud.core.cloudutil.client;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalMessage;

public interface ICloudPortalClient {

	/**
	 * 通知机构人员模式：部署系统
	 */
	public final static String NOTIFYEMPLOYEESMODE_SYSTEM = "SYSTEM";
	
	/**
	 * 通知机构人员模式：机构系统
	 */
	public final static String NOTIFYEMPLOYEESMODE_DCSYSTEM = "DCSYSTEM";
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction")
	PortalAsyncAction createAsyncAction(@RequestBody PortalAsyncAction action);

	@RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction/{id}/execute")
	PortalAsyncAction executeAsyncAction(@PathVariable("id") String id, @RequestBody PortalAsyncAction action);

	@RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction/{id}/error")
	PortalAsyncAction errorAsyncAction(@PathVariable("id") String id, @RequestBody PortalAsyncAction action);
	
	@RequestMapping(method = RequestMethod.POST, value = "/portal/asyncaction/{id}/finish")
	PortalAsyncAction finishAsyncAction(@PathVariable("id") String id, @RequestBody PortalAsyncAction action);
	
	@RequestMapping(method = RequestMethod.GET, value = "/portal/asyncaction/{id}")
	PortalAsyncAction getAsyncAction(@PathVariable("id") String id);
	
	@RequestMapping(method = RequestMethod.POST, value = "/portal/registeremployee")
	void registerEmployee(@RequestBody Employee employee);
	
	@RequestMapping(method = RequestMethod.POST, value = "/portal/notifyemployee/{id}/{dcsystemid}")
	void notifyEmployee(@PathVariable("id")String employeeId, @PathVariable("dcsystemid") String dcsystemId, @RequestBody PortalMessage portalMessage);
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/portal/notifyemployees/{mode}/{id}")
	void notifyEmployees(@PathVariable("mode")String mode, @PathVariable("id")String id, @RequestBody PortalMessage portalMessage);
}
