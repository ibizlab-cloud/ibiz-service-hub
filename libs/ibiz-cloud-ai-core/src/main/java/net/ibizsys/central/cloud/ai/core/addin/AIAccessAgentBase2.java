package net.ibizsys.central.cloud.ai.core.addin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.domain.Embedding;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * AI 应用代理2（默认提供Embbeding服务）
 * 
 * @author lionlau
 *
 */
public abstract class AIAccessAgentBase2 extends AIAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(AIAccessAgentBase2.class);

	private IWebClient embeddingService = null;

	@Override
	protected void onInit() throws Exception {
		super.onInit();

		if (getEmbeddingService(true) == null) {

			if (StringUtils.hasLength(this.getAgentData().getEmbeddingUrl())) {
				this.prepareEmbeddingService();
			}

		}

	}

	protected IWebClient getEmbeddingService() {
		return this.getEmbeddingService(false);
	}

	protected IWebClient getEmbeddingService(boolean bTryMode) {
		if (this.embeddingService != null || bTryMode) {
			return this.embeddingService;
		}
		throw new SystemRuntimeException(this.getContext().getCloudAIUtilRuntime().getSystemRuntime(), this.getContext().getCloudAIUtilRuntime(), "未指定Embedding服务对象");
	}

	protected void setEmbeddingService(IWebClient embeddingService) {
		this.embeddingService = embeddingService;
	}

	protected void prepareEmbeddingService() throws Exception {

		if (!StringUtils.hasLength(this.getAgentData().getEmbeddingUrl())) {
			throw new Exception("未指定Embedding服务路径");
		}
		IWebClient iWebClient = this.getSystemRuntime().createWebClient(this.getAgentData().getEmbeddingUrl());
		iWebClient.init(this.getSystemRuntime(), this.getAgentData().getEmbeddingUrl(), null);

		this.setEmbeddingService(iWebClient);
	}

	@Override
	protected EmbeddingResult onEmbedding(EmbeddingRequest completionRequest) throws Throwable {

		if (ObjectUtils.isEmpty(completionRequest.getContent())) {
			throw new Exception(String.format("未传入内容"));
		}

		Map<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("content", completionRequest.getContent());
		IWebClientRep<String> rep = this.getEmbeddingService().post("/embeddings", null, body);

		Map ret = JsonUtils.asMap(rep.getBody());

		EmbeddingResult embeddingResult = new EmbeddingResult();

		List<Embedding> embeddingList = new ArrayList<Embedding>();

		List data = (List) ret.get("data");
		if (!ObjectUtils.isEmpty(data)) {
			for (Object item : data) {
				Embedding embedding = JsonUtils.as(item, Embedding.class);
				embeddingList.add(embedding);
			}
		}

		embeddingResult.setData(embeddingList);
		return embeddingResult;
	}

}
