package net.ibizsys.central.cloud.ai.core.addin;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.Credential;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.cloud.core.util.domain.Embedding;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.cloud.core.util.domain.TextReRankDocument;
import net.ibizsys.central.cloud.core.util.domain.TextReRankRequest;
import net.ibizsys.central.cloud.core.util.domain.TextReRankResult;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class QwenOpenAIAccessAgentBase extends OpenAIAccessAgentBase {

	private Deque<String> textReRankTokenDeque = new ArrayDeque<String>();
	private String strTextReRankServiceUrl = null;
	private String strTextReRankModel = null;
	
	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_QWEN;
	}
	
	@Override
	protected void onInit() throws Exception {
		if(!ObjectUtils.isEmpty(this.getAgentData().getAccessToken())) {
			List list = Arrays.asList(this.getAgentData().getAccessToken().toString().split("[,]"));
			textReRankTokenDeque.addAll(list);
		}
		
		this.strTextReRankServiceUrl = this.getAgentData().getTextReRankUrl();
		if(!StringUtils.hasLength(this.strTextReRankServiceUrl)) {
			this.strTextReRankServiceUrl = String.format("%1$s/v1/services/rerank/text-rerank/text-rerank", this.getAgentData().getServiceUrl());
		}
		
		this.strTextReRankModel = this.getAgentData().getTextReRankModel();
		if(!StringUtils.hasLength(this.strTextReRankModel)) {
			this.strTextReRankModel = "gte-rerank-v2";
		}
		
		super.onInit();
	}
	
	protected String getTextReRankServiceUrl() {
		return this.strTextReRankServiceUrl;
	}
	
	protected String getTextReRankModel() {
		return this.strTextReRankModel;
	}
	
	protected String getTextReRankToken() {
		String strAccessToken = null;
		final Credential credential = this.getCredential();
		if(credential != null) {
			strAccessToken = credential.getAccessToken();
			if(StringUtils.hasLength(strAccessToken)) {
				if(strAccessToken.indexOf("Bearer ") == 0) {
					strAccessToken = strAccessToken.substring(7);
				}
				return strAccessToken;
			}
		}
		
		synchronized (this.textReRankTokenDeque) {
			strAccessToken = this.textReRankTokenDeque.pollFirst();
			if(StringUtils.hasLength(strAccessToken)) {
				this.textReRankTokenDeque.addLast(strAccessToken);
			}	
		}
		return strAccessToken;
	}
	
	
	@Override
	protected void onFillChatCompletionBody(ChatCompletionRequest chatCompletionRequest, Map<String, Object> body) throws Exception {
		final String strThink = this.getAgentData().getThink();
		
		if(StringUtils.hasLength(strThink)) {
			if("true".equalsIgnoreCase(strThink)) {
				body.put("enable_thinking", true);
			}
			else
				if("false".equalsIgnoreCase(strThink)) {
					body.put("enable_thinking", false);
				}
		}
		
		
		if(DataTypeUtils.asBoolean(body.get("enable_thinking"), false)) {
			if(this.getAgentData().getThinkBudget() != null && this.getAgentData().getThinkBudget() > 0) {
				body.put("thinking_budget", this.getAgentData().getThinkBudget());
			}
		}
		
		if(!ObjectUtils.isEmpty(body.get("tools"))) {
			final String strParallelToolCall = this.getAgentData().getParallelToolCall();
			if(StringUtils.hasLength(strParallelToolCall)) {
				if("true".equalsIgnoreCase(strParallelToolCall)) {
					body.put("parallel_tool_calls", true);
				}
				else
					if("false".equalsIgnoreCase(strParallelToolCall)) {
						body.put("parallel_tool_calls", false);
					}
			}
		}
		
		if (chatCompletionRequest.getMaxInputTokens() != null && chatCompletionRequest.getMaxInputTokens() > 0) {
			body.put("max_input_tokens", chatCompletionRequest.getMaxInputTokens());
		} else if (this.getAgentData().getMaxInputTokens() != null && this.getAgentData().getMaxInputTokens() > 0) {
			body.put("max_input_tokens", this.getAgentData().getMaxInputTokens());
		}
		
		
		super.onFillChatCompletionBody(chatCompletionRequest, body);
	}
	
	@Override
	protected TextReRankResult onTextReRank(TextReRankRequest textReRankRequest) throws Throwable {
		String strServiceUrl = getTextReRankServiceUrl();
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

			HttpPost request = new HttpPost(strServiceUrl);
			request.addHeader(new BasicHeader("Authorization", String.format("Bearer %1$s", this.getTextReRankToken())));

			Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("model", this.getTextReRankModel());
			Map<String, Object> input = new LinkedHashMap<String, Object>();
			Map<String, Object> parameters = new LinkedHashMap<String, Object>();
			body.put("input", input);
			body.put("parameters", parameters);
//			
//			
//			
//			"input":{
//		         "query": "什么是文本排序模型",
//		         "documents": [
//		         "文本排序模型广泛用于搜索引擎和推荐系统中，它们根据文本相关性对候选文本进行排序",
//		         "量子计算是计算科学的一个前沿领域",
//		         "预训练语言模型的发展给文本排序模型带来了新的进展"
//		         ]
//		    },
//			
//			"parameters": {
//		        "return_documents": true,
//		        "top_n": 2,
//		        "instruct": "Given a web search query, retrieve relevant passages that answer the query."
//		    }
//			
			
		    input.put("query", textReRankRequest.getQuery());
			List<String> documentList = new ArrayList<String>();
			Map<Integer, Document> documentMap = new HashMap<Integer, Document>();
			for(int i =0;i< textReRankRequest.getDocuments().size(); i++) {
				Document document = textReRankRequest.getDocuments().get(i);
				documentList.add(document.getContent());
				documentMap.put(i, document);
			}
			
			input.put("documents", documentList);
			int nTopN = DataTypeUtils.asInteger(textReRankRequest.getTopN(), 0);
			if(nTopN > 0) {
				parameters.put("top_n", nTopN);
			}
			parameters.put("return_documents", false);
			if(StringUtils.hasLength(textReRankRequest.getInstruct())) {
				parameters.put("instruct", textReRankRequest.getInstruct());
			}
			String strBody = JsonUtils.toString(body);

			StringEntity entity = new StringEntity(strBody, ContentType.create(ContentType.APPLICATION_JSON.getMimeType(), "UTF-8"));
			request.setEntity(entity);
			//
			HttpResponse response = httpClient.execute(request);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 200) {
				/*
				 * {
    "output": {
        "results": [
            {
                "document": {
                    "text": "文本排序模型广泛用于搜索引擎和推荐系统中，它们根据文本相关性对候选文本进行排序"
                },
                "index": 0,
                "relevance_score": 0.9334521178273196
            },
            {
                "document": {
                    "text": "预训练语言模型的发展给文本排序模型带来了新的进展"
                },
                "index": 2,
                "relevance_score": 0.34100082626411193
            }
        ]
    },
    "usage": {
        "total_tokens": 79
    },
    "request_id": "85ba5752-1900-47d2-8896-23f99b13f6e1"
}
				 */
				
				TextReRankResult textReRankResult = new TextReRankResult();
				List<TextReRankDocument> textReRankDocumentList = new ArrayList<TextReRankDocument>();
				textReRankResult.setDocuments(textReRankDocumentList);
				
				HttpEntity responseEntity = response.getEntity();
				String responseBody = EntityUtils.toString(responseEntity);
				Map ret = JsonUtils.asMap(responseBody);
				Map output = (Map)ret.get("output");
				if(!ObjectUtils.isEmpty(output)) {
					List results = (List) output.get("results");
					for(Object item : results) {
						Map result = (Map)item;
						int nIndex = DataTypeUtils.asInteger(result.get("index"), -1);
						if(nIndex >= 0) {
							Document document = documentMap.get(nIndex);
							BigDecimal fRelevanceScore = DataTypeUtils.asBigDecimal(result.get("relevance_score"), null);
							TextReRankDocument textReRankDocument = new TextReRankDocument();
							textReRankDocument.setDocument(document);
							textReRankDocument.setRelevanceScore(fRelevanceScore);
							textReRankDocumentList.add(textReRankDocument);
						}
					}
				}

				return textReRankResult;
			} else {
				throw new Exception(String.format("请求发生异常，%1$s", response.getStatusLine().getStatusCode()));
			}
		}
	}
	
	
	
}
