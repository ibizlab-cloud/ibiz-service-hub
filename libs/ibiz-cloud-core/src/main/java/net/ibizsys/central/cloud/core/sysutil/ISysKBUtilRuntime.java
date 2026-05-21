package net.ibizsys.central.cloud.core.sysutil;

import java.util.List;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ClusterEmbeddingsRequest;
import net.ibizsys.central.cloud.core.util.domain.Document;

/**
 * 系统KB功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysKBUtilRuntime extends ISysUtilRuntime{

	/**
	 * KB平台：默认，由Cloud平台默认KB引擎提供服务
	 */
	public final static String KBPLATFORM_DEFAULT = "DEFAULT";
	
	
	/**
	 * SKILLS：Cloud平台SKILL注册
	 */
	public final static String KBPLATFORM_SKILLS = "SKILLS";
	
	
	/**
	 * KB平台：禁用
	 */
	public final static String KBPLATFORM_DISABLED = "__DISABLED__";
	
	
	/**
	 * 获取默认的KB平台类型
	 * @return
	 */
	String getDefaultKBPlatformType();
	
	/**
	 * 获取知识片段
	 * @param iChunkSearchContext
	 * @return
	 */
	Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext);
	
	/**
	 * 获取知识片段
	 * @param type
	 * @param iChunkSearchContext
	 * @return
	 */
	Page<Chunk> fetchChunks(String type, IChunkSearchContext iChunkSearchContext);
	
	
	
	/**
	 * 聚合向量值
	 * @param clusterEmbeddingsRequest
	 * @return
	 */
	List<Integer> clusterEmbeddings(ClusterEmbeddingsRequest clusterEmbeddingsRequest);
	
	
	
	/**
	 * 获取知识片段
	 * @param iChunkSearchContext
	 * @return
	 */
	Page<Chunk> fetchChunksByHistories(IChunkSearchContext iChunkSearchContext);
	
	/**
	 * 获取知识片段
	 * @param type
	 * @param iChunkSearchContext
	 * @return
	 */
	Page<Chunk> fetchChunksByHistories(String type, IChunkSearchContext iChunkSearchContext);
	
	
	/**
	 * 获取知识库引导信息
	 * @param type
	 * @return
	 */
	String getGuidancePrompt(String type);
	
	/**
	 * 建立文档
	 * @param type
	 * @param document
	 * @return
	 */
	Document createDocument(String type, Document document);

	/**
	 * 更新文档
	 * @param type
	 * @param document_id
	 * @param document
	 * @return
	 */
	Document updateDocument(String type, String document_id, Document document);
	
	/**
	 * 保存文档
	 * @param type
	 * @param document_id
	 * @param document
	 * @return
	 */
	Document saveDocument(String type, String document_id, Document document);

	/**
	 * 获取文档
	 * @param type
	 * @param document_id
	 * @return
	 */
	Document getDocument(String type, String document_id);
	
	
	/**
	 * 获取文档
	 * @param type
	 * @param document_id
	 * @param try_mode 尝试模式
	 * @return
	 */
	Document getDocument(String type, String document_id, boolean try_mode);
	

	/**
	 * 删除文档
	 * @param type
	 * @param document_id
	 * @return
	 */
	Integer deleteDocument(String type, String document_id);

	/**
	 * 建立片段
	 * @param type
	 * @param document_id
	 * @param chunk
	 * @return
	 */
	Chunk createChunk(String type, String document_id, Chunk chunk);

	/**
	 * 更新片段
	 * @param type
	 * @param document_id
	 * @param chunk_id
	 * @param chunk
	 * @return
	 */
	Chunk updateChunk(String type, String document_id, String chunk_id, Chunk chunk);
	
	/**
	 * 保存片段
	 * @param type
	 * @param document_id
	 * @param chunk_id
	 * @param chunk
	 * @return
	 */
	Chunk saveChunk(String type, String document_id, String chunk_id, Chunk chunk);

	/**
	 * 获取片段
	 * @param type
	 * @param document_id
	 * @param chunk_id
	 * @return
	 */
	Chunk getChunk(String type, String document_id, String chunk_id);

	/**
	 * 删除片段
	 * @param type
	 * @param document_id
	 * @param chunk_id
	 * @return
	 */
	Integer deleteChunk(String type, String document_id, String chunk_id);
}
