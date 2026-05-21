package net.ibizsys.central.plugin.ai.util;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.Document;

/**
 * AI 技能代理运行时对象基接口
 * @author lionlau
 *
 */
public interface IAIChatAgentUtil {

//	/**
//	 * 指定是否附加系统提示词
//	 */
//	public final static String PARAM__CHAT_COMPLETION__SYSTEM_PROMPT = "system_prompt";
//	
//	/**
//	 * 指定是否附加历史
//	 */
//	public final static String PARAM__CHAT_COMPLETION__HISTORIES = "histories";
	
	ChatCompletionResult chatCompletion(ChatCompletionRequest chatCompletionRequest, boolean appendSystem, boolean appendHistories, Map<String, Object> params) throws Throwable;
	
	
	
	/**
	 * 获取当前Agent绑定的相关资料库片段
	 * @param iChunkSearchContext
	 * @return
	 */
	Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable;
	
	
	
	/**
	 * 列出查询片段中涉及的文档
	 * @param iChunkSearchContext
	 * @return
	 * @throws Throwable
	 */
	List<Document> listDocumentsByChunks(IChunkSearchContext iChunkSearchContext) throws Throwable;
	
	
	/**
	 * 下载文档
	 * @param iChunkSearchContext
	 * @param documentId
	 * @param type
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	File downloadDocument(IChunkSearchContext iChunkSearchContext, String documentId, String type, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 输出步骤
	 * @param message
	 * @param title
	 * @param params
	 * @throws Throwable
	 */
	void outputStep(String message, String title, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 输出并等待用户输入
	 * @param message
	 * @param next 下一步进入的步骤
	 * @param params
	 * @throws Throwable
	 */
	void waitForInput(String message, String next, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 直接输出内容
	 * @param content
	 * @param append
	 * @param params
	 * @throws Throwable
	 */
	void outputRaw(String content, boolean append, Map<String, Object> params) throws Throwable;
	
	
	
	/**
	 * 内部请求
	 * @param util
	 * @param method
	 * @param body
	 * @return
	 * @throws Throwable
	 */
	Object internalRequest(String util, String method, Map<String, Object> body) throws Throwable;
	
	
	
	/**
	 * 下载OSS文件
	 * @param folder
	 * @param id
	 * @param body
	 * @return
	 * @throws Throwable
	 */
	File downloadOSSFile(String folder, String id, Map<String, Object> params) throws Throwable;
	
	/**
	 * 下载请求中携带的OSS文件
	 * @param request
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	List<File> downloadRequestOSSFiles(ChatCompletionRequest request, Map<String, Object> params) throws Throwable;
}
