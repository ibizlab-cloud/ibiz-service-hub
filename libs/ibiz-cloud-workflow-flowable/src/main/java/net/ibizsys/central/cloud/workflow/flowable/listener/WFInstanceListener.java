package net.ibizsys.central.cloud.workflow.flowable.listener;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudWFUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.core.util.domain.WFStates;
import net.ibizsys.central.cloud.workflow.core.addin.ICloudWFUtilRTAddin;
import net.ibizsys.central.cloud.workflow.core.cloudutil.ICloudWFUtilRuntimeContext;
import net.ibizsys.central.cloud.workflow.core.util.WFConsts;
import net.ibizsys.central.cloud.workflow.flowable.cloudutil.ICloudFlowableUtilRuntime;
import net.ibizsys.central.cloud.workflow.flowable.util.FlowableUtils;
import net.ibizsys.central.cloud.workflow.flowable.util.WFCoreService;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.JsonUtils;
import org.apache.commons.logging.LogFactory;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.EndEvent;
import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.UserTask;
import org.flowable.common.engine.api.delegate.event.*;
import org.flowable.common.engine.impl.identity.Authentication;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.TaskService;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.event.*;
import org.flowable.engine.impl.persistence.entity.ExecutionEntity;
import org.flowable.engine.impl.persistence.entity.ExecutionEntityImpl;
import org.flowable.identitylink.service.impl.persistence.entity.IdentityLinkEntity;
import org.flowable.job.service.impl.persistence.entity.JobEntity;
import org.flowable.task.service.impl.persistence.entity.TaskEntity;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.util.*;

