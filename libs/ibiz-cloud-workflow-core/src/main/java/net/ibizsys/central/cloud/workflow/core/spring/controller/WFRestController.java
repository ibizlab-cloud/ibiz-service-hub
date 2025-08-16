package net.ibizsys.central.cloud.workflow.core.spring.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.util.http.fileupload.IOUtils;
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

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudWFUtilRuntime;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFDefinitionNode;
import net.ibizsys.central.cloud.core.util.domain.WFEditableFields;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.cloud.core.util.domain.WFTask;
import net.ibizsys.central.cloud.core.util.domain.WFTaskWay;
import net.ibizsys.central.cloud.core.util.error.InternalServerErrorException;
import net.ibizsys.central.cloud.workflow.core.IWFUtilSystemRuntime;

@RestController("api-wfcore")
@RequestMapping()
public class WFRestController {

	private static final Log log = LogFactory.getLog(WFRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct(){

		log.debug(String.format("Cloud工作流服务已经启动"));
		iServiceHub.registerNamingService(ICloudUtilRuntime.CLOUDSERVICEURL_WF);
		if(this.iCloudWFUtilRuntime == null) {
			//通知服务网关需要注册工作流功能组件
			iServiceHub.requireCloudUtilRuntime(IWFUtilSystemRuntime.class, ICloudWFUtilRuntime.class);
		}
	}

	@Autowired(required=false)
	private ICloudWFUtilRuntime iCloudWFUtilRuntime = null;

	protected ICloudWFUtilRuntime getCloudWFUtilRuntime() {
		if (this.iCloudWFUtilRuntime == null) {
			try {
				this.iCloudWFUtilRuntime = iServiceHub.getCloudUtilRuntime(IWFUtilSystemRuntime.class, ICloudWFUtilRuntime.class, false);

			} catch (Throwable ex) {
				log.error(String.format("获取Cloud工作流功能组件发生异常，%1$s", ex.getMessage()), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud工作流功能组件"), ex);
			}

		}
		return this.iCloudWFUtilRuntime;
	}

	// @Autowired
	// private WFCoreService wfCoreService;
	//
	// @Autowired
	// @Lazy
	// public WFTaskMapping wfTaskMapping;
	// /**
	// * 流程PC表单标记
	// */
	// private static final String formTag = "process-form";
	// /**
	// * 流程移动端表单标记
	// */
	// private static final String mobFormTag = "process-mobform";
	//
	// //@ApiOperation(value = "deploybpmn", tags = {"deploybpmn" }, notes =
	// "部署动态版工作流")
	@RequestMapping(method = RequestMethod.POST, value = { "/wfcore/deploydynabpmn" })
	// public ResponseEntity<Boolean> deployDynaWorkFlow(@RequestBody
	// List<Map<String,Object>> bpmnfiles){
	public ResponseEntity<Boolean> deployDynaBpmn(@RequestBody List<Map<String, Object>> bpmnfiles) {
		getCloudWFUtilRuntime().createWFDefinitions(bpmnfiles);
		return ResponseEntity.status(HttpStatus.OK).body(true);
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/wfcore/deploydynabpmns" })
	// public ResponseEntity<Boolean> deployDynaWorkFlow(@RequestBody
	// List<Map<String,Object>> bpmnfiles){
	public ResponseEntity<Collection<WFDefinition>> createWFDefinitions(@RequestBody List<Map<String, Object>> bpmnfiles) {
		return ResponseEntity.status(HttpStatus.OK).body(getCloudWFUtilRuntime().createWFDefinitions(bpmnfiles));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-app-{appname}/{entity}/process-definitions2")
	public ResponseEntity<Collection<WFDefinition>> getWFProcessDefinitions(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity) {
		return ResponseEntity.ok(getCloudWFUtilRuntime().getWFDefinitions(system, null, null, entity.toLowerCase(), appname));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-app-{appname}/{insttag}/{insttag2}/{entity}/process-definitions")
	public ResponseEntity<Collection<WFDefinition>> getWFProcessDefinitions(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("insttag") String instTag, @PathVariable("insttag2") String instTag2, @PathVariable("entity") String entity) {
		return ResponseEntity.ok(getCloudWFUtilRuntime().getWFDefinitions(system, instTag, instTag2, entity.toLowerCase(), appname));
	}

	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/process-instances")
	public ResponseEntity<WFInstance> startWFInstance(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @RequestBody WFInstance instance) {

		instance.setBusinessKey(businessKey);
		return ResponseEntity.ok(getCloudWFUtilRuntime().startWFInstance(system, null, null, entity.toLowerCase(), instance, appname));
	}

	//
	// //@ApiOperation(value = "getTask", tags = {"Task" }, notes =
	// "获取标准实例工作流待办(实体待办）")
	// @RequestMapping(method = RequestMethod.POST, value =
	// "/wfcore/{system}-user-{userId}/{insttag}/{entity}/tasks")
	// public ResponseEntity<Map<String,Map<String,Object>>>
	// getTask(@PathVariable("system") String system,
	// @PathVariable("userId") String userId,
	// @PathVariable("insttag") String instTag,
	// @PathVariable("entity") String entity,
	// @RequestBody WFTaskSearchContext context) {
	// Map<String, Map<String, Object>> tasks =
	// wfCoreService.getBusinessKeys(system,"",entity,instTag,"",userId,context);
	// return
	// ResponseEntity.status(HttpStatus.OK).headers(getTotalHeader()).body(tasks);
	// }
	//
	// //@ApiOperation(value = "getTask", tags = {"Task2" }, notes =
	// "获取副本实例工作流待办(实体待办）")
	// @RequestMapping(method = RequestMethod.POST, value =
	// "/wfcore/{system}-user-{userId}/{insttag}/{insttag2}/{entity}/tasks")
	// public ResponseEntity<Map<String,Map<String,Object>>>
	// getTask2(@PathVariable("system") String system,
	// @PathVariable("userId") String userId,
	// @PathVariable("insttag") String instTag,
	// @PathVariable("insttag2") String instTag2,
	// @PathVariable("entity") String entity,
	// @RequestBody WFTaskSearchContext context) {
	// Map<String, Map<String, Object>> tasks =
	// wfCoreService.getBusinessKeys(system,"",entity,instTag,instTag2,userId,context);
	// return
	// ResponseEntity.status(HttpStatus.OK).headers(getTotalHeader()).body(tasks);
	// }
	//
	// //@ApiOperation(value = "getWorkflow", tags = {"workflow" }, notes =
	// "获取当前用户待办类型（移动端）")
	// @RequestMapping(method = RequestMethod.POST, value =
	// "/wftasks-user-{userId}/workflow")
	// public ResponseEntity<List<Workflow>> getWorkflow(@PathVariable("userId")
	// String userId,
	// @RequestBody WFTaskSearchContext context) {
	// return
	// ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getWorkflow(context));
	// }
	//
	// //@ApiOperation(value = "getWorkflowUrl", tags = {"workflowUrl" }, notes
	// = "获取待办跳转地址（移动端）")
	// @RequestMapping(method = RequestMethod.POST, value =
	// "/wftasks-user-{userId}/{system}-{entity}-{workflow}/getworkflowurl")
	// public ResponseEntity<WFTask> getWorkflowUrl(@PathVariable("userId")
	// String userId,
	// @PathVariable("system") String system,
	// @PathVariable("entity") String entity,
	// @PathVariable("workflow") String workflow,
	// @RequestBody WFTaskSearchContext context){
	// return
	// ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getWorkFlowUrl(userId,
	// system , entity , workflow, context));
	// }
	//
	// //@ApiOperation(value = "wfstart", tags = {"WFInstance" }, notes =
	// "启动工作流")
	// @RequestMapping(method = RequestMethod.POST, value =
	// "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/process-instances")
	// public ResponseEntity<WFInstance> wfstart(@PathVariable("system") String
	// system, @PathVariable("appname") String appname,
	// @PathVariable("entity") String entity,
	// @PathVariable("businessKey") String businessKey, @RequestBody WFInstance
	// instance) {
	// instance.setBusinesskey(businessKey);
	// return
	// ResponseEntity.ok(wfCoreService.wfStart(system,appname,entity,businessKey,instance));
	// }
	//
	// //@ApiOperation(value = "wfsubmit", tags = {"Submit" }, notes =
	// "工作流执行步骤")
	// @RequestMapping(method = RequestMethod.POST, value =
	// "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/tasks/{taskId}")
	// public ResponseEntity<WFInstance> wfsubmit(@PathVariable("system") String
	// system, @PathVariable("appname") String appname,
	// @PathVariable("entity") String entity,
	// @PathVariable("businessKey") String businessKey, @PathVariable("taskId")
	// String taskId,
	// @RequestBody WFTaskWay taskWay) {
	// return
	// ResponseEntity.ok(wfCoreService.wfsubmit(system,appname,entity,businessKey,taskId,taskWay));
	// }
	//
	// //@ApiOperation(value = "getWFStep", tags = {"getWFStep" }, notes =
	// "根据业务流程定义获取工作流节点配置（流程表单）")
	// @RequestMapping(method = RequestMethod.GET, value =
	// "/wfcore/{system}-app-{appname}/{entity}/process-definitions/{processDefinitionKey}/usertasks/{taskDefinitionKey}")
	// public ResponseEntity<WFProcessNode> getwfstep(@PathVariable("system")
	// String system, @PathVariable("appname") String appname,
	// @PathVariable("entity") String entity,
	// @PathVariable("processDefinitionKey") String processDefinitionKey,
	// @PathVariable("taskDefinitionKey") String taskDefinitionKey) {
	// return
	// ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getWFStep(system,appname,entity,processDefinitionKey,taskDefinitionKey));
	// }
	//
	// //@ApiOperation(value = "getWayByBusinessKey", tags = {"WFTaskWay" },
	// notes = "根据业务主键和当前步骤获取下一步操作路径")
	// @RequestMapping(method = RequestMethod.POST, value =
	// "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/usertasks/{taskDefinitionKey}/ways")
	// public ResponseEntity<List<WFTaskWay>> getwflink(@PathVariable("system")
	// String system, @PathVariable("appname") String appname,
	// @PathVariable("entity") String entity,
	// @PathVariable("businessKey") String businessKey,
	// @PathVariable("taskDefinitionKey") String taskDefinitionKey ,
	// @RequestBody WFProcessNode node) {
	// List<WFTaskWay>
	// taskWays=wfCoreService.getWFLink(system,appname,entity,businessKey,taskDefinitionKey,node);
	// return ResponseEntity.status(HttpStatus.OK).body(taskWays);
	// }
	//
	// //@ApiOperation(value = "getWFHistory", tags = {"getWFHistory" }, notes =
	// "根据业务主键获取审批意见记录")
	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/process-instances/{processInstanceId}/history")
	public ResponseEntity<WFInstance> getWFHistory(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("processInstanceId") String processInstanceId) {
		if (ObjectUtils.isEmpty(processInstanceId) || "null".equals(processInstanceId) || "alls".equals(processInstanceId))
			processInstanceId = "";
		return ResponseEntity.status(HttpStatus.OK).body(this.getCloudWFUtilRuntime().getWFHistory(system, entity.toLowerCase(), businessKey, processInstanceId, appname));
	}

	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/process-instances/{processInstanceId}/processdiagram")
	public void getWFDiagram(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("processInstanceId") String processInstanceId, @RequestBody WFInstance instance, HttpServletResponse response) {

		if (ObjectUtils.isEmpty(processInstanceId) || "null".equals(processInstanceId) || "alls".equals(processInstanceId)) {
			processInstanceId = "";
		}

		try (InputStream is = this.getCloudWFUtilRuntime().getWFDiagramInputStream(system, entity.toLowerCase(), businessKey, processInstanceId, appname);){
			response.setHeader("Content-Disposition", "attachment;filename=" + RestUtils.getDownloadFileName("wfdiagram"));
			IOUtils.copyLarge(is, response.getOutputStream());
		} catch (IOException ex) {
			throw new InternalServerErrorException(ex.getMessage());
		}

//		File file = wfCoreService.getProcessDiagram(system, appname, entity, businessKey, processInstanceId, instance);
//		response.setHeader("Content-Disposition", "attachment;filename=" + wfCoreService.getFileName(file.getName()));
//		wfCoreService.sendResponse(response, file);
	}

	//	@ApiOperation(value = "deploybpmn", tags = { "deploybpmn" }, notes = "部署动态版工作流")
//	@RequestMapping(method = RequestMethod.POST, value = "/deploydynabpmn")
//	public ResponseEntity<Boolean> deployDynaWorkFlow(@RequestBody List<Map<String, Object>> bpmnfiles) {
//		return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.wfdeployDynaBpmns(bpmnfiles));
//	}
//
//	@ApiOperation(value = "getWFProcessDefinition", tags = { "WFProcessDefinition" }, notes = "获取标准实例的工作流")
//	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-app-{appname}/{entity}/process-definitions2")
//	public ResponseEntity<List<WFProcessDefinition>> getMasterWorkFlow(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity) {
//		return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getMasterWF(system, appname, entity));
//	}
//
//	@ApiOperation(value = "getWFProcessDefinition", tags = { "WFProcessDefinition" }, notes = "获取副本实例的工作流")
//	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-app-{appname}/{insttag}/{insttag2}/{entity}/process-definitions")
//	public ResponseEntity<List<WFProcessDefinition>> getBackupWorkFlow(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("insttag") String instTag, @PathVariable("insttag2") String instTag2, @PathVariable("entity") String entity) {
//		return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getBackupWF(instTag, instTag2, system, appname, entity));
//	}
//
//	@ApiOperation(value = "getTask", tags = { "Task" }, notes = "获取标准实例工作流待办(实体待办）")
//	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-user-{userId}/{insttag}/{entity}/tasks")
//	public ResponseEntity<Map<String, Map<String, Object>>> getTask(@PathVariable("system") String system, @PathVariable("userId") String userId, @PathVariable("insttag") String instTag, @PathVariable("entity") String entity, @RequestBody WFTaskSearchContext context) {
//		Map<String, Map<String, Object>> tasks = wfCoreService.getBusinessKeys(system, "", entity, instTag, "", userId, context);
//		return ResponseEntity.status(HttpStatus.OK).headers(getTotalHeader()).body(tasks);
//	}
//
//	@ApiOperation(value = "getTask", tags = { "Task2" }, notes = "获取副本实例工作流待办(实体待办）")
//	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-user-{userId}/{insttag}/{insttag2}/{entity}/tasks")
//	public ResponseEntity<Map<String, Map<String, Object>>> getTask2(@PathVariable("system") String system, @PathVariable("userId") String userId, @PathVariable("insttag") String instTag, @PathVariable("insttag2") String instTag2, @PathVariable("entity") String entity, @RequestBody WFTaskSearchContext context) {
//		Map<String, Map<String, Object>> tasks = wfCoreService.getBusinessKeys(system, "", entity, instTag, instTag2, userId, context);
//		return ResponseEntity.status(HttpStatus.OK).headers(getTotalHeader()).body(tasks);
//	}
//
//	@ApiOperation(value = "getWorkflow", tags = { "workflow" }, notes = "获取当前用户待办类型（移动端）")
//	@RequestMapping(method = RequestMethod.POST, value = "/wftasks-user-{userId}/workflow")
//	public ResponseEntity<List<Workflow>> getWorkflow(@PathVariable("userId") String userId, @RequestBody WFTaskSearchContext context) {
//		return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getWorkflow(context));
//	}
//
//	@ApiOperation(value = "getWorkflowUrl", tags = { "workflowUrl" }, notes = "获取待办跳转地址（移动端）")
//	@RequestMapping(method = RequestMethod.POST, value = "/wftasks-user-{userId}/{system}-{entity}-{workflow}/getworkflowurl")
//	public ResponseEntity<WFTask> getWorkflowUrl(@PathVariable("userId") String userId, @PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("workflow") String workflow, @RequestBody WFTaskSearchContext context) {
//		return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getWorkFlowUrl(userId, system, entity, workflow, context));
//	}
//
//	@ApiOperation(value = "wfstart", tags = { "WFProcessInstance" }, notes = "启动工作流")
//	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/process-instances")
//	public ResponseEntity<WFInstance> wfstart(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @RequestBody WFInstance instance) {
//		instance.setBusinesskey(businessKey);
//		return ResponseEntity.ok(wfCoreService.wfStart(system, appname, entity, businessKey, instance));
//	}
//
	//@ApiOperation(value = "wfsubmit", tags = { "Submit" }, notes = "工作流执行步骤") 
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/tasks/{taskId}")
	public ResponseEntity<WFInstance> submitWFTaskWay(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("taskId") String taskId, @RequestBody WFTaskWay taskWay) {

		if(businessKey.equals("undefined")) {
			businessKey = null;
		}
		//return ResponseEntity.ok(wfCoreService.wfsubmit(system, appname, entity, businessKey, taskId, taskWay));
		return ResponseEntity.ok(this.getCloudWFUtilRuntime().submitWFTask(system, null, null, entity.toLowerCase(), businessKey, taskId, taskWay, appname));
	}

	//@ApiOperation(value = "getWFStep", tags = { "getWFStep" }, notes = "根据业务流程定义获取工作流节点配置（流程表单）")
	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-app-{appname}/{entity}/process-definitions/{processDefinitionKey}/usertasks/{taskDefinitionKey}")
	public ResponseEntity<WFDefinitionNode> getWFDefinitionNode(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("processDefinitionKey") String processDefinitionKey, @PathVariable("taskDefinitionKey") String taskDefinitionKey) {
		//return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getWFStep(system, appname, entity, processDefinitionKey, taskDefinitionKey));
		return ResponseEntity.ok(this.getCloudWFUtilRuntime().getWFDefinitionNode(system, entity.toLowerCase(), processDefinitionKey, taskDefinitionKey, appname));
	}
	//
//	@ApiOperation(value = "getWayByBusinessKey", tags = { "WFTaskWay" }, notes = "根据业务主键和当前步骤获取下一步操作路径")
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/usertasks/{taskDefinitionKey}/ways")
	public ResponseEntity<List<WFTaskWay>> getWFTaskWays(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("taskDefinitionKey") String taskDefinitionKey, @RequestBody WFDefinitionNode node) {
		//List<WFTaskWay> taskWays = wfCoreService.getWFLink(system, appname, entity, businessKey, taskDefinitionKey, node);
		List<WFTaskWay> wfTaskWays = this.getCloudWFUtilRuntime().getWFTaskWays(system, entity.toLowerCase(), businessKey, taskDefinitionKey, node, appname);
		return ResponseEntity.status(HttpStatus.OK).body(wfTaskWays);
	}
//



	//	@ApiOperation(value = "sendback", tags = { "sendback" }, notes = "流程步骤回退")
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/tasks/{taskId}/sendback")
	public ResponseEntity<Boolean> sendBackWFTaskWay(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("taskId") String taskId, @RequestBody WFTaskWay taskWay) {
		//return ResponseEntity.ok(wfCoreService.sendBack(taskId, taskWay));
		this.getCloudWFUtilRuntime().sendBackWFTaskWay(system, entity.toLowerCase(), businessKey, taskId, taskWay, appname);
		return ResponseEntity.ok(true);
	}
	//
//	@ApiOperation(value = "withDraw", tags = { "withDraw" }, notes = "流程步骤撤回")
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/tasks/{taskId}/withdraw")
	public ResponseEntity<Boolean> withdrawWFTaskWay(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("taskId") String taskId, @RequestBody WFTaskWay taskWay) {
		//return ResponseEntity.ok(wfCoreService.withDraw(taskId, taskWay));
		this.getCloudWFUtilRuntime().withdrawWFTaskWay(system, entity.toLowerCase(), businessKey, taskId, taskWay, appname);
		return ResponseEntity.ok(true);
	}
	//
//	@ApiOperation(value = "dataAccessMode", tags = { "流程跳转" }, notes = "流程跳转")
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-{entity}/{businessKey}/process-instances/{processInstanceId}/jump")
	public ResponseEntity<Boolean> jumpWFInstance(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("processInstanceId") String processInstanceId, @RequestBody WFInstance instance) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		if(!StringUtils.hasLength(iEmployeeContext.getTenant()) ||
				!iEmployeeContext.isSuperuser()) {
			throw new RuntimeException("必须机构管理员才能进行此操作");
		}
		instance.setId(processInstanceId);
		//return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.jump(system, entity, businessKey, instance));
		this.getCloudWFUtilRuntime().jumpWFInstance(system, entity.toLowerCase(), null, instance, null);
		return ResponseEntity.ok(true);
	}
	//流程取消
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-{entity}/{businessKey}/process-instances/{processInstanceId}/cancel")
	public ResponseEntity<Boolean> cancelWFInstance(@PathVariable("system") String system, @PathVariable("entity") String entity,  @PathVariable("businessKey") String businessKey, @PathVariable("processInstanceId") String processInstanceId, @RequestBody WFInstance instance) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		if(!StringUtils.hasLength(iEmployeeContext.getTenant()) ||
				!iEmployeeContext.isSuperuser()) {
			throw new RuntimeException("必须机构管理员才能进行此操作");
		}
		instance.setId(processInstanceId);
		this.getCloudWFUtilRuntime().cancelWFInstance(system, entity.toLowerCase(), null, instance, null);
		return ResponseEntity.ok(true);
	}

	//获取流程实例所有节点
	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-{entity}/{businessKey}/process-instances/{processInstanceId}/definitionnodes")
	public ResponseEntity<List<WFDefinitionNode>> getWFDefinitionNodes(@PathVariable("system") String system, @PathVariable("entity") String entity,  @PathVariable("businessKey") String businessKey, @PathVariable("processInstanceId") String processInstanceId) {
		return ResponseEntity.ok(this.getCloudWFUtilRuntime().getWFDefinitionNodes(system, entity.toLowerCase(), processInstanceId, null));
	}



	//
//	@ApiOperation(value = "前加签任务", tags = { "工作流前加签任务" }, notes = "前加签任务")
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/tasks/{taskId}/beforesign")
	public ResponseEntity<Boolean> signWFTaskWay(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("taskId") String taskId, @RequestBody WFTaskWay taskWay) {
		//return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.beforeSign(system, appname, entity, businessKey, taskId, taskWay));
		this.getCloudWFUtilRuntime().signWFTaskWay(system, entity.toLowerCase(), businessKey, taskId, taskWay, appname);
		return ResponseEntity.ok(true);
	}

	//	@ApiOperation(value = "后加签任务", tags = { "工作流后加签任务" }, notes = "后加签任务")
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/tasks/{taskId}/aftersign")
	public ResponseEntity<Boolean> afterAddSign(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("taskId") String taskId, @RequestBody WFTaskWay taskWay) {
		//return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.afterAddSign(system, appname, entity, businessKey, taskId, taskWay));
		this.getCloudWFUtilRuntime().afterAddSign(system, entity.toLowerCase(), businessKey, taskId, taskWay, appname);
		return ResponseEntity.ok(true);
	}
	//
//	@ApiOperation(value = "转办任务", tags = { "工作流转办任务" }, notes = "转办任务")
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/tasks/{taskId}/transfer")
	public ResponseEntity<Boolean> transferWFTaskWay(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("taskId") String taskId, @RequestBody WFTaskWay taskWay) {
		//return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.reassign(system, appname, entity, businessKey, taskId, taskWay));
		this.getCloudWFUtilRuntime().transferWFTaskWay(system, entity.toLowerCase(), businessKey, taskId, taskWay, appname);
		return ResponseEntity.ok(true);
	}
	//
//	@ApiOperation(value = "将文件抄送给选定人员", tags = { "将文件抄送给选定人员" }, notes = "将文件抄送给选定人员")
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/tasks/{taskId}/sendcopy")
	public ResponseEntity<Boolean> sendCopyWFTaskWay(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("taskId") String taskId, @RequestBody WFTaskWay taskWay) {
		//return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.sendCopy(system, appname, entity, businessKey, taskId, taskWay));
		this.getCloudWFUtilRuntime().sendCopyWFTaskWay(system, entity.toLowerCase(), businessKey, taskId, taskWay, appname);
		return ResponseEntity.ok(true);
	}
	//
//	@ApiOperation(value = "标记任务已读", tags = { "工作流标记任务已读" }, notes = "标记任务已读")
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/tasks/{taskId}/read")
	public ResponseEntity<Boolean> markReadWFTaskWay(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("taskId") String taskId, @RequestBody WFTaskWay taskWay) {
		//return ResponseEntity.ok(wfCoreService.readTask(system, appname, entity, businessKey, taskId, taskWay));
		this.getCloudWFUtilRuntime().markReadWFTaskWay(system, entity.toLowerCase(), businessKey, taskId, taskWay, appname);
		return ResponseEntity.ok(true);
	}


	//@ApiOperation(value = "dataAccessMode", tags = { "获取业务单据可编辑的属性列表" }, notes = "业务单据可编辑属性列表")
	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-{entity}/{businessKey}/editfields")
	public ResponseEntity<WFEditableFields> getWFInstanceEditableFields(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey) {
		return ResponseEntity.status(HttpStatus.OK).body(this.getCloudWFUtilRuntime().getWFInstanceEditableFields(system, null, null, entity.toLowerCase(), businessKey, null));
	}

	//@ApiOperation(value = "dataAccessMode", tags = {"判断业务单据当前节点是否支持编辑" },  notes = "是否允许编辑")
	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-{entity}/{businessKey}/dataaccessmode")
	public ResponseEntity<Integer> getWFInstanceAccessMode(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey) {
		//return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.registerWF(instance));
		return ResponseEntity.status(HttpStatus.OK).body(this.getCloudWFUtilRuntime().getWFInstanceAccessMode(system, null, null, entity.toLowerCase(), businessKey, null));
	}


//
//	@ApiOperation(value = "dataAccessMode", tags = { "判断业务单据当前节点是否支持编辑" }, notes = "是否允许编辑")
//	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-{entity}/{businessKey}/dataaccessmode")
//	public ResponseEntity<Integer> getDataAccessMode(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") Serializable businessKey) {
//		return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getDataAccessMode(system, entity, businessKey));
//	}
//

	//@ApiOperation(value = "dataAccessMode", tags = { "业务数据注册" }, notes = "业务数据注册")
	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-{entity}/{businessKey}/register")
	public ResponseEntity<WFInstance> registerWFInstance(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @RequestBody WFInstance instance) {
		//return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.registerWF(instance));
		return ResponseEntity.status(HttpStatus.OK).body(this.getCloudWFUtilRuntime().registerWFInstance(system, null, null, entity.toLowerCase(), businessKey, instance, null));
	}

	//@ApiOperation(value = "dataAccessMode", tags = { "解除已注册的业务数据" }, notes = "解除已注册的业务数据")
	@RequestMapping(method = RequestMethod.DELETE, value = "/wfcore/{system}-{entity}/{businessKey}/unregister")
	public ResponseEntity<Boolean> unregisterWFInstance(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey) {
		//return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.unregisterWF(system, entity, businessKey));
		this.getCloudWFUtilRuntime().unregisterWFInstance(system, null, null, entity.toLowerCase(), businessKey, null);
		return ResponseEntity.ok(true);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-{entity}/{businessKey}/wfinstance")
	public ResponseEntity<WFInstance> getWFInstanceByBusinessKey(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey) {
		return ResponseEntity.ok(this.getCloudWFUtilRuntime().getWFInstanceByBusinessKey(system, entity.toLowerCase(), businessKey));
	}


//
//	@Deprecated
//	@ApiOperation(value = "getWFProcessDefinition", tags = { "WFProcessDefinition" }, notes = "根据系统实体查找当前适配的工作流模型(静态版）")
//	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-app-{appname}/{entity}/process-definitions")
//	public ResponseEntity<List<WFProcessDefinition>> getworkflow(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity) {
//		return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getWorkflow(system, appname, entity));
//	}
//
//	@Deprecated
//	@ApiOperation(value = "deploybpmn", tags = { "deploybpmn" }, notes = "部署静态版工作流")
//	@RequestMapping(method = RequestMethod.POST, value = "/deploybpmn")
//	public ResponseEntity<Boolean> deployWorkFlow(@RequestBody List<Map<String, Object>> bpmnfiles) {
//		return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.wfdeploybpmns(bpmnfiles));
//	}
//
//	@Deprecated
//	@ApiOperation(value = "getTask", tags = { "Task" }, notes = "获取实体工作流待办")
//	@RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-user-{userId}/{entity}/tasks")
//	public ResponseEntity<Map<String, Map<String, Object>>> getTask(@PathVariable("system") String system, @PathVariable("userId") String userId, @PathVariable("entity") String entity, @RequestBody WFTaskSearchContext context) {
//		Map<String, Map<String, Object>> tasks = wfCoreService.getBusinessKeys(system, "", entity, userId, context);
//		return ResponseEntity.status(HttpStatus.OK).headers(getTotalHeader()).body(tasks);
//	}
//
//	@ApiOperation(value = "dataAccessMode", tags = { "判断业务单据当前节点是否支持编辑(废弃）" }, notes = "是否允许编辑(废弃）")
//	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}/{entity}/{businessKey}/dataaccessmode")
//	@Deprecated
//	public ResponseEntity<Integer> getDataAccessMode3(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") Serializable businessKey) {
//		return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getDataAccessMode(system, entity, businessKey));
//	}
//
//	@Deprecated
//	@ApiOperation(value = "getStepByEntity", tags = { "WFProcessNode" }, notes = "根据系统实体查找当前适配的工作流模型步骤")
//	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-app-{appname}/{insttag}/{insttag2}/{entity}/process-definitions-nodes")
//	public ResponseEntity<List<WFProcessNode>> getwfNodeStep(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("insttag") String instTag, @PathVariable("insttag2") String instTag2) {
//		if ((StringUtils.isEmpty(instTag) || "null".equals(instTag)) && (StringUtils.isEmpty(instTag2) || "null".equals(instTag2))) {
//			return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getWFStep2(system, appname, entity, null, null));
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(wfCoreService.getWFStep2(system, appname, entity, instTag, instTag2));
//	}
//
//	@Deprecated
//	@ApiOperation(value = "getWayByProcessDefinitionKey", tags = { "WFStepWay" }, notes = "标准rt根据流程和当前步骤获取操作路径")
//	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-app-{appname}/{entity}/process-definitions/{processDefinitionKey}/usertasks/{taskDefinitionKey}/ways")
//	public ResponseEntity<List<WFTaskWay>> getWayByDefKey(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("processDefinitionKey") String processDefinitionKey, @PathVariable("taskDefinitionKey") String taskDefinitionKey) {
//		List<WFTaskWay> taskWays = wfCoreService.getWFLinkByStep(system, appname, entity, processDefinitionKey, taskDefinitionKey);
//		return ResponseEntity.status(HttpStatus.OK).headers(getHeader()).body(taskWays);
//	}


	//@ApiOperation(value = "根据角色/用户组获取DEFAULT", tags = {"成员" } ,notes = "根据角色/用户组获取DEFAULT")
	@RequestMapping(method= RequestMethod.GET , value="/wfcore/wfgroups/{wfgroup_id}/wfmembers/fetchdefault")
	public ResponseEntity<Collection<WFMember>> fetchWFMembers(@PathVariable("wfgroup_id") String wfgroup_id, HttpServletRequest httpServletRequest) {

		//从请求中构建参数对象
		String strQueryString = httpServletRequest.getQueryString();
		Map<String, Object> map = RestUtils.queryString2Map(strQueryString);

		Page<WFMember> page = this.getCloudWFUtilRuntime().fetchWFMembers(wfgroup_id, map);
		return RestUtils.sendBackPage(page, WFMember.class);
	}

	//@ApiOperation(value = "根据角色/用户组获取排除数据", tags = {"成员" } ,notes = "根据角色/用户组获取排除数据")
	@RequestMapping(method= RequestMethod.GET , value="/wfcore/wfgroups/{wfgroup_id}/wfmembers/fetchexclude")
	public ResponseEntity<Collection<WFMember>> fetchWFMembersExclude(@PathVariable("wfgroup_id") String wfgroup_id, HttpServletRequest httpServletRequest) {
//        AuthenticationUser user  = AuthenticationUser.getAuthenticationUser();
//        if(user == null)
//            throw new BadRequestAlertException("获取用户信息失败","","");
//        context.setN_groupid_eq(String.format("%s-%s",user.getSrfdcid(),wfgroup_id));
//        Page<WFMember> domains = wfmemberService.searchExclude(context) ;
//        List<WFMemberDTO> list = wfmemberMapping.toDto(domains.getContent());
//        return ResponseEntity.status(HttpStatus.OK)
//                .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
//                .header("x-per-page", String.valueOf(context.getPageable().getPageSize()))
//                .header("x-total", String.valueOf(domains.getTotalElements()))
//                .body(list);


		//从请求中构建参数对象
		String strQueryString = httpServletRequest.getQueryString();
		Map<String, Object> map = RestUtils.queryString2Map(strQueryString);

		Page<WFMember> page = this.getCloudWFUtilRuntime().fetchWFMembersExcludeMode(wfgroup_id, map);
		return RestUtils.sendBackPage(page, WFMember.class);
	}

	//@ApiOperation(value = "根据多部门/角色/用户组获取排除数据", tags = {"成员" } ,notes = "根据多部门/角色/用户组获取排除数据")
	@RequestMapping(method= RequestMethod.GET , value="/wfcore/wfgroups/{wfgroup_id}/wfmembers/selectmultideptuser")
	public ResponseEntity<Collection<WFMember>> fetchWFMembersMultiDept(@PathVariable("wfgroup_id") String wfgroup_id, HttpServletRequest httpServletRequest) {
//        AuthenticationUser user  = AuthenticationUser.getAuthenticationUser();
//        if(user == null){
//            throw new BadRequestAlertException("获取用户信息失败","","");
//        }
//        context.setN_groupid_eq(String.format("%s-%s",user.getSrfdcid(),wfgroup_id));
//        List<WFMember> domains = wfmemberService.selectMultiDeptUser(context) ;
//        List<WFMemberDTO> list = wfmemberMapping.toDto(domains);
//        return ResponseEntity.status(HttpStatus.OK)
//                .header("x-page", String.valueOf(context.getPageable().getPageNumber()))
//                .header("x-per-page", String.valueOf(context.getPageable().getPageSize()))
//                .header("x-total", String.valueOf(domains.size()))
//                .body(list);

		//从请求中构建参数对象
		String strQueryString = httpServletRequest.getQueryString();
		Map<String, Object> map = RestUtils.queryString2Map(strQueryString);

		Page<WFMember> page = this.getCloudWFUtilRuntime().fetchWFMembersMultiDeptMode(wfgroup_id, map);
		return RestUtils.sendBackPage(page, WFMember.class);
	}


	@RequestMapping(method = RequestMethod.GET, value = "/wfcore/mytasks")
	public ResponseEntity<Collection<WFTask>> getMyWFTasks() {
		List<WFTask> list = new ArrayList<WFTask>();
		return ResponseEntity.ok(this.getCloudWFUtilRuntime().getMyWFTasks());
	}

}
