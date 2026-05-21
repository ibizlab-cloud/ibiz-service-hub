package net.ibizsys.central.plugin.ai.sysutil;

public interface ISysChatMemoryUtilRuntime extends net.ibizsys.central.cloud.core.sysutil.ISysChatMemoryUtilRuntime {

    public final static String MESSAGE_PREDEFINEDFIELD_SESSION_ID = "SESSION_ID";

    public final static String MESSAGE_PREDEFINEDFIELD_CONTENT_TYPE = "CONTENT_TYPE";

    public final static String MESSAGE_PREDEFINEDFIELD_SENDER_TYPE = "SENDER_TYPE";

    public final static String MESSAGE_PREDEFINEDFIELD_CONTENT = "CONTENT";

    public final static String MESSAGE_PREDEFINEDFIELD_SEQUENCE = "SEQUENCE";

    public final static String MESSAGE_PREDEFINEDFIELD_STATUS = "STATUS";

    public final static String MEMORYTASK_PREDEFINEDFIELD_NAME = "NAME";

    public final static String MEMORYTASK_PREDEFINEDFIELD_STATUS = "STATUS";

    public final static String MEMORYTASK_PREDEFINEDFIELD_SESSION_ID = "SESSION_ID";

    public final static String MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG = "KNOWLEDGEBASE_TAG";

    public final static String MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG = "DOCUMENT_TAG";

    public final static String MEMORYTASK_PREDEFINEDFIELD_SCHEDULED_AT = "SCHEDULED_AT";

    public final static String MEMORYTASK_PREDEFINEDFIELD_TRIGGER_TYPE = "TRIGGER_TYPE";

    public final static String MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE = "MEMORY_ISOLATION_MODE";

    public final static String MEMORYTASK_PREDEFINEDFIELD_MEMORY_USER_ID = "USER_ID";

    public final static String MEMORYTASK_PREDEFINEDFIELD_LAST_MSG_TIME = "LAST_MSG_TIME";

    public final static String MEMORYTASK_PREDEFINEDFIELD_EXECUTED_AT = "EXECUTED_AT";

    public final static String MEMORYTASK_PREDEFINEDFIELD_MEMORY_BUSINESS_SCOPE = "BUSINESS_SCOPE";

    public final static String MEMORYTASK_PREDEFINEDFIELD_END_AT = "END_AT";

    public final static String MEMORYTASK_PREDEFINEDFIELD_MEMORY_TYPE = "MEMORY_TYPE";

    public final static String MEMORYTASK_PREDEFINEDFIELD_AI_AGENT_CONTEXT_ID = "AI_AGENT_CONTEXT_ID";

    /**
     * 记忆类型：常规
     */
    public final static String MEMORY_TYPE_REGULAR = "regular";

    /**
     * 记忆类型：常驻
     */
    public final static String MEMORY_TYPE_RESIDENT = "resident";

    /**
     * 记忆类型：每日
     */
    public final static String MEMORY_TYPE_DAILY = "daily";

//    public Object doMemoryExtract(Map<String, Object> memoryTask) throws Throwable;
//
//
//    public List<Chunk> doMemoryVerification(Map<String, Object> memoryTask , List<Map<String, Object>> factSourceCandidates) throws Throwable;


}
