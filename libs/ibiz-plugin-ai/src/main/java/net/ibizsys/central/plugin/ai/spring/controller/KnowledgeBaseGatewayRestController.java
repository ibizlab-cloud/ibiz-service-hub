package net.ibizsys.central.plugin.ai.spring.controller;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.RestUtils.KeyNameCaseMode;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

@RestController()
@RequestMapping("")
@ConditionalOnProperty(prefix = "ibiz.servicehub", name = "kbgateway", havingValue = "true", matchIfMissing = true)
public class KnowledgeBaseGatewayRestController {

	private static final Logger logger = LoggerFactory.getLogger(KnowledgeBaseGatewayRestController.class);

	public static final String UTF_8 = "UTF-8";
	
	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/{id}/kb/{kb_ids}/fetchchunks", "/{id}/kb/{kb_ids}/fetch_chunks"})
	public ResponseEntity<Object> fetchChunks(@PathVariable("id") String id, @PathVariable("kb_ids") String kb_ids, @RequestBody Map params) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			Page page = iSysKnowledgeBaseUtilRuntime.fetchChunks(kb_ids, params);
			return RestUtils.sendBackPage(page, Map.class);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = {"/{id}/kb/{kb_ids}/fetchchunksbyhistories", "/{id}/kb/{kb_ids}/fetch_chunks_by_histories"})
	public ResponseEntity<Object> fetchChunksByHistories(@PathVariable("id") String id, @PathVariable("kb_ids") String kb_ids, @RequestBody Map params) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			Page page = iSysKnowledgeBaseUtilRuntime.fetchChunksByHistories(kb_ids, params);
			return RestUtils.sendBackPage(page, Map.class);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/{id}/kb/{kb_id}/ls"})
	public Object listFiles(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, HttpServletRequest request) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			Map<String, Object> queryParams = RestUtils.queryString2Map(request.getQueryString(), true, KeyNameCaseMode.LOWER);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.listFiles(kb_id, queryParams);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = {"/{id}/kb/{kb_id}/documents"})
	public Document createDocument(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @RequestBody Document document) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.createDocument(kb_id, document);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = {"/{id}/kb/{kb_id}/documents/{document_id}"})
	public Document updateDocument(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @PathVariable("document_id") String document_id, @RequestBody Document document) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.updateDocument(kb_id, document_id, document);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/{id}/kb/{kb_id}/documents/{document_id}/save"})
	public Document saveDocument(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @PathVariable("document_id") String document_id, @RequestBody Document document) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.saveDocument(kb_id, document_id, document);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/{id}/kb/{kb_id}/documents/{document_id}"})
	public Document getDocument(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @PathVariable("document_id") String document_id) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.getDocument(kb_id, document_id);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = {"/{id}/kb/{kb_id}/documents/{document_id}"})
	public Integer deleteDocument(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @PathVariable("document_id") String document_id) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.deleteDocument(kb_id, document_id);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/{id}/kb/{kb_id}/documents/{document_id}/download"})
	public void downloadDocument(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @PathVariable("document_id") String document_id, HttpServletRequest request, HttpServletResponse response) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			iSysKnowledgeBaseUtilRuntime.downloadDocument(kb_id, document_id, request, response);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = {"/{id}/kb/{kb_id}/documents/{document_id}/chunks"})
	public Chunk createChunk(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @PathVariable("document_id") String document_id, @RequestBody Chunk chunk) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.createChunk(kb_id, document_id, chunk);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value = {"/{id}/kb/{kb_id}/documents/{document_id}/chunks/{chunk_id}"})
	public Chunk updateChunk(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id, @RequestBody Chunk chunk) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.updateChunk(kb_id, document_id, chunk_id, chunk);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/{id}/kb/{kb_id}/documents/{document_id}/chunks/{chunk_id}/save"})
	public Chunk saveChunk(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id, @RequestBody Chunk chunk) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.saveChunk(kb_id, document_id, chunk_id, chunk);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = {"/{id}/kb/{kb_id}/documents/{document_id}/chunks/{chunk_id}"})
	public Chunk getChunk(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.getChunk(kb_id, document_id, chunk_id);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = {"/{id}/kb/{kb_id}/documents/{document_id}/chunks/{chunk_id}"})
	public Integer deleteChunk(@PathVariable("id") String id, @PathVariable("kb_id") String kb_id, @PathVariable("document_id") String document_id, @PathVariable("chunk_id") String chunk_id) {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysKnowledgeBaseUtilRuntime iSysKnowledgeBaseUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysKnowledgeBaseUtilRuntime.class, false);
			return iSysKnowledgeBaseUtilRuntime.deleteChunk(kb_id, document_id, chunk_id);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}
	


}
