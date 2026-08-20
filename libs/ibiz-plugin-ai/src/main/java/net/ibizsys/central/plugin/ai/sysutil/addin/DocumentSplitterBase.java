package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vladsch.flexmark.ast.Image;
import com.vladsch.flexmark.ast.Link;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.formatter.Formatter;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.data.MutableDataSet;

import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.RecursiveCharacterTextSplitter;
import net.ibizsys.central.cloud.core.util.TextPreprocessUtils;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.plugin.ai.addin.IDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.ChunkField;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.central.plugin.ai.util.domain.RaptorConfig;
import net.ibizsys.central.plugin.ai.util.domain.RaptorNode;
import net.ibizsys.runtime.util.HtmlUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.MarkdownUtils;
import net.ibizsys.runtime.util.domain.File;

/**
 * 文档分割器对象基类
 * 
 * @author lionlau
 *
 */
public abstract class DocumentSplitterBase extends SysKnowledgeBaseUtilRTAddinBase implements IDocumentSplitter {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DocumentSplitterBase.class);
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;

	public static final TypeReference<List<Chunk>> ChunkListType = new TypeReference<List<Chunk>>() {
	};
	
	public static final String APPDOWNLOADURL = "/ibizutil/download/";

	/**
	 * 解析分隔符配置字符串（逐个字符处理）
	 * 
	 * @param config
	 *            配置字符串，格式如："\n`##`;"
	 * @return 分隔符列表
	 */
	public static List<String> parseDelimiters(String config) {
		List<String> delimiters = new ArrayList<>();

		if (config == null || config.isEmpty()) {
			return delimiters;
		}

		StringBuilder sb = null;
		for (int i = 0; i < config.length(); i++) {
			String strItem = config.substring(i, i + 1);
			if (strItem.equals("`")) {
				if (sb == null) {
					sb = new StringBuilder();
				} else {
					String temp = sb.toString();
					if (StringUtils.hasLength(temp)) {
						delimiters.add(temp);
					}
					sb = null;
				}
				continue;
			}

			if (sb != null) {
				sb.append(strItem);
			} else {
				delimiters.add(strItem);
			}
		}

		if (sb != null) {
			String temp = sb.toString();
			if (StringUtils.hasLength(temp)) {
				delimiters.add(temp);
			}
		}
		return delimiters;
	}

	@Override
	public List<Chunk> split(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		return this.onSplit(documentId, text, chunkMethod, parserConfig);
	}

	protected List<Chunk> onSplit(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		List<Chunk> chunkList = this.doSplitText(documentId, text, chunkMethod, parserConfig);
		if (!ObjectUtils.isEmpty(chunkList)) {
			if (parserConfig.getAutoKeywords() > 0 || parserConfig.getAutoQuestions() > 0 || !ObjectUtils.isEmpty(parserConfig.getTags())) {
				chunkList = this.doChunkExtraction(documentId, chunkList, chunkMethod, parserConfig);
			}
		}

		// 进行向量计算
		if (!ObjectUtils.isEmpty(chunkList)) {
			for (Chunk chunk : chunkList) {
				if (StringUtils.hasLength(chunk.getContent())) {
					Object value = this.getEmbedding(parserConfig.getEmbeddingAgent(), chunk.getContent());
					chunk.set("content_vector", value);
				}
				if (StringUtils.hasLength(chunk.getQuestion())) {
					Object value = this.getEmbedding(parserConfig.getEmbeddingAgent(), chunk.getQuestion());
					chunk.set("question_vector", value);
				}
			}
		}

		// 计算Raptor
		if (!ObjectUtils.isEmpty(chunkList) && parserConfig.getRaptorConfig().isUseRaptor()) {
			chunkList = doRaptorCluster(documentId, chunkList, parserConfig.getRaptorConfig());
		}

		return chunkList;
	}

	protected List<Chunk> doSplitText(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		// 判断是否为MD内容
		Parser parser = Parser.builder().build();
		Document document = parser.parse(text);

		// 第一阶段：收集所有图片节点
		List<Image> imagesToReplace = new ArrayList<>();
		NodeVisitor collector = new NodeVisitor(new VisitHandler<>(Image.class, imagesToReplace::add));
		collector.visit(document);

		List<Link> linksToReplace = new ArrayList<>();
		NodeVisitor collector2 = new NodeVisitor(new VisitHandler<>(Link.class, linksToReplace::add));
		collector2.visit(document);

		for (Link link : linksToReplace) {
			link.unlink();
		}

		MutableDataSet options = new MutableDataSet();
		Formatter renderer = Formatter.builder(options).build();
		String strMarkdownText = renderer.render(document);

		strMarkdownText = strMarkdownText.replaceAll("\\{#[^}]*\\}", "");

		// 去除格式
		String strPlainText = HtmlUtils.toPlainText(MarkdownUtils.toHtml(strMarkdownText));
		if(StringUtils.hasLength(strPlainText)) {
			strPlainText = strPlainText.replaceAll("(\\r?\\n|\\r)+", "\n");
		}
		if(StringUtils.hasLength(strPlainText)) {
			strPlainText = TextPreprocessUtils.normalizePunctuation(strPlainText);
		}

		RecursiveCharacterTextSplitter recursiveCharacterTextSplitter = new RecursiveCharacterTextSplitter(parseDelimiters(parserConfig.getDelimiter()), parserConfig.getChunkTokenNum(), parserConfig.getChunkOverlapNum());
		List<Chunk> chunkList = new ArrayList<Chunk>();
		if(StringUtils.hasLength(strPlainText)) {
			List<String> list = recursiveCharacterTextSplitter.splitText(strPlainText);
			if (!ObjectUtils.isEmpty(list)) {
				for (String strItem : list) {
					Chunk chunk = new Chunk();
					chunk.setContent(strItem);
					chunk.setType(ChunkType.ORIGINAL.getValue());
					chunkList.add(chunk);
				}
			}
		}
		
		ICloudOSSClient iCloudOSSClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDCONFIGID_OSS, ICloudOSSClient.class, true);

		// 进一步获取图片
		for (Image image : imagesToReplace) {
			String altText = image.getText().toString();
			String imageUrl = image.getUrl().toString();

			int nPos = imageUrl.indexOf(APPDOWNLOADURL);
			if (nPos == -1) {
				continue;
			}

			imageUrl = imageUrl.substring(nPos + APPDOWNLOADURL.length());
			String[] items = imageUrl.split("[/]");

			String strImageText = "";
			
			if (items.length == 2) {
				strImageText = iCloudOSSClient.downloadText(items[0], items[1]);
			} else {
				strImageText = iCloudOSSClient.downloadText(items[0]);
			}

			if (!ObjectUtils.isEmpty(strImageText)) {
				strImageText = strImageText.trim();
			}

			if (ObjectUtils.isEmpty(strImageText)) {
				continue;
			}

			strPlainText = HtmlUtils.toPlainText(MarkdownUtils.toHtml(strImageText));
			if (ObjectUtils.isEmpty(strPlainText)) {
				continue;
			}
			
			List<String> list = recursiveCharacterTextSplitter.splitText(strPlainText);
			if (!ObjectUtils.isEmpty(list)) {
				for (String strItem : list) {
					Chunk chunk = new Chunk();
					chunk.setContent(strItem);
					chunk.setType(ChunkType.ORIGINAL.getValue());
					chunkList.add(chunk);
				}
			}
		}

		for (int i = 0; i < chunkList.size(); i++) {
			chunkList.get(i).set(ChunkField.SEQUENCE.name(), i);
		}

		return chunkList;
	}

	protected List<Chunk> doChunkExtraction(Object documentId, List<Chunk> chunkList, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		String strPrompt = this.getChunkExtractionPrompt(parserConfig);
		int nAutoQuestons = parserConfig.getAutoQuestions();
		if (nAutoQuestons < 0) {
			nAutoQuestons = 4;
		}
		int nAutoKeywords = parserConfig.getAutoKeywords();
		if (nAutoKeywords < 0) {
			nAutoKeywords = 4;
		}
		Map<String, String> tags = parserConfig.getTags();
		if (tags == null) {
			tags = new LinkedHashMap<String, String>();
		}

		Map<String, String> params = new LinkedHashMap<String, String>();
		params.put("auto_keywords", String.valueOf(nAutoKeywords));
		params.put("auto_questions", String.valueOf(nAutoQuestons));
		params.put("optional_tags", JsonUtils.toObjectNode(tags).toPrettyString());
		params.put("sub_prompt", parserConfig.getChunkExtractionSubPrompt());

		List<IAction> actionList = new ArrayList<IAction>();

		AtomicInteger finished = new AtomicInteger(0);
		int nTotal = chunkList.size();
		for (int i = 0; i < chunkList.size(); i++) {
			final Chunk finalChunk = chunkList.get(i);
			final Map<String, String> finalParams = new LinkedHashMap<String, String>(params);
			finalParams.put("chunk_content", finalChunk.getContent());
			actionList.add(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					
					if(getContext().shouldCancelDocumentJobs(documentId)) {
						throw new Exception("文档作业已被取消");
					}
					
					String strRealPrompt = getTemplateContent(strPrompt, finalParams);
					ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
					chatCompletionRequest.setMessages(ChatMessagesBuilder.create().xml(strRealPrompt).build());
					
					Map<String, Object> ret = null;
					AtomicInteger error = new AtomicInteger(0);
					while(true) {
						
						if(getContext().shouldCancelDocumentJobs(documentId)) {
							throw new Exception("文档作业已被取消");
						}
						
						try {
							ChatCompletionResult chatCompletionResult = getContext().chatCompletion(parserConfig.getChatAgent(), chatCompletionRequest);
							// chunk.setTag(chatCompletionResult.getChoices().get(0).getContent());
							ret = JsonUtils.asMap(AIChatUtils.getJsonContent(AIChatUtils.removeThinkingContent(chatCompletionResult.getChoices().get(0).getContent())));
							if(ObjectUtils.isEmpty(ret)) {
								log.error(String.format("无法从返回内容提取JSON内容\r\n%1$s", chatCompletionResult.getChoices().get(0).getContent()));
								throw new Exception("返回内容格式不正确");
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
					
					String tags = (String) ret.get("tags");
					String keywords = (String) ret.get("keywords");
					List autoquestions = (List) ret.get("autoquestions");
					if (StringUtils.hasLength(tags)) {
						finalChunk.setTag(tags);
					}
					if (StringUtils.hasLength(keywords)) {
						finalChunk.setKeyword(keywords);
					}

					if (!ObjectUtils.isEmpty(autoquestions)) {
						finalChunk.setQuestion(StringUtils.collectionToDelimitedString(autoquestions, "\r\n"));
					}
					
					String user_tag = (String) ret.get("user_tag");
					if (StringUtils.hasLength(user_tag)) {
						finalChunk.set(ChunkField.USER_TAG.name(), user_tag);
					}
					String user_tag2 = (String) ret.get("user_tag2");
					if (StringUtils.hasLength(user_tag2)) {
						finalChunk.set(ChunkField.USER_TAG2.name(), user_tag2);
					}
					String user_tag3 = (String) ret.get("user_tag3");
					if (StringUtils.hasLength(user_tag3)) {
						finalChunk.set(ChunkField.USER_TAG3.name(), user_tag3);
					}
					String user_tag4 = (String) ret.get("user_tag4");
					if (StringUtils.hasLength(user_tag4)) {
						finalChunk.set(ChunkField.USER_TAG4.name(), user_tag4);
					}
					String metadata = (String) ret.get("metadata");
					if (StringUtils.hasLength(metadata)) {
						finalChunk.set(ChunkField.METADATA.name(), metadata);
					}
					
					int nCurCount = finished.addAndGet(1);
					getContext().updateDocumentProgress(documentId, String.format("片段展开[%1$s/%2$s]", nCurCount, nTotal));
					return null;
				}
			});
		}

		this.getContext().threadRunAllOf(actionList, false, null);

		return chunkList;
	}

	protected String getChunkExtractionPrompt(ParserConfig parserConfig) {
		String strChunkExtractionPrompt = parserConfig.getChunkExtractionPrompt();
		if (!StringUtils.hasLength(strChunkExtractionPrompt)) {
			strChunkExtractionPrompt = this.getSystemRuntime().getResourceContent(DocumentSplitterBase.class, "ChunkExtractionPrompt.md", false);
		}
		return strChunkExtractionPrompt;
	}

	@Override
	public List<Chunk> split(Object documentId, net.ibizsys.runtime.util.domain.File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		return this.onSplit(documentId, ossFile, chunkMethod, parserConfig);
	}

	protected List<Chunk> onSplit(Object documentId, net.ibizsys.runtime.util.domain.File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		List<Chunk> chunkList = this.doSplitText(documentId, ossFile, chunkMethod, parserConfig);
		if (!ObjectUtils.isEmpty(chunkList)) {
			if (parserConfig.getAutoKeywords() > 0 || parserConfig.getAutoQuestions() > 0 || !ObjectUtils.isEmpty(parserConfig.getTags())) {
				chunkList = this.doChunkExtraction(documentId, chunkList, chunkMethod, parserConfig);
			}
		}

		// 进行向量计算
		if (!ObjectUtils.isEmpty(chunkList)) {
			for (Chunk chunk : chunkList) {
				if (StringUtils.hasLength(chunk.getContent())) {
					Object value = this.getEmbedding(parserConfig.getEmbeddingAgent(), chunk.getContent());
					chunk.set("content_vector", value);
				}
				if (StringUtils.hasLength(chunk.getQuestion())) {
					Object value = this.getEmbedding(parserConfig.getEmbeddingAgent(), chunk.getQuestion());
					chunk.set("question_vector", value);
				}
			}
		}

		// 计算Raptor
		if (!ObjectUtils.isEmpty(chunkList) && parserConfig.getRaptorConfig().isUseRaptor()) {
			chunkList = doRaptorCluster(documentId, chunkList, parserConfig.getRaptorConfig());
		}

		return chunkList;
	}

	@Override
	public String getOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		return this.getOriginalContent(documentId, ossFile, chunkMethod, parserConfig, null, null);
	}

	@Override
	public String getOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, String type, Map<String, Object> requestParams) throws Throwable {
		return this.onGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, type, requestParams);
	}

	protected String onGetOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, String type, Map<String, Object> requestParams) throws Throwable {
		if(requestParams == null) {
			requestParams = new HashMap<String, Object>();
		}
		if(StringUtils.hasLength(type)) {
			requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE, type);
		}
		return this.onGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
	}
	
	protected String onGetOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		return this.doGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
	}
	
	protected String doGetOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		// 从OSS获取文本
		String strText = "";
		ICloudOSSClient iCloudOSSClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDCONFIGID_OSS, ICloudOSSClient.class, true);
		if(ObjectUtils.isEmpty(requestParams)) {
			if (StringUtils.hasLength(ossFile.getFolder())) {
				strText = iCloudOSSClient.downloadText(ossFile.getFolder(), ossFile.getFileId());
			} else {
				strText = iCloudOSSClient.downloadText(ossFile.getFileId());
			}
		}
		else {
			if (StringUtils.hasLength(ossFile.getFolder())) {
				strText = iCloudOSSClient.downloadText(ossFile.getFolder(), ossFile.getFileId(), requestParams);
			} else {
				strText = iCloudOSSClient.downloadText(ossFile.getFileId(), requestParams);
			}
		}
		
		return strText;
	}
	
	protected List<Chunk> doRaptorCluster(Object documentId, List<Chunk> chunkList, RaptorConfig config) throws Throwable {
		List<RaptorNode> raptorNodeList = new ArrayList<RaptorNode>();
		for (Chunk chunk : chunkList) {
			raptorNodeList.add(new RaptorNode(chunk));
		}
		List<Chunk> chunkList2 = new ArrayList<Chunk>();
		List<List<RaptorNode>> list = this.getContext().getDefaultChunkClusterer().cluster(documentId, raptorNodeList, config);
		Map<Integer, String> parentChunkIdMap = new HashMap<Integer, String>();
		int nLastLevelSize = -1;
		for (int i = list.size() - 1; i >= 0; i--) {
			List<RaptorNode> levelList = list.get(i);
			// 忽略
			if (levelList.size() == nLastLevelSize) {
				continue;
			}

			nLastLevelSize = levelList.size();

			if (i == 0) {
				for (int j = 0; j < chunkList.size(); j++) {
					Chunk chunk = chunkList.get(j);
					String strPId = parentChunkIdMap.get(j);
					if (StringUtils.hasLength(strPId)) {
						chunk.set("pid", strPId);
					}
					chunkList2.add(chunk);
				}
			} else {
				Map<Integer, String> parentChunkIdMap2 = new HashMap<Integer, String>();
				int nIndex = 0;
				for (RaptorNode raptorNode : levelList) {
					// 构建Chunk
					Chunk chunk = new Chunk();
					chunk.setId(KeyValueUtils.genUniqueId());
					chunk.setContent(raptorNode.getText());
					chunk.set("content_vector", raptorNode.getEmbedding());
					chunk.setType(ChunkType.CLUSTER.getValue());
					// 判断是否放入父标识
					if (raptorNode.getSourceIndices().size() != chunkList.size()) {
						for (int sourceId : raptorNode.getSourceIndices()) {
							String strPId = parentChunkIdMap.get(sourceId);
							if (StringUtils.hasLength(strPId)) {
								chunk.set("pid", strPId);
								break;
							}
						}
					}
					for (int sourceId : raptorNode.getSourceIndices()) {
						parentChunkIdMap2.put(sourceId, chunk.getId());
					}
					chunk.set(ChunkField.SEQUENCE.name(), nIndex);
					nIndex++;
					chunkList2.add(chunk);
				}
				// 写入全部
				parentChunkIdMap.putAll(parentChunkIdMap2);
			}
		}
		return chunkList2;
	}

	protected double[] getEmbedding(String strEmbeddingAgent, String strContent) throws Throwable {
		return this.getContext().getEmbedding(strEmbeddingAgent, strContent);
	}

	protected List<Chunk> doSplitText(Object documentId, net.ibizsys.runtime.util.domain.File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		// 判断文件结尾
		String strText = this.getOriginalContent(documentId, ossFile, chunkMethod, parserConfig);

		if (!ObjectUtils.isEmpty(strText)) {
			strText = strText.trim();
		}

		if (ObjectUtils.isEmpty(strText)) {
			return new ArrayList<Chunk>();
		}

		return this.doSplitText(documentId, strText, chunkMethod, parserConfig);
	}

	@Override
	public String getFullText(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		if(requestParams == null) {
			requestParams = new HashMap<String, Object>();
		}
		return this.onGetFullText(documentId, ossFile, chunkMethod, parserConfig, requestParams);
	}
	
	protected String onGetFullText(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		if(!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE)) {
			requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE, ICloudOSSClient.DOWNLOAD_TEXT_TYPE__MD);
		}
		
		String strMarkdownContent = this.doGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
		return this.getMarkdownFullText(strMarkdownContent, false, requestParams);
	}
	
	@Override
	public String getFullText(Object documentId, String text, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		if(requestParams == null) {
			requestParams = new HashMap<String, Object>();
		}
		return this.onGetFullText(documentId, text, chunkMethod, parserConfig, requestParams);
	}
	
	protected String onGetFullText(Object documentId, String text, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		return this.getMarkdownFullText(text, false, requestParams);
	}
	
	@Override
	public String getPageIndex(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		return this.onGetPageIndex(documentId, text, chunkMethod, parserConfig, new HashMap<String, Object>());
	}
	
	protected String onGetPageIndex(Object documentId, String text, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		return JsonUtils.createArrayNode().toPrettyString();
	}
	
	@Override
	public String getPageIndex(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		return this.onGetPageIndex(documentId, ossFile, chunkMethod, parserConfig, new HashMap<String, Object>());
	}
	
	protected String onGetPageIndex(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		return doGetPageIndex(documentId, ossFile, chunkMethod, parserConfig, requestParams);
	}
	
	protected String doGetPageIndex(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		//强行写入文本类型
		requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE, ICloudOSSClient.DOWNLOAD_TEXT_TYPE__PAGEINDEX);
		return this.doGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

	protected String getTemplateContent(String strTemplate, Map<String, String> variables) {
		if (!ObjectUtils.isEmpty(variables)) {
			for (java.util.Map.Entry<String, String> entry : variables.entrySet()) {
				String strContent = ObjectUtils.isEmpty(entry.getValue()) ? "" : entry.getValue();
				strTemplate = strTemplate.replace(String.format("{%1$s}", entry.getKey()), strContent);
			}
		}
		return strTemplate;
	}
	
	protected String downloadOSSText(String strImageUrl, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		int nPos = strImageUrl.indexOf(APPDOWNLOADURL);
		if (nPos == -1) {
			throw new Exception("下载路径无效");
		}

		if(!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE)) {
			if(StringUtils.hasLength(parserConfig.getLayoutRecognize())) {
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE, parserConfig.getLayoutRecognize());
			}
		}
		
		String imageUrl = strImageUrl.substring(nPos + APPDOWNLOADURL.length());
		String[] items = imageUrl.split("[/]");

		ICloudOSSClient iCloudOSSClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDCONFIGID_OSS, ICloudOSSClient.class, true);
		if(ObjectUtils.isEmpty(requestParams)) {
			if (items.length == 2) {
				return iCloudOSSClient.downloadText(items[0], items[1]);
			} else {
				return iCloudOSSClient.downloadText(items[0]);
			}
		}
		else {
			if (items.length == 2) {
				return iCloudOSSClient.downloadText(items[0], items[1], requestParams);
			} else {
				return iCloudOSSClient.downloadText(items[0], requestParams);
			}
		}
				
	}
	
	protected String getMarkdownFullText(String markdownContent, boolean plainText, Map<String, Object> requestParams) {
		return this.getMarkdownFullText(markdownContent, plainText, true, requestParams);
	}
	
	protected String getMarkdownFullText(String markdownContent, boolean plainText, boolean normalizePunctuation, Map<String, Object> requestParams) {
		
		// 判断是否为MD内容
		String strMarkdownText = this.replaceImagesWithText(markdownContent, requestParams);
		strMarkdownText = strMarkdownText.replaceAll("\\{#[^}]*\\}", "");

		// 去除格式
		if(plainText) {
			strMarkdownText = HtmlUtils.toPlainText(MarkdownUtils.toHtml(strMarkdownText));
			if(StringUtils.hasLength(strMarkdownText)) {
				strMarkdownText = strMarkdownText.replaceAll("(\\r?\\n|\\r)+", "\n");
			}
		}
		if(normalizePunctuation) {
			if(StringUtils.hasLength(strMarkdownText)) {
				strMarkdownText = TextPreprocessUtils.normalizePunctuation(strMarkdownText);
			}
		}
		
		return strMarkdownText;
	}
	
	/**
	 * 将Markdown内容中的图片替换为文本
	 * @param markdownContent
	 * @param requestParams
	 * @return
	 */
	protected String replaceImagesWithText(String markdownContent, Map<String, Object> requestParams) {

		if (ObjectUtils.isEmpty(markdownContent)) {
			return markdownContent;
		}

		int nPos = markdownContent.indexOf(APPDOWNLOADURL);
		if (nPos == -1) {
			return markdownContent;
		}

		try {
			StringBuilder sb = new StringBuilder();
			Parser parser = Parser.builder().build();

			com.vladsch.flexmark.util.ast.Document document = parser.parse(markdownContent);

			// 第一阶段：收集所有图片节点
			List<Image> imagesToReplace = new ArrayList<>();
			NodeVisitor collector = new NodeVisitor(new VisitHandler<>(Image.class, imagesToReplace::add));
			collector.visit(document);

			// 第二阶段：逆向遍历并替换，避免位置索引问题
			int nIndex = 0;
			for (int i = imagesToReplace.size() - 1; i >= 0; i--) {
				Image image = imagesToReplace.get(i);
				replaceSingleImage(image, i, sb, nIndex, requestParams);
				nIndex++;
			}

			return renderMarkdown(document);
		} catch (Throwable ex) {
			log.error(String.format("进行图片描述发生异常，%1$s", ex.getMessage()), ex);
		}
		return markdownContent;
	}

	protected void replaceSingleImage(Image image, int nImagePos, StringBuilder sb, int nIndex, Map<String, Object> requestParams) {
		String altText = image.getText().toString();
		String imageUrl = image.getUrl().toString();

		int nPos = imageUrl.indexOf(APPDOWNLOADURL);
		if (nPos == -1) {
			return;
		}

		imageUrl = imageUrl.substring(nPos + APPDOWNLOADURL.length());
		String[] items = imageUrl.split("[/]");

		try {
			String strImageText = "";
			ICloudOSSClient iCloudOSSClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDCONFIGID_OSS, ICloudOSSClient.class, true);
			if(ObjectUtils.isEmpty(requestParams)) {
				if (items.length == 2) {
					strImageText = iCloudOSSClient.downloadText(items[0], items[1]);
				} else {
					strImageText = iCloudOSSClient.downloadText(items[0]);
				}
			}
			else {
				if (items.length == 2) {
					strImageText = iCloudOSSClient.downloadText(items[0], items[1], requestParams);
				} else {
					strImageText = iCloudOSSClient.downloadText(items[0], requestParams);
				}
			}
		
			
			// 生成描述文本
			String description = String.format("```markdown\n下面为多模态图片识别内容：\n%s\n```",
					// altText.isEmpty() ? "无描述" : altText,
					strImageText);

			// 创建文本节点
			Text textNode = new Text(description);

			// 在图片节点前插入文本节点
			image.insertBefore(textNode);
			// 从AST中移除图片节点
			image.unlink();
		} catch (Exception ex) {
			log.error(String.format("多模态识别[%1$s]发生异常，%2$s", imageUrl, ex.getMessage()), ex);
		}
	}

	protected String renderMarkdown(com.vladsch.flexmark.util.ast.Document document) {
		MutableDataSet options = new MutableDataSet();
		Formatter renderer = Formatter.builder(options).build();
		return renderer.render(document);
	}
}
