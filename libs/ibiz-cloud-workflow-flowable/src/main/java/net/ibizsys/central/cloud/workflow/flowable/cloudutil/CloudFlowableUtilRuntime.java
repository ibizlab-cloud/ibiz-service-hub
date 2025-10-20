package net.ibizsys.central.cloud.workflow.flowable.cloudutil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.apache.commons.logging.LogFactory;
import org.flowable.bpmn.constants.BpmnXMLConstants;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.ExtensionAttribute;
import org.flowable.bpmn.model.ExtensionElement;
import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.Process;
import org.flowable.bpmn.model.SequenceFlow;
import org.flowable.bpmn.model.StartEvent;
import org.flowable.bpmn.model.SubProcess;
import org.flowable.bpmn.model.UserTask;
import org.flowable.common.engine.api.FlowableIllegalArgumentException;
import org.flowable.common.engine.api.FlowableOptimisticLockingException;
import org.flowable.common.engine.api.history.HistoricData;
import org.flowable.common.engine.impl.history.HistoryLevel;
import org.flowable.common.engine.impl.identity.Authentication;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.history.HistoricActivityInstance;
import org.flowable.engine.history.HistoricProcessInstance;
import org.flowable.engine.history.ProcessInstanceHistoryLog;
import org.flowable.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.flowable.engine.impl.persistence.entity.HistoricActivityInstanceEntity;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.DeploymentBuilder;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ActivityInstance;
import org.flowable.engine.runtime.Execution;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.engine.task.Comment;
import org.flowable.identitylink.api.IdentityLink;
import org.flowable.identitylink.api.IdentityLinkInfo;
import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.task.api.DelegationState;
import org.flowable.task.api.Task;
import org.flowable.task.api.TaskQuery;
import org.flowable.task.api.history.HistoricTaskInstance;
import org.flowable.task.service.impl.persistence.entity.HistoricTaskInstanceEntity;
import org.flowable.task.service.impl.persistence.entity.TaskEntity;
import org.flowable.variable.api.history.HistoricVariableInstance;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.Application;
import net.ibizsys.central.cloud.core.util.domain.CarbonCopy;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFDefinitionNode;
import net.ibizsys.central.cloud.core.util.domain.WFEditableFields;
import net.ibizsys.central.cloud.core.util.domain.WFHistory;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.core.util.domain.WFModel;
import net.ibizsys.central.cloud.core.util.domain.WFTask;
import net.ibizsys.central.cloud.core.util.domain.WFTaskWay;
import net.ibizsys.central.cloud.core.util.domain.WFUser;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.CarbonCopyDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ICarbonCopyService;
import net.ibizsys.central.cloud.workflow.core.cloudutil.CloudWFUtilRuntimeBase;
import net.ibizsys.central.cloud.workflow.core.util.WFConsts;
import net.ibizsys.central.cloud.workflow.core.util.enums.WFTaskType;
import net.ibizsys.central.cloud.workflow.core.util.enums.WFUtilAction;
import net.ibizsys.central.cloud.workflow.flowable.history.HistoryManager;
import net.ibizsys.central.cloud.workflow.flowable.listener.WFInstanceListener;
import net.ibizsys.central.cloud.workflow.flowable.spring.FlowableConfiguration;
import net.ibizsys.central.cloud.workflow.flowable.util.DynaDSCommandCtxInterceptor;
import net.ibizsys.central.cloud.workflow.flowable.util.FlowableRuntimeServiceEx;
import net.ibizsys.central.cloud.workflow.flowable.util.FlowableUtils;
import net.ibizsys.central.cloud.workflow.flowable.util.IFlowableRuntimeServiceEx;
import net.ibizsys.central.cloud.workflow.flowable.util.RuleUtils;
import net.ibizsys.central.cloud.workflow.flowable.util.WFCoreService;
import net.ibizsys.central.sysutil.ISysOSSUtilRuntime;
import net.ibizsys.central.util.CacheableActionBuilder;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.File;

