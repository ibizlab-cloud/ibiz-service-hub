package net.ibizsys.central.cloud.kb.core.addin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.LogFactory;
import org.apache.http.message.BasicHeader;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.RestUtils.KeyNameCaseMode;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.central.util.PageRequest;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class CloudKBAccessAgent extends KBAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudKBAccessAgent.class);
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private List<String> kb_ids = null;

	@Override
	protected void onInit() throws Exception {
		super.onInit();

		Object value = this.getAgentData().get("kb_ids");
		if(value instanceof String) {
			this.kb_ids = Collections.unmodifiableList(Arrays.asList(value.toString().split("[,]")));
		}
		
		if(ObjectUtils.isEmpty(this.kb_ids)) {
			throw new Exception("未指定资料库集合");
		}
	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}

	@Override
	public String getName() {
		return ICloudKBUtilRuntime.KBPLATFORM_CLOUD;
	}

	protected List<String> getKBIds() {
		return this.kb_ids;
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if(this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
	
	@Override
	protected Page<Chunk> onFetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {

		String strServerUrl = String.format("%1$s/%2$s/fetch_chunks", this.getAgentData().getServiceUrl(), StringUtils.collectionToDelimitedString(getKBIds(), ","));
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		
		List contentList = new ArrayList<>();
		IWebClientRep<String> rep = iWebClient.post(strServerUrl, null, headers, null, iChunkSearchContext, null, String.class, null);
		if(!ObjectUtils.isEmpty(rep.getBody())) {
			List<?> list = WebClientBase.MAPPER.readValue(rep.getBody(), List.class);
			if(!ObjectUtils.isEmpty(list)) {
				for(Object objItem: list) {
					Chunk dto = WebClientBase.MAPPER.convertValue(objItem, Chunk.class);
					contentList.add(dto);
				}
			}
		}
		
		int nTotal = DataTypeUtils.getIntegerValue(rep.getHeader("x-total"), 0);
		int nSize = DataTypeUtils.getIntegerValue(rep.getHeader("x-per-page"), 0);
		int nPage = DataTypeUtils.getIntegerValue(rep.getHeader("x-page"), 0);
		
		PageImpl pageImpl = new PageImpl(contentList, PageRequest.of(nPage, nSize, 0), nTotal);
		Object metaData = rep.getHeader("x-metadata");
		if(!ObjectUtils.isEmpty(metaData)) {
			Map<String, Object> map = JsonUtils.asMap(new String(Base64.getDecoder().decode((String)metaData), "utf-8"));
			pageImpl.getMetadataIf().putAll(map);
		}
		return pageImpl;
	}
	
	@Override
	protected Page<Chunk> onFetchChunksByHistories(IChunkSearchContext iChunkSearchContext) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/fetch_chunks_by_histories", this.getAgentData().getServiceUrl(), StringUtils.collectionToDelimitedString(getKBIds(), ","));
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		
		List contentList = new ArrayList<>();
		IWebClientRep<String> rep = iWebClient.post(strServerUrl, null, headers, null, iChunkSearchContext, null, String.class, null);
		if(!ObjectUtils.isEmpty(rep.getBody())) {
			List<?> list = WebClientBase.MAPPER.readValue(rep.getBody(), List.class);
			if(!ObjectUtils.isEmpty(list)) {
				for(Object objItem: list) {
					Chunk dto = WebClientBase.MAPPER.convertValue(objItem, Chunk.class);
					contentList.add(dto);
				}
			}
		}
		
		int nTotal = DataTypeUtils.getIntegerValue(rep.getHeader("x-total"), 0);
		int nSize = DataTypeUtils.getIntegerValue(rep.getHeader("x-per-page"), 0);
		int nPage = DataTypeUtils.getIntegerValue(rep.getHeader("x-page"), 0);
		
		PageImpl pageImpl = new PageImpl(contentList, PageRequest.of(nPage, nSize, 0), nTotal);
		Object metaData = rep.getHeader("x-metadata");
		if(!ObjectUtils.isEmpty(metaData)) {
			Map<String, Object> map = JsonUtils.asMap(new String(Base64.getDecoder().decode((String)metaData), "utf-8"));
			pageImpl.getMetadataIf().putAll(map);
		}
		return pageImpl;
	}
	
	@Override
	protected List onListFiles(Map<String, Object> params) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/ls", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		
		return JsonUtils.as(iWebClient.get(strServerUrl, queryMap, headers, params).getBody(), List.class);
	}

	@Override
	protected Document onCreateDocument(Document document) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		
		return JsonUtils.as(iWebClient.post(strServerUrl, null, headers, document).getBody(), Document.class);
	}

	@Override
	protected Document onUpdateDocument(String document_id, Document document) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		queryMap.put("document_id", document_id);
		
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		
		return JsonUtils.as(iWebClient.put(strServerUrl, queryMap, headers, document).getBody(), Document.class);
	}
	
	@Override
	protected Document onSaveDocument(String document_id, Document document) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}/save", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		queryMap.put("document_id", document_id);
		
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		
		return JsonUtils.as(iWebClient.post(strServerUrl, queryMap, headers, document).getBody(), Document.class);
	}
	
	
	@Override
	protected Document onGetDocument(String document_id) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		queryMap.put("document_id", document_id);
	
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		
		Map<String, Object> queryParams = null;
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if (requestAttributes instanceof ServletRequestAttributes) {
			queryParams = RestUtils.queryString2Map(((ServletRequestAttributes) requestAttributes).getRequest().getQueryString(), true, KeyNameCaseMode.LOWER);
		}
		
		String strBody = iWebClient.get(strServerUrl, queryMap, headers, queryParams).getBody();
		if(ObjectUtils.isEmpty(strBody) || strBody.equals("null")) {
			return null;
		}
		
		return JsonUtils.as(strBody, Document.class);
	}

	@Override
	protected Integer onDeleteDocument(String document_id) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		queryMap.put("document_id", document_id);
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		
		return JsonUtils.as(iWebClient.delete(strServerUrl, queryMap, headers).getBody(), Integer.class);
	}
	
	@Override
	protected void onDownloadDocument(String document_id, HttpServletRequest request, HttpServletResponse response) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}/download", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> uriParams = new LinkedHashMap<String, Object>();
		uriParams.put("document_id", document_id);
		
		Map<String, Object> queryMap = RestUtils.queryString2Map(request.getQueryString(), true, KeyNameCaseMode.LOWER);
		
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		
		iWebClient.download(strServerUrl, uriParams, headers, queryMap, response);
	}

	@Override
	protected Chunk onCreateChunk(String document_id, Chunk chunk) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}/chunks", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		queryMap.put("document_id", document_id);
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		return JsonUtils.as(iWebClient.post(strServerUrl, queryMap, headers, chunk).getBody(), Chunk.class);
	}
	
	@Override
	protected Chunk onUpdateChunk(String document_id, String chunk_id, Chunk chunk) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}/chunks/{chunk_id}", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		queryMap.put("document_id", document_id);
		queryMap.put("chunk_id", chunk_id);
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		return JsonUtils.as(iWebClient.put(strServerUrl, queryMap, headers, chunk).getBody(), Chunk.class);
	}

	@Override
	protected Chunk onSaveChunk(String document_id, String chunk_id, Chunk chunk) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}/chunks/{chunk_id}/save", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		queryMap.put("document_id", document_id);
		queryMap.put("chunk_id", chunk_id);
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		return JsonUtils.as(iWebClient.post(strServerUrl, queryMap, headers, chunk).getBody(), Chunk.class);
	}
	
	@Override
	protected Chunk onGetChunk(String document_id, String chunk_id) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}/chunks/{chunk_id}", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		queryMap.put("document_id", document_id);
		queryMap.put("chunk_id", chunk_id);
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		return JsonUtils.as(iWebClient.get(strServerUrl, queryMap, headers).getBody(), Chunk.class);
	}

	@Override
	protected Integer onDeleteChunk(String document_id, String chunk_id) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}/chunks/{chunk_id}", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		queryMap.put("document_id", document_id);
		queryMap.put("chunk_id", chunk_id);
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		return JsonUtils.as(iWebClient.delete(strServerUrl, queryMap, headers).getBody(), Integer.class);
	}

	@Override
	protected Page<Chunk> onFetchChunks(String document_id, IChunkSearchContext iChunkSearchContext) throws Throwable {
		String strServerUrl = String.format("%1$s/%2$s/documents/{document_id}/fetch_chunks", this.getAgentData().getServiceUrl(), getKBIds().get(0));
		IWebClient iWebClient = this.isOutsideCloudMode()?this.getSystemRuntime().getDefaultWebClient(): this.getSysCloudClientUtilRuntime().getServiceClient(strServerUrl);
		Map<String, Object> headers = null;
		if(this.isOutsideCloudMode()) {
			headers = new LinkedHashMap<String, Object>();
			headers.put("Authorization", String.format("Bearer %1$s",  this.getAgentData().getAccessToken()));
		}
		
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
		queryMap.put("document_id", document_id);
		
		List contentList = new ArrayList<>();
		IWebClientRep<String> rep = iWebClient.post(strServerUrl, queryMap, headers, null, iChunkSearchContext, null, String.class, null);
		if(!ObjectUtils.isEmpty(rep.getBody())) {
			List<?> list = WebClientBase.MAPPER.readValue(rep.getBody(), List.class);
			if(!ObjectUtils.isEmpty(list)) {
				for(Object objItem: list) {
					Chunk dto = WebClientBase.MAPPER.convertValue(objItem, Chunk.class);
					contentList.add(dto);
				}
			}
		}
		
		int nTotal = DataTypeUtils.getIntegerValue(rep.getHeader("x-total"), 0);
		int nSize = DataTypeUtils.getIntegerValue(rep.getHeader("x-per-page"), 0);
		int nPage = DataTypeUtils.getIntegerValue(rep.getHeader("x-page"), 0);
		
		PageImpl pageImpl = new PageImpl(contentList, PageRequest.of(nPage, nSize, 0), nTotal);
		Object metaData = rep.getHeader("x-metadata");
		if(!ObjectUtils.isEmpty(metaData)) {
			Map<String, Object> map = JsonUtils.asMap(new String(Base64.getDecoder().decode((String)metaData), "utf-8"));
			pageImpl.getMetadataIf().putAll(map);
		}
		return pageImpl;
	}
	
	
	protected boolean isOutsideCloudMode() {
		return false;
	}
	
}
