package net.ibizsys.central.cloud.core.ai;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;

/**
 * AI 聊天记忆功能组件
 * @author lionlau
 *
 */
public interface IAIChatMemoryUtil {

	public final static String MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG = "KNOWLEDGEBASE_TAG";

	public final static String MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG = "DOCUMENT_TAG";

	public final static String MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE = "MEMORY_ISOLATION_MODE";

	public final static String MEMORYTASK_PREDEFINEDFIELD_BUSINESS_SCOPE = "BUSINESS_SCOPE";

	public final static String MEMORYTASK_PREDEFINEDFIELD_MEMORY_TYPE = "MEMORY_TYPE";

    public final static String MEMORYTASK_PREDEFINEDFIELD_USER_ID = "USER_ID";

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

	/**
	 * 计划记忆任务
	 * @param memoryContext
	 * @throws Exception
	 */
	void scheduleMemoryTask(Map<String, Object> memoryContext) throws Exception;

	/**
	 * 进行记忆存储
	 * @param memoryContext
	 * @param content
	 * @throws Exception
	 */
	void writeMemory(Map<String, Object> memoryContext, String content) throws Exception;





	/**
	 * 进行记忆召回
	 * @param memoryContext
	 * @param iChunkSearchContext
	 * @return
	 * @throws Exception
	 */
	List<Chunk> retrieveMemory(Map<String, Object> memoryContext, IChunkSearchContext iChunkSearchContext) throws Exception;
}