public class WFInstanceListener extends AbstractFlowableEventListener implements ICloudWFUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(WFInstanceListener.class);

	private ICloudFlowableUtilRuntime iCloudFlowableUtilRuntime = null;
	private ICloudWFUtilRuntimeContext iCloudWFUtilRuntimeContext = null;
	private WFCoreService wfCoreService;

	@Override
	public void init(ICloudWFUtilRuntimeContext iCloudWFUtilRuntimeContext, Object pluginData) throws Exception {
		this.iCloudWFUtilRuntimeContext = iCloudWFUtilRuntimeContext;
		this.iCloudFlowableUtilRuntime = (ICloudFlowableUtilRuntime) this.iCloudWFUtilRuntimeContext.getCloudWFUtilRuntime();

		this.onInit();
	}

	protected void onInit() throws Exception {

	}

	protected ICloudWFUtilRuntimeContext getCloudWFUtilRuntimeContext() {
		return this.iCloudWFUtilRuntimeContext;
	}

	protected ICloudFlowableUtilRuntime getCloudFlowableUtilRuntime() {
		return this.iCloudFlowableUtilRuntime;
	}

	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudFlowableUtilRuntime().getSystemRuntime();
	}

	protected WFCoreService getWFCoreService() {
		if (this.wfCoreService == null) {
			if (getCloudFlowableUtilRuntime().getProcessEngine().getProcessEngineConfiguration().getBeans() != null) {
				wfCoreService = (WFCoreService) getCloudFlowableUtilRuntime().getProcessEngine().getProcessEngineConfiguration().getBeans().get("wfCoreService");
			}
			if (this.wfCoreService == null) {
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("未指定流程核心服务对象"));
			}
		}
		return this.wfCoreService;
	}

	protected TaskService getTaskService() {
		return this.getCloudFlowableUtilRuntime().getProcessEngine().getTaskService();
	}

	protected RepositoryService getRepositoryService() {
		return this.getCloudFlowableUtilRuntime().getProcessEngine().getRepositoryService();
	}

	// @Autowired
	// @Lazy
	// private WFModelService wfModelService;
	//
	// @Autowired
	// @Lazy
	// private TaskService taskService;
	//
	// @Autowired
	// @Lazy
	// private WFCoreService wfCoreService;
	//
	// @Autowired
	// private IWFInstanceService instanceService;
	//
	// @Autowired
	// private ISysTodoHisService sysTodoHisService;
	//
	// @Autowired
	// ISysTodoService todoService;
	//
	//// @Autowired
	//// OutsideAccessorUtils outsideAccessorUtils;
	//
	// @Value("${ibiz.auth.login.systemid:ibizrt4ebsx-rt4ebsx}")
	// String srfsystemId;
	//
	// @Value("${ibiz.auth.login.srfdcid:aibizhi}")
	// String srfdcid;
	//
	// @Value("${ibiz.ref.service.uaa:ibizrt4ebsx-rt4ebsx}")
	// String uaaservice;
	//
	// @Value("${ibiz.wf.systodo.extparam:urgency}")
	// private String extParams;
	//
	// @Value("${ibiz.wf.dynainsttag.enable:false}")
	// String enableDynaInstTag;

	protected ExecutionEntity getExecutionEntity(FlowableEvent evt) {
		ExecutionEntity executionEntity = null;
		if (evt instanceof FlowableEntityEvent) {
			executionEntity = (ExecutionEntity) ((FlowableEntityEvent) evt).getEntity();
			if (executionEntity != null) {
				return executionEntity;
			}
		}
		if (evt instanceof FlowableProcessEngineEvent) {
			executionEntity = (ExecutionEntity) ((FlowableProcessEngineEvent) evt).getExecution();
			if (executionEntity != null) {
				EBSXWFRollbackListener.pushRollBackEntity(executionEntity);
				return executionEntity;
			}
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("上下文数据对象无效"));
	}

	protected DelegateExecution getDelegateExecution(FlowableEvent evt, boolean bTryMode) {
		DelegateExecution delegateExecution = null;
		if (evt instanceof FlowableProcessEngineEvent) {
			delegateExecution = ((FlowableProcessEngineEvent) evt).getExecution();
			if (delegateExecution != null) {
				return delegateExecution;
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("上下文执行对象无效"));
	}

	@Override
	public void onEvent(FlowableEvent evt) {

		if (EmployeeContext.getCurrent() != null && UserContext.getCurrent() == null) {
			UserContext.setCurrent(EmployeeContext.getCurrent());
		}

		this.getWFCoreService();

		// 流程启动
		if (evt instanceof FlowableProcessStartedEvent && ((FlowableProcessStartedEvent) evt).getEntity() instanceof ExecutionEntity) {
			ExecutionEntity executionEntity = getExecutionEntity(evt);
			FlowableProcessStartedEvent event = (FlowableProcessStartedEvent) evt;

			// executionEntity.setVariable("wfCoreService", this);
			//String entity = executionEntity.getVariable("entity").toString();

			String entity = this.getEntityName(executionEntity);

			Map<String, Object> setting = this.getCloudFlowableUtilRuntime().getProcessGlobalSetting(executionEntity.getProcessDefinitionId());
			String wfstepfield = "";
			if (setting.containsKey("wfstepfield" + "_" + entity)) {
				wfstepfield = setting.get("wfstepfield" + "_" + entity).toString();
			}
			String wfinstfield = "";
			if (setting.containsKey("wfinstfield" + "_" + entity)) {
				wfinstfield = setting.get("wfinstfield" + "_" + entity).toString();
			}
			String udstatefield = "";
			if (setting.containsKey("udstatefield" + "_" + entity)) {
				udstatefield = setting.get("udstatefield" + "_" + entity).toString();
			}
			String wfstatefield = "";
			if (setting.containsKey("wfstatefield" + "_" + entity)) {
				wfstatefield = setting.get("wfstatefield" + "_" + entity).toString();
			}
			String udstateingval = "20";
			if (setting.containsKey("udstateingval" + "_" + entity)) {
				udstateingval = setting.get("udstateingval" + "_" + entity).toString();
			}
			String wffinishval = null;
			if (setting.containsKey("wffinishval" + "_" + entity)) {
				wffinishval = setting.get("wffinishval" + "_" + entity).toString();
			}
			String wfcancelval = null;
			if (setting.containsKey("wfcancelval" + "_" + entity)) {
				wfcancelval = setting.get("wfcancelval" + "_" + entity).toString();
			}
			String wferrorval = null;
			if (setting.containsKey("wferrorval" + "_" + entity)) {
				wferrorval = setting.get("wferrorval" + "_" + entity).toString();
			}
			String wfverfield = "";
			if (setting.containsKey("wfverfield" + "_" + entity)) {
				wfverfield = setting.get("wfverfield" + "_" + entity).toString();
			}
			String majortext_field = "";
			Object objMajortext;
			String majortext;
			if (setting.containsKey("majortext" + "_" + entity)) {
				majortext_field = setting.get("majortext" + "_" + entity).toString();
				Object activedata = executionEntity.getVariable(WFConsts.ACTIVEDATA);
				if (activedata != null) {
					objMajortext = ((Map) activedata).get(majortext_field);
					majortext = ObjectUtils.isEmpty(objMajortext) ? "" : String.valueOf(objMajortext);
					executionEntity.setVariable("majortext", majortext);
				}
			}
			String orgfield = "";
			if (setting.containsKey("orgfield" + "_" + entity)) {
				orgfield = setting.get("orgfield" + "_" + entity).toString();
			}
			String processDefName = null;
			if (executionEntity.getParent() != null) {
				processDefName = executionEntity.getParent().getProcessDefinitionName();
			}

			// 设置工作流参数
			executionEntity.setVariable("wfstepfield", wfstepfield);
			executionEntity.setVariable("wfinstfield", wfinstfield);
			executionEntity.setVariable("udstatefield", udstatefield);
			executionEntity.setVariable("udstateingval", udstateingval);
			executionEntity.setVariable("wffinishval", wffinishval);
			executionEntity.setVariable("wfcancelval", wferrorval);
			executionEntity.setVariable("wferrorval", wferrorval);
			executionEntity.setVariable("wfstatefield", wfstatefield);
			executionEntity.setVariable("wfverfield", wfverfield);
			executionEntity.setVariable("majortextfield", majortext_field);
			executionEntity.setVariable("orgfield", orgfield);
			executionEntity.setVariable("processdefkey", executionEntity.getProcessDefinitionKey());
			executionEntity.setVariable("processbusinesskey", executionEntity.getProcessInstanceBusinessKey());
			executionEntity.setVariable("processdefname", processDefName);

			// 准备工作流步骤数据
			prepareWFStep(evt);
			// 更新流程实例
			WFInstance wfInstance = updateWFInstance(evt);
			// 工作流回调业务系统
			// wfCallBack(evt);
			this.executeWFCallback(evt, wfInstance);

			// //创建todo已办记录
			saveTodo(evt);
		}
		// 多实例（会签）
		else if (evt instanceof FlowableMultiInstanceActivityEvent && evt.getType() == FlowableEngineEventType.MULTI_INSTANCE_ACTIVITY_STARTED) {
			FlowableMultiInstanceActivityEvent event = (FlowableMultiInstanceActivityEvent) evt;
			ExecutionEntity executionEntity = getExecutionEntity(evt);
			int all_role_cnt;
			Set groupUserIds;
			Map result;

			// DelegateExecution execution = event.getExecution();
			// UserTask task = (UserTask) execution.getCurrentFlowElement();
			FlowElement flowElement = executionEntity.getCurrentFlowElement();

			String strCandidate = FlowableUtils.getElementParam(flowElement, "form", "candidateUsersList");
			if (ObjectUtils.isEmpty(strCandidate)) {
				log.error(String.format("无法获取流程操作用户配置，请检查bpmn步骤是否包含[%1$s]参数", "candidateUsersList"));
				// throw new
				// BadRequestAlertException("无法获取流程操作用户配置，请确认配置是否正确","","");
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("无法获取流程操作用户配置"));
			}
			Set<String> groups = new HashSet(Arrays.asList(strCandidate.split("\\|\\|")));
			Map activeData = (Map) executionEntity.getVariable(WFConsts.ACTIVEDATA);

			// 串行多实例，排序
			if (event.isSequential()) {
				// 获取排序方向
				String order = ObjectUtils.isEmpty(activeData.get(WFConsts.WFORDER)) ? null : String.valueOf(activeData.get(WFConsts.WFORDER));
				// 获取角色成员
				result = wfCoreService.getUsersByGroup(groups, true, executionEntity);
				List<Employee> groupUsers = (List<Employee>) result.get("groupUsers");
				all_role_cnt = (int) result.get("all_role_cnt");
				// 对角色成员进行排序
				groupUserIds = wfCoreService.getUserIds(wfCoreService.sort(groupUsers, order));
			} else {
				// 并行多实例，获取角色成员
				result = wfCoreService.getUsersByGroup(groups, false, executionEntity);
				groupUserIds = (Set) result.get("groupUsers");
				all_role_cnt = (int) result.get("all_role_cnt");
			}
			if (ObjectUtils.isEmpty(groupUserIds)) {
				// log.error("无法获取[{}]步骤审批用户，工作流用户组为[{}]
				// ，execution={}",task.getName(), String.join(",",groups),
				// JSON.toJSONString (executionEntity));
				//log.error(String.format("无法获取[%1$s]步骤审批用户，工作流用户组为[%2$s] ，execution=%3$s", task.getName(), String.join(",", groups), JsonUtils.toString(executionEntity)));
				log.error(String.format("无法获取[%1$s]步骤审批用户，工作流用户组为[%2$s] ，execution=%3$s", flowElement.getName(), String.join(",", groups), executionEntity.toString()));//JsonUtils.toString(executionEntity)));
				// throw new
				// BadRequestAlertException(String.format("工作流操作失败，无法获取[%s]步骤用户",task.getName()),"","");
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("无法获取[%1$s]步骤用户", flowElement.getName()));
			}

			// 存储多实例步骤角色信息，用于all|role:any判断
			wfCoreService.saveProcessNodeParams(groups, executionEntity);
			// event.getExecution().setVariableLocal("all_roles_cnt",all_role_cnt);
			executionEntity.setVariableLocal("all_roles_cnt", all_role_cnt);
			// 设置多实例节点操作用户
			// event.getExecution().setVariableLocal("candidateUsersList",groupUserIds);
			executionEntity.setVariableLocal("candidateUsersList", groupUserIds);
			// 更新流程实例
			WFInstance wfInstance = updateWFInstance(evt);
			// 工作流回调业务系统
			// wfCallBack(evt);
			this.executeWFCallback(evt, wfInstance);
		}
		// 生成待办
		else if (evt instanceof FlowableEngineEntityEvent && FlowableEngineEventType.TASK_CREATED == evt.getType()) {
			try {
				FlowableEngineEntityEvent event = ((FlowableEngineEntityEvent) evt);
				TaskEntity taskEntity = (TaskEntity) event.getEntity();
				String taskDefinitionKey = taskEntity.getTaskDefinitionKey();
				// 步骤扩展参数中包含tag时，待办中也做标记，用于查询指定步骤下的待办
				Object userTags = taskEntity.getVariable("usertags");
				if (!ObjectUtils.isEmpty(userTags) && userTags instanceof Map) {
					Map tags = (Map) userTags;
					String userTag = getStringValue(tags.get(taskDefinitionKey));
					if (userTag != null) {
						taskEntity.setVariableLocal(taskDefinitionKey, userTag);
						taskEntity.setFormKey(userTag);
					}
				}
			} catch (Exception ex) {
				// throw new BadRequestAlertException("工作流交互失败" + e, "", "");
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("工作流交互发生异常，%1$s", ex.getMessage()), ex);

			}

			//判断节点是否发送消息通知
			this.executeWFNotifyCallback(evt);

			// 创建todo待办
			saveTodo(evt);
		}
		// 提交待办
		else if (evt instanceof FlowableEntityWithVariablesEvent && FlowableEngineEventType.TASK_COMPLETED == evt.getType()) {
			FlowableEntityWithVariablesEvent event = (FlowableEntityWithVariablesEvent) evt;
			TaskEntity taskEntity = (TaskEntity) event.getEntity();
			// AuthenticationUser user = FlowUser.getCurUser().getUser();
			// if (user == null) {
			// log.error("获取用户信息失败，无法获取到当前登录用户信息，FlowUser.getCurUser().getUser()==null");
			// throw new BadRequestAlertException("获取用户信息失败", "", "");
			// }
			// 添加处理意见
			if (taskEntity.getTaskDefinitionKey().startsWith("tid-")) {
				Object data = taskEntity.getVariable(WFConsts.ACTIVEDATA);
				Object link = taskEntity.getVariable("sequenceFlowName");
				if (data != null && (data instanceof Map) && link != null) {
					Map activeData = (Map) data;
					if (activeData.get(WFConsts.WFMEMO) != null) {
						String comment = activeData.get(WFConsts.WFMEMO).toString();
						getTaskService().addComment(taskEntity.getId(), taskEntity.getProcessInstanceId(), link.toString(), comment);
					} else {
						getTaskService().addComment(taskEntity.getId(), taskEntity.getProcessInstanceId(), link.toString(), "");
					}
				}
			}

			DelegateExecution delegateExecution = getDelegateExecution(event, true);

			// 多实例(all|role:any)实现逻辑
			if (delegateExecution != null && delegateExecution.getParent() != null) {
				Object allRolesCnt = delegateExecution.getVariableLocal("all_roles_cnt");
				Object completeRoles = delegateExecution.getVariableLocal("complete_roles");
				Object completeRolesCnt = delegateExecution.getVariableLocal("complete_roles_cnt");
				String nextCond = wfCoreService.getNextCond(delegateExecution, delegateExecution.getVariable("sequenceFlowId"), WFConsts.LINK_NEXTCOND);

				if (!ObjectUtils.isEmpty(allRolesCnt) && "ALL|ROLE:ANY".equalsIgnoreCase(nextCond)) {
					// 获取当前用户流程角色
					Set userRoles = wfCoreService.getRoleByUserId(Authentication.getAuthenticatedUserId(), delegateExecution);
					if (!ObjectUtils.isEmpty(userRoles)) {
						Set user_complete_roles;
						// 节点是否已有用户提交，若有，则从数据库中获取已提交的用户
						if (!ObjectUtils.isEmpty(completeRolesCnt) && !ObjectUtils.isEmpty(completeRoles)) {
							try {
								user_complete_roles = JsonUtils.MAPPER.readValue(JsonUtils.MAPPER.writeValueAsString(completeRoles), Set.class);
							}
							catch(Exception ex) {
								throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("工作流交互发生异常，%1$s", ex.getMessage()), ex);
							}
						} else {
							// 首次提交，未包含提交用户
							user_complete_roles = new HashSet();
						}
						// 记录已提交的流程角色，并删除其他角色成员待办
						user_complete_roles.addAll(userRoles);
						delegateExecution.getParent().setVariableLocal("complete_roles", user_complete_roles);
						delegateExecution.getParent().setVariableLocal("complete_roles_cnt", user_complete_roles.size());
						if ((int) allRolesCnt > 1 && (int) allRolesCnt != user_complete_roles.size()) {
							wfCoreService.deleteRoleTask(userRoles, delegateExecution);
						}
					}
				}
			}
			taskEntity.setVariableLocal(WFConsts.WF_TAG, WFConsts.TASK_COMPLETE);
			// 提交任务
			saveTodo(evt);
		}
		// 步骤开始
		else if (evt instanceof FlowableActivityEvent && evt.getType() == FlowableEngineEventType.ACTIVITY_STARTED &&( "userTask".equals(((FlowableActivityEvent) evt).getActivityType()) || "callActivity".equals(((FlowableActivityEvent) evt).getActivityType()))) {
			// 更新流程实例
			WFInstance wfInstance = updateWFInstance(evt);
			// 工作流回调业务系统
			// wfCallBack(evt);
			this.executeWFCallback(evt, wfInstance);
		}
		// 步骤结束
		else if (evt instanceof FlowableActivityEvent && evt.getType() != null && (FlowableEngineEventType.ACTIVITY_COMPLETED == evt.getType() || FlowableEngineEventType.MULTI_INSTANCE_ACTIVITY_COMPLETED == evt.getType())&& ((FlowableProcessEngineEvent) evt).getExecution().getCurrentFlowElement() instanceof UserTask) {
			// 创建抄送任务
			saveTodo(evt);
		}
		// 流程结束，自定义流程完成状态值
		else if (evt instanceof FlowableActivityEvent && evt.getType() == FlowableEngineEventType.ACTIVITY_STARTED && "endEvent".equals(((FlowableActivityEvent) evt).getActivityType())) {
			FlowableActivityEvent event = ((FlowableActivityEvent) evt);
			//DelegateExecution execution =  event.getExecution();
			DelegateExecution delegateExecution = getDelegateExecution(event, false);

			if (delegateExecution.getCurrentFlowElement() != null) {
				EndEvent endEvent = (EndEvent) delegateExecution.getCurrentFlowElement();
				String userdata = FlowableUtils.getElementParam(endEvent, "form", "userdata");
				String exitstatevalue = FlowableUtils.getElementParam(endEvent, "form", "exitstatevalue");
				//兼容原有使用userdata模式
				if (delegateExecution.getParent() != null && !ObjectUtils.isEmpty(exitstatevalue)) {
					delegateExecution.getParent().setVariable("wffinishval", exitstatevalue);
				}else if (delegateExecution.getParent() != null && !ObjectUtils.isEmpty(userdata)) {
					delegateExecution.getParent().setVariable("wffinishval", userdata);
				}
			}
		}
		// 流程结束
		else if (evt instanceof FlowableEngineEntityEvent && evt.getType() != null && FlowableEngineEventType.PROCESS_COMPLETED == evt.getType()) {
			// 更新流程实例
			WFInstance wfInstance = updateWFInstance(evt);
			// 工作流回调业务系统
			//wfCallBack(evt);
			this.executeWFCallback(evt, wfInstance);
		}
		// 取消流程
		else if (evt instanceof FlowableCancelledEvent && FlowableEngineEventType.PROCESS_CANCELLED == evt.getType()) {
			//wfCallBack(evt);
			this.executeWFCallback(evt, null);
		}
		//超时处理
		else if (evt instanceof FlowableEngineEntityEvent && FlowableEngineEventType.TIMER_FIRED == evt.getType()) {

			FlowableEngineEntityEvent event = (FlowableEngineEntityEvent) evt;
			if(event.getEntity() == null || !(event.getEntity() instanceof JobEntity)){
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), "执行工作流超时发生错误，超时作业参数格式不正确");
			}

			JobEntity jobEntity = (JobEntity) event.getEntity();
			String strTenantId = jobEntity.getTenantId();
			if(StringUtils.isEmpty(strTenantId)){
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("执行工作流超时作业[%s]发生错误，超时作业未配置租户标识",jobEntity.getId()));
			}

			DelegateExecution delegateExecution = getDelegateExecution(event, false);
			Object systemId = delegateExecution.getVariable("system");
			if(ObjectUtils.isEmpty(systemId)){
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("执行工作流超时作业[%s]发生错误，未能从流程实例变量中获取系统标识",jobEntity.getId()));
			}

			Object dcSystemId = delegateExecution.getVariable("dcsystem");

			//构造超时用户身份
			Employee employee = new Employee();
			employee.setUserId("SYSTEM");
			employee.setUserName("内置用户");
			employee.setPersonName("内置用户");
			employee.setSrfdcid(jobEntity.getTenantId());
			if(dcSystemId != null) {
				employee.setDCSystemId(dcSystemId.toString());
			}
			//employee.setOrgId("");

			EmployeeContext employeeContext = new EmployeeContext(employee, null, systemId.toString());
			UserContext.setCurrent(employeeContext);

		}
	}

	/**
	 * 准备工作流步骤数据，用于查询指定步骤下待办
	 *
	 * @param evt
	 */
	protected void prepareWFStep(FlowableEvent evt) {
		FlowableProcessStartedEvent event = (FlowableProcessStartedEvent) evt;
		ExecutionEntity executionEntity = (ExecutionEntity) event.getEntity();
		String procDefKey = executionEntity.getProcessDefinitionKey();
		// 查询配置tag的步骤，设置到map中，生成待办时使用
		Map<String, UserTask> userTasks = this.getCloudFlowableUtilRuntime().getUserTasksByDefinitionKey(procDefKey);
		Map<String, String> userTags = new HashMap<>();
		if (!ObjectUtils.isEmpty(userTasks)) {
			for (Map.Entry<String, UserTask> entry : userTasks.entrySet()) {
				UserTask userTask = entry.getValue();
				String useTag = FlowableUtils.getElementParam(userTask, "form", "usertag");
				if (!ObjectUtils.isEmpty(useTag)) {
					userTags.put(entry.getKey(), useTag);
				}
			}
			executionEntity.setVariable("usertags", userTags);
		}
	}
	/**
	 * 工作流回调业务系统消息通知
	 *
	 * @param evt
	 */
	protected Object executeWFNotifyCallback(FlowableEvent evt) {

		Map<String, Object> callbackArg = new HashMap<String, Object>();
		// 任务建立
		if (evt != null && evt.getType().equals(FlowableEngineEventType.TASK_CREATED)) {
			FlowableEntityEvent event = ((FlowableEntityEvent) evt);
			TaskEntity taskEntity = (TaskEntity) event.getEntity();
			String strSystemTag = DataTypeUtils.getStringValue(taskEntity.getVariable("system"), null);
			String strAppTag = DataTypeUtils.getStringValue(taskEntity.getVariable("appname"), null);
			String entityName = DataTypeUtils.getStringValue(taskEntity.getVariable("entity"), null);
			String businessKey = DataTypeUtils.getStringValue(taskEntity.getVariable("businessKey"), null);
			callbackArg.put(WFConsts.BUSINESSKEY, businessKey);
			callbackArg.put(Entity.KEY, businessKey);
			String strUserIds = null;
			List<IdentityLinkEntity> links = taskEntity.getIdentityLinks();
			if(!ObjectUtils.isEmpty(links)){
				strUserIds = this.getWFCoreService().getUserIds2(taskEntity.getIdentityLinks());
			}
			if(!StringUtils.hasLength(strUserIds)){
				log.warn("未找到消息通知用户，忽略工作流消息通知回调");
				return null;
			}
			callbackArg.put("notifyusers", strUserIds);
			BpmnModel bpmnModel = getRepositoryService().getBpmnModel(taskEntity.getProcessDefinitionId());
			FlowElement flowElement = bpmnModel.getFlowElement(taskEntity.getTaskDefinitionKey());
			String msgtemplate = FlowableUtils.getElementParam(flowElement, "form", "msg-template");
			String msgtype = FlowableUtils.getElementParam(flowElement, "form", "msg-type");
			if(ObjectUtils.isEmpty(msgtemplate)||ObjectUtils.isEmpty(msgtype)){
				log.warn("未定义消息模板或消息类型，忽略工作流消息通知回调");
				return null;
			}
			callbackArg.put("msgtemplate", msgtemplate);
			callbackArg.put("msgtype", msgtype);
			return this.getCloudWFUtilRuntimeContext().executeWFCallback(strSystemTag, entityName, ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, "wfnotify", callbackArg, String.class, strAppTag);
		}
		return null;
	}

	/**
	 * 工作流回调业务系统
	 *
	 * @param evt
	 */
	protected Object executeWFCallback(FlowableEvent evt, WFInstance wfInstance) {

		ExecutionEntity executionEntity = this.getExecutionEntity(evt);


		String strSystemTag = DataTypeUtils.getStringValue(executionEntity.getVariable("system"), null);
		String strAppTag = DataTypeUtils.getStringValue(executionEntity.getVariable("appname"), null);
		//String strUserId = Authentication.getAuthenticatedUserId();

		// 流程启动
		if (evt instanceof FlowableProcessStartedEvent && ((FlowableProcessStartedEvent) evt).getEntity() instanceof ExecutionEntity) {

			String entity = executionEntity.getVariable("entitys").toString();
			String businessKey = executionEntity.getVariable("businessKey").toString();
			String wfinstfield = getStringValue(executionEntity.getVariable("wfinstfield"));
			String wfstatefield = getStringValue(executionEntity.getVariable("wfstatefield"));
			String udstatefield = getStringValue(executionEntity.getVariable("udstatefield"));
			String wfverfield = getStringValue(executionEntity.getVariable("wfverfield"));
			String udstateingval = getStringValue(executionEntity.getVariable("udstateingval"));

			Map<String, Object> callbackArg = new HashMap<String, Object>();
			if (!ObjectUtils.isEmpty(wfinstfield)) {
				callbackArg.put(wfinstfield, executionEntity.getProcessInstanceId());
			}
			if (!ObjectUtils.isEmpty(wfstatefield)) {
				callbackArg.put(wfstatefield, 1);
			}
			if (!ObjectUtils.isEmpty(udstatefield)) {
				callbackArg.put(udstatefield, udstateingval);
			}
			if ((!ObjectUtils.isEmpty(wfverfield)) && (executionEntity.getVariable("wfversion") != null)) {
				callbackArg.put(wfverfield, Integer.parseInt(executionEntity.getVariable("wfversion").toString()));
			}
			if (callbackArg.size() > 0) {
				if (wfInstance != null) {
					// callbackArg.put(WFConsts.WFINSTANCE,
					// wfCoreService.getInstance(event.getExecution()));
					callbackArg.put(WFConsts.WFINSTANCE, wfInstance);
				}

				callbackArg.put(WFConsts.BUSINESSKEY, businessKey);
				callbackArg.put(Entity.KEY, businessKey);
				// "wfUpdate" ==> wfupdate
				return this.getCloudWFUtilRuntimeContext().executeWFCallback(strSystemTag, entity, ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, "wfupdate", callbackArg, String.class, strAppTag);
				// wfCoreService.executeCallback(entity,"wfUpdate",
				// callbackArg);
			}
			return null;
		}
		// 步骤开始
		else if (evt instanceof FlowableActivityEvent && (evt.getType() == FlowableEngineEventType.ACTIVITY_STARTED ||  evt.getType() == FlowableEngineEventType.MULTI_INSTANCE_ACTIVITY_STARTED ) && ("userTask".equals(((FlowableActivityEvent) evt).getActivityType())|| "callActivity".equals(((FlowableActivityEvent) evt).getActivityType()))) {

			FlowableActivityEvent event = ((FlowableActivityEvent) evt);
			String businessKey = executionEntity.getVariable("businessKey").toString();
			//String entity =  executionEntity.getVariable("entity").toString();
			String entity = this.getEntityName(executionEntity);
			String wfstepField = executionEntity.getVariable("wfstepfield").toString();

			// 工作流回调
			Map<String, Object> callbackArg = new HashMap<String, Object>();
			if (!ObjectUtils.isEmpty(wfstepField) && event.getActivityId().startsWith("tid-")) {
				callbackArg.put(wfstepField, event.getActivityId().split("-")[1]);
				//排除子流程嵌套及活动调用时,相同实体数据对象忽略步骤值设置
				if(executionEntity.getProcessInstanceId() != null && executionEntity.getRootProcessInstance() != null && !executionEntity.getProcessInstanceId().equals(executionEntity.getRootProcessInstanceId())){
					ExecutionEntity rootProcessInstance = executionEntity.getRootProcessInstance();
					String rootBusinessKey = rootProcessInstance.getVariable("businessKey").toString();
					String rootEntity = this.getEntityName(rootProcessInstance);
					if(entity.equals(rootEntity) && businessKey.equals(rootBusinessKey)){
						callbackArg.remove(wfstepField);
					}
				}
			}
			if (callbackArg.size() > 0) {
				if (wfInstance != null) {
					// callbackArg.put(WFConsts.WFINSTANCE,
					// wfCoreService.getInstance(event.getExecution()));
					callbackArg.put(WFConsts.WFINSTANCE, wfInstance);
				}
				callbackArg.put(WFConsts.BUSINESSKEY, businessKey);
				callbackArg.put(Entity.KEY, businessKey);
				// wfCoreService.executeCallback(entity,"wfUpdate",
				// callbackArg);
				// "wfUpdate" ==> wfupdate
				return this.getCloudWFUtilRuntimeContext().executeWFCallback(strSystemTag, entity, ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, "wfupdate", callbackArg, String.class, strAppTag);
			}
			return null;
		}
		// 流程结束
		else if (evt instanceof FlowableEngineEntityEvent && evt.getType() != null && FlowableEngineEventType.PROCESS_COMPLETED == evt.getType()) {
			FlowableEngineEntityEvent event = ((FlowableEngineEntityEvent) evt);
			FlowableEventType eventType = event.getType();
			if (eventType == FlowableEngineEventType.PROCESS_COMPLETED) {
				String businessKey = executionEntity.getVariable("businessKey").toString();
				//String entity = executionEntity.getVariable("entity").toString();
				String entity = this.getEntityName(executionEntity);
				//排除子流程嵌套及活动调用时,相同实体数据对象忽略回调
				if(executionEntity.getProcessInstanceId() != null && executionEntity.getRootProcessInstance() != null && !executionEntity.getProcessInstanceId().equals(executionEntity.getRootProcessInstanceId())){
					ExecutionEntity rootProcessInstance = executionEntity.getRootProcessInstance();
					String rootBusinessKey = rootProcessInstance.getVariable("businessKey").toString();
					String rootEntity = this.getEntityName(rootProcessInstance);
					if(entity.equals(rootEntity) && businessKey.equals(rootBusinessKey)){
						return null;
					}
				}
				Object wffinishval = executionEntity.getVariable("wffinishval");
				if (ObjectUtils.isEmpty(wffinishval)) {
					wffinishval = "30";
				}
				Map<String, Object> callbackArg = new HashMap<String, Object>();
				if (!ObjectUtils.isEmpty(executionEntity.getVariable("udstatefield"))) {
					callbackArg.put(executionEntity.getVariable("udstatefield").toString(), wffinishval);
				}
				//流程结束步骤值置空
				if (!ObjectUtils.isEmpty(executionEntity.getVariable("wfstepfield"))) {
					callbackArg.put(executionEntity.getVariable("wfstepfield").toString(), "");
				}
				if (callbackArg.size() > 0) {
					// callbackArg.put(WFINSTANCE,wfCoreService.getInstance((DelegateExecution)
					// event.getEntity()));
					// callbackArg.put(BUSINESSKEY,businessKey);
					// wfCoreService.executeCallback(entity,"wfUpdate",
					// callbackArg);
					// wfCoreService.executeCallback(entity,"wfFinish",
					// callbackArg);
					if (wfInstance != null) {
						// callbackArg.put(WFConsts.WFINSTANCE,
						// wfCoreService.getInstance(event.getExecution()));
						callbackArg.put(WFConsts.WFINSTANCE, wfInstance);
					}
					callbackArg.put(WFConsts.BUSINESSKEY, businessKey);
					callbackArg.put(Entity.KEY, businessKey);
					// wfCoreService.executeCallback(entity,"wfUpdate",
					// callbackArg);
					this.getCloudWFUtilRuntimeContext().executeWFCallback(strSystemTag, entity, ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, "wfupdate", callbackArg, String.class, strAppTag);
					return this.getCloudWFUtilRuntimeContext().executeWFCallback(strSystemTag, entity, ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, "wffinish", callbackArg, String.class, strAppTag);
				}
			}
			return null;
		}
		// 取消流程，重置wfstate
		else if (evt instanceof FlowableCancelledEvent && FlowableEngineEventType.PROCESS_CANCELLED == evt.getType()) {
			String businessKey = executionEntity.getVariable("businessKey").toString();
			//tring entity = executionEntity.getVariable("entity").toString();
			String entity = this.getEntityName(executionEntity);
			// 回调业务系统，重置工作流状态值
			Map<String, Object> callbackArg = new HashMap<String, Object>();
			if (!ObjectUtils.isEmpty(executionEntity.getVariable("udstatefield"))) {
				Object wfcancelval = executionEntity.getVariable("wfcancelval");
				if (ObjectUtils.isEmpty(wfcancelval)) {
					Object wferrorval = executionEntity.getVariable("wferrorval");
					if (ObjectUtils.isEmpty(wferrorval)) {
						wferrorval = "40";
					}
					wfcancelval = wferrorval;
				}
				callbackArg.put(executionEntity.getVariable("udstatefield").toString(), wfcancelval);
			}
			if (callbackArg.size() > 0) {
				// callbackArg.put(WFINSTANCE,wfCoreService.getInstance(execution));
				// callbackArg.put(BUSINESSKEY,businessKey);
				// wfCoreService.executeCallback(entity,"wfUpdate",
				// callbackArg);

				if (wfInstance != null) {
					// callbackArg.put(WFConsts.WFINSTANCE,
					// wfCoreService.getInstance(event.getExecution()));
					callbackArg.put(WFConsts.WFINSTANCE, wfInstance);
				}
				callbackArg.put(WFConsts.BUSINESSKEY, businessKey);
				callbackArg.put(Entity.KEY, businessKey);
				// wfCoreService.executeCallback(entity,"wfUpdate",
				// callbackArg);
				// "wfUpdate" ==> wfupdate
				return this.getCloudWFUtilRuntimeContext().executeWFCallback(strSystemTag, entity, ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, "wfupdate", callbackArg, String.class, strAppTag);
			}
		}

		return null;
	}

	/**
	 * 更新流程实例信息
	 *
	 * @param evt
	 */
	protected WFInstance updateWFInstance(FlowableEvent evt) {
		// 流程启动
		if (evt instanceof FlowableProcessStartedEvent && ((FlowableProcessStartedEvent) evt).getEntity() instanceof ExecutionEntity) {
			FlowableProcessStartedEvent event = (FlowableProcessStartedEvent) evt;
			ExecutionEntity executionEntity = this.getExecutionEntity(evt);
			String entity = this.getEntityName(executionEntity);

			if (ObjectUtils.isEmpty(executionEntity.getVariable("system")) || ObjectUtils.isEmpty(entity) || ObjectUtils.isEmpty(executionEntity.getVariable("businessKey")) || ObjectUtils.isEmpty(executionEntity.getVariable("appname"))) {
				log.error("获取系统信息失败，未能获取 system 、entity、businessKey、appname 参数");
				// throw new BadRequestException("获取系统信息失败");
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("获取传入系统信息失败"));
			}

			String system = executionEntity.getVariable("system").toString();
			String appId = executionEntity.getVariable("appname").toString();
			String businessKey = executionEntity.getVariable("businessKey").toString();
			//String entity = executionEntity.getVariable("entity").toString();

			// 创建流程实例
			ExecutionEntity pEntity = executionEntity.getParent();
			String rootProcessInstanceId = pEntity.getRootProcessInstance().getProcessInstanceId();
			//区分子流程实例
			if(StringUtils.hasLength(rootProcessInstanceId)&& !rootProcessInstanceId.equals(pEntity.getProcessInstanceId())){
				entity = String.format("%1$s|%2$s",entity,pEntity.getProcessInstanceId());
			}
			IUserContext iUserContext = EmployeeContext.getCurrentMust();
			// AuthenticationUser user = FlowUser.getCurUser().getUser();
			String majortext = getStringValue(executionEntity.getVariable("majortext"));
			if (pEntity != null) {
				WFInstance instance = new WFInstance();
				instance.setProcessDefinitionKey(pEntity.getProcessDefinitionKey());
				instance.setProcessDefinitionName(pEntity.getProcessDefinitionName());
				instance.setName(majortext);
				instance.setStartTime(new Timestamp(System.currentTimeMillis()));
				instance.setRealInstId(pEntity.getProcessInstanceId());
				instance.setDCSystemId(system);
				instance.setAppId(appId);
				instance.setEntityId(entity);
				instance.setBusinessKey(businessKey);
				// instance.setWfstate(StaticDict.WFSta;tes.ITEM_1.getValue());
				instance.setWfstate(String.valueOf(WFStates.NOTFINISH));
				if (iUserContext != null) {
					instance.setStartUserId(iUserContext.getUserid());
					instance.setStartUserName(iUserContext.getUsername());
				}
				// instanceService.save(instance);
				this.saveWFInstance(instance);
				executionEntity.setVariable("wfinstanceid", instance.getId());
				return instance;
			}
		}
		// 步骤开始
		else if (evt instanceof FlowableActivityEvent && evt instanceof FlowableProcessEngineEvent && (evt.getType() == FlowableEngineEventType.ACTIVITY_STARTED ||  evt.getType() == FlowableEngineEventType.MULTI_INSTANCE_ACTIVITY_STARTED ) && ("userTask".equals(((FlowableActivityEvent) evt).getActivityType())|| "callActivity".equals(((FlowableActivityEvent) evt).getActivityType()))) {
			FlowableProcessEngineEvent event = ((FlowableProcessEngineEvent) evt);
			ExecutionEntity executionEntity = this.getExecutionEntity(evt);

			String entity = this.getEntityName(executionEntity);
			ExecutionEntity pEntity = executionEntity.getParent();
			String rootProcessInstanceId = pEntity.getRootProcessInstance().getProcessInstanceId();
			//区分子流程实例
			if(StringUtils.hasLength(rootProcessInstanceId)&& !rootProcessInstanceId.equals(pEntity.getProcessInstanceId())){
				entity = String.format("%1$s|%2$s",entity,pEntity.getProcessInstanceId());
			}
			if (ObjectUtils.isEmpty(executionEntity.getVariable("system")) || ObjectUtils.isEmpty(entity) || ObjectUtils.isEmpty(executionEntity.getVariable("businessKey")) || ObjectUtils.isEmpty(executionEntity.getVariable("appname"))) {
				log.error("获取系统信息失败，未能获取 system 、entity、businessKey、appname 参数");
				// throw new BadRequestException("获取系统信息失败");
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("获取传入系统信息失败"));
			}

			String system = executionEntity.getVariable("system").toString();
			String businessKey = executionEntity.getVariable("businessKey").toString();
			//String entity = executionEntity.getVariable("entity").toString();

			// 更新流程实例（当前步骤）
			WFInstance procInst = new WFInstance();

			procInst.setDCSystemId(system);
			procInst.setEntityId(entity);
			procInst.setBusinessKey(businessKey);
			procInst.setId(getWFInstanceId(system, entity, businessKey));
			procInst.setCurStepId(executionEntity.getActivityId());
			if (executionEntity instanceof ExecutionEntityImpl) {
				procInst.setCurStepName(((ExecutionEntityImpl) executionEntity).getActivityName());
			}

			// procInst.setUpdatedate(new
			// Timestamp(System.currentTimeMillis()));
			// if(curUser.getUser() != null) {
			// procInst.setUpdateman(curUser.getUser().getPersonid());
			// }
			updateWFInstance(procInst);
			return procInst;
		}
		// 流程结束
		else if (evt instanceof FlowableEngineEntityEvent && evt.getType() != null && FlowableEngineEventType.PROCESS_COMPLETED == evt.getType()) {
			FlowableEngineEntityEvent event = ((FlowableEngineEntityEvent) evt);
			FlowableEventType eventType = event.getType();
			if (eventType == FlowableEngineEventType.PROCESS_COMPLETED) {
				ExecutionEntity executionEntity = (ExecutionEntity) event.getEntity();

				String entity = this.getEntityName(executionEntity);
				ExecutionEntity pEntity = executionEntity.getRootProcessInstance();
				String rootProcessInstanceId = pEntity.getProcessInstanceId();
				//区分子流程实例
				if(StringUtils.hasLength(rootProcessInstanceId)&& !rootProcessInstanceId.equals(executionEntity.getProcessInstanceId())){
					entity = String.format("%1$s|%2$s",entity,executionEntity.getProcessInstanceId());
				}
				if (ObjectUtils.isEmpty(executionEntity.getVariable("system")) || ObjectUtils.isEmpty(entity) || ObjectUtils.isEmpty(executionEntity.getVariable("businessKey")) || ObjectUtils.isEmpty(executionEntity.getVariable("appname"))) {
					log.error("获取系统信息失败，未能获取 system 、entity、businessKey、appname 参数");
					// throw new BadRequestException("获取系统信息失败");
					throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("获取传入系统信息失败"));
				}

				String system = executionEntity.getVariable("system").toString();
				String businessKey = executionEntity.getVariable("businessKey").toString();
				//String entity = executionEntity.getVariable("entity").toString();

				// 更新流程实例
				WFInstance procInst = new WFInstance();
				procInst.setDCSystemId(system);
				procInst.setEntityId(entity);
				procInst.setBusinessKey(businessKey);
				procInst.setId(getWFInstanceId(system, entity, businessKey));
				// procInst.setWfstate(StaticDict.WFStates.ITEM_2.getValue());
				procInst.setEndTime(new Timestamp(System.currentTimeMillis()));
				// procInst.setUpdatedate(new
				// Timestamp(System.currentTimeMillis()));
				procInst.setCurStepId(null);
				procInst.setCurStepName(null);
				// if (user != null) {
				// procInst.setUpdateman(user.getPersonid());
				// }
				// if (!ObjectUtils.isEmpty(procInst.getId())) {
				// instanceService.update(procInst);
				// }
				updateWFInstance(procInst);
				return procInst;
			}
		}

		return null;
	}

	/**
	 * 创建统一待办
	 * @param evt
	 * @return
	 */
	protected void saveTodo(FlowableEvent evt){

	}

	protected void saveWFInstance(WFInstance wfInstance) {

	}

	protected void updateWFInstance(WFInstance wfInstance) {

	}

	protected String getEntityName(ExecutionEntity executionEntity) {
		Object objEntity = executionEntity.getVariable("entity");
		if(objEntity == null) {
			objEntity = executionEntity.getVariable("entitys");
		}
		if(objEntity != null) {
			return objEntity.toString();
		}
		return null;
	}

	/**
	 * 字符串处理
	 *
	 * @param value
	 * @return
	 */
	private String getStringValue(Object value) {
		if (ObjectUtils.isEmpty(value)) {
			return null;
		}
		return value.toString();
	}

	protected String getWFInstanceId(String strDCSystemId, String strEntity, String strBusinessKey) {
		return DigestUtils.md5DigestAsHex(String.format("%s||%s||%s", strDCSystemId, strEntity, strBusinessKey).getBytes());
	}

	@Override
	public boolean isFailOnException() {
		return true;// 如果是false，onEvent方法里报的异常都将忽略
	}

}