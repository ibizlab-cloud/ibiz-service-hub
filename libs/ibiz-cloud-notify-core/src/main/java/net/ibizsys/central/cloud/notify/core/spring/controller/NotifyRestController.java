package net.ibizsys.central.cloud.notify.core.spring.controller;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudNotifyUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.service.util.MethodHandlerBase;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.domain.CarbonCopy;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.central.cloud.core.util.domain.TodoTaskType;
import net.ibizsys.central.cloud.core.util.domain.V2InternalMessage;
import net.ibizsys.central.cloud.notify.core.INotifyUtilSystemRuntime;
import net.ibizsys.central.sysutil.SysNotifyUtilRuntimeBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

@RestController()
@RequestMapping("")
public class NotifyRestController {

	public final static TypeReference<MsgSendQueue[]> MsgSendQueuesType = new TypeReference<MsgSendQueue[]>() {};
	public final static TypeReference<Collection<MsgSendQueue>> MsgSendQueueListType = new TypeReference<Collection<MsgSendQueue>>() {};
	public final static TypeReference<Todo[]> TodosType = new TypeReference<Todo[]>() {};
	public final static TypeReference<Collection<Todo>> TodoListType = new TypeReference<Collection<Todo>>() {};
	public final static TypeReference<CarbonCopy[]> CarbonCopiesType = new TypeReference<CarbonCopy[]>() {};
	public final static TypeReference<Collection<CarbonCopy>> CarbonCopyListType = new TypeReference<Collection<CarbonCopy>>() {};
	