public class CloudFlowableUtilRuntime extends CloudWFUtilRuntimeBase implements ICloudFlowableUtilRuntime {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudFlowableUtilRuntime.class);

    private ProcessEngine processEngine = null;

    private IFlowableRuntimeServiceEx iFlowableRuntimeServiceEx = null;

    private boolean bSchemaUpdate = true;

    private boolean bAsyncExecutorActivate = false;

    private int maxRetryCount = 3;

    @Override
    protected void onInit() throws Exception {

        String strSchemaUpdate = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".schemaupdate", null);
        if (StringUtils.hasLength(strSchemaUpdate)) {
            setSchemaUpdate(Boolean.valueOf(strSchemaUpdate));
        }

        String strAsyncExecutorActivate = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".ayncexecutoractivate", null);
        if (StringUtils.hasLength(strAsyncExecutorActivate)) {
            setAsyncExecutorActivate(Boolean.valueOf(strAsyncExecutorActivate));
        }

        super.onInit();
    }

    protected void setSchemaUpdate(boolean bSchemaUpdate) {
        this.bSchemaUpdate = bSchemaUpdate;
    }

    protected boolean isSchemaUpdate() {
        return this.bSchemaUpdate;
    }

    protected void setAsyncExecutorActivate(boolean bAsyncExecutorActivate) {
        this.bAsyncExecutorActivate = bAsyncExecutorActivate;
    }

    protected boolean isAsyncExecutorActivate() {
        return this.bAsyncExecutorActivate;
    }


    @Override
    protected void onInstall() throws Exception {

        super.onInstall();

        if (this.getProcessEngine(true) == null) {
            this.prepareProcessEngine();
            if (this.getProcessEngine(true) == null) {
                throw new Exception(String.format("Flowable引擎对象无效"));
            }
        }
    }

    @Override
    public ProcessEngine getProcessEngine() {
        return getProcessEngine(false);
    }

    public ProcessEngine getProcessEngine(boolean bTryMode) {
        if (this.processEngine != null || bTryMode) {
            return this.processEngine;
        }
        throw new SystemRuntimeException(this.getSystemRuntime(), this, "Flowable引擎对象无效");
    }

    protected void setProcessEngine(ProcessEngine processEngine) {
        this.processEngine = processEngine;
        if (this.processEngine != null) {
            this.iFlowableRuntimeServiceEx = createFlowableRuntimeServiceEx(this.processEngine.getRuntimeService());
        } else {
            this.iFlowableRuntimeServiceEx = null;
        }
    }

    protected IFlowableRuntimeServiceEx createFlowableRuntimeServiceEx(RuntimeService runtimeService) {
        return new FlowableRuntimeServiceEx(runtimeService);
    }

    protected IFlowableRuntimeServiceEx getFlowableRuntimeServiceEx() {
        return this.iFlowableRuntimeServiceEx;
    }

    protected void prepareProcessEngine() throws Exception {
        // if(!StringUtils.hasLength(this.getServiceUrl())) {
        // throw new Exception(String.format("未指定ZooKeeper远程地址"));
        // }
        // ProcessEngine client =
        // ProcessEngineFactory.newClient(this.getServiceUrl(), new
        // ExponentialBackoffRetry(1000, 3));
        // client.start();
        // this.setProcessEngine(client);

        // TenantInfoHolder tenantInfoHolder = new TenantInfoHolder();
        //
        // MultiSchemaMultiTenantProcessEngineConfiguration engineConfig = new
        // MultiSchemaMultiTenantProcessEngineConfiguration(tenantInfoHolder);
        // engineConfig.setAsyncExecutorActivate(true);
        // engineConfig.setAsyncExecutor(new
        // ExecutorPerTenantAsyncExecutor(tenantInfoHolder));
        // engineConfig.setDatabaseSchemaUpdate(MultiSchemaMultiTenantProcessEngineConfiguration.DB_SCHEMA_UPDATE_FALSE);
        // engineConfig.registerTenant(null,
        // this.getSystemRuntime().getDefaultDataSource());

//        StandaloneProcessEngineConfiguration engineConfig = new StandaloneProcessEngineConfiguration();
        SpringProcessEngineConfiguration engineConfig = FlowableConfiguration.initEngineConfig();

        if (StringUtils.hasLength(this.getDataSourceTag())) {
            engineConfig.setDataSource(ServiceHub.getInstance().getDataSource(this.getDataSourceTag(), false));
            //待提供的DBSChemeRuntime传入
            DynaDSCommandCtxInterceptor dynaDSCommandCtxInterceptor = new DynaDSCommandCtxInterceptor(this.getDataSourceTag(),null);
            engineConfig.setCustomPreCommandInterceptors(Collections.singletonList(dynaDSCommandCtxInterceptor));
        } else {
            engineConfig.setDataSource(this.getSystemRuntime().getDefaultDataSource());
        }
        // engineConfig.setDatabaseSchemaUpdate(StandaloneProcessEngineConfiguration.DB_SCHEMA_UPDATE_FALSE);
        engineConfig.setDatabaseSchemaUpdate(isSchemaUpdate() ? SpringProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE : SpringProcessEngineConfiguration.DB_SCHEMA_UPDATE_FALSE);
        engineConfig.setAsyncExecutorActivate(isAsyncExecutorActivate());
        prepareProcessEngineConfiguration(engineConfig);

        // engineConfig.setListenerFactory(new ListenerFactory(this));
        Map<Object, Object> beans = new HashMap<Object, Object>();

        // 兼容旧模式
        this.prepareProcessEngineBeans(beans);
        engineConfig.setBeans(beans);

        this.setProcessEngine(engineConfig.buildProcessEngine());
    }

    protected void prepareProcessEngineConfiguration(ProcessEngineConfigurationImpl processEngineConfiguration) throws Exception {

        HistoryManager historyManager = new HistoryManager(processEngineConfiguration, (processEngineConfiguration.getHistoryLevel() == null) ? HistoryLevel.AUDIT : processEngineConfiguration.getHistoryLevel(), processEngineConfiguration.isUsePrefixId());
        processEngineConfiguration.setHistoryManager(historyManager);
    }

    protected void prepareProcessEngineBeans(Map<Object, Object> beans) throws Exception {
        // 兼容旧模式
        if (!beans.containsKey("wfCoreService")) {
            WFCoreService wfCoreService = new WFCoreService();
            wfCoreService.init(this.getCloudWFUtilRuntimeContext(), null);
            beans.put("wfCoreService", wfCoreService);
        }
        if (!beans.containsKey("processInstanceListener")) {
            WFInstanceListener wfInstanceListener = new WFInstanceListener();
            wfInstanceListener.init(this.getCloudWFUtilRuntimeContext(), null);
            beans.put("processInstanceListener", wfInstanceListener);
        }
    }

    @Override
    protected void prepareSysFileUtilRuntime() throws Exception {
        this.setSysFileUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysOSSUtilRuntime.class, false));
    }

    @Override
    protected WFInstance onStartWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, WFInstance wfInstance, String strAppName) throws Throwable {

        // String userId =
        // AuthenticationUser.getAuthenticationUser().getPersonid();
        // if (ObjectUtils.isEmpty(userId)) {
        // throw new BadRequestAlertException("未传入当前用户", entity, businessKey);
        // }

        IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();

        String strTenantId = employeeContext.getTenant();
        if (StringUtils.isEmpty(strTenantId)) {
            throw new Exception("启动流程失败，未找到当前用户租户信息");
        }

        Authentication.setAuthenticatedUserId(employeeContext.getUserid());

        // 回调业务系统进行流程提交判断

        //判断是否携带流程定义标识
        if(ObjectUtils.isEmpty(wfInstance.getProcessDefinitionKey())){
            Collection<WFDefinition> wfDefinitions = getWFDefinitions(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strAppName);
            if (ObjectUtils.isEmpty(wfDefinitions)) {
                throw new Exception(String.format("未能获取到实体[%s]流程定义信息", strDataEntity));
            }
            WFDefinition lastProcessDefinition = (WFDefinition) ((ArrayList) wfDefinitions).get(0);
            wfInstance.setProcessDefinitionKey(lastProcessDefinition.getDefinitionKey());
        }
        // 获取流程定义
        WFDefinition definition = getWFDefinition(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, wfInstance.getProcessDefinitionKey(), strAppName);
        // if (definition == null) {
        // throw new BadRequestAlertException("未找到对应的工作流配置", entity,
        // businessKey);
        // }

        String processDefinitionKey = definition.getDefinitionKey();

        // 多应用模式有问题
        // this.getCloudSaaSUtilRuntime().get

        String processInstanceBusinessKey = strSystemTag + ":" + strAppName + ":" + strDataEntity + ":k-" + wfInstance.getBusinessKey();

        if (this.getProcessEngine().getRuntimeService().createProcessInstanceQuery().processDefinitionKey(processDefinitionKey).processInstanceBusinessKey(processInstanceBusinessKey).count() > 0) {
            throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("指定实例已经启动，不能重复提交"));
        }

        // if
        // (runtimeService.createProcessInstanceQuery().processDefinitionKey(processDefinitionKey).processInstanceBusinessKey(processInstanceBusinessKey).count()
        // > 0) {
        // throw new BadRequestAlertException("已经启动过流程，不能重复提交", entity,
        // businessKey);
        // }

        Integer version = definition.getModelVersion();

        Map<String, Object> variables = new HashMap<>();

        // variables.putAll(listenerMap);

        // variables.put("wfCoreService", this);
        variables.put("businessKey", wfInstance.getBusinessKey());
        variables.put(WFConsts.ACTIVEDATA, wfInstance.getActiveData());
        // variables.put("curuser",getCurUser());
        variables.put("cloud-serviceid", (strSystemTag + "-" + strAppName).toLowerCase());
        variables.put("system", strSystemTag);
        variables.put("dcsystem", employeeContext.getDcsystemid());


        variables.put("appname", strAppName);
        variables.put("entity", strDataEntity);
        variables.put("wfversion", version);

        // 兼容旧版本
        variables.put("entitys", strDataEntity);

        // 新补充
        // variables.put("dcsystemid", employeeContext.getDcsystemid());
        // variables.put("orgid", employeeContext.getOrgid());

        // Authentication.setAuthenticatedUserId(userId);
        // Authentication.setAuthenticationContext(createAuthenticationContext(AuthenticationUser.getCurrentMust()));

        // 根据流程定义启动流程
        ProcessInstance processInstance = this.getProcessEngine().getRuntimeService().startProcessInstanceByKeyAndTenantId(processDefinitionKey, processInstanceBusinessKey, variables, strTenantId);// 流程定时标识、业务标识、变量
        wfInstance.setBusinessKey(processInstanceBusinessKey);
        wfInstance.setId(processInstance.getId());
        wfInstance.setName(processInstance.getName());
        wfInstance.setProcessDefinitionKey(processInstance.getProcessDefinitionKey());
        wfInstance.setProcessDefinitionName(processInstance.getProcessDefinitionName());
        if (processInstance.getStartTime() != null) {
            wfInstance.setStartTime(new Timestamp(processInstance.getStartTime().getTime()));
        }
        wfInstance.setStartUserId(processInstance.getStartUserId());
        wfInstance.resetActiveData();
        return wfInstance;

        // return wfInstance;
    }

    @Override
    public Map<String, Object> getProcessGlobalSetting(String definitionId) {

        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

        return this.executeAction("获取流程配置", new IAction() {
            @Override
            public Object execute(Object[] args) throws Throwable {
                return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), WFDefinition.class.getSimpleName())).tags("processglobalsetting", definitionId).action(new IAction() {
                    @Override
                    public Object execute(Object[] args) throws Throwable {
                        return onGetProcessGlobalSetting(definitionId);
                    }
                }).build().get(new TypeReference<Map<String, Object>>() {
                });
            }
        }, null, new TypeReference<Map<String, Object>>() {
        });

        // return (Map<String, Object>) this.executeAction("获取流程配置", new
        // IAction() {
        // @Override
        // public Object execute(Object[] args) throws Throwable {
        // return onGetProcessGlobalSetting(definitionId);
        // }
        // }, null, Map.class);
    }

    protected Map<String, Object> onGetProcessGlobalSetting(String definitionId) throws Throwable {

        Map<String, Object> setting = new HashMap<String, Object>();
        Process process = getProcessEngine().getRepositoryService().getBpmnModel(definitionId).getMainProcess();
        for (ExtensionElement field : process.getExtensionElements().get("field")) {
            if ((!ObjectUtils.isEmpty(field.getAttributes().get("name").get(0).getValue())) && (!ObjectUtils.isEmpty(field.getChildElements().get("string").get(0).getElementText())))
                setting.put(field.getAttributes().get("name").get(0).getValue(), field.getChildElements().get("string").get(0).getElementText());
        }
        return setting;
        //
        //
        // return new
        // CacheableActionBuilder(this.getSysCacheUtilRuntime(false)).tags("ICloudFlowableUtilRuntime",
        // "getProcessGlobalSetting", definitionId)
        // // .expire(nSeconds)
        // .action(new IAction() {
        // @Override
        // public Object execute(Object[] args) throws Throwable {
        // Map<String, Object> setting = new HashMap<String, Object>();
        // Process process =
        // getProcessEngine().getRepositoryService().getBpmnModel(definitionId).getMainProcess();
        // for (ExtensionElement field :
        // process.getExtensionElements().get("field")) {
        // if
        // ((!ObjectUtils.isEmpty(field.getAttributes().get("name").get(0).getValue()))
        // &&
        // (!ObjectUtils.isEmpty(field.getChildElements().get("string").get(0).getElementText())))
        // setting.put(field.getAttributes().get("name").get(0).getValue(),
        // field.getChildElements().get("string").get(0).getElementText());
        // }
        // return setting;
        // }
        // }).build().get(new TypeReference<Map<String, Object>>() {
        // });

    }

    @Override
    protected Collection<WFDefinition> onGetWFDefinitions(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strAppName) throws Throwable {
        Collection<WFDefinition> list = super.onGetWFDefinitions(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strAppName);
        if (!ObjectUtils.isEmpty(list)) {
            for (WFDefinition def : list) {
                List<ProcessDefinition> processDefinitions = this.getProcessEngine().getRepositoryService().createProcessDefinitionQuery().processDefinitionKey(def.getDefinitionKey()).orderByProcessDefinitionVersion().desc().list();
                if (ObjectUtils.isEmpty(processDefinitions))
                    return list;
                ProcessDefinition lastestwf = processDefinitions.get(0);
                for (FlowElement element : this.getProcessEngine().getRepositoryService().getBpmnModel(lastestwf.getId()).getMainProcess().getFlowElements()) {
                    if (element instanceof StartEvent) {
                        if (!ObjectUtils.isEmpty(element) && !ObjectUtils.isEmpty(element.getExtensionElements()) && !ObjectUtils.isEmpty(element.getExtensionElements().get("form"))) {
                            for (ExtensionElement prop : element.getExtensionElements().get("form")) {
                                for (String attribute : prop.getAttributes().keySet()) {
                                    for (ExtensionAttribute param : prop.getAttributes().get(attribute)) {
                                        def.set(param.getName(), param.getValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return list;
    }

    public Map<String, UserTask> getUserTasksByDefinitionKey(String definitionkey) {

        Map<String, UserTask> allTask = new LinkedHashMap<String, UserTask>();
        List<ProcessDefinition> list = this.getProcessEngine().getRepositoryService().createProcessDefinitionQuery().processDefinitionKey(definitionkey).orderByProcessDefinitionVersion().desc().list();
        boolean blastest = true;
        for (ProcessDefinition def : list) {
            Map<String, UserTask> userTasks = getUserTasksByDefinitionId(def.getId());
            if (blastest) {
                allTask.putAll(userTasks);
                blastest = false;
            } else {
                for (String key : userTasks.keySet()) {
                    if (!allTask.containsKey(key)) {
                        if(!userTasks.get(key).getName().contains("-历史版本v" + def.getVersion())){
                            String taskName = userTasks.get(key).getName() + "-历史版本v" + def.getVersion();
                            userTasks.get(key).setName(taskName);
                        }
                        allTask.put(key, userTasks.get(key));
                    }
                }
            }
        }
        return allTask;
    }

    public Map<String, UserTask> getUserTasksByDefinitionId(String definitionid) {
        LinkedHashMap<String, UserTask> userTasks = new LinkedHashMap<String, UserTask>();
        Map<String, UserTask> map = new HashMap<>();
        for (FlowElement f : this.getProcessEngine().getRepositoryService().getBpmnModel(definitionid).getMainProcess().getFlowElements()) {
            if (f instanceof SubProcess){
                for (FlowElement subf : ((SubProcess) f).getFlowElements()) {
                    if(subf instanceof UserTask) {
                        map.put(subf.getId(), (UserTask)subf);
                    }
                }
            }
            if (f instanceof UserTask) {
                map.put(f.getId(), (UserTask)f);
            }
        }
        List<Map.Entry<String, UserTask>> infoIds = new ArrayList<Map.Entry<String, UserTask>>(map.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<String, UserTask>>() {
            public int compare(Map.Entry<String, UserTask> o1, Map.Entry<String, UserTask> o2) {
                String p1 = o1.getKey();
                String p2 = o2.getKey();
                return p1.compareTo(p2);
            }
        });
        for (Map.Entry<String, UserTask> entity : infoIds) {
            userTasks.put(entity.getKey(), entity.getValue());
        }
        return userTasks;
    }

    @Override
    protected WFInstance onGetWFHistory(String strSystemTag, String strDataEntity, String strBusinessKey, String strWFInstanceId, String strAppTag) throws Throwable {

        WFInstance wfProcessInstance = new WFInstance(); // 流程审批日志对象
        // wfProcessInstance.setBusinessKey(strWFInstanceId);

        Set<String> strWFInstanceIds = new HashSet<>();
        if (ObjectUtils.isEmpty(strWFInstanceId)) {
            // 此处条件有问题，需要应用，未来将从配置种读取系统的应用清单
            // 以下代码已经解决
            List<String> processInstanceBusinessKeyList = new ArrayList<String>();
            if (!ObjectUtils.isEmpty(strSystemTag)) {
                Collection<Application> sysapps = this.getApplications(strSystemTag);
                if (!ObjectUtils.isEmpty(sysapps)) {
                    // 前端传入app（全小写）与数据库（驼峰）不匹配
                    for (Application sysapp : sysapps) {
                        if (!ObjectUtils.isEmpty(sysapp.getCodeName())) {
                            String processInstanceBusinessKey = strSystemTag + ":" + sysapp.getCodeName().toLowerCase() + ":" + strDataEntity + ":k-" + strBusinessKey;
                            processInstanceBusinessKeyList.add(processInstanceBusinessKey);
                        }
                    }
                }
                //补充默认应用标记
                String processInstanceBusinessKey = strSystemTag + ":" + "web" + ":" + strDataEntity + ":k-" + strBusinessKey;
                if(!processInstanceBusinessKeyList.contains(processInstanceBusinessKey)) {
                    processInstanceBusinessKeyList.add(processInstanceBusinessKey);
                }
            }
            if (ObjectUtils.isEmpty(processInstanceBusinessKeyList)) {
                // return wfProcessInstance;
                // 提供默认业务标记，为无前端应用提供支持
                String processInstanceBusinessKey = strSystemTag + ":" + "app" + ":" + strDataEntity + ":k-" + strBusinessKey;
                processInstanceBusinessKeyList.add(processInstanceBusinessKey);
            }

            List<HistoricProcessInstance> instanceList = new ArrayList<HistoricProcessInstance>();
            for (String processInstanceBusinessKey : processInstanceBusinessKeyList) {
                List<HistoricProcessInstance> instances = getProcessEngine().getHistoryService().createHistoricProcessInstanceQuery().processInstanceBusinessKey(processInstanceBusinessKey).orderByProcessInstanceStartTime().asc().list();
                if (ObjectUtils.isEmpty(instances)) {
                    continue;
                }
                instanceList.addAll(instances);
            }

            if (ObjectUtils.isEmpty(instanceList)) {
                return wfProcessInstance;
            }

            // 重新排序
            if (processInstanceBusinessKeyList.size() > 1 && instanceList.size() > 1) {
                Collections.sort(instanceList, new Comparator<HistoricProcessInstance>() {
                    @Override
                    public int compare(HistoricProcessInstance o1, HistoricProcessInstance o2) {
                        if (o1.getStartTime() != null && o2.getStartTime() != null) {
                            if (o1.getStartTime().getTime() < o2.getStartTime().getTime()) {
                                return -1;
                            }

                            if (o1.getStartTime().getTime() > o2.getStartTime().getTime()) {
                                return 1;
                            }
                        }
                        return 0;
                    }
                });
            }

            // String processInstanceBusinessKey = strSystemTag + ":" +
            // strAppTag + ":" + strDataEntity + ":k-" + strBusinessKey;

            // 同一业务单据多次提交，生成多条历史实例记录
            for (HistoricProcessInstance instance : instanceList) {
                strWFInstanceIds.add(instance.getId());
            }
        } else {
            strWFInstanceIds.add(strWFInstanceId);
        }

        Timestamp processEndTime = null;
        ProcessInstanceHistoryLog processInstanceHistoryLog = null;

        Map<String, WFUser> wfUserMap = new HashMap<>(); //工作流审批用户
        Set<String> waitProcessInstanceIds = new HashSet<>(); //待办实例

        //根据业务单据查找流程实例
        List<HistoricData> hidatas = new ArrayList<>();
        for (String id : strWFInstanceIds) {
            processInstanceHistoryLog = getProcessEngine().getHistoryService().createProcessInstanceHistoryLogQuery(id).includeTasks().includeActivities().includeComments().singleResult();
            if (!ObjectUtils.isEmpty(processInstanceHistoryLog.getHistoricData())) {
                hidatas.addAll(processInstanceHistoryLog.getHistoricData());
            }

            if (StringUtils.isEmpty(wfProcessInstance.getId())) {
                wfProcessInstance.setId(processInstanceHistoryLog.getId());
                wfProcessInstance.setStartTime(new Timestamp(processInstanceHistoryLog.getStartTime().getTime()));
                wfProcessInstance.setBusinessKey(processInstanceHistoryLog.getBusinessKey());
                wfProcessInstance.setStartUserId(processInstanceHistoryLog.getStartUserId());
            }

            if (processInstanceHistoryLog.getEndTime() != null) {
                if (processEndTime == null || processInstanceHistoryLog.getEndTime().getTime() >= processEndTime.getTime())
                    processEndTime = (new Timestamp(processInstanceHistoryLog.getEndTime().getTime()));
            }

            if (!StringUtils.isEmpty(processInstanceHistoryLog.getStartUserId())) {
                saveWFUser(processInstanceHistoryLog.getStartUserId(), wfUserMap);
            }
        }
        List<WFDefinitionNode> nodes = getWFDefinitionNodesByhid(hidatas, processInstanceHistoryLog, wfUserMap, waitProcessInstanceIds);
        //
        fillChildWFDefinitionNodes(nodes);


        wfProcessInstance.set("usertasks", nodes);

        if (!StringUtils.isEmpty(wfProcessInstance.getStartUserId())) {
            String wfStartUserId = wfProcessInstance.getStartUserId();
            if (wfUserMap.containsKey(wfStartUserId))
                wfProcessInstance.setStartUserName(wfUserMap.get(wfStartUserId).getDisplayName());
        }
        wfProcessInstance.setBusinessKey(strBusinessKey);

        if (ObjectUtils.isEmpty(waitProcessInstanceIds)) {
            wfProcessInstance.setEndTime(processEndTime);
        }

        return wfProcessInstance;
    }

    private void fillChildWFDefinitionNodes(List<WFDefinitionNode> nodes) throws Throwable {
        for (WFDefinitionNode node : nodes) {
            if (!ObjectUtils.isEmpty(node.get("calledprocessinstanceid"))) {
                String calledprocessinstanceid = (String) node.get("calledprocessinstanceid");
                List<HistoricData> childHidatas = new ArrayList<>();
                Map<String, WFUser> wfUserMap = new HashMap<>(); //工作流审批用户
                Set<String> waitProcessInstanceIds = new HashSet<>(); //待办实例
                ProcessInstanceHistoryLog processInstanceHistoryLog = getProcessEngine().getHistoryService().createProcessInstanceHistoryLogQuery(calledprocessinstanceid).includeTasks().includeActivities().includeComments().singleResult();
                if (!ObjectUtils.isEmpty(processInstanceHistoryLog.getHistoricData())) {
                    childHidatas.addAll(processInstanceHistoryLog.getHistoricData());
                }
                if (!StringUtils.isEmpty(processInstanceHistoryLog.getStartUserId())) {
                    saveWFUser(processInstanceHistoryLog.getStartUserId(), wfUserMap);
                }
                List<WFDefinitionNode> childNodes = getWFDefinitionNodesByhid(childHidatas, processInstanceHistoryLog, wfUserMap, waitProcessInstanceIds);
                node.set("usertasks", childNodes);
            }
        }
    }

    private List<WFDefinitionNode> getWFDefinitionNodesByhid(List<HistoricData> hidatas,ProcessInstanceHistoryLog processInstanceHistoryLog,Map<String, WFUser> wfUserMap,Set<String> waitProcessInstanceIds) throws Throwable {
        List<WFDefinitionNode> nodes = new ArrayList<>();
        Map<String, WFDefinitionNode> taskNodeMaps = new HashMap<>(); //任务与节点关系
        Map<String, WFDefinitionNode> processNodeMaps = new HashMap<>(); //流程节点关系
        Map<String, HistoricTaskInstanceEntity> taskEntityNodeMaps = new HashMap<>(); //任务与任务节点关系

        List<WFHistory> processComments = new ArrayList<>(); //已办记录
        Map<String, WFDefinitionNode> scNodes = new HashMap<>(); //抄送节点

        Set<String> waitTaskIds = new HashSet<>(); //待办任务
        //排序后的流程节点
        List<WFDefinitionNode> processNodes = getWFDefinitionNodes(hidatas);

        //构造流程节点
        for (WFDefinitionNode processNode : processNodes) {

            //为节点添加comment, link等属性，并行网关节点平铺展示
            List<WFDefinitionNode> processNodeList = buildProcessNode(processNode, processInstanceHistoryLog);
            if (ObjectUtils.isEmpty(processNodeList))
                continue;

            //存储已办节点用户
            for (WFDefinitionNode node : processNodeList) {
                Object nodeComment = node.get("comments");
                if (!ObjectUtils.isEmpty(nodeComment)) {
                    for (WFHistory comment : (List<WFHistory>) nodeComment) {
                        String userId = comment.getAuthor();
                        if (!StringUtils.isEmpty(userId) && !WFUtilAction.TIMEOUT.text.equals(comment.getType())) {
                            saveWFUser(userId, wfUserMap);
                            processComments.add(comment);
                        }
                    }
                }
            }


            Object parentTask = processNode.get("parenttask");
            Object userTask = processNode.get("usertask");
            if (userTask != null && userTask instanceof HistoricActivityInstanceEntity) { //普通节点
                nodes.addAll(processNodeList);
            } else if (userTask != null && userTask instanceof HistoricTaskInstanceEntity && !ObjectUtils.isEmpty(parentTask)) { //辅助功能节点

                HistoricTaskInstanceEntity hti = (HistoricTaskInstanceEntity) processNode.get("usertask");
                String scopeType = hti.getScopeType();
                WFTask pTask = (WFTask) parentTask;
                String parentTaskId = pTask.getId();

                //抄送节点：同一步骤多次抄送时进行合并
                if (!StringUtils.isEmpty(scopeType) && WFUtilAction.SENDCOPY == WFUtilAction.valueOf(scopeType)) {
                    if (!scNodes.containsKey(parentTaskId)) {
                        scNodes.put(parentTaskId, processNode);
                        nodes.addAll(processNodeList);
                    }
                } else {
                    nodes.addAll(processNodeList);
                }
            }
        }

        //准备流程节点数据，存储节点间关系与待办任务等
        for (WFDefinitionNode node : nodes) {
            processNodeMaps.put(node.getUserTaskId(), node);
            Object userTask = node.get("usertask");
            Object nodeTasks = node.get("tasks");
            if (userTask == null)
                continue;

            //辅助功能节点，存储辅助功能任务与节点关系
            if (userTask instanceof HistoricTaskInstanceEntity) {
                HistoricTaskInstanceEntity hti = (HistoricTaskInstanceEntity) userTask;
                if (!ObjectUtils.isEmpty(hti.getScopeType())) {
                    taskNodeMaps.put(hti.getId(), node);
                }
            } else {
                if (ObjectUtils.isEmpty(nodeTasks))
                    continue;
                //主节点，存储用户任务与主节点关系
                for (HistoricTaskInstanceEntity hti : (List<HistoricTaskInstanceEntity>) nodeTasks) {
                    if (StringUtils.isEmpty(hti.getScopeType())) {
                        taskNodeMaps.put(hti.getId(), node);
                        taskEntityNodeMaps.put(hti.getId(), hti);
                        if (ObjectUtils.isEmpty(hti.getEndTime()) && !StringUtils.isEmpty(hti.getProcessInstanceId())) {
                            waitTaskIds.add(hti.getId());
                            waitProcessInstanceIds.add(hti.getProcessInstanceId());
                        }
                    }
                }
            }
        }

        //抄送任务: 查询抄送用户添加到wfUserMap
        Map<String, List<CarbonCopy>> scTaskMaps = new LinkedHashMap<>();
        if (!ObjectUtils.isEmpty(scNodes)) {
            Collection carbonCopyTasks = this.getCarbonCopyTasks(scNodes.keySet().toArray(new String[scNodes.size()]));
            if (!ObjectUtils.isEmpty(carbonCopyTasks)) {
                for (CarbonCopy sysCarbonCopy : (List<CarbonCopy>) carbonCopyTasks) {

                    String userId = sysCarbonCopy.getUserId();
                    String taskId = sysCarbonCopy.getParam01();
                    if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(taskId)) {
                        log.error(String.format("抄送任务缺失用户标识或任务标识，抄送任务[%s]将被忽略", sysCarbonCopy.getTodoId()));
                        continue;
                    }

                    if (scTaskMaps.containsKey(taskId))
                        scTaskMaps.get(taskId).add(sysCarbonCopy);
                    else
                        scTaskMaps.put(taskId, new ArrayList() {{
                            add(sysCarbonCopy);
                        }});

                    saveWFUser(userId, wfUserMap);
                }
            }
        }

        //待办任务: 查询待办用户添加到wfUserMap
        Map<String, Set<String>> waitTaskUserIdMaps = new HashMap<>(); //待办任务,用户maps
        for (String waitProcessInstanceId : waitProcessInstanceIds) {
            List<Task> waitTasks = getProcessEngine().getTaskService().createTaskQuery().processInstanceId(waitProcessInstanceId).includeIdentityLinks().list();
            if (ObjectUtils.isEmpty(waitTasks)) {
                continue;
            }
            for (Task waitTask : waitTasks) {
                List<? extends IdentityLinkInfo> waitLinks = waitTask.getIdentityLinks();
                if (!ObjectUtils.isEmpty(waitLinks)) {
                    for (IdentityLinkInfo waitLink : waitLinks) {
                        String linkTaskId = waitLink.getTaskId();
                        String linkUserId = waitLink.getUserId();
                        if (StringUtils.isEmpty(linkTaskId) || StringUtils.isEmpty(linkUserId))
                            continue;

                        if (!ObjectUtils.isEmpty(waitTaskUserIdMaps.get(linkTaskId)))
                            waitTaskUserIdMaps.get(linkTaskId).add(linkUserId);
                        else
                            waitTaskUserIdMaps.put(linkTaskId, new HashSet() {{
                                add(linkUserId);
                            }});
                    }
                }
            }
        }

        //待办用户
        for (String waitTaskId : waitTaskIds) {
            HistoricTaskInstanceEntity hti = taskEntityNodeMaps.get(waitTaskId);
            //加签操作从assignee获取操作用户
            if (hti != null && !StringUtils.isEmpty(hti.getAssignee())) {
                WFUser waitUser = saveWFUser(hti.getAssignee(), wfUserMap);
                ((ArrayList) taskNodeMaps.get(waitTaskId).get("identitylinks")).add(waitUser);
            } else {
                //待办任务，通过link中获取处理人
                Set<String> waitUserIds = waitTaskUserIdMaps.get(waitTaskId);
                if (ObjectUtils.isEmpty(waitUserIds))
                    continue;

                for (String waitUserId : waitUserIds) {
                    WFUser waitUser = saveWFUser(waitUserId, wfUserMap);
                    ((ArrayList) taskNodeMaps.get(waitTaskId).get("identitylinks")).add(waitUser);
                }
            }
        }

        //查询审批日志中涉及待办、已办等所有流程用户信息
        if (!ObjectUtils.isEmpty(wfUserMap)) {
            Collection<Employee> emps = this.getEmployees(wfUserMap.keySet().toArray(new String[wfUserMap.size()]));
            Map<String, Employee> employeeMap = new HashMap<>();
            if (!ObjectUtils.isEmpty(emps)) {
                for (Employee emp : emps) {
                    if (!StringUtils.isEmpty(emp.getUserId())) {
                        employeeMap.put(emp.getUserId(), emp);
                    }
                    if (!StringUtils.isEmpty(emp.getUAAUserId())) {
                        employeeMap.put(emp.getUAAUserId(), emp);
                    }
                }
                for (Map.Entry<String, WFUser> entry : wfUserMap.entrySet()) {
                    String userId = entry.getKey();
                    if (!ObjectUtils.isEmpty(employeeMap) && employeeMap.containsKey(userId)) {
                        entry.getValue().setDisplayName(employeeMap.get(userId).getPersonName());
                        entry.getValue().setOrgName(employeeMap.get(userId).getOrgName());
                        entry.getValue().setMDeptName(employeeMap.get(userId).getMDeptName());
                    }
                }
            }
        }

        //设置已办用户信息
        if (!ObjectUtils.isEmpty(processComments)) {
            for (WFHistory history : processComments) {
                String userId = history.getAuthor();
                if (!wfUserMap.containsKey(userId)) {
                    log.error(String.format("工作流用户列表中不存在[%s]用户信息", userId));
                    continue;
                }

                history.setAuthorName(wfUserMap.get(userId).getDisplayName());
                history.set("authororgname", wfUserMap.get(userId).getOrgName());
                history.set("authordeptname", wfUserMap.get(userId).getMDeptName());
            }
        }

        //设置抄送用户信息
        if (!ObjectUtils.isEmpty(scTaskMaps)) {
            for (String taskId : scTaskMaps.keySet()) {
                for (CarbonCopy sysCarbonCopy : scTaskMaps.get(taskId)) {
                    String userId = sysCarbonCopy.getUserId();
                    if (!wfUserMap.containsKey(userId)) {
                        log.error(String.format("建立抄送记录失败，工作流用户列表中不存在[%s]抄送用户信息", userId));
                        continue;
                    }
                    String procType = WFUtilAction.SENDCOPY.text;
                    String userName = wfUserMap.get(userId).getDisplayName();
                    if (!ObjectUtils.isEmpty(scNodes) && scNodes.containsKey(taskId)) {
                        WFHistory comment = new WFHistory();
                        comment.setId(taskId);
                        comment.setAuthor(userId);
                        comment.setAuthorName(userName);
                        comment.set("authororgname", wfUserMap.get(userId).getOrgName());
                        comment.set("authordeptname", wfUserMap.get(userId).getMDeptName());
                        comment.setTime(sysCarbonCopy.getCreateDate());
                        comment.setType(procType);
                        comment.setFullMessage(String.format("%s 至 %s", procType, userName));
                        ((ArrayList) scNodes.get(taskId).get("comments")).add(comment);
                    }
                }
            }
        }

        //辅助功能排序，将转办等辅助功能记录排在主节点之前
        if (!ObjectUtils.isEmpty(nodes)) {
            List<WFDefinitionNode> sortNodes = new ArrayList<>();
            for (WFDefinitionNode node : nodes) {
                //过滤无效流程节点
                Object userTask = node.get("usertask");
                Object tasks = node.get("tasks");
                if (userTask != null && userTask instanceof HistoricActivityInstanceEntity) {
                    if (!ObjectUtils.isEmpty(tasks)) {
                        for (HistoricTaskInstanceEntity hti : (List<HistoricTaskInstanceEntity>) tasks) {
                            String scopeType = hti.getScopeType();
                            if (!StringUtils.isEmpty(scopeType) && !ObjectUtils.isEmpty(taskNodeMaps) && taskNodeMaps.containsKey(hti.getId())) {
                                sortNodes.add(taskNodeMaps.get(hti.getId()));
                            }
                        }
                    }
                    sortNodes.add(node);
                }
            }
            nodes = sortNodes;
        }

        //调整节点顺序,将待办步骤放置在最后
        if (!ObjectUtils.isEmpty(nodes) && !ObjectUtils.isEmpty(taskNodeMaps)) {
            Set<WFDefinitionNode> waitNodes = new HashSet<>();
            Set<String> waitNodeIds = new HashSet<>();

            if (!ObjectUtils.isEmpty(waitTaskIds)) {
                for (String waitTaskId : waitTaskIds) {
                    WFDefinitionNode waitNode = taskNodeMaps.get(waitTaskId);
                    if (waitNode != null) {
                        waitNodes.add(waitNode);
                        waitNodeIds.add(waitNode.getUserTaskId());
                    }
                }
            }
            List<WFDefinitionNode> sortNodes = new ArrayList<>();
            for (WFDefinitionNode node : nodes) {
                if (!waitNodeIds.contains(node.getUserTaskId())) {
                    sortNodes.add(node);
                }
            }
            if (!ObjectUtils.isEmpty(waitNodes))
                sortNodes.addAll(waitNodes);

            nodes = sortNodes;
        }

        //去除无效参数，保留link与comment
        if (!ObjectUtils.isEmpty(nodes)) {
            List<WFDefinitionNode> filterNodes = new ArrayList<>();
            for (WFDefinitionNode node : nodes) {
                //过滤无效流程节点（去除未包含comment与link的节点）
                Object userTask = node.get("usertask");
                if ((userTask != null && userTask instanceof HistoricActivityInstanceEntity && "userTask".equals(((HistoricActivityInstanceEntity) userTask).getActivityType()))
                        && ObjectUtils.isEmpty(node.get("identitylinks")) && ObjectUtils.isEmpty(node.get("comments"))) {
                    continue;
                }
                Map<String, Object> nodeParams = node.any();
                if (!ObjectUtils.isEmpty(nodeParams)) {
                    Map<String, Object> nodeParams2 = new HashMap<>(nodeParams);
                    for (Map.Entry<String, Object> entry : nodeParams2.entrySet()) {
                        String paramName = entry.getKey();
                        if ("tasks".equals(paramName) || "usertask".equals(paramName) || "parenttask".equals(paramName) || "subnodes".equals(paramName)) {
                            nodeParams.remove(paramName);
                        }
                    }
                }
                filterNodes.add(node);
            }
            nodes = filterNodes;
        }
        return nodes;
    }

    /**
     * 存储工作流步骤用户
     *
     * @param userId
     * @param wfUserMap
     * @return
     */
    private WFUser saveWFUser(String userId, Map<String, WFUser> wfUserMap) {
        if (StringUtils.isEmpty(userId)) {
            log.error("传入用户标识为空，无法存储流程步骤用户");
            return null;
        }
        if (wfUserMap.containsKey(userId)) {
            return wfUserMap.get(userId);
        }
        WFUser wfuser = new WFUser();
        wfuser.setId(userId);
        wfUserMap.put(userId, wfuser);
        return wfuser;
    }

    /**
     * 构造流程节点：为节点添加comment, link等属性，并行网关步骤节点平铺展示
     *
     * @param processNode
     * @param processInstanceHistoryLog
     * @return
     */
    private List<WFDefinitionNode> buildProcessNode(WFDefinitionNode processNode, ProcessInstanceHistoryLog processInstanceHistoryLog) {

        List<WFDefinitionNode> processNodeList = new ArrayList<>();
        Object userTask = processNode.get("usertask");
        if (userTask == null)
            return null;

        //获取节点审批意见
        List<WFHistory> processNodeComments = getComments(processNode, processInstanceHistoryLog);

        if (userTask instanceof HistoricActivityInstance) { //常规步骤
            Object subProcessNodes = processNode.get("subnodes");
            if (!ObjectUtils.isEmpty(subProcessNodes)) {
                for (WFDefinitionNode subProcessNode : (List<WFDefinitionNode>) subProcessNodes) {
                    List<WFDefinitionNode> subNodes = buildProcessNode(subProcessNode, processInstanceHistoryLog);
                    if (!ObjectUtils.isEmpty(subNodes))
                        processNodeList.addAll(subNodes);
                }
            } else {
                HistoricActivityInstance hai = (HistoricActivityInstance) userTask;
                String activityName = hai.getActivityName();
                //超时节点名称处理
                if ("boundaryEvent".equals(hai.getActivityType()) && !StringUtils.isEmpty(activityName)) {
                    processNode.setUserTaskName(activityName.replace("timeout-", ""));
                }

                processNode.set("comments", processNodeComments);
                processNode.set("identitylinks", new ArrayList<WFUser>());
                processNodeList.add(processNode);
            }
        } else if (userTask instanceof HistoricTaskInstanceEntity) {  //辅助功能
            processNode.setUserTaskName(processNode.getUserTaskName());
            processNode.set("comments", processNodeComments);
            processNode.set("identitylinks", new ArrayList<WFUser>());
            processNodeList.add(processNode);
        }
        return processNodeList;
    }

    /**
     * 获取流程节点审批记录
     *
     * @param processNode
     * @param processInstanceHistoryLog
     * @return
     */
    private List<WFHistory> getComments(WFDefinitionNode processNode, ProcessInstanceHistoryLog processInstanceHistoryLog) {

        List<WFHistory> processNodeComments = new ArrayList<>();
        Object userTask = processNode.get("usertask");
        Object comments = processNode.get("comments");

        if (userTask == null || comments == null)
            return processNodeComments;

        //常规节点审批记录
        if (userTask instanceof HistoricActivityInstance) {
            HistoricActivityInstance hai = (HistoricActivityInstance) userTask;
            if ("startEvent".equals(hai.getActivityType())) {
                WFHistory processNodeComment = new WFHistory();
                processNodeComment.setId(hai.getId());
                processNodeComment.setAuthor(processInstanceHistoryLog.getStartUserId());
                processNodeComment.setTime(new Timestamp(hai.getTime().getTime()));
                processNodeComment.setType("启动流程");
                processNodeComments.add(processNodeComment);
            } else if ("boundaryEvent".equals(hai.getActivityType())) {
                WFHistory processNodeComment = new WFHistory();
                processNodeComment.setId(hai.getId());
                processNodeComment.setAuthor("SYSTEM");
                processNodeComment.set("authorName", "系统管理员");
                processNodeComment.setTime(new Timestamp(hai.getTime().getTime()));
                processNodeComment.setType(WFUtilAction.TIMEOUT.text);
                processNodeComments.add(processNodeComment);
            }
            if (!ObjectUtils.isEmpty(comments)) {
                List<Comment> commentList = (List<Comment>) comments;
                for (Comment comment : commentList) {
                    WFHistory processNodeComment = new WFHistory();
                    processNodeComment.setId(comment.getId());
                    processNodeComment.setAuthor(comment.getUserId());
                    processNodeComment.setFullMessage(comment.getFullMessage());
                    processNodeComment.setTime(new Timestamp(comment.getTime().getTime()));
                    processNodeComment.setType(comment.getType());
                    processNodeComments.add(processNodeComment);
                }
            }
        }
        //辅助功能审批记录
        else if (userTask instanceof HistoricTaskInstanceEntity) {
            HistoricTaskInstanceEntity hti = (HistoricTaskInstanceEntity) userTask;
            String scopeType = hti.getScopeType();
            //辅助功能审批记录（抄送额外处理）
            if (!StringUtils.isEmpty(scopeType) && WFUtilAction.SENDCOPY != WFUtilAction.valueOf(scopeType)) {

                String fullMsg = null;
                if (!ObjectUtils.isEmpty(comments)) {
                    fullMsg = ((List<Comment>) comments).get(0).getFullMessage();
                }

                WFUtilAction procFunction = WFUtilAction.valueOf(scopeType);
                WFHistory processNodeComment = new WFHistory();
                processNodeComment.setId(hti.getId());
                processNodeComment.setAuthor(hti.getOwner());
                processNodeComment.setFullMessage(fullMsg);
                processNodeComment.setTime(new Timestamp(hti.getTime().getTime()));
                processNodeComment.setType(procFunction.text);
                processNodeComments.add(processNodeComment);
            }
        }
        return processNodeComments;
    }

    @Override
    protected InputStream onGetWFDiagramInputStream(String strSystemTag, String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppTag) throws Throwable {

        WFDefinition definition = this.getWFDefinition(strSystemTag, strDataEntity, strKey, strProcessDefinitionKey, strAppTag);
        //String strProcessDiagram = definition.getBPMNFile();
        String strProcessDiagram = definition.getProcessDiagram();
        if (!StringUtils.hasLength(strProcessDiagram)) {
            strProcessDiagram = definition.getBPMNFile();
        }
        if (!StringUtils.hasLength(strProcessDiagram)) {
            throw new Exception(String.format("流程定义[%1$s]未配置流程图", strProcessDefinitionKey));
        }

        List<File> fileList = this.getSystemRuntime().deserialize(strProcessDiagram, new TypeReference<List<File>>() {
        });
        if (ObjectUtils.isEmpty(fileList)) {
            throw new Exception(String.format("流程定义[%1$s]未配置流程图", strProcessDefinitionKey));
        }

        return this.getSysFileUtilRuntime().getInputStream(fileList.get(0).getFileId());

        // 下载文件

        // MAPPER.readvalue
        // if(StringUtils.isEmpty(processDiagram)){
        // throw new
        // BadRequestAlertException(String.format("流程定义[%s]未配置流程图",processdefinitionKey),"","");
        // }

        // File file = null ;
        // String processdefinitionKey = instance.getProcessdefinitionkey();
        // if(StringUtils.isEmpty(processdefinitionKey)){
        // String instanceId =
        // DigestUtils.md5DigestAsHex(String.format("%s||%s||%s"
        // ,system,entity,businessKey).getBytes());
        // instance.setId(instanceId);
        // if(!instanceService.checkKey(instance)){
        // throw new
        // BadRequestAlertException(String.format("流程实例[%s]不存在",instanceId),"","");
        // }
        // instance = instanceService.get(instanceId);
        // processdefinitionKey = instance.getProcessdefinitionkey();
        // }
        //
        // if(StringUtils.isEmpty(processdefinitionKey)){
        // throw new BadRequestAlertException("未能获取流程定义","","");
        // }
        //
        // WFDefinition definition = new WFDefinition();
        // definition.setDefinitionkey(processdefinitionKey);
        // if(!iwfProcessDefinitionService.checkKey(definition)){
        // throw new
        // BadRequestAlertException(String.format("未能获取到流程定义[%s]",processdefinitionKey),"","");
        // }
        // definition = iwfProcessDefinitionService.get(processdefinitionKey);
        // String processDiagram = definition.getProcessdiagram();
        // if(StringUtils.isEmpty(processDiagram)){
        // throw new
        // BadRequestAlertException(String.format("流程定义[%s]未配置流程图",processdefinitionKey),"","");
        // }
        //
        // JSONArray array = JSONObject.parseArray(processDiagram);
        // if(!ObjectUtils.isEmpty(array)){
        // JSONObject obj = array.getJSONObject(0);
        // String fileId = obj.getString("id");
        // if(!StringUtils.isEmpty(fileId))
        // {
        // file = fileService.getFile(fileId);
        // }
        // }
        // if(file == null){
        // throw new
        // BadRequestAlertException(String.format("未找到流程定义[%s]的流程图",processdefinitionKey),"","");
        // }
        // return file;

        // throw new Exception("没有实现");
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Collection<WFDefinition> onCreateWFDefinitions(List bpmnfiles) throws Throwable {

        List<WFDefinition> list = new ArrayList<WFDefinition>();

        if (!ObjectUtils.isEmpty(bpmnfiles)) {
            for (Object item : bpmnfiles) {
                Map<String, Object> bpmnfile = (Map) item;
                for (Map.Entry<String, Object> entry : bpmnfile.entrySet()) {
                    try (InputStream in = new ByteArrayInputStream(String.valueOf(entry.getValue()).getBytes());) {
                        List<WFDefinition> wfDefinitions = createWFDefinitions(entry.getKey(), FlowableUtils.getByteArrayOutputStream(in));
                        if (!ObjectUtils.isEmpty(wfDefinitions)) {
                            list.addAll(wfDefinitions);
                        }
                    }
                }

            }
        }
        return list;
    }

    @Override
    protected WFDefinitionNode onGetWFDefinitionNode(String strSystemTag, String strDataEntity, String strProcessDefinitionKey, String strTaskDefinitionKey, String strAppTag) throws Throwable {
        WFDefinitionNode processNode = new WFDefinitionNode();
        UserTask userTask = getModelStepByKey(strProcessDefinitionKey).get(strTaskDefinitionKey);
        if (userTask != null && !ObjectUtils.isEmpty(strProcessDefinitionKey) && !ObjectUtils.isEmpty(strTaskDefinitionKey)) {
            Map<String, String> attributes = FlowableUtils.getElementParams(userTask, "form");
            if (!ObjectUtils.isEmpty(attributes)) {
                for (Map.Entry<String, String> entry : attributes.entrySet()) {
                    processNode.set(entry.getKey(), entry.getValue());
                }
            }
            processNode.setUserTaskName(userTask.getName());
        }
        processNode.setProcessDefinitionKey(strProcessDefinitionKey);
        processNode.setUserTaskId(strTaskDefinitionKey);

        return processNode;
    }

    @Override
    protected WFInstance onSubmitWFTask(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strWFTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
        if (ObjectUtils.isEmpty(strWFTaskId)) {
            strWFTaskId = wfTaskWay.getTaskId();
        }
        if (ObjectUtils.isEmpty(strWFTaskId)) {
            // throw new BadRequestAlertException("未传入待办标识", entity,
            // businessKey);
            throw new Exception("未传入待办标识");
        }

        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
        String userId = iEmployeeContext.getUserid();
        if (ObjectUtils.isEmpty(userId)) {
            // throw new BadRequestAlertException("未传入当前用户", entity,
            // businessKey);
            throw new Exception("当前用户身份无效");
        }
        // String processInstanceBusinessKey = system + ":" + appname + ":" +
        // entity + ":k-" + businessKey;
        Map<String, Object> variables = new LinkedHashMap<>();

        Map activeData;
        if (wfTaskWay.get(WFConsts.ACTIVEDATA) != null && wfTaskWay.get(WFConsts.ACTIVEDATA) instanceof Map) {
            activeData = (Map) wfTaskWay.get(WFConsts.ACTIVEDATA);
        } else {
            activeData = new LinkedHashMap();
        }

        variables.put(WFConsts.ACTIVEDATA, activeData);

        Map<String, Object> transientVariables = new LinkedHashMap<>();
        transientVariables.put("sequenceFlowId", wfTaskWay.getSequenceFlowId());
        transientVariables.put("sequenceFlowName", wfTaskWay.getSequenceFlowName());
        transientVariables.put("cloud-serviceid", (strSystemTag + "-" + strAppTag).toLowerCase());
        transientVariables.put("taskwaytype", wfTaskWay.get("type"));
        // 根据流程定义启动流程
        // Authentication.setAuthenticationContext(createAuthenticationContext());
        Authentication.setAuthenticatedUserId(iEmployeeContext.getUserid());

        WFInstance instance = new WFInstance();
        Task curTask = this.getProcessEngine().getTaskService().createTaskQuery().taskId(strWFTaskId).singleResult();

        // 加签任务处理
        if (curTask != null && DelegationState.PENDING == curTask.getDelegationState()) {

            String addSignUserId = curTask.getAssignee();

            if (ObjectUtils.isEmpty(addSignUserId))
                throw new Exception("未能从任务中获取加签用户信息");

            Employee addSignUser = this.getEmployee(addSignUserId);

            if (!userId.equals(curTask.getAssignee()))
                throw new Exception(String.format("任务正在加签中，等待[%s]用户处理", addSignUser.getPersonName()));

            this.getProcessEngine().getTaskService().resolveTask(strWFTaskId);
            this.getFlowableRuntimeServiceEx().resolveTask(strWFTaskId, userId);

            // 生成历史记录
            activeData.put("sequenceflowname", wfTaskWay.getSequenceFlowName());
            createHistoryRecord(WFUtilAction.FINISH, curTask, activeData);

        } else {
            // 常规任务处理
            this.getProcessEngine().getTaskService().complete(strWFTaskId, variables, transientVariables);
        }
        // 此处代码又遗漏
        log.warn(String.format("遗漏instance.setBusinesskey(processInstanceBusinessKey"));
        // instance.setBusinesskey(processInstanceBusinessKey);
        return instance;
    }

    @Override
    protected List<WFTaskWay> onGetWFTaskWays(String strSystemTag, String strDataEntity, String strKey, String strTaskDefinitionKey, WFDefinitionNode wfDefinitionNode, String strAppTag) throws Throwable {

        Map activeData = null;
        if (wfDefinitionNode != null && wfDefinitionNode.get(WFConsts.ACTIVEDATA) != null && wfDefinitionNode.get(WFConsts.ACTIVEDATA) instanceof Map) {
            activeData = (Map) wfDefinitionNode.get(WFConsts.ACTIVEDATA);
        }

        // 查询当前应用
        Application sysApp = null;
        if (!ObjectUtils.isEmpty(strSystemTag) && !ObjectUtils.isEmpty(strAppTag)) {
            Collection<Application> sysapps = this.getApplications(strSystemTag);
            if (!ObjectUtils.isEmpty(sysapps)) {
                // 前端传入app（全小写）与数据库（驼峰）不匹配
                for (Application sysapp : sysapps) {
                    if (!ObjectUtils.isEmpty(sysapp.getCodeName()) && strAppTag.equalsIgnoreCase(sysapp.getCodeName())) {
                        sysApp = sysapp;
                        break;
                    }
                }
            }
        }
        if (sysApp == null) {
            // throw new
            // BadRequestAlertException(String.format("未获取到[%s]应用信息",strAppTag),"","");
//            throw new Exception(String.format("无法获取指定应用[%1$s]", strAppTag));

            //仿真应用
            sysApp = new Application();
            sysApp.setCodeName(strAppTag);
            if(strAppTag.startsWith("mob")||strAppTag.endsWith("mob")||strAppTag.endsWith("mobile")){
                sysApp.setMobileApp(1);
            }
        }

        List<WFTaskWay> taskWays = new ArrayList<>();

        // String userId =
        // AuthenticationUser.getAuthenticationUser().getPersonid();
        // if (StringUtils.isEmpty(userId)) {
        // return taskWays;
        // }

        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
        String userId = iEmployeeContext.getUserid();

        // pc端businesskey
        String processInstanceBusinessKey = strSystemTag + ":" + strAppTag + ":" + strDataEntity + ":k-" + strKey;
        // // mob端businesskey
        // String processInstanceBusinessKey2 = strSystemTag + ":" + strAppTag +
        // ":" + strDataEntity + ":k-" + strKey;
        //
        // String processdefinitionkey =
        // wfDefinitionNode.getProcessDefinitionKey();
        // if (!ObjectUtils.isEmpty(processdefinitionkey)) {
        // WFDefinition processDefinition =
        // this.getWFDefinition(processdefinitionkey, false);
        // // pc端应用
        // if (!ObjectUtils.isEmpty(processDefinition.getWebServiceIds())) {
        // String[] webAppIds = processDefinition.getWebServiceIds().split(",");
        // if (!ObjectUtils.isEmpty(webAppIds)) {
        // String webAppId = webAppIds[0].replace(String.format("%s-",
        // strSystemTag), "").toLowerCase();
        // processInstanceBusinessKey = strSystemTag + ":" + webAppId + ":" +
        // strDataEntity + ":k-" + strKey;
        // }
        // }
        // // 移动端应用
        // if (!ObjectUtils.isEmpty(processDefinition.getMobileServiceIds())) {
        // String[] mobAppIds =
        // processDefinition.getMobileServiceIds().split(",");
        // if (!ObjectUtils.isEmpty(mobAppIds)) {
        // String mobAppId = mobAppIds[0].replace(String.format("%s-",
        // strSystemTag), "").toLowerCase();
        // processInstanceBusinessKey2 = strSystemTag + ":" + mobAppId + ":" +
        // strDataEntity + ":k-" + strKey;
        // }
        // }
        // }
        //
        // // 支持跨应用处理待办，如：pc端发起，mob端审批；
        // TaskQuery query =
        // this.getProcessEngine().getTaskService().createTaskQuery().taskCandidateOrAssigned(userId).processInstanceBusinessKey(processInstanceBusinessKey).or().processInstanceBusinessKey(processInstanceBusinessKey2);
        // if (!ObjectUtils.isEmpty(strTaskDefinitionKey)) {
        // query.taskDefinitionKey(strTaskDefinitionKey);
        // }
        String realInstId = null;
        if(!ObjectUtils.isEmpty(activeData)) {
            realInstId = (String) activeData.get("srfprocessinstanceid");
        }
        if(ObjectUtils.isEmpty(realInstId)) {
            String instanceId = KeyValueUtils.genUniqueId(strSystemTag, strDataEntity, strKey);
            WFInstance wfInstance = this.getWFInstance(instanceId, true);

            if (ObjectUtils.isEmpty(wfInstance)) {
                throw new Exception("获取流程实例数据失败");
            }

            realInstId = wfInstance.getRealInstId();
        }

        TaskQuery query = this.getProcessEngine().getTaskService().createTaskQuery().taskCandidateOrAssigned(userId).processInstanceId(realInstId);
        if (!ObjectUtils.isEmpty(strTaskDefinitionKey)) {
            query.taskDefinitionKey(strTaskDefinitionKey);
        }

        List<Task> list = query.orderByTaskCreateTime().desc().listPage(0, 1);
        if (list.size() == 0) {
            return taskWays;
        }

        Task task = list.get(0);
        if ((!ObjectUtils.isEmpty(task.getProcessDefinitionId())) && (!ObjectUtils.isEmpty(task.getTaskDefinitionKey()))) {
            UserTask userTask = this.getModelStepById(task.getProcessDefinitionId()).get(task.getTaskDefinitionKey());
            // 设置流程表单
            setProcessForm(userTask);

            // 加签逻辑
            String procFuncs = FlowableUtils.getElementParam(userTask, "form", "procfunc");
            if (DelegationState.PENDING == task.getDelegationState() && userId.equals(task.getAssignee()) && !ObjectUtils.isEmpty(procFuncs) && procFuncs.contains(WFUtilAction.ADDSTEPBEFORE.value)) {
                WFTaskWay way = getWFTaskWay(sysApp, task, WFUtilAction.FINISH.value, null);
                if (way != null) {
                    taskWays.add(way);
                }
                return taskWays;
            }

            if (userTask != null && userTask.getOutgoingFlows() != null) {
                for (SequenceFlow sequenceFlow : userTask.getOutgoingFlows()) {
                    String userLinkCond = FlowableUtils.getElementParam(sequenceFlow, "form", WFConsts.LINK_CUSTOMCOND);
                    if (!ObjectUtils.isEmpty(userLinkCond) && !RuleUtils.test(userLinkCond, activeData)) {
                        continue;
                    }
                    WFTaskWay way = new WFTaskWay();
                    way.setSequenceFlowId(sequenceFlow.getId());
                    way.setSequenceFlowName(sequenceFlow.getName());
                    if (task.getProcessDefinitionId().indexOf(":") > 0) {
                        way.setProcessDefinitionKey(task.getProcessDefinitionId().split(":")[0]);
                    }
                    way.setTaskId(task.getId());
                    way.setProcessInstanceId(task.getProcessInstanceId());
                    way.setProcessDefinitionKey(task.getTaskDefinitionKey());
                    way.setProcessInstanceBusinessKey(processInstanceBusinessKey);
                    // 设置流程交互表单
                    setTaskWayForm(sequenceFlow, way);
                    taskWays.add(way);
                }

                // 流程辅助功能
                List<WFTaskWay> functions = getProcessFunc(sysApp, task, userTask);
                if (functions.size() > 0) {
                    taskWays.addAll(functions);
                }
            }
        }
        return taskWays;
    }

    @Override
    protected void onSendBackWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
        // 获取当前任务节点
        Task task = this.getProcessEngine().getTaskService().createTaskQuery().taskId(strTaskId).singleResult();
        if (task == null) {
            throw new Exception(String.format("退回失败，未找到运行任务[%1$s]", strTaskId));
        }

        // 流程实例标识
        String processInstanceId = task.getProcessInstanceId();

        // 检查当前流程是否满足撤回条件
        testSendBackWFTaskWay(task);

        // 获取前一步流程节点信息
        ActivityInstance lastActivityInstance = getLastActivityInstance(processInstanceId);

        // if(lastActivityInstance == null){
        // //throw new BadRequestAlertException("退回流程失败，无法获取上一步流程节点信息","","");
        // }
        // if(!StringUtils.isEmpty(ignoreStepId) &&
        // ignoreStepId.contains(beforeStep.getActivityId())){
        // //throw new BadRequestAlertException("目标步骤不支持退回操作","","");
        // }

        // 获取上下文对象
        // 流程第一步
        if (BpmnXMLConstants.ELEMENT_EVENT_START.equals(lastActivityInstance.getActivityType())) {
            // throw new BadRequestAlertException("当前为流程第一步，不支持退回","","");
            throw new Exception("当前为流程第一步，不支持退回");
        } else {// 将流程退回到前一步

            // 获取回退步骤操作用户，重构activedata；
            Map activeData = getWFInstActiveData(processInstanceId);
            if (ObjectUtils.isEmpty(activeData)) {
                // throw new
                // BadRequestAlertException("退回撤回失败，无法获取上一步操作用户","","");
                throw new Exception("退回撤回失败，无法获取上一步操作用户");
            }

            //填充退回意见
            if (wfTaskWay != null) {
                Object objActiveData = wfTaskWay.get(WFConsts.ACTIVEDATA);
                if (!ObjectUtils.isEmpty(objActiveData) && objActiveData instanceof Map) {
                    Object memo = ((Map) objActiveData).get(WFConsts.WFMEMO);
                    if (!ObjectUtils.isEmpty(memo)) {
                        activeData.put(WFConsts.WFMEMO, memo);
                    }
                }
            }

            // 查询跳转下所有同节点实例，执行跳转
            List<String> executionIds = new ArrayList<>();
            List<Execution> executions = this.getProcessEngine().getRuntimeService().createExecutionQuery().parentId(processInstanceId).list();
            executions.forEach(execution -> executionIds.add(execution.getId()));

            // 获取当前任务，记录审批日志
            List<Task> tasks = this.getProcessEngine().getTaskService().createTaskQuery().processInstanceId(processInstanceId).list();
            if (ObjectUtils.isEmpty(tasks)) {
                // throw new BadRequestAlertException("获取运行时任务失败","","");
                throw new Exception("获取运行时任务失败");
            }
            Task currentTask = tasks.get(0);

            // 执行跳转
            this.getProcessEngine().getRuntimeService().createChangeActivityStateBuilder().localVariable(currentTask.getTaskDefinitionKey(), WFConsts.ACTIVEDATA, activeData).moveExecutionsToSingleActivityId(executionIds, lastActivityInstance.getActivityId()).changeState();
            // 生成历史记录
            createHistoryRecord(WFUtilAction.SENDBACK, currentTask, activeData);
        }
    }

    @Override
    protected void onWithdrawWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {

        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

        String processInstanceId;
        Object objProcessInstanceId = wfTaskWay.get("srfprocessinstanceid");
        if (ObjectUtils.isEmpty(objProcessInstanceId)) {
            HistoricTaskInstance task = this.getProcessEngine().getHistoryService().createHistoricTaskInstanceQuery().taskId(strTaskId).singleResult();
            if (task == null) {
                // throw new BadRequestAlertException("撤回流程失败，任务不存在","","");
                throw new Exception("任务不存在");
            }
            processInstanceId = task.getProcessInstanceId();
        } else {
            processInstanceId = objProcessInstanceId.toString();
        }

        if (ObjectUtils.isEmpty(processInstanceId)) {
            throw new Exception("未传入流程实例标识");
        }

        //this.withdrawWFTaskWay(processInstanceId, wfTaskWay);

        //查询流程实例审批记录
        ProcessInstanceHistoryLog processInstanceHistoryLog = this.getProcessEngine().getHistoryService().createProcessInstanceHistoryLogQuery(processInstanceId).includeTasks().includeActivities().includeComments().singleResult();
        if (processInstanceHistoryLog == null) {
            throw new Exception("未获取到流程审批历史记录");
        }
        List<HistoricData> hidatas = processInstanceHistoryLog.getHistoricData();

        //获取流程节点信息（从开始到结束，顺序）
        List<WFDefinitionNode> processInstanceNodes = getWFDefinitionNodes(hidatas);
        if (ObjectUtils.isEmpty(processInstanceNodes) || processInstanceNodes.size() < 2) {
            throw new Exception("未获取到流程历史审批步骤数据");
        }

        //获取流程节点信息（从结束到开始，逆序）
        List<WFDefinitionNode> processNodes = new ArrayList<>();
        ListIterator<WFDefinitionNode> iterator = processInstanceNodes.listIterator(processInstanceNodes.size());
        while (iterator.hasPrevious()) {
            processNodes.add(iterator.previous());
        }

        WFDefinitionNode activeNode = processNodes.get(0);//获取当前节点（含审批记录）
        HistoricData activeNodeData = (HistoricData) activeNode.get("usertask");

        if (activeNodeData == null) {
            throw new Exception(String.format("未获取到流程步骤[%s]数据", activeNode.getUserTaskName()));
        }

        if (activeNodeData instanceof HistoricTaskInstanceEntity) { //流程辅助功能回退

            HistoricTaskInstanceEntity hti = (HistoricTaskInstanceEntity) activeNodeData;
            String scopeType = hti.getScopeType();
            WFUtilAction procfunc = WFUtilAction.valueOf(scopeType);

            if (procfunc == WFUtilAction.REASSIGN) {//转办回退处理，将流程退回转办发起人

                String originUserId = hti.getAssignee();
                if (ObjectUtils.isEmpty(originUserId)) {
                    throw new Exception("未配置撤回源用户信息");
                }

                String targetUserId = hti.getOwner();
                if (ObjectUtils.isEmpty(targetUserId)) {
                    throw new Exception("未配置撤回后目标用户信息");
                }

                Map activeData;
                if (wfTaskWay.get(WFConsts.ACTIVEDATA) != null && wfTaskWay.get(WFConsts.ACTIVEDATA) instanceof Map)
                    activeData = (Map) wfTaskWay.get(WFConsts.ACTIVEDATA);
                else
                    activeData = new LinkedHashMap();

                List<HistoricTaskInstanceEntity> activeTasks = new ArrayList<>();
                for (HistoricData hidata : hidatas) {
                    if (hidata instanceof HistoricTaskInstanceEntity && ObjectUtils.isEmpty(((HistoricTaskInstanceEntity) hidata).getEndTime())) {
                        activeTasks.add((HistoricTaskInstanceEntity) hidata);
                    }
                }
                if (ObjectUtils.isEmpty(activeTasks)) {
                    throw new Exception("未获取到运行任务");
                }

                activeData.put(WFConsts.PREDEFINED_USER, originUserId);
                activeData.put(WFConsts.REASSIGN_USER, targetUserId);
                activeData.put(WFConsts.PROCFUNCTYPE, WFUtilAction.WITHDRAW.value);

                wfTaskWay.set(WFConsts.ACTIVEDATA, activeData);

                //reassign(system,appname,entity,businessKey,activeTasks.get(0).getId(),taskWay);
                this.transferWFTaskWay(strSystemTag, strDataEntity, strKey, strTaskId, wfTaskWay, strAppTag);
            } else {
                throw new Exception(String.format("辅助功能[%s]暂未支持撤回", procfunc.text));
            }
        } else if (activeNodeData instanceof HistoricActivityInstance) { //常规步骤回退

            //获取前一步
            WFDefinitionNode beforeNode = null;
            for (WFDefinitionNode processNode : processNodes) {
                HistoricData hidata = (HistoricData) processNode.get("usertask");
                if (hidata != null && hidata instanceof HistoricActivityInstance && hidata != activeNodeData && ObjectUtils.isEmpty(((HistoricActivityInstance) hidata).getDeleteReason()) &&
                        ("startEvent".equals(((HistoricActivityInstance) hidata).getActivityType()) || "userTask".equals(((HistoricActivityInstance) hidata).getActivityType()))) {
                    beforeNode = processNode;
                    break;
                }
            }

            if (beforeNode == null) {
                throw new Exception("未能获取到流程前一步骤信息");
            }

            //流程是否被用户处理
            List<HistoricTaskInstanceEntity> activeTasks = (ArrayList) activeNode.get("tasks");

            if (!ObjectUtils.isEmpty(activeTasks)) {
                for (HistoricTaskInstanceEntity activeTask : activeTasks) {
                    if (!ObjectUtils.isEmpty(activeTask.getEndTime())) {
                        throw new Exception("流程已经被用户处理，不允许撤回");
                    }
                }
            }

            //上一步是否有多人参与审批
            HistoricData beforeNodeData = (HistoricData) beforeNode.get("usertask");
            List<HistoricTaskInstanceEntity> beforeNodeTasks = (List<HistoricTaskInstanceEntity>) beforeNode.get("tasks");

            if (ObjectUtils.isEmpty(beforeNodeTasks)) {
                log.warn(String.format("未获取到步骤[%s]历史审批任务", beforeNode.getUserTaskName()));
            } else {
                if (beforeNodeTasks.size() > 1) {
                    //判断是否有多人参与审批
                    int validTaskCount = 0;
                    for(HistoricTaskInstanceEntity hNodeTask : beforeNodeTasks){
                        if(WFUtilAction.WITHDRAW.value.equalsIgnoreCase(hNodeTask.getScopeType()) || !ObjectUtils.isEmpty(hNodeTask.getDeleteReason())){
                            //排除回退操作历史
                            continue;
                        }
                        validTaskCount++;
                    }
                    if(validTaskCount > 1) {
                        throw new Exception("上一步有多人参与审批，不允许进行撤回操作");
                    }
                }
            }

            // 当前用户是否为上一步的流程操作者
            boolean isContainUser = false;

            if (!iEmployeeContext.isSuperuser()) {
                List<Comment> comments = (List<Comment>) beforeNode.get("comments");
                if (!ObjectUtils.isEmpty(comments)) {
                    for (Comment comment : comments) {
                        String userId = comment.getUserId();
                        if (!ObjectUtils.isEmpty(userId) && userId.equals(iEmployeeContext.getUserid()))
                            isContainUser = true;
                    }
                    if (!isContainUser) {
                        throw new Exception("当前用户不属于上一步的流程操作者,无权限进行此操作");
                    }
                }
            }

            HistoricActivityInstance hai = (HistoricActivityInstance) beforeNodeData;

            if (BpmnXMLConstants.ELEMENT_EVENT_START.equals(hai.getActivityType())) { //流程第一步回退，取消流程

                //获取当前任务，记录审批日志
                List<Task> tasks = this.getProcessEngine().getTaskService().createTaskQuery().processInstanceId(processInstanceId).list();
                if (ObjectUtils.isEmpty(tasks)) {
                    throw new Exception("获取运行时任务失败");
                }

                Map activeData;
                if (wfTaskWay.get(WFConsts.ACTIVEDATA) != null && wfTaskWay.get(WFConsts.ACTIVEDATA) instanceof Map)
                    activeData = (Map) wfTaskWay.get(WFConsts.ACTIVEDATA);
                else
                    activeData = new LinkedHashMap();

                Map variables = this.getProcessEngine().getRuntimeService().getVariables(processInstanceId);

                //生成历史记录
                Task task = tasks.get(0);
                createHistoryRecord(WFUtilAction.WITHDRAW, task, activeData);
                ProcessInstance pProcessInstance = this.getProcessEngine().getRuntimeService().createProcessInstanceQuery().subProcessInstanceId(processInstanceId).singleResult();
                this.getProcessEngine().getRuntimeService().deleteProcessInstance(processInstanceId, "流程撤回");

                //将流程实例状态设置为未提交
                if (variables != null) {
                    Object objsystem = variables.get("system");
                    Object objentity = variables.get("entitys");
                    Object objbusinessKey = variables.get("businessKey");
                    if (ObjectUtils.isEmpty(objsystem) || ObjectUtils.isEmpty(objentity) || ObjectUtils.isEmpty(objbusinessKey)) {
                        throw new Exception("撤回流程失败，无法获取流程实例标识");
                    }
//					String instanceId = DigestUtils.md5DigestAsHex(String.format("%s||%s||%s", objsystem, objentity, objbusinessKey).getBytes());
//					WFProcessInstance instance = new WFProcessInstance();
//					instance.setId(instanceId);
//					instance.setStarttime(null);
//					instance.setStartuserid(null);
//					instance.setStartusername(null);
//					instance.setRealinstid(null);
//					instanceService.update(instance);
                    //子流程实例补充entity标识计算
                    if(pProcessInstance != null) {
                        objentity = String.format("%1$s|%2$s", objentity, processInstanceId);
                    }
                    String instanceId = KeyValueUtils.genUniqueId(objsystem, objentity, objbusinessKey);
                    WFInstance instance = new WFInstance();
                    instance.setId(instanceId);
                    instance.setStartTime(null);
                    instance.setStartUserId(null);
                    instance.setStartUserName(null);
                    instance.setRealInstId(null);
                    // instanceService.update(instance);
                    if(pProcessInstance != null) {
                        //子流程实例开始节点回退应当移除该子流程实例数据
                        this.removeWFInstance(instanceId);
                    }else {
                        this.updateWFInstance(instance);
                    }
                }
            } else { //流程中步骤回退，将流程退回前一步

                Map activeData = getWFInstActiveData(processInstanceId);//获取回退步骤操作用户，重构activedata；
                if (ObjectUtils.isEmpty(activeData)) {
                    throw new Exception("流程撤回失败，无法获取上一步操作用户");
                }

                this.getProcessEngine().getRuntimeService().setVariable(processInstanceId, WFConsts.ACTIVEDATA, activeData);

                //获取当前任务，记录审批日志
                List<Task> tasks = this.getProcessEngine().getTaskService().createTaskQuery().processInstanceId(processInstanceId).list();
                if (ObjectUtils.isEmpty(tasks)) {
                    throw new Exception("获取运行时任务失败");
                }
                Task task = tasks.get(0);

                // 查询跳转下所有同节点实例，执行跳转
                List<String> executionIds = new ArrayList<>();
                List<Execution> executions = this.getProcessEngine().getRuntimeService().createExecutionQuery().parentId(processInstanceId).list();
                executions.forEach(execution -> executionIds.add(execution.getId()));

                // 执行跳转
                this.getProcessEngine().getRuntimeService().createChangeActivityStateBuilder().localVariable(task.getTaskDefinitionKey(), WFConsts.ACTIVEDATA, activeData).moveExecutionsToSingleActivityId(executionIds, hai.getActivityId()).changeState();

                //撤回意见
                if (wfTaskWay != null) {
                    Object activedata = wfTaskWay.get(WFConsts.ACTIVEDATA);
                    if (!ObjectUtils.isEmpty(activedata) && activedata instanceof Map) {
                        Object comment = ((Map) activedata).get(WFConsts.WFMEMO);
                        activeData.put(WFConsts.WFMEMO, comment);
                    }
                }
                // 生成历史记录
                createHistoryRecord(WFUtilAction.WITHDRAW, task, activeData);
            }
        } else {
            throw new Exception(String.format("暂未支持的历史步骤类型[%s]回退", activeNode.getClass().getSimpleName()));
        }
    }

    @Override
    protected void onSignWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
        // String curUserId =
        // AuthenticationUser.getAuthenticationUser().getPersonid();
        // if (StringUtils.isEmpty(curUserId)) {
        // throw new BadRequestAlertException("获取当前用户信息失败", entity,
        // businessKey);
        // }

        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

        // 运行任务
        Task curTask = this.getProcessEngine().getTaskService().createTaskQuery().taskId(strTaskId).taskCandidateOrAssigned(iEmployeeContext.getUserid()).singleResult();
        if (curTask == null) {
            throw new Exception("未能获取到当前流程任务");
        }

        //当前步骤是否支持加签
        if ((!StringUtils.isEmpty(curTask.getProcessDefinitionId())) && (!StringUtils.isEmpty(curTask.getTaskDefinitionKey()))) {
            UserTask userTask = this.getModelStepById(curTask.getProcessDefinitionId()).get(curTask.getTaskDefinitionKey());

            //当前步骤所支持的辅助功能集合
            String procFuncs = FlowableUtils.getElementParam(userTask, "form", "procfunc");

            if (StringUtils.isEmpty(procFuncs) || !procFuncs.contains(WFUtilAction.ADDSTEPBEFORE.value)) {
                throw new Exception(String.format("[%s]步骤未支持加签操作", curTask.getName()));
            }
        }

        Map activeData;
        Employee user = null;
        if (wfTaskWay.get(WFConsts.ACTIVEDATA) != null && wfTaskWay.get(WFConsts.ACTIVEDATA) instanceof Map) {
            activeData = (Map) wfTaskWay.get(WFConsts.ACTIVEDATA);
        } else {
            activeData = new LinkedHashMap();
        }

        Object userId = activeData.get(WFConsts.BEFORESIGN_USER);
        try {
            if (!ObjectUtils.isEmpty(userId)) {
                user = this.getEmployee((String) userId);
            }
        } catch (Throwable ex) {
        }

        if (user == null) {
            // throw new
            // BadRequestAlertException(String.format("加签失败，未查询到[%s]用户信息",
            // userId), "", "");
            throw new Exception(String.format("加签失败，未查询到[%1$s]用户信息", userId));
        }

        if (DelegationState.PENDING == curTask.getDelegationState()) {
            throw new Exception("任务正在加签中，无法进行二次加签");
        }

        this.getProcessEngine().getTaskService().delegateTask(strTaskId, String.valueOf(userId));

        this.getFlowableRuntimeServiceEx().delegateTask(iEmployeeContext.getUserid(), strTaskId, String.valueOf(userId));

        //生成历史记录
        activeData.put("sequenceflowname", wfTaskWay.getSequenceFlowName());
        createHistoryRecord(WFUtilAction.ADDSTEPBEFORE, curTask, activeData);
    }

    @Override
    protected void onAfterAddSign(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {

        IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
        Task task = this.getProcessEngine().getTaskService().createTaskQuery().taskId(strTaskId).taskCandidateOrAssigned(employeeContext.getUserid()).singleResult();
        if(task == null){
            throw new Exception(String.format("加签失败，未能获取到当前流程任务[%1$s] " ,strTaskId));
        }

        Map activeData;
        if (wfTaskWay.get(WFConsts.ACTIVEDATA) != null && wfTaskWay.get(WFConsts.ACTIVEDATA) instanceof Map) {
            activeData = (Map) wfTaskWay.get(WFConsts.ACTIVEDATA);
        } else {
            activeData = new LinkedHashMap();
        }

        //获取加签人员
        String signUserIds = activeData.get(WFConsts.AFTERSIGN_USER) == null ? "" : activeData.get(WFConsts.AFTERSIGN_USER).toString();
        if(ObjectUtils.isEmpty(signUserIds)){
            throw new Exception(String.format("任务[%1$s]后加签失败，未传入加签用户" , strTaskId));
        }

        //判断当前节点模式(单实例/多实例)
        boolean isMultiInstance = isMultiInstance(task);
        if(isMultiInstance){
            RuntimeService runtimeService = this.getProcessEngine().getRuntimeService();
            for(String signUserId : signUserIds.split("[,;]")){
                boolean success = false;
                int retryCount = 0;
                // 进行重试
                while (!success && retryCount < maxRetryCount) {
                    try {
                        // 添加多实例执行
                        runtimeService.addMultiInstanceExecution(task.getTaskDefinitionKey(), task.getProcessInstanceId(), Collections.singletonMap("candidateUsers", signUserId));
                        success = true;
                    } catch (FlowableOptimisticLockingException e) {
                        retryCount++;
                        log.error(String.format("任务[%1$s]后加签失败，正在进行第[%2$s]重试..." , strTaskId, retryCount));
                    }
                }

                if (!success) {
                    log.error(String.format("任务[%1$s]后加签失败，存在同时操作用户，请稍候重试" , strTaskId));
                    throw new RuntimeException(String.format("任务[%1$s]后加签失败，存在同时操作用户，请稍候重试" , strTaskId));
                }
            }
            onSubmitWFTask(strSystemTag, null, null, strDataEntity, strKey, strTaskId, wfTaskWay, strAppTag);
        }
        else{
            //单实例：增加加签审批用户并消除当前用户待办。
            //流程引擎加签处理：删除原任务审批人，将加签人设置为任务审批人
            for(String signUserId : signUserIds.split("[,;]")){
                this.getProcessEngine().getTaskService().addCandidateUser(task.getId(),signUserId);
            }
            this.getProcessEngine().getTaskService().deleteCandidateUser(task.getId(),employeeContext.getUserid());

            //todo处理与转办处理一致，当前操作用户完成todo并新增加签用户待办
            this.getFlowableRuntimeServiceEx().reassignTask(employeeContext.getUserid(), strTaskId, signUserIds);

            //加签历史记录
            activeData.put("sequenceflowname", wfTaskWay.getSequenceFlowName());
            createHistoryRecord(WFUtilAction.ADDSTEPAFTER, task, activeData);
        }

    }

    /**
     * 是否为多实例
     */
    protected boolean isMultiInstance(Task taskEntity){
        boolean isMultiInstance = false;
        List<Execution> executions = this.getProcessEngine().getRuntimeService().createExecutionQuery().processInstanceId(taskEntity.getProcessInstanceId()).list();
        if(!ObjectUtils.isEmpty(executions)){
            Execution execution = executions.stream().filter(item -> taskEntity.getExecutionId().equals(item.getId())).findFirst().get();
            if(!ObjectUtils.isEmpty(execution.getParentId())){
                Execution parentExecution = executions.stream().filter(item -> execution.getParentId().equals(item.getId())).findFirst().get();
                if(parentExecution instanceof DelegateExecution){
                    DelegateExecution delegateExecution = (DelegateExecution) parentExecution;
                    return delegateExecution.isMultiInstanceRoot();
                }
            }
        }
        return isMultiInstance;
    }

    @Override
    protected void onTransferWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

        Map activeData;
        Employee targetUser = null;
        if (wfTaskWay.get(WFConsts.ACTIVEDATA) != null && wfTaskWay.get(WFConsts.ACTIVEDATA) instanceof Map) {
            activeData = (Map) wfTaskWay.get(WFConsts.ACTIVEDATA);
        } else {
            activeData = new LinkedHashMap();
        }

        if (ObjectUtils.isEmpty(strTaskId)) {
            throw new Exception("未传入转移任务标识");
        }

        Object originUserId = !ObjectUtils.isEmpty(activeData.get(WFConsts.PREDEFINED_USER)) ? activeData.get(WFConsts.PREDEFINED_USER) : iEmployeeContext.getUserid();
        if (ObjectUtils.isEmpty(originUserId)) {
            throw new Exception("未获取到当前用户标识");
        }

        String targetUserId = (String) activeData.get(WFConsts.REASSIGN_USER);
        try {
            if (!ObjectUtils.isEmpty(targetUserId)) {
                targetUser = this.getEmployee(targetUserId);
            }
        } catch (Throwable e) {
        }

        if (targetUser == null) {
            // throw new
            // BadRequestAlertException(String.format("转办失败，未查询到[%s]用户信息",
            // userId), "", "");
            throw new Exception(String.format("转办失败，未查询到[%1$s]用户信息", targetUserId));
        }

        Task curTask = this.getProcessEngine().getTaskService().createTaskQuery().taskId(strTaskId).singleResult();
        if (curTask == null) {
            // throw new BadRequestAlertException(String.format("未能获取到[%s]运行任务",
            // taskId), "", "");
            throw new Exception(String.format("转移任务[%s]不存在", strTaskId));
        }

        Object prefunctype = activeData.get(WFConsts.PROCFUNCTYPE);
        String scopeType = ObjectUtils.isEmpty(prefunctype) ? "REASSIGN" : prefunctype.toString().toUpperCase();

        // 引擎转办
        // Map param = new HashMap();
        // param.put("orignuserid", curUserId);
        // param.put("userid", userId);
        // param.put("taskid", taskId);
        // wfCoreMapper.reassignTask(param);

        // todo转办
        // SysTodo todo = new SysTodo();
        // todo.setUserid(curUserId);
        // todo.setParam01(curTask.getId());
        // todo.setParam02(user.getUserid());
        // todoService.reassign(todo);

        // 两个事项都由服务对象完成
        this.getFlowableRuntimeServiceEx().reassignTask(originUserId.toString(), strTaskId, targetUserId);

        //生成转办历史记录
        activeData.put("srfwfassignee", targetUser.getUserId());
        createHistoryRecord(WFUtilAction.valueOf(scopeType), curTask, activeData);

    }

    @Override
    protected void onSendCopyWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {

        Map activeData;
        if (wfTaskWay.get(WFConsts.ACTIVEDATA) != null && wfTaskWay.get(WFConsts.ACTIVEDATA) instanceof Map) {
            activeData = (Map) wfTaskWay.get(WFConsts.ACTIVEDATA);
        } else {
            activeData = new LinkedHashMap();
        }
        String strUserIds = activeData.get(WFConsts.WFSENDCOPY) == null ? "" : activeData.get(WFConsts.WFSENDCOPY).toString();
        if (ObjectUtils.isEmpty(strUserIds)) {
            throw new Exception("未传入抄送用户");
        }

        Map<String, Employee> employees = getEmployeeMap(strUserIds.split("[,]"));

        Task task = this.getProcessEngine().getTaskService().createTaskQuery().taskId(strTaskId).singleResult();
        if (ObjectUtils.isEmpty(task)) {
            throw new Exception(String.format("未能获取到[%1$s]运行任务", strTaskId));
        }

        ProcessInstance processInstance = this.getProcessEngine().getRuntimeService().createProcessInstanceQuery().processInstanceId(task.getProcessInstanceId()).singleResult();
        if (processInstance == null) {
            throw new Exception(String.format("获取流程实例[%1$s]失败", task.getProcessInstanceId()));
        }

        // 生成抄送任务
        saveSendCopyTask(task.getDescription(), String.join(";", employees.keySet()), task.getCategory(), String.valueOf(strDataEntity), task.getId(), processInstance.getProcessDefinitionKey(), task.getTaskDefinitionKey(), processInstance.getProcessDefinitionName(), task.getName(), processInstance.getBusinessKey());

        //创建抄送历史记录
        createHistoryRecord(WFUtilAction.SENDCOPY, task, activeData);

    }

    @Override
    protected void onMarkReadWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
        // 默认为类型为待办
        WFTaskType tasktype = WFTaskType.TODO;

        // String userId =
        // AuthenticationUser.getAuthenticationUser().getPersonid();
        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

        String srfwf = null;

        // if (StringUtils.isEmpty(userId)) {
        // throw new BadRequestAlertException("未传入当前用户", entity, businessKey);
        // }

        if (ObjectUtils.isEmpty(strTaskId)) {
            strTaskId = wfTaskWay.getTaskId();
        }
        // 获取抄送标记
        if (!ObjectUtils.isEmpty(wfTaskWay.get("srfwf"))) {
            srfwf = String.valueOf(wfTaskWay.get("srfwf"));
            tasktype = WFTaskType.valueOf(srfwf.toUpperCase());
        }

        if (tasktype == WFTaskType.TODO) {
            Task task = this.getProcessEngine().getTaskService().createTaskQuery().taskId(strTaskId).singleResult();
            if (ObjectUtils.isEmpty(task)) {
                // throw new BadRequestAlertException("未找到运行时任务", "", "");
                throw new Exception("未找到运行时任务");
            }
            // 将待办任务标记为已读
            markReadTodoTask(task, iEmployeeContext.getUserid());
        } else if (tasktype == WFTaskType.HAVEREAD) {
            // 将抄送任务标记为已读
            markReadSCTask(strTaskId, iEmployeeContext.getUserid());
        } else {
            // throw new
            // BadRequestAlertException(String.format("未支持将[%s]类型待办标记为已读",
            // srfwf), "", "");
            throw new Exception(String.format("未支持将[%1$s]类型待办标记为已读", srfwf));
        }
    }

    @Override
    protected void onJumpWFInstance(String strSystemTag, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag) throws Throwable {
        // 步骤检查
        Object taskDefinitionKey = wfInstance.get("taskdefinitionkey");
        if (ObjectUtils.isEmpty(taskDefinitionKey)) {
            // throw new BadRequestAlertException("未传入跳转步骤", "", "");
            throw new Exception("未传入跳转步骤");
        }

        Object wfuser = wfInstance.get("wfusers");
        if (ObjectUtils.isEmpty(wfuser)) {
            // throw new BadRequestAlertException("未传入流程步骤用户", "", "");
            throw new Exception("未传入流程步骤用户");
        }

        // 查询流程实例
        if (!ObjectUtils.isEmpty(wfInstance.getId())) {
            // instance = instanceService.get(instance.getId());
            wfInstance = this.getWFInstance(wfInstance.getId(), false);
        }

        if (ObjectUtils.isEmpty(wfInstance.getRealInstId())) {
            // throw new BadRequestAlertException("未能获取流程实例信息", "", "");
            throw new Exception("未能获取流程实例信息");
        }
        String strProcessDefinitionKey =  wfInstance.getProcessDefinitionKey();
        if(!StringUtils.hasLength(strProcessDefinitionKey)){
            strProcessDefinitionKey = (String) wfInstance.get("processdefinitionkey");
        }
        UserTask userTask = getModelStepByKey(strProcessDefinitionKey).get(taskDefinitionKey);
        if (ObjectUtils.isEmpty(userTask)) {
            // throw new BadRequestAlertException("未能获取跳转步骤信息", "", "");
            throw new Exception("未能获取跳转步骤信息");
        }

        // 判断目标步骤是否允许跳转
        boolean isAllowJump = false;
        List<String> candidateUsers = userTask.getCandidateUsers();
        if (!ObjectUtils.isEmpty(candidateUsers)) {
            // 多实例，判断candidateuser中是否包含预置用户（activedata.srfwfpredefinedusers）
            if (candidateUsers.size() == 1 && "${candidateUsers}".equals(candidateUsers.get(0))) {
                String strCandidate = FlowableUtils.getElementParam(userTask, "form", "candidateUsersList");
                if (!ObjectUtils.isEmpty(strCandidate) && strCandidate.contains(String.format("activedata.%s", WFConsts.WFSTEP_PREDEFINED_USER))) {
                    isAllowJump = true;
                }
            } else {
                // 单实例，判断candidateuser中是否包含预置用户（activedata.srfwfpredefinedusers）
                for (String candidateUser : candidateUsers) {
                    if (candidateUser.contains(String.format("activedata.%s", WFConsts.WFSTEP_PREDEFINED_USER))) {
                        isAllowJump = true;
                        break;
                    }
                }
            }
        }

        if (!isAllowJump) {
            // throw new BadRequestAlertException("当前流程步骤不支持跳转", "", "");
            throw new Exception("当前流程步骤不支持跳转");
        }

        // 用户检查
        Map<String, Employee> users = new LinkedHashMap<>();
        String[] ids = wfuser.toString().split("[,]");
        Collection<Employee> employees = this.getEmployees(ids);
        employees.forEach(t -> {
            users.put(t.getUserId(), t);
        });

        if (ids.length != users.size()) {
            for (String strId : ids) {
                if (users.get(strId) == null) {
                    throw new Exception(String.format("用户[%1$s]不存在", strId));
                }
            }
        }

        // 替换system，解决回调业务系统时runtime重构异常
        // AuthenticationUser user = AuthenticationUser.getAuthenticationUser();
        // String dcId = user.getSrfdcid();
        // String systemId = instance.getDcsystemid();
        // if (!StringUtils.isEmpty(dcId) && !StringUtils.isEmpty(systemId)) {
        // SysDCSystemSearchContext ctx = new SysDCSystemSearchContext();
        // ctx.setN_srfdcid_eq(dcId);
        // ctx.setN_systemid_eq(systemId);
        // List<SysDCSystem> dcsystems =
        // iSysDCSystemService.searchDefault(ctx).getContent();
        // if (!ObjectUtils.isEmpty(dcsystems)) {
        // SysDCSystem dcSystem = dcsystems.get(0);
        // user.setSrfsystemid(dcSystem.getSystemid());
        // user.setSrfdcsystemid(dcSystem.getDcsystemid());
        // }
        // }

        // 准备流程参数
        Map<String, Object> activeData = new LinkedHashMap<>();
        // 填充用户信息
        activeData.put(WFConsts.WFSTEP_PREDEFINED_USER, wfuser.toString());
        activeData.put(WFConsts.WF_TAG, WFConsts.TASK_JUMP);
        this.getProcessEngine().getRuntimeService().setVariableLocal(wfInstance.getRealInstId(), WFConsts.ACTIVEDATA, activeData);

        // 查询跳转下所有同节点实例，执行跳转
        List<String> executionIds = new ArrayList<>();
        List<Execution> executions = this.getProcessEngine().getRuntimeService().createExecutionQuery().parentId(wfInstance.getRealInstId()).list();
        executions.forEach(execution -> executionIds.add(execution.getId()));

        // 获取当前任务，记录审批日志
        List<Task> tasks = this.getProcessEngine().getTaskService().createTaskQuery().processInstanceId(wfInstance.getRealInstId()).list();
        if (ObjectUtils.isEmpty(tasks)) {
            // throw new BadRequestAlertException("获取运行时任务失败", "", "");
            throw new Exception("获取运行时任务失败");
        }
        Task currentTask = tasks.get(0);
        // 执行跳转
        this.getProcessEngine().getRuntimeService().createChangeActivityStateBuilder().moveExecutionsToSingleActivityId(executionIds, userTask.getId()).changeState();
        // 生成历史记录
        this.createHistoryRecord(WFUtilAction.JUMP, currentTask, activeData);
    }

    @Override
    protected WFInstance onRegisterWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag) throws Throwable {
        String strWFInstanceId = KeyValueUtils.genUniqueId(strSystemTag, strDataEntity, strKey);
        wfInstance.setId(strWFInstanceId);

        this.saveWFInstance(wfInstance);
        return wfInstance;
    }

    @Override
    protected void onUnregisterWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag) throws Throwable {
        String strWFInstanceId = KeyValueUtils.genUniqueId(strSystemTag, strDataEntity, strKey);// DigestUtils.md5DigestAsHex(String.format("%s||%s||%s"
        // ,system,entity,businessKey).getBytes());
        this.removeWFInstance(strWFInstanceId);
    }

    @Override
    protected int onGetWFInstanceAccessMode(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag) throws Throwable {

        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
        List<Task> tasks = this.getProcessEngine().getTaskService().createTaskQuery().taskCandidateOrAssigned(iEmployeeContext.getUserid()).taskCategory(strKey).listPage(0, 1);
        if (!ObjectUtils.isEmpty(tasks)) {
            return WFConsts.ACCESSMODE_UPDATE;
        }

        // 流程参与者
        // List<?> list
        // =this.getFlowableRuntimeServiceEx().searchHistoryTask(strKey,
        // iEmployeeContext.getUserid());
        Execution execution = this.getFlowableRuntimeServiceEx().selectOneHistoryTask(strKey, iEmployeeContext.getUserid());
        if (execution != null) {
            return WFConsts.ACCESSMODE_READ;
        }

        // List<Map> historyTask = wfCoreMapper.searchHistoryTask(param);
        // if (!ObjectUtils.isEmpty(historyTask)) {
        // return WFConsts.ACCESSMODE_READ;
        // }
        return WFConsts.ACCESSMODE_DENY;
    }


    @Override
    protected WFEditableFields onGetWFInstanceEditableFields(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag) throws Throwable {

        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

        WFEditableFields wfEditableFields = new WFEditableFields();

        TaskQuery taskQuery = this.getProcessEngine().getTaskService().createTaskQuery().taskCandidateOrAssigned(iEmployeeContext.getUserid()).taskCategory(strKey);
        List<Task> tasks = taskQuery.orderByTaskCreateTime().desc().listPage(0, 1);
        if (!ObjectUtils.isEmpty(tasks)) {
            Task task = tasks.get(0);
            String processdefid = task.getProcessDefinitionId();
            String taskdefkey = task.getTaskDefinitionKey();
            if (!ObjectUtils.isEmpty(processdefid) && !ObjectUtils.isEmpty(taskdefkey)) {
                LinkedHashMap<String, UserTask> userTasks = getModelStepById(processdefid);
                if (!ObjectUtils.isEmpty(userTasks)) {
                    UserTask userTask = userTasks.get(taskdefkey);
                    if (userTask != null) {
                        String isEdit = FlowableUtils.getElementParam(userTask, "form", "isEditable");
                        String editMode = FlowableUtils.getElementParam(userTask, "form", "editMode");
                        String editFields = FlowableUtils.getElementParam(userTask, "form", "editFields");
                        List<String> fieldMap = ObjectUtils.isEmpty(editFields) ? new ArrayList<String>() : Arrays.asList(editFields.split(";"));
                        if (!ObjectUtils.isEmpty(isEdit) && Boolean.parseBoolean(isEdit) == true) {
                            wfEditableFields.setEditMode(editMode);
                            wfEditableFields.setFieldMap(fieldMap);
                        }
                    }
                }
            }
        }

        return wfEditableFields;
    }

    /**
     * 获取流程前一步
     *
     * @param processInstanceId
     * @return
     */
    protected ActivityInstance getLastActivityInstance(String processInstanceId) {
        List<ActivityInstance> historyActivitys = this.getProcessEngine().getRuntimeService().createActivityInstanceQuery().processInstanceId(processInstanceId).finished().orderByActivityInstanceStartTime().desc().orderByActivityInstanceId().desc().list();

        ActivityInstance beforestep = null;
        for (ActivityInstance historyActivity : historyActivitys) {
            if (historyActivity.getActivityType().equals(BpmnXMLConstants.ELEMENT_TASK_USER) || historyActivity.getActivityType().equals(BpmnXMLConstants.ELEMENT_EVENT_START)) {
                beforestep = historyActivity;
                break;
            }
        }
        return beforestep;
    }

    /**
     * 流程回退校验
     *
     * @param task
     */
    protected void testSendBackWFTaskWay(Task task) throws Throwable {
        // AuthenticationUser user = AuthenticationUser.getAuthenticationUser();
        // if(user == null)
        // throw new BadRequestAlertException("操作失败，无法获取当前用户信息","","");

        // 流程实例标识
        String processInstanceId = task.getProcessInstanceId();

        // 1、判断当前步骤用户是否已经办理
        List<ActivityInstance> historyActivities = this.getProcessEngine().getRuntimeService().createActivityInstanceQuery().processInstanceId(processInstanceId).orderByActivityInstanceStartTime().desc().orderByActivityInstanceId().desc().list();

        // 当前已完成任务
        Map<String, ActivityInstance> currentFinishTaskMap = new LinkedHashMap<>();
        ActivityInstance beginTask = null;
        if (!ObjectUtils.isEmpty(historyActivities)) {
            boolean begin = false;
            for (ActivityInstance historyActivity : historyActivities) {
                if (historyActivity.getActivityType().equals(BpmnXMLConstants.ELEMENT_TASK_USER)) {
                    if (!ObjectUtils.isEmpty(historyActivity.getEndTime())) {
                        currentFinishTaskMap.put(historyActivity.getId(), historyActivity);
                        // 记录第一个开始节点
                        if (beginTask == null) {
                            beginTask = historyActivity;
                        }
                    }
                    begin = true;
                }
                // 找出不匹配的最后一个节点
                if (begin && !historyActivity.getActivityType().equals(BpmnXMLConstants.ELEMENT_TASK_USER)) {
                    break;
                }
            }
        }
        if (currentFinishTaskMap.size() > 0) {
            // throw new
            // BadRequestAlertException("当前流程已经被用户处理，不允许进行退回操作","","");
            throw new Exception("当前流程已经被用户处理，不允许进行退回操作");
        }
    }

    /**
     * 生成抄送任务
     *
     * @return
     */
    protected void saveSendCopyTask(String title, String userIds, String businesskey, String entity, String param01, String param02, String param03, String param04, String param05, String clobparam01) throws Throwable {

    }

    /**
     * 流程撤回校验 1、判断当前步骤用户是否已经办理 2、判断上一步是否有多人参与审批 3、判断当前用户是否为上一步的流程操作者
     *
     * @param processInstanceId
     */
    protected void testWithdrawWFTaskWay(String processInstanceId) throws Throwable {

        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
        // AuthenticationUser user = AuthenticationUser.getAuthenticationUser();
        // if(user == null)
        // throw new BadRequestAlertException("操作失败，无法获取当前用户信息","","");

        // 1、判断当前步骤用户是否已经办理
        List<ActivityInstance> historyActivities = this.getProcessEngine().getRuntimeService().createActivityInstanceQuery().processInstanceId(processInstanceId).orderByActivityInstanceStartTime().desc().orderByActivityInstanceId().desc().list();

        // 当前已完成任务
        Map<String, ActivityInstance> currentFinishTaskMap = new LinkedHashMap<>();
        ActivityInstance beginTask = null;
        ActivityInstance endTask = null;
        if (!ObjectUtils.isEmpty(historyActivities)) {
            boolean begin = false;
            for (ActivityInstance historyActivity : historyActivities) {
                if (historyActivity.getActivityType().equals(BpmnXMLConstants.ELEMENT_TASK_USER)) {
                    if (!ObjectUtils.isEmpty(historyActivity.getEndTime())) {
                        currentFinishTaskMap.put(historyActivity.getId(), historyActivity);
                        // 记录第一个开始节点
                        if (beginTask == null) {
                            beginTask = historyActivity;
                        }
                    }
                    begin = true;
                }
                // 找出不匹配的最后一个节点
                if (begin && !historyActivity.getActivityType().equals(BpmnXMLConstants.ELEMENT_TASK_USER)) {
                    endTask = historyActivity;
                    break;
                }
            }
        }

        if (currentFinishTaskMap.size() > 0) {
            // throw new
            // BadRequestAlertException("当前流程已经被用户处理，不允许进行撤回操作","","");
            throw new Exception("当前流程已经被用户处理，不允许进行撤回操作");
        }

        // 2、判断上一步是否有多人参与审批
        boolean flag = false;
        boolean startTask = false;
        Map<String, ActivityInstance> beforeFinishTaskMap = new LinkedHashMap<>();
        for (ActivityInstance historyActivity : historyActivities) {
            if (endTask != null && historyActivity.getId().equals(endTask.getId())) {
                flag = true;
            }
            // 从倒数第二步开始计算
            if (flag) {
                if ((historyActivity.getActivityType().equals(BpmnXMLConstants.ELEMENT_TASK_USER) || historyActivity.getActivityType().equals(BpmnXMLConstants.ELEMENT_EVENT_START)) && !ObjectUtils.isEmpty(historyActivity.getEndTime()) && ObjectUtils.isEmpty(historyActivity.getDeleteReason())) {
                    if (historyActivity.getActivityType().equals(BpmnXMLConstants.ELEMENT_EVENT_START)) {
                        beforeFinishTaskMap.put(BpmnXMLConstants.ELEMENT_EVENT_START, historyActivity);
                        startTask = true;
                    } else if (!ObjectUtils.isEmpty(historyActivity.getTaskId())) {
                        beforeFinishTaskMap.put(historyActivity.getTaskId(), historyActivity);
                    }
                }
                // 设置退出条件
                if (!ObjectUtils.isEmpty(beforeFinishTaskMap) && !historyActivity.getActivityType().equals(BpmnXMLConstants.ELEMENT_TASK_USER)) {
                    break;
                }
            }

        }
        if (beforeFinishTaskMap.size() >= 2) {
            // throw new BadRequestAlertException("上一步有多人参与审批，不允许进行撤回操作","","");
            throw new Exception("上一步有多人参与审批，不允许进行撤回操作");
        }

        // 3、判断当前用户是否为上一步的流程操作者
        boolean isContainUser = false;

        // 管理员撤回
        if (iEmployeeContext.isSuperuser()) {
            isContainUser = true;
        } else if (startTask) {// 流程首次提交后撤回
            HistoricProcessInstance hisProcessInstance = this.getProcessEngine().getHistoryService().createHistoricProcessInstanceQuery().processInstanceId(processInstanceId).singleResult();
            if (hisProcessInstance != null && hisProcessInstance.getStartUserId().equals(iEmployeeContext.getUserid())) {
                isContainUser = true;
            }
        } else {
            // 查询流程历史任务
            List<HistoricTaskInstance> historyTasks = this.getProcessEngine().getHistoryService().createHistoricTaskInstanceQuery().includeIdentityLinks().processInstanceId(processInstanceId).orderByHistoricTaskInstanceEndTime().desc().list();

            // 流程撤回
            if (!ObjectUtils.isEmpty(beforeFinishTaskMap) && !ObjectUtils.isEmpty(historyTasks)) {
                for (HistoricTaskInstance historyTask : historyTasks) {
                    // 查找上一步的task
                    if (beforeFinishTaskMap.containsKey(historyTask.getId())) {
                        // 查找上一步task的处理人
                        if (!ObjectUtils.isEmpty(historyTask.getIdentityLinks())) {
                            // 当前用户是否为上一步操作者
                            for (IdentityLinkInfo link : historyTask.getIdentityLinks()) {
                                if (link.getUserId().equals(iEmployeeContext.getUserid())) {
                                    isContainUser = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (isContainUser)
                        break;
                }
            }
        }

        if (!isContainUser) {
            throw new Exception("当前用户不属于上一步的流程操作者,无权限进行此操作");
            // throw new
            // BadRequestAlertException("当前用户不属于上一步的流程操作者,无权限进行此操作","","");
        }
    }

    /**
     * 工作流部署
     *
     * @param bpmnFileName
     * @param bpmnFile
     * @return
     */
    public synchronized WFDefinition createWFDefinition(String bpmnFileName, ByteArrayOutputStream bpmnFile) throws Throwable {

        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

        // String deployInfo = "";
        if (bpmnFile == null) {
            // deployInfo += String.format("解析失败，无法获取流程文件[%s] \r\n",
            // bpmnFileName);
            // wfModel.setName(deployInfo);
            // return false;
            throw new Exception(String.format("解析失败，无法获取流程文件[%s]", bpmnFileName));
        }

        XMLStreamReader reader = null;
        InputStream inputStream = null;

        // String srfdcid = AuthenticationUser.getAuthenticationUser() == null ?
        // null : AuthenticationUser.getAuthenticationUser().getSrfdcid();
        // User flowableUser = SecurityUtils.getCurrentUserObject();
        // if(flowableUser == null){
        // flowableUser = getCurrentUserObject();
        // SecurityUtils.assumeUser(flowableUser);
        // }

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            inputStream = new ByteArrayInputStream(bpmnFile.toByteArray());
            reader = factory.createXMLStreamReader(inputStream);
            BpmnModel model = FlowableUtils.BpmnXMLConverter.convertToBpmnModel(reader);
            Process curProcess = model.getMainProcess();
            // 获取工作流模型
            WFModel wfModel = FlowableUtils.getWFModel(model, bpmnFileName);

            if (!ObjectUtils.isEmpty(wfModel.getName())) {
                wfModel.setName(wfModel.getName());
                // return false;
                return null;
            }

            // 创建工作流用户组
            // String refgroups = wfModel.getRefgroup();
            // if (!StringUtils.isEmpty(refgroups)) {
            // List<WFGroup> listGroup = new ArrayList<>();
            // for (String refgroup : refgroups.split(",")) {
            // String[] groupParam = refgroup.split("[\\|]");
            // if (groupParam.length == 3) {
            // WFGroup wfGroup = new WFGroup();
            // String groupId = StringUtils.isEmpty(srfdcid)
            // ?groupParam[0]:String.format("%s-%s",srfdcid,groupParam[0]);
            // wfGroup.setId(groupId);
            // wfGroup.setName(groupParam[1]);
            // wfGroup.setGroupscope(groupParam[2]);
            // wfGroup.setGroupcode(groupParam[0]);
            // listGroup.add(wfGroup);
            // }
            // }
            // if (listGroup.size() > 0) {
            // iwfGroupService.saveBatch(listGroup);
            // }
            // }

            // 流程配置信息
            String system = wfModel.get("system").toString();
            String workflow = wfModel.get("workflow").toString();
            String dynaModelId = wfModel.get("dynaModelId").toString();
            String processDefinitionKey = wfModel.get("processDefinitionKey").toString();
            Integer version = Integer.parseInt(wfModel.get("version").toString());
            String wfdes = wfModel.getRefDataEntity();
            int isValid = wfModel.getIsValid();
            boolean bchange = false;

            Map<String, String> bookingapps = (Map<String, String>) wfModel.get("bookingapps");
            Map<String, String> bookingmobs = (Map<String, String>) wfModel.get("bookingmobs");

            // ModelService modelService =
            // RuntimeObjectFactory.getInstance().getObject(ModelService.class);
            //
            // ModelKeyRepresentation appKeyInfo =
            // modelService.validateModelKey(null, AbstractModel.MODEL_TYPE_APP,
            // system);
            // if (!appKeyInfo.isKeyAlreadyExists()) {
            // ModelRepresentation modelRepresentation = new
            // ModelRepresentation();
            // modelRepresentation.setKey(system);
            // modelRepresentation.setName(system);
            // modelRepresentation.setModelType(AbstractModel.MODEL_TYPE_APP);
            // String json = modelService.createModelJson(modelRepresentation);
            // appKeyInfo.setId(modelService.createModel(modelRepresentation,
            // json, flowableUser).getId());
            // }
            //
            // AppDefinitionRepresentation appModel =
            // appDefinitionService.getAppDefinition(appKeyInfo.getId());

            // 部署工作流
            for (String wfde : wfdes.split(",")) {
                String webServiceIds = getAppId(system, wfde, bookingapps);
                String mobServiceIds = getAppId(system, wfde, bookingmobs);
                processDefinitionKey = String.format(processDefinitionKey, wfde);

                String bmpmfileId = FlowableUtils.getBpmnFileId(bpmnFile, processDefinitionKey);

                WFDefinition old = getWFDefinition(processDefinitionKey, true);

                if (old != null && bmpmfileId.equals(old.getMD5Check())) {
                    log.warn("部署流程没有变化，忽略name:" + curProcess.getName() + " key " + processDefinitionKey + " deployid " + bmpmfileId);
                    // deployInfo += curProcess.getName() + " key:" +
                    // processDefinitionKey + "，流程配置没有变化，忽略发布" + "\r\n";
                    // wfModel.setName(deployInfo);
                    // continue;
                    return null;
                } else {
                    // 新部署，创建流程定义，调用flowable部署流程
                    WFDefinition wfProcessDefinition = new WFDefinition();
                    wfProcessDefinition.setDefinitionKey(processDefinitionKey);
                    wfProcessDefinition.setDeployKey(processDefinitionKey);
                    wfProcessDefinition.setPSSystemId(system);
                    wfProcessDefinition.setModelEnable(isValid);
                    wfProcessDefinition.setModelVersion(version);
                    wfProcessDefinition.setDefinitionName(curProcess.getName());
                    wfProcessDefinition.setDynaModelId(dynaModelId);
                    if (!ObjectUtils.isEmpty(webServiceIds)) {
                        wfProcessDefinition.setWebServiceIds(webServiceIds);
                    }
                    if (!ObjectUtils.isEmpty(mobServiceIds)) {
                        wfProcessDefinition.setMobileServiceIds(mobServiceIds);
                    }

                    wfProcessDefinition.setDCSystemId(iEmployeeContext.getDcsystemid());
                    wfProcessDefinition.setSrfdcid(iEmployeeContext.getTenant());

                    BpmnModel entitymodel = FlowableUtils.getBpmnModel(bpmnFile, processDefinitionKey);

                    java.io.File tempFile = java.io.File.createTempFile(processDefinitionKey, ".bpmn20.xml");
                    String fileFullPath = tempFile.getCanonicalPath();
                    // String fileFullPath = this.fileRoot + "ibizutil" +
                    // File.separator + bmpmfileId + File.separator +
                    // processDefinitionKey + ".bpmn20.xml";
                    // 生成工作流bpmn文件
                    FlowableUtils.writeBpmnFile(entitymodel, fileFullPath);

                    File file = this.getSysFileUtilRuntime().createOSSFile(new java.io.File(fileFullPath));

                    // ObjectNode modelNode =
                    // bpmnJsonConverter.convertToJson(entitymodel);
                    // ModelRepresentation demodel = new ModelRepresentation();
                    // demodel.setKey(processDefinitionKey);
                    // demodel.setName(curProcess.getName());
                    // demodel.setDescription(curProcess.getDocumentation());
                    // demodel.setModelType(AbstractModel.MODEL_TYPE_BPMN);
                    // ModelKeyRepresentation modelKeyInfo =
                    // modelService.validateModelKey(null,
                    // AbstractModel.MODEL_TYPE_BPMN, processDefinitionKey);
                    // Model newModel = null;
                    //
                    // if (!modelKeyInfo.isKeyAlreadyExists()) {
                    // newModel = modelService.createModel(demodel, modelNode ==
                    // null ? "" : modelNode.toString(), flowableUser);
                    // } else {
                    // newModel = modelService.saveModel(modelKeyInfo.getId(),
                    // curProcess.getName(), processDefinitionKey,
                    // curProcess.getDocumentation(),
                    // modelNode == null ? "" : modelNode.toString(), true, "",
                    // flowableUser);
                    // }
                    //
                    // boolean replace = false;
                    // if (appModel.getDefinition() != null &&
                    // appModel.getDefinition().getModels() != null) {
                    // for (AppModelDefinition appdef :
                    // appModel.getDefinition().getModels()) {
                    // if (appdef.getId().equals(newModel.getId())) {
                    // appdef.setName(newModel.getName());
                    // appdef.setVersion(newModel.getVersion());
                    // appdef.setLastUpdated(newModel.getLastUpdated());
                    // appdef.setLastUpdatedBy(newModel.getLastUpdatedBy());
                    // appdef.setDescription(newModel.getDescription());
                    // replace = true;
                    // bchange = true;
                    // }
                    // }
                    // }
                    // if (!replace) {
                    // AppModelDefinition appdef = new AppModelDefinition();
                    // appdef.setId(newModel.getId());
                    // appdef.setName(newModel.getName());
                    // appdef.setVersion(newModel.getVersion());
                    // appdef.setCreatedBy(newModel.getCreatedBy());
                    // appdef.setModelType(newModel.getModelType());
                    // appdef.setLastUpdated(newModel.getLastUpdated());
                    // appdef.setLastUpdatedBy(newModel.getLastUpdatedBy());
                    // appdef.setDescription(newModel.getDescription());
                    // if (appModel.getDefinition() != null &&
                    // appModel.getDefinition().getModels() == null) {
                    // appModel.getDefinition().setModels(new ArrayList<>());
                    // }
                    // appModel.getDefinition().getModels().add(appdef);
                    // bchange = true;
                    // }

                    inputStream = new FileInputStream(new java.io.File(fileFullPath));
                    DeploymentBuilder deploymentBuilder = this.getProcessEngine().getRepositoryService().createDeployment().name(curProcess.getName()).key(processDefinitionKey).tenantId(iEmployeeContext.getTenant()).addInputStream(fileFullPath, inputStream);

                    Deployment deployment = deploymentBuilder.deploy();
                    wfProcessDefinition.setBPMNFile("[{\"id\":\"" + file.getOSSId() + "\",\"name\":\"" + processDefinitionKey + ".bpmn20.xml\"}]");
                    wfProcessDefinition.setMD5Check(bmpmfileId);
                    saveWFDefinition(wfProcessDefinition);

                    log.info("部署流程 name:" + curProcess.getName() + " key " + deployment.getKey() + " deployid " + deployment);
                    // deployInfo += curProcess.getName() + " key:" +
                    // processDefinitionKey + "，部署成功" + "\r\n";
                    // wfModel.setName(deployInfo);
                    return wfProcessDefinition;
                }
            }

            // if (bchange) {
            // AppDefinitionSaveRepresentation savemodel = new
            // AppDefinitionSaveRepresentation();
            // savemodel.setPublish(false);
            // savemodel.setAppDefinition(appModel);
            // appDefinitionService.updateAppDefinition(appModel.getId(),
            // savemodel);
            // }
            return null;
        } catch (Exception e) {
            log.error(bpmnFileName + "BPMN模型创建流程异常", e);
            throw new Exception(bpmnFileName + "BPMN模型创建流程异常", e);
            // deployInfo += bpmnFileName + "BPMN模型创建流程异常" + "\r\n";
            // wfModel.setName(deployInfo);
            // return false;
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Exception e) {
            }
        }
    }

    /**
     * 工作流部署(多实体)
     *
     * @param bpmnFileName
     * @param bpmnFile
     * @return
     */
    public synchronized List<WFDefinition> createWFDefinitions(String bpmnFileName, ByteArrayOutputStream bpmnFile) throws Throwable {

        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

        // String deployInfo = "";
        if (bpmnFile == null) {
            // deployInfo += String.format("解析失败，无法获取流程文件[%s] \r\n",
            // bpmnFileName);
            // wfModel.setName(deployInfo);
            // return false;
            throw new Exception(String.format("解析失败，无法获取流程文件[%s]", bpmnFileName));
        }

        XMLStreamReader reader = null;
        InputStream inputStream = null;

        // String srfdcid = AuthenticationUser.getAuthenticationUser() == null ?
        // null : AuthenticationUser.getAuthenticationUser().getSrfdcid();
        // User flowableUser = SecurityUtils.getCurrentUserObject();
        // if(flowableUser == null){
        // flowableUser = getCurrentUserObject();
        // SecurityUtils.assumeUser(flowableUser);
        // }

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            inputStream = new ByteArrayInputStream(bpmnFile.toByteArray());
            reader = factory.createXMLStreamReader(inputStream);
            BpmnModel model = FlowableUtils.BpmnXMLConverter.convertToBpmnModel(reader);
            Process curProcess = model.getMainProcess();
            // 获取工作流模型
            WFModel wfModel = FlowableUtils.getWFModel(model, bpmnFileName);

            if (!ObjectUtils.isEmpty(wfModel.getName())) {
                wfModel.setName(wfModel.getName());
                // return false;
                return null;
            }

            // 创建工作流用户组
            // String refgroups = wfModel.getRefgroup();
            // if (!StringUtils.isEmpty(refgroups)) {
            // List<WFGroup> listGroup = new ArrayList<>();
            // for (String refgroup : refgroups.split(",")) {
            // String[] groupParam = refgroup.split("[\\|]");
            // if (groupParam.length == 3) {
            // WFGroup wfGroup = new WFGroup();
            // String groupId = StringUtils.isEmpty(srfdcid)
            // ?groupParam[0]:String.format("%s-%s",srfdcid,groupParam[0]);
            // wfGroup.setId(groupId);
            // wfGroup.setName(groupParam[1]);
            // wfGroup.setGroupscope(groupParam[2]);
            // wfGroup.setGroupcode(groupParam[0]);
            // listGroup.add(wfGroup);
            // }
            // }
            // if (listGroup.size() > 0) {
            // iwfGroupService.saveBatch(listGroup);
            // }
            // }

            // 流程配置信息
            String system = wfModel.get("system").toString();
            String workflow = wfModel.get("workflow").toString();
            String dynaModelId = wfModel.get("dynaModelId").toString();
            String processDefinitionKey = wfModel.get("processDefinitionKey").toString();
            Integer version = Integer.parseInt(wfModel.get("version").toString());
            String wfdes = wfModel.getRefDataEntity();
            int isValid = wfModel.getIsValid();
            boolean bchange = false;

            Map<String, String> bookingapps = (Map<String, String>) wfModel.get("bookingapps");
            Map<String, String> bookingmobs = (Map<String, String>) wfModel.get("bookingmobs");

            // ModelService modelService =
            // RuntimeObjectFactory.getInstance().getObject(ModelService.class);
            //
            // ModelKeyRepresentation appKeyInfo =
            // modelService.validateModelKey(null, AbstractModel.MODEL_TYPE_APP,
            // system);
            // if (!appKeyInfo.isKeyAlreadyExists()) {
            // ModelRepresentation modelRepresentation = new
            // ModelRepresentation();
            // modelRepresentation.setKey(system);
            // modelRepresentation.setName(system);
            // modelRepresentation.setModelType(AbstractModel.MODEL_TYPE_APP);
            // String json = modelService.createModelJson(modelRepresentation);
            // appKeyInfo.setId(modelService.createModel(modelRepresentation,
            // json, flowableUser).getId());
            // }
            //
            // AppDefinitionRepresentation appModel =
            // appDefinitionService.getAppDefinition(appKeyInfo.getId());

            // 部署工作流
            List<WFDefinition> WFDefinitions = new ArrayList<WFDefinition>();
            for (String wfde : wfdes.split(",")) {
                String webServiceIds = getAppId(system, wfde, bookingapps);
                String mobServiceIds = getAppId(system, wfde, bookingmobs);
                processDefinitionKey = String.format(processDefinitionKey, wfde);

                String bmpmfileId = FlowableUtils.getBpmnFileId(bpmnFile, processDefinitionKey);

                WFDefinition old = getWFDefinition(processDefinitionKey, true);

                if (old != null && bmpmfileId.equals(old.getMD5Check())) {
                    log.warn("部署流程没有变化，忽略name:" + curProcess.getName() + " key " + processDefinitionKey + " deployid " + bmpmfileId);
                    // deployInfo += curProcess.getName() + " key:" +
                    // processDefinitionKey + "，流程配置没有变化，忽略发布" + "\r\n";
                    // wfModel.setName(deployInfo);
                    // continue;
                    return null;
                } else {
                    // 新部署，创建流程定义，调用flowable部署流程
                    WFDefinition wfProcessDefinition = new WFDefinition();
                    wfProcessDefinition.setDefinitionKey(processDefinitionKey);
                    wfProcessDefinition.setDeployKey(processDefinitionKey);
                    wfProcessDefinition.setPSSystemId(system);
                    wfProcessDefinition.setModelEnable(isValid);
                    wfProcessDefinition.setModelVersion(version);
                    wfProcessDefinition.setDefinitionName(curProcess.getName());
                    wfProcessDefinition.setDynaModelId(dynaModelId);
                    if (!ObjectUtils.isEmpty(webServiceIds)) {
                        wfProcessDefinition.setWebServiceIds(webServiceIds);
                    }
                    if (!ObjectUtils.isEmpty(mobServiceIds)) {
                        wfProcessDefinition.setMobileServiceIds(mobServiceIds);
                    }

                    wfProcessDefinition.setDCSystemId(iEmployeeContext.getDcsystemid());
                    wfProcessDefinition.setSrfdcid(iEmployeeContext.getTenant());

                    BpmnModel entitymodel = FlowableUtils.getBpmnModel(bpmnFile, processDefinitionKey);

                    java.io.File tempFile = java.io.File.createTempFile(processDefinitionKey, ".bpmn20.xml");
                    String fileFullPath = tempFile.getCanonicalPath();
                    // String fileFullPath = this.fileRoot + "ibizutil" +
                    // File.separator + bmpmfileId + File.separator +
                    // processDefinitionKey + ".bpmn20.xml";
                    // 生成工作流bpmn文件
                    FlowableUtils.writeBpmnFile(entitymodel, fileFullPath);

                    File file = this.getSysFileUtilRuntime().createOSSFile(new java.io.File(fileFullPath));

                    // ObjectNode modelNode =
                    // bpmnJsonConverter.convertToJson(entitymodel);
                    // ModelRepresentation demodel = new ModelRepresentation();
                    // demodel.setKey(processDefinitionKey);
                    // demodel.setName(curProcess.getName());
                    // demodel.setDescription(curProcess.getDocumentation());
                    // demodel.setModelType(AbstractModel.MODEL_TYPE_BPMN);
                    // ModelKeyRepresentation modelKeyInfo =
                    // modelService.validateModelKey(null,
                    // AbstractModel.MODEL_TYPE_BPMN, processDefinitionKey);
                    // Model newModel = null;
                    //
                    // if (!modelKeyInfo.isKeyAlreadyExists()) {
                    // newModel = modelService.createModel(demodel, modelNode ==
                    // null ? "" : modelNode.toString(), flowableUser);
                    // } else {
                    // newModel = modelService.saveModel(modelKeyInfo.getId(),
                    // curProcess.getName(), processDefinitionKey,
                    // curProcess.getDocumentation(),
                    // modelNode == null ? "" : modelNode.toString(), true, "",
                    // flowableUser);
                    // }
                    //
                    // boolean replace = false;
                    // if (appModel.getDefinition() != null &&
                    // appModel.getDefinition().getModels() != null) {
                    // for (AppModelDefinition appdef :
                    // appModel.getDefinition().getModels()) {
                    // if (appdef.getId().equals(newModel.getId())) {
                    // appdef.setName(newModel.getName());
                    // appdef.setVersion(newModel.getVersion());
                    // appdef.setLastUpdated(newModel.getLastUpdated());
                    // appdef.setLastUpdatedBy(newModel.getLastUpdatedBy());
                    // appdef.setDescription(newModel.getDescription());
                    // replace = true;
                    // bchange = true;
                    // }
                    // }
                    // }
                    // if (!replace) {
                    // AppModelDefinition appdef = new AppModelDefinition();
                    // appdef.setId(newModel.getId());
                    // appdef.setName(newModel.getName());
                    // appdef.setVersion(newModel.getVersion());
                    // appdef.setCreatedBy(newModel.getCreatedBy());
                    // appdef.setModelType(newModel.getModelType());
                    // appdef.setLastUpdated(newModel.getLastUpdated());
                    // appdef.setLastUpdatedBy(newModel.getLastUpdatedBy());
                    // appdef.setDescription(newModel.getDescription());
                    // if (appModel.getDefinition() != null &&
                    // appModel.getDefinition().getModels() == null) {
                    // appModel.getDefinition().setModels(new ArrayList<>());
                    // }
                    // appModel.getDefinition().getModels().add(appdef);
                    // bchange = true;
                    // }

                    inputStream = new FileInputStream(new java.io.File(fileFullPath));
                    DeploymentBuilder deploymentBuilder = this.getProcessEngine().getRepositoryService().createDeployment().name(curProcess.getName()).key(processDefinitionKey).tenantId(iEmployeeContext.getTenant()).addInputStream(fileFullPath, inputStream);

                    Deployment deployment = deploymentBuilder.deploy();
                    wfProcessDefinition.setBPMNFile("[{\"id\":\"" + file.getOSSId() + "\",\"name\":\"" + processDefinitionKey + ".bpmn20.xml\"}]");
                    wfProcessDefinition.setMD5Check(bmpmfileId);
                    saveWFDefinition(wfProcessDefinition);

                    log.info("部署流程 name:" + curProcess.getName() + " key " + deployment.getKey() + " deployid " + deployment);
                    // deployInfo += curProcess.getName() + " key:" +
                    // processDefinitionKey + "，部署成功" + "\r\n";
                    // wfModel.setName(deployInfo);
                    WFDefinitions.add(wfProcessDefinition);
                }
                return WFDefinitions;
            }

            // if (bchange) {
            // AppDefinitionSaveRepresentation savemodel = new
            // AppDefinitionSaveRepresentation();
            // savemodel.setPublish(false);
            // savemodel.setAppDefinition(appModel);
            // appDefinitionService.updateAppDefinition(appModel.getId(),
            // savemodel);
            // }
            return null;
        } catch (Exception e) {
            log.error(bpmnFileName + "BPMN模型创建流程异常", e);
            throw new Exception(bpmnFileName + "BPMN模型创建流程异常", e);
            // deployInfo += bpmnFileName + "BPMN模型创建流程异常" + "\r\n";
            // wfModel.setName(deployInfo);
            // return false;
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Exception e) {
            }
        }
    }

    private String getAppId(String system, String wfde, Map<String, String> wfdes) {
        String webServiceIds = "";
        if (wfdes.containsKey(wfde)) {
            String[] arr = wfdes.get(wfde).split(",");
            for (String str : arr) {
                if (StringUtils.isEmpty(str)) {
                    continue;
                }
                if (!StringUtils.isEmpty(webServiceIds)) {
                    webServiceIds += ",";
                }
                webServiceIds = webServiceIds + system + "-" + str;
            }
        }
        return webServiceIds;
    }

    protected LinkedHashMap<String, UserTask> getModelStepById(String definitionid) {
        LinkedHashMap<String, UserTask> userTasks = new LinkedHashMap<String, UserTask>();
        Map<String, UserTask> map = new HashMap<>();
        for (FlowElement f : this.getProcessEngine().getRepositoryService().getBpmnModel(definitionid).getMainProcess().getFlowElements()) {
            if (f instanceof SubProcess){
                for (FlowElement subf : ((SubProcess) f).getFlowElements()) {
                    if(subf instanceof UserTask) {
                        map.put(subf.getId(), (UserTask)subf);
                    }
                }
            }
            if (f instanceof UserTask) {
                map.put(f.getId(), (UserTask)f);
            }
        }
        List<Map.Entry<String, UserTask>> infoIds = new ArrayList<Map.Entry<String, UserTask>>(map.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<String, UserTask>>() {
            public int compare(Map.Entry<String, UserTask> o1, Map.Entry<String, UserTask> o2) {
                String p1 = o1.getKey();
                String p2 = o2.getKey();
                return p1.compareTo(p2);
            }
        });
        for (Map.Entry<String, UserTask> entity : infoIds) {
            userTasks.put(entity.getKey(), entity.getValue());
        }
        return userTasks;
    }

    protected LinkedHashMap<String, UserTask> getModelStepByKey(String definitionkey) {
        // long nTime = System.currentTimeMillis() ;
        LinkedHashMap<String, UserTask> allTask = new LinkedHashMap<String, UserTask>();
        List<ProcessDefinition> list = this.getProcessEngine().getRepositoryService().createProcessDefinitionQuery().processDefinitionKey(definitionkey).orderByProcessDefinitionVersion().desc().list();
        // log.debug(String.format("getRepositoryService().createProcessDefinitionQuery().processDefinitionKey(%1$s)耗时[%2$s]ms",
        // definitionkey, System.currentTimeMillis() - nTime));
        // nTime = System.currentTimeMillis() ;
        // boolean blastest = true;
        // for (ProcessDefinition def : list) {
        // nTime = System.currentTimeMillis() ;
        // LinkedHashMap<String, UserTask> userTasks =
        // getModelStepById(def.getId());
        // log.debug(String.format("getModelStepById(%1$s)耗时[%2$s]ms",
        // def.getId(), System.currentTimeMillis() - nTime));
        // if (blastest) {
        // allTask.putAll(userTasks);
        // blastest = false;
        // } else {
        // for (String key : userTasks.keySet()) {
        // if (!allTask.containsKey(key)) {
        // String taskName = userTasks.get(key).getName() + "-历史版本v" +
        // def.getVersion();
        // userTasks.get(key).setName(taskName);
        // allTask.put(key, userTasks.get(key));
        // }
        // }
        // }
        // }

        Map<String, Object> userTaskRetMap = new HashMap<String, Object>();
        if (list.size() > 2) {
            List<CompletableFuture<?>> taskList = new ArrayList<CompletableFuture<?>>();
            for (ProcessDefinition def : list) {
                CompletableFuture<Void> task = CompletableFuture.runAsync(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            LinkedHashMap<String, UserTask> userTasks = getModelStepById(def.getId());
                            userTaskRetMap.put(def.getId(), userTasks);
                        } catch (Throwable ex) {
                            userTaskRetMap.put(def.getId(), ex);
                        }
                    }
                });
                taskList.add(task);

                // this.getSystemRuntime().threadRun(new Runnable() {
                // @Override
                // public void run() {
                // try {
                // LinkedHashMap<String, UserTask> userTasks =
                // getModelStepById(def.getId());
                // userTaskRetMap.put(def.getId(), userTasks);
                // }
                // catch(Throwable ex) {
                // userTaskRetMap.put(def.getId(), ex);
                // }
                // }
                // });
            }

            try {
                CompletableFuture.allOf(taskList.toArray(new CompletableFuture<?>[taskList.size()])).get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            // while(true) {
            // if(userTaskRetMap.size() == list.size()) {
            // break;
            // }
            // else {
            // try {
            // Thread.sleep(10);
            // } catch (InterruptedException e) {
            // throw new RuntimeException(e);
            // }
            // }
            // }
        } else {
            for (ProcessDefinition def : list) {
                LinkedHashMap<String, UserTask> userTasks = getModelStepById(def.getId());
                userTaskRetMap.put(def.getId(), userTasks);
            }
        }

        boolean blastest = true;
        for (ProcessDefinition def : list) {
            Object objRet = userTaskRetMap.get(def.getId());
            LinkedHashMap<String, UserTask> userTasks = null;
            if (objRet instanceof LinkedHashMap) {
                userTasks = (LinkedHashMap) objRet;
            } else {
                if (objRet instanceof Throwable) {
                    throw new RuntimeException((Throwable) objRet);
                } else {
                    throw new RuntimeException("无法识别的返回内容");
                }
            }
            if (blastest) {
                allTask.putAll(userTasks);
                blastest = false;
            } else {
                for (String key : userTasks.keySet()) {
                    if (!allTask.containsKey(key)) {
                        if(!userTasks.get(key).getName().contains("-历史版本v" + def.getVersion())){
                            String taskName = userTasks.get(key).getName() + "-历史版本v" + def.getVersion();
                            userTasks.get(key).setName(taskName);
                        }
                        allTask.put(key, userTasks.get(key));
                    }
                }
            }
        }
        // log.debug(String.format("全部任务查询完成(%1$s)耗时[%2$s]ms", list.size(),
        // System.currentTimeMillis() - nTime));
        return allTask;
    }

    /**
     * 将流程表单设置到请求头中
     *
     * @param userTask
     */
    protected void setProcessForm(UserTask userTask) {
        Object objReq = RequestContextHolder.currentRequestAttributes();
        if (!ObjectUtils.isEmpty(objReq) && objReq instanceof ServletRequestAttributes) {
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpServletRequest req = attr.getRequest();
            Map<String, String> attributes = FlowableUtils.getElementParams(userTask, "form");
            if (!ObjectUtils.isEmpty(attributes)) {
                for (Map.Entry<String, String> entry : attributes.entrySet()) {
                    req.setAttribute(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /**
     * 设置流程表单
     *
     * @param sequenceFlow
     * @param way
     */
    protected void setTaskWayForm(SequenceFlow sequenceFlow, WFTaskWay way) {
        Map<String, String> attributes = FlowableUtils.getElementParams(sequenceFlow, "form");
        if (!ObjectUtils.isEmpty(attributes)) {
            for (Map.Entry<String, String> entry : attributes.entrySet()) {
                way.set(entry.getKey(), entry.getValue());
            }
        }
    }

    /**
     * 流程辅助功能
     *
     * @param userTask
     * @return
     */
    protected List<WFTaskWay> getProcessFunc(Application sysApp, Task task, UserTask userTask) {
        List<WFTaskWay> taskWays = new ArrayList<>();
        String procFuncs = FlowableUtils.getElementParam(userTask, "form", "procfunc");
        if (!ObjectUtils.isEmpty(procFuncs)) {
            Map<String, String> attributes = FlowableUtils.getElementParams(userTask, "form");
            for (String func : procFuncs.split(";")) {
                WFTaskWay taskWay = getWFTaskWay(sysApp, task, func, attributes);
                if (taskWay != null) {
                    taskWays.add(taskWay);
                }
            }
        }
        return taskWays;
    }

    /**
     * 通过流程实例获取activedata
     *
     * @param processInstanceId
     * @return
     */
    @Deprecated
    protected Map getLastActiveData(String processInstanceId) throws Throwable {
        Map activeData = new LinkedHashMap();

        // 查询前一步的流程用户
        List<ActivityInstance> wfSteps = this.getProcessEngine().getRuntimeService().createActivityInstanceQuery().processInstanceId(processInstanceId).finished().activityType(BpmnXMLConstants.ELEMENT_TASK_USER).orderByActivityInstanceStartTime().desc().list();
        if (ObjectUtils.isEmpty(wfSteps)) {
            // throw new BadRequestAlertException("撤回流程失败，无法获取撤回步骤信息","","");
            throw new Exception("无法获取撤回步骤信息");
        }
        String wfstepId = wfSteps.get(0).getId();
        List<HistoricVariableInstance> params = this.getProcessEngine().getHistoryService().createHistoricVariableInstanceQuery().processInstanceId(processInstanceId).list();
        if (params == null) {
            return activeData;
        }
        Map variables = new HashMap();
        params.forEach(item -> {
            variables.put(item.getVariableName(), item.getValue());
        });

        Object all_role_info = variables.get(String.format("wfstep-%s-stepuser", wfstepId));
        if (ObjectUtils.isEmpty(all_role_info))
            return activeData;

        // 重构activedata
        Map oldActiveData = this.getProcessEngine().getRuntimeService().getVariables(processInstanceId);
        if (oldActiveData != null) {
            activeData.putAll(oldActiveData);

            // JSONObject roleInfo =
            // JSONObject.parseObject(all_role_info.toString());
            // Object active = roleInfo.get("active");
            // Object group = roleInfo.get("group");

            Map roleInfo = JsonUtils.MAPPER.readValue(all_role_info.toString(), Map.class);
            Object active = roleInfo.get("active");
            Object group = roleInfo.get("group");

            if (active != null) {
                Set activeInfo = JsonUtils.MAPPER.convertValue(active, Set.class);
                if (activeInfo != null) {
                    Iterator<String> it = activeInfo.iterator();
                    while (it.hasNext()) {
                        String field = it.next();
                        Object fieldValue = variables.get(field);
                        activeData.put(field.replace(String.format("wfstep-%s-", wfstepId), ""), fieldValue);
                    }
                }
            }
            // group回填至activeData
            if (group != null) {
                // Set groupInfo =
                // mapper.readValue(mapper.writeValueAsString(group),
                // Set.class);
                Set groupInfo = JsonUtils.MAPPER.convertValue(group, Set.class);
                if (groupInfo != null) {
                    Iterator<String> it = groupInfo.iterator();
                    while (it.hasNext()) {
                        String field = it.next();
                        Object fieldValue = variables.get(field);
                        activeData.put(field.replace(String.format("wfstep-%s-", wfstepId), ""), fieldValue);
                    }
                }
            }
        }

        // try{
        //
        // }
        // catch(Exception e){
        // log.error("操作失败，无法获取撤回步骤的用户信息"+e);
        // throw new BadRequestAlertException("操作失败，无法获取撤回步骤的用户信息","","");
        // }
        return activeData;
    }

    /**
     * 生成历史记录（审批日志）
     * @param wfUtilAction 流程辅助功能类型
     * @param task         用户任务
     * @param activeData   上下文数据
     */
    protected void createHistoryRecord(WFUtilAction wfUtilAction, Task task, Map activeData) {

        Object sequenceflowname = activeData.get("sequenceflowname");
        String strSequenceflowname = ObjectUtils.isEmpty(sequenceflowname) ? wfUtilAction.text : sequenceflowname.toString();
        Object assignee = activeData.get("srfwfassignee");

        String strUserId = EmployeeContext.getCurrentMust().getUserid();
        String historyTaskId = UUID.randomUUID().toString().toLowerCase();
        TaskEntity historyTask = createTask(task);
        historyTask.setId(historyTaskId);
        historyTask.setOwner(strUserId);
        if (!ObjectUtils.isEmpty(assignee))
            historyTask.setAssignee(assignee.toString());
        historyTask.setScopeType(wfUtilAction.value.toUpperCase());
        historyTask.setName(strSequenceflowname);
        this.getProcessEngine().getTaskService().saveTask(historyTask);
        if (activeData.get(WFConsts.WFMEMO) != null) {
            String comment = activeData.get(WFConsts.WFMEMO).toString();
            this.getProcessEngine().getTaskService().addComment(historyTask.getId(), historyTask.getProcessInstanceId(), strSequenceflowname, comment);
        }
        //抄送不记录link
        if (WFUtilAction.SENDCOPY != wfUtilAction) {
            this.getProcessEngine().getTaskService().addUserIdentityLink(historyTask.getId(), strUserId, wfUtilAction.value);
            this.getProcessEngine().getTaskService().complete(historyTask.getId());
        }
    }

    /**
     * 创建任务
     *
     * @param sourceTask
     * @return
     */
    public TaskEntity createTask(Task sourceTask) {
        TaskEntity task = null;
        if (sourceTask != null) {
            // 1.生成子任务
            task = (TaskEntity) this.getProcessEngine().getTaskService().newTask();
            task.setParentTaskId(sourceTask.getId());
            task.setCategory(sourceTask.getCategory());
            task.setDescription(sourceTask.getDescription());
            task.setTenantId(sourceTask.getTenantId());
            task.setAssignee(sourceTask.getAssignee());
            task.setName(sourceTask.getName());
            task.setProcessDefinitionId(sourceTask.getProcessDefinitionId());
            task.setTaskDefinitionKey(sourceTask.getTaskDefinitionKey());
            task.setTaskDefinitionId(sourceTask.getTaskDefinitionId());
            task.setProcessInstanceId(sourceTask.getProcessInstanceId());
            task.setPriority(sourceTask.getPriority());
            task.setCreateTime(new Date());
        }
        return task;
    }

    /**
     * 流程表单
     *
     * @return
     */
    public WFTaskWay getWFTaskWay(Application sysApp, Task task, String funcType, Map<String, String> attributes) {
        WFTaskWay way = null;
        boolean isMobApp = (sysApp.getMobileApp() != null && sysApp.getMobileApp() == 1);
        try {
            if (!ObjectUtils.isEmpty(funcType)) {
                WFUtilAction function = WFUtilAction.valueOf(funcType.toUpperCase());
                if (function != null) {
                    way = new WFTaskWay();
                    way.set("type", function.value);
                    way.setSequenceFlowName(function.text);
                    way.setTaskId(task.getId());
                    way.setTaskDefinitionKey(task.getTaskDefinitionKey());
                    if (!ObjectUtils.isEmpty(attributes)) {
                        if (function == WFUtilAction.ADDSTEPBEFORE) {
                            if (attributes.containsKey("process-utilform")) {
                                way.set("sequenceFlowForm", attributes.get("process-utilform"));
                            }
                            if (attributes.containsKey("process-mobutilform") && isMobApp) {
                                way.set("sequenceFlowMobForm", attributes.get("process-mobutilform"));
                            }
                            if (attributes.containsKey("process-utilformname")) {
                                way.setSequenceFlowName(attributes.get("process-utilformname"));
                            }
                            if (attributes.containsKey("process-mobutilformname") && isMobApp) {
                                way.setSequenceFlowName(attributes.get("process-mobutilformname"));
                            }
                        } else if (function == WFUtilAction.ADDSTEPAFTER) {
                            if (attributes.containsKey("process-util2form")) {
                                way.set("sequenceFlowForm", attributes.get("process-util2form"));
                            }
                            if (attributes.containsKey("process-mobutil2form") && isMobApp) {
                                way.set("sequenceFlowMobForm", attributes.get("process-mobutil2form"));
                            }
                            if (attributes.containsKey("process-util2formname")) {
                                way.setSequenceFlowName(attributes.get("process-util2formname"));
                            }
                            if (attributes.containsKey("process-mobutil2formname") && isMobApp) {
                                way.setSequenceFlowName(attributes.get("process-mobutil2formname"));
                            }
                        } else if (function == WFUtilAction.REASSIGN) {
                            if (attributes.containsKey("process-util3form")) {
                                way.set("sequenceFlowForm", attributes.get("process-util3form"));
                            }
                            if (attributes.containsKey("process-mobutil3form") && isMobApp) {
                                way.set("sequenceFlowMobForm", attributes.get("process-mobutil3form"));
                            }
                            if (attributes.containsKey("process-util3formname")) {
                                way.setSequenceFlowName(attributes.get("process-util3formname"));
                            }
                            if (attributes.containsKey("process-mobutil3formname") && isMobApp) {
                                way.setSequenceFlowName(attributes.get("process-mobutil3formname"));
                            }
                        }
                    }

                }
            }
        } catch (IllegalArgumentException e) {
            return null;
        }
        return way;
    }

    public void withdrawWFTaskWay(String processInstanceId, WFTaskWay wfTaskWay) {
        this.executeAction("撤回流程", new IAction() {
            @Override
            public Object execute(Object[] args) throws Throwable {
                onWithdrawWFTaskWay(processInstanceId, wfTaskWay);
                return null;
            }
        }, null, Map.class);

    }

    @Deprecated
    protected void onWithdrawWFTaskWay(String processInstanceId, WFTaskWay taskWay) throws Throwable {
        if (ObjectUtils.isEmpty(processInstanceId)) {
            // throw new BadRequestAlertException("未传入流程实例标识","","");
            throw new Exception("未传入流程实例标识");
        }
        // 检查当前流程是否满足撤回条件
        testWithdrawWFTaskWay(processInstanceId);

        // 获取前一步流程节点信息
        ActivityInstance beforeStep = getLastActivityInstance(processInstanceId);

        if (beforeStep == null) {
            // throw new BadRequestAlertException("撤回流程失败，无法获取上一步流程节点信息","","");
            throw new Exception("无法获取上一步流程节点信息");
        }

        // if(!StringUtils.isEmpty(ignoreStepId) &&
        // ignoreStepId.contains(beforeStep.getActivityId())){
        // throw new BadRequestAlertException("当前步骤不支持撤回操作","","");
        // }

        // 获取上下文对象
        // 流程第一步,取消流程
        if (BpmnXMLConstants.ELEMENT_EVENT_START.equals(beforeStep.getActivityType())) {

            Map variables = this.getProcessEngine().getRuntimeService().getVariables(processInstanceId);
            this.getProcessEngine().getRuntimeService().deleteProcessInstance(processInstanceId, "流程撤回");

            // 将流程实例状态设置为未提交
            if (variables != null && variables.get(WFConsts.ACTIVEDATA) != null) {
                Object system = variables.get("system");
                Object entity = variables.get("entity");
                if (entity == null) {
                    entity = variables.get("entitys");
                }
                Object businessKey = variables.get("businessKey");
                if (ObjectUtils.isEmpty(system) || ObjectUtils.isEmpty(entity) || ObjectUtils.isEmpty(businessKey)) {
                    // throw new
                    // BadRequestAlertException("撤回流程失败，无法获取流程实例标识","","");
                    throw new Exception("无法获取流程实例标识");
                }

                // String instanceId =
                // DigestUtils.md5DigestAsHex(String.format("%s||%s||%s"
                // ,system,entity,businessKey).getBytes());
                String instanceId = KeyValueUtils.genUniqueId(system, entity, businessKey);
                WFInstance instance = new WFInstance();
                instance.setId(instanceId);
                instance.setStartTime(null);
                instance.setStartUserId(null);
                instance.setStartUserName(null);
                instance.setRealInstId(null);
                // instanceService.update(instance);
                this.updateWFInstance(instance);
            }
        } else {// 将流程退回到前一步

            // 获取回退步骤操作用户，重构activedata；
            Map activeData = getWFInstActiveData(processInstanceId);
            if (ObjectUtils.isEmpty(activeData)) {
                // throw new
                // BadRequestAlertException("流程撤回失败，无法获取上一步操作用户","","");
                throw new Exception("无法获取上一步操作用户");
            }
            this.getProcessEngine().getRuntimeService().setVariable(processInstanceId, WFConsts.ACTIVEDATA, activeData);

            // 查询跳转下所有同节点实例，执行跳转
            List<String> executionIds = new ArrayList<>();
            List<Execution> executions = this.getProcessEngine().getRuntimeService().createExecutionQuery().parentId(processInstanceId).list();
            executions.forEach(execution -> executionIds.add(execution.getId()));

            // 获取当前任务，记录审批日志
            List<Task> tasks = this.getProcessEngine().getTaskService().createTaskQuery().processInstanceId(processInstanceId).includeIdentityLinks().list();
            if (ObjectUtils.isEmpty(tasks)) {
                // throw new BadRequestAlertException("获取运行时任务失败","","");
                throw new Exception("获取运行时任务失败");
            }
            Task currentTask = tasks.get(0);

            // 执行跳转
            this.getProcessEngine().getRuntimeService().createChangeActivityStateBuilder().moveExecutionsToSingleActivityId(executionIds, beforeStep.getActivityId()).changeState();
            // 生成历史记录
            this.createHistoryRecord(WFUtilAction.WITHDRAW, currentTask, activeData);
        }
    }

    /**
     * 待办标记为已读
     *
     * @param task
     */
    protected void markReadTodoTask(Task task, String userId) throws Throwable {
        String taskId = task.getId();

        List<IdentityLink> identityLinks = this.getProcessEngine().getTaskService().getIdentityLinksForTask(taskId);
        // identityLinks.forEach(idl -> {
        // if (userId.equals(idl.getUserId())) {
        // List<IdentityLink> unReadLinks = identityLinks.stream().filter(link
        // ->
        // ObjectUtils.isEmpty(link.getScopeType())).collect(Collectors.toList());
        // String scopeType = task.getScopeType();
        // if (!ObjectUtils.isEmpty(scopeType) && "sendcopy".equals(scopeType)
        // && unReadLinks.size() == 1) {
        // this.getProcessEngine().getTaskService().complete(task.getId());
        // }
        //
        // getFlowableRuntimeServiceEx().markReadTask(task.getId(), userId);
        // return;
        // }
        // });

        for (IdentityLink idl : identityLinks) {
            if (userId.equals(idl.getUserId())) {
                List<IdentityLink> unReadLinks = identityLinks.stream().filter(link -> ObjectUtils.isEmpty(link.getScopeType())).collect(Collectors.toList());
                String scopeType = task.getScopeType();
                if (!ObjectUtils.isEmpty(scopeType) && "sendcopy".equals(scopeType) && unReadLinks.size() == 1) {
                    this.getProcessEngine().getTaskService().complete(task.getId());
                }

                getFlowableRuntimeServiceEx().markReadTask(task.getId(), userId);
            }
        }

        // try {
        //
        // } catch (Exception e) {
        // log.error("将用户[{}]待办[{}]标记为已读出现异常" + e, userId, taskId);
        // }
    }

    /**
     * 根据节点汇总流程审批记录
     * @param hidatas 流程历史审批记录
     * @return
     */
    protected List<WFDefinitionNode> getWFDefinitionNodes(List<HistoricData> hidatas) throws Throwable {
        if (ObjectUtils.isEmpty(hidatas))
            return null;

        List<WFDefinitionNode> processNodes = new ArrayList<>();
        Map<String, WFDefinitionNode> tempProcessNodes = new LinkedHashMap<>();

        //合并任务与子任务及审批意见
        Map<String, WFTask> taskMap = getWFTaskMap(hidatas);

        ListIterator<HistoricData> iterator = hidatas.listIterator();
        while (iterator.hasNext()) {
            HistoricData hidata = iterator.next();
            if (hidata instanceof HistoricActivityInstance) {
                HistoricActivityInstance hai = (HistoricActivityInstance) hidata;
                if ("userTask".equals(hai.getActivityType()) || "startEvent".equals(hai.getActivityType()) || "boundaryEvent".equals(hai.getActivityType())) {
                    //提交后撤回再重启流程后提交前置节点
                    if (("startEvent".equals(hai.getActivityType()) || "boundaryEvent".equals(hai.getActivityType())) && !ObjectUtils.isEmpty(tempProcessNodes)) {
                        WFDefinitionNode node = mergeWFDefinitionNode(tempProcessNodes);
                        processNodes.add(node);
                    }
                    WFDefinitionNode node = new WFDefinitionNode();
                    node.setUserTaskId(hai.getId());
                    node.setUserTaskName(hai.getActivityName());
                    node.set("comments", new ArrayList<Comment>());
                    node.set("tasks", new ArrayList<HistoricTaskInstanceEntity>());
                    node.set("usertask", hai);
                    tempProcessNodes.put(hai.getExecutionId(), node);
                }
                //活动调用子流程
                if ("callActivity".equals(hai.getActivityType())) {
                    WFDefinitionNode node = new WFDefinitionNode();
                    node.setUserTaskId(hai.getId());
                    node.setUserTaskName(hai.getActivityName());
                    node.set("comments", new ArrayList<Comment>());
                    node.set("tasks", new ArrayList<HistoricTaskInstanceEntity>());
                    node.set("usertask", hai);
                    node.set("calledprocessinstanceid",hai.getCalledProcessInstanceId());
                    tempProcessNodes.put(hai.getExecutionId(), node);
                    node = mergeWFDefinitionNode(tempProcessNodes);
                    processNodes.add(node);
                }
            }
            if (hidata instanceof HistoricTaskInstanceEntity) {
                HistoricTaskInstanceEntity hti = (HistoricTaskInstanceEntity) hidata;
                String executionId = hti.getExecutionId();
                if (!StringUtils.isEmpty(executionId) && !ObjectUtils.isEmpty(tempProcessNodes) && tempProcessNodes.containsKey(executionId)) {
                    WFDefinitionNode node = tempProcessNodes.get(executionId);
                    String taskId = hti.getId();
                    WFTask processNodeTask = taskMap.get(taskId);
                    if (processNodeTask != null) {
                        Object userTask = processNodeTask.get("usertask");
                        if (!ObjectUtils.isEmpty(userTask)) {
                            ((ArrayList) node.get("tasks")).add(hti);
                        }
                        Object comments = processNodeTask.get("comments");
                        if (!ObjectUtils.isEmpty(comments)) {
                            ((ArrayList) node.get("comments")).addAll((ArrayList) comments);
                        }
                        Object subTasks = processNodeTask.get("subtasks");
                        if (!ObjectUtils.isEmpty(subTasks)) {
                            ((ArrayList) node.get("tasks")).addAll((ArrayList) subTasks);
                        }
                    }
                }
                //辅助功能任务，提交前置任务，添加节点
                if (!StringUtils.isEmpty(hti.getScopeType())) {
                    if (!ObjectUtils.isEmpty(tempProcessNodes)) {
                        processNodes.add(mergeWFDefinitionNode(tempProcessNodes));
                    }
                    WFDefinitionNode procFuncNode = createWFUtilActionDefinitionNode(hti, taskMap);
                    if (procFuncNode != null) {
                        processNodes.add(procFuncNode);
                    }
                }
            }
            if (((hidata instanceof HistoricActivityInstance && "sequenceFlow".equals(((HistoricActivityInstance) hidata).getActivityType()) && !"${route}".equals((((HistoricActivityInstance) hidata).getActivityName())))
                    || !iterator.hasNext()) && !ObjectUtils.isEmpty(tempProcessNodes)) {
                WFDefinitionNode node = mergeWFDefinitionNode(tempProcessNodes);
                processNodes.add(node);
            }

        }
        return processNodes;
    }

    /**
     * 创建辅助功能节点
     *
     * @param procFuncTask
     * @param taskMap
     * @return
     */
    protected WFDefinitionNode createWFUtilActionDefinitionNode(HistoricTaskInstanceEntity procFuncTask, Map<String, WFTask> taskMap) {

        WFDefinitionNode node = new WFDefinitionNode();
        String parentTaskId = procFuncTask.getParentTaskId();
        if (ObjectUtils.isEmpty(parentTaskId)) {
            log.error(String.format("辅助功能[%1$s]未配置父任务标识，请检查数据是否正确", procFuncTask.getName()));
            return null;
        }

        WFTask parentTask = taskMap.get(parentTaskId);
        if (parentTask == null) {
            log.error(String.format("未找到辅助功能[%1$s]父任务", procFuncTask.getName()));
            return null;
        }

        List comments;
        String taskId = procFuncTask.getId();
        if (taskMap.containsKey(taskId))
            comments = (List) taskMap.get(taskId).get("comments");
        else
            comments = new ArrayList();

        node.setUserTaskId(procFuncTask.getId());
        node.setUserTaskName(parentTask.getName());
        node.set("comments", comments);
        node.set("tasks", new ArrayList<HistoricTaskInstanceEntity>());
        node.set("usertask", procFuncTask);
        node.set("parenttask", parentTask);
        return node;
    }

    /**
     * 将任务与子任务、审批意见等进行合并
     *
     * @param hidatas
     * @return
     */
    protected Map<String, WFTask> getWFTaskMap(List<HistoricData> hidatas) throws Throwable {

        Map<String, WFTask> taskMap = new LinkedHashMap<>();
        for (HistoricData hidata : hidatas) {
            if (hidata instanceof HistoricTaskInstanceEntity) {
                HistoricTaskInstanceEntity hti = (HistoricTaskInstanceEntity) hidata;
                String parentTaskId = hti.getParentTaskId();
                String taskId = hti.getId();
                String taskName = hti.getName();

                //辅助功能，存在父任务
                if (!StringUtils.isEmpty(parentTaskId)) {
                    WFTask parentTask;
                    if (!taskMap.containsKey(parentTaskId)) {
                        parentTask = createTask(parentTaskId, taskName);
                        taskMap.put(parentTaskId, parentTask);
                    } else {
                        parentTask = taskMap.get(parentTaskId);
                    }
                    ((ArrayList) parentTask.get("subtasks")).add(hti);
                }

                WFTask task;
                if (taskMap.containsKey(taskId)) {
                    task = taskMap.get(taskId);
                    task.setName(hti.getName());
                    task.set("usertask", hti);
                } else {
                    task = createTask(taskId, taskName);
                    task.set("usertask", hti);
                    taskMap.put(taskId, task);
                }
            } else if (hidata instanceof Comment) {
                Comment comment = (Comment) hidata;
                String id = comment.getId();
                String taskId = comment.getTaskId();
                if (!StringUtils.isEmpty(taskId)) {
                    WFTask task;
                    if (!taskMap.containsKey(taskId))
                        task = createTask(taskId, id);
                    else
                        task = taskMap.get(taskId);

                    ((ArrayList) task.get("comments")).add(comment);
                }
            }
        }
        return taskMap;
    }

    protected WFTask createTask(String taskId, String takName) {
        WFTask task = new WFTask();
        task.setId(taskId);
        task.setName(takName);
        task.set("subtasks", new ArrayList<WFTask>());
        task.set("comments", new ArrayList<Comment>());
        return task;
    }

    /**
     * 多实例合并合并节点
     *
     * @param tempProcessNodes
     * @return
     */
    protected WFDefinitionNode mergeWFDefinitionNode(Map<String, WFDefinitionNode> tempProcessNodes) {

        WFDefinitionNode node = new WFDefinitionNode();
        if (!ObjectUtils.isEmpty(tempProcessNodes))//外出连线，合并多实例节点
        {
            List<HistoricTaskInstanceEntity> processNodeTasks = new ArrayList<>();
            List<Comment> processNodeComments = new ArrayList<>();
            Map<String, List<WFDefinitionNode>> subProcessNodeMap = new LinkedHashMap<>();

            for (WFDefinitionNode tempProcessNode : tempProcessNodes.values()) {

                List<Comment> tempComments = (List<Comment>) tempProcessNode.get("comments");
                List<HistoricTaskInstanceEntity> tempTasks = (List<HistoricTaskInstanceEntity>) tempProcessNode.get("tasks");
                processNodeTasks.addAll(tempTasks);
                processNodeComments.addAll(tempComments);

                //按taskdefinitionkey分类（判断是否并行网关）
                Object userTask = tempProcessNode.get("usertask");
                if (userTask != null && userTask instanceof HistoricActivityInstance) {
                    HistoricActivityInstance hai = (HistoricActivityInstance) tempProcessNode.get("usertask");
                    String taskdefkey = hai.getActivityId();

                    if (subProcessNodeMap.containsKey(taskdefkey))
                        subProcessNodeMap.get(taskdefkey).add(tempProcessNode);
                    else
                        subProcessNodeMap.put(taskdefkey, new ArrayList() {{
                            add(tempProcessNode);
                        }});
                }
            }

            WFDefinitionNode firstNode = tempProcessNodes.values().stream().findFirst().get();

            node.setUserTaskId(firstNode.getUserTaskId());
            node.setUserTaskName(firstNode.getUserTaskName());
            node.set("comments", processNodeComments);
            node.set("tasks", processNodeTasks);
            node.set("usertask", firstNode.get("usertask"));
            if (!ObjectUtils.isEmpty(firstNode.get("parenttask")))
                node.set("parenttask", firstNode.get("parenttask"));
            if(!ObjectUtils.isEmpty(firstNode.get("calledprocessinstanceid")))
                node.set("calledprocessinstanceid",firstNode.get("calledprocessinstanceid"));

            //当前步骤存在2个以上不同taskdefitionkey，则为并行网关
            if (subProcessNodeMap.size() >= 2) {
                List subProcessNodes = new ArrayList();
                for (Map.Entry<String, List<WFDefinitionNode>> entry : subProcessNodeMap.entrySet()) {
                    List<WFDefinitionNode> processNodes = entry.getValue();
                    if (!ObjectUtils.isEmpty(processNodes) && processNodes.size() > 1) {
                        Map<String, WFDefinitionNode> mergrNodes = new LinkedHashMap();
                        for (WFDefinitionNode processNode : processNodes) {
                            mergrNodes.put(processNode.getUserTaskId(), processNode);
                        }
                        subProcessNodes.add(mergeWFDefinitionNode(mergrNodes));
                    } else {
                        subProcessNodes.add(processNodes.get(0));
                    }
                }
                node.set("subnodes", subProcessNodes);
            }

            tempProcessNodes.clear();

        }
        return node;
    }

    /**
     * 通过流程实例获取activedata
     *
     * @param processInstanceId
     * @return
     */
    protected Map getWFInstActiveData(String processInstanceId) throws Throwable {
        Map activeData = new LinkedHashMap();
        try {
            //查询前一步的流程用户
            List<ActivityInstance> wfSteps = this.getProcessEngine().getRuntimeService().createActivityInstanceQuery().processInstanceId(processInstanceId).finished().activityType(BpmnXMLConstants.ELEMENT_TASK_USER).orderByActivityInstanceStartTime().desc().list();
            if (ObjectUtils.isEmpty(wfSteps)) {
                throw new Exception("撤回流程失败，无法获取撤回步骤信息");
            }
            String wfstepId = wfSteps.get(0).getId();
            List<HistoricVariableInstance> params = this.getProcessEngine().getHistoryService().createHistoricVariableInstanceQuery().processInstanceId(processInstanceId).list();
            if (params == null) {
                return activeData;
            }
            Map variables = new HashMap();
            params.forEach(item -> {
                variables.put(item.getVariableName(), item.getValue());
            });

            Object all_role_info = variables.get(String.format("wfstep-%s-stepuser", wfstepId));
            if (ObjectUtils.isEmpty(all_role_info))
                return activeData;

            //重构activedata
            Object oldActiveData = this.getProcessEngine().getRuntimeService().getVariable(processInstanceId,WFConsts.ACTIVEDATA);
            if (oldActiveData != null) {
                activeData.putAll((Map) oldActiveData);
                ObjectNode roleInfo = JsonUtils.toObjectNode(all_role_info.toString());

                //JSONObject roleInfo = JSONObject.parseObject(all_role_info.toString());
                Object active = roleInfo.get("active");
                Object group = roleInfo.get("group");

                if (active != null) {
                    Set activeInfo = JsonUtils.MAPPER.readValue(JsonUtils.MAPPER.writeValueAsString(active), Set.class);
                    if (activeInfo != null) {
                        Iterator<String> it = activeInfo.iterator();
                        while (it.hasNext()) {
                            String field = it.next();
                            Object fieldValue = variables.get(field);
                            activeData.put(field.replace(String.format("wfstep-%s-", wfstepId), ""), fieldValue);
                        }
                    }
                }
                //group回填至activeData
                if (group != null) {
                    Set groupInfo = JsonUtils.MAPPER.readValue(JsonUtils.MAPPER.writeValueAsString(group), Set.class);
                    if (groupInfo != null) {
                        Iterator<String> it = groupInfo.iterator();
                        while (it.hasNext()) {
                            String field = it.next();
                            Object fieldValue = variables.get(field);
                            activeData.put(field.replace(String.format("wfstep-%s-", wfstepId), ""), fieldValue);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error("操作失败，无法获取撤回步骤的用户信息" + e);
            throw new Exception("操作失败，无法获取撤回步骤的用户信息");
        }
        return activeData;
    }


    /**
     * 抄送标记为已读
     *
     * @param taskId
     */
    protected void markReadSCTask(String taskId, String userId) throws Throwable {

    }

    protected WFDefinition getWFDefinition(String strKey, boolean bTryMode) throws Throwable {
        throw new Exception("没有实现");
    }

    protected void saveWFDefinition(WFDefinition wfDefinition) throws Throwable {
        throw new Exception("没有实现");
    }

    protected WFInstance getWFInstance(String strKey, boolean bTryMode) throws Throwable {
        throw new Exception("没有实现");
    }

    protected void updateWFInstance(WFInstance wfInstance) throws Throwable {
        throw new Exception("没有实现");
    }

    protected void saveWFInstance(WFInstance wfInstance) throws Throwable {
        throw new Exception("没有实现");
    }

    protected void removeWFInstance(String strWFInstanceId) throws Throwable {
        throw new Exception("没有实现");
    }


    @Override
    protected RuntimeException dealException(String strMessage, Throwable ex) {
        StringBuilder errMessage = new StringBuilder();
        errMessage.append("工作流异常,原因可能是:");
        if (ex instanceof FlowableIllegalArgumentException) {
            if (ex.getMessage().indexOf("candidateUsersList") > 0) {
                errMessage.append("[缺少用户角色信息，请检查传入用户角色相关参数是否正确]");
            }
        } else {
            if (ex.getMessage().indexOf("No outgoing sequence flow of") >= 0) {
                errMessage.append("[缺少线路判断信息，请检查传入执行线路的相关参数是否正确]");
            } else if (ex.getMessage().indexOf("Error while evaluating expression") > 0) {
                errMessage.append("[工作流表达式转换异常，请检查流程图步骤传入相关参数是否正确]");
            } else if (ex.getMessage().indexOf("Cannot find task with id") > 0) {
                errMessage.append("[工作流任务异常，该任务找不到或已经办理]").append("[").append(ex.getMessage()).append("]");
            } else {
                String causeMsg = ex.getMessage();
                causeMsg = ex.getCause() != null ? ex.getCause().getMessage() : causeMsg;
                causeMsg = causeMsg.contains("Exception: ") ? causeMsg.substring(causeMsg.indexOf("Exception: ") + 11) : causeMsg;
                errMessage.append(causeMsg);
            }
        }

        this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("%1$s%2$s", getLogicName(), strMessage), null);
        return new SystemRuntimeException(this.getSystemRuntimeBase(), this, errMessage.toString(), ex);

    }

    /**
     * 获取抄送任务集合
     *
     * @param ids 抄送任务标识
     * @return
     */
    @Override
    protected List<CarbonCopy> onCarbonCopyTasks(String[] ids) throws Throwable {
        ICarbonCopyService carbonCopyService = EBSXSystemRuntime.getInstance().getCarbonCopyService();
        SearchContextDTO searchContextDTO = new SearchContextDTO();

        searchContextDTO.count(false).limit(2147483647).in("param01", StringUtils.arrayToDelimitedString(ids, ",")).sort("createdate");
        List<CarbonCopy> carbonCopyList = new ArrayList();
        List<CarbonCopyDTO> list = carbonCopyService.selectDefault(searchContextDTO);
        if (!ObjectUtils.isEmpty(list)) {
            for (CarbonCopyDTO item : list) {
                CarbonCopy carbonCopy = new CarbonCopy();
                item.copyTo(carbonCopy, true);
                carbonCopyList.add(carbonCopy);
            }
        }

        return carbonCopyList;
    }

    @Override
    protected WFInstance onGetWFInstanceByBusinessKey(String strSystemTag, String strDataEntity, String strKey) throws Throwable {
        String strWFInstanceId = KeyValueUtils.genUniqueId(strSystemTag, strDataEntity, strKey);
        this.getWFInstance(strWFInstanceId,false);
        return this.getWFInstance(strWFInstanceId,false);
    }
}
