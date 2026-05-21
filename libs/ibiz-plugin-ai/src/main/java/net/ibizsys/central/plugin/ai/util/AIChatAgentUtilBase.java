package net.ibizsys.central.plugin.ai.util;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.Document;

public abstract class AIChatAgentUtilBase implements IAIChatAgentUtil {

	private IAIChatAgentUtil proxyAIChatAgentUtil = null;
	
	public AIChatAgentUtilBase(IAIChatAgentUtil proxyAIChatAgentUtil) {
		this.proxyAIChatAgentUtil = proxyAIChatAgentUtil;
		
	}
	
	@Override
	public ChatCompletionResult chatCompletion(ChatCompletionRequest chatCompletionRequest, boolean appendSystem, boolean appendHistories, Map<String, Object> params) throws Throwable {
		if(this.proxyAIChatAgentUtil!=null) {
			return this.proxyAIChatAgentUtil.chatCompletion(chatCompletionRequest, appendSystem, appendHistories, params);
		}
		throw new Exception("没有实现");
	}

	@Override
	public Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
		if(this.proxyAIChatAgentUtil!=null) {
			return this.proxyAIChatAgentUtil.fetchChunks(iChunkSearchContext);
		}
		throw new Exception("没有实现");
	}
	
	@Override
	public List<Document> listDocumentsByChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
		if(this.proxyAIChatAgentUtil!=null) {
			return this.proxyAIChatAgentUtil.listDocumentsByChunks(iChunkSearchContext);
		}
		throw new Exception("没有实现");
	}

	@Override
	public void outputStep(String message, String title, Map<String, Object> params) throws Throwable {
		if(this.proxyAIChatAgentUtil!=null) {
			this.proxyAIChatAgentUtil.outputStep(message, title, params);
			return;
		}
		throw new Exception("没有实现");
	}

	@Override
	public void waitForInput(String message, String next, Map<String, Object> params) throws Throwable {
		if(this.proxyAIChatAgentUtil!=null) {
			this.proxyAIChatAgentUtil.waitForInput(message, next, params);
			return;
		}
		throw new Exception("没有实现");
	}

	@Override
	public File downloadDocument(IChunkSearchContext iChunkSearchContext, String documentId, String type, Map<String, Object> params) throws Throwable {
		if(this.proxyAIChatAgentUtil!=null) {
			return this.proxyAIChatAgentUtil.downloadDocument(iChunkSearchContext, documentId, type, params);
		}
		throw new Exception("没有实现");
	}
	
	@Override
	public void outputRaw(String content, boolean append, Map<String, Object> params) throws Throwable {
		if(this.proxyAIChatAgentUtil!=null) {
			this.proxyAIChatAgentUtil.outputRaw(content, append, params);
			return;
		}
		throw new Exception("没有实现");
	}
	
	@Override
	public Object internalRequest(String util, String method, Map<String, Object> body) throws Throwable {
		if(this.proxyAIChatAgentUtil!=null) {
			return this.proxyAIChatAgentUtil.internalRequest(util, method, body);
		}
		throw new Exception("没有实现");
	}

	@Override
	public File downloadOSSFile(String folder, String id, Map<String, Object> params) throws Throwable {
		if(this.proxyAIChatAgentUtil!=null) {
			return this.proxyAIChatAgentUtil.downloadOSSFile(folder, id, params);
		}
		throw new Exception("没有实现");
	}
	
	
}
