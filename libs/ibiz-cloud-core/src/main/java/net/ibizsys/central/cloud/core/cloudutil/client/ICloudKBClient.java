package net.ibizsys.central.cloud.core.cloudutil.client;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ClusterEmbeddingsRequest;
import net.ibizsys.central.cloud.core.util.domain.Document;

public interface ICloudKBClient {
	
	/**
	 *下载文本 参数：文本类型
	 */
	public final static String DOWNLOAD_DOCUMENT_PARAM__TYPE = "type";

//	/**
//	 * 下载文本参数：完整
//	 */
//	public final static String DOWNLOAD_DOCUMENT_PARAM__FULL = "full";
	
	/**
	 * 文本类型：md
	 */
	public final static String DOWNLOAD_DOCUMENT_TYPE__MD  = "md";
	
	/**
	 * 文本类型：html
	 */
	public final static String DOWNLOAD_DOCUMENT_TYPE__HTML  = "html";
	
	/**
	 * 文本类型：plain
	 */
	public final static String DOWNLOAD_DOCUMENT_TYPE__PLAIN  = "plain";
	
	/**
	 * 文本类型：pageindex 页面索引
	 */
	public final static String DOWNLOAD_DOCUMENT_TYPE__PAGEINDEX  = "pageindex";
	
	/**
	 * 文本类型：JSON数据文件
	 */
	public final static String DOWNLOAD_DOCUMENT_TYPE__JSON  = "json";
	
	
	/**
	 * 文本类型：完整内容（MD）
	 */
	public final static String DOWNLOAD_DOCUMENT_TYPE__FULL  = "full";
	
	
	/**
	 * 文本类型：自动
	 */
	public final static String DOWNLOAD_DOCUMENT_TYPE__AUTO  = "auto";
	
	/**
	 * 文本类型：原生内容
	 */
	public final static String DOWNLOAD_DOCUMENT_TYPE__RAW  = "raw";
	
	/**
	 * 文档类型：xlsx
	 */
	public final static String DOWNLOAD_DOCUMENT_TYPE__XLSX  = "xlsx";
	
	
	/**
	 *获取文档参数：尝试模式
	 */
	public final static String GET_DOCUMENT_PARAM__TRYMODE = "trymode";
	
	
	
	/**
	 * 查询指定知识库资料片段
	 * @param kb_tag
	 * @param iChunkSearchContext
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.POST}, value = "/kb/{kb_tag}/fetchchunks")
	Page<Chunk> fetchChunks(@PathVariable("kb_tag") String kb_tag, @RequestBody IChunkSearchContext iChunkSearchContext);
	
	@RequestMapping(method = {RequestMethod.POST}, value = "/kb/{kb_tag}/fetchchunksbyhistories")
	Page<Chunk> fetchChunksByHistories(@PathVariable("kb_tag") String kb_tag, @RequestBody IChunkSearchContext iChunkSearchContext);
	

	@RequestMapping(method = {RequestMethod.POST}, value = "/kb/cluster_embeddings")
	List<Integer> clusterEmbeddings(@RequestBody ClusterEmbeddingsRequest clusterEmbeddingsRequest);
	
	/**
	 * 获取指定知识库引导信息
	 * @param kb_tag
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = {"/kb/{kb_tag}/guidance_prompt"})
	String getGuidancePrompt(@PathVariable("kb_tag") String kb_tag);
	
	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{kb_tag}/documents"})
	Document createDocument(@PathVariable("kb_tag") String kb_tag, @RequestBody Document document);
	
	@RequestMapping(method = RequestMethod.PUT, value = {"/kb/{kb_tag}/documents/{document_id}"})
	Document updateDocument(@PathVariable("kb_tag") String kb_tag, @PathVariable("document_id") String document_id, @RequestBody Document document);
	
	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{kb_tag}/documents/{document_id}/save"})
	Document saveDocument(@PathVariable("kb_tag") String kb_tag, @PathVariable("document_id") String document_id, @RequestBody Document document);
	
	@RequestMapping(method = RequestMethod.GET, value = {"/kb/{kb_tag}/documents/{document_id}"})
	Document getDocument(@PathVariable("kb_tag") String kb_tag, @PathVariable("document_id") String document_id);
	
	@RequestMapping(method = RequestMethod.GET, value = {"/kb/{kb_tag}/documents/{document_id}"})
	Document getDocument(@PathVariable("kb_tag") String kb_tag, @PathVariable("document_id") String document_id, @RequestParam(GET_DOCUMENT_PARAM__TRYMODE) boolean tryMode);
	
	@RequestMapping(method = RequestMethod.DELETE, value = {"/kb/{kb_tag}/documents/{document_id}"})
	Integer deleteDocument(@PathVariable("kb_tag") String kb_tag, @PathVariable("document_id") String document_id);
	
	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{kb_tag}/documents/{document_id}/chunks"})
	Chunk createChunk(@PathVariable("kb_tag") String kb_tag, @PathVariable("document_id") String document_id, @RequestBody Chunk chunk);
	
	
	@RequestMapping(method = RequestMethod.PUT, value = {"/kb/{kb_tag}/documents/{document_id}/chunks/{chunk_id}"})
	Chunk updateChunk(@PathVariable("kb_tag") String kb_tag, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id, @RequestBody Chunk chunk);

	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{kb_tag}/documents/{document_id}/chunks/{chunk_id}/save"})
	Chunk saveChunk(@PathVariable("kb_tag") String kb_tag, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id, @RequestBody Chunk chunk);
	
	
	@RequestMapping(method = RequestMethod.GET, value = {"/kb/{kb_tag}/documents/{document_id}/chunks/{chunk_id}"})
	Chunk getChunk(@PathVariable("kb_tag") String kb_tag, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id);
	
	@RequestMapping(method = RequestMethod.DELETE, value = {"/kb/{kb_tag}/documents/{document_id}/chunks/{chunk_id}"})
	Integer deleteChunk(@PathVariable("kb_tag") String kb_tag, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id);
	
}
