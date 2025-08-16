package net.ibizsys.central.cloud.core.cloudutil.client;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.cloud.core.util.domain.CarbonCopy;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * Cloud体系通知客户端对象接口
 * @author lionlau
 *
 */
public interface ICloudNotifyClient {

	@RequestMapping(method = RequestMethod.POST, value = "/todo")
	Entity createTodo(@RequestBody Todo todo);

	@RequestMapping(method = RequestMethod.POST, value = "/todo")
	Entity createTodo(@RequestBody Todo[] todos);

	@RequestMapping(method = RequestMethod.GET, value = "/todo/{id}/markread/{userId}")
	Entity markReadTodo(@PathVariable(value = "id", required = true) String id, @PathVariable(value = "userId", required = false) String userId);

	@RequestMapping(method = RequestMethod.GET, value = "/todo/wftask/{taskId}/markread/{userId}")
	Entity markReadWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId, @PathVariable(value = "userId", required = false) String userId);

	@RequestMapping(method = RequestMethod.GET, value = "/todo/wftask/{taskId}/complete/{userId}")
	Entity completeWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId, @PathVariable(value = "userId", required = false) String userId) ;

	@RequestMapping(method = RequestMethod.GET, value = "/todo/wftask/{taskId}/cancel")
	Entity cancelWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId);

	@RequestMapping(method = RequestMethod.POST, value = "/todo/wftask/{taskId}/delegate")
	Entity delegateWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId, @RequestBody Map dataObj);

	@RequestMapping(method = RequestMethod.GET, value = "/todo/wftask/{taskId}/resolve/{userId}")
	Entity resolveWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId, @PathVariable(value = "userId", required = false) String userId);

	@RequestMapping(method = RequestMethod.POST, value = "/todo/wftask/{taskId}/reassign")
	Entity reassignWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId, @RequestBody Map dataObj);

	@RequestMapping(method = RequestMethod.POST, value = "/carboncopy")
	Entity createCarbonCopy(@RequestBody CarbonCopy carbonCopy);
	
	@RequestMapping(method = RequestMethod.POST, value = "/carboncopy")
	Entity createCarbonCopy(@RequestBody CarbonCopy[] carbonCopies);

	@RequestMapping(method = RequestMethod.GET, value = "/carboncopy/{id}/markread/{userId}")
	Entity markReadCarbonCopy(@PathVariable(value = "id", required = true) String id, @PathVariable(value = "userId", required = false) String userId);

	@RequestMapping(method = RequestMethod.GET, value = "/carboncopy/wftask/{taskId}/markread/{userId}")
	Entity markReadWFTaskCarbonCopy(@PathVariable(value = "taskId", required = true) String taskId, @PathVariable(value = "userId", required = false) String userId);

	@RequestMapping(method = RequestMethod.POST, value = "/msgsend/send")
	Boolean sendMsg(@RequestBody MsgSendQueue[] msgSendQueues);

	@RequestMapping(method = RequestMethod.GET, value = "/msgsend/send/{msgid}")
	Boolean sendMsg(@PathVariable("msgid") String msgid);

	@RequestMapping(method = RequestMethod.POST, value = "/msgsend/getbyids")
	Collection<MsgSendQueue> getMsg(@RequestBody String[] msgids);
	
	@RequestMapping(method = RequestMethod.POST, value = "/todo/wftask/fetch")
	Page<Todo> fetchWFTaskTodos(@RequestBody ISearchContextDTO iSearchContextDTO) throws Exception;
	
	

}
