package net.ibizsys.central.cloud.core.cloudutil;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ClusterEmbeddingsRequest;
import net.ibizsys.central.cloud.core.util.domain.Document;

/**
 * 云体系KB功能组件接口
 * 
 * @author lionlau
 *
 */
public interface ICloudKBUtilRuntime extends ICloudUtilRuntime {

	/**
	 * KB平台插件前缀
	 */
	public final static String ADDIN_KBPLATFORM_PREFIX = "KBPLATFORM:";

	/**
	 * KB平台：milvus
	 */
	public final static String KBPLATFORM_MILVUS = "MILVUS";

	/**
	 * KB平台：elasticsearch
	 */
	public final static String KBPLATFORM_ES = "ES";

	/**
	 * KB平台：RagFlow
	 */
	public final static String KBPLATFORM_RAGFLOW = "RAGFLOW";

	/**
	 * KB平台：Cloud里面的系统服务
	 */
	public final static String KBPLATFORM_CLOUD = "CLOUD";
	
	
	/**
	 * KB平台：外部Cloud里面的系统服务
	 */
	public final static String KBPLATFORM_OUTSIDE_CLOUD = "OUTSIDE_CLOUD";

	/**
	 * KB平台：默认
	 */
	public final static String KBPLATFORM_DEFAULT = "DEFAULT";
	
	
	/**
	 * 获取知识库引导词
	 * @param type
	 * @return
	 */
	String getGuidancePrompt(String type);
	
	/**
	 * 列出知识库文档
	 * @param type
	 * @param params
	 * @return
	 */
	List listFiles(String type, Map<String, Object> params);

	Document createDocument(String type, Document document);

	Document updateDocument(String type, String document_id, Document document);
	
	Document saveDocument(String type, String document_id, Document document);

	Document getDocument(String type, String document_id);

	Integer deleteDocument(String type, String document_id);
	
	/**
	 * 下载文档
	 * @param type
	 * @param document_id
	 * @param request
	 * @param response
	 */
	void downloadDocument(String type, String document_id, HttpServletRequest request, HttpServletResponse response);

	Chunk createChunk(String type, String document_id, Chunk chunk);

	Chunk updateChunk(String type, String document_id, String chunk_id, Chunk chunk);
	
	Chunk saveChunk(String type, String document_id, String chunk_id, Chunk chunk);

	Chunk getChunk(String type, String document_id, String chunk_id);

	Integer deleteChunk(String type, String document_id, String chunk_id);

	Page fetchChunks(String type, String document_id, Map params);

	/**
	 * 查询知识块
	 * 
	 * @param strType
	 * @param data
	 * @return
	 */
	Page fetchChunks(String strType, Map<String, Object> data);

	/**
	 * 查询聊天请求的知识块
	 * 
	 * @param strType
	 * @param data
	 * @return
	 */
	Page fetchChunksByHistories(String strType, Map<String, Object> data);

	/**
	 * 分组嵌入值
	 * 
	 * @param clusterEmbeddingsRequest
	 * @return
	 */
	List<Integer> clusterEmbeddings(ClusterEmbeddingsRequest clusterEmbeddingsRequest);
	
	
	
	/**
	 * 查询知识库
	 * @param data
	 * @return
	 */
	Page fetchKBs(Map<String, Object> data);

}