	private static final Log log = LogFactory.getLog(NotifyRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("Cloud通知服务已经启动"));
		iServiceHub.registerNamingService(ICloudUtilRuntime.CLOUDSERVICEURL_NOTIFY);
		if(this.iCloudNotifyUtilRuntime == null) {
			//通过服务网关需要注册通知功能组件
			iServiceHub.requireCloudUtilRuntime(INotifyUtilSystemRuntime.class, ICloudNotifyUtilRuntime.class);
		}
	}
	

	@Autowired(required = false)
	private ICloudNotifyUtilRuntime iCloudNotifyUtilRuntime = null;

	protected ICloudNotifyUtilRuntime getCloudNotifyUtilRuntime() {
		if (this.iCloudNotifyUtilRuntime == null) {
			try {
				this.iCloudNotifyUtilRuntime = iServiceHub.getCloudUtilRuntime(INotifyUtilSystemRuntime.class, ICloudNotifyUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud通知功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud通知功能模块"), ex);
			}
		}
		return this.iCloudNotifyUtilRuntime;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/todo")
	//public ResponseEntity<Object> createTodo(@RequestBody Todo todo, HttpServletRequest request) throws Exception {
	public ResponseEntity<Object> createTodo(@RequestBody String strContent, HttpServletRequest request) throws Exception {

		Map<String, Object> res = new LinkedHashMap<String, Object>();
		
		try {
			Todo[] todos = null;
			if(strContent.indexOf("{") == 0) {
				todos = new Todo[] { MethodHandlerBase.MAPPER.readValue(strContent, Todo.class) };
			}
			else
				if(strContent.indexOf("[") == 0) {
					todos = MethodHandlerBase.MAPPER.readValue(strContent, TodosType);
				}
				else
					throw new Exception("无法识别的内容");
			
			this.getCloudNotifyUtilRuntime().createTodos(todos);
			
			String strIds = "";
			for(Todo todo : todos) {
				String strKeys = DataTypeUtils.getStringValue(todo.get("srfkeys"), todo.getTodoId());
				if(ObjectUtils.isEmpty(strKeys)) {
					continue;
				}
				if(StringUtils.hasLength(strIds)) {
					strIds += ";";
				}
				strIds += strKeys;
			}

			res.put("ret", Errors.OK);
			res.put("srfkeys", strIds);
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/todo/{id}/markread/{userId}")
	public ResponseEntity<Object> markReadTodo(@PathVariable(value = "id", required = true) String id, @PathVariable(value = "userId", required = false) String userId) throws Exception {
		Map<String, Object> res = new LinkedHashMap<String, Object>();
		try {
			// SysTodo todo = new SysTodo();
			// todo.setTodoid(id);
			// todo.setUserid(userId);
			// todo = sysTodoService.markRead(todo);
			this.getCloudNotifyUtilRuntime().markReadTodo(id);
			res.put("ret", Errors.OK);
			res.put("srfkeys", id);
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/todo/wftask/{taskId}/markread/{userId}")
	public ResponseEntity<Object> markReadWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId, @PathVariable(value = "userId", required = false) String userId) throws Exception {
		Map<String, Object> res = new LinkedHashMap<String, Object>();
		try {
			// SysTodo todo = new SysTodo();
			// todo.setParam01(taskId);
			// todo.setUserid(userId);
			// todo = sysTodoService.markRead(todo);

			Todo todo = this.getCloudNotifyUtilRuntime().markReadTodo(TodoTaskType.WFTASK.toString(), taskId);

			res.put("ret", Errors.OK);
			res.put("srfkeys", DataTypeUtils.getStringValue(todo.get("srfkeys"), todo.getTodoId()));
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/todo/wftask/{taskId}/complete/{userId}")
	public ResponseEntity<Object> completeWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId, @PathVariable(value = "userId", required = false) String userId) throws Exception {
		Map<String, Object> res = new LinkedHashMap<String, Object>();
		try {
			// SysTodo todo = new SysTodo();
			// todo.setParam01(taskId);
			// todo.setUserid(userId);
			// todo = sysTodoService.complete(todo);
			Todo todo = this.getCloudNotifyUtilRuntime().completeTodo(TodoTaskType.WFTASK.toString(), taskId);
			res.put("ret", Errors.OK);
			res.put("srfkeys", DataTypeUtils.getStringValue(todo.get("srfkeys"), todo.getTodoId()));
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/todo/wftask/{taskId}/cancel")
	public ResponseEntity<Object> cancelWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId) throws Exception {
		Map<String, Object> res = new LinkedHashMap<String, Object>();
		try {
			// SysTodo todo = new SysTodo();
			// todo.setParam01(taskId);
			// todo = sysTodoService.cancel(todo);
			Todo todo = this.getCloudNotifyUtilRuntime().cancelTodo(TodoTaskType.WFTASK.toString(), taskId);
			res.put("ret", Errors.OK);
			res.put("srfkeys", DataTypeUtils.getStringValue(todo.get("srfkeys"), todo.getTodoId()));
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/todo/wftask/{taskId}/delegate")
	public ResponseEntity<Object> delegateWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId, @RequestBody Map dataObj) throws Exception {
		Map<String, Object> res = new LinkedHashMap<String, Object>();
		try {
			// String originUserId = dataObj.getStringValue("originUserId");
			String targetUserId = (String) dataObj.get("targetUserId");

			// SysTodo todo = new SysTodo();
			// todo.setParam01(taskId);
			// todo.setUserid(originUserId);
			// todo.setParam02(targetUserId);
			// todo = sysTodoService.delegate(todo);

			Todo todo = this.getCloudNotifyUtilRuntime().delegateTodo(TodoTaskType.WFTASK.toString(), taskId, targetUserId);

			res.put("ret", Errors.OK);
			res.put("srfkeys", DataTypeUtils.getStringValue(todo.get("srfkeys"), todo.getTodoId()));
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/todo/wftask/{taskId}/resolve/{userId}")
	public ResponseEntity<Object> resolveWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId, @PathVariable(value = "userId", required = false) String userId) throws Exception {
		Map<String, Object> res = new LinkedHashMap<String, Object>();
		try {
			// SysTodo todo = new SysTodo();
			// todo.setParam01(taskId);
			// todo.setUserid(userId);
			// todo = sysTodoService.resolve(todo);
			Todo todo = this.getCloudNotifyUtilRuntime().resolveTodo(TodoTaskType.WFTASK.toString(), taskId);
			res.put("ret", Errors.OK);
			res.put("srfkeys", DataTypeUtils.getStringValue(todo.get("srfkeys"), todo.getTodoId()));
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/todo/wftask/{taskId}/reassign")
	public ResponseEntity<Object> reassignWFTaskTodo(@PathVariable(value = "taskId", required = true) String taskId, @RequestBody Map dataObj) throws Exception {
		Map<String, Object> res = new LinkedHashMap<String, Object>();
		try {
			// String originUserId = dataObj.getStringValue("originUserId");
			String targetUserId = (String) dataObj.get("targetUserId");

			// SysTodo todo = new SysTodo();
			// todo.setParam01(taskId);
			// todo.setUserid(originUserId);
			// todo.setParam02(targetUserId);
			// todo = sysTodoService.reassign(todo);

			Todo todo = this.getCloudNotifyUtilRuntime().reassignTodo(TodoTaskType.WFTASK.toString(), taskId, targetUserId);

			res.put("ret", Errors.OK);
			res.put("srfkeys", DataTypeUtils.getStringValue(todo.get("srfkeys"), todo.getTodoId()));
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/todo/wftask/fetch")
	public ResponseEntity<Collection<Todo>> fetchWFTaskTodos(@RequestBody Map<String, Object> conds) throws Exception {
		
		Page<Todo> page = this.getCloudNotifyUtilRuntime().fetchTodos(TodoTaskType.WFTASK.toString(), conds);
		return RestUtils.sendBackPage(page, Todo.class);
	}
	
	

	@RequestMapping(method = RequestMethod.POST, value = "/carboncopy")
	public ResponseEntity<Object> createCarbonCopy(@RequestBody String strContent, HttpServletRequest request) throws Exception {
		Map<String, Object> res = new LinkedHashMap<String, Object>();
		try {
			CarbonCopy[] todos = null;
			if(strContent.indexOf("{") == 0) {
				todos = new CarbonCopy[] { MethodHandlerBase.MAPPER.readValue(strContent, CarbonCopy.class) };
			}
			else
				if(strContent.indexOf("[") == 0) {
					todos = MethodHandlerBase.MAPPER.readValue(strContent, CarbonCopiesType);
				}
				else
					throw new Exception("无法识别的内容");
			
			
			this.getCloudNotifyUtilRuntime().createCarbonCopies(todos);
			
			String strIds = "";
			for(CarbonCopy todo : todos) {
				String strKeys = DataTypeUtils.getStringValue(todo.get("srfkeys"), todo.getTodoId());
				if(ObjectUtils.isEmpty(strKeys)) {
					continue;
				}
				if(StringUtils.hasLength(strIds)) {
					strIds += ";";
				}
				strIds += strKeys;
			}
			

			res.put("ret", 0);
			res.put("srfkeys", strIds);
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/carboncopy/{id}/markread/{userId}")
	public ResponseEntity<Object> markReadCarbonCopy(@PathVariable(value = "id", required = true) String id, @PathVariable(value = "userId", required = false) String userId) throws Exception {
		Map<String, Object> res = new LinkedHashMap<String, Object>();
		try {
			// CarbonCopy carbonCopy = new CarbonCopy();
			// carbonCopy.setTodoid(id);
			// carbonCopy.setUserid(userId);
			// carbonCopy = sysCarbonCopyService.markRead(carbonCopy);
			CarbonCopy carbonCopy = this.getCloudNotifyUtilRuntime().markReadCarbonCopy(id);
			res.put("ret", 0);
			res.put("srfkeys", carbonCopy.getTodoId());
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/carboncopy/wftask/{taskId}/markread/{userId}")
	public ResponseEntity<Object> markReadWFTaskCarbonCopy(@PathVariable(value = "taskId", required = true) String taskId, @PathVariable(value = "userId", required = false) String userId) throws Exception {
		Map<String, Object> res = new LinkedHashMap<String, Object>();
		try {
			// CarbonCopy carbonCopy = new CarbonCopy();
			// carbonCopy.setParam01(taskId);
			// carbonCopy.setUserid(userId);
			// carbonCopy = sysCarbonCopyService.markRead(carbonCopy);
			CarbonCopy carbonCopy = this.getCloudNotifyUtilRuntime().markReadCarbonCopy(TodoTaskType.WFTASK.toString(), taskId);
			res.put("ret", 0);
			res.put("srfkeys", DataTypeUtils.getStringValue(carbonCopy.get("srfkeys"), carbonCopy.getTodoId()));
		} catch (Exception ex) {
			res.put("ret", Errors.INTERNALERROR);
			res.put("info", ex.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/msgsend/send")
	public ResponseEntity<Boolean> sendMsg(@RequestBody String strContent, HttpServletRequest request) throws Exception {
		// String strDeployId = request.getHeader("srfdeploysystemid");
		// String strDCId = request.getHeader("srfdcid");
		// String strSystemId = request.getHeader("srffromsystemid");
		// String strDCSystemid = request.getHeader("srffromdcsystemid");
		// cn.ibizlab.tps.core.notify.domain.MsgSendQueue msg = new
		// cn.ibizlab.tps.core.notify.domain.MsgSendQueue();
		// msg.setMsgsendqueueid(msgSendQueue.getMsgSendQueueId());
		// msg.setSystemid(strSystemId);
		// msg.setSrfdcid(strDCId);
		// msg.setDcsystemid(strDCSystemid);
		// msg.setSubject(msgSendQueue.getSubject());
		// msg.setMsgtype(msgSendQueue.getMsgType());
		// msg.setMsgsendqueuename(msgSendQueue.getMsgSendQueueName());
		// msg.setSendtag(msgSendQueue.getSendTag());
		// msg.setDstusers(msgSendQueue.getDstUsers());
		// msg.setDstaddresses(msgSendQueue.getDstAddresses());
		// msg.setContenttype(msgSendQueue.getContentType());
		// msg.setContent(msgSendQueue.getContent());
		// msg.setSmscontent(msgSendQueue.getSMSContent());
		// msg.setWxcontent(msgSendQueue.getWXContent());
		// msg.setDdcontent(msgSendQueue.getDDContent());
		// msg.setPlansendtime(msgSendQueue.getPlanSendTime());
		// msg.setFileat(msgSendQueue.getFileAT());
		// msg.setFileat2(msgSendQueue.getFileAT2());
		// msg.setFileat3(msgSendQueue.getFileAT3());
		// msg.setFileat4(msgSendQueue.getFileAT4());
		// msg.setUserdata(msgSendQueue.getUserData());
		// msg.setUserdata2(msgSendQueue.getUserData2());
		// msg.setUserdata3(msgSendQueue.getUserData3());
		// msg.setUserdata4(msgSendQueue.getUserData4());
		// msgSendQueueService.save(msg);
		
		if(strContent.indexOf("{") == 0) {
			MsgSendQueue msgSendQueue = MethodHandlerBase.MAPPER.readValue(strContent, MsgSendQueue.class);
			this.getCloudNotifyUtilRuntime().sendMessages(new MsgSendQueue[] {msgSendQueue});
		}
		else
			if(strContent.indexOf("[") == 0) {
				MsgSendQueue[] msgSendQueues = MethodHandlerBase.MAPPER.readValue(strContent, SysNotifyUtilRuntimeBase.MsgSendQueuesType);
				this.getCloudNotifyUtilRuntime().sendMessages(msgSendQueues);
			}
			else
				throw new Exception("无法识别的内容");
		
		

		return ResponseEntity.status(HttpStatus.OK).body(true);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/msgsend/send/{msgid}")
	public ResponseEntity<Boolean> sendMsgById(@PathVariable("msgid") String msgid, HttpServletRequest request) throws Exception {
		// cn.ibizlab.tps.core.notify.domain.MsgSendQueue msg =
		// msgSendQueueService.get(msgid);
		// msgSendServiceFactory.send(msg);
		this.getCloudNotifyUtilRuntime().sendMessage(msgid);
		return ResponseEntity.status(HttpStatus.OK).body(true);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/msgsend/getbyids")
	public ResponseEntity<Collection<MsgSendQueue>> getMessages(@RequestBody String[] msgids, HttpServletRequest request) throws Exception {
		if (msgids.length == 0)
			return ResponseEntity.status(HttpStatus.OK).body(null);
		// String strDeployId = request.getHeader("srfdeploysystemid");
		// String strDCId = request.getHeader("srfdcid");
		// String strSystemId = request.getHeader("srffromsystemid");
		// String strDCSystemid = request.getHeader("srffromdcsystemid");
		// MsgSendQueueSearchContext ctx = new MsgSendQueueSearchContext();
		// ctx.setN_srfdcid_eq(strDCId);
		// ctx.setN_dcsystemid_eq(strDCSystemid);
		// ctx.setN_systemid_eq(strSystemId);
		// ctx.setN_msgsendqueueid_in(StringUtils.join(msgids, ","));
		// List<cn.ibizlab.tps.core.notify.domain.MsgSendQueue> msgs =
		// msgSendQueueService.selectDefault(ctx);
		// List<MsgSendQueue> list = msgs.stream().map(msg -> {
		// MsgSendQueue queue = new MsgSendQueue();
		// queue.setMsgSendQueueId(msg.getMsgsendqueueid());
		// queue.setMsgType(msg.getMsgtype());
		// queue.setContentType(msg.getContenttype());
		// queue.setImportanceFlag(msg.getImportanceflag());
		// queue.setProcessTime(msg.getProcesstime());
		// queue.setPlanSendTime(msg.getPlansendtime());
		// queue.setIsSend(msg.getIssend());
		// queue.setIsError(msg.getIserror());
		// return queue;
		// }).collect(Collectors.toList());

		Collection<MsgSendQueue> list = this.getCloudNotifyUtilRuntime().getMessages(msgids);

		return ResponseEntity.status(HttpStatus.OK).body(list);
	}

//	@RequestMapping(method = RequestMethod.POST, value = "/message/produce")
//	public ResponseEntity<Boolean> produce(@RequestBody Message message, HttpServletRequest request) throws Exception {
//		String strDeployId = request.getHeader("srfdeploysystemid");
//		DefaultMQProducer producer = ProducerFactory.getProducer(strDeployId, message.getTopic());
//		SendResult sendResult = producer.send(message);
//		if (SendStatus.SEND_OK != sendResult.getSendStatus()) {
//			log.error("发送消息失败：" + sendResult.getMsgId() + sendResult.getSendStatus());
//			throw new RuntimeException("发送消息失败：" + sendResult.getMsgId() + sendResult.getSendStatus());
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(true);
//	}
//
//	@RequestMapping(method = RequestMethod.GET, value = "/message/consume/{topic}")
//	public ResponseEntity<Boolean> consume(@PathVariable("topic") String topic, HttpServletRequest request) throws Exception {
//		String strDeployId = request.getHeader("srfdeploysystemid");
//		DefaultMQPushConsumer customer = ConsumerFactory.getConsumer(strDeployId, topic);
//		return ResponseEntity.status(HttpStatus.OK).body(true);
//	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/internal/send")
	public ResponseEntity<V2InternalMessage> sendInternal(@RequestBody V2InternalMessage v2InternalMessage) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(this.getCloudNotifyUtilRuntime().sendInternal(v2InternalMessage));
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/internal/{id}/markread")
	public ResponseEntity<Object> markReadInternal(@PathVariable("id") String id, @RequestBody(required=false) Map<String, Object> params) throws Exception {
		this.getCloudNotifyUtilRuntime().markReadInternal(id, params);
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
}



