package net.ibizsys.central.cloud.workflow.flowable.listener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.workflow.core.util.enums.WFUtilAction;
import net.ibizsys.central.cloud.workflow.flowable.util.FlowableUtils;
import net.ibizsys.central.util.SearchContextDTO;
import org.flowable.bpmn.model.UserTask;
import org.flowable.common.engine.api.delegate.event.*;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.event.*;
import org.flowable.engine.impl.persistence.entity.ExecutionEntity;
import org.flowable.task.api.Task;
import org.flowable.task.service.impl.persistence.entity.TaskEntity;

import net.ibizsys.central.cloud.core.cloudutil.ICloudWFUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoDTO;
import net.ibizsys.central.cloud.workflow.core.util.WFConsts;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import org.springframework.util.ObjectUtils;


public class EBSXWFRollbackListener extends EBSXWFInstanceListener {

    protected static ThreadLocal<Stack<ExecutionEntity>> executionEntityStack = new ThreadLocal<>();

    public static void pushRollBackEntity(ExecutionEntity entity) {
        if(executionEntityStack.get() == null){
            executionEntityStack.set(new Stack<>());
        }
        executionEntityStack.get().push(entity);
    }

    public static ExecutionEntity popRollBackEntity() {
        if(executionEntityStack.get() == null){
            return null;
        }
        return executionEntityStack.get().pop();
    }

    public static void flushRollBackEntity() {
        executionEntityStack.remove();
    }

    public EBSXWFRollbackListener() {

    }

    @Override
    public void onEvent(FlowableEvent evt) {
        // 流程启动
        if (evt instanceof FlowableProcessStartedEvent && ((FlowableProcessStartedEvent) evt).getEntity() instanceof ExecutionEntity) {
            RollbackTodo(evt);
            this.executeWFCallbackRollBack(evt, null);
        } else if (evt instanceof FlowableEngineEntityEvent && FlowableEngineEventType.TASK_CREATED == evt.getType()) {
            RollbackTodo(evt);
        } else if (evt instanceof FlowableEntityWithVariablesEvent && FlowableEngineEventType.TASK_COMPLETED == evt.getType()) {
            RollbackTodo(evt);
        } else if (evt instanceof FlowableActivityEvent && (evt.getType() == FlowableEngineEventType.ACTIVITY_STARTED || evt.getType() == FlowableEngineEventType.MULTI_INSTANCE_ACTIVITY_STARTED ) && ("userTask".equals(((FlowableActivityEvent) evt).getActivityType()) || "callActivity".equals(((FlowableActivityEvent) evt).getActivityType()))) {
            this.executeWFCallbackRollBack(evt, null);
        } else if (evt instanceof FlowableActivityEvent && evt.getType() != null && (FlowableEngineEventType.ACTIVITY_COMPLETED == evt.getType() || FlowableEngineEventType.MULTI_INSTANCE_ACTIVITY_COMPLETED == evt.getType())  && ((FlowableProcessEngineEvent) evt).getExecution().getCurrentFlowElement() instanceof UserTask) {
            RollbackTodo(evt);
        }else if (evt instanceof FlowableEngineEntityEvent && evt.getType() != null && FlowableEngineEventType.PROCESS_COMPLETED == evt.getType()) {
            this.executeWFCallbackRollBack(evt, null);
        }else if (evt instanceof FlowableCancelledEvent && FlowableEngineEventType.PROCESS_CANCELLED == evt.getType()) {
            try {
                this.executeWFCallbackRollBack(evt, null);
            }catch (Exception e){
                throw new RuntimeException(e.getMessage());
            } finally {
                //清空线程变量
                flushRollBackEntity();
            }
        }
    }

