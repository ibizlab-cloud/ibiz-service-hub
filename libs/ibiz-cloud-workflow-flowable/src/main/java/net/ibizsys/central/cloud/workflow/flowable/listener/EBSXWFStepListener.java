package net.ibizsys.central.cloud.workflow.flowable.listener;

import org.flowable.bpmn.constants.BpmnXMLConstants;
import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.UserTask;
import org.flowable.common.engine.api.delegate.event.FlowableEngineEventType;
import org.flowable.common.engine.api.delegate.event.FlowableEntityEvent;
import org.flowable.common.engine.api.delegate.event.FlowableEvent;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.event.AbstractFlowableEngineEventListener;
import org.flowable.engine.delegate.event.FlowableActivityEvent;
import org.flowable.engine.delegate.event.FlowableProcessEngineEvent;
import org.flowable.engine.impl.persistence.entity.HistoricActivityInstanceEntity;
import org.flowable.task.service.impl.persistence.entity.HistoricTaskInstanceEntity;
import org.flowable.task.service.impl.persistence.entity.TaskEntityImpl;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoDTO;
import net.ibizsys.central.cloud.workflow.core.addin.ICloudWFUtilRTAddin;
import net.ibizsys.central.cloud.workflow.core.cloudutil.ICloudWFUtilRuntimeContext;
import net.ibizsys.central.cloud.workflow.core.util.WFConsts;
import net.ibizsys.central.cloud.workflow.flowable.cloudutil.ICloudFlowableUtilRuntime;
import net.ibizsys.central.cloud.workflow.flowable.util.WFCoreService;
import net.ibizsys.runtime.SystemRuntimeException;

/**
 * 流程步骤监听器，切换步骤时，记录步骤操作者，用于流程撤回
 */

public class EBSXWFStepListener extends AbstractFlowableEngineEventListener implements ICloudWFUtilRTAddin {

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

	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudFlowableUtilRuntime().getSystemRuntime();
	}

	protected ICloudFlowableUtilRuntime getCloudFlowableUtilRuntime() {
		return this.iCloudFlowableUtilRuntime;
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

	protected RuntimeService getRuntimeService() {
		return this.getCloudFlowableUtilRuntime().getProcessEngine().getRuntimeService();
	}

	// @Autowired
	// ISysTodoService todoService;

	// @Value("${ibiz.wf.dynainsttag.enable:false}")
	String enableDynaInstTag;

	// @Value("${ibiz.wf.withdraw.ignore.stepid:}")
	String ignoreStepId;

	@Override
	public void onEvent(FlowableEvent evt) {

		// 存储当前步骤的操作用户（用于流程撤回）
		if (evt instanceof FlowableProcessEngineEvent && evt.getType() == FlowableEngineEventType.ACTIVITY_STARTED && "userTask".equals(((FlowableActivityEvent) evt).getActivityType())) {
			DelegateExecution parentDelegateExecution = getDelegateExecution(evt, false).getParent();
			if(parentDelegateExecution == null || !parentDelegateExecution.isMultiInstanceRoot()){
				DelegateExecution execution = ((FlowableProcessEngineEvent) evt).getExecution();
				FlowElement element = execution.getCurrentFlowElement();
				if (element != null && element instanceof UserTask && (ObjectUtils.isEmpty(ignoreStepId) || !ignoreStepId.contains(element.getId()))) {
					getWFCoreService().saveWFStepUser(execution);
				}
			}
		}
		// 准备流程步骤标识（用于流程撤回）
		else if (evt.getType() == FlowableEngineEventType.HISTORIC_ACTIVITY_INSTANCE_CREATED && evt instanceof FlowableEntityEvent) {
			FlowableEntityEvent entity = (FlowableEntityEvent) evt;
			HistoricActivityInstanceEntity hiEntity = (HistoricActivityInstanceEntity) entity.getEntity();
			if (BpmnXMLConstants.ELEMENT_TASK_USER.equals(hiEntity.getActivityType()) && (ObjectUtils.isEmpty(ignoreStepId) || !ignoreStepId.contains(hiEntity.getActivityId()))) {
				getRuntimeService().setVariableLocal(hiEntity.getExecutionId(), "actInstId", hiEntity.getId());
			}
		}
		// 待办历史数据增加动态实例标记（dynainsttag、dynainsttag2)，用于副本待办查询
		else if (evt.getType() == FlowableEngineEventType.ENTITY_CREATED && evt instanceof FlowableEntityEvent && ((FlowableEntityEvent) evt).getEntity() instanceof HistoricTaskInstanceEntity) {
			// 是否启用动态实例标记
			if (Boolean.valueOf(enableDynaInstTag)) {
				FlowableEntityEvent event = ((FlowableEntityEvent) evt);
				HistoricTaskInstanceEntity taskEntity = (HistoricTaskInstanceEntity) event.getEntity();

				// 存储动态实例标记，用于查询副本的待办
				if (!ObjectUtils.isEmpty(taskEntity.getExecutionId())) {
					Object dynaInstTag = getRuntimeService().getVariable(taskEntity.getExecutionId(), WFConsts.DYNAINST_TAG);
					Object dynaInstTag2 = getRuntimeService().getVariable(taskEntity.getExecutionId(), WFConsts.DYNAINST_TAG2);
					if (!ObjectUtils.isEmpty(dynaInstTag))
						taskEntity.setScopeId(dynaInstTag.toString());

					if (!ObjectUtils.isEmpty(dynaInstTag2))
						taskEntity.setSubScopeId(dynaInstTag2.toString());
				}
			}
		}
		// 当工作流任务取消时，同步删除todo任务（用于：all|role:any、流程撤回、回退等）
		else if (evt.getType() == FlowableEngineEventType.ENTITY_DELETED && evt instanceof FlowableEntityEvent) {
			FlowableEntityEvent event = (FlowableEntityEvent) evt;
			if (event.getEntity() != null && event.getEntity() instanceof TaskEntityImpl) {
				TaskEntityImpl taskEntity = (TaskEntityImpl) event.getEntity();
				// 非正常提交 或者 撤回、抄送等自定义Task
				if (!WFConsts.TASK_COMPLETE.equals(taskEntity.getVariable(WFConsts.WF_TAG)) && ObjectUtils.isEmpty(taskEntity.getScopeType())) {
					TodoDTO todo = new TodoDTO();
					todo.setParam01(taskEntity.getId());
					try {
						EBSXSystemRuntime.getInstance().getTodoService().cancel(todo);
					}
					catch (Throwable ex) {
						throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("取消待办发生异常，%1$s", ex.getMessage()), ex);
					}
				}
			}
		}
	}

	

	@Override
	public boolean isFailOnException() {
		return true;// 如果是false，onEvent方法里报的异常都将忽略
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

}