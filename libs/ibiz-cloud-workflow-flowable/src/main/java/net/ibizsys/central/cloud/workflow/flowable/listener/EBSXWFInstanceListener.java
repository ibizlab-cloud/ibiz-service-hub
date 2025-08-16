package net.ibizsys.central.cloud.workflow.flowable.listener;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.central.cloud.core.util.domain.TodoState;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFDefinitionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFInstanceDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFInstanceService;
import net.ibizsys.central.cloud.workflow.core.util.WFConsts;
import net.ibizsys.central.cloud.workflow.core.util.enums.WFUtilAction;
import net.ibizsys.central.cloud.workflow.flowable.util.FlowableUtils;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import org.apache.commons.logging.LogFactory;
import org.flowable.bpmn.model.UserTask;
import org.flowable.common.engine.api.delegate.event.FlowableEngineEventType;
import org.flowable.common.engine.api.delegate.event.FlowableEntityEvent;
import org.flowable.common.engine.api.delegate.event.FlowableEvent;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.event.FlowableActivityEvent;
import org.flowable.engine.delegate.event.FlowableEntityWithVariablesEvent;
import org.flowable.engine.delegate.event.FlowableProcessEngineEvent;
import org.flowable.engine.delegate.event.FlowableProcessStartedEvent;
import org.flowable.engine.impl.persistence.entity.ExecutionEntity;
import org.flowable.engine.impl.persistence.entity.ExecutionEntityImpl;
import org.flowable.identitylink.service.impl.persistence.entity.IdentityLinkEntity;
import org.flowable.task.api.Task;
import org.flowable.task.service.impl.persistence.entity.TaskEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.util.*;

public class EBSXWFInstanceListener extends WFInstanceListener {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(EBSXWFInstanceListener.class);

    // @Value("${ibiz.wf.systodo.extparam:urgency}")
    private String extParams;

    // @Value("${ibiz.wf.dynainsttag.enable:false}")
    String enableDynaInstTag;

    public EBSXWFInstanceListener() {

    }

    @Override
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

    @Override
    protected void saveWFInstance(WFInstance wfInstance) {
        WFInstanceDTO wfProcessInstanceDTO = new WFInstanceDTO();
        wfInstance.copyTo(wfProcessInstanceDTO);
        try {
            EBSXSystemRuntime.getInstance().getWFInstanceService().save(wfProcessInstanceDTO);
        } catch (Throwable ex) {
            throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("保存工作流实例发生异常，%1$s", ex.getMessage()), ex);
        }
    }

    @Override
    protected void updateWFInstance(WFInstance wfInstance) {
        WFInstanceDTO wfProcessInstanceDTO = new WFInstanceDTO();
        wfInstance.copyTo(wfProcessInstanceDTO);
        try {
            EBSXSystemRuntime.getInstance().getWFInstanceService().update(wfProcessInstanceDTO);
        } catch (Throwable ex) {
            throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("更新工作流实例发生异常，%1$s", ex.getMessage()), ex);
        }
    }

    /**
     * 创建统一待办
     *
     * @param evt
     * @return
     */
    protected void saveTodo(FlowableEvent evt) {

        IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();

        if (evt instanceof FlowableProcessStartedEvent && ((FlowableProcessStartedEvent) evt).getEntity() instanceof ExecutionEntity) {

            FlowableProcessStartedEvent event = (FlowableProcessStartedEvent) evt;
            ExecutionEntity executionEntity = (ExecutionEntity) event.getEntity();
            String entityName = executionEntity.getVariable("entitys").toString();
            String businessKey = executionEntity.getVariable("businessKey").toString();
            String processDefKey = DataTypeUtils.getStringValue(executionEntity.getVariable("processdefkey"), null);
            String processDefName = DataTypeUtils.getStringValue(executionEntity.getVariable("processdefname"), null);
            String processBusinessKey = DataTypeUtils.getStringValue(executionEntity.getVariable("processbusinesskey"), null);
            String majortext = DataTypeUtils.getStringValue(executionEntity.getVariable("majortext"), null);

            // 添加启动流程历史记录
            Todo todoHis = new Todo();
            todoHis.setTitle(majortext);
            todoHis.setTodoType(WFConsts.TPS_WFTASK);
            todoHis.setUserId(employeeContext.getUserid());
            todoHis.setBizKey(businessKey);
            todoHis.setBizType(entityName);
            todoHis.setParam02(processDefKey);
            todoHis.setParam03(executionEntity.getActivityId());
            todoHis.setParam04(processDefName);
            todoHis.setDCSystemId(employeeContext.getDcsystemid());
            todoHis.setOrgId(employeeContext.getOrgid());
            todoHis.setParam09(executionEntity.getProcessInstanceId());

            if (executionEntity instanceof ExecutionEntityImpl) {
                todoHis.setParam05(((ExecutionEntityImpl) executionEntity).getActivityName());
            }
            todoHis.setClobParam01(processBusinessKey);

            todoHis.setProcessDate(new Timestamp(System.currentTimeMillis()));
            // todoHis.setTodoState(StaticDict.CodeListTodoState.COMPLETED.getValue());
            todoHis.setTodoState(TodoState.COMPLETED.getValue());

            this.getCloudWFUtilRuntimeContext().createTodo(new Todo[] {todoHis});

        } else if (evt != null && evt.getType().equals(FlowableEngineEventType.TASK_CREATED)) {
            FlowableEntityEvent event = ((FlowableEntityEvent) evt);
            TaskEntity taskEntity = (TaskEntity) event.getEntity();
            //辅助功能任务不同步至todo
            if(!StringUtils.isEmpty(taskEntity.getScopeType())){
                WFUtilAction procFunc = WFUtilAction.valueOf(taskEntity.getScopeType());
                if(procFunc != null){
                    return;
                }
            }

            //同步创建todo
            this.getCloudWFUtilRuntimeContext().createTodo(new Todo[] {getTodo(taskEntity)});

        } else if (evt instanceof FlowableEntityWithVariablesEvent && FlowableEngineEventType.TASK_COMPLETED == evt.getType()) {

            FlowableEntityWithVariablesEvent event = (FlowableEntityWithVariablesEvent) evt;
            TaskEntity taskEntity = (TaskEntity) event.getEntity();

            // 提交todo任务
            TodoDTO todo = new TodoDTO();
            todo.setParam01(taskEntity.getId());
            todo.setUserId(employeeContext.getUserid());
            todo.setParam09(taskEntity.getProcessInstanceId());
            try {

                // todoService.complete(todo);
                EBSXSystemRuntime.getInstance().getTodoService().complete(todo);
            } catch (Throwable ex) {
                throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("完成待办发生异常，%1$s", ex.getMessage()), ex);
            }

        } else if (evt instanceof FlowableActivityEvent && evt.getType() != null && (FlowableEngineEventType.ACTIVITY_COMPLETED == evt.getType() || FlowableEngineEventType.MULTI_INSTANCE_ACTIVITY_COMPLETED == evt.getType()) && evt instanceof FlowableProcessEngineEvent && ((FlowableProcessEngineEvent) evt).getExecution().getCurrentFlowElement() instanceof UserTask) {
            FlowableActivityEvent event = ((FlowableActivityEvent) evt);
            DelegateExecution delegateExecution = getDelegateExecution(event, false);

            // Object entityName = event.getExecution().getVariable("entitys");
            Object entityName = this.getEntityName(delegateExecution);// delegateExecution.getVariable("entity");

            UserTask userTask = (UserTask) delegateExecution.getCurrentFlowElement();
            String procFunc = FlowableUtils.getElementParam(userTask, "form", "procfunc");
            String dcsystem = DataTypeUtils.getStringValue(delegateExecution.getVariable("dcsystem"), null);

            if (!ObjectUtils.isEmpty(procFunc) && procFunc.contains("sendcopy")) {
                String sendCopyRoles = FlowableUtils.getElementParam(userTask, "form", "senduser");
                if (!ObjectUtils.isEmpty(sendCopyRoles)) {
                    String sendCopyUsers = this.getWFCoreService().getGroupUsers(sendCopyRoles, delegateExecution);
                    if (!ObjectUtils.isEmpty(sendCopyUsers)) {
                        Set<String> sendCopyUserIds = new HashSet<>(Arrays.asList(sendCopyUsers.split(",")));
                        // 获取当前节点任务
                        List<Task> tasks = getTaskService().createTaskQuery().processInstanceId(event.getProcessInstanceId()).list();
                        if (ObjectUtils.isEmpty(tasks)) {
                            // log.error("未能获取到运行任务，event.getProcessInstanceId()={}",
                            // event.getProcessInstanceId());
                            log.error(String.format("未能获取到运行任务，event.getProcessInstanceId()=%1$s", event.getProcessInstanceId()));
                            // throw new
                            // BadRequestAlertException("未能获取到[%s]运行任务", "",
                            // "");
                            throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("未能获取到运行任务"));
                        }

                        String strUserIds = String.join(";", sendCopyUserIds);
                        Task task = tasks.get(0);
                        String processDefKey = DataTypeUtils.getStringValue(delegateExecution.getVariable("processdefkey"), null);
                        String processBusinessKey = DataTypeUtils.getStringValue(delegateExecution.getVariable("processbusinesskey"), null);

                        // 生成抄送任务
                        this.getWFCoreService().saveSendCopyTask(task.getDescription(), dcsystem, strUserIds, task.getCategory(), String.valueOf(entityName), task.getId(), processDefKey, task.getTaskDefinitionKey(), null, null, processBusinessKey);
                    }
                }
            }
        }

    }

    protected String getEntityName(TaskEntity taskEntity) {
        Object objEntity = taskEntity.getVariable("entity");
        if (objEntity == null) {
            objEntity = taskEntity.getVariable("entitys");
        }
        if (objEntity != null) {
            return objEntity.toString();
        }
        return null;
    }

    protected String getEntityName(DelegateExecution delegateExecution) {
        Object objEntity = delegateExecution.getVariable("entity");
        if (objEntity == null) {
            objEntity = delegateExecution.getVariable("entitys");
        }
        if (objEntity != null) {
            return objEntity.toString();
        }
        return null;
    }

    /**
     * 创建todo对象
     * @param taskEntity
     * @return
     */
    protected Todo getTodo(TaskEntity taskEntity) {

        IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
        Object entityName = this.getEntityName(taskEntity);
        Map activeData = (Map) taskEntity.getVariable(WFConsts.ACTIVEDATA);
        String taskDefinitionKey = taskEntity.getTaskDefinitionKey();
        String processDefKey = DataTypeUtils.getStringValue(taskEntity.getVariable("processdefkey"), null);
        String processDefName = DataTypeUtils.getStringValue(taskEntity.getVariable("processdefname"), null);
        String processBusinessKey = DataTypeUtils.getStringValue(taskEntity.getVariable("processbusinesskey"), null);
        String userTag = DataTypeUtils.getStringValue(taskEntity.getVariable(taskDefinitionKey), null);

        String strUserIds = null;
        List<IdentityLinkEntity> links = taskEntity.getIdentityLinks();
        if(!ObjectUtils.isEmpty(links)){
            strUserIds = this.getWFCoreService().getUserIds2(taskEntity.getIdentityLinks());
        }
        if(!StringUtils.hasLength(strUserIds)){
            throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("工作流操作失败，无法获取[%1$s]步骤用户",taskEntity.getName()));
        }

        Todo todo = new Todo();
        // todo.setSrfdcid(employeeContext.getTenant());
        todo.setOrgId(employeeContext.getOrgid());
        todo.setDCSystemId(employeeContext.getDcsystemid());
        String strRealInstid = taskEntity.getProcessInstanceId();
        try {
            //确保dcsystem标识标识为流程所在dcsystem标识
            if(StringUtils.hasLength(strRealInstid)) {
                ISearchContextDTO searchContextDTO = new SearchContextDTO();
                searchContextDTO.eq(IWFInstanceService.FIELD_REALINSTID,strRealInstid);
                List<WFInstanceDTO> wfInstanceDTOList = EBSXSystemRuntime.getInstance().getWFInstanceService().selectDefault(searchContextDTO);
                if (!wfInstanceDTOList.isEmpty()) {
                    //wfinstance中dcsystemid与实际dcsystemid有偏差，故使用流程定义中dcsystemid
//					todo.setDCSystemId(wfInstanceDTOList.get(0).getDCSystemId());
                    String processDefinitionKey = wfInstanceDTOList.get(0).getProcessDefinitionKey();
                    WFDefinitionDTO wfDefinitionDTO = EBSXSystemRuntime.getInstance().getWFDefinitionService().get(processDefinitionKey);
                    todo.setDCSystemId(wfDefinitionDTO.getDCSystemId());
                }
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        String todoTitle = taskEntity.getDescription();
        if(!StringUtils.hasLength(todoTitle)){
            //补充默认标题，避免建立待办时由于无标题导致异常
            todoTitle = processDefName.substring(0,processDefName.lastIndexOf("v"));
        }
        todo.setTitle(todoTitle);
        todo.setTodoType(WFConsts.TPS_WFTASK);
        // 不使用userid，跳过值规则检验
        todo.set("todousers", strUserIds);
        //todo.setUserId(strUserId);
        todo.setBizKey(taskEntity.getCategory());
        todo.setBizType(String.valueOf(entityName));
        todo.setParam01(taskEntity.getId());
        todo.setParam02(processDefKey);
        todo.setParam03(taskEntity.getTaskDefinitionKey());
        todo.setParam04(processDefName);
        todo.setParam05(taskEntity.getName());
        todo.setParam06(userTag);
        todo.setClobParam01(processBusinessKey);
        //移除误添加代码todo建立时不应当存在处理时间
//		todo.setProcessDate(new Timestamp(System.currentTimeMillis()));

        // 是否启用动态实例标记
        if (Boolean.valueOf(enableDynaInstTag)) {
            // 存储动态实例标记，用于查询副本的待办
            Object dynaInstTag = taskEntity.getVariable(WFConsts.DYNAINST_TAG);
            Object dynaInstTag2 = taskEntity.getVariable(WFConsts.DYNAINST_TAG2);
            if (!ObjectUtils.isEmpty(dynaInstTag)) {
                taskEntity.setScopeId(dynaInstTag.toString());
                todo.setParam07(dynaInstTag.toString());
            }
            if (!ObjectUtils.isEmpty(dynaInstTag2)) {
                taskEntity.setSubScopeId(dynaInstTag2.toString());
                todo.setParam08(dynaInstTag2.toString());
            }
        }
        todo.setParam09(strRealInstid);
        // 存储扩展参数，用于后续业务处理
        Map<String, Object> activeDataParams = null;
        if (StringUtils.hasLength(extParams)) {
            String[] params = extParams.split(",");
            activeDataParams = new HashMap<String, Object>();
            if (activeData != null) {
                for (String param : params) {
                    Object paramValue = activeData.get(param);
                    activeDataParams.put(param, ObjectUtils.isEmpty(paramValue) ? null : paramValue);
                }
            }
        }

        if (!ObjectUtils.isEmpty(activeDataParams))
            todo.setClobParam02(JsonUtils.toString(activeDataParams));

        return todo;
    }
}
