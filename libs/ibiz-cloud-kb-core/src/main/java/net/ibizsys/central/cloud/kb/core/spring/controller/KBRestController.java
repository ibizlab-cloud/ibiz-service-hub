package net.ibizsys.central.cloud.kb.core.spring.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.RestUtils.KeyNameCaseMode;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ClusterEmbeddingsRequest;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.cloud.kb.core.IKBUtilSystemRuntime;

@RestController()
@RequestMapping("")
public class KBRestController {

	private static final Log log = LogFactory.getLog(KBRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("Cloud知识库服务已经启动"));
		iServiceHub.registerNamingService("ibizcloud-kb");
	}

	@Autowired(required=false)
	private ICloudKBUtilRuntime iCloudKBUtilRuntime = null;

	protected ICloudKBUtilRuntime getCloudKBUtilRuntime() {
		if (this.iCloudKBUtilRuntime == null) {
			try {
				this.iCloudKBUtilRuntime = iServiceHub.getCloudUtilRuntime(IKBUtilSystemRuntime.class, ICloudKBUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud服务KB功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud服务知识库功能模块"), ex);
			}
		}
		return this.iCloudKBUtilRuntime;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/kb/{type}/guidance_prompt", "/kb/{type}/guidanceprompt"})
	public String getGuidancePrompt(@PathVariable("type") String type) {
		return this.getCloudKBUtilRuntime().getGuidancePrompt(type);
	}

	@RequestMapping(method = RequestMethod.GET, value = {"/kb/{type}/ls"})
	public Object listFiles(@PathVariable("type") String type, HttpServletRequest request) {
		Map<String, Object> queryParams = RestUtils.queryString2Map(request.getQueryString(), true, KeyNameCaseMode.LOWER);
		return this.getCloudKBUtilRuntime().listFiles(type, queryParams);
	}
	

	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{type}/documents"})
	public Document createDocument(@PathVariable("type") String type, @RequestBody Document document) {
		return this.getCloudKBUtilRuntime().createDocument(type, document);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = {"/kb/{type}/documents/{document_id}"})
	public Document updateDocument(@PathVariable("type") String type, @PathVariable("document_id") String document_id, @RequestBody Document document) {
		return this.getCloudKBUtilRuntime().updateDocument(type, document_id, document);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{type}/documents/{document_id}/save"})
	public Document saveDocument(@PathVariable("type") String type, @PathVariable("document_id") String document_id, @RequestBody Document document) {
		return this.getCloudKBUtilRuntime().saveDocument(type, document_id, document);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/kb/{type}/documents/{document_id}"})
	public Document getDocument(@PathVariable("type") String type, @PathVariable("document_id") String document_id) {
		return this.getCloudKBUtilRuntime().getDocument(type, document_id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = {"/kb/{type}/documents/{document_id}"})
	public Integer deleteDocument(@PathVariable("type") String type, @PathVariable("document_id") String document_id) {
		return this.getCloudKBUtilRuntime().deleteDocument(type, document_id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/kb/{type}/documents/{document_id}/download"})
	public void downloadDocument(@PathVariable("type") String type, @PathVariable("document_id") String document_id, HttpServletRequest request, HttpServletResponse response) {
		this.getCloudKBUtilRuntime().downloadDocument(type, document_id, request, response);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{type}/documents/{document_id}/chunks"})
	public Chunk createChunk(@PathVariable("type") String type, @PathVariable("document_id") String document_id, @RequestBody Chunk chunk) {
		return this.getCloudKBUtilRuntime().createChunk(type, document_id, chunk);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value = {"/kb/{type}/documents/{document_id}/chunks/{chunk_id}"})
	public Chunk updateChunk(@PathVariable("type") String type, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id, @RequestBody Chunk chunk) {
		return this.getCloudKBUtilRuntime().updateChunk(type, document_id, chunk_id, chunk);
	}

	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{type}/documents/{document_id}/chunks/{chunk_id}/save"})
	public Chunk saveChunk(@PathVariable("type") String type, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id, @RequestBody Chunk chunk) {
		return this.getCloudKBUtilRuntime().saveChunk(type, document_id, chunk_id, chunk);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = {"/kb/{type}/documents/{document_id}/chunks/{chunk_id}"})
	public Chunk getChunk(@PathVariable("type") String type, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id) {
		return this.getCloudKBUtilRuntime().getChunk(type, document_id, chunk_id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = {"/kb/{type}/documents/{document_id}/chunks/{chunk_id}"})
	public Integer deleteChunk(@PathVariable("type") String type, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id) {
		return this.getCloudKBUtilRuntime().deleteChunk(type, document_id, chunk_id);
	}
	

	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{type}/documents/{document_id}/chunks/fetch_chunks"})
	public ResponseEntity<Object> fetchChunks(@PathVariable("type") String type, @PathVariable("document_id") String document_id, @RequestBody Map<String, Object> data) {
		Page page = this.getCloudKBUtilRuntime().fetchChunks(type, document_id, data);
		return RestUtils.sendBackPage(page, Map.class);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{type}/fetchchunks", "/kb/{type}/fetch_chunks"})
	public ResponseEntity<Object> fetchChunks(@PathVariable("type") String type, @RequestBody Map params) {
//		if(!AuthenticationUser.isApiuser(AuthenticationUser.getCurrentMust()) && !AuthenticationUser.isSuperuser(AuthenticationUser.getCurrentMust())) {
//			throw new RuntimeException("仅限API用户访问");
//		}
		
		Page page = this.getCloudKBUtilRuntime().fetchChunks(type, params);
		return RestUtils.sendBackPage(page, Map.class);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/kb/fetchkbs", "/kb/fetch_kbs"})
	public ResponseEntity<Object> fetchKBs(@RequestBody Map params) {
//		if(!AuthenticationUser.isApiuser(AuthenticationUser.getCurrentMust()) && !AuthenticationUser.isSuperuser(AuthenticationUser.getCurrentMust())) {
//			throw new RuntimeException("仅限API用户访问");
//		}
		
		Page page = this.getCloudKBUtilRuntime().fetchKBs(params);
		return RestUtils.sendBackPage(page, Map.class);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{type}/fetchchunksbyhistories", "/kb/{type}/fetch_chunks_by_histories"})
	public ResponseEntity<Object> fetchChunksByHistories(@PathVariable("type") String type, @RequestBody Map<String, Object> data) {
		Page page = this.getCloudKBUtilRuntime().fetchChunksByHistories(type, data);
		return RestUtils.sendBackPage(page, Map.class);
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = {"/kb/clusterembeddings", "/kb/cluster_embeddings"})
	public List<Integer> clusterEmbeddings(@RequestBody ClusterEmbeddingsRequest clusterEmbeddingsRequest) {
		return this.getCloudKBUtilRuntime().clusterEmbeddings(clusterEmbeddingsRequest);
	}
}
