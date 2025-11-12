package net.ibizsys.central.cloud.kb.ragflow.addin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.kb.core.addin.KBAccessAgentBase;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class RagFlowKBAccessAgent extends KBAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(RagFlowKBAccessAgent.class);


	private List<String> dataset_ids = null;

	@Override
	protected void onInit() throws Exception {
		super.onInit();

		Object value = this.getAgentData().get("dataset_ids");
		if(value instanceof String) {
			this.dataset_ids = Collections.unmodifiableList(Arrays.asList(value.toString().split("[,]")));
		}
		
		if(ObjectUtils.isEmpty(this.dataset_ids)) {
			throw new Exception("未指定数据集集合");
		}
	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}

	@Override
	public String getName() {
		return ICloudKBUtilRuntime.KBPLATFORM_RAGFLOW;
	}

	protected List<String> getDataSetIds() {
		return this.dataset_ids;
	}
	
	
	@Override
	protected Page<Chunk> onFetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {

		String strServiceUrl = String.format("%1$s/api/v1/retrieval", this.getAgentData().getServiceUrl());
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

			HttpPost request = new HttpPost(strServiceUrl);
			request.addHeader(new BasicHeader("Authorization", String.format("Bearer %1$s", this.getAgentData().getAccessToken())));

			Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("question", iChunkSearchContext.getQuery());
			body.put("dataset_ids", getDataSetIds());
			body.put("page", iChunkSearchContext.getPageable().getPageNumber() + 1);
			body.put("page_size", iChunkSearchContext.getPageable().getPageSize());
			if(iChunkSearchContext.getSimilarityThreshold()!=null) {
				body.put("similarity_threshold", iChunkSearchContext.getSimilarityThreshold());
			}
			if(iChunkSearchContext.getVectorSimilarityWeight()!=null) {
				body.put("vector_similarity_weight", iChunkSearchContext.getVectorSimilarityWeight());
			}
			
			String strBody = JsonUtils.toString(body);

			StringEntity entity = new StringEntity(strBody, ContentType.create(ContentType.APPLICATION_JSON.getMimeType(), "UTF-8"));
			request.setEntity(entity);
			//
			HttpResponse response = httpClient.execute(request);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 200) {

				HttpEntity responseEntity = response.getEntity();
				String responseBody = EntityUtils.toString(responseEntity);
				
				Map map = JsonUtils.asMap(responseBody);
				
				Map dataMap = null;
				Object data = map.get("data");
				if(data instanceof Map) {
					dataMap = (Map)data;
				}
				
				if(dataMap == null) {
					throw new Exception("返回数据无效");
				}
				
				Object chunks = dataMap.get("chunks");
				List  list = null;
				if(chunks instanceof List) {
					list = (List)chunks;
				}
				
				Object doc_aggs = dataMap.get("doc_aggs");
				Map<String, String> docMap = new HashMap<String, String>();
				if(doc_aggs instanceof List) {
					List docList = (List)doc_aggs;
					for(Object item : docList) {
						Map doc = (Map)item;
						docMap.put(DataTypeUtils.asString(doc.get("doc_id")), DataTypeUtils.asString(doc.get("doc_name")));
					}
				}
				
				List<Chunk> chunkList = new ArrayList<Chunk>();
				if(!ObjectUtils.isEmpty(list)) {
					for(Object item : list) {
						Chunk chunk = JsonUtils.as(item, Chunk.class);
						//放入文档信息
						chunk.setDocId(DataTypeUtils.asString(chunk.get("document_id")));
						chunk.setDocKeyword(DataTypeUtils.asString(chunk.get("document_keyword")));
						chunk.setDocName(docMap.get(chunk.getDocId()));

						chunk.reset("document_id");
						chunk.reset("document_keyword");
						
						chunkList.add(chunk);
					}
				}
				
				int nTotal = DataTypeUtils.asInteger( dataMap.get("total"), 0);
				
				return new PageImpl<Chunk>(chunkList, iChunkSearchContext.getPageable(), nTotal);

			} else {
				throw new Exception(String.format("请求发生异常，%1$s", response.getStatusLine().getStatusCode()));
			}
		}
	}
	
	

	
}