    /**
     * 回滚统一待办
     *
     * @param evt
     * @return
     */
    protected void RollbackTodo(FlowableEvent evt){
        //流程启动
        if (evt instanceof FlowableProcessStartedEvent && ((FlowableProcessStartedEvent) evt).getEntity() instanceof ExecutionEntity) {
            FlowableProcessStartedEvent event = (FlowableProcessStartedEvent) evt;
            ExecutionEntity executionEntity = (ExecutionEntity) event.getEntity();
            String businessKey = executionEntity.getVariable("businessKey").toString();
            String processInstanceId = executionEntity.getProcessInstanceId();
            try {
                SearchContextDTO dtx = new SearchContextDTO();
                dtx.eq("bizkey",businessKey).eq("param09",processInstanceId);
                EBSXSystemRuntime.getInstance().getTodoHisService().remove(dtx);
            } catch (Throwable e) {
                throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("监听流程启动任务回滚事件发生异常，%1$s", e.getMessage()));
            }
            //生成待办
        } else if (evt != null && evt.getType().equals(FlowableEngineEventType.TASK_CREATED)) {
            FlowableEntityEvent event = ((FlowableEntityEvent) evt);
            TaskEntity taskEntity = (TaskEntity) event.getEntity();
            //辅助功能任务不同步至todo
            if(!ObjectUtils.isEmpty(taskEntity.getScopeType())){
                WFUtilAction procFunc = WFUtilAction.valueOf(taskEntity.getScopeType());
                if(procFunc != null){
                    return;
                }
            }
            try {
                //删除todo
                SearchContextDTO dtx = new SearchContextDTO();
                dtx.eq("bizkey",taskEntity.getCategory()).eq("param01",taskEntity.getId());
                EBSXSystemRuntime.getInstance().getTodoService().remove(dtx);
            } catch (Throwable e) {
                throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("监听生成待办任务回滚事件发生异常，%1$s", e.getMessage()));
            }
            //提交待办
        }else if (evt instanceof FlowableEntityWithVariablesEvent && FlowableEngineEventType.TASK_COMPLETED == evt.getType()) {
            FlowableEntityWithVariablesEvent event = (FlowableEntityWithVariablesEvent) evt;
            TaskEntity taskEntity = (TaskEntity) event.getEntity();
            try {
//                Todo todo = this.getTodo(taskEntity);
                TodoDTO todoDTO = new TodoDTO();
                todoDTO.setParam01(taskEntity.getId());
                todoDTO.setParam09(taskEntity.getProcessInstanceId());
//                todo.copyTo(todoDTO);
                EBSXSystemRuntime.getInstance().getTodoService().rollback(todoDTO);
            } catch (Throwable e) {
                throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("还原待办任务发生异常，%1$s", e.getMessage()));
            }
            //步骤结束
        } else if (evt instanceof FlowableActivityEvent && evt.getType() != null && FlowableEngineEventType.ACTIVITY_COMPLETED == evt.getType() && evt instanceof FlowableProcessEngineEvent && ((FlowableProcessEngineEvent) evt).getExecution().getCurrentFlowElement() instanceof UserTask) {
            FlowableActivityEvent event = ((FlowableActivityEvent) evt);
            DelegateExecution delegateExecution = getDelegateExecution(event, false);
            UserTask userTask = (UserTask) delegateExecution.getCurrentFlowElement();
            String procFunc = FlowableUtils.getElementParam(userTask, "form", "procfunc");

            if (!ObjectUtils.isEmpty(procFunc) && procFunc.contains("sendcopy")) {
                String sendCopyRoles = FlowableUtils.getElementParam(userTask, "form", "senduser");
                if (!ObjectUtils.isEmpty(sendCopyRoles)) {
                    String sendCopyUsers = this.getWFCoreService().getGroupUsers(sendCopyRoles, delegateExecution);
                    if (!ObjectUtils.isEmpty(sendCopyUsers)) {
                        // 获取当前节点任务
                        List<Task> tasks = getTaskService().createTaskQuery().processInstanceId(event.getProcessInstanceId()).list();
                        if (ObjectUtils.isEmpty(tasks)) {
                            throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("未能获取到运行任务"));
                        }
                        Task task = tasks.get(0);
                        // 生成抄送任务
                        SearchContextDTO ctx = new SearchContextDTO();
                        ctx.eq("bizkey",task.getCategory()).eq("param01",task.getId());
                        try {
                            EBSXSystemRuntime.getInstance().getCarbonCopyService().remove(ctx);
                        } catch (Throwable e) {
                            throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("监听步骤结束事件回滚发生异常，%1$s", e.getMessage()));
                        }
                    }
                }
            }
        }
    }

    /**
     * 工作流回调业务系统（回滚）
     *
     * @param evt
     */
    protected Object executeWFCallbackRollBack(FlowableEvent evt, WFInstance wfInstance) {
        ExecutionEntity executionEntity = this.getExecutionEntity(evt);
        String strSystemTag = DataTypeUtils.getStringValue(executionEntity.getVariable("system"), null);
        String strAppTag = DataTypeUtils.getStringValue(executionEntity.getVariable("appname"), null);
        String businessKey = executionEntity.getVariable("businessKey").toString();
        // 流程启动
        if (evt instanceof FlowableProcessStartedEvent && ((FlowableProcessStartedEvent) evt).getEntity() instanceof ExecutionEntity) {
            String entity = executionEntity.getVariable("entitys").toString();
            String wfInstField = DataTypeUtils.getStringValue(executionEntity.getVariable("wfinstfield"), null);
            String wfStateField = DataTypeUtils.getStringValue(executionEntity.getVariable("wfstatefield"), null);
            String udStateField = DataTypeUtils.getStringValue(executionEntity.getVariable("udstatefield"), null);
            Object variable = executionEntity.getVariable(WFConsts.ACTIVEDATA);
            Map<String, Object> callbackArg = new HashMap<>();
            if (!ObjectUtils.isEmpty(wfInstField)) {
                callbackArg.put(wfInstField, "");
            }
            if (!ObjectUtils.isEmpty(wfStateField)) {
                callbackArg.put(wfStateField, "");
            }
            //获取原来的状态值，回调给业务系统。
            if (!ObjectUtils.isEmpty(udStateField)) {
                Object object1 = ((Map) variable).get(udStateField);
                callbackArg.put(udStateField, ObjectUtils.isEmpty(object1) ? "" : String.valueOf(object1));
            }
            if (callbackArg.size() > 0) {
                if (wfInstance != null) {
                    callbackArg.put(WFConsts.WFINSTANCE, "");
                }
                callbackArg.put(WFConsts.BUSINESSKEY, businessKey);
                callbackArg.put(Entity.KEY, businessKey);
                return this.getCloudWFUtilRuntimeContext().executeWFCallback(strSystemTag, entity, ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, "wfrollback", callbackArg, String.class, strAppTag);
            }
            return null;
        }
        // 步骤开始
        else if (evt instanceof FlowableActivityEvent && (evt.getType() == FlowableEngineEventType.ACTIVITY_STARTED || evt.getType() == FlowableEngineEventType.MULTI_INSTANCE_ACTIVITY_STARTED ) && ( "userTask".equals(((FlowableActivityEvent) evt).getActivityType()) || "callActivity".equals(((FlowableActivityEvent) evt).getActivityType()))) {
            FlowableActivityEvent event = ((FlowableActivityEvent) evt);
            String entity = this.getEntityName((DelegateExecution) executionEntity);
            String wfStepField = executionEntity.getVariable("wfstepfield").toString();
            // 工作流回调
            Map<String, Object> callbackArg = new HashMap<>();
            if (!ObjectUtils.isEmpty(wfStepField) && event.getActivityId().startsWith("tid-")) {
                Map originalPersistentState = (Map) executionEntity.getOriginalPersistentState();
                String activityId = (String) originalPersistentState.get("activityId");
                callbackArg.put(wfStepField, ObjectUtils.isEmpty(activityId) ? "" : activityId.split("-")[1]);
            }
            if (callbackArg.size() > 0) {
                if (wfInstance != null) {
                    callbackArg.put(WFConsts.WFINSTANCE, wfInstance);
                }
                callbackArg.put(WFConsts.BUSINESSKEY, businessKey);
                callbackArg.put(Entity.KEY, businessKey);
                return this.getCloudWFUtilRuntimeContext().executeWFCallback(strSystemTag, entity, ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, "wfrollback", callbackArg, String.class, strAppTag);
            }
            return null;
        }
        // 流程结束
        else if (evt instanceof FlowableEngineEntityEvent && evt.getType() != null && FlowableEngineEventType.PROCESS_COMPLETED == evt.getType()) {
            FlowableEngineEntityEvent event = ((FlowableEngineEntityEvent) evt);
            FlowableEventType eventType = event.getType();
            Object variable = executionEntity.getVariable(WFConsts.ACTIVEDATA);
            if (eventType == FlowableEngineEventType.PROCESS_COMPLETED) {
                String wfStepField = executionEntity.getVariable("wfstepfield").toString();
                String entity = this.getEntityName((DelegateExecution) executionEntity);
                Map<String, Object> callbackArg = new HashMap<String, Object>();
                Object udStateField = executionEntity.getVariable("udstatefield");
                if (!ObjectUtils.isEmpty(udStateField)) {
                    Object object1 = ((Map) variable).get(udStateField);
                    callbackArg.put(udStateField.toString(), ObjectUtils.isEmpty(object1) ? "" : String.valueOf(object1));
                }
                if (callbackArg.size() > 0) {
                    if (wfInstance != null) {
                        callbackArg.put(WFConsts.WFINSTANCE, wfInstance);
                    }
                    callbackArg.put(WFConsts.BUSINESSKEY, businessKey);
                    callbackArg.put(Entity.KEY, businessKey);
                    Object object2 = ((Map) variable).get(wfStepField);
                    callbackArg.put(wfStepField,ObjectUtils.isEmpty(object2) ? "" : String.valueOf(object2) );
                    return this.getCloudWFUtilRuntimeContext().executeWFCallback(strSystemTag, entity, ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, "wfrollback", callbackArg, String.class, strAppTag);
                }
            }
            return null;
        }
        // 取消流程，重置wfstate
        else if (evt instanceof FlowableCancelledEvent && FlowableEngineEventType.PROCESS_CANCELLED == evt.getType()) {
            String entity = this.getEntityName((DelegateExecution) executionEntity);
            // 回调业务系统，重置工作流状态值
            Map<String, Object> callbackArg = new HashMap<>();
            String udStateField = DataTypeUtils.getStringValue(executionEntity.getVariable("udstatefield"),null);
            String udStateingVal = DataTypeUtils.getStringValue(executionEntity.getVariable("udstateingval"),null);
            if (!ObjectUtils.isEmpty(udStateField)) {
                callbackArg.put(executionEntity.getVariable("udstatefield").toString(), udStateingVal);
            }
            if (callbackArg.size() > 0) {
                if (wfInstance != null) {
                    callbackArg.put(WFConsts.WFINSTANCE, wfInstance);
                }
                callbackArg.put(WFConsts.BUSINESSKEY, businessKey);
                callbackArg.put(Entity.KEY, businessKey);
                return this.getCloudWFUtilRuntimeContext().executeWFCallback(strSystemTag, entity, ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, "wfrollback", callbackArg, String.class, strAppTag);
            }
        }
        return null;
    }

    @Override
    protected ExecutionEntity getExecutionEntity(FlowableEvent evt) {
        ExecutionEntity executionEntity;
        if (evt instanceof FlowableEntityEvent) {
            executionEntity = (ExecutionEntity) ((FlowableEntityEvent) evt).getEntity();
            if (executionEntity != null) {
                return executionEntity;
            }
        }
        if (evt instanceof FlowableProcessEngineEvent) {
            executionEntity = (ExecutionEntity) ((FlowableProcessEngineEvent) evt).getExecution();
            if (executionEntity != null) {
                return executionEntity;
            }
        }
        throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("上下文数据对象无效"));
    }
}
