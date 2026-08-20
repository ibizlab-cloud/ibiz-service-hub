package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.ai.util.ChatCompletionRequestHolder;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.RecursiveCharacterTextSplitter;
import net.ibizsys.central.cloud.core.util.UserCancelException;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResultEx;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionUsage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageType;
import net.ibizsys.central.cloud.core.util.domain.ChatSkill;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.cloud.core.util.domain.KnowledgeBase;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.PSModelEnums.AIKBMode;
import net.ibizsys.model.PSModelEnums.AITrimmingStrategy;
import net.ibizsys.model.PSModelEnums.MsgTemplEngine;
import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.plugin.IModelRTScript;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class SysAIChatAgentRuntimeBase extends SysAIAgentRuntimeBase implements ISysAIChatAgentRuntime {

    private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAIChatAgentRuntimeBase.class);

    /**
     * 交谈补全参数：额外指定知识库
     */
    public final static String CHATCOMPLETIONREQUEST_RAWKNOWLEDGEBASES = "rawknowledgebases";

    private IPSSysAIChatAgent iPSSysAIChatAgent = null;
    private IDataEntityRuntime iDataEntityRuntime = null;
    private String strAccessKey = null;
    private IDataEntityRuntime sessionDataEntityRuntime = null;
    private IDataEntityRuntime messageDataEntityRuntime = null;
    private IDataEntityRuntime memoryTaskDataEntityRuntime = null;

    private Map<String, IPSDEField> sessionPSDEFieldMap = null;
    private Map<String, IPSDEField> messagePSDEFieldMap = null;
    private Map<String, IPSDEField> memoryTaskPSDEFieldMap = null;

    private String strUniqueTag = null;
    private String longTermMemoryPrompt = null;
    private String DailyMemoryPrompt = null;

    /**
     * AI代理脚本方法：获取实际结果
     */
    public final static String AIAGENTRTSCRIPTMETHOD_GETRESULT = "GET_RESULT";


    /**
     * AI代理脚本方法：获取实际数据
     */
    public final static String AIAGENTRTSCRIPTMETHOD_GETACTIVEDATA = "GET_ACTIVE_DATA";


    /**
     * AI代理脚本方法：异步交互补全
     */
    public final static String AIAGENTRTSCRIPTMETHOD_ASYNCCHATCOMPLETION = "ASYNC_CHAT_COMPLETION";


    /**
     * AI代理脚本方法：交互补全
     */
    public final static String AIAGENTRTSCRIPTMETHOD_CHATCOMPLETION = "CHAT_COMPLETION";


    private List<ISysAIChatAgentGroup> sysAIChatAgentGroupList = null;


    private File workspace = null;

    private RecursiveCharacterTextSplitter residentMemorySplitter = null;
    private RecursiveCharacterTextSplitter regularMemorySplitter = null;
    private RecursiveCharacterTextSplitter dailyMemorySplitter = null;

    @Override
    protected ISysAIChatAgentRuntimeContext createModelRuntimeContext() {
        return new SysAIChatAgentRuntimeContextBase<ISysAIChatAgentRuntime, ISysAIAgentRuntimeContext>(super.createModelRuntimeContext()) {

            @Override
            public int getHistoryCount() {
                return SysAIChatAgentRuntimeBase.this.getHistoryCount();
            }

        };
    }



    @Override
    public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, IPSSysAIChatAgent iPSSysAIChatAgent) throws Exception {
        this.iPSSysAIChatAgent = iPSSysAIChatAgent;
        super.init(iSysAIFactoryRuntimeContext);
    }

    @Override
    protected void onInit() throws Exception {

        if(this.getSysAIFactoryRuntimeContext().getResidentMemoryMaxTokens()>0) {
            this.residentMemorySplitter = new RecursiveCharacterTextSplitter(null, this.getSysAIFactoryRuntimeContext().getResidentMemoryMaxTokens(), 0);
        }
        if(this.getSysAIFactoryRuntimeContext().getRegularMemoryMaxTokens()>0) {
            this.regularMemorySplitter = new RecursiveCharacterTextSplitter(null, this.getSysAIFactoryRuntimeContext().getRegularMemoryMaxTokens(), 0);
        }
        if(this.getSysAIFactoryRuntimeContext().getDailyMemoryMaxTokens()>0) {
            this.dailyMemorySplitter = new RecursiveCharacterTextSplitter(null, this.getSysAIFactoryRuntimeContext().getDailyMemoryMaxTokens(), 0);
        }


        strUniqueTag = this.getPSModelObject().getCodeName();
        if(strUniqueTag.indexOf("@") == -1) {
        	 if(StringUtils.hasLength(this.getPSModelObject().getAgentScope()) ) {
                 strUniqueTag += "@";
                 strUniqueTag += this.getPSModelObject().getAgentScope();
             }
        }
       

        this.workspace = new File(new StringBuilder(this.getSysAIFactoryRuntimeContext().getWorkspace().getCanonicalPath())
                .append(File.separator)
                .append(this.getAgentType().toLowerCase())
                .append(File.separator)
                .append(strUniqueTag.toLowerCase()).toString());
        if(!this.workspace.exists()) {
            this.workspace.mkdirs();
        }

        if(this.getPSModelObject().getPSSysUniRes() != null) {
            this.strAccessKey = this.getPSModelObject().getPSSysUniRes().getResCode();
        }

        if(StringUtils.hasLength(this.getPSModelObject().getAIPlatformType())) {
            this.setAIPlatformType(this.getPSModelObject().getAIPlatformType());
        }

        if(this.getPSModelObject().getPSDataEntity() != null) {
            this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSModelObject().getPSDataEntityMust().getId(), false);
        }

        if(this.getSessionDataEntityRuntime(true) == null) {
            this.prepareSessionDataEntityRuntime();
        }

        if(this.getMessageDataEntityRuntime(true) == null) {
            this.prepareMessageDataEntityRuntime();
        }

        if(this.getMemoryTaskDataEntityRuntime(true) == null) {
            this.prepareMemoryTaskDataEntityRuntime();
        }

        if(StringUtils.hasLength(this.getPSModelObject().getAgentContextData())) {
        	this.setAgentData(JsonUtils.asMap(this.getPSModelObject().getAgentContextData()));
        }
        

        this.prepareAIChatAgentGroups();
        
        


        super.onInit();
    }

    @Override
    public IPSSysAIChatAgent getPSModelObject() {
        return this.iPSSysAIChatAgent;
    }

    @Override
    public File getWorkspace() {
        return this.workspace;
    }

    @Override
    public String getUniqueTag() {
        return this.strUniqueTag;
    }

    protected String getLongTermMemoryPrompt() {
        return longTermMemoryPrompt;
    }

    protected void setLongTermMemoryPrompt(String longTermMemoryPrompt) {
        this.longTermMemoryPrompt = longTermMemoryPrompt;
    }

    protected String getDailyMemoryPrompt() {
        return DailyMemoryPrompt;
    }

    protected void setDailyMemoryPrompt(String dailyMemoryPrompt) {
        DailyMemoryPrompt = dailyMemoryPrompt;
    }

    protected void prepareAIChatAgentGroups() throws Exception {
        String strAgentGroupTags = this.getPSModelObject().getAgentGroupTags();
        if(ObjectUtils.isEmpty(strAgentGroupTags)) {
            setAIChatAgentGroups(Collections.EMPTY_LIST);
        }
        else {
            List<ISysAIChatAgentGroup> list = new ArrayList<ISysAIChatAgentGroup>();
            Set<String> groupTags = new HashSet<String>(Arrays.asList(strAgentGroupTags.split("[,]")));
            for(String groupTag : groupTags) {
                ISysAIChatAgentGroup iSysAIChatAgentGroup = this.getSysAIFactoryRuntimeContext().getAIChatAgentGroup(groupTag);
                iSysAIChatAgentGroup.registerAIChatAgent(this);
                list.add(iSysAIChatAgentGroup);
            }
            this.setAIChatAgentGroups(Collections.unmodifiableList(list));
        }
    }

    protected List<ISysAIChatAgentGroup> getAIChatAgentGroups() {
        return this.sysAIChatAgentGroupList;
    }

    protected void setAIChatAgentGroups(List<ISysAIChatAgentGroup> sysAIChatAgentGroupList) {
        this.sysAIChatAgentGroupList = sysAIChatAgentGroupList;
    }


    @Override
    protected int getDefaultHistoryCount() {
        int nHistoryCount = DataTypeUtils.asInteger(this.getPSModelObject().getMemoryMaxTurns(), -1);
        if(nHistoryCount > 0) {
            return nHistoryCount;
        }
        return super.getDefaultHistoryCount();
    }

    @Override
    protected ISysAIChatAgentRuntimeContext getModelRuntimeContext() {
        return (ISysAIChatAgentRuntimeContext)super.getModelRuntimeContext();
    }

    @Override
    public IDataEntityRuntime getDataEntityRuntime() {
        return this.iDataEntityRuntime;
    }

    protected IDataEntityRuntime getSessionDataEntityRuntime(boolean bTryMode) throws Exception {
        if (this.sessionDataEntityRuntime != null || bTryMode) {
            return this.sessionDataEntityRuntime;
        }
        throw new Exception("会话实体运行时对象无效");
    }

    protected void setSessionDataEntityRuntime(IDataEntityRuntime sessionDataEntityRuntime) {
        this.sessionDataEntityRuntime = sessionDataEntityRuntime;
    }

    protected void prepareSessionDataEntityRuntime() throws Exception {
        if(this.getPSModelObject().getSessionPSDataEntity() != null) {
            IDataEntityRuntime sessionDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSModelObject().getSessionPSDataEntity().getId());
            this.setSessionDataEntityRuntime(sessionDataEntityRuntime);
            this.sessionPSDEFieldMap = new HashMap<String, IPSDEField>();
            this.fillSessionPSDEFieldMap(sessionDataEntityRuntime, sessionPSDEFieldMap);
        }
    }

    protected void fillSessionPSDEFieldMap(IDataEntityRuntime sessionDataEntityRuntime, Map<String, IPSDEField> sessionPSDEFieldMap) throws Exception {

        sessionPSDEFieldMap.put(SESSION_PREDEFINEDFIELD_AGENT_CONTEXT_ID, null);
        sessionPSDEFieldMap.put(SESSION_PREDEFINEDFIELD_SEQUENCE, null);
        sessionPSDEFieldMap.put(SESSION_PREDEFINEDFIELD_SESSION_ID, null);
        sessionPSDEFieldMap.put(SESSION_PREDEFINEDFIELD_USER_ID, null);
        sessionPSDEFieldMap.put(SESSION_PREDEFINEDFIELD_STATUS, null);
        sessionPSDEFieldMap.put(SESSION_PREDEFINEDFIELD_SCOPE, null);
        sessionPSDEFieldMap.put(SESSION_PREDEFINEDFIELD_TYPE, null);
        sessionPSDEFieldMap.put(SESSION_PREDEFINEDFIELD_TITLE, null);
        sessionPSDEFieldMap.put(SESSION_PREDEFINEDFIELD_LAST_ACTIVE_AT, null);
        sessionPSDEFieldMap.put(sessionDataEntityRuntime.getKeyPSDEField().getName(), null);
        sessionPSDEFieldMap.put(sessionDataEntityRuntime.getMajorPSDEField().getName(), null);

        java.util.List<IPSDEField> psDEFieldList = sessionDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
        if (!ObjectUtils.isEmpty(psDEFieldList)) {
            for (IPSDEField iPSDEField : psDEFieldList) {
                if (!StringUtils.hasLength(iPSDEField.getFieldTag())) {
                    continue;
                }
                String strTag = iPSDEField.getFieldTag().toUpperCase();
                if (!sessionPSDEFieldMap.containsKey(strTag)) {
                    continue;
                }

                if (sessionPSDEFieldMap.get(strTag) == null) {
                    sessionPSDEFieldMap.put(strTag, iPSDEField);
                }
            }

            for (IPSDEField iPSDEField : psDEFieldList) {
                String strTag = iPSDEField.getName().toUpperCase();
                if (!sessionPSDEFieldMap.containsKey(strTag)) {
                    continue;
                }

                if (sessionPSDEFieldMap.get(strTag) == null) {
                    sessionPSDEFieldMap.put(strTag, iPSDEField);
                }
            }
        }
    }


    protected IDataEntityRuntime getMessageDataEntityRuntime(boolean bTryMode) throws Exception {
        if (this.messageDataEntityRuntime != null || bTryMode) {
            return this.messageDataEntityRuntime;
        }
        throw new Exception("消息实体运行时对象无效");
    }

    protected void setMessageDataEntityRuntime(IDataEntityRuntime messageDataEntityRuntime) {
        this.messageDataEntityRuntime = messageDataEntityRuntime;
    }

    protected void prepareMessageDataEntityRuntime() throws Exception {
        if(this.getPSModelObject().getMessagePSDataEntity() != null) {
            IDataEntityRuntime messageDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSModelObject().getMessagePSDataEntity().getId());
            this.setMessageDataEntityRuntime(messageDataEntityRuntime);
            this.messagePSDEFieldMap = new HashMap<String, IPSDEField>();
            this.fillMessagePSDEFieldMap(messageDataEntityRuntime, messagePSDEFieldMap);
        }
    }

    protected void fillMessagePSDEFieldMap(IDataEntityRuntime messageDataEntityRuntime, Map<String, IPSDEField> messagePSDEFieldMap) throws Exception {

        messagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_CONTENT, null);
        messagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_CONTENT_TYPE, null);
        messagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_SENDER_TYPE, null);
        messagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_SEQUENCE, null);
        messagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_SESSION_ID, null);
        messagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_STATUS, null);
        messagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_INPUT_TOKENS, null);
        messagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_OUTPUT_TOKENS, null);
        messagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_TOTAL_TOKENS, null);
        messagePSDEFieldMap.put(MESSAGE_PREDEFINEDFIELD_TOOL_CALLS, null);
        
        messagePSDEFieldMap.put(messageDataEntityRuntime.getKeyPSDEField().getName(), null);

        java.util.List<IPSDEField> psDEFieldList = messageDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
        if (!ObjectUtils.isEmpty(psDEFieldList)) {
            for (IPSDEField iPSDEField : psDEFieldList) {
                if (!StringUtils.hasLength(iPSDEField.getFieldTag())) {
                    continue;
                }
                String strTag = iPSDEField.getFieldTag().toUpperCase();
                if (!messagePSDEFieldMap.containsKey(strTag)) {
                    continue;
                }

                if (messagePSDEFieldMap.get(strTag) == null) {
                    messagePSDEFieldMap.put(strTag, iPSDEField);
                }
            }

            for (IPSDEField iPSDEField : psDEFieldList) {
                String strTag = iPSDEField.getName().toUpperCase();
                if (!messagePSDEFieldMap.containsKey(strTag)) {
                    continue;
                }

                if (messagePSDEFieldMap.get(strTag) == null) {
                    messagePSDEFieldMap.put(strTag, iPSDEField);
                }
            }
        }
    }

    protected IDataEntityRuntime getMemoryTaskDataEntityRuntime(boolean bTryMode) throws Exception {
        if (this.memoryTaskDataEntityRuntime != null || bTryMode) {
            return this.memoryTaskDataEntityRuntime;
        }
        throw new Exception("记忆任务实体运行时对象无效");
    }

    protected void setMemoryTaskDataEntityRuntime(IDataEntityRuntime memoryTaskDataEntityRuntime) {
        this.memoryTaskDataEntityRuntime = memoryTaskDataEntityRuntime;
    }

    protected void prepareMemoryTaskDataEntityRuntime() throws Exception {
        if(this.getPSModelObject().getMemoryPSDataEntity() != null) {
            IDataEntityRuntime memoryTaskDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSModelObject().getMemoryPSDataEntity().getId());
            this.setMemoryTaskDataEntityRuntime(memoryTaskDataEntityRuntime);
            this.memoryTaskPSDEFieldMap = new HashMap<String, IPSDEField>();
            this.fillMemoryTaskPSDEFieldMap(memoryTaskDataEntityRuntime, memoryTaskPSDEFieldMap);
        }
    }

    protected void fillMemoryTaskPSDEFieldMap(IDataEntityRuntime memoryTaskDataEntityRuntime, Map<String, IPSDEField> memoryTaskPSDEFieldMap) throws Exception {

        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_STATUS, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_SESSION_ID, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_SCHEDULED_AT, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_TRIGGER_TYPE, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE, null);
        memoryTaskPSDEFieldMap.put(MEMORYTASK_PREDEFINEDFIELD_AI_AGENT_CONTEXT_ID, null);
        memoryTaskPSDEFieldMap.put(memoryTaskDataEntityRuntime.getKeyPSDEField().getName(), null);
        memoryTaskPSDEFieldMap.put(memoryTaskDataEntityRuntime.getMajorPSDEField().getName(), null);

        java.util.List<IPSDEField> psDEFieldList = memoryTaskDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
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

    @Override
    public String getAgentType() {
        return AIAGENT_CHAT;
    }

    @Override
    public String getAgentSubType() {
        return this.iPSSysAIChatAgent.getAgentType();
    }

    @Override
    public String getAgentMode() {
        return this.iPSSysAIChatAgent.getCodeName();
    }

    @Override
    public String getAccessKey() {
        return this.strAccessKey;
    }

    @Override
    public List<ChatMessage> getHistories(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
        return this.onGetHistories(dataOrKeys, body, params);
    }

    protected List<ChatMessage> onGetHistories(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
        Map<String, Object> exTemplParams = null;
        if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
            exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
        }
        if(exTemplParams == null) {
            exTemplParams = new HashMap<String, Object>();
        }
        return this.doGetHistories(getActiveData(dataOrKeys), body, params, exTemplParams);
    }

    protected List<ChatMessage> doGetHistories(List entityList, Object body, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
        // 格式化文本
        String strConfigId = this.getHistoriesConfigId();
        if(!ObjectUtils.isEmpty(strConfigId)) {
            Map<String, Object> templParams = new HashMap<String, Object>();
            if (exTemplParams != null) {
                templParams.putAll(exTemplParams);
            }

            templParams.put(TEMPLATE_PARAM_BODY, body);

            String strContent = this.getContent(entityList, strConfigId, templParams, true);
            if(StringUtils.hasLength(strContent)) {
                return new ChatMessagesBuilder().xml(strContent).build();
            }
        }

        List<ChatMessage> list = new ArrayList<ChatMessage>();
        if(StringUtils.hasLength(this.getPSModelObject().getWelcomeMessage())) {
            Map<String, Object> templParams = new HashMap<String, Object>();
            if (exTemplParams != null) {
                templParams.putAll(exTemplParams);
            }
            templParams.put(TEMPLATE_PARAM_BODY, body);

            String strWelcomeMessage = this.getRawContent(entityList, this.getPSModelObject().getWelcomeMessage(), templParams);
            if(StringUtils.hasLength(strWelcomeMessage)) {
                ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create().xml(strWelcomeMessage);
                list = chatMessagesBuilder.build(list);
                if(ObjectUtils.isEmpty(list)) {
                    chatMessagesBuilder.assistant(strWelcomeMessage);
                    list = chatMessagesBuilder.build(list);
                }
            }
        }

        return list;
    }


    @Override
    public List<ChatMessage> getSystemMessages(Object dataOrKeys, Map<String, Object> params) throws Throwable {
        return this.onGetSystemMessages(dataOrKeys, params);
    }

    protected List<ChatMessage> onGetSystemMessages(Object dataOrKeys, Map<String, Object> params) throws Throwable {
        Map<String, Object> exTemplParams = null;
        if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
            exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
        }
        if(exTemplParams == null) {
            exTemplParams = new HashMap<String, Object>();
        }
        return this.doGetSystemMessages(getActiveData(dataOrKeys), params, exTemplParams);
    }

    protected List<ChatMessage> doGetSystemMessages(List entityList, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
        // 格式化文本
        String strConfigId = this.getSystemMessagesConfigId();
        if(!ObjectUtils.isEmpty(strConfigId)) {
            Map<String, Object> templParams = new HashMap<String, Object>();
            if (exTemplParams != null) {
                templParams.putAll(exTemplParams);
            }

            String strContent = this.getContent(entityList, strConfigId, templParams, true);
            if(StringUtils.hasLength(strContent)) {
                int nPos = strConfigId.lastIndexOf(".xml.tpl");
                if(nPos == strConfigId.length() - 8) {
                    return new ChatMessagesBuilder().xml(strContent).build();
                }
                return new ChatMessagesBuilder().system(strContent).build();
            }
        }

        List<ChatMessage> list = new ArrayList<ChatMessage>();
        if(StringUtils.hasLength(this.getPSModelObject().getSystemPrompt())) {
            Map<String, Object> templParams = new HashMap<String, Object>();
            if (exTemplParams != null) {
                templParams.putAll(exTemplParams);
            }

            String strSystemPrompt = this.getRawContent(entityList, this.getPSModelObject().getSystemPrompt(), templParams);
            if(StringUtils.hasLength(strSystemPrompt)) {
                ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create().xml(strSystemPrompt);
                list = chatMessagesBuilder.build(list);
                if(ObjectUtils.isEmpty(list)) {
                    chatMessagesBuilder.system(strSystemPrompt);
                    list = chatMessagesBuilder.build(list);
                }
            }
        }

        return list;
    }

    public List<ChatMessage> getMemoryMessages(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        return this.onGetMemoryMessages(dataOrKeys, chatCompletionRequest ,params);
    }

    protected List<ChatMessage> onGetMemoryMessages(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        Map<String, Object> exTemplParams = null;
        if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
            exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
        }
        if(exTemplParams == null) {
            exTemplParams = new HashMap<String, Object>();
        }
        return this.doGetMemoryMessages(getActiveData(dataOrKeys), chatCompletionRequest,params, exTemplParams);
    }

    protected List<ChatMessage> doGetMemoryMessages(List entityList, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
        List<ChatMessage> list = new ArrayList<ChatMessage>();
        IAIChatMemoryUtil iAIChatMemoryUtil = this.getSysAIFactoryRuntimeContext().getAIChatMemoryUtil(true);
        if(iAIChatMemoryUtil == null || ObjectUtils.isEmpty(this.getPSModelObject().getMemoryKBTag())) {
            return list;
        }

        // 格式化文本
        Map<String, Object> templParams = new HashMap<String, Object>();
        if (exTemplParams != null) {
            templParams.putAll(exTemplParams);
        }
        StringBuilder sb = new StringBuilder();

        int maxMemoryCount = 20;
        float memoryThreshold =  new Float(0.4);
        int memoryRerank = 0;
        ChunkSearchContext chunkSearchContext = new ChunkSearchContext();
        //保留外部检索内容传入
        chunkSearchContext.setQueries(chatCompletionRequest.getChunkQueries());
        chunkSearchContext.set(IChunkSearchContext.PARAM_HISTORIES, chatCompletionRequest.getMessages());

        chunkSearchContext.setSimilarityThreshold(memoryThreshold);
        chunkSearchContext.setTextReRank(memoryRerank);
        chunkSearchContext.setPageIndex(0);
        chunkSearchContext.setPageable(0, maxMemoryCount, 0);

        if(PSModelEnums.AIMemoryMode.LONG_TERM.value.equals(this.getPSModelObject().getMemoryMode()) || PSModelEnums.AIMemoryMode.HYBRID.value.equals(this.getPSModelObject().getMemoryMode()) ){

            String businessScope = (String) chatCompletionRequest.get("srfscope");
            Map<String, Object> taskMap = new HashMap<String, Object>();
            if(StringUtils.hasLength(this.getPSModelObject().getMemoryKBTag())) {
                taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG, this.getPSModelObject().getMemoryKBTag());
            }
            if(StringUtils.hasLength(this.getPSModelObject().getMemoryDocTag())) {
                taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG, this.getPSModelObject().getMemoryDocTag());
            }

            taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE, this.getPSModelObject().getMemoryIsolationMode());
            if(StringUtils.hasLength(businessScope)) {
                taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_BUSINESS_SCOPE, businessScope);
            }

            taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_AI_AGENT_CONTEXT_ID, this.getPSModelObject().getAgentContextId());
            List<Chunk> chunks = iAIChatMemoryUtil.retrieveMemory(taskMap,chunkSearchContext);
            //回写检检索问题缓存
            if(ObjectUtils.isEmpty(chatCompletionRequest.getChunkQueries())){
                chatCompletionRequest.setChunkQueries(chunkSearchContext.getQueries());
            }

            String strLongTermMemoryPrompt = this.getRawContent(Collections.EMPTY_LIST, this.getLongTermMemoryPrompt(), templParams);
            String strDailyMemoryPrompt = this.getRawContent(Collections.EMPTY_LIST, this.getDailyMemoryPrompt(), templParams);
            StringBuilder regularsb = new StringBuilder();
            StringBuilder residentsb = new StringBuilder();
            StringBuilder dailysb = new StringBuilder();
            for(Chunk chunk : chunks) {
                if(ChunkType.REGULARMEMORY.getValue().equals(chunk.getType())){
                    regularsb.append(chunk.getContent());
                    regularsb.append("\r\n");
                    continue;
                }
                if(ChunkType.RESIDENTMEMORY.getValue().equals(chunk.getType())){
                    residentsb.append(chunk.getContent());
                    residentsb.append("\r\n");
                    continue;
                }
                if(ChunkType.DAILYMEMORY.getValue().equals(chunk.getType())){
                    dailysb.append(chunk.getContent());
                    dailysb.append("\r\n");
                }
            }

            String strResidentMemory = residentsb.toString();
            String strRegularMemory = regularsb.toString();
            String strDailyMemory = dailysb.toString();

            if((this.residentMemorySplitter != null && StringUtils.hasLength(strResidentMemory)) || (this.regularMemorySplitter !=null  && StringUtils.hasLength(strRegularMemory))) {
                sb.append(strLongTermMemoryPrompt);
                sb.append("\n");
                if(this.residentMemorySplitter != null && StringUtils.hasLength(strResidentMemory)) {
                    List<String> parts = this.residentMemorySplitter.splitText(strResidentMemory);
                    sb.append(parts.get(0));
                    sb.append("\n");
                }
                if(this.regularMemorySplitter !=null  && StringUtils.hasLength(strRegularMemory)) {
                    List<String> parts = this.regularMemorySplitter.splitText(strRegularMemory);
                    sb.append(parts.get(0));
                    sb.append("\n");
                }
            }
            if(this.dailyMemorySplitter != null && StringUtils.hasLength(strDailyMemory)) {
                sb.append(strDailyMemoryPrompt);
                sb.append("\n");
                List<String> parts = this.dailyMemorySplitter.splitText(strDailyMemory);
                sb.append(parts.get(0));
                sb.append("\n");
            }

            if(sb.length() > 0) {
                ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create().xml(sb.toString());
                list = chatMessagesBuilder.build(list);
                if (ObjectUtils.isEmpty(list)) {
                    if(ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
                        chatMessagesBuilder.system(sb.toString());
                        list = chatMessagesBuilder.build(list);
                    }
                    else {
                        //判断首消息内容
                        String strRole = chatCompletionRequest.getMessages().get(0).getRole();
                        if(ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(strRole) && chatCompletionRequest.getMessages().size()>1) {
                            strRole = chatCompletionRequest.getMessages().get(1).getRole();
                        }
                        if(ChatMessageRole.ASSISTANT.getValue().equalsIgnoreCase(strRole)) {
                            list = chatMessagesBuilder.user(sb.toString()).build(list);
                        }
                        else {
                            list = chatMessagesBuilder.assistant(sb.toString()).build(list);
                        }
                    }
                }
            }
        }
        return list;
    }


    @Override
    public List<ChatMessage> getSuggestionMessages(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        return this.onGetSuggestionMessages(dataOrKeys, chatCompletionRequest, params);
    }

    protected List<ChatMessage> onGetSuggestionMessages(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        Map<String, Object> exTemplParams = null;
        if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
            exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
        }
        if(exTemplParams == null) {
            exTemplParams = new HashMap<String, Object>();
        }
        return this.doGetSuggestionMessages(getActiveData(dataOrKeys), chatCompletionRequest, params, exTemplParams);
    }

    protected List<ChatMessage> doGetSuggestionMessages(List entityList, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
        // 格式化文本
        String strConfigId = this.getSuggestionMessagesConfigId();
        if(!ObjectUtils.isEmpty(strConfigId)) {
            Map<String, Object> templParams = new HashMap<String, Object>();
            if (exTemplParams != null) {
                templParams.putAll(exTemplParams);
            }

//			templParams.put(TEMPLPARAM_APPDEACMODE, this.getAddinData());
//			templParams.put(TEMPLPARAM_APPDE, this.getPSAppDataEntity());

            String strContent = this.getContent(entityList, strConfigId, templParams, true);
            if(StringUtils.hasLength(strContent)) {
                int nPos = strConfigId.lastIndexOf(".xml.tpl");
                if(nPos == strConfigId.length() - 8) {
                    return new ChatMessagesBuilder().xml(strContent).build();
                }
                return new ChatMessagesBuilder().user(strContent).build();
            }
        }

        List<ChatMessage> list = new ArrayList<ChatMessage>();
        if(StringUtils.hasLength(this.getPSModelObject().getSuggestionPrompt())) {
            Map<String, Object> templParams = new HashMap<String, Object>();
            if (exTemplParams != null) {
                templParams.putAll(exTemplParams);
            }

            String strContent = this.getRawContent(entityList, this.getPSModelObject().getSuggestionPrompt(), templParams);
            if(StringUtils.hasLength(strContent)) {
                return new ChatMessagesBuilder().xml(strContent).build();
            }
        }

        return list;
    }

    @Override
    public ChatMessage getDigestMessage(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        return this.onGetDigestMessage(dataOrKeys, chatCompletionRequest, params);
    }

    protected ChatMessage onGetDigestMessage(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        Map<String, Object> exTemplParams = null;
        if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
            exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
        }
        if(exTemplParams == null) {
            exTemplParams = new HashMap<String, Object>();
        }
        return this.doGetDigestMessage(getActiveData(dataOrKeys), chatCompletionRequest, params, exTemplParams);
    }

    protected ChatMessage doGetDigestMessage(List entityList, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
        // 格式化文本
        String strConfigId = this.getDigestMessageConfigId();
        if(!ObjectUtils.isEmpty(strConfigId)) {
            Map<String, Object> templParams = new HashMap<String, Object>();
            if (exTemplParams != null) {
                templParams.putAll(exTemplParams);
            }

            String strContent = this.getContent(entityList, strConfigId, templParams, true);
            if(StringUtils.hasLength(strContent)) {
                ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create();
                List<ChatMessage> list = chatMessagesBuilder.xml(strContent).build();
                if(ObjectUtils.isEmpty(list)) {
                    return chatMessagesBuilder.user(strContent).build().get(0);
                }
                return list.get(list.size() - 1);
            }
        }

        if(StringUtils.hasLength(this.getPSModelObject().getDigestPrompt())) {
            Map<String, Object> templParams = new HashMap<String, Object>();
            if (exTemplParams != null) {
                templParams.putAll(exTemplParams);
            }

            String strContent = this.getRawContent(entityList, this.getPSModelObject().getDigestPrompt(), templParams);
            if(StringUtils.hasLength(strContent)) {
                ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create();
                List<ChatMessage> list = chatMessagesBuilder.xml(strContent).build();
                if(ObjectUtils.isEmpty(list)) {
                    return chatMessagesBuilder.user(strContent).build().get(0);
                }
                return list.get(list.size() - 1);
            }
        }
        return null;
    }

    @Override
    public Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
        return this.onFetchChunks(iChunkSearchContext);
    }

    protected Page<Chunk> onFetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
        String strActiveKBAgentConfigId = getActiveKBAgentConfigId(iChunkSearchContext);
        return this.getSystemRuntime().getSysKBUtilRuntime(false).fetchChunks(strActiveKBAgentConfigId, iChunkSearchContext);
    }

    @Override
    public Page<Chunk> fetchChunksByHistories(IChunkSearchContext iChunkSearchContext) throws Throwable {
        return this.onFetchChunksByHistories(iChunkSearchContext);
    }

    protected Page<Chunk> onFetchChunksByHistories(IChunkSearchContext iChunkSearchContext) throws Throwable {
        String strActiveKBAgentConfigId = getActiveKBAgentConfigId(iChunkSearchContext);
        return this.getSystemRuntime().getSysKBUtilRuntime(false).fetchChunksByHistories(strActiveKBAgentConfigId, iChunkSearchContext);
    }


    @Override
    public List<Document> listDocumentsByChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
        return this.onListDocumentsByChunks(iChunkSearchContext);
    }

    protected List<Document> onListDocumentsByChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
        Page<Chunk> page = null;
        if(!ObjectUtils.isEmpty(iChunkSearchContext.get(IChunkSearchContext.PARAM_HISTORIES))) {
            page = this.fetchChunksByHistories(iChunkSearchContext);
        }
        else {
            page = this.fetchChunks(iChunkSearchContext);
        }

        if(page == null || ObjectUtils.isEmpty(page.getContent())) {
            return Collections.EMPTY_LIST;
        }

        String strActiveKBAgentConfigId = getActiveKBAgentConfigId(iChunkSearchContext);

        Map<String, Document> documentMap = new LinkedHashMap<String, Document>();
        for(Chunk chunk : page.getContent()) {
            String strDocumentId = chunk.getDocId();
            if(ObjectUtils.isEmpty(strDocumentId)) {
                continue;
            }

            if(documentMap.containsKey(strDocumentId)) {
                continue;
            }

            try {
                Document document = this.getSystemRuntime().getSysKBUtilRuntime(false).getDocument(strActiveKBAgentConfigId, strDocumentId);
                documentMap.put(strDocumentId, document);
            }
            catch (Throwable ex) {
                throw new Exception(String.format("获取文档[%1$s]发生异常，%2$s", strDocumentId, ex.getMessage()), ex);
            }
        }

        return new ArrayList<Document>(documentMap.values());
    }

    protected String getActiveKBAgentConfigId(IChunkSearchContext iChunkSearchContext) throws Throwable {
        Object kbid = iChunkSearchContext!=null? iChunkSearchContext.get("n_kbid_eq"): null;
        if(!ObjectUtils.isEmpty(kbid)) {
            if(String.valueOf(kbid).indexOf(this.getKBAgentConfigId("")) == 0) {
                return String.valueOf(kbid);
            }
            return this.getKBAgentConfigId(kbid);
        }
        else {
            String strKBTags = this.getPSModelObject().getKnowledgeBaseTags();
            if(ObjectUtils.isEmpty(strKBTags)) {
                throw new Exception("未绑定知识库");
            }
            return strKBTags.split("[,]")[0];
        }
    }
    
    protected String getRealKBAgentConfigId(Object kbid) throws Throwable {
    	 if(String.valueOf(kbid).indexOf(this.getKBAgentConfigId("")) == 0) {
             return String.valueOf(kbid);
         }
         return this.getKBAgentConfigId(kbid);
    }


    @Override
    public List<ChatTool> getTools(Object dataOrKeys, Map<String, Object> params) throws Throwable {
        return this.onGetTools(dataOrKeys, params);
    }

    protected List<ChatTool> onGetTools(Object dataOrKeys, Map<String, Object> params) throws Throwable {
        Map<String, Object> exTemplParams = null;
        if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
            exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
        }
        if(exTemplParams == null) {
            exTemplParams = new HashMap<String, Object>();
        }
        return this.doGetTools(getActiveData(dataOrKeys), params, exTemplParams);
    }

    protected List<ChatTool> doGetTools(List entityList, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
        // 格式化文本
        String strConfigId = this.getToolsConfigId();
        if(ObjectUtils.isEmpty(strConfigId)) {
            return new ArrayList<ChatTool>();
        }

        Map<String, Object> templParams = new HashMap<String, Object>();
        if (exTemplParams != null) {
            templParams.putAll(exTemplParams);
        }

//		templParams.put(TEMPLPARAM_APPDEACMODE, this.getAddinData());
//		templParams.put(TEMPLPARAM_APPDE, this.getPSAppDataEntity());

        String strContent = this.getContent(entityList, strConfigId, templParams, true);
        if(!StringUtils.hasLength(strContent)) {
            return new ArrayList<ChatTool>();
        }

        return JsonUtils.as(strContent, ChatToolListType);
    }



    @Override
    public ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        return this.chatCompletion(dataOrKeys, chatCompletionRequest, params, true, false);
    }

    @Override
    public PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        return this.asyncChatCompletion(dataOrKeys, chatCompletionRequest, params, true, false);
    }

    @Override
    public SseEmitter sseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        return this.sseChatCompletion(dataOrKeys, chatCompletionRequest, params, true, false);
    }

    @Override
    public ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
        try {
            ChatCompletionRequestHolder.push(chatCompletionRequest);
            return this.onChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("同步聊天交互发生异常，%1$s", ex.getMessage()), ex);
        }
        finally {
            ChatCompletionRequestHolder.poll();
        }
    }

    protected ChatCompletionResult onChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {

        this.trimChatMessages(chatCompletionRequest);
        this.fillChatCompletionRequest(chatCompletionRequest, dataOrKeys, params, bAppendSystemMessage, bAppendHistories);

        return this.doChatCompletion(getAIPlatformType(), chatCompletionRequest);
    }

    protected void fillChatCompletionRequest(ChatCompletionRequest chatCompletionRequest, Object dataOrKeys, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
        this.fillChatCompletionRequest(chatCompletionRequest, dataOrKeys, params, bAppendSystemMessage, bAppendHistories, true);
    }

    protected void fillChatCompletionRequest(ChatCompletionRequest chatCompletionRequest, Object dataOrKeys, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories, boolean bFillKnowledgeBases) throws Throwable {
        this.fillChatCompletionRequest(chatCompletionRequest, dataOrKeys, params, bAppendSystemMessage, bAppendHistories, bFillKnowledgeBases, true);
    }

    protected void fillChatCompletionRequest(ChatCompletionRequest chatCompletionRequest, Object dataOrKeys, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories, boolean bFillKnowledgeBases, boolean bAppendMemory) throws Throwable {

        //知识库最早填充，方便其它地方使用
        if(bFillKnowledgeBases) {
            this.fillChatCompletionKnowledgeBases(chatCompletionRequest);
        }

        if(bAppendHistories) {
            List<ChatMessage> historyList = this.getHistories(dataOrKeys, chatCompletionRequest, params);
            if(!ObjectUtils.isEmpty(historyList)) {
                if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
                    historyList.addAll(chatCompletionRequest.getMessages());
                    chatCompletionRequest.setMessages(historyList);
                }
                else {
                    chatCompletionRequest.setMessages(historyList);
                }
            }
        }

        //附加记忆
        if(bAppendMemory && !(this.getPSModelObject().getMemoryMode() == null || this.getPSModelObject().getMemoryMode() == PSModelEnums.AIMemoryMode.NONE.value)){
            List<ChatMessage> memoryMessageList = this.getMemoryMessages(dataOrKeys, chatCompletionRequest, params);
            if(!ObjectUtils.isEmpty(memoryMessageList)) {
                if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
                    memoryMessageList.addAll(chatCompletionRequest.getMessages());
                    chatCompletionRequest.setMessages(memoryMessageList);
                }
                else {
                    chatCompletionRequest.setMessages(memoryMessageList);
                }
            }
        }

        //系统消息最后加，确保请求再第一个
        if(bAppendSystemMessage) {
            List<ChatMessage> systemMessageList = this.getSystemMessages(dataOrKeys, params);
            if(!ObjectUtils.isEmpty(systemMessageList)) {
                if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
                    systemMessageList.addAll(chatCompletionRequest.getMessages());
                    chatCompletionRequest.setMessages(systemMessageList);
                }
                else {
                    chatCompletionRequest.setMessages(systemMessageList);
                }
            }
        }

        if(DataTypeUtils.asBoolean(this.getPSModelObject().getEnableTools(), true)) {
            List<ChatTool> toolList = this.getTools(dataOrKeys, params);
            if(!ObjectUtils.isEmpty(toolList)) {
                if(!ObjectUtils.isEmpty(chatCompletionRequest.getTools())) {
                    toolList.addAll(chatCompletionRequest.getTools());
                    chatCompletionRequest.setTools(toolList);
                }
                else {
                    chatCompletionRequest.setTools(toolList);
                }
            }
        }

        chatCompletionRequest.setAgentName(this.getPSModelObject().getName());
        chatCompletionRequest.setAgentTag(this.getPSModelObject().getCodeName());

        if(!chatCompletionRequest.containsOSSImageVLPrompt()) {
            chatCompletionRequest.setOSSImageVLPrompt(this.getPSModelObject().getOSSImageVLPrompt());
        }

        if(this.getPSModelObject().getStream() != null) {
            chatCompletionRequest.setStreaming(this.getPSModelObject().getStream()?1:0);
        }

        if(this.getPSModelObject().getEnableThinking() != null) {
            chatCompletionRequest.setThinking(this.getPSModelObject().getEnableThinking()?1:0);
        }

        if(this.getPSModelObject().getTemperature() != null) {
            chatCompletionRequest.setTemperature(this.getPSModelObject().getTemperature().floatValue());
        }

        if(this.getPSModelObject().getTopP() != null) {
            chatCompletionRequest.setTopP(this.getPSModelObject().getTopP().floatValue());
        }

        if(this.getPSModelObject().getEnableSearching() != null) {
            chatCompletionRequest.setSearching(this.getPSModelObject().getEnableSearching()?1:0);
        }



    }


    @Override
    public ChatCompletionResult chatSuggestion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        try {
            ChatCompletionRequestHolder.push(chatCompletionRequest);
            return this.onChatSuggestion(dataOrKeys, chatCompletionRequest, params);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("聊天建议发生异常，%1$s", ex.getMessage()), ex);
        }
        finally {
            ChatCompletionRequestHolder.poll();
        }
    }

    protected ChatCompletionResult onChatSuggestion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
        List<ChatMessage> suggestionMessageList = this.getSuggestionMessages(dataOrKeys, chatCompletionRequest, params);
        if(ObjectUtils.isEmpty(suggestionMessageList)) {
            chatCompletionResult.setChoices(suggestionMessageList);
            return chatCompletionResult;
        }

