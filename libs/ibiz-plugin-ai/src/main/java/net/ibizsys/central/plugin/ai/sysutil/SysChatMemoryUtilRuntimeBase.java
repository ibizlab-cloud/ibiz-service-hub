package net.ibizsys.central.plugin.ai.sysutil;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.IAIChatMemoryUtil;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysKBUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysTaskUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.plugin.ai.util.AIChatUtils;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.IPage;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.central.util.expression.ExpressionUtils;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.dataentity.IPSDEGroup;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class SysChatMemoryUtilRuntimeBase extends SysUtilRuntimeBase implements ISysChatMemoryUtilRuntime {

    private static final Log log = LogFactory.getLog(SysChatMemoryUtilRuntimeBase.class);
    public final static String CHATMEMORYUTIL_TIMERTASK = "CHATMEMORYUTIL_TIMERTASK";
    public final static String DE_MEMORY_TASK = "MEMORY_TASK";
    public final static String DE_CHAT_MESSAGE = "CHAT_MESSAGE";
    public final static String DATASET_TASK_PENDING_SCHEDULED = "PENDING_SCHEDULED";
    public final static String DEFAULT_KB_AGENT_CONFIG_ID_FORMAT = "{system}-kb--{key}";
    public final static String DEFAULT_GLOBAL_PATTERN = "__global__";
    public final static String DEFAULT_DAILY_AGENT_HEADER_FORMAT = "----------agent_id:%1$s----------";


    private String strChatAgent = null;
    private String strKBAgentConfigIdFormat = null;
    private boolean bRunMemoryExtractTimer = false;
    private boolean bMemoryExtract = true;
    private String memoryExtractTaskType = "memoryExtract";
    private String memoryExtractActionTag = "MemoryExtract";

    private Map<String, IPSDataEntity> deMap = new HashMap<String, IPSDataEntity>();

    private ISysUniStateUtilRuntime iSysUniStateUtilRuntime = null;

    private ISysTaskUtilRuntime iSysTaskUtilRuntime = null;

    private IDataEntityRuntime memoryTaskDERuntime = null;

    private IDataEntityRuntime chatMessageDERuntime = null;

    private Map<String, IPSDEField> memoryTaskPSDEFieldMap = new LinkedHashMap<String, IPSDEField>();

    private Map<String, IPSDEField> chatMessagePSDEFieldMap = new LinkedHashMap<String, IPSDEField>();

    private Map<String, IEntityDTO> memoryTaskMap = new HashMap<>();

    private Map<String, IAIChatMemoryUtil> aiChatMemoryUtilMap = new ConcurrentHashMap<String, IAIChatMemoryUtil>();

    private final Map<String, Object> locks = new ConcurrentHashMap<>();

    @Override
    protected void onInit() throws Exception {

        final IPSDEGroup iPSDEGroup = getPSDEGroup();
        if (iPSDEGroup == null) {
            throw new Exception("未指定系统实体组模型对象");
        }
        String strDefaultAgentId = String.format("%1$s-kb--%2$s", this.getSystemRuntime().getDeploySystemId(), this.getPSSysUtil().getCodeName()).toLowerCase();

        this.strChatAgent = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".chat.agent", strDefaultAgentId);
        this.strKBAgentConfigIdFormat = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".kb.kbagentconfigid", DEFAULT_KB_AGENT_CONFIG_ID_FORMAT);
        List<IPSDEGroupDetail> psDEGroupDetailList = iPSDEGroup.getPSDEGroupDetails();
        if (!ObjectUtils.isEmpty(psDEGroupDetailList)) {
            for (IPSDEGroupDetail iPSDEGroupDetail : psDEGroupDetailList) {
                if (DE_MEMORY_TASK.equalsIgnoreCase(iPSDEGroupDetail.getCodeName()) || DE_MEMORY_TASK.equalsIgnoreCase(iPSDEGroupDetail.getPSDataEntityMust().getName())) {
                    deMap.put(DE_MEMORY_TASK, iPSDEGroupDetail.getPSDataEntityMust());
                    continue;
                }
                if (DE_CHAT_MESSAGE.equalsIgnoreCase(iPSDEGroupDetail.getCodeName()) || DE_CHAT_MESSAGE.equalsIgnoreCase(iPSDEGroupDetail.getPSDataEntityMust().getName())) {
                    deMap.put(DE_CHAT_MESSAGE, iPSDEGroupDetail.getPSDataEntityMust());
                }

            }
        }
        
        this.memoryExtractTaskType = String.format("%1$s.%2$s", this.getConfigFolder(), "memoryExtract");
        super.onInit();
    }

    @Override
    protected void onInstall() throws Exception {
        super.onInstall();
        this.prepareSysUniStateUtilRuntime();
        this.prepareSysTaskUtilRuntime();
        if (this.getMemoryTaskDERuntime(true) == null) {
            IPSDataEntity iPSDataEntity = deMap.get(DE_MEMORY_TASK);
            if (iPSDataEntity == null) {
                throw new Exception(String.format("未定义记忆任务实体"));
            }
            this.setMemoryTaskDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId()));
        }

        if (this.getChatMessageDERuntime(true) == null) {
            IPSDataEntity iPSDataEntity = deMap.get(DE_CHAT_MESSAGE);
            if (iPSDataEntity == null) {
                throw new Exception(String.format("未定义交谈消息实体"));
            }
            this.setChatMessageDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId()));
        }

        this.getMemoryTaskDERuntime(false).getPSDEDataSetByTag(DATASET_TASK_PENDING_SCHEDULED, false);
        this.fillMemoryTaskPSDEFieldMap(this.memoryTaskPSDEFieldMap);
        this.fillChatMessagePSDEFieldMap(this.chatMessagePSDEFieldMap);

        ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.getSysUniStateUtilRuntime(true);
        if (iSysUniStateUtilRuntime != null) {
            iSysUniStateUtilRuntime.addLeaderLatchIf(KeyValueUtils.genUniqueId(this.getSystemRuntime().getDeploySystemId(), CHATMEMORYUTIL_TIMERTASK, this.getFullUniqueTag()));
        }

        // 需要准备工作线程池
        if (this.getWorkThreadPoolExecutor(true) == null) {
            prepareWorkThreadPoolExecutor();
        }

        // 侦听Cloud重置信号
        this.listenReloadSignal();
        // 加载配置
        this.localReload();

        if (this.bMemoryExtract) {
            this.bRunMemoryExtractTimer = true;
            runMemoryExtractTimer();
        } else {
            log.warn(String.format("未启动记忆任务定时器"));
        }

    }

    @Override
    protected void onReload() throws Throwable {
        this.registerMemoryExtractTaskType();
        super.onReload();
    }

    protected IPSDEGroup getPSDEGroup() {
        return this.getPSSysUtil().getPSSysDEGroup();
    }

    protected IDataEntityRuntime getMemoryTaskDERuntime(boolean tryMode) throws Exception {
        if (this.memoryTaskDERuntime != null || tryMode) {
            return this.memoryTaskDERuntime;
        }
        throw new Exception(String.format("记忆任务实体运行时对象无效"));
    }

    protected void setMemoryTaskDERuntime(IDataEntityRuntime memoryTaskDERuntime) {
        this.memoryTaskDERuntime = memoryTaskDERuntime;
    }

    protected IDataEntityRuntime getChatMessageDERuntime(boolean tryMode) throws Exception {
        if (this.chatMessageDERuntime != null || tryMode) {
            return this.chatMessageDERuntime;
        }
        throw new Exception(String.format("交谈消息实体运行时对象无效"));
    }

    protected void setChatMessageDERuntime(IDataEntityRuntime chatMessageDERuntime) {
        this.chatMessageDERuntime = chatMessageDERuntime;
    }

    protected void fillMemoryTaskPSDEFieldMap(Map<String, IPSDEField> memoryTaskPSDEFieldMap) throws Exception {
        final IDataEntityRuntime memoryTaskDERuntime = this.getMemoryTaskDERuntime(false);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_STATUS, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_SESSION_ID, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_SCHEDULED_AT, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_TRIGGER_TYPE, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_LAST_MSG_TIME, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_EXECUTED_AT, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_END_AT, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_MEMORY_USER_ID, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_MEMORY_BUSINESS_SCOPE, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_AI_AGENT_CONTEXT_ID, null);

        memoryTaskPSDEFieldMap.put(memoryTaskDERuntime.getKeyPSDEField().getName(), null);

        List<IPSDEField> psDEFieldList = memoryTaskDERuntime.getPSDataEntity().getAllPSDEFields();
        if (!ObjectUtils.isEmpty(psDEFieldList)) {
            for (IPSDEField iPSDEField : psDEFieldList) {
                if (!StringUtils.hasLength(iPSDEField.getFieldTag())) {
                    continue;
                }
                String strTag = iPSDEField.getFieldTag().toUpperCase();
                if (!memoryTaskPSDEFieldMap.containsKey(strTag)) {
                    continue;
                }

                if (memoryTaskPSDEFieldMap.get(strTag) == null) {
                    memoryTaskPSDEFieldMap.put(strTag, iPSDEField);
                }
            }

            for (IPSDEField iPSDEField : psDEFieldList) {
                String strTag = iPSDEField.getName().toUpperCase();
                if (!memoryTaskPSDEFieldMap.containsKey(strTag)) {
                    continue;
                }

                if (memoryTaskPSDEFieldMap.get(strTag) == null) {
                    memoryTaskPSDEFieldMap.put(strTag, iPSDEField);
                }
            }
        }
    }

    protected void fillChatMessagePSDEFieldMap(Map<String, IPSDEField> chatMessagePSDEFieldMap) throws Exception {
        final IDataEntityRuntime chatMessageDERuntime = this.getChatMessageDERuntime(false);
        chatMessagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_CONTENT, null);
        chatMessagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_CONTENT_TYPE, null);
        chatMessagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_SENDER_TYPE, null);
        chatMessagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_SEQUENCE, null);
        chatMessagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_SESSION_ID, null);
        chatMessagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_STATUS, null);
        chatMessagePSDEFieldMap.put(chatMessageDERuntime.getKeyPSDEField().getName(), null);

        List<IPSDEField> psDEFieldList = chatMessageDERuntime.getPSDataEntity().getAllPSDEFields();
        if (!ObjectUtils.isEmpty(psDEFieldList)) {
            for (IPSDEField iPSDEField : psDEFieldList) {
                if (!StringUtils.hasLength(iPSDEField.getFieldTag())) {
                    continue;
                }
                String strTag = iPSDEField.getFieldTag().toUpperCase();
                if (!chatMessagePSDEFieldMap.containsKey(strTag)) {
                    continue;
                }

                if (chatMessagePSDEFieldMap.get(strTag) == null) {
                    chatMessagePSDEFieldMap.put(strTag, iPSDEField);
                }
            }

            for (IPSDEField iPSDEField : psDEFieldList) {
                String strTag = iPSDEField.getName().toUpperCase();
                if (!chatMessagePSDEFieldMap.containsKey(strTag)) {
                    continue;
                }

                if (chatMessagePSDEFieldMap.get(strTag) == null) {
                    chatMessagePSDEFieldMap.put(strTag, iPSDEField);
                }
            }
        }
    }

    @Override
    protected void onPrepareDefaultSetting() throws Exception {
        String strDefaultAgentId = String.format("%1$s-kb--%2$s", this.getSystemRuntime().getDeploySystemId(), this.getPSSysUtil().getCodeName()).toLowerCase();
        this.strChatAgent = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".chat.agent", strDefaultAgentId);
        this.bMemoryExtract = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".memoryextract", this.bMemoryExtract);

        super.onPrepareDefaultSetting();
    }

    protected void runMemoryExtractTimer() {
        runMemoryExtractTimer(false);
    }

    protected final boolean isRunMemoryExtractTimer() {
        return this.bRunMemoryExtractTimer;
    }

    protected void runMemoryExtractTimer(boolean bTimerOnly) {
        if (!this.bRunMemoryExtractTimer) {
            return;
        }

        if (!bTimerOnly) {
            try {
                onMemoryExtractTimer();
            } catch (Throwable ex) {
                log.error(String.format("[%1$s]列出未执行记忆提取任务定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
            }
        }

        this.getSystemRuntime().threadRun(new Runnable() {
            @Override
            public void run() {
                runMemoryExtractTimer();
            }
        }, System.currentTimeMillis() + 30000, "MemoryExtractTimer_SysChatMemoryUtil_" + this.getFullUniqueTag());
    }

    protected void onMemoryExtractTimer() throws Throwable {
        ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.tryGetSysUniStateUtilRuntime();
        if (iSysUniStateUtilRuntime != null) {
            if (!iSysUniStateUtilRuntime.hasLeadership(KeyValueUtils.genUniqueId(this.getSystemRuntime().getDeploySystemId(), CHATMEMORYUTIL_TIMERTASK, this.getFullUniqueTag()))) {
                return;
            }
        }

        try {
            this.prepareMemoryExtractTasks();
        } catch (Throwable ex) {
            log.error(String.format("记忆提取任务发生异常，%1$s", ex.getMessage()), ex);
        }

    }

    protected void prepareMemoryExtractTasks() throws Throwable {
        ISearchContextDTO searchContextDTO = this.getMemoryTaskDERuntime(false).createSearchContext();
        List<IEntityDTO> list = this.getMemoryTaskDERuntime(false).selectDataSet(DATASET_TASK_PENDING_SCHEDULED, searchContextDTO);
        this.refreshMemoryExtractTasks(list);
    }

    protected synchronized void refreshMemoryExtractTasks(List<IEntityDTO> list) throws Throwable {

        // 拿出当前
        Map<String, IEntityDTO> lastMap = new HashMap<>();
        lastMap.putAll(memoryTaskMap);

        for (IEntityDTO memoryTask : list) {
            if (memoryTask.get("scheduled_at") == null) {
                continue;
            }

            IEntityDTO last = lastMap.remove(this.getMemoryTaskDERuntime(false).getKeyFieldValue(memoryTask));
            if (last == null) {
                // 启动新任务
                startJob(memoryTask);
                memoryTaskMap.put((String) this.getMemoryTaskDERuntime(false).getKeyFieldValue(memoryTask), memoryTask);
            } else {
                // 判断是否一致
                if ((last.get("scheduled_at").equals(memoryTask.get("scheduled_at")))) {
                    continue;
                }

                // 停止当前
                stopJob(last);
                // 开始新
                startJob(memoryTask);
                memoryTaskMap.put((String) this.getMemoryTaskDERuntime(false).getKeyFieldValue(memoryTask), memoryTask);
            }
        }

        // 清除剩余
        for (IEntityDTO last : lastMap.values()) {
            stopJob(last);
        }
    }

    protected void startJob(IEntityDTO memoryTaskDTO) throws Throwable {
        if (this.getSysTaskUtilRuntime(true) == null) {
            log.warn("未指定系统任务功能组件，忽略执行");
            return;
        }

        this.getSysTaskUtilRuntime(false).addSchedule((String) memoryTaskDTO.get(memoryTaskDERuntime.getKeyPSDEField().getLowerCaseName()), memoryTaskToScheduleParams(memoryTaskDTO), true, false);
    }

    protected void stopJob(IEntityDTO memoryTaskDTO) throws Throwable {
        if (this.getSysTaskUtilRuntime(true) == null) {
            log.warn("未指定系统任务功能组件，忽略执行");
            return;
        }
        this.getSysTaskUtilRuntime(false).removeSchedule((String) memoryTaskDTO.get(memoryTaskDERuntime.getKeyPSDEField().getLowerCaseName()));
    }

    protected Map memoryTaskToScheduleParams(IEntityDTO memoryTaskDTO) {
        Map<String, Object> schedule = new LinkedHashMap<>();
        schedule.put(ISysTaskUtilRuntime.SCHEDULEPARAM_ID, memoryTaskDTO.get(memoryTaskDERuntime.getKeyPSDEField().getLowerCaseName()));
        schedule.put(ISysTaskUtilRuntime.SCHEDULEPARAM_NAME, memoryTaskDTO.get(memoryTaskDERuntime.getMajorPSDEField().getLowerCaseName()));
        schedule.put(ISysTaskUtilRuntime.SCHEDULEPARAM_TASK_TYPE, this.getMemoryExtractTaskType());
        schedule.put(ISysTaskUtilRuntime.SCHEDULEPARAM_SCHEDULE_TYPE, "CRON");
        if (memoryTaskDTO.get("scheduled_at") != null) {
            String strTimerPolicy = convertTimeToOnceCron((Timestamp) memoryTaskDTO.get("scheduled_at"));
            schedule.put(ISysTaskUtilRuntime.SCHEDULEPARAM_TIMER_POLICY, strTimerPolicy);
        }
        schedule.put(ISysTaskUtilRuntime.SCHEDULEPARAM_PAYLOAD, memoryTaskDTO.get(memoryTaskDERuntime.getKeyPSDEField().getLowerCaseName()));
        return schedule;
    }

    protected void registerMemoryExtractTaskType() throws Exception {
        Map<String, Object> taskTypeParams = new LinkedHashMap<>();
        taskTypeParams.put(ISysTaskUtilRuntime.TASKTYPEPARAM_EXECUTOR_SUBTYPE, "PSSYSUTIL");
        String executorTag = String.format("%1$s.%2$s", this.getFullUniqueTag().toLowerCase(), memoryExtractActionTag);
        taskTypeParams.put(ISysTaskUtilRuntime.TASKTYPEPARAM_EXECUTOR_TAG, executorTag);
        taskTypeParams.put(ISysTaskUtilRuntime.TASKTYPEPARAM_LOCAL_EXECUTION, true);
        taskTypeParams.put(ISysTaskUtilRuntime.TASKTYPEPARAM_EXECUTOR_TYPE, "DEFAULT");
        taskTypeParams.put(ISysTaskUtilRuntime.TASKTYPEPARAM_RETRYABLE, false);

        this.getSysTaskUtilRuntime(false).registerTaskType(getMemoryExtractTaskType(), taskTypeParams, true, false);
    }

    protected String getMemoryExtractTaskType() {
        return memoryExtractTaskType;
    }

    protected Object extractMemory(IEntityDTO memoryTaskDTO) throws Throwable {
        IDataEntityRuntime memoryTaskDERuntime = this.getMemoryTaskDERuntime(false);
        // 获取任务实例
        IEntityDTO memoryTask = memoryTaskDERuntime.get(memoryTaskDTO.get(memoryTaskDERuntime.getKeyPSDEField().getLowerCaseName()), true);
        IPSDEField sessionField = memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_SESSION_ID);
        IPSDEField statusField = memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_STATUS);
        IPSDEField lastMsgTimeField = memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_LAST_MSG_TIME);
        IPSDEField executedAtField = memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_EXECUTED_AT);
        IPSDEField endAtField = memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_END_AT);

        IPSDEField messageSessionField = chatMessagePSDEFieldMap.get(MESSAGE_PREDEFINEDFIELD_SESSION_ID);
        IPSDEField messageContentField = chatMessagePSDEFieldMap.get(MESSAGE_PREDEFINEDFIELD_CONTENT);
        IPSDEField messageSenderTypeField = chatMessagePSDEFieldMap.get(MESSAGE_PREDEFINEDFIELD_SENDER_TYPE);
        IPSDEField messageCreateDateField = this.getChatMessageDERuntime(false).getPSDEFieldByPredefinedType(PSModelEnums.PredefinedFieldType.CREATEDATE,false);
        // 更新任务状态
        ActionSessionManager.execute(new IAction() {
            @Override
            public Object execute(Object[] args) throws Throwable {
                memoryTask.set(executedAtField.getLowerCaseName(), LocalDateTime.now());
                memoryTask.set(statusField.getLowerCaseName(), "RUNNING");
                memoryTask.set("extracted_content", null);
                memoryTask.set("conversation_snapshot", null);
                memoryTask.set("update_strategy", null);
                memoryTaskDERuntime.update(memoryTask, true);
                return null;
            }
        }, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

        try {
            Object sessionId = memoryTask.get(sessionField.getLowerCaseName());
            // 1.查询会话的最新一条task
            ISearchContextDTO iMemoryTaskSearchContextDTO = memoryTaskDERuntime.createSearchContext();
            iMemoryTaskSearchContextDTO.eq(sessionField.getLowerCaseName(), sessionId);
            iMemoryTaskSearchContextDTO.eq(statusField.getLowerCaseName(), "SUCCESS");
            iMemoryTaskSearchContextDTO.sort(String.format("%1$s,desc", lastMsgTimeField.getLowerCaseName()));
            IEntityDTO lastSuccessMemoryTask = memoryTaskDERuntime.selectOne(iMemoryTaskSearchContextDTO, true);

            // 2.查询最新task后续产生的会话消息
            IDataEntityRuntime iAIAgentMessageDERuntime = this.getChatMessageDERuntime(false);
            ISearchContextDTO iMessageSearchContextDTO = iAIAgentMessageDERuntime.createSearchContext();
            iMessageSearchContextDTO.eq(messageSessionField.getLowerCaseName(), sessionId);
            iMessageSearchContextDTO.sort("create_time,asc");
            iMessageSearchContextDTO.limit(1000);
            if (lastSuccessMemoryTask != null && lastSuccessMemoryTask.get(lastMsgTimeField.getLowerCaseName()) != null) {
                iMessageSearchContextDTO.gt("create_time", lastSuccessMemoryTask.get(lastMsgTimeField.getLowerCaseName()));
            }
            List<IEntityDTO> aiAgentMessageList = iAIAgentMessageDERuntime.selectDataQuery(iAIAgentMessageDERuntime.getViewPSDEDataQuery(), iMessageSearchContextDTO);

            // 3.附加聊天请求
            String prompt = "Extract memories based on the following conversation:\n";
            StringBuilder reqParam = new StringBuilder(prompt);

            for (IEntityDTO item : aiAgentMessageList) {
                String messageTime = item.getString(messageCreateDateField.getLowerCaseName(),"");
                String senderType = (String) item.get(messageSenderTypeField.getLowerCaseName());
                String content = (String) item.get(messageContentField.getLowerCaseName());
                String conversation = String.format("%1$s[%2$s]%3$s\n", messageTime,senderType, content);
                reqParam.append(conversation);
            }

            String strMessage = reqParam.toString();
            ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
            chatCompletionRequest.getMessagesIf().addAll(ChatMessagesBuilder.create().user(strMessage).build());

            // 4.记忆提取智能体调用
            ChatCompletionResult chatCompletionResult = this.getMemoryExtractResult(this.getChatAgent(), chatCompletionRequest);
            String extractMemoryStr = chatCompletionResult.getChoices() != null ? chatCompletionResult.getChoices().get(0).getContent() : null;
            // 5.记忆提取交谈返回
            if (aiAgentMessageList.size() > 0 && StringUtils.hasLength(extractMemoryStr)) {
                extractMemoryStr = AIChatUtils.getJsonContent(extractMemoryStr);
                memoryTask.set("extracted_content", extractMemoryStr);
                String conversationSnapshot = reqParam.substring(prompt.length());
                memoryTask.set("conversation_snapshot", conversationSnapshot);
                IEntityDTO lastMessage = aiAgentMessageList.get(aiAgentMessageList.size() - 1);
                memoryTask.set(lastMsgTimeField.getLowerCaseName(), lastMessage.get("create_time"));

                Map<String, Object> extractMemoryObj = JsonUtils.asMap(extractMemoryStr);
                List<Map<String, Object>> candidatesList = (List<Map<String, Object>>) (extractMemoryObj.get("candidates") != null ? extractMemoryObj.get("candidates") : new ArrayList<>());

                // 提取记忆智能体返回的事实真相和过程日志
                List<Map<String, Object>> factSourceCandidates = new ArrayList<>();
                List<Map<String, Object>> residentSourceCandidates = new ArrayList<>();
                List<Map<String, Object>> dailyLogCandidates = new ArrayList<>();
                for (Map<String, Object> item : candidatesList) {
                    if ("fact_source".equals(item.get("mem_type"))) {
                        factSourceCandidates.add(item);
                    }
                    if ("resident".equals(item.get("mem_type"))) {
                        residentSourceCandidates.add(item);
                    }
                    if ("daily_log".equals(item.get("mem_type"))) {
                        dailyLogCandidates.add(item);
                    }
                }

                // 常规记忆存入
                if (factSourceCandidates.size() > 0) {
                    memoryTask.set(MEMORYTASK_PREDEFINEDFIELD_MEMORY_TYPE.toLowerCase(), MEMORY_TYPE_REGULAR);
                    this.writeMemory(memoryTask, factSourceCandidates);
                }

                // 常驻记忆存入
                if (residentSourceCandidates.size() > 0) {
                    memoryTask.set(MEMORYTASK_PREDEFINEDFIELD_MEMORY_TYPE.toLowerCase(), MEMORY_TYPE_RESIDENT);
                    this.writeMemory(memoryTask, residentSourceCandidates);
                }

                // 过程日志存入
                if (dailyLogCandidates.size() > 0) {
                    memoryTask.set(MEMORYTASK_PREDEFINEDFIELD_MEMORY_TYPE.toLowerCase(), MEMORY_TYPE_DAILY);
                    this.writeMemory(memoryTask, dailyLogCandidates);
                }

            }
            memoryTask.set(endAtField.getLowerCaseName(), LocalDateTime.now());
            memoryTask.set(statusField.getLowerCaseName(), "SUCCESS");
            memoryTask.set("result", "执行成功");
            // 更新智能体记忆任务实例
            memoryTaskDERuntime.update(memoryTask, true);
        } catch (Throwable e) {
            memoryTask.set(endAtField.getLowerCaseName(), LocalDateTime.now());
            memoryTask.set(statusField.getLowerCaseName(), "FAILED");
            memoryTask.set("result", e.getMessage());
            // 更新智能体记忆任务实例
            memoryTaskDERuntime.update(memoryTask, true);
        } finally {
            stopJob(memoryTask);
            memoryTaskMap.remove(memoryTask.get(memoryTaskDERuntime.getKeyPSDEField().getLowerCaseName()));
        }

        return memoryTask;
    }

    protected void writeMemory(IEntityDTO memoryTask, List<Map<String, Object>> sourceCandidates) throws Throwable {
        String lockKey = getLockKey(memoryTask);
        Object lock = locks.computeIfAbsent(lockKey, k -> new Object());
        synchronized (lock) {
            try {
                onWriteMemory(memoryTask, sourceCandidates);
            } finally {
                locks.remove(lockKey, lock);
            }
        }
    }

    protected void onWriteMemory(IEntityDTO memoryTask, List<Map<String, Object>> sourceCandidates) throws Throwable {
        String memoryType = memoryTask.getString(MEMORYTASK_PREDEFINEDFIELD_MEMORY_TYPE.toLowerCase(), MEMORY_TYPE_REGULAR);
        switch (memoryType) {
            case MEMORY_TYPE_REGULAR:
                writeRegularMemory(memoryTask, sourceCandidates);
                break;
            case MEMORY_TYPE_DAILY:
                writeDailyLogMemory(memoryTask, sourceCandidates);
                break;
            case MEMORY_TYPE_RESIDENT:
                writeResidentMemory(memoryTask, sourceCandidates);
                break;
            default:
                throw new RuntimeException(String.format("无法识别的记忆类型值[%1$s]", memoryType));
        }
    }

    protected ChatCompletionResult doChatCompletion(String strChatAgent, ChatCompletionRequest chatCompletionRequest) throws Throwable {
        if (StringUtils.hasLength(strChatAgent)) {
            return this.getSysAIUtilRuntime(false).chatCompletion(strChatAgent, chatCompletionRequest);
        } else {
            return this.getSysAIUtilRuntime(false).chatCompletion(this.getChatAgent(), chatCompletionRequest);
        }

    }

    protected Page<Chunk> doFetchChunks(ChunkSearchContext chunkSearchContext) throws Throwable {
        Object kbid = chunkSearchContext != null ? chunkSearchContext.get("n_kbid_eq") : null;
        if(ObjectUtils.isEmpty(kbid)) {
            throw new Exception(String.format("传入知识库标识无效"));
        }
        String strQuery = chunkSearchContext.getQuery();
        Map<String, Object> metadata = null;
        if (ObjectUtils.isEmpty(strQuery) && ObjectUtils.isEmpty(chunkSearchContext.getQueries())) {
            if(!ObjectUtils.isEmpty(chunkSearchContext.get(IChunkSearchContext.PARAM_HISTORIES))){
                Page<Chunk> chunkPage = this.getSysKBUtilRuntime(false).fetchChunksByHistories(getKBAgentConfigId(kbid), chunkSearchContext);
                if (chunkPage instanceof IPage) {
                    IPage iPage = (IPage) chunkPage;
                    if (iPage.getMetadata() != null) {
                        if(metadata == null) {
                            metadata = new HashMap<String, Object>(iPage.getMetadata());
                        }
                    }
                }
                //进一步放入
                if(metadata != null) {
                    if(ObjectUtils.isEmpty(chunkSearchContext.getQueries())) {
                        if(!ObjectUtils.isEmpty(metadata.get(IChunkSearchContext.PARAM_QUERIES))) {
                            chunkSearchContext.set(IChunkSearchContext.PARAM_QUERIES, metadata.get(IChunkSearchContext.PARAM_QUERIES));
                        }else if(!ObjectUtils.isEmpty(metadata.get(IChunkSearchContext.PARAM_QUERY))){
                            chunkSearchContext.set(IChunkSearchContext.PARAM_QUERY, metadata.get(IChunkSearchContext.PARAM_QUERY));
                        }
                    }
                }
                return chunkPage;
            }
        } else {
            return this.getSysKBUtilRuntime(false).fetchChunks(getKBAgentConfigId(kbid), chunkSearchContext);
        }
        return new PageImpl<>(new ArrayList<>(), chunkSearchContext.getPageable(), 0);
    }

    protected ChatCompletionResult getMemoryExtractResult(String strChatAgent, ChatCompletionRequest chatCompletionRequest) throws Throwable {
        // 填充系统提示词
        chatCompletionRequest.getMessages().addAll(0, ChatMessagesBuilder.create().system(this.getMemoryExtractPrompt()).build());
        return this.doChatCompletion(strChatAgent, chatCompletionRequest);
    }

    protected ChatCompletionResult getMemoryVerificationResult(String strChatAgent, ChatCompletionRequest chatCompletionRequest) throws Throwable {
        // 填充系统提示词
        chatCompletionRequest.getMessages().addAll(0, ChatMessagesBuilder.create().system(this.getMemoryVerificationPrompt()).build());
        return this.doChatCompletion(strChatAgent, chatCompletionRequest);
    }

    /**
     * 根据类型填充文档标识
     *
     * @param memoryTask
     * @throws Throwable
     */
    protected IEntityDTO fillDefaultDocId(IEntityDTO memoryTask) throws Throwable {
        String docId = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG).getLowerCaseName());
        if (!StringUtils.hasLength(docId)) {
            List<Object> values = new ArrayList<>();
            // doc_id为知识库标识||业务范围标识||用户标识合成
            String kbTag = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG).getLowerCaseName());
            String mode = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE).getLowerCaseName());
            String docPath = "";
            if (kbTag != null) {
                String realKBId = this.getRealKBId(kbTag);
                values.add(realKBId);
                String userId = (String) memoryTask.get("user_id");
                String scope = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_BUSINESS_SCOPE).getLowerCaseName());
                if (mode == null || mode == "NONE") {
                    values.add(DEFAULT_GLOBAL_PATTERN);
                    values.add(DEFAULT_GLOBAL_PATTERN);
                    docPath = String.format("/%1$s/%2$s/", DEFAULT_GLOBAL_PATTERN, DEFAULT_GLOBAL_PATTERN);
                } else if (mode == "BUSINESS_SCOPE") {
                    values.add(scope);
                    values.add(DEFAULT_GLOBAL_PATTERN);
                    docPath = String.format("/%1$s/%2$s/", scope, DEFAULT_GLOBAL_PATTERN);
                } else if (mode == "USER_SCOPE") {
                    values.add(DEFAULT_GLOBAL_PATTERN);
                    values.add(userId);
                    docPath = String.format("/%1$s/%2$s/", DEFAULT_GLOBAL_PATTERN, userId);
                } else if (mode == "BUSINESS_USER_SCOPE") {
                    values.add(scope);
                    values.add(userId);
                    docPath = String.format("/%1$s/%2$s/", scope, userId);
                } else {
                    // 未识别按默认处理
                    values.add(DEFAULT_GLOBAL_PATTERN);
                    values.add(DEFAULT_GLOBAL_PATTERN);
                    docPath = String.format("/%1$s/%2$s/", DEFAULT_GLOBAL_PATTERN, DEFAULT_GLOBAL_PATTERN);
                }
                memoryTask.set("doc_path", docPath);
                memoryTask.set(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG).getLowerCaseName(), KeyValueUtils.genUniqueId(values.toArray()));
            }

        }
        return memoryTask;
    }

    /**
     * 获取记忆文档
     *
     * @param memoryTask
     * @throws Throwable
     */
    protected Document getMemoryDocument(IEntityDTO memoryTask) throws Throwable {
        String kbTag = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG).getLowerCaseName());
        String docId = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG).getLowerCaseName());
        String docPath = (String) memoryTask.get("doc_path");

        if (!StringUtils.hasLength(kbTag) || !StringUtils.hasLength(docId)) {
            log.error("缺少记忆知识库或文档标识，忽略获取记忆文档");
            return null;
        }
        String strActiveKBAgentConfigId = getKBAgentConfigId(kbTag);
        String realKBId = this.getRealKBId(kbTag);
        if(realKBId != kbTag){
            strActiveKBAgentConfigId = kbTag;
        }
        try {
        	Document document = this.getSysKBUtilRuntime(false).getDocument(strActiveKBAgentConfigId, docId, true);
        	if(document != null && document.getId() != null) {
            	return document;
            }
        } catch (Throwable e) {
            log.error("获取记忆知识库文档失败" + docId);
        }

        Document document = new Document();
        document.setId(docId);
        document.setName("Memory.md");
        document.setType("file");
        document.setKBId(realKBId);
        document.setCategories(docPath);
        return this.getSysKBUtilRuntime(false).saveDocument(strActiveKBAgentConfigId, docId, document);
    }

    /**
     * 根据类型获取常驻记忆文档
     *
     * @param memoryTask
     * @throws Throwable
     */
    protected Document getResidentDocument(IEntityDTO memoryTask) throws Throwable {
        List<Object> values = new ArrayList<>();
        // doc_id为知识库标识||业务范围标识||用户标识合成
        String kbTag = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG).getLowerCaseName());
        String mode = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE).getLowerCaseName());
        String docPath = "";
        String strActiveKBAgentConfigId = getKBAgentConfigId(kbTag);
        String realKBId = this.getRealKBId(kbTag);
        if(realKBId != kbTag){
            strActiveKBAgentConfigId = kbTag;
        }
        if (realKBId != null) {
            values.add(realKBId);
            String userId = (String) memoryTask.get("user_id");
            String scope = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_BUSINESS_SCOPE).getLowerCaseName());
            if (mode == null || mode == "NONE") {
                values.add(DEFAULT_GLOBAL_PATTERN);
                values.add(DEFAULT_GLOBAL_PATTERN);
                docPath = String.format("/%1$s/%2$s/resident", DEFAULT_GLOBAL_PATTERN, DEFAULT_GLOBAL_PATTERN);
            } else if (mode == "BUSINESS_SCOPE") {
                values.add(scope);
                values.add(DEFAULT_GLOBAL_PATTERN);
                docPath = String.format("/%1$s/%2$s/resident", scope, DEFAULT_GLOBAL_PATTERN);
            } else if (mode == "USER_SCOPE") {
                values.add(DEFAULT_GLOBAL_PATTERN);
                values.add(userId);
                docPath = String.format("/%1$s/%2$s/resident", DEFAULT_GLOBAL_PATTERN, userId);
            } else if (mode == "BUSINESS_USER_SCOPE") {
                values.add(scope);
                values.add(userId);
                docPath = String.format("/%1$s/%2$s/resident", scope, userId);
            } else {
                // 未识别按默认处理
                values.add(DEFAULT_GLOBAL_PATTERN);
                values.add(DEFAULT_GLOBAL_PATTERN);
                docPath = String.format("/%1$s/%2$s/resident", DEFAULT_GLOBAL_PATTERN, DEFAULT_GLOBAL_PATTERN);
            }
        }
        values.add("resident");
        String docId = KeyValueUtils.genUniqueId(values.toArray());
        if (!StringUtils.hasLength(realKBId) || !StringUtils.hasLength(docId)) {
            log.error("缺少记忆知识库或文档标识，忽略获取记忆文档");
            return null;
        }
        
        try {
        	Document document = this.getSysKBUtilRuntime(false).getDocument(strActiveKBAgentConfigId, docId, true);
        	if(document != null && document.getId() != null) {
        		return document;
        	}
            
        } catch (Throwable e) {
            log.error("获取记忆知识库文档失败" + docId);
        }
        Document document = new Document();
        document.setId(docId);
        document.setName("ResidentMemory.md");
        document.setType("file");
        document.setKBId(realKBId);
        document.setCategories(docPath);
        return this.getSysKBUtilRuntime(false).saveDocument(strActiveKBAgentConfigId, docId, document);
    }

    protected void writeRegularMemory(IEntityDTO memoryTask, List factSourceCandidates) throws Throwable {

        String kbTag = (String)memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG).getLowerCaseName());
        if(ObjectUtils.isEmpty(kbTag)) {
            throw new Exception(String.format("传入知识库标识无效"));
        }

        String docid = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG).getLowerCaseName());
        String realKBId = this.getRealKBId(kbTag);

        // 1.填充默认文档标识
        this.fillDefaultDocId(memoryTask);

        // 2.记忆检索
        ChunkSearchContext chunkSearchContext = new ChunkSearchContext();
        chunkSearchContext.limit(40);
        if(!ObjectUtils.isEmpty(docid)) {
            chunkSearchContext.set("n_docid_in", docid);
        }
        chunkSearchContext.set("n_kbid_eq", realKBId);
        List<String> factContentList = new ArrayList<>();

        for (Object item : factSourceCandidates) {
            if (item instanceof Map) {
                Map factSource = (Map) item;
                factContentList.add(factSource.get("content").toString());
            }
        }
        chunkSearchContext.setQueries(factContentList);
        chunkSearchContext.setPageIndex(0);
        Page<Chunk> checkChunks = this.doFetchChunks(chunkSearchContext);

        // 3.记忆核验智能体调用
        ChatCompletionRequest chatCompletionRequest2 = new ChatCompletionRequest();
        String factSourceStr = JsonUtils.toString(factSourceCandidates);
