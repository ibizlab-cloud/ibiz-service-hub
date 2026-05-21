package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.RecursiveCharacterTextSplitter;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.ChunkField;
import net.ibizsys.central.plugin.ai.util.TextPreprocessUtils;
import net.ibizsys.central.plugin.ai.util.domain.PageIndexConfig;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.domain.File;

/**
 * 基于文档目录的文档分割器对象基类
 * @author lionlau
 *
 */
public abstract class PageIndexDocumentSplitterBase extends DocumentSplitterBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PageIndexDocumentSplitterBase.class);
	
	@Override
	protected List<Chunk> onSplit(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		String strOriginalContent = this.getOriginalContent(documentId, ossFile, chunkMethod, parserConfig);
		return this.onSplit(documentId, strOriginalContent, chunkMethod, parserConfig);
	}
	
	protected List<Chunk> getPageChunks(Object documentId, String text, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		//判断传入内容是否json
		if(!StringUtils.hasLength(text)) {
			return Collections.EMPTY_LIST;
		}
		ArrayNode pagesNode = null;
		try {
			ObjectNode pageIndexNode = JsonUtils.toObjectNode(text);
			JsonNode node = pageIndexNode.path("pages");
			if(node.isMissingNode() || !node.isArray()) {
				throw new Exception("未获取[pages]节点");
			}
			pagesNode = (ArrayNode)node;
			return this.getPageChunks(documentId, pagesNode, chunkMethod, parserConfig, requestParams);
		}
		catch (Throwable ex) {
			//内容不是json，转为传统文档
			log.warn(String.format("文档[%1$s]传入内容非pageindex格式，转为常规处理", documentId));
		}
		
		//常规处理，按照800长度分隔
		RecursiveCharacterTextSplitter recursiveCharacterTextSplitter = new RecursiveCharacterTextSplitter(Arrays.asList("\n"), 800, 0);
		List<Chunk> chunkList = new ArrayList<Chunk>();
		List<String> list = recursiveCharacterTextSplitter.splitText(text);
		if (!ObjectUtils.isEmpty(list)) {
			for (String strItem : list) {
				Chunk chunk = new Chunk();
				chunk.setContent(strItem);
				chunkList.add(chunk);
			}
		}
		return chunkList;
	}
	
	protected List<Chunk> getPageChunks(Object documentId, ArrayNode pagesNode, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		List<Chunk> chunkList = new ArrayList<Chunk>();
		for(int i = 0;i<pagesNode.size();i++) {
			JsonNode node = pagesNode.get(i);
			if(!node.isObject()) {
				throw new Exception(String.format("pages[%1$s]节点类型不正确", i));
			}
			
			ObjectNode pageNode = (ObjectNode)node;
			String strImageUrl =JsonUtils.getField(pageNode, "image_url", null);
			if(ObjectUtils.isEmpty(strImageUrl)) {
				throw new Exception(String.format("pages[%1$s]节点未定义属性[%2$s]", i, strImageUrl));
			}
			
			Chunk chunk = new Chunk();
			String strText = this.downloadOSSText(strImageUrl, parserConfig, requestParams);
			chunk.setContent(strText);
			chunkList.add(chunk);
		}
		return chunkList;
	}
	
	
	@Override
	protected List<Chunk> onSplit(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		
		Chunk rootClusterChunk = null;
		List<Chunk> retChunkList = new ArrayList<Chunk>();
		if(parserConfig.getPageIndexConfig().isUsePageIndex()) {
			Map<String, Object> requestParams = new HashMap<String, Object>();
			List<Chunk> pageList = this.getPageChunks(documentId, text, chunkMethod, parserConfig, requestParams);
			
			StringBuilder total = new StringBuilder();
			List<Chunk> chunkList = new ArrayList<Chunk>();
			
			if(!ObjectUtils.isEmpty(pageList)) {
				for(Chunk chunk : pageList) {
					String strText = chunk.getContent();
					if(!StringUtils.hasLength(strText)) {
						continue;
					}
					strText = TextPreprocessUtils.process(strText, parserConfig);
					if(!StringUtils.hasLength(strText)) {
						continue;
					}
					chunk.setContent(strText);
					chunkList.add(chunk);
					if(StringUtils.hasLength(strText)) {
						total.append(strText);
						total.append("\n");
					}
				}
			}
			
			int nContentStart = -1;
			if(this.needTOCValidation(chunkList)) {
				String strTOCValidationPrompt = this.getTOCValidationPrompt(parserConfig.getPageIndexConfig());
				
				boolean bTOC = false;
				
				int nTestTOCSize = Math.min(10, chunkList.size());
				
				for(int i = 0;i<nTestTOCSize;i++) {
					Chunk chunk = chunkList.get(i);
					if(ObjectUtils.isEmpty(chunk.getContent())) {
						continue;
					}
				
					boolean is_toc = false;
					AtomicInteger error = new AtomicInteger(0);
					while(true) {
						try {
							ChatCompletionRequest request = new ChatCompletionRequest();
							request.setMessages(ChatMessagesBuilder.create().system(strTOCValidationPrompt).user(chunk.getContent()).build());
							ChatCompletionResult result = this.getContext().chatCompletion(parserConfig.getPageIndexConfig().getChatAgent(), request);
							String strContent =	result.getChoices().get(0).getContent();
							String strJsonContent = AIChatUtils.getJsonContent(AIChatUtils.removeThinkingContent(strContent));
							ObjectNode objectNode = JsonUtils.toObjectNode(strJsonContent);
							if(!objectNode.get("is_toc").isMissingNode()) {
								is_toc = objectNode.get("is_toc").asBoolean(false);
							}
							break;
						}
						catch (Throwable ex) {
							if(error.incrementAndGet()>=3) {
								throw ex;
							}
							log.error(ex);
						}
					}
					
					
					if(is_toc) {
						bTOC = true;
						continue;
					}
					else {
						if(bTOC) {
							nContentStart = i;
							break;
						}	
						else
							continue;
					}
				}
			}
			
			if(nContentStart == -1) {
				log.debug(String.format("文档内容未包含目录"));
				nContentStart = 0;
			}
			
			Map<Integer, List<Chunk>> chunkListMap = new LinkedHashMap<Integer, List<Chunk>>();
			for(int i = nContentStart;i<chunkList.size();i++) {
				int nGroup = (i - nContentStart)/parserConfig.getPageIndexConfig().getPagesPerIndex();
				List<Chunk> last = chunkListMap.get(nGroup);
				if(last == null) {
					last = new ArrayList<Chunk>();
					//加入上一个补充完整性
					if(i > nContentStart) {
						last.add(chunkList.get(i - 1));
					}
					chunkListMap.put(nGroup, last);
				}
				
				Chunk chunk = chunkList.get(i);
				chunk.set(ChunkField.SEQUENCE.name(), i - nContentStart + 1 );
				
				last.add(chunk);
			}
			
			String strPageIndexerPrompt = this.getPageIndexerPrompt(parserConfig.getPageIndexConfig());
			
			List<IAction> actionList = new ArrayList<IAction>();

			AtomicInteger finished = new AtomicInteger(0);
			
			
			
			List<Chunk> indexChunkList = new ArrayList<Chunk>();
			int nTotal = chunkListMap.size();
			
			for(Integer nIndex : chunkListMap.keySet()) {
				final Integer currentGroupIndex = nIndex; 
				actionList.add(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						
						if(getContext().shouldCancelDocumentJobs(documentId)) {
							throw new Exception("文档作业已被取消");
						}
						
						List<Chunk> list = chunkListMap.get(currentGroupIndex);
						ChatCompletionRequest request = new ChatCompletionRequest();
						ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create().system(strPageIndexerPrompt);
						StringBuilder sb = new StringBuilder();
						for(Chunk chunk : list) {
							if(ObjectUtils.isEmpty(chunk.getContent())) {
								continue;
							}
							sb.append(String.format("# P%1$s\n```markdown\n%2$s\n```\n", chunk.get(ChunkField.SEQUENCE.name()), chunk.getContent()));
						}
						String strContent = sb.toString();
						if(!ObjectUtils.isEmpty(strContent)) {
							chatMessagesBuilder.user(strContent);
							request.setMessages(chatMessagesBuilder.build());
							
							ObjectNode objectNode = null;
							AtomicInteger error = new AtomicInteger(0);
							while(true) {
								
								if(getContext().shouldCancelDocumentJobs(documentId)) {
									throw new Exception("文档作业已被取消");
								}
								
								try {
									ChatCompletionResult result = getContext().chatCompletion(parserConfig.getPageIndexConfig().getChatAgent(), request);
									strContent = result.getChoices().get(0).getContent();
									String strJsonContent = AIChatUtils.getJsonContent(AIChatUtils.removeThinkingContent(strContent));
									objectNode = JsonUtils.toObjectNode(strJsonContent);
									break;
								}
								catch (Throwable ex) {
									if(error.incrementAndGet()>=3) {
										throw ex;
									}
									log.error(ex);
								}
							}
							
							
							Chunk indexChunk = new Chunk();
							indexChunk.setId(KeyValueUtils.genUniqueId());
							indexChunk.set(ChunkField.SEQUENCE.name(), currentGroupIndex);
							indexChunk.setType(ChunkType.INDEX.getValue());
							indexChunk.setContent(objectNode.toPrettyString());
							indexChunk.setName(objectNode.get("document_title").asText());
							
							JsonNode indexNode = objectNode.path("index");
							if(!indexNode.isMissingNode() && indexNode.isArray()) {
								String strSummary = getIndexSummary((ArrayNode)indexNode);
								if(StringUtils.hasLength(strSummary)) {
									Object value = getContext().getEmbedding(parserConfig.getEmbeddingAgent(), strSummary);
									indexChunk.set("content_vector", value);
								}
							}
							
							synchronized (retChunkList) {
								retChunkList.add(indexChunk);
							}
							
							synchronized (indexChunkList) {
								indexChunkList.add(indexChunk);
							}
							
							for(Chunk chunk : list) {
								if(ObjectUtils.isEmpty(chunk.getContent())) {
									continue;
								}
								
								synchronized (retChunkList) {
									if(!retChunkList.contains(chunk)) {
										chunk.setPid(indexChunk.getId());
										chunk.setType(ChunkType.PAGE.getValue());
										retChunkList.add(chunk);
									}
								}
							}
						}
						
						int nCurCount = finished.addAndGet(1);
						getContext().updateDocumentProgress(documentId, String.format("页面索引[%1$s/%2$s]", nCurCount, nTotal));
						return null;
					}
				});
			}

			this.getContext().threadRunAllOf(actionList, false, null);
			
			//对所有的目录进行聚合
			if(!ObjectUtils.isEmpty(indexChunkList)) {
				List<String> summaryList = new ArrayList<String>();
				for(Chunk chunk : indexChunkList) {
					ObjectNode objectNode = JsonUtils.toObjectNode(chunk.getContent());
					ArrayNode indexListNode = (ArrayNode)objectNode.get("index");
					for(int i = 0;i<indexListNode.size();i++) {
						ObjectNode rootNode = (ObjectNode) indexListNode.get(i);
						JsonNode summaryNode = rootNode.path("summary");
						if(summaryNode.isMissingNode()) {
							continue;
						}
						
						String strSummary = summaryNode.asText();
						if(ObjectUtils.isEmpty(strSummary)) {
							continue;
						}
						
						summaryList.add(strSummary);
					}
				}
				
				if(!ObjectUtils.isEmpty(summaryList)) {
					
					StringBuilder sb = new StringBuilder();
					sb.append("将下面的内容总结为不超过500字的文本。\n");
					for(String strSummary : summaryList) {
						sb.append(String.format("- %1$s\n", strSummary));
					}
					ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create().user(sb.toString());
					ChatCompletionRequest request = new ChatCompletionRequest();
					request.setMessages(chatMessagesBuilder.build());
					ChatCompletionResult result = null;
					
					AtomicInteger error = new AtomicInteger(0);
					while(true) {
						try {
							result = getContext().chatCompletion(parserConfig.getChatAgent(), request);
							break;
						}
						catch (Throwable ex) {
							if(error.incrementAndGet()>=3) {
								throw ex;
							}
							log.error(ex);
						}
					}
					
					Chunk clusterChunk = new Chunk();
					clusterChunk.setId(KeyValueUtils.genUniqueId());
					clusterChunk.set(ChunkField.SEQUENCE.name(), 0);
					clusterChunk.setType(ChunkType.CLUSTER.getValue());
					clusterChunk.setContent(result.getChoices().get(0).getContent());
					clusterChunk.set(ChunkField.CONTENT_VECTOR.name(), this.getEmbedding(parserConfig.getEmbeddingAgent(), clusterChunk.getContent()));
				
					retChunkList.add(0, clusterChunk);
					
					rootClusterChunk = clusterChunk;
					
					for(Chunk chunk : indexChunkList) {
						chunk.setPid(clusterChunk.getId());
					}
				}
			}
			
			if(parserConfig.getPageIndexConfig().isPageIndexOnly()) {
				return retChunkList;
			}
			
			//放回文本内容执行后续操作
			text = total.toString();
			
		}
		
		if(StringUtils.hasLength(text)) {
			List<Chunk> list = super.onSplit(documentId, text, chunkMethod, parserConfig);
			if(!ObjectUtils.isEmpty(list)) {
				//判断是否存在聚合根节点
				Chunk raptorRootChunk = null;
				for(Chunk chunk : list) {
					if(ChunkType.CLUSTER.getValue().equals(chunk.getType()) || ObjectUtils.isEmpty(chunk.getPid())) {
						raptorRootChunk = chunk;
						break;
					}
				}
				
				for(Chunk chunk : list) {
					if(raptorRootChunk != null && rootClusterChunk!=null) {
						if(raptorRootChunk == chunk) {
							//忽略
							continue;
						}
						if(raptorRootChunk.getId().equals(chunk.getPid())) {
							//修复父标识
							chunk.setPid(rootClusterChunk.getId());
						}
					}
					retChunkList.add(chunk);
				}
			}
		}
		
		return retChunkList;
	}
	
	protected String getIndexSummary(ArrayNode indexNode) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<indexNode.size();i++) {
			JsonNode node = indexNode.get(i);
			if(!node.isObject()) {
				continue;
			}
			JsonNode summaryNode = node.path("summary");
			if(!summaryNode.isMissingNode() && summaryNode.isTextual()) {
				if(sb.length() > 0) {
					sb.append("\n");
				}
				JsonNode idNode = node.path("id");
				if(!idNode.isMissingNode()) {
					String idText = idNode.asText("");
	                if (StringUtils.hasLength(idText)) {
	                    sb.append(idText).append(" ");
	                }
				}
				sb.append(summaryNode.asText(""));
			}
			JsonNode children = node.path("children");
			if(!children.isMissingNode() && children.isArray()) { 
				String strChildrenSummary = this.getIndexSummary((ArrayNode)children);
				if(StringUtils.hasLength(strChildrenSummary)) {
					if(sb.length() > 0) {
						sb.append("\n");
					}
					sb.append(strChildrenSummary);
				}
			}
		}
		return sb.toString();
	}
	
	protected boolean needTOCValidation(List<Chunk> chunkList) {
		return true;
	}
	
	protected String getTOCValidationPrompt(PageIndexConfig pageIndexConfig) throws Throwable {
		String strPrompt = pageIndexConfig.getTOCValidationPrompt();
		if(StringUtils.hasLength(strPrompt)) {
			return strPrompt;
		}
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(PageIndexDocumentSplitterBase.class, "TOCValidationPrompt.md", false);
	}
	
	protected String getPageIndexerPrompt(PageIndexConfig pageIndexConfig) throws Throwable {
		String strPrompt = pageIndexConfig.getPageIndexerPrompt();
		if(StringUtils.hasLength(strPrompt)) {
			return strPrompt;
		}
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(PageIndexDocumentSplitterBase.class, "PageIndexerPrompt.md", false);
	}
	
	@Override
	protected String onGetOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		if(parserConfig.getPageIndexConfig().isUsePageIndex()) {
			if(!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE)) {
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE, ICloudOSSClient.DOWNLOAD_TEXT_TYPE__PAGEINDEX);
			}
		}
		return super.onGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
	}
	
	@Override
	protected String downloadOSSText(String strImageUrl, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		if(!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE)) {
			if(StringUtils.hasLength(parserConfig.getLayoutRecognize())) {
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE, parserConfig.getLayoutRecognize());
			}
			else {
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE, ICloudOSSClient.DOWNLOAD_TEXT_ENGINE__OCR);
			}
		}
		
		return super.downloadOSSText(strImageUrl, parserConfig, requestParams);
	}
}
