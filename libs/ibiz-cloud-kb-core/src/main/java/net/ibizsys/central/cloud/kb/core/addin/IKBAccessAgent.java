package net.ibizsys.central.cloud.kb.core.addin;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.cloud.core.util.domain.KBAccess;
import net.ibizsys.central.cloud.kb.core.cloudutil.ICloudKBUtilRuntimeContext;

/**
 * KB访问代理
 * @author lionlau
 *
 */
public interface IKBAccessAgent extends ICloudKBUtilRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param aiAccess
	 * @throws Exception
	 */
	void init(ICloudKBUtilRuntimeContext ctx, KBAccess kbAccess) throws Exception;
	
	/**
	 * 开始代理
	 */
	void start() throws Exception;
	
	/**
	 * 停止代理
	 */
	void stop() throws Exception;
	
	/**
	 * 获取代理数据
	 * @return
	 */
	KBAccess getAgentData();

	
	/**
	 * 获取KB类型
	 * @return
	 */
	String getKBType();
	
	/**
	 * 获取知识库引导词
	 * @return
	 */
	String getGuidancePrompt() throws Throwable;
	
	List listFiles(Map<String, Object> params )throws Throwable;

	Document createDocument(Document document) throws Throwable;

	Document updateDocument(String document_id, Document document) throws Throwable;
	
	Document saveDocument(String document_id, Document document) throws Throwable;

	Document getDocument(String document_id) throws Throwable;

	Integer deleteDocument(String document_id) throws Throwable;
	
	/**
	 * 下载文档
	 * @param document_id
	 * @param request
	 * @param response
	 * @throws Throwable
	 */
	void downloadDocument(String document_id, HttpServletRequest request, HttpServletResponse response) throws Throwable;

	Chunk createChunk(String document_id, Chunk chunk) throws Throwable;

	Chunk updateChunk(String document_id, String chunk_id, Chunk chunk) throws Throwable;
	
	Chunk saveChunk(String document_id, String chunk_id, Chunk chunk) throws Throwable;

	Chunk getChunk(String document_id, String chunk_id) throws Throwable;

	Integer deleteChunk(String document_id, String chunk_id) throws Throwable;

	Page<Chunk> fetchChunks(String document_id, IChunkSearchContext iChunkSearchContext) throws Throwable;
	
	
	/**
	 * 查询知识片段
	 * @param iChunkSearchContext
	 * @return
	 * @throws Throwable
	 */
	Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable;
	
	
	/**
	 * 查询聊天请求的知识块
	 * @param chatCompletionRequest
	 * @return
	 */
	Page fetchChunksByHistories(IChunkSearchContext iChunkSearchContext) throws Throwable;
}