//		chatCompletionRequest2.getMessagesIf().addAll(ChatMessagesBuilder.create().user(factSourceStr).build());

        String prompt2 = "\nexisting_chunks：\n";
        StringBuilder reqParam2 = new StringBuilder(factSourceStr);
        if(!ObjectUtils.isEmpty(checkChunks.getContent())){
            reqParam2.append(prompt2);
            for (Chunk item : checkChunks.getContent()) {
                String chunkId = item.getId();
                String content = item.getContent();
                reqParam2.append(String.format("id:%1$s", chunkId)).append("\r\n").append(String.format("content:%1$s", content)).append("\r\n");
            }
        }
        chatCompletionRequest2.getMessagesIf().addAll(ChatMessagesBuilder.create().user(reqParam2.toString()).build());
        ChatCompletionResult chatCompletionResult2 = this.getMemoryVerificationResult(this.getChatAgent(), chatCompletionRequest2);
        String content = chatCompletionResult2.getChoices().get(0).getContent();
        content = AIChatUtils.getJsonContent(content);
        String verificationResultStr = (StringUtils.hasText(content) && !"[]".equals(content)) ? content : null;

        // 4.记忆核验返回重新构造切片
        if (verificationResultStr != null) {
            String updateStrategy = memoryTask.getString("update_strategy","");
            memoryTask.set("update_strategy", String.format("%1$sRegularMemory:\n%1$s\n",updateStrategy,verificationResultStr));
            List<IEntity> latestMemorys = new ArrayList<>();
            latestMemorys = this.processOperations(checkChunks.getContent(), verificationResultStr);
            if (latestMemorys.size() > 0) {
                // 5.获取记忆文档
                this.getMemoryDocument(memoryTask);
                // 6.获取记忆分块
                for (IEntity memory : latestMemorys) {
                    Chunk memoryChunk = (Chunk) memory;
                    memoryChunk.setKBId(realKBId);
                    memoryChunk.setDocId(docid);
                    this.saveMemoryChunk(memoryChunk);
                }
            }
        }
    }

    protected void writeDailyLogMemory(IEntityDTO memoryTask, List dailyLogs) throws Throwable {
        String kbTag = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG).getLowerCaseName());
        if(ObjectUtils.isEmpty(kbTag)) {
            throw new Exception(String.format("传入知识库标识无效"));
        }
        String mode = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE).getLowerCaseName());
        String agentContextId = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_AI_AGENT_CONTEXT_ID).getLowerCaseName());
        String strActiveKBAgentConfigId = getKBAgentConfigId(kbTag);
        String realKBId = this.getRealKBId(kbTag);
        if(realKBId != kbTag){
            strActiveKBAgentConfigId = kbTag;
        }
        if (realKBId != null && dailyLogs != null) {
            List<Object> values = new ArrayList<>();
            values.add(realKBId);

            // 获取当前日期字符串
            String curdate = DateUtils.toDateString(new Date());
            String user_id = (String) memoryTask.get("user_id");
            String scope = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_BUSINESS_SCOPE).getLowerCaseName());

            String docPath = "";

            // 逻辑分支处理
            if (mode == null || "NONE".equals(mode)) {
                values.add(DEFAULT_GLOBAL_PATTERN);
                values.add(DEFAULT_GLOBAL_PATTERN);
                docPath = String.format("/%1$s/%2$s/daily/%3$s/", DEFAULT_GLOBAL_PATTERN, DEFAULT_GLOBAL_PATTERN, curdate);
            } else if ("BUSINESS_SCOPE".equals(mode)) {
                values.add(scope);
                values.add(DEFAULT_GLOBAL_PATTERN);
                docPath = String.format("/%1$s/%2$s/daily/%3$s/", scope, DEFAULT_GLOBAL_PATTERN, curdate);
            } else if ("USER_SCOPE".equals(mode)) {
                values.add(DEFAULT_GLOBAL_PATTERN);
                values.add(user_id);
                docPath = String.format("/%1$s/%2$s/daily/%3$s/", DEFAULT_GLOBAL_PATTERN, user_id, curdate);
            } else if ("BUSINESS_USER_SCOPE".equals(mode)) {
                values.add(scope);
                values.add(user_id);
                docPath = String.format("/%1$s/%2$s/daily/%3$s/", scope, user_id, curdate);
            } else {
                // 未识别按默认处理
                values.add(DEFAULT_GLOBAL_PATTERN);
                values.add(DEFAULT_GLOBAL_PATTERN);
                docPath = String.format("/%1$s/%2$s/daily/%3$s/", DEFAULT_GLOBAL_PATTERN, DEFAULT_GLOBAL_PATTERN, curdate);
            }
            values.add(curdate);
            // 生成唯一 ID
            String docId = KeyValueUtils.genUniqueId(values.toArray());

            Document _document = null;
            try {
                _document = this.getSysKBUtilRuntime(false).getDocument(strActiveKBAgentConfigId, docId, true);
            } catch (Throwable e) {
                log.error(String.format("获取[%1$s]%2$s记忆文档失败，自动建立",curdate ,docId));
            }

            // 收集内容并拼接
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            for (Object item : dailyLogs) {
                if (item instanceof Map) {
                    Map dailyLog = (Map) item;
                    if (item != null && dailyLog.get("content") != null) {
                        if (!first) {
                            sb.append("\n");
                        }
                        sb.append(dailyLog.get("content"));
                        first = false;
                    }
                }
            }
            String newContent = sb.toString();
            String agentHeader = String.format(DEFAULT_DAILY_AGENT_HEADER_FORMAT,agentContextId);

            if (_document == null || _document.getId() == null) {
                _document = new Document();
                _document.setId(docId);
                _document.setName(curdate + ".md");
                _document.setType("file");
                _document.setKBId(realKBId);
                _document.setCategories(docPath);
                newContent = agentHeader + "\n" + newContent;
                _document.setContent(newContent);
            } else {
                String docContent = (String) _document.get("content");
                String anyHeaderRegex = String.format(DEFAULT_DAILY_AGENT_HEADER_FORMAT,"(.+?)");
                String newDocContent;
                if (docContent.contains(agentHeader)) {
                    Pattern headerPattern = Pattern.compile(anyHeaderRegex);
                    Matcher headerMatcher = headerPattern.matcher(docContent);
                    // 1. 找到当前 Agent Header 的结束位置
                    int currentEndPos = docContent.indexOf(agentHeader) + agentHeader.length();
                    // 2. 寻找“下一个” Agent Header 的开始位置
                    int nextHeaderStartPos = -1;
                    while (headerMatcher.find()) {
                        int pos = headerMatcher.start();
                        // 找到一个在 currentEndPos 之后的位置，即为下一个 Header
                        if (pos >= currentEndPos) {
                            nextHeaderStartPos = pos;
                            break; // 找到第一个就跳出
                        }
                    }
                    // 3. 构建新文档
                    // 第一部分：当前 Header 及其之前的所有内容
                    String part1 = docContent.substring(0, currentEndPos);

                    // 第二部分：当前 Header 和下一个 Header 之间的旧内容（历史数据）
                    String part2 = "";
                    if (nextHeaderStartPos != -1) {
                        // 如果有下一个 Header，截取中间这一段
                        part2 = docContent.substring(currentEndPos, nextHeaderStartPos);
                    } else {
                        // 如果没有下一个 Header（即当前是最后一个），截取直到文档末尾
                        part2 = docContent.substring(currentEndPos);
                    }

                    // 第三部分：新内容
                    String part3 = "\n\n" + newContent + "\n\n";

                    // 第四部分：下一个 Header 及其之后的内容（如果有）
                    String part4 = "";
                    if (nextHeaderStartPos != -1) {
                        part4 = docContent.substring(nextHeaderStartPos);
                    }
                    // 4. 拼接：[前缀] + [旧内容] + [新内容] + [后缀]
                    newDocContent = part1 + part2 + part3 + part4;
                } else {
                    // 首次写入该 Agent
                    newDocContent = docContent + "\n\n" + agentHeader + "\n\n" + newContent + "\n\n";
                }
                _document.setContent(newDocContent);
            }

            this.getSysKBUtilRuntime(false).saveDocument(strActiveKBAgentConfigId, docId, _document);
        }

    }

    protected void writeResidentMemory(IEntityDTO memoryTask, List residentSourceCandidates) throws Throwable {
        String kbTag = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG).getLowerCaseName());
        if(ObjectUtils.isEmpty(kbTag)) {
            throw new Exception(String.format("传入知识库标识无效"));
        }
        String strActiveKBAgentConfigId = getKBAgentConfigId(kbTag);
        String realKBId = this.getRealKBId(kbTag);
        if(realKBId != kbTag){
            strActiveKBAgentConfigId = kbTag;
        }
        // 提取常驻记忆
        Document document = this.getResidentDocument(memoryTask);

        // 记忆核验智能体调用
        ChatCompletionRequest chatCompletionRequest2 = new ChatCompletionRequest();
        String factSourceStr = JsonUtils.toString(residentSourceCandidates);
        chatCompletionRequest2.getMessagesIf().addAll(ChatMessagesBuilder.create().user(factSourceStr).build());

        String prompt2 = "existing_chunks：\n";
        StringBuilder reqParam2 = new StringBuilder(prompt2);

        String documentId = document.getId();
        String documentContent = DataTypeUtils.asString(document.getContent(), "");
        reqParam2.append(String.format("id:%1$s", documentId)).append("\r\n").append(String.format("content:%1$s", documentContent)).append("\r\n");

        chatCompletionRequest2.getMessagesIf().addAll(ChatMessagesBuilder.create().user(reqParam2.toString()).build());
        chatCompletionRequest2.getMessagesIf().addAll(0,ChatMessagesBuilder.create().system("**ALLOWMODE**:INSERT_LINES|UPDATE_LINES").build());
        ChatCompletionResult chatCompletionResult2 = this.getMemoryVerificationResult(this.getChatAgent(), chatCompletionRequest2);
        String content = chatCompletionResult2.getChoices().get(0).getContent();
        content = AIChatUtils.getJsonContent(content);
        String verificationResultStr = (StringUtils.hasText(content) && !"[]".equals(content)) ? content : null;

        // 记忆核验返回重新构造记忆内容
        if (verificationResultStr != null) {
            String updateStrategy = memoryTask.getString("update_strategy","");
            memoryTask.set("update_strategy", String.format("%1$sResidentMemory:\n%1$s\n",updateStrategy,verificationResultStr));
            List<IEntity> latestMemorys = new ArrayList<>();
            latestMemorys = this.processOperations(Arrays.asList(document), verificationResultStr);
            if (latestMemorys.size() > 0) {
                // 5.获取记忆文档
                this.getMemoryDocument(memoryTask);
                // 6.获取记忆分块
                for (IEntity memory : latestMemorys) {
                    if(memory instanceof Document) {
                        Document memoryDocument = (Document) memory;
                        this.getSysKBUtilRuntime(false).saveDocument(strActiveKBAgentConfigId, memoryDocument.getId(), memoryDocument);
                    }
                }
            }
        }
    }

    protected Chunk getMemoryChunk(String chunkId, String docId, String kbTag) throws Throwable {
        if (StringUtils.hasLength(chunkId)) {
            if (!StringUtils.hasLength(kbTag) || !StringUtils.hasLength(docId)) {
                log.error("缺少记忆知识库、文档标识，忽略获取记忆分块");
                return null;
            }
            String kbConfig = getKBAgentConfigId(kbTag);
            return this.getSysKBUtilRuntime(false).getChunk(kbConfig, docId, chunkId);
        }
        return null;
    }

    protected void saveMemoryChunk(Chunk chunk) throws Throwable {
        String chunkId = chunk.getId();
        String kbTag = chunk.getKBId();
        String docId = chunk.getDocId();
        String content = chunk.getContent();

        if (!StringUtils.hasLength(kbTag) || !StringUtils.hasLength(docId) || !StringUtils.hasLength(chunkId)) {
            log.error("缺少记忆知识库、文档标识或分块标识，忽略保存记忆分块");
            return;
        }
        chunk.set("type", "MANUAL");
        String kbConfig = getKBAgentConfigId(kbTag);
        this.getSysKBUtilRuntime(false).saveChunk(kbConfig, docId, chunkId, chunk);
    }

    /**
     * 处理一批操作指令,返回修改结果集合
     *
     * @param existingMemory
     * @param opsJson
     * @return
     */
    private List<IEntity> processOperations(List<? extends IEntity> existingMemory, String opsJson) throws Exception {

        List<Map<String, Object>> ops = JsonUtils.asList(opsJson);

        // 3. 建立索引 (HashMap)
        Map<Object, IEntity> existingMemoryMap = new HashMap<>();
        for (Object item : existingMemory) {
            IEntity iEntity = (IEntity) item;
            existingMemoryMap.put(iEntity.get("id"), iEntity);
        }

        List<Chunk> newChunks = new ArrayList<>();

        // 4. 处理 CREATE 操作
        for (Map<String, Object> op : ops) {
            if ("CREATE".equals(op.get("operation"))) {
                Object targetId = op.get("target_chunk_id");
                String id = (targetId != null) ? targetId.toString() : KeyValueUtils.genUniqueId();

                Chunk chunk = new Chunk();
                chunk.setId(id);
                chunk.setContent((String) op.get("final_content"));
                newChunks.add(chunk);
                log.error("[CREATE] " + id);
            }
        }

        // 5. 处理 MODIFY (非 CREATE)
        // 先分组：按 target_chunk_id 分组
        Map<Object, List<Map<String, Object>>> groupedOps = new HashMap<>();
        for (Map<String, Object> op : ops) {
            if (!"CREATE".equals(op.get("operation"))) {
                Object targetId = op.get("target_chunk_id");
                if (targetId == null)
                    continue;

                if (!groupedOps.containsKey(targetId)) {
                    groupedOps.put(targetId, new ArrayList<Map<String, Object>>());
                }
                groupedOps.get(targetId).add(op);
            }
        }

        // 遍历分组后的操作并应用
        for (Map.Entry<Object, List<Map<String, Object>>> entry : groupedOps.entrySet()) {
            Object id = entry.getKey();
            List<Map<String, Object>> chunkOps = entry.getValue();

            IEntity target = existingMemoryMap.get(id);
            if (target == null) {
                log.error("警告：未找到 Chunk " + id + ", 跳过");
                continue;
            }
            String contentObj = DataTypeUtils.asString(target.get("content"), "");
            List<String> originalLines = Arrays.asList(contentObj.split("\\R"));
            // 计算偏移量
            List<String> processedLines = applyOffsetAlgorithm(originalLines, chunkOps);
            if (!ObjectUtils.isEmpty(processedLines)) {
                String finalContent = processedLines.stream().collect(Collectors.joining("\n"));
                target.set("content", finalContent);
            }
        }

        // 6. 合并结果：原有(已修改) + 新增
        List<IEntity> result = new ArrayList<>();
        result.addAll(existingMemoryMap.values());
        result.addAll(newChunks);

        return result;
    }

    /**
     * 应用操作并自动修正行号偏移
     *
     * @param originalLines
     * @param ops
     * @return 返回新列表
     */
    private List<String> applyOffsetAlgorithm(List<String> originalLines, List<Map<String, Object>> ops) {
        int offset = 0;

        // 复制一份列表，避免修改原始引用
        List<String> currentLines = new ArrayList<>(originalLines);

        // 1. 按行号升序排序，确保偏移量计算正确
        ops.sort(new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> op1, Map<String, Object> op2) {
                // 获取第一个对象的排序值
                int val1 = getSortValue(op1);
                // 获取第二个对象的排序值
                int val2 = getSortValue(op2);

                // 比较两个值
                return Integer.compare(val1, val2);
            }

            private int getSortValue(Map<String, Object> op) {
                String operation = (String) op.get("operation");

                if ("UPDATE_LINES".equals(operation)) {
                    Map<String, Object> lineRange = (Map<String, Object>) op.get("line_range");
                    return ((Number) lineRange.get("start")).intValue();
                } else {
                    return ((Number) op.get("insert_after_line")).intValue();
                }
            }
        });

        // 2. 遍历操作
        for (Map<String, Object> op : ops) {
            String operation = (String) op.get("operation");

            if ("UPDATE_LINES".equals(operation)) {
                // 获取 line_range 对象
                Map<String, Object> lineRange = (Map<String, Object>) op.get("line_range");
                int startOrig = ((Number) lineRange.get("start")).intValue();
                int endOrig = ((Number) lineRange.get("end")).intValue();

                int start = startOrig + offset;
                int end = endOrig + offset;
                int size = currentLines.size();

                // 边界检查
                if (start < 1 || end > size) {
                    throw new RuntimeException("行号越界：" + start + "-" + end + ", 当前行数：" + size);
                }

                int from = start - 1; // 0-based start
                int to = end; // subList end is exclusive

                // 获取新内容
                @SuppressWarnings("unchecked")
                List<String> newContentLines = (List<String>) op.get("new_content_lines");

                // 构建新列表: head + new + tail
                List<String> result = new ArrayList<>();
                if (from > 0) {
                    result.addAll(currentLines.subList(0, from));
                }
                result.addAll(newContentLines);
                if (to < size) {
                    result.addAll(currentLines.subList(to, size));
                }

                currentLines = result;

                // 更新偏移量
                int oldCount = end - start + 1;
                int newCount = newContentLines.size();
                offset += (newCount - oldCount);

            } else if ("INSERT_LINES".equals(operation)) {
                int insertAfterOrig = ((Number) op.get("insert_after_line")).intValue();
                int rawIdx = insertAfterOrig + offset;

                // 边界保护
                int idx = Math.max(0, Math.min(rawIdx, currentLines.size()));

                @SuppressWarnings("unchecked")
                List<String> newContentLines = (List<String>) op.get("new_content_lines");

                // 构建新列表
                List<String> result = new ArrayList<>();
                if (idx > 0) {
                    result.addAll(currentLines.subList(0, idx));
                }
                result.addAll(newContentLines);
                if (idx < currentLines.size()) {
                    result.addAll(currentLines.subList(idx, currentLines.size()));
                }

                currentLines = result;

                // 更新偏移量
                offset += newContentLines.size();
            }
        }

        return currentLines;
    }

    protected List<Chunk> retrieveMemory(IEntityDTO memoryTask, IChunkSearchContext iChunkSearchContext) throws Throwable {
        String memoryType = memoryTask.getString(MEMORYTASK_PREDEFINEDFIELD_MEMORY_TYPE.toLowerCase(), "");
        List<Chunk> chunks = new ArrayList<>();
        switch (memoryType) {
            case MEMORY_TYPE_REGULAR:
                chunks.addAll(retrieveRegularMemory(memoryTask, iChunkSearchContext));
                break;
            case MEMORY_TYPE_RESIDENT:
                chunks.addAll(retrieveResidentMemory(memoryTask, iChunkSearchContext));
                break;
            case MEMORY_TYPE_DAILY:
                chunks.addAll(retrieveDailyMemory(memoryTask, iChunkSearchContext));
                break;
            default:
                chunks.addAll(retrieveRegularMemory(memoryTask, iChunkSearchContext));
                chunks.addAll(retrieveResidentMemory(memoryTask, iChunkSearchContext));
                chunks.addAll(retrieveDailyMemory(memoryTask, iChunkSearchContext));
        }
        return chunks;
    }

    protected List<Chunk> retrieveRegularMemory(IEntityDTO memoryTask, IChunkSearchContext iChunkSearchContext) throws Throwable {
        String kbTag = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG).getLowerCaseName());
        if(ObjectUtils.isEmpty(kbTag)) {
            throw new Exception(String.format("传入知识库标识无效"));
        }
        String realKBId = this.getRealKBId(kbTag);
        String docTag = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG).getLowerCaseName());
        String memoryIsolationMode = memoryTask.getString(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE).getLowerCaseName(), "NONE");
        String businessScope = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_BUSINESS_SCOPE).getLowerCaseName());
        ChunkSearchContext chunkSearchContext = new ChunkSearchContext();
        if (iChunkSearchContext != null) {
            iChunkSearchContext.copyTo(chunkSearchContext);
        } else {
            // 默认条件
            int maxMemoryCount = 20;
            float memoryThreshold = new Float(0.4);
            int memoryRerank = 0;
            chunkSearchContext.setSimilarityThreshold(memoryThreshold);
            chunkSearchContext.setTextReRank(memoryRerank);
            chunkSearchContext.setPageIndex(0);
            chunkSearchContext.setPageable(0, maxMemoryCount, 0);
        }
        chunkSearchContext.set("n_kbid_eq", realKBId);
        if (!ObjectUtils.isEmpty(docTag)) {
            chunkSearchContext.set("n_docid_in", docTag);
        } else {
            // 使用目录检索，全局记忆始终附加
            String publicMemoryPath = String.format("/%1$s/%2$s/", DEFAULT_GLOBAL_PATTERN, DEFAULT_GLOBAL_PATTERN);
            ArrayList categories = new ArrayList<>();
            categories.add(publicMemoryPath);
            String userId = UserContext.getCurrent().getUserid();
            if ("BUSINESS_SCOPE".equals(memoryIsolationMode)) {
                if (StringUtils.hasLength(businessScope)) {
                    String businessScopePath = String.format("/%1$s/%2$s/", businessScope, DEFAULT_GLOBAL_PATTERN);
                    categories.add(businessScopePath);
                }
            } else if ("USER_SCOPE".equals(memoryIsolationMode)) {
                String userScopePath = String.format("/%1$s/%2$s/", DEFAULT_GLOBAL_PATTERN, userId);

                categories.add(userScopePath);
            } else if ("BUSINESS_USER_SCOPE".equals(memoryIsolationMode)) {
                if (StringUtils.hasLength(businessScope)) {
                    String businessUserScopePath = String.format("/%1$s/%2$s/", businessScope, UserContext.getCurrent().getUserid());
                    String businessScopePath = String.format("/%1$s/%2$s/", businessScope, DEFAULT_GLOBAL_PATTERN);
                    categories.add(businessScopePath);
                    categories.add(businessUserScopePath);
                }
            }
            chunkSearchContext.setDocCategories(categories);
        }
        List<Chunk> chunks = this.doFetchChunks(chunkSearchContext).getContent();
        //回写
        iChunkSearchContext.set(IChunkSearchContext.PARAM_QUERIES,chunkSearchContext.getQueries());
        for (Chunk chunk : chunks) {
            chunk.setType(ChunkType.REGULARMEMORY.getValue());
        }
        return chunks;
    }

    protected List<Chunk> retrieveResidentMemory(IEntityDTO memoryTask, IChunkSearchContext iChunkSearchContext) throws Throwable {
        List<Chunk> memoryChunks = new ArrayList<>();
        String kbTag = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG).getLowerCaseName());
        String memoryIsolationMode = memoryTask.getString(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG).getLowerCaseName(), "NONE");
        String businessScope = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_BUSINESS_SCOPE).getLowerCaseName());
        List<String> residentMemoryDoctags = new ArrayList<>();
        String userId = UserContext.getCurrent().getUserid();
        String strActiveKBAgentConfigId = getKBAgentConfigId(kbTag);
        String realKBId = this.getRealKBId(kbTag);
        if(realKBId != kbTag){
            strActiveKBAgentConfigId = kbTag;
        }
        residentMemoryDoctags.add(realKBId);
        if ("BUSINESS_SCOPE".equals(memoryIsolationMode)) {
            if (StringUtils.hasLength(businessScope)) {
                residentMemoryDoctags.add(businessScope);
                residentMemoryDoctags.add(DEFAULT_GLOBAL_PATTERN);
            }
        } else if ("USER_SCOPE".equals(memoryIsolationMode)) {
            residentMemoryDoctags.add(DEFAULT_GLOBAL_PATTERN);
            residentMemoryDoctags.add(userId);
        } else if ("BUSINESS_USER_SCOPE".equals(memoryIsolationMode)) {
            if (StringUtils.hasLength(businessScope)) {
                residentMemoryDoctags.add(businessScope);
                residentMemoryDoctags.add(userId);
            }
        } else {
            residentMemoryDoctags.add(DEFAULT_GLOBAL_PATTERN);
            residentMemoryDoctags.add(DEFAULT_GLOBAL_PATTERN);
        }
        residentMemoryDoctags.add("resident");
        String strDocumentId = KeyValueUtils.genUniqueId(residentMemoryDoctags.toArray());
        try {
            Document document = this.getSystemRuntime().getSysKBUtilRuntime(false).getDocument(strActiveKBAgentConfigId, strDocumentId, true);
            if (document != null && StringUtils.hasLength(document.getContent())) {
                String residentMemory = document.getContent();
                Chunk residentMemoryChunk = new Chunk();
                residentMemoryChunk.setId(document.getId());
                residentMemoryChunk.setContent(residentMemory);
                residentMemoryChunk.setType(ChunkType.RESIDENTMEMORY.getValue());
                memoryChunks.add(residentMemoryChunk);
            }
        } catch (Throwable e) {
            log.debug(String.format("常驻记忆文档未找到"));
        }
        return memoryChunks;
    }

    protected List<Chunk> retrieveDailyMemory(IEntityDTO memoryTask, IChunkSearchContext iChunkSearchContext) throws Throwable {
        List<Chunk> memoryChunks = new ArrayList<>();
        String kbTag = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG).getLowerCaseName());
        String memoryIsolationMode = memoryTask.getString(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG).getLowerCaseName(), "NONE");
        String businessScope = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_BUSINESS_SCOPE).getLowerCaseName());
        List<String> dailyMemoryDoctags = new ArrayList<>();
        String userId = UserContext.getCurrent().getUserid();
        if ("BUSINESS_SCOPE".equals(memoryIsolationMode)) {
            if (StringUtils.hasLength(businessScope)) {
                dailyMemoryDoctags.add(businessScope);
                dailyMemoryDoctags.add(DEFAULT_GLOBAL_PATTERN);
            }
        } else if ("USER_SCOPE".equals(memoryIsolationMode)) {
            dailyMemoryDoctags.add(DEFAULT_GLOBAL_PATTERN);
            dailyMemoryDoctags.add(userId);
        } else if ("BUSINESS_USER_SCOPE".equals(memoryIsolationMode)) {
            if (StringUtils.hasLength(businessScope)) {
                dailyMemoryDoctags.add(businessScope);
                dailyMemoryDoctags.add(userId);
            }
        } else {
            dailyMemoryDoctags.add(DEFAULT_GLOBAL_PATTERN);
            dailyMemoryDoctags.add(DEFAULT_GLOBAL_PATTERN);
        }

        String strActiveKBAgentConfigId = getKBAgentConfigId(kbTag);
        String realKBId = this.getRealKBId(kbTag);
        if(realKBId != kbTag){
            strActiveKBAgentConfigId = kbTag;
        }

        String agentContextId = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_AI_AGENT_CONTEXT_ID).getLowerCaseName());
        String agentHeader = String.format(DEFAULT_DAILY_AGENT_HEADER_FORMAT,agentContextId);

        // 时间范围(滑动窗口)
        int dayRange = 2;
        // 获取当前时间实例
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        boolean appendDailyfirst = true;
        for (int i = 0; i < dayRange; i++) {
            // 每次循环获取当前日历时间的日期字符串
            Date currentDate = calendar.getTime();
            String dateStr = net.ibizsys.runtime.util.DateUtils.toDateString(currentDate);
            List<String> dailyMemoryDoctagsTemp = new ArrayList<>();
            dailyMemoryDoctagsTemp.add(realKBId);
            dailyMemoryDoctagsTemp.addAll(dailyMemoryDoctags);
            dailyMemoryDoctagsTemp.add(dateStr);
            String strDocumentId = KeyValueUtils.genUniqueId(dailyMemoryDoctagsTemp.toArray());
            try {
                Document document = this.getSystemRuntime().getSysKBUtilRuntime(false).getDocument(strActiveKBAgentConfigId, strDocumentId, true);
                if (document != null && StringUtils.hasLength(document.getContent())) {
                    String dailyMemory = document.getContent();

                    if (dailyMemory.contains(agentHeader)) {
                        String anyHeaderRegex = String.format(DEFAULT_DAILY_AGENT_HEADER_FORMAT,"(.+?)");
                        Pattern headerPattern = Pattern.compile(anyHeaderRegex);
                        Matcher headerMatcher = headerPattern.matcher(dailyMemory);
                        int startPos=dailyMemory.indexOf(agentHeader);
                        int currentEndPos = startPos + agentHeader.length();
                        int nextHeaderStartPos = -1;
                        while (headerMatcher.find()) {
                            int pos = headerMatcher.start();
                            if (pos >= currentEndPos) {
                                nextHeaderStartPos = pos;
                                break;
                            }
                        }
                        String part = "";
                        if (nextHeaderStartPos != -1) {
                            part = dailyMemory.substring(currentEndPos, nextHeaderStartPos);
                        } else {
                            part = dailyMemory.substring(currentEndPos);
                        }
                        dailyMemory = part;
                    }else {
                        continue;
                    }

                    dailyMemory = String.format("%1$s:\n%2$s", dateStr, dailyMemory);
                    Chunk dailyMemoryChunk = new Chunk();
                    dailyMemoryChunk.setId(document.getId());
                    dailyMemoryChunk.setContent(dailyMemory);
                    dailyMemoryChunk.setType(ChunkType.DAILYMEMORY.getValue());
                    memoryChunks.add(dailyMemoryChunk);
                }
            } catch (Throwable e) {
                log.debug(String.format("日期:%1$s记忆文档未找到", dateStr));
            }
            calendar.add(Calendar.DATE, -1);
        }
        return memoryChunks;
    }

    protected String getChatAgent() {
        return this.strChatAgent;
    }

    protected String getMemoryExtractPrompt() {
        return this.getSystemRuntime().getResourceContent(SysChatMemoryUtilRuntimeBase.class, "MemoryExtractPrompt.en.md", false);
    }

    protected String getMemoryVerificationPrompt() {
        return this.getSystemRuntime().getResourceContent(SysChatMemoryUtilRuntimeBase.class, "MemoryVerificationPrompt.en.md", false);
    }

    protected void scheduleMemoryTask(IEntityDTO memoryTask) throws Throwable {
        IDataEntityRuntime memoryTaskDERuntime = this.getMemoryTaskDERuntime(false);
        ISearchContextDTO taskSearchContextDTO = memoryTaskDERuntime.createSearchContext();
        IPSDEField statusField = memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_STATUS);
        IPSDEField sessionIdField = memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_SESSION_ID);
        taskSearchContextDTO.eq(statusField.getLowerCaseName(),"PENDING")
                .eq(sessionIdField.getLowerCaseName(),sessionIdField.getLowerCaseName());
        if(memoryTaskDERuntime.existsData(taskSearchContextDTO)){
            //任务已存在忽略创建
            return;
        }
        memoryTaskDERuntime.create(memoryTask);
    }

    protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime() throws Exception {
        return getSysUniStateUtilRuntime(false);
    }

    protected ISysUniStateUtilRuntime tryGetSysUniStateUtilRuntime() {
        try {
            return getSysUniStateUtilRuntime(true);
        } catch (Exception ex) {
            return null;
        }
    }

    protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime(boolean bTryMode) throws Exception {
        if (this.iSysUniStateUtilRuntime != null || bTryMode) {
            return this.iSysUniStateUtilRuntime;
        }
        throw new Exception("未指定系统统一状态功能组件");
    }

    protected void setSysUniStateUtilRuntime(ISysUniStateUtilRuntime iSysUniStateUtilRuntime) {
        this.iSysUniStateUtilRuntime = iSysUniStateUtilRuntime;
    }

    protected void prepareSysUniStateUtilRuntime() {
        this.setSysUniStateUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, true));
    }

    protected ISysTaskUtilRuntime getSysTaskUtilRuntime(boolean bTryMode) throws Exception {
        if (this.iSysTaskUtilRuntime != null || bTryMode) {
            return this.iSysTaskUtilRuntime;
        }
        throw new Exception("未指定系统任务功能组件");
    }

    protected void setSysTaskUtilRuntime(ISysTaskUtilRuntime iSysTaskUtilRuntime) {
        this.iSysTaskUtilRuntime = iSysTaskUtilRuntime;
    }

    protected void prepareSysTaskUtilRuntime() {
        this.setSysTaskUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysTaskUtilRuntime.class, true));
    }

    public static String convertTimeToOnceCron(Timestamp executeTimestamp) {
        int DELAY = 5;
        long DELAY_MILLIS = DELAY * 60 * 1000L;

        long nowMillis = System.currentTimeMillis();
        long targetMillis = executeTimestamp.getTime();

        // 如果传入时间早于当前时间，说明任务过期了，需要推迟
        if (targetMillis < nowMillis) {
            // 计算新的执行时间：当前时间 + N分钟
            targetMillis = nowMillis + DELAY_MILLIS;
            // 将新的毫秒数转回 Timestamp，以便后续处理
            executeTimestamp = new Timestamp(targetMillis);

            log.warn(String.format("记忆提取任务时间已过期，已自动顺延至 %1$s 分钟后执行: %2$s", DELAY, executeTimestamp));
        }
        LocalDateTime dateTime = executeTimestamp.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        int second = dateTime.getSecond();
        int minute = dateTime.getMinute();
        int hour = dateTime.getHour();
        int day = dateTime.getDayOfMonth();
        int month = dateTime.getMonthValue();
        int year = dateTime.getYear();

        return String.format("%02d %02d %02d %02d %02d ? %04d", second, minute, hour, day, month, year);
    }

    protected Object onExecuteAction(String strActionName, Object[] args) throws Throwable {
        if (memoryExtractActionTag.equals(strActionName)) {
            IEntityDTO entityDTO = null;
            if (args[0] instanceof IEntityDTO) {
                entityDTO = (IEntityDTO) args[0];
            } else if (args[0] instanceof String) {
                entityDTO = this.getMemoryTaskDERuntime(false).createEntity();
                entityDTO.set(this.getMemoryTaskDERuntime(false).getKeyPSDEField().getLowerCaseName(), (String) args[0]);
            }
            return extractMemory(entityDTO);
        }
        return super.onExecuteAction(strActionName, args);
    }

    protected ISysAIUtilRuntime getSysAIUtilRuntime(boolean bTryMode) throws Exception {
        return this.getSystemRuntime().getSysAIUtilRuntime(bTryMode);
    }

    protected ISysKBUtilRuntime getSysKBUtilRuntime(boolean bTryMode) throws Exception {
        return this.getSystemRuntime().getSysKBUtilRuntime(bTryMode);
    }

    @Override
    public IAIChatMemoryUtil getAIChatMemoryUtil(String mode) {
        Assert.hasLength(mode, "传入模式无效");
        IAIChatMemoryUtil iAIChatMemoryUtil = aiChatMemoryUtilMap.get(mode);
        if (iAIChatMemoryUtil == null) {
            iAIChatMemoryUtil = this.createAIChatMemoryUtil(mode);
            this.aiChatMemoryUtilMap.put(mode, iAIChatMemoryUtil);
        }
        return iAIChatMemoryUtil;
    }

    protected IAIChatMemoryUtil createAIChatMemoryUtil(String mode) {
        return new IAIChatMemoryUtil() {

            @Override
            public void scheduleMemoryTask(Map<String, Object> memoryContext) throws Exception {
                IEntityDTO memoryTaskEntityDTO = toMemoryTaskEntityDTO(memoryContext);
                try {
                    SysChatMemoryUtilRuntimeBase.this.scheduleMemoryTask(memoryTaskEntityDTO);
                } catch (Throwable ex) {
                    ExceptionUtils.rethrowException(ex);
                }
            }

            @Override
            public void writeMemory(Map<String, Object> memoryContext, String content) throws Exception {
                IEntityDTO memoryTaskEntityDTO = toMemoryTaskEntityDTO(memoryContext);
                Map<String, Object> contentMap = new HashMap<String, Object>();
                contentMap.put("content", content);
                try {
                    SysChatMemoryUtilRuntimeBase.this.writeMemory(memoryTaskEntityDTO, Arrays.asList(contentMap));
                } catch (Throwable ex) {
                    ExceptionUtils.rethrowException(ex);
                }
            }

            @Override
            public List<Chunk> retrieveMemory(Map<String, Object> memoryContext, IChunkSearchContext iChunkSearchContext) throws Exception {
                IEntityDTO memoryTaskEntityDTO = toMemoryTaskEntityDTO(memoryContext);
                try {
                    return SysChatMemoryUtilRuntimeBase.this.retrieveMemory(memoryTaskEntityDTO, iChunkSearchContext);
                } catch (Throwable ex) {
                    ExceptionUtils.rethrowException(ex);
                }
                return null;
            }

        };
    }

    protected IEntityDTO toMemoryTaskEntityDTO(Map<String, Object> memoryTask) throws Exception {
        IEntityDTO memoryTaskEntityDTO = getMemoryTaskDERuntime(false).createEntity();
        for (java.util.Map.Entry<String, Object> entry : memoryTask.entrySet()) {
            IPSDEField iPSDEField = memoryTaskPSDEFieldMap.get(entry.getKey());
            if (iPSDEField != null) {
                if (entry.getValue() instanceof String) {
                    memoryTaskEntityDTO.set(iPSDEField.getLowerCaseName(), (String) entry.getValue());
                } else {
                    memoryTaskEntityDTO.set(iPSDEField.getLowerCaseName(), entry.getValue());
                }
            } else {
                memoryTaskEntityDTO.set(entry.getKey(), entry.getValue());
            }
        }
        return memoryTaskEntityDTO;
    }

    protected String getKBAgentConfigId(Object tag) {
        Map<String, Object> params = new HashMap();
        params.put("key", tag);
        params.put("system", this.getSystemRuntime().getDeploySystemId());
        if (this.getSystemRuntime() instanceof IServiceSystemRuntime) {
            IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) this.getSystemRuntime();
            if (StringUtils.hasLength(iServiceSystemRuntime.getMainSystemId())) {
                params.put("system", iServiceSystemRuntime.getMainSystemId());
            }
        }

        return ExpressionUtils.getValue(this.getKBAgentConfigIdFormat(), params).toLowerCase();
    }

    protected String getRealKBId(String tag) {
        // 1. 基础校验
        if (this.getKBAgentConfigIdFormat() == null || tag == null) {
            return tag; // 如果输入为空，直接返回输入（或者根据业务返回 null）
        }

        // 2. 检查模板是否包含占位符
        String placeholder = "{key}";
        if (!this.getKBAgentConfigIdFormat().contains(placeholder)) {
            // 如果模板里连 {key} 都没有，说明无法提取，直接返回原值
            return tag;
        }

        // 3. 构建正则
        int keyIndex = this.getKBAgentConfigIdFormat().indexOf(placeholder);
        String prefixFormat = this.getKBAgentConfigIdFormat().substring(0, keyIndex);
        Map<String, Object> params = new HashMap();
        params.put("system", this.getSystemRuntime().getDeploySystemId());
        if (this.getSystemRuntime() instanceof IServiceSystemRuntime) {
            IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) this.getSystemRuntime();
            if (StringUtils.hasLength(iServiceSystemRuntime.getMainSystemId())) {
                params.put("system", iServiceSystemRuntime.getMainSystemId());
            }
        }

        String prefix = ExpressionUtils.getValue(prefixFormat, params).toLowerCase();
        String suffix = this.getKBAgentConfigIdFormat().substring(keyIndex + placeholder.length());

        // 使用 Pattern.quote 转义特殊字符
        String regex = "^" + Pattern.quote(prefix) + "(.*)" + Pattern.quote(suffix) + "$";

        try {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(tag);

            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (PatternSyntaxException e) {
        }

        return tag;
    }

    public String getKBAgentConfigIdFormat() {
        return this.strKBAgentConfigIdFormat;
    }

    public String getLockKey(IEntityDTO memoryTask) {
        String kbTag = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG).getLowerCaseName());
        String mode = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE).getLowerCaseName());
        String userId = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_USER_ID).getLowerCaseName());
        String scope = (String) memoryTask.get(memoryTaskPSDEFieldMap.get(MEMORYTASK_PREDEFINEDFIELD_MEMORY_BUSINESS_SCOPE).getLowerCaseName());
        String type = memoryTask.getString(MEMORYTASK_PREDEFINEDFIELD_MEMORY_TYPE.toLowerCase(),"");

        String basePath = "";
        if (mode == null || "NONE".equals(mode)) {
            basePath = String.format("/%1$s/%2$s/%3$s/", kbTag, DEFAULT_GLOBAL_PATTERN, DEFAULT_GLOBAL_PATTERN);
        } else if ("BUSINESS_SCOPE".equals(mode)) {
            basePath = String.format("/%1$s/%2$s/%3$s/", kbTag, scope, DEFAULT_GLOBAL_PATTERN);
        } else if ("USER_SCOPE".equals(mode)) {
            basePath = String.format("/%1$s/%2$s/%3$s/", kbTag, DEFAULT_GLOBAL_PATTERN, userId);
        } else if ("BUSINESS_USER_SCOPE".equals(mode)) {
            basePath = String.format("/%1$s/%2$s/%3$s/", kbTag, scope, userId);
        } else {
            basePath = String.format("/%1$s/%2$s/%3$s/", kbTag, DEFAULT_GLOBAL_PATTERN, DEFAULT_GLOBAL_PATTERN);
        }

        switch (type) {
            case MEMORY_TYPE_RESIDENT:
                return String.format("%s/resident", basePath);

            case MEMORY_TYPE_DAILY:
                return String.format("%s/daily", basePath);

            default:
                return basePath;
        }
    }
}