//		List<ChatMessage> realList = new ArrayList<ChatMessage>();
        List<ChatMessage> toolList = new ArrayList<ChatMessage>();
        for(ChatMessage chatMessage : suggestionMessageList) {
            ChatMessageRole role = ChatMessageRole.valueOf(chatMessage.getRole());
            switch (role) {
//			case ASSISTANT:
//			case SYSTEM:
//			case USER:
//				realList.add(chatMessage);
//				break;
                case TOOL:
                    toolList.add(chatMessage);
                    break;
                default:
                    break;
            }
        }

        chatCompletionResult.setChoices(toolList);
//		if(!ObjectUtils.isEmpty(realList)) {
//			chatCompletionRequest.setMessages(suggestionMessageList);
//			ChatCompletionResult chatCompletionResult2 = this.getSysAIUtilRuntime().chatCompletion(getAIPlatformType(), chatCompletionRequest);
//			//需要分解
//		}
//
        return chatCompletionResult;
    }

    @Override
    public ChatCompletionResult chatDigest(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
        try {
            if(ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
                throw new Exception("传入聊天记录无效");
            }

            if(ObjectUtils.isEmpty(chatCompletionRequest.getMode())) {
                chatCompletionRequest.setMode(CHATDIGESTMODE_CONTENT);
            }

            if(DataTypeUtils.asInteger(chatCompletionRequest.getMaxTokens(), 0) <= 0) {
                if(CHATDIGESTMODE_TITLE.equals(chatCompletionRequest.getMode())) {
                    chatCompletionRequest.setMaxTokens(20);
                }
                else
                if(CHATDIGESTMODE_CONTENT.equals(chatCompletionRequest.getMode())) {
                    chatCompletionRequest.setMaxTokens(2048);
                }
            }
            //关闭思考模式
            if(chatCompletionRequest.getThinking() == null) {
                chatCompletionRequest.setThinking(0);
            }


            ChatCompletionRequestHolder.push(chatCompletionRequest);
            return this.onChatDigest(dataOrKeys, chatCompletionRequest, params);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("聊天摘要发生异常，%1$s", ex.getMessage()), ex);
        }
        finally {
            ChatCompletionRequestHolder.poll();
        }
    }

    protected ChatCompletionResult onChatDigest(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {

        //判断最后消息是否为用户
        ChatMessage chatMessage = chatCompletionRequest.getMessages().get(chatCompletionRequest.getMessages().size() - 1);
        if(ChatMessageRole.ASSISTANT.getValue().equals(chatMessage.getRole())) {
            ChatMessage userChatMessage = this.getDigestMessage(dataOrKeys, chatCompletionRequest, params);
            
         // ----- 插入 SYSTEM 提示词 -----
            boolean hasSystem = chatCompletionRequest.getMessages().stream()
                    .anyMatch(m -> ChatMessageRole.SYSTEM.getValue().equals(m.getRole()));
            if (!hasSystem) {
                String systemPrompt = "你是一个专业的文本摘要助手，擅长根据用户指令对对话内容进行精准摘要。请严格遵循用户要求，只输出摘要结果，不包含任何解释、介绍、序号或多个答案。";
                chatCompletionRequest.getMessages().add(0, 
                    ChatMessage.create(ChatMessageRole.SYSTEM, systemPrompt));
            }
            
            if(userChatMessage == null) {
                if(CHATDIGESTMODE_TITLE.equals(chatCompletionRequest.getMode())) {
                    userChatMessage = ChatMessage.create(ChatMessageRole.USER, String.format("请对以上的交互内容总结出合适的标题，不要包含任何介绍、解释、序号或多个答案。长度不大于`%1$s`", chatCompletionRequest.getMaxTokens()));
                }
                else
                if(CHATDIGESTMODE_CONTENT.equals(chatCompletionRequest.getMode())) {
                    userChatMessage = ChatMessage.create(ChatMessageRole.USER, String.format("请对前面的内容进行摘要总结，长度不大于`%1$s`", chatCompletionRequest.getMaxTokens()));
                }
                else
                    throw new Exception(String.format("无法识别的聊天摘要模式[%1$s]", chatCompletionRequest.getMode()));
                //chatCompletionRequest.resetMaxTokens();
            }

            if(ChatMessageRole.ASSISTANT.getValue().equals(userChatMessage.getRole())) {
                ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
                chatCompletionResult.setChoices(Arrays.asList(userChatMessage));
                return chatCompletionResult;
            }
            chatCompletionRequest.getMessages().add(userChatMessage);
        }

        //移除MaxTokens
        chatCompletionRequest.resetMaxTokens();
        
        return this.doChatCompletion(this.getAIPlatformType(), chatCompletionRequest);
    }


    @Override
    public PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
        try {
            ChatCompletionRequestHolder.push(chatCompletionRequest);
            return this.onAsyncChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("异步聊天交互发生异常，%1$s", ex.getMessage()), ex);
        }
        finally {
            ChatCompletionRequestHolder.poll();
        }
    }

    protected PortalAsyncAction onAsyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {

        this.trimChatMessages(chatCompletionRequest);

        this.fillChatCompletionRequest(chatCompletionRequest, dataOrKeys, params, bAppendSystemMessage, bAppendHistories);

        return this.doAsyncChatCompletion(getAIPlatformType(), chatCompletionRequest);
    }

    @Override
    public SseEmitter sseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
        try {
            ChatCompletionRequestHolder.push(chatCompletionRequest);
            return this.onSseChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("SSE聊天交互发生异常，%1$s", ex.getMessage()), ex);
        }
        finally {
            ChatCompletionRequestHolder.poll();
        }
    }

    protected SseEmitter onSseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {

        PortalAsyncAction portalAsyncAction = this.asyncChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);

        IEntityDTO sessionEntityDTO = (IEntityDTO) this.beginChatSession(chatCompletionRequest);
        if(sessionEntityDTO != null) {
            if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
                this.createChatMessage(sessionEntityDTO, chatCompletionRequest.getMessages().get(chatCompletionRequest.getMessages().size() - 1));
            }
        }

        long nTimeout = 3000000;

        return (SseEmitter) this.getSystemRuntime().sseExecute(new IAction() {
            @Override
            public Object execute(Object[] args) throws Throwable {

                long nCurrentTime = System.currentTimeMillis();
                ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
                while (true) {
                	boolean bDisabled = EmployeeContext.isCurrentDisabled();
                	PortalAsyncAction last = null;
    				try {
    					EmployeeContext.setCurrentDisabled(true);
    					last = getSysPortalUtilRuntime().getAsyncAction(portalAsyncAction.getAsyncAcitonId());
    				}
    				finally {
    					EmployeeContext.setCurrentDisabled(bDisabled);
    				}

                    double fCompletionRate = 0.0f;
                    if (last.getCompletionRate() != null) {
                        fCompletionRate = last.getCompletionRate().doubleValue();
                    }

                    if(DataTypeUtils.compare(actionSession.getActionStep(), last.getStepInfo(), false) != 0) {
                        nCurrentTime = System.currentTimeMillis();
                    }

                    actionSession.updateActionStep(last.getStepInfo(), fCompletionRate, last.getActionResult());

                    int nActionState = DataTypeUtils.getIntegerValue(last.getActionState(), PortalAsyncActionState.EXECUTING.getValue());
                    if (nActionState == PortalAsyncActionState.FINISHED.getValue()) {
                        ChatCompletionResult chatCompletionResult = JsonUtils.as(last.getActionResult(), ChatCompletionResult.class);
                        ChatMessage chatMessage = new ChatMessage();
                        chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
                        chatMessage.setContent(AIChatUtils.removeThinkingContent(chatCompletionResult.getChoices().get(0).getContent()));
                        Object ret = createChatMessage(sessionEntityDTO, chatMessage, false, false, chatCompletionResult);
                        if(ret instanceof IEntityDTO) {
                            IEntityDTO iEntityDTO = (IEntityDTO)ret;
                            if(iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime() != null) {
                                Object messageId =  iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
                                if(messageId != null) {
                                    chatCompletionResult.getChoices().get(0).setMessageId(String.valueOf(messageId));
                                    return JsonUtils.toString(chatCompletionResult);
                                }
                            }
                        }

                        return last.getActionResult();
                    }
                    if (nActionState == PortalAsyncActionState.CANCELED.getValue()) {
                        ChatMessage chatMessage = new ChatMessage();
                        chatMessage.setContent(AIChatUtils.removeThinkingContent(last.getActionResult()));
                        chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
                        createCancelChatMessage(sessionEntityDTO, chatMessage);
                        throw new UserCancelException(last.getActionResult());
                    }
                    if (nActionState == PortalAsyncActionState.FAILED.getValue()) {
                        ChatMessage chatMessage = new ChatMessage();
                        chatMessage.setContent(AIChatUtils.removeThinkingContent(last.getActionResult()));
                        chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
                        createChatMessage(sessionEntityDTO, chatMessage, false, true);
                        throw new Exception(last.getActionResult());

                    }

                    if (System.currentTimeMillis() - nCurrentTime >= nTimeout) {
                        throw new Exception("反馈超时");
                    }

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        log.error(ex);
                    }
                }
            }
        }, null, null, 0l);
    }

    @Override
    public void cancelChatCompletion(Object dataOrKeys, String asyncActionId, Object body) throws Throwable {
        try {
            this.onCancelChatCompletion(dataOrKeys, asyncActionId, body);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("取消聊天交互发生异常，%1$s", ex.getMessage()), ex);
        }
        finally {
        }
    }

    protected void onCancelChatCompletion(Object dataOrKeys, String asyncActionId, Object body) throws Throwable {
        this.doCancelChatCompletion(this.getAIPlatformType(), asyncActionId);
    }


    protected IEntityDTO getChatSession(ChatCompletionRequest chatCompletionRequest) throws Throwable{
        //判断是否有会话
        if(ObjectUtils.isEmpty(chatCompletionRequest.getSessionId())) {
            return null;
        }

        if(ObjectUtils.isEmpty(this.getPSModelObject().getAgentContextId())) {
            return null;
        }

        IDataEntityRuntime sessionDataEntityRuntime = this.getSessionDataEntityRuntime(true);
        if(sessionDataEntityRuntime == null) {
            return null;
        }

        Object key = KeyValueUtils.genUniqueId(this.getPSModelObject().getAgentContextId(), chatCompletionRequest.getSessionId());
        //判断是否存在
        IEntityDTO sessionEntityDTO = this.getSessionDataEntityRuntime(false).get(key, true);
        if(sessionEntityDTO != null) {
            //适配重置会话后历史消息构建
            IDataEntityRuntime messageDataEntityRuntime = this.getMessageDataEntityRuntime(true);
            ISearchContextDTO searchContextDTO = messageDataEntityRuntime.createSearchContext();
            IPSDEField sessionIdPSDEField = messageDataEntityRuntime.getPSDEFieldByTag(MESSAGE_PREDEFINEDFIELD_SESSION_ID, true);
            if(sessionIdPSDEField != null) {
                searchContextDTO.eq(sessionIdPSDEField.getLowerCaseName(), key);
            }
            else {
                searchContextDTO.eq(MESSAGE_PREDEFINEDFIELD_SESSION_ID, key);
            }

            IEntityDTO iEntityDTO = messageDataEntityRuntime.selectOne(searchContextDTO,true);
            if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())&& iEntityDTO == null) {
                for(int i = 0;i<chatCompletionRequest.getMessages().size() - 1; i++) {
                    ChatMessage chatMessage = chatCompletionRequest.getMessages().get(i);
                    if(ChatMessageRole.SYSTEM.getValue().equals(chatMessage.getRole())) {
                        continue;
                    }
                    
                    if(StringUtils.hasLength(chatMessage.getType()) && ChatMessageType.SYSTEM.getValue().equals(chatMessage.getType())) {
                        continue;
                    }
                    
                    this.createChatMessage(sessionEntityDTO, chatMessage);
                }
            }
            return sessionEntityDTO;
        }
        long nSeq = System.currentTimeMillis();
        Map<String, Object> values = new HashMap<String, Object>();
        values.put(SESSION_PREDEFINEDFIELD_AGENT_CONTEXT_ID, this.getPSModelObject().getAgentContextId());
        values.put(SESSION_PREDEFINEDFIELD_SESSION_ID, chatCompletionRequest.getSessionId());
        values.put(SESSION_PREDEFINEDFIELD_SEQUENCE, nSeq);
        values.put(SESSION_PREDEFINEDFIELD_SCOPE, chatCompletionRequest.get("srfscope"));
        values.put(this.getSessionDataEntityRuntime(false).getKeyPSDEField().getName(), key);
        if(UserContext.getCurrent() != null) {
            values.put(SESSION_PREDEFINEDFIELD_USER_ID, UserContext.getCurrentMust().getUserid());
        }

        sessionEntityDTO = this.doCreateChatSession(values);

        //补充会话消息
        if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
            for(int i = 0;i<chatCompletionRequest.getMessages().size() - 1; i++) {
                ChatMessage chatMessage = chatCompletionRequest.getMessages().get(i);
                if(ChatMessageRole.SYSTEM.getValue().equals(chatMessage.getRole())) {
                    continue;
                }
                
                if(StringUtils.hasLength(chatMessage.getType()) && ChatMessageType.SYSTEM.getValue().equals(chatMessage.getType())) {
                    continue;
                }
                
                this.createChatMessage(sessionEntityDTO, chatMessage);
            }
        }
        return sessionEntityDTO;
    }

    protected IEntityDTO doCreateChatSession(Map<String, Object> values) throws Throwable {
        IEntityDTO sessionEntityDTO = this.getSessionDataEntityRuntime(false).createEntity();
        for(java.util.Map.Entry<String, Object> entry : values.entrySet()) {
            IPSDEField iPSDEField = this.sessionPSDEFieldMap.get(entry.getKey());
            if(iPSDEField != null) {
                sessionEntityDTO.set(iPSDEField.getLowerCaseName(), entry.getValue());
            }
        }
        this.getSessionDataEntityRuntime(false).create(sessionEntityDTO);
        return sessionEntityDTO;
    }

    protected IEntityDTO createChatMessage(IEntityDTO chatSessionEntityDTO, ChatMessage chatMessage) throws Throwable{
        return this.createChatMessage(chatSessionEntityDTO, chatMessage, false, false);
    }

    protected IEntityDTO createCancelChatMessage(IEntityDTO chatSessionEntityDTO, ChatMessage chatMessage) throws Throwable{
        return this.createChatMessage(chatSessionEntityDTO, chatMessage, true, false);
    }
    
    protected IEntityDTO createChatMessage(IEntityDTO chatSessionEntityDTO, ChatMessage chatMessage, boolean bCancel, boolean bError) throws Throwable{
    	return this.createChatMessage(chatSessionEntityDTO, chatMessage, bCancel, bError, null);
    }

    protected IEntityDTO createChatMessage(IEntityDTO chatSessionEntityDTO, ChatMessage chatMessage, boolean bCancel, boolean bError, ChatCompletionResult chatCompletionResult) throws Throwable{
        IDataEntityRuntime messageDataEntityRuntime = this.getMessageDataEntityRuntime(true);
        if(messageDataEntityRuntime == null) {
            return null;
        }

        Object sessionId = chatSessionEntityDTO.get(this.getSessionDataEntityRuntime(false).getKeyPSDEField().getLowerCaseName());

        long nSeq = System.currentTimeMillis();
        Map<String, Object> values = new HashMap<String, Object>();
        values.put(MESSAGE_PREDEFINEDFIELD_SESSION_ID, sessionId);
        values.put(MESSAGE_PREDEFINEDFIELD_SEQUENCE, nSeq);
        Object _original = chatMessage.get("_original");
        if(!ObjectUtils.isEmpty(_original)) {
            values.put(MESSAGE_PREDEFINEDFIELD_CONTENT, _original);
        }
        else {
            values.put(MESSAGE_PREDEFINEDFIELD_CONTENT, chatMessage.getContent());
        }

        values.put(MESSAGE_PREDEFINEDFIELD_CONTENT_TYPE, "md");
        if(bError){
            values.put(MESSAGE_PREDEFINEDFIELD_STATUS, MESSAGE_STATUS_FAILED);
        }
        if(bCancel){
            values.put(MESSAGE_PREDEFINEDFIELD_STATUS, MESSAGE_STATUS_CANCELED);
        }
        if(StringUtils.hasLength(chatMessage.getRole())) {
            if(ChatMessageRole.ASSISTANT.getValue().equals(chatMessage.getRole())) {
                values.put(MESSAGE_PREDEFINEDFIELD_SENDER_TYPE, MESSAGE_SENDER_TYPE_AGENT);
            }
            else {
                values.put(MESSAGE_PREDEFINEDFIELD_SENDER_TYPE, chatMessage.getRole().toLowerCase());
            }
        }
        
        if(chatCompletionResult != null) {
         	ChatCompletionUsage chatCompletionUsage = chatCompletionResult.getUsage();
         	if(chatCompletionUsage != null) {
         		values.put(MESSAGE_PREDEFINEDFIELD_INPUT_TOKENS, chatCompletionUsage.getPromptTokens());
         		values.put(MESSAGE_PREDEFINEDFIELD_OUTPUT_TOKENS, chatCompletionUsage.getCompletionTokens());
         		values.put(MESSAGE_PREDEFINEDFIELD_TOTAL_TOKENS, chatCompletionUsage.getTotalTokens());
         		values.put(MESSAGE_PREDEFINEDFIELD_TOOL_CALLS, chatCompletionUsage.getToolCalls());
         	}
        }

        return this.doCreateChatMessage(values);
    }

    protected IEntityDTO doCreateChatMessage(Map<String, Object> values) throws Throwable {
        IEntityDTO messageEntityDTO = this.getMessageDataEntityRuntime(false).createEntity();
        for(java.util.Map.Entry<String, Object> entry : values.entrySet()) {
            IPSDEField iPSDEField = this.messagePSDEFieldMap.get(entry.getKey());
            if(iPSDEField != null) {
                messageEntityDTO.set(iPSDEField.getLowerCaseName(), entry.getValue());
            }
        }
        this.getMessageDataEntityRuntime(false).create(messageEntityDTO);
        return messageEntityDTO;
    }

    @Override
    protected ChatCompletionResult doChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) throws Throwable {
        if(this.getAIAgentRTScript(true)!=null && this.getAIAgentRTScript(false).contains(AIAGENTRTSCRIPTMETHOD_CHATCOMPLETION, IModelRTScript.ATTACHMODE_EXECUTE)) {
            Object ret = this.getAIAgentRTScript(false).call(AIAGENTRTSCRIPTMETHOD_CHATCOMPLETION, IModelRTScript.ATTACHMODE_EXECUTE, new Object[] {strAIPlatformType, chatCompletionRequest});
            if(ret != null) {
                if(ret instanceof ChatCompletionRequest) {
                    chatCompletionRequest = (ChatCompletionRequest)ret;
                }
                else
                if(ret instanceof ChatCompletionResultEx) {
                    return (ChatCompletionResultEx)ret;
                }
                else{
                    ChatCompletionResultEx chatCompletionResultEx = new ChatCompletionResultEx();
                    chatCompletionResultEx.setResult(ret);
                    return chatCompletionResultEx;
                }
            }
        }

        ChatCompletionResult chatCompletionResult = super.doChatCompletion(strAIPlatformType, chatCompletionRequest);
        if(this.getAIAgentRTScript(true)!=null && this.getAIAgentRTScript(false).contains(AIAGENTRTSCRIPTMETHOD_GETRESULT, IModelRTScript.ATTACHMODE_EXECUTE)) {
            Object ret = this.getAIAgentRTScript(false).call(AIAGENTRTSCRIPTMETHOD_GETRESULT, IModelRTScript.ATTACHMODE_EXECUTE, new Object[] {chatCompletionResult});
            if(ret != null) {
                ChatCompletionResultEx chatCompletionResultEx = new ChatCompletionResultEx(chatCompletionResult);
                chatCompletionResultEx.setResult(ret);
                return chatCompletionResultEx;
            }
        }
        return chatCompletionResult;
    }

    protected void fillChatCompletionKnowledgeBases(ChatCompletionRequest chatCompletionRequest) throws Throwable {
        if(AIKBMode.FIXED.value.equals(this.getPSModelObject().getKnowledgeBaseMode())) {
            if(StringUtils.hasLength(this.getPSModelObject().getKnowledgeBaseTags())) {
                chatCompletionRequest.setKnowledgeBases(Arrays.asList(this.getPSModelObject().getKnowledgeBaseTags().split("[,]")));
            }
            else {
                chatCompletionRequest.setKnowledgeBases(new ArrayList<>());
            }
        }
        else {
            List<String> knowledgeBaseList = chatCompletionRequest.getKnowledgeBases();
            Set<String> rawKnowledgeBaseList = new HashSet<String>();
            if(!ObjectUtils.isEmpty(knowledgeBaseList)) {
                for(String strKBTag : knowledgeBaseList) {
                    String strRealKBTag = this.getRealKBAgentConfigId(strKBTag);
                    rawKnowledgeBaseList.add(strRealKBTag);
                }
            }
            Object rawKnowledgeBases = chatCompletionRequest.get(CHATCOMPLETIONREQUEST_RAWKNOWLEDGEBASES);
            if(rawKnowledgeBases instanceof List) {
                rawKnowledgeBaseList.addAll((List)rawKnowledgeBases);
            }

            if(StringUtils.hasLength(this.getPSModelObject().getKnowledgeBaseTags())) {
                if(ObjectUtils.isEmpty(rawKnowledgeBaseList)) {
                    //判断知识库模式，排除模式不放入
                    if(AIKBMode.DEFAULT.value.equals(this.getPSModelObject().getKnowledgeBaseMode())
                            || AIKBMode.INCLUDE.value.equals(this.getPSModelObject().getKnowledgeBaseMode())) {
                        chatCompletionRequest.setKnowledgeBases(Arrays.asList(this.getPSModelObject().getKnowledgeBaseTags().split("[,]")));
                    }
                }
                else {
                    //需要判断是否在清单中
                    List<String> originals = Arrays.asList(this.getPSModelObject().getKnowledgeBaseTags().split("[,]"));
                    List<String> knowledgeBaseList2 = new ArrayList<String>();
                    for(String strKBTag : rawKnowledgeBaseList) {
                        if(AIKBMode.EXCLUDE.value.equals(this.getPSModelObject().getKnowledgeBaseMode())) {
                            //排除
                            if(!originals.contains(strKBTag)) {
                                knowledgeBaseList2.add(strKBTag);
                            }
                        }
                        else {
                            if(originals.contains(strKBTag)) {
                                knowledgeBaseList2.add(strKBTag);
                            }
                            else {
                                //log.warn(String.format("预置知识库未包含[%1$s]，忽略", strKBTag));
                                if(AIKBMode.INCLUDE.value.equals(this.getPSModelObject().getKnowledgeBaseMode())) {
                                    log.warn(String.format("预置知识库未包含[%1$s]，忽略", strKBTag));
                                    continue;
                                }

                                knowledgeBaseList2.add(strKBTag);
                            }
                        }
                    }
                    chatCompletionRequest.setKnowledgeBases(knowledgeBaseList2);
                }
            }
            else {
                chatCompletionRequest.setKnowledgeBases(new ArrayList<String>(rawKnowledgeBaseList));
            }
        }
    }

    @Override
    protected PortalAsyncAction doAsyncChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) throws Throwable {

        if(this.getAIAgentRTScript(true)!=null && this.getAIAgentRTScript(false).contains(AIAGENTRTSCRIPTMETHOD_ASYNCCHATCOMPLETION, IModelRTScript.ATTACHMODE_EXECUTE)) {
            Object ret = this.getAIAgentRTScript(false).call(AIAGENTRTSCRIPTMETHOD_ASYNCCHATCOMPLETION, IModelRTScript.ATTACHMODE_EXECUTE, new Object[] {strAIPlatformType, chatCompletionRequest});
            if(ret != null) {
                if(ret instanceof ChatCompletionRequest) {
                    chatCompletionRequest = (ChatCompletionRequest)ret;
                }
                else
                if(ret instanceof PortalAsyncAction) {
                    return (PortalAsyncAction)ret;
                }
                else{
                    throw new Exception(String.format("无法识别的返回值[%1$s]", ret));
                }
            }
        }
        return super.doAsyncChatCompletion(strAIPlatformType, chatCompletionRequest);
    }

    @Override
    public String getAgentParam(String strName, String strDefault) {
        if(this.getPSModelObject().getAgentParams() != null) {
            JsonNode jsonNode = this.getPSModelObject().getAgentParams().get(strName);
            if(jsonNode != null) {
                return jsonNode.asText(strDefault);
            }
        }
        return super.getAgentParam(strName, strDefault);
    }

    protected String getHistoriesConfigId() throws Throwable {
        throw new Exception("没有实现");
    }

    protected String getSystemMessagesConfigId() throws Throwable {
        throw new Exception("没有实现");
    }

    protected String getSuggestionMessagesConfigId() throws Throwable {
        throw new Exception("没有实现");
    }

    protected String getDigestMessageConfigId() throws Throwable {
        return null;
    }

    protected String getToolsConfigId() throws Throwable {
        throw new Exception("没有实现");
    }

    protected String getInfoConfigId() throws Throwable {
        return null;
    }

    @Override
    protected List getActiveData(Object dataOrKeys) throws Throwable {
        if(this.getAIAgentRTScript(true)!=null && this.getAIAgentRTScript(false).contains(AIAGENTRTSCRIPTMETHOD_GETACTIVEDATA, IModelRTScript.ATTACHMODE_EXECUTE)) {
            Object ret = this.getAIAgentRTScript(false).call(AIAGENTRTSCRIPTMETHOD_GETACTIVEDATA, IModelRTScript.ATTACHMODE_EXECUTE, new Object[] {dataOrKeys});
            if(ret instanceof List) {
                return (List)ret;
            }
        }
        return super.getActiveData(dataOrKeys);
    }




    @Override
    public Object beginChatSession(ChatCompletionRequest chatCompletionRequest) throws Throwable {
        try {
            return this.onBeginChatSession(chatCompletionRequest);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("开始聊天会话发生异常，%1$s", ex.getMessage()), ex);
        }
    }

    protected Object onBeginChatSession(ChatCompletionRequest chatCompletionRequest) throws Throwable {
        IEntityDTO sessionEntityDTO = this.getChatSession(chatCompletionRequest);
        if(sessionEntityDTO == null || this.sessionPSDEFieldMap == null) {
            return null;
        }
        //状态恢复
        IPSDEField statusField = sessionPSDEFieldMap.get(SESSION_PREDEFINEDFIELD_STATUS);
        if(!"active".equals(sessionEntityDTO.get(statusField.getLowerCaseName()))){
            sessionEntityDTO.set(statusField.getLowerCaseName(), "active");
            this.getSessionDataEntityRuntime(false).update(sessionEntityDTO);
        }
        //最近活跃时间缓存,用于优化记忆提取
        Object sessionId = sessionEntityDTO.get(this.getSessionDataEntityRuntime(false).getKeyPSDEField().getLowerCaseName());
        if(this.getPSModelObject().getMemoryMode() == null || PSModelEnums.AIMemoryMode.NONE.value.equals(this.getPSModelObject().getMemoryMode())){
            return sessionEntityDTO;
        }
        ISysCacheUtilRuntime sysCacheUtilRuntime = this.getSystemRuntime().getSysCacheUtilRuntime(false);
        IPSDEField lastActiveAt = sessionPSDEFieldMap.get(SESSION_PREDEFINEDFIELD_LAST_ACTIVE_AT);
        sessionEntityDTO.set(lastActiveAt.getLowerCaseName(),DateUtils.getCurTime());
        sysCacheUtilRuntime.set(getCacheAgentSessionTag(), (String) sessionId,sessionEntityDTO.any());
        return sessionEntityDTO;
    }


    @Override
    public void endChatSession(Object sessionData) throws Throwable {
        try {
            this.onEndChatSession(sessionData);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("结束聊天会话发生异常，%1$s", ex.getMessage()), ex);
        }
    }

    protected void onEndChatSession(Object sessionData) throws Throwable {
        // TODO Auto-generated method stub

    }

    @Override
    public Object appendChatMessage(Object sessionData, ChatMessage chatMessage) throws Throwable {
        return this.appendChatMessage(sessionData, chatMessage, false, false);
    }

    @Override
    public Object appendChatMessage(Object sessionData, ChatMessage chatMessage, boolean bCancel, boolean bError) throws Throwable {
        try {
            return this.onAppendChatMessage(sessionData, chatMessage, bCancel, bError);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("附加聊天消息发生异常，%1$s", ex.getMessage()), ex);
        }
    }

    protected Object onAppendChatMessage(Object sessionData, ChatMessage chatMessage, boolean bCancel, boolean bError) throws Throwable {
        return this.createChatMessage((IEntityDTO)sessionData, chatMessage, bCancel, bError);
    }

    /**
     * 截断聊天消息
     * @param chatCompletionRequest
     * @throws Throwable
     */
    protected void trimChatMessages(ChatCompletionRequest chatCompletionRequest) throws Throwable{
        if(getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest.getMessages()) && chatCompletionRequest.getMessages().size() > this.getHistoryCount()) {
            //
            String strTrimmingStrategy = this.getPSModelObject().getTrimmingStrategy();
            AITrimmingStrategy aiTrimmingStrategy = StringUtils.hasLength(strTrimmingStrategy) ? AITrimmingStrategy.from(strTrimmingStrategy) : AITrimmingStrategy.OLDEST;
            this.doTrimChatMessages(chatCompletionRequest, aiTrimmingStrategy);
        }
    }

    protected void doTrimChatMessages(ChatCompletionRequest chatCompletionRequest, AITrimmingStrategy aiTrimmingStrategy) throws Throwable{
        log.debug(String.format("截取消息历史[%1$s] => [%2$s]", chatCompletionRequest.getMessages().size(), this.getHistoryCount()));
        List<ChatMessage> list = chatCompletionRequest.getMessages().subList(chatCompletionRequest.getMessages().size() - this.getHistoryCount(), chatCompletionRequest.getMessages().size());
        chatCompletionRequest.setMessages(list);
        return;
//		if(aiTrimmingStrategy == AITrimmingStrategy.OLDEST) {
//			log.debug(String.format("截取消息历史[%1$s] => [%2$s]", chatCompletionRequest.getMessages().size(), this.getHistoryCount()));
//			List<ChatMessage> list = chatCompletionRequest.getMessages().subList(chatCompletionRequest.getMessages().size() - this.getHistoryCount(), chatCompletionRequest.getMessages().size());
//			chatCompletionRequest.setMessages(list);
//			return;
//		}
//
//		if(aiTrimmingStrategy == AITrimmingStrategy.SUMMARIZE_OLDEST || aiTrimmingStrategy == AITrimmingStrategy.LEAST_IMPORTANT) {
//			List<ChatMessage> list = chatCompletionRequest.getMessages().subList(0, chatCompletionRequest.getMessages().size() - 1);
//			String strContent = AIChatUtils.chatTrimmingSummarizeOldest(this.getModelRuntimeContext(), list, false);
//			log.debug(String.format("截取消息历史[%1$s] => \r\n%2$s", chatCompletionRequest.getMessages().size(), strContent));
//			List<ChatMessage> list2 = ChatMessagesBuilder.create().assistant(strContent).build();
//			list2.add(chatCompletionRequest.getMessages().get(chatCompletionRequest.getMessages().size() - 1));
//			chatCompletionRequest.setMessages(list2);
//		}
    }




    @Override
    public void scheduleMemoryMaintenance(boolean bHasLeaderShip, Map<String, Object> params) throws Throwable {
        try {
            this.onScheduleMemoryMaintenance(bHasLeaderShip, params);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("定时处理记忆发生异常，%1$s", ex.getMessage()), ex);
        }
    }

    protected void onScheduleMemoryMaintenance(boolean bHasLeaderShip, Map<String, Object> params) throws Throwable {
        if(!bHasLeaderShip){
            return;
        }
        IDataEntityRuntime sessionDataEntityRuntime = this.getSessionDataEntityRuntime(true);
        //不活跃时间阈值(默认)
        Integer inactiveThreshold = 15;
        Instant inactiveInstant = Instant.now().minus(inactiveThreshold, ChronoUnit.MINUTES);
        Timestamp inactiveTime = Timestamp.from(inactiveInstant);
        if(this.getPSModelObject().getMemoryMode() == null || PSModelEnums.AIMemoryMode.NONE.value.equals(this.getPSModelObject().getMemoryMode())){
            return;
        }
        //未指定知识库标记忽略提取
        if(this.getPSModelObject().getMemoryKBTag() == null){
            return;
        }
        if(sessionDataEntityRuntime == null) {
            return;
        }
        List<IEntityDTO> pendingMemorySessions = new ArrayList<>();
        ISysCacheUtilRuntime sysCacheUtilRuntime = this.getSystemRuntime().getSysCacheUtilRuntime(false);
        String needRelaod = sysCacheUtilRuntime.get(getCacheAgentSessionTag(), "needreload");
        if(needRelaod == null || needRelaod.trim().equals("true")) {
            //完整重载，避免数据遗漏
            sysCacheUtilRuntime.resetAll(getCacheAgentSessionTag());
            ISearchContextDTO searchContextDTO = sessionDataEntityRuntime.createSearchContext();
            IPSDEField agentContextIdField = sessionPSDEFieldMap.get(SESSION_PREDEFINEDFIELD_AGENT_CONTEXT_ID);
            IPSDEField lastActiveAtField = sessionPSDEFieldMap.get(SESSION_PREDEFINEDFIELD_LAST_ACTIVE_AT);
            IPSDEField typeField = sessionPSDEFieldMap.get(SESSION_PREDEFINEDFIELD_TYPE);
            IPSDEField statusField = sessionPSDEFieldMap.get(SESSION_PREDEFINEDFIELD_STATUS);
            searchContextDTO.eq(agentContextIdField.getLowerCaseName(), this.getPSModelObject().getAgentContextId())
                    .lt(lastActiveAtField.getLowerCaseName(), inactiveTime)
                    .eq(typeField.getLowerCaseName(), "topic")
                    .eq(statusField.getLowerCaseName(), "active")
                    .all();
            pendingMemorySessions = sessionDataEntityRuntime.select(searchContextDTO);
            //重刷间隔
            sysCacheUtilRuntime.set(getCacheAgentSessionTag(), "needreload","false",1800);
            for (IEntityDTO entityDTO : pendingMemorySessions) {
                sysCacheUtilRuntime.set(getCacheAgentSessionTag(), (String)sessionDataEntityRuntime.getKeyFieldValue(entityDTO),entityDTO.any());
            }
        }else {
            Map<String,String> pendingMemorySessionMap = sysCacheUtilRuntime.getAll(getCacheAgentSessionTag());
            if(!ObjectUtils.isEmpty(pendingMemorySessionMap)){
                for(String value : pendingMemorySessionMap.values()){
                    if(StringUtils.hasLength(value)&&!value.equals("needreload")) {
                        try {
                            Map objdata =  this.getSystemRuntime().deserialize(value, Map.class);
                            pendingMemorySessions.add(sessionDataEntityRuntime.createEntity(objdata));
                        }catch (Exception e) {
                        }
                    }
                }
            }
        }
        for (IEntityDTO session : pendingMemorySessions){
            IPSDEField lastActiveAtField = sessionPSDEFieldMap.get(SESSION_PREDEFINEDFIELD_LAST_ACTIVE_AT);
            if(session.get(lastActiveAtField.getLowerCaseName()) != null && session.get(lastActiveAtField.getLowerCaseName()) instanceof Timestamp){
                //超过不活跃阈值时间则提取记忆
                if(inactiveTime.before((Timestamp)session.get(lastActiveAtField.getLowerCaseName()))){
                    continue;
                }
            }
            Map<String, Object> values = new HashMap<String, Object>();
            IPSDEField titleField = sessionPSDEFieldMap.get(SESSION_PREDEFINEDFIELD_TITLE);
            String taskName = String.format("[%1$s]记忆提取",session.getString(titleField.getLowerCaseName(),""));
            values.put(MEMORYTASK_PREDEFINEDFIELD_NAME,taskName);
            values.put(MEMORYTASK_PREDEFINEDFIELD_TRIGGER_TYPE,"SCHEDULED");
            values.put(MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE,this.getPSModelObject().getMemoryIsolationMode());
            //2-5的随机延迟避免并发阻塞
            int randomMinutes = ThreadLocalRandom.current().nextInt(2, 6);
            Timestamp scheduledTimestamp = Timestamp.from(Instant.now().plus(randomMinutes, ChronoUnit.MINUTES));
            values.put(MEMORYTASK_PREDEFINEDFIELD_SCHEDULED_AT,scheduledTimestamp);
            values.put(MEMORYTASK_PREDEFINEDFIELD_STATUS,"PENDING");
            values.put(MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG,this.getPSModelObject().getMemoryKBTag());
            values.put(MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG,this.getPSModelObject().getMemoryDocTag());
            values.put(MEMORYTASK_PREDEFINEDFIELD_SESSION_ID,session.get(sessionDataEntityRuntime.getKeyPSDEField().getLowerCaseName()));
            IUserContext lastUserContext = UserContext.getCurrent();
            try {
                UserContext.setCurrent( this.getSystemRuntime().createDefaultUserContext());
                sessionDataEntityRuntime.execute(new IAction() {
                    @Override
                    public Object execute(Object[] args) throws Throwable {
                        doCreateMemoryTask(values);
                        //更新会话状态避免重复
                        session.set(sessionDataEntityRuntime.getPSDEField(SESSION_PREDEFINEDFIELD_STATUS).getLowerCaseName(),"paused");
                        sessionDataEntityRuntime.update(session,false);
                        //移除缓存
                        sysCacheUtilRuntime.reset(getCacheAgentSessionTag(), (String)sessionDataEntityRuntime.getKeyFieldValue(session));
                        return null;
                    }
                }, null);
            } finally {
                UserContext.setCurrent(lastUserContext);
            }
        }
    }

    protected void doCreateMemoryTask(Map<String, Object> values) throws Throwable {
        IAIChatMemoryUtil iAIChatMemoryUtil = this.getSysAIFactoryRuntimeContext().getAIChatMemoryUtil(true);
        if(iAIChatMemoryUtil == null || ObjectUtils.isEmpty(values)) {
            log.warn(String.format("未定义交谈记忆功能组件，忽略建立记忆任务", this.getName()));
        }
        iAIChatMemoryUtil.scheduleMemoryTask(values);
    }

    public String getCacheAgentSessionTag(){
        return String.format("deploysystem-%1$s-ai-agent-%2$s--%3$s", getDeploySystemId(), this.getAIFactoryRuntime().getPSModelObject().getCodeName(),this.getPSModelObject().getCodeName());
    }

    @Override
    public void fillSkills(Map<String, Object> skills, Map<String, Object> params) throws Throwable {
        try {
            this.onFillSkills(skills, params);
        }
        catch (Throwable ex) {
            throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("填充代理技能发生异常，%1$s", ex.getMessage()), ex);
        }
    }


    protected void onFillSkills(Map<String, Object> skills, Map<String, Object> params) throws Throwable {
        if(!DataTypeUtils.asBoolean(this.getPSModelObject().getPublishSkill(), false)) {
            return;
        }

        if(ObjectUtils.isEmpty(this.getPSModelObject().getSkillPrompt())) {
            log.warn(String.format("交谈代理[%1$s]启用发布技能，但未定义技能提示词", this.getName()));
            return;
        }

        String strAgentTag = StringUtils.hasLength(this.getPSModelObject().getAgentScope())?String.format("%1$s@%2$s", this.getPSModelObject().getCodeName(), this.getPSModelObject().getAgentScope()): this.getPSModelObject().getCodeName();
        skills.put(strAgentTag, this.getPSModelObject().getSkillPrompt());
    }


    

    @Override
	public List<ChatSkill> getSkills(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
    	return this.onGetSkills(dataOrKeys, body, params);
    }

    protected List<ChatSkill> onGetSkills(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
    	return ISysAIChatAgentRuntime.super.getSkills(dataOrKeys, body, params);
	}

	@Override
	public List<KnowledgeBase> getKnowledgeBases(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
		return this.onGetKnowledgeBases(dataOrKeys, body, params);
    }

    protected List<KnowledgeBase> onGetKnowledgeBases(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
    	return ISysAIChatAgentRuntime.super.getKnowledgeBases(dataOrKeys, body, params);
	}



	@Override
    public String getAgentInfo() {
        try {
            if(StringUtils.hasLength(getInfoConfigId())) {
                String strAgentInfo = this.getContent(null, getInfoConfigId(), null, true);
                if(StringUtils.hasLength(strAgentInfo)) {
                    return strAgentInfo;
                }
            }
        }
        catch (Throwable ex) {
            log.error(ex);
        }

        return this.getPSModelObject().getAgentInfo();
    }

    protected boolean isRedirectToHub() {
        return false;
    }

    public String getDeploySystemId() {
        String system_id = this.getSystemRuntime().getDeploySystemId();
        if (this.getSystemRuntime() instanceof IServiceSystemRuntime) {
            IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) this.getSystemRuntime();
            if (iServiceSystemRuntime.getMainSystemId() != null) {
                system_id = iServiceSystemRuntime.getMainSystemId();
            }
        }
        return system_id;
    }
    
    @Override
    public Object getTemplateContext(MsgTemplEngine msgTemplEngine) {
    	if(msgTemplEngine == MsgTemplEngine.GROOVY) {
    		return this.getModelRuntimeContext();
    	}
    	return null;
    }

}
