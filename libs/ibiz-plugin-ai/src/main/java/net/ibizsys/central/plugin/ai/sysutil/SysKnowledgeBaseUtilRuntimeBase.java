package net.ibizsys.central.plugin.ai.sysutil;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudKBClient;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEActionEnum;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEDataSetEnum;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDERuntime;
import net.ibizsys.central.cloud.core.dataentity.service.ProxyDERuntimeBase;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.RecursiveCharacterTextSplitter;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.RestUtils.KeyNameCaseMode;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ClusterEmbeddingsRequest;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.cloud.core.util.domain.TextReRankDocument;
import net.ibizsys.central.cloud.core.util.domain.TextReRankRequest;
import net.ibizsys.central.cloud.core.util.domain.TextReRankResult;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.plugin.ai.addin.IChunkClusterer;
import net.ibizsys.central.plugin.ai.addin.IChunkGraphExtractor;
import net.ibizsys.central.plugin.ai.addin.IChunkRetriever;
import net.ibizsys.central.plugin.ai.addin.IDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.BookDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.ChunksDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.GeneralChunkGraphExtractor;
import net.ibizsys.central.plugin.ai.sysutil.addin.ISysKnowledgeBaseUtilRTAddin;
import net.ibizsys.central.plugin.ai.sysutil.addin.LawsDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.ManualDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.NaiveDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.OneDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.PictureDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.PostgreSQLGeneralChunkRetriever;
import net.ibizsys.central.plugin.ai.sysutil.addin.PostgreSQLGraphRAGChunkRetriever;
import net.ibizsys.central.plugin.ai.sysutil.addin.PresentationDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.QADocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.RaptorChunkClusterer;
import net.ibizsys.central.plugin.ai.sysutil.addin.RawChunksDocumentSplitter;
import net.ibizsys.central.plugin.ai.sysutil.addin.TableDocumentSplitter;
import net.ibizsys.central.plugin.ai.util.domain.Graph;
import net.ibizsys.central.plugin.ai.util.domain.GraphEdge;
import net.ibizsys.central.plugin.ai.util.domain.GraphNode;
import net.ibizsys.central.plugin.ai.util.domain.GraphRAGConfig;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.central.util.expression.ExpressionUtils;
import net.ibizsys.model.PSModelEnums.DEActionLogicAttachMode;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.HtmlUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.MarkdownUtils;

/**
 * 系统知识库功能组件运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysKnowledgeBaseUtilRuntimeBase extends SysUtilRuntimeBase implements ISysKnowledgeBaseUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysKnowledgeBaseUtilRuntimeBase.class);
	public final static String KNOWLEDGEBASEUTIL_TIMERTASK = "KNOWLEDGEBASEUTIL_TIMERTASK";
	public static final TypeReference<List<ChatMessage>> ChatMessageListType = new TypeReference<List<ChatMessage>>() {
	};

	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "NAIVE", NaiveDocumentSplitter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "QA", QADocumentSplitter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "LAWS", LawsDocumentSplitter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "TABLE", TableDocumentSplitter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "BOOK", BookDocumentSplitter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "MANUAL", ManualDocumentSplitter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "PRESENTATION", PresentationDocumentSplitter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "PICTURE", PictureDocumentSplitter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "ONE", OneDocumentSplitter.class);
		
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "CHUNKS", ChunksDocumentSplitter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "RAW_CHUNKS", RawChunksDocumentSplitter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "RAWCHUNKS", RawChunksDocumentSplitter.class);
		
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_SPLITTER_PREFIX + "*", NaiveDocumentSplitter.class);

		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_CLUSTERER_PREFIX + CLUSTERER_DEFAULT, RaptorChunkClusterer.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_GRAPHEXTRACTOR_PREFIX + GRAPHEXTRACTOR_GENERAL, GeneralChunkGraphExtractor.class);
		
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_RETRIEVER_PREFIX + RETRIEVER_GENERAL + ".POSTGRESQL", PostgreSQLGeneralChunkRetriever.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysKnowledgeBaseUtilRTAddin.class, "*:" + ADDIN_RETRIEVER_PREFIX + RETRIEVER_GRAPHRAG + ".POSTGRESQL", PostgreSQLGraphRAGChunkRetriever.class);
	}

	private static class KnowledgeBaseProxyDERuntime extends ProxyDERuntimeBase<KnowledgeBaseField, KnowledgeBaseAction, KnowledgeBaseDataSet> implements IKnowledgeBaseProxyDERuntime {
		public KnowledgeBaseProxyDERuntime(IDataEntityRuntime iDataEntityRuntime) throws Exception {
			super(iDataEntityRuntime, KnowledgeBaseField.class, KnowledgeBaseAction.class, KnowledgeBaseDataSet.class);
		}
	}

	private static class DocumentProxyDERuntime extends ProxyDERuntimeBase<DocumentField, DocumentAction, DocumentDataSet> implements IDocumentProxyDERuntime {
		public DocumentProxyDERuntime(IDataEntityRuntime iDataEntityRuntime) throws Exception {
			super(iDataEntityRuntime, DocumentField.class, DocumentAction.class, DocumentDataSet.class);
		}
	}

	private static class ChunkProxyDERuntime extends ProxyDERuntimeBase<ChunkField, IProxyDEActionEnum, ChunkDataSet> implements IChunkProxyDERuntime {
		public ChunkProxyDERuntime(IDataEntityRuntime iDataEntityRuntime) throws Exception {
			super(iDataEntityRuntime, ChunkField.class, null, ChunkDataSet.class);
		}
	}
	
	private static class TagProxyDERuntime extends ProxyDERuntimeBase<TagField, IProxyDEActionEnum, TagDataSet> implements ITagProxyDERuntime {
		public TagProxyDERuntime(IDataEntityRuntime iDataEntityRuntime) throws Exception {
			super(iDataEntityRuntime, TagField.class, null, TagDataSet.class);
		}
	}
	
	private static class MemberProxyDERuntime extends ProxyDERuntimeBase<MemberField, IProxyDEActionEnum, MemberDataSet> implements IMemberProxyDERuntime {
		public MemberProxyDERuntime(IDataEntityRuntime iDataEntityRuntime) throws Exception {
			super(iDataEntityRuntime, MemberField.class, null, MemberDataSet.class);
		}
	}
	
	
	private static class GraphEntityTypeProxyDERuntime extends ProxyDERuntimeBase<GraphEntityTypeField, IProxyDEActionEnum, GraphEntityTypeDataSet> implements IGraphEntityTypeProxyDERuntime {
		public GraphEntityTypeProxyDERuntime(IDataEntityRuntime iDataEntityRuntime) throws Exception {
			super(iDataEntityRuntime, GraphEntityTypeField.class, null, GraphEntityTypeDataSet.class);
		}
	}
	
	private static class GraphEntityProxyDERuntime extends ProxyDERuntimeBase<GraphEntityField, IProxyDEActionEnum, IProxyDEDataSetEnum> implements IGraphEntityProxyDERuntime {
		public GraphEntityProxyDERuntime(IDataEntityRuntime iDataEntityRuntime) throws Exception {
			super(iDataEntityRuntime, GraphEntityField.class, null, null);
		}
	}
	
	private static class GraphRelationProxyDERuntime extends ProxyDERuntimeBase<GraphRelationField, IProxyDEActionEnum, IProxyDEDataSetEnum> implements IGraphRelationProxyDERuntime {
		public GraphRelationProxyDERuntime(IDataEntityRuntime iDataEntityRuntime) throws Exception {
			super(iDataEntityRuntime, GraphRelationField.class, null, null);
		}
	}
	
	private static class GraphRelationChunkProxyDERuntime extends ProxyDERuntimeBase<GraphRelationChunkField, IProxyDEActionEnum, IProxyDEDataSetEnum> implements IGraphRelationChunkProxyDERuntime {
		public GraphRelationChunkProxyDERuntime(IDataEntityRuntime iDataEntityRuntime) throws Exception {
			super(iDataEntityRuntime, GraphRelationChunkField.class, null, null);
		}
	}
	

	private IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = null;
	private IDocumentProxyDERuntime documentProxyDERuntime = null;
	private IChunkProxyDERuntime chunkProxyDERuntime = null;
	private IGraphEntityTypeProxyDERuntime graphEntityTypeProxyDERuntime = null;
	private ITagProxyDERuntime tagProxyDERuntime = null;
	private IMemberProxyDERuntime memberProxyDERuntime = null;
	private IGraphEntityProxyDERuntime graphEntityProxyDERuntime = null;
	private IGraphRelationProxyDERuntime graphRelationProxyDERuntime = null;
	//private IProxyDERuntime graphEntityChunkProxyDERuntime = null;
	private IGraphRelationChunkProxyDERuntime graphRelationChunkProxyDERuntime = null;

	private Map<String, IPSDEGroupDetail> psDEGroupDetailMap = new HashMap<>();

	// private Map<String, IPSDEField> documentPSDEFieldMap = new
	// LinkedHashMap<String, IPSDEField>();

	// private Map<String, IPSDEField> chunkPSDEFieldMap = new
	// LinkedHashMap<String, IPSDEField>();

	private boolean bRunParseKnowledgeBaseTimer = false;

	private ISysUniStateUtilRuntime iSysUniStateUtilRuntime = null;

	private Map<String, IDocumentSplitter> documentSplitterMap = null;

	private Map<String, List<IDocumentSplitter>> documentSplitterMap2 = new HashMap<String, List<IDocumentSplitter>>();
	
	private Map<String, IChunkClusterer> chunkClustererMap = null;

	private Map<String, List<IChunkClusterer>> chunkClustererMap2 = new HashMap<String, List<IChunkClusterer>>();

	private Map<String, IChunkGraphExtractor> chunkGraphExtractorMap = null;

	private Map<String, List<IChunkGraphExtractor>> chunkGraphExtractorMap2 = new HashMap<String, List<IChunkGraphExtractor>>();
	
	private Map<String, IChunkRetriever> chunkRetrieverMap = null;

	private Map<String, List<IChunkRetriever>> chunkRetrieverMap2 = new HashMap<String, List<IChunkRetriever>>();

	private String strChatAgent = null;
	private String strQueryChatAgent = null;
	private String strEmbeddingAgent = null;
	private String strReRankAgent = null;
	private Integer nEmbeddingDimensions = null;
	private String strAIAgentConfigIdFormat = "";
	private boolean bParseDocument = true;
	private int nRaptorLeafCount = -1;

	private Map<Object, IEntityDTO> knowledgeBaseEntityDTOMap = new LinkedHashMap<Object, IEntityDTO>();
	

	private List<IEntityDTO> processDocumentList = new ArrayList<>();

	private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();

	private RecursiveCharacterTextSplitter chunkNameRecursiveCharacterTextSplitter = new RecursiveCharacterTextSplitter(Arrays.asList("\n", " ", ",", ".", "，", "。"), 100, 0);
	
	private static ThreadLocal<Integer> chunkIndexThreadLocal = new ThreadLocal<Integer>();
	private static ThreadLocal<IChunkSearchContext> chunkSearchContexThreadLocal = new ThreadLocal<IChunkSearchContext>();
	
	@Override
	protected ISysKnowledgeBaseUtilRuntimeContext createModelRuntimeContext() {
		return new SysKnowledgeBaseUtilRuntimeContextBase<ISysKnowledgeBaseUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {

			@Override
			public ChatCompletionResult chatCompletion(String strChatAgent, ChatCompletionRequest chatCompletionRequest) throws Throwable {
				return doChatCompletion(strChatAgent, chatCompletionRequest);
			}

			@Override
			public EmbeddingResult embedding(String strEmbeddingAgent, EmbeddingRequest embeddingRequest) throws Throwable {
				return doEmbedding(strEmbeddingAgent, embeddingRequest);
			}

			@Override
			public TextReRankResult textReRank(String strReRankAgent, TextReRankRequest textReRankRequest) throws Throwable {
				return doTextReRank(strReRankAgent, textReRankRequest);
			}

			@Override
			public Map<String, Object> threadRunAllOf(List<IAction> actions, boolean bIgnoreException, Object env) throws Throwable {
				return getSelf().threadRunAllOf(actions, bIgnoreException, env);
			}

			@Override
			public IChunkClusterer getChunkClusterer(String strType, boolean bTryMode) throws Throwable {
				return getSelf().getChunkClusterer(strType, bTryMode);
			}

			@Override
			public List<Integer> clusterEmbeddings(ClusterEmbeddingsRequest clusterEmbeddingsRequest) throws Throwable {
				return doClusterEmbeddings(clusterEmbeddingsRequest);
			}
			
			@Override
			public IKnowledgeBaseProxyDERuntime getKnowledgeBaseProxyDERuntime(boolean tryMode) throws Exception {
				return getSelf().getKnowledgeBaseProxyDERuntime(tryMode);
			}

			@Override
			public IDocumentProxyDERuntime getDocumentProxyDERuntime(boolean tryMode) throws Exception {
				return getSelf().getDocumentProxyDERuntime(tryMode);
			}

			@Override
			public IChunkProxyDERuntime getChunkProxyDERuntime(boolean tryMode) throws Exception {
				return getSelf().getChunkProxyDERuntime(tryMode);
			}
			
			@Override
			public IGraphEntityProxyDERuntime getGraphEntityProxyDERuntime(boolean tryMode) throws Exception {
				return getSelf().getGraphEntityProxyDERuntime(tryMode);
			}
			
			@Override
			public IGraphRelationProxyDERuntime getGraphRelationProxyDERuntime(boolean tryMode) throws Exception {
				return getSelf().getGraphRelationProxyDERuntime(tryMode);
			}
			
			@Override
			public IEntityDTO getKnowledgeBaseEntityDTO(Object key, boolean tryMode) throws Throwable {
				return getSelf().getKnowledgeBaseEntityDTO(key, tryMode);
			}
			
			@Override
			public ParserConfig getKnowledgeBaseParserConfig(Object key) throws Throwable {
				return getSelf().getKnowledgeBaseParserConfig(key);
			}
			
			@Override
			public void updateDocumentProgress(Object documentId, String progress) throws Throwable {
				getSelf().doUpdateDocumentProgress(documentId, progress);
			}
			
			@Override
			public boolean isThreadRunning() {
				return getSelf().isRunParseKnowledgeBaseTimer();
			}

			@Override
			public String getQueryChatAgent() {
				return getSelf().getQueryChatAgent();
			}
			
			@Override
			public boolean shouldCancelDocumentJobs(Object documentId) {
				return getSelf().shouldCancelDocumentJobs(documentId);
			}
			
		};
	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {

		String strDefaultAgentId = String.format("%1$s-kb--%2$s", this.getSystemRuntime().getDeploySystemId(), this.getPSSysUtil().getCodeName()).toLowerCase();
		String strQueryAgentId = String.format("%1$s-kb--%2$s-query", this.getSystemRuntime().getDeploySystemId(), this.getPSSysUtil().getCodeName()).toLowerCase();

		this.strChatAgent = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".chat.agent", strDefaultAgentId);
		
		this.strEmbeddingAgent = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".embedding.agent", strChatAgent);
		String strEmbeddingDimensions = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".embedding.dimensions", null);
		if(StringUtils.hasLength(strEmbeddingDimensions)) {
			this.nEmbeddingDimensions = Integer.parseInt(strEmbeddingDimensions);
		}
		this.strReRankAgent = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".rerank.agent", strEmbeddingAgent);
		
		this.strAIAgentConfigIdFormat = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".aiagentconfigid", "{system}-ai--{key}");
		
		this.strQueryChatAgent = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".query.agent", strChatAgent);
		if(this.strQueryChatAgent.equals("true")) {
			this.strQueryChatAgent = strQueryAgentId;
		}

		this.bParseDocument = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".runparse", this.bParseDocument);
		
		this.nRaptorLeafCount = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".raptor.leafnum", this.nRaptorLeafCount);
		
		super.onPrepareDefaultSetting();
	}

	protected String getChatAgent() {
		return this.strChatAgent;
	}

	protected String getQueryChatAgent() {
		return this.strQueryChatAgent;
	}
	
	protected String getEmbeddingAgent() {
		return this.strEmbeddingAgent;
	}
	
	protected Integer getEmbeddingDimensions() {
		return this.nEmbeddingDimensions;
	}

	protected String getTextReRankAgent() {
		return this.strReRankAgent;
	}

	@Override
	protected void onInit() throws Exception {
		this.deMethodPluginRuntimeRepo.init(this.getSystemRuntime(), true);
		this.prepareSysUniStateUtilRuntime();

		if (this.getPSSysUtil().getPSSysDEGroup() != null) {
			List<IPSDEGroupDetail> psDEGroupDetailList = this.getPSSysUtil().getPSSysDEGroup().getPSDEGroupDetails();
			if (!ObjectUtils.isEmpty(psDEGroupDetailList)) {
				for (IPSDEGroupDetail iPSDEGroupDetail : psDEGroupDetailList) {
					String strDETag = iPSDEGroupDetail.getCodeName();
					if (ObjectUtils.isEmpty(strDETag)) {
						strDETag = iPSDEGroupDetail.getPSDataEntityMust().getName();
					}
					this.psDEGroupDetailMap.put(strDETag.toUpperCase(), iPSDEGroupDetail);
				}
			}
		}

		if (this.getKnowledgeBaseProxyDERuntime(true) == null) {
			this.prepareKnowledgeBaseProxyDERuntime();
			//this.getKnowledgeBaseProxyDERuntime(false);
		}

		if (this.getDocumentProxyDERuntime(true) == null) {
			this.prepareDocumentProxyDERuntime();
			//this.getDocumentProxyDERuntime(false);
		}

		if (this.getChunkProxyDERuntime(true) == null) {
			this.prepareChunkProxyDERuntime();
			//this.getChunkProxyDERuntime(false);
		}

		if (this.getTagProxyDERuntime(true) == null) {
			this.prepareTagProxyDERuntime();
			//this.getTagProxyDERuntime(false);
		}
		
		if (this.getMemberProxyDERuntime(true) == null) {
			this.prepareMemberProxyDERuntime();
			//this.getMemberProxyDERuntime(true);
		}
		
		if (this.getGraphEntityProxyDERuntime(true) == null) {
			this.prepareGraphEntityProxyDERuntime();
			//this.getGraphEntityProxyDERuntime(false);
		}

//		if (this.getGraphEntityChunkProxyDERuntime(true) == null) {
//			this.prepareGraphEntityChunkProxyDERuntime();
//			this.getGraphEntityChunkProxyDERuntime(false);
//		}

		if (this.getGraphRelationProxyDERuntime(true) == null) {
			this.prepareGraphRelationProxyDERuntime();
			//this.getGraphRelationProxyDERuntime(false);
		}

		if (this.getGraphRelationChunkProxyDERuntime(true) == null) {
			this.prepareGraphRelationChunkProxyDERuntime();
			//this.getGraphRelationChunkProxyDERuntime(false);
		}

		if (this.getGraphEntityTypeProxyDERuntime(true) == null) {
			this.prepareGraphEntityTypeProxyDERuntime();
			//this.getGraphEntityTypeProxyDERuntime(false);
		}
		
		super.onInit();


		prepareConfig();
	}

	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime() throws Exception {
		return getSysUniStateUtilRuntime(false);
	}

	protected ISysUniStateUtilRuntime tryGetSysUniStateUtilRuntime() {
		try {
			return getSysUniStateUtilRuntime(true);
		} catch (Exception ex) {
			return null;
		}
	}

	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime(boolean bTryMode) throws Exception {
		if (this.iSysUniStateUtilRuntime != null || bTryMode) {
			return this.iSysUniStateUtilRuntime;
		}
		throw new Exception("未指定系统统一状态功能组件");
	}

	protected void setSysUniStateUtilRuntime(ISysUniStateUtilRuntime iSysUniStateUtilRuntime) {
		this.iSysUniStateUtilRuntime = iSysUniStateUtilRuntime;
	}

	protected void prepareSysUniStateUtilRuntime() {
		this.setSysUniStateUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, true));
	}



	protected IKnowledgeBaseProxyDERuntime getKnowledgeBaseProxyDERuntime(boolean tryMode) throws Exception {
		if (this.knowledgeBaseProxyDERuntime != null || tryMode) {
			return this.knowledgeBaseProxyDERuntime;
		}
		throw new Exception("未指定知识库实体运行时对象");
	}

	protected void setKnowledgeBaseProxyDERuntime(IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime) {
		this.knowledgeBaseProxyDERuntime = knowledgeBaseProxyDERuntime;
	}

	protected void prepareKnowledgeBaseProxyDERuntime() throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = psDEGroupDetailMap.get(DE_KNOWLEDGE_BASE);
		if (iPSDEGroupDetail == null) {
			//throw new Exception();
			log.warn("未指定知识库实体对象");
			return;
		}

		this.setKnowledgeBaseProxyDERuntime(new KnowledgeBaseProxyDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId())));
	}

	protected IGraphEntityProxyDERuntime getGraphEntityProxyDERuntime(boolean tryMode) throws Exception {
		if (this.graphEntityProxyDERuntime != null || tryMode) {
			return this.graphEntityProxyDERuntime;
		}
		throw new Exception("未指定图实体代理实体运行时对象");
	}

	protected void setGraphEntityProxyDERuntime(IGraphEntityProxyDERuntime graphEntityProxyDERuntime) {
		this.graphEntityProxyDERuntime = graphEntityProxyDERuntime;
	}

	protected void prepareGraphEntityProxyDERuntime() throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = psDEGroupDetailMap.get(DE_GRAPH_ENTITY);
		if (iPSDEGroupDetail == null) {
			//throw new Exception("未指定图实体实体对象");
			log.warn("未指定图实体实体对象");
			return;
		}

		this.setGraphEntityProxyDERuntime(new GraphEntityProxyDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId())));
	}

//	protected IProxyDERuntime getGraphEntityChunkProxyDERuntime(boolean tryMode) throws Exception {
//		if (this.graphEntityChunkProxyDERuntime != null || tryMode) {
//			return this.graphEntityChunkProxyDERuntime;
//		}
//		throw new Exception("未指定图实体片段代理实体运行时对象");
//	}
//
//	protected void setGraphEntityChunkProxyDERuntime(IProxyDERuntime graphEntityChunkProxyDERuntime) {
//		this.graphEntityChunkProxyDERuntime = graphEntityChunkProxyDERuntime;
//	}
//
//	protected void prepareGraphEntityChunkProxyDERuntime() throws Exception {
//		IPSDEGroupDetail iPSDEGroupDetail = psDEGroupDetailMap.get(DE_GRAPH_ENTITY_CHUNK);
//		if (iPSDEGroupDetail == null) {
//			throw new Exception("未指定图实体片段实体对象");
//		}
//
//		this.setGraphEntityChunkProxyDERuntime(new ProxyDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId()), GraphEntityChunkField.class));
//	}
//	
	protected IGraphEntityTypeProxyDERuntime getGraphEntityTypeProxyDERuntime(boolean tryMode) throws Exception {
		if (this.graphEntityTypeProxyDERuntime != null || tryMode) {
			return this.graphEntityTypeProxyDERuntime;
		}
		throw new Exception("未指定图实体类型代理实体运行时对象");
	}

	protected void setGraphEntityTypeProxyDERuntime(IGraphEntityTypeProxyDERuntime graphEntityTypeProxyDERuntime) {
		this.graphEntityTypeProxyDERuntime = graphEntityTypeProxyDERuntime;
	}

	protected void prepareGraphEntityTypeProxyDERuntime() throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = psDEGroupDetailMap.get(DE_GRAPH_ENTITY_TYPE);
		if (iPSDEGroupDetail == null) {
			log.warn("未指定图实体类型实体对象");
			//throw new Exception();
			return;
		}

		this.setGraphEntityTypeProxyDERuntime(new GraphEntityTypeProxyDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId())));
	}
	

	protected IGraphRelationProxyDERuntime getGraphRelationProxyDERuntime(boolean tryMode) throws Exception {
		if (this.graphRelationProxyDERuntime != null || tryMode) {
			return this.graphRelationProxyDERuntime;
		}
		throw new Exception("未指定图实体代理实体运行时对象");
	}

	protected void setGraphRelationProxyDERuntime(IGraphRelationProxyDERuntime graphRelationProxyDERuntime) {
		this.graphRelationProxyDERuntime = graphRelationProxyDERuntime;
	}

	protected void prepareGraphRelationProxyDERuntime() throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = psDEGroupDetailMap.get(DE_GRAPH_RELATION);
		if (iPSDEGroupDetail == null) {
			//throw new Exception("未指定图连接实体对象");
			log.warn("未指定图连接实体对象");
			return;
		}

		this.setGraphRelationProxyDERuntime(new GraphRelationProxyDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId())));
	}

	protected IGraphRelationChunkProxyDERuntime getGraphRelationChunkProxyDERuntime(boolean tryMode) throws Exception {
		if (this.graphRelationChunkProxyDERuntime != null || tryMode) {
			return this.graphRelationChunkProxyDERuntime;
		}
		throw new Exception("未指定图实体片段代理实体运行时对象");
	}

	protected void setGraphRelationChunkProxyDERuntime(IGraphRelationChunkProxyDERuntime graphRelationChunkProxyDERuntime) {
		this.graphRelationChunkProxyDERuntime = graphRelationChunkProxyDERuntime;
	}

	protected void prepareGraphRelationChunkProxyDERuntime() throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = psDEGroupDetailMap.get(DE_GRAPH_RELATION_CHUNK);
		if (iPSDEGroupDetail == null) {
			//throw new Exception("未指定图连接片段实体对象");
			log.warn("未指定图连接片段实体对象");
			return;
		}

		this.setGraphRelationChunkProxyDERuntime(new GraphRelationChunkProxyDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId())));
	}

	protected IDocumentProxyDERuntime getDocumentProxyDERuntime(boolean tryMode) throws Exception {
		if (this.documentProxyDERuntime != null || tryMode) {
			return this.documentProxyDERuntime;
		}
		throw new Exception("未指定代理文档实体运行时对象");
	}

	protected void setDocumentProxyDERuntime(IDocumentProxyDERuntime documentProxyDERuntime) {
		this.documentProxyDERuntime = documentProxyDERuntime;
	}

	protected void prepareDocumentProxyDERuntime() throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = psDEGroupDetailMap.get(DE_DOCUMENT);
		if (iPSDEGroupDetail == null) {
			//throw new Exception("未指定代理文档实体对象");
			log.warn("未指定代理文档实体对象");
			return;
		}

		this.setDocumentProxyDERuntime(new DocumentProxyDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId())));
	}

	protected IChunkProxyDERuntime getChunkProxyDERuntime(boolean tryMode) throws Exception {
		if (this.chunkProxyDERuntime != null || tryMode) {
			return this.chunkProxyDERuntime;
		}
		throw new Exception("未指定片段实体运行时对象");
	}

	protected void setChunkProxyDERuntime(IChunkProxyDERuntime chunkProxyDERuntime) {
		this.chunkProxyDERuntime = chunkProxyDERuntime;
	}

	protected void prepareChunkProxyDERuntime() throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = psDEGroupDetailMap.get(DE_CHUNK);
		if (iPSDEGroupDetail == null) {
			//throw new Exception("未指定片段实体对象");
			log.warn("未指定片段实体对象");
			return;
		}
		this.setChunkProxyDERuntime(new ChunkProxyDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId())));
	}

	protected ITagProxyDERuntime getTagProxyDERuntime(boolean tryMode) throws Exception {
		if (this.tagProxyDERuntime != null || tryMode) {
			return this.tagProxyDERuntime;
		}
		throw new Exception("未指定标记实体运行时对象");
	}

	protected void setTagProxyDERuntime(ITagProxyDERuntime tagProxyDERuntime) {
		this.tagProxyDERuntime = tagProxyDERuntime;
	}

	protected void prepareTagProxyDERuntime() throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = psDEGroupDetailMap.get(DE_TAG);
		if (iPSDEGroupDetail == null) {
			//throw new Exception("未指定标记实体对象");
			log.warn("未指定标记实体对象");
			return;
		}
		this.setTagProxyDERuntime(new TagProxyDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId())));
	}
	
	protected IMemberProxyDERuntime getMemberProxyDERuntime(boolean tryMode) throws Exception {
		if (this.memberProxyDERuntime != null || tryMode) {
			return this.memberProxyDERuntime;
		}
		throw new Exception("未指定成员实体运行时对象");
	}

	protected void setMemberProxyDERuntime(IMemberProxyDERuntime memberProxyDERuntime) {
		this.memberProxyDERuntime = memberProxyDERuntime;
	}

	protected void prepareMemberProxyDERuntime() throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = psDEGroupDetailMap.get(DE_MEMBER);
		if (iPSDEGroupDetail == null) {
			//throw new Exception("未指定成员实体对象");
			return;
		}
		this.setMemberProxyDERuntime(new MemberProxyDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId())));
	}
	
	@Override
	protected void onInstall() throws Exception {
		super.onInstall();

		this.onRegisterDEMethodPluginRuntimes();

		this.documentSplitterMap = this.getDefaultDocumentSplitters();
		this.chunkClustererMap = this.getDefaultChunkClusterers();
		this.chunkGraphExtractorMap = this.getDefaultChunkGraphExtractors();
		this.chunkRetrieverMap = this.getDefaultChunkRetrievers();

		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.getSysUniStateUtilRuntime(true);
		if (iSysUniStateUtilRuntime != null) {
			iSysUniStateUtilRuntime.addLeaderLatchIf(KeyValueUtils.genUniqueId(this.getSystemRuntime().getDeploySystemId(), KNOWLEDGEBASEUTIL_TIMERTASK, this.getFullUniqueTag()));
		}

		//需要准备工作线程池
		if(this.getWorkThreadPoolExecutor(true) == null) {
			prepareWorkThreadPoolExecutor();
		}
		
		//侦听Cloud重置信号
		this.listenReloadSignal();
		//加载配置
		this.localReload();
		
		if(this.bParseDocument) {
			this.bRunParseKnowledgeBaseTimer = true;
			runParseKnowledgeBaseTimer();
		}
		else {
			log.warn(String.format("知识库未启动文档分析定时器"));
		}
		
	}

	

	protected void onRegisterDEMethodPluginRuntimes() throws Exception {
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getKnowledgeBaseProxyDERuntime(false);
		final IDataEntityRuntime knowledgeBaseDERuntime = knowledgeBaseProxyDERuntime.getReal();
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		final IDataEntityRuntime documentDERuntime = documentProxyDERuntime.getReal();
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);
		final IDataEntityRuntime chunkDERuntime = chunkProxyDERuntime.getReal();

		IPSDEAction iPSDEAction = documentProxyDERuntime.getPSDEAction(DocumentAction.CHUNK, true);
		if (iPSDEAction != null) {
			this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(documentDERuntime.getId(), iPSDEAction.getName(), new IDEActionPluginRuntime() {
				@Override
				public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
					return doDocumentChunk(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
				}
			});
		}

		iPSDEAction = documentProxyDERuntime.getPSDEAction(DocumentAction.RECHUNK, true);
		if (iPSDEAction != null) {
			this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(documentDERuntime.getId(), iPSDEAction.getName(), new IDEActionPluginRuntime() {
				@Override
				public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
					return doDocumentRechunk(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
				}
			});
		}

		iPSDEAction = documentProxyDERuntime.getPSDEAction(DocumentAction.REINDEX, true);
		if (iPSDEAction != null) {
			this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(documentDERuntime.getId(), iPSDEAction.getName(), new IDEActionPluginRuntime() {
				@Override
				public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
					return doDocumentReindex(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
				}
			});
		}
		
		iPSDEAction = documentProxyDERuntime.getPSDEAction(DocumentAction.GET_FULL_TEXT, true);
		if (iPSDEAction != null) {
			this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(documentDERuntime.getId(), iPSDEAction.getName(), new IDEActionPluginRuntime() {
				@Override
				public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
					return doDocumentGetFullText(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
				}
			});
		}
		
		iPSDEAction = documentProxyDERuntime.getPSDEAction(DocumentAction.GET_PAGE_INDEX, true);
		if (iPSDEAction != null) {
			this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(documentDERuntime.getId(), iPSDEAction.getName(), new IDEActionPluginRuntime() {
				@Override
				public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
					return doDocumentGetPageIndex(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
				}
			});
		}
		
		
		iPSDEAction = documentProxyDERuntime.getPSDEAction(DocumentAction.PARSE, true);
		if (iPSDEAction != null) {
			this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeIf(documentDERuntime, iPSDEAction.getName(), DEActionLogicAttachMode.BEFORE.value, new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					onDocumentBeforeParse((IEntityDTO) args[0]);
					return null;
				}
			});
		}
		
		this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeIf(documentDERuntime, DEActions.REMOVE, DEActionLogicAttachMode.AFTER.value, new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onDocumentAfterRemove(args[0]);
				return null;
			}
		});
		

		this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeIf(chunkDERuntime, DEActions.CREATE, DEActionLogicAttachMode.BEFORE.value, new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onChunkBeforeCreate((IEntityDTO) args[0]);
				return null;
			}
		});

		this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeIf(chunkDERuntime, DEActions.UPDATE, DEActionLogicAttachMode.BEFORE.value, new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onChunkBeforeUpdate((IEntityDTO) args[0]);
				return null;
			}
		});
		
	
		
		//监控资料库变化
		this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeIf(knowledgeBaseDERuntime, DEActions.CREATE, DEActionLogicAttachMode.AFTER.value, new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				reload();
				return null;
			}
		});

		this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeIf(knowledgeBaseDERuntime, DEActions.UPDATE, DEActionLogicAttachMode.AFTER.value, new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				reload();
				return null;
			}
		});
		
		this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeIf(knowledgeBaseDERuntime, DEActions.REMOVE, DEActionLogicAttachMode.AFTER.value, new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				reload();
				return null;
			}
		});
	}
	
	
	

	protected Object doDocumentChunk(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		throw new Exception("没有实现");
	}

	protected Object doDocumentRechunk(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);

		// 获取文档
		Object keyValue = iDataEntityRuntimeContext.getDataEntityRuntime().getKeyFieldValue((IEntityDTO) args[0]);
		IEntityDTO documentEntityDTO = (IEntityDTO) iDataEntityRuntimeContext.getDataEntityRuntime().get(keyValue);

		// 获取当前的状态
		IPSDEField statusPSDEField = documentProxyDERuntime.getPSDEField(DocumentField.STATUS);
		Object status = documentEntityDTO.get(statusPSDEField.getLowerCaseName());
		if (ObjectUtils.isEmpty(status)) {
			throw new Exception("文档状态无效");
		}

		String statusItem = documentProxyDERuntime.getFieldEnumItem(DocumentField.STATUS, status, false);
		DocumentStatus documentStatus = DocumentStatus.valueOf(statusItem);

		if (documentStatus != DocumentStatus.READY && documentStatus != DocumentStatus.FAILED) {
			throw new Exception("文档状态不正确");
		}
		
		try {
			// 切换至切片中状态
			doUpdateDocumentStatus(documentEntityDTO, DocumentStatus.CHUNKING, null, null);
			parseDocument(documentEntityDTO);
		} catch (Throwable ex) {
			log.error(String.format("文档切片处理发生异常，%1$s", ex.getMessage()), ex);
			try {
				doUpdateDocumentStatus(documentEntityDTO, DocumentStatus.FAILED, null, ex);
			} catch (Throwable ex2) {
				log.error(String.format("更新文档分析失败发生异常，%1$s", ex2.getMessage()), ex2);
			}
		}
		
		this.doUpdateKnowledgeBaseStatus(this.getKnowledgeBaseEntityDTOByDocId(keyValue, false), null);

		return null;
	}

	protected Object doDocumentReindex(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);
		final IGraphEntityTypeProxyDERuntime graphEntityTypeProxyDERuntime = this.getGraphEntityTypeProxyDERuntime(false);
		
		// 获取文档
		Object keyValue = iDataEntityRuntimeContext.getDataEntityRuntime().getKeyFieldValue((IEntityDTO) args[0]);
		IEntityDTO documentEntityDTO = (IEntityDTO) iDataEntityRuntimeContext.getDataEntityRuntime().get(keyValue);

		// 获取当前的状态
		IPSDEField statusPSDEField = documentProxyDERuntime.getPSDEField(DocumentField.STATUS);
		Object status = documentEntityDTO.get(statusPSDEField.getLowerCaseName());
		if (ObjectUtils.isEmpty(status)) {
			throw new Exception("文档状态无效");
		}

		String statusItem = documentProxyDERuntime.getFieldEnumItem(DocumentField.STATUS, status, false);
		DocumentStatus documentStatus = DocumentStatus.valueOf(statusItem);

		if (documentStatus != DocumentStatus.READY && documentStatus != DocumentStatus.FAILED) {
			throw new Exception("文档状态不正确");
		}
					
		try {
			
			String strChunkMethod = this.getDocumentChunkMethod(documentEntityDTO);
			ParserConfig parserConfig =this.getDocumentParserConfig(documentEntityDTO);

			if (ObjectUtils.isEmpty(strChunkMethod)) {
				throw new Exception("未指定知识库切片方式");
			}

			
			// 获取当前文档的切片
			List<Chunk> chunkList = new ArrayList<Chunk>();
			int nTotalChunkSize = 0;
			if(true) {
				IPSDEDataSet iPSDEDataSet = chunkProxyDERuntime.getPSDEDataSet(ChunkDataSet.VALID);
				ISearchContextDTO iSearchContextDTO = chunkProxyDERuntime.getReal().createSearchContext().count(false).all();
				iSearchContextDTO.eq(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getLowerCaseName(), keyValue);
				List<IEntityDTO> list = chunkProxyDERuntime.getReal().selectDataSet(iPSDEDataSet, iSearchContextDTO);
				nTotalChunkSize = list.size();
				// 转为Chunk列表
				for (IEntityDTO chunkEntityDTO : list) {
					Map<String, Object> item = chunkProxyDERuntime.getDataItem(chunkEntityDTO);
					Object type = item.get(ChunkField.TYPE.name());
					if (ObjectUtils.isEmpty(type) || ChunkType.ORIGINAL.name().equalsIgnoreCase(type.toString()) || ChunkType.MANUAL.name().equalsIgnoreCase(type.toString())) {
						Chunk chunk = new Chunk();
						chunk.setId(DataTypeUtils.asString(item.get(FIELD_ID)));
						chunk.setPid(DataTypeUtils.asString(item.get(ChunkField.PID.name())));
						chunk.setContent(DataTypeUtils.asString(item.get(ChunkField.CONTENT.name())));
						chunk.set(ChunkField.SEQUENCE.name(), item.get(ChunkField.SEQUENCE.name()));
						chunk.setDocId(DataTypeUtils.asString(item.get(ChunkField.DOCUMENT_ID.name())));
						chunk.setDocName(DataTypeUtils.asString(item.get(ChunkField.DOCUMENT_NAME.name())));
						chunk.setType(net.ibizsys.central.cloud.core.util.domain.ChunkType.ORIGINAL.getValue());
						chunkList.add(chunk);
					}
				}
			}
			
			if(parserConfig.getGraphRAGConfig().isUseGraphRAG()) {
				IPSDEDataSet iPSDEDataSet = graphEntityTypeProxyDERuntime.getPSDEDataSet(GraphEntityTypeDataSet.VALID, false);
				ISearchContextDTO iSearchContextDTO = graphEntityTypeProxyDERuntime.getReal().createSearchContext().count(false).all();
				List<IEntityDTO> list = graphEntityTypeProxyDERuntime.getReal().selectDataSet(iPSDEDataSet, iSearchContextDTO);
				if (!ObjectUtils.isEmpty(list)) {
					Map<String, String> graphEntityTypeMap = new LinkedHashMap<String, String>();
					for(IEntityDTO graphEntityTypeEntityDTO : list) {
						String graphEntityTypeValue = (String)graphEntityTypeProxyDERuntime.getFieldValue(graphEntityTypeEntityDTO, GraphEntityTypeField.VALUE);
						String graphEntityTypeDescription = (String)graphEntityTypeProxyDERuntime.getFieldValue(graphEntityTypeEntityDTO, GraphEntityTypeField.DESCRIPTION);
						if(ObjectUtils.isEmpty(graphEntityTypeValue) ) {
							continue;
						}
						String strName = graphEntityTypeProxyDERuntime.getReal().getMajorTextIf(graphEntityTypeEntityDTO);
						if(StringUtils.hasLength(graphEntityTypeDescription)) {
							strName+= ", ";
							strName+= graphEntityTypeDescription;
						}
						graphEntityTypeMap.put(graphEntityTypeValue, strName);
					}
					parserConfig.getGraphRAGConfig().setOptionalEntityTypes(graphEntityTypeMap);
				}
			}

			// 切换至切片中状态
			doUpdateDocumentStatus(documentEntityDTO, DocumentStatus.CHUNKING, null, null);

			resetDocumentIndexData(documentEntityDTO);

			//finalConfig.getGraphRAGConfig().setUseGraphRAG(true);

			indexDocument(documentEntityDTO, chunkList, parserConfig);

			doUpdateDocumentStatus(documentEntityDTO, DocumentStatus.READY, String.format("知识片段[%1$s]", nTotalChunkSize), null);
		} catch (Throwable ex) {
			log.error(String.format("文档切片处理发生异常，%1$s", ex.getMessage()), ex);
			try {
				doUpdateDocumentStatus(documentEntityDTO, DocumentStatus.FAILED, null, ex);
			} catch (Throwable ex2) {
				log.error(String.format("更新文档分析失败发生异常，%1$s", ex2.getMessage()), ex2);
			}
		}

		this.doUpdateKnowledgeBaseStatus(this.getKnowledgeBaseEntityDTOByDocId(keyValue, false), null);
		
		return null;
	}
	
	protected Object doDocumentGetFullText(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		Object keyValue = (args[0] instanceof IEntityBase)?documentProxyDERuntime.getReal().getKeyFieldValue((IEntityBase)args[0]): DataTypeUtils.asSimple(args[0]);
		IEntityDTO documentEntityDTO = (IEntityDTO) iDataEntityRuntimeContext.getDataEntityRuntime().get(keyValue);
		return getDocumentContent(documentEntityDTO, ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__FULL);
	}
	
	protected Object getDocumentContent(IEntityDTO documentEntityDTO, String type) throws Throwable {
		
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		Object keyValue = documentProxyDERuntime.getReal().getKeyFieldValue(documentEntityDTO);
		String strChunkMethod = this.getDocumentChunkMethod(documentEntityDTO);
		ParserConfig parserConfig =this.getDocumentParserConfig(documentEntityDTO);
		
		if (!StringUtils.hasLength(strChunkMethod)) {
			throw new Exception("未指定切片方法");
		}
		
		IDocumentSplitter iDocumentSplitter = this.getDocumentSplitter(strChunkMethod, true);
		if (iDocumentSplitter == null) {
			throw new Exception(String.format("无法获取切片器[%1$s]", strChunkMethod));
		}
		
		IPSDEField contentPSDEField = documentProxyDERuntime.getPSDEField(DocumentField.CONTENT, false);
		IPSDEField filePSDEField = documentProxyDERuntime.getPSDEField(DocumentField.FILE, false);
		
		String strContent = documentEntityDTO.getString(contentPSDEField.getLowerCaseName(), null);
		if(StringUtils.hasLength(strContent)) {
			if(ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__FULL.equals(type))
				return iDocumentSplitter.getFullText(keyValue, strContent, strChunkMethod, parserConfig);
			if(ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__PAGEINDEX.equals(type))
				return iDocumentSplitter.getPageIndex(keyValue, strContent, strChunkMethod, parserConfig);
			
			throw new Exception(String.format("未支持的内容类型[%1$s]", type));
		}
		Object file = documentEntityDTO.get(filePSDEField.getLowerCaseName());
		if(ObjectUtils.isEmpty(file)) {
			throw new Exception("文件对象无效");
		}
		JsonNode node = JsonUtils.toJsonNode(file);
		if (node instanceof ArrayNode) {
			ArrayNode arrayNode = (ArrayNode)node;
			if(arrayNode.size()>0) {
				node = arrayNode.get(0);
			}
			else {
				node = null;
			}
		}
		
		if(node == null) {
			throw new Exception("文件对象无效");
		}
		net.ibizsys.runtime.util.domain.File ossFile = JsonUtils.as(node, net.ibizsys.runtime.util.domain.File.class);
		if(ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__FULL.equals(type))
			return iDocumentSplitter.getFullText(keyValue, ossFile, strChunkMethod, parserConfig);
		if(ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__PAGEINDEX.equals(type))
			return iDocumentSplitter.getPageIndex(keyValue, ossFile, strChunkMethod, parserConfig);
		
		return iDocumentSplitter.getOriginalContent(keyValue, ossFile, strChunkMethod, parserConfig, type);
	}
	
	protected Object doDocumentGetPageIndex(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		Object keyValue = (args[0] instanceof IEntityBase)?documentProxyDERuntime.getReal().getKeyFieldValue((IEntityBase)args[0]): DataTypeUtils.asSimple(args[0]);
		IEntityDTO documentEntityDTO = (IEntityDTO) iDataEntityRuntimeContext.getDataEntityRuntime().get(keyValue);
		return this.getDocumentContent(documentEntityDTO, ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__PAGEINDEX);
	}
	
	
	protected void onDocumentBeforeParse(IEntityDTO et) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		Object keyValue = documentProxyDERuntime.getReal().getKeyFieldValue((IEntityDTO) et);
		IEntityDTO documentEntityDTO = (IEntityDTO) documentProxyDERuntime.getReal().get(keyValue);
		//
		IPSDEField contentPSDEField = documentProxyDERuntime.getPSDEField(DocumentField.CONTENT, false);
		IPSDEField filePSDEField = documentProxyDERuntime.getPSDEField(DocumentField.FILE, false);
	
		String strContent = null;
		Object file = null;
		if (contentPSDEField != null) {
			strContent = documentEntityDTO.getString(contentPSDEField.getLowerCaseName(), null);
		}
		if (filePSDEField != null) {
			file = documentEntityDTO.get(filePSDEField.getLowerCaseName());
		}
		
		if(!ObjectUtils.isEmpty(strContent) || file == null) {
			//存在内容或未指定文件对象
			return;
		}
		
		String strChunkMethod = this.getDocumentChunkMethod(documentEntityDTO);
		if (!StringUtils.hasLength(strChunkMethod)) {
			throw new Exception("未指定切片方法");
		}
		IDocumentSplitter iDocumentSplitter = this.getDocumentSplitter(strChunkMethod, true);
		if (iDocumentSplitter == null) {
			throw new Exception(String.format("无法获取切片器[%1$s]", strChunkMethod));
		}
		
		ParserConfig parserConfig = this.getDocumentParserConfig(documentEntityDTO);
		
		JsonNode node = JsonUtils.toJsonNode(file);
		if (node instanceof ArrayNode) {
			ArrayNode arrayNode = (ArrayNode)node;
			if(arrayNode.size()>0) {
				node = arrayNode.get(0);
			}
			else {
				node = null;
			}
		}
		
		if(node == null) {
			throw new Exception("文件对象无效");
		}
		
		net.ibizsys.runtime.util.domain.File ossFile = JsonUtils.as(node, net.ibizsys.runtime.util.domain.File.class);
		String strText = iDocumentSplitter.getOriginalContent(keyValue, ossFile, strChunkMethod, parserConfig);
		et.set("original_content", strText);
	}

	protected void onDocumentAfterRemove(Object documentId) throws Throwable {
		try {
			String strCacheKey = String.format("ibiz-cloud-syskbutil-canceldocjob-%1$s--%2$s-%3$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), documentId);
			this.getSysCacheUtilRuntime(false).set(strCacheKey, "true", 1800);
		}
		catch (Throwable ex) {
			log.error(String.format("设置知识库文档取消作业信号发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected boolean shouldCancelDocumentJobs(Object documentId) {
		try {
			String strCacheKey = String.format("ibiz-cloud-syskbutil-canceldocjob-%1$s--%2$s-%3$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), documentId);
			String strRet = this.getSysCacheUtilRuntime(false).get(strCacheKey);
			return "true".equalsIgnoreCase(strRet);
		}
		catch (Throwable ex) {
			log.error(String.format("获取知识库文档取消作业信号发生异常，%1$s", ex.getMessage()), ex);
		}
		return false;
	}

	protected void onChunkBeforeCreate(IEntityDTO et) throws Throwable {
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);
		IPSDEField contentPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT, true);
		IPSDEField contentVectorPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT_VECTOR, true);
		IPSDEField questionsPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.QUESTIONS, true);
		IPSDEField questionsVectorPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.QUESTIONS_VECTOR, true);
		String strChunkType = (String)chunkProxyDERuntime.getFieldValue(et, ChunkField.TYPE, null);
		if(StringUtils.hasLength(strChunkType)) {
			if(ChunkType.PAGE.value().equals(strChunkType) 
					|| ChunkType.INDEX.value().equals(strChunkType)) {
				return;
			}
		}
		
		if (contentPSDEField != null && contentVectorPSDEField != null) {
			String strContent = et.getString(contentPSDEField.getLowerCaseName(), null);
			if (StringUtils.hasLength(strContent)) {
				if (ObjectUtils.isEmpty(et.get(contentVectorPSDEField.getLowerCaseName()))) {
					String strEmbeddingAgent = this.getDocumentParserConfig(chunkProxyDERuntime.getFieldValue(et, ChunkField.DOCUMENT_ID)).getEmbeddingAgent();
					et.set(contentVectorPSDEField.getLowerCaseName(), this.getEmbedding(strEmbeddingAgent, strContent));
				}
			} else {
				et.set(contentVectorPSDEField.getLowerCaseName(), null);
			}
		}

		if (questionsPSDEField != null && questionsVectorPSDEField != null) {
			String strContent = et.getString(questionsPSDEField.getLowerCaseName(), null);
			if (StringUtils.hasLength(strContent)) {
				if (ObjectUtils.isEmpty(et.get(questionsVectorPSDEField.getLowerCaseName()))) {
					String strEmbeddingAgent = this.getDocumentParserConfig(chunkProxyDERuntime.getFieldValue(et, ChunkField.DOCUMENT_ID)).getEmbeddingAgent();
					et.set(questionsVectorPSDEField.getLowerCaseName(), this.getEmbedding(strEmbeddingAgent, strContent));
				}
			} else {
				et.set(questionsVectorPSDEField.getLowerCaseName(), null);
			}
		}
	}

	protected void onChunkBeforeUpdate(IEntityDTO et) throws Throwable {
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);
		IPSDEField contentPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT, true);
		IPSDEField contentVectorPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT_VECTOR, true);
		IPSDEField questionsPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.QUESTIONS, true);
		IPSDEField questionsVectorPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.QUESTIONS_VECTOR, true);

		Object key = chunkProxyDERuntime.getReal().getKeyFieldValue(et);

		IEntityDTO last = chunkProxyDERuntime.getReal().getLastEntity();
		if (last == null) {
			last = chunkProxyDERuntime.getReal().getSessionEntityIf(key);
		}
		
		String strChunkType = (String)chunkProxyDERuntime.getFieldValue(last, ChunkField.TYPE, null);
		if(StringUtils.hasLength(strChunkType)) {
			if(ChunkType.PAGE.value().equals(strChunkType) 
					|| ChunkType.INDEX.value().equals(strChunkType)) {
				return;
			}
		}
		
		
		
		if (contentPSDEField != null && contentVectorPSDEField != null && et.contains(contentPSDEField.getLowerCaseName())) {
			String strContent = et.getString(contentPSDEField.getLowerCaseName(), null);
			if (StringUtils.hasLength(strContent)) {
				String strLastContent = last.getString(contentPSDEField.getLowerCaseName(), null);
				if (!strContent.equals(strLastContent)) {
					String strEmbeddingAgent = this.getDocumentParserConfig(chunkProxyDERuntime.getFieldValue(last, ChunkField.DOCUMENT_ID)).getEmbeddingAgent();
					et.set(contentVectorPSDEField.getLowerCaseName(), this.getEmbedding(strEmbeddingAgent, strContent));
				} else {
					et.reset(contentVectorPSDEField.getLowerCaseName());
				}
			} else {
				et.set(contentVectorPSDEField.getLowerCaseName(), null);
			}
		}

		if (questionsPSDEField != null && questionsVectorPSDEField != null && et.contains(questionsPSDEField.getLowerCaseName())) {
			String strContent = et.getString(questionsPSDEField.getLowerCaseName(), null);
			if (StringUtils.hasLength(strContent)) {
				String strLastContent = last.getString(questionsPSDEField.getLowerCaseName(), null);
				if (!strContent.equals(strLastContent)) {
					String strEmbeddingAgent = this.getDocumentParserConfig(chunkProxyDERuntime.getFieldValue(last, ChunkField.DOCUMENT_ID)).getEmbeddingAgent();
					et.set(questionsVectorPSDEField.getLowerCaseName(), this.getEmbedding(strEmbeddingAgent, strContent));
				} else {
					et.reset(questionsVectorPSDEField.getLowerCaseName());
				}
			} else {
				et.set(questionsVectorPSDEField.getLowerCaseName(), null);
			}
		}
	}

	protected Map<String, IDocumentSplitter> getDefaultDocumentSplitters() {
		return this.getAddins(IDocumentSplitter.class, ADDIN_SPLITTER_PREFIX);
	}

	protected Map<String, IChunkClusterer> getDefaultChunkClusterers() {
		return this.getAddins(IChunkClusterer.class, ADDIN_CLUSTERER_PREFIX);
	}

	protected Map<String, IChunkGraphExtractor> getDefaultChunkGraphExtractors() {
		return this.getAddins(IChunkGraphExtractor.class, ADDIN_GRAPHEXTRACTOR_PREFIX);
	}
	
	protected Map<String, IChunkRetriever> getDefaultChunkRetrievers() {
		return this.getAddins(IChunkRetriever.class, ADDIN_RETRIEVER_PREFIX);
	}

	protected DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
		return this.deMethodPluginRuntimeRepo;
	}

	@Override
	protected void onReload() throws Throwable {
		this.reloadKnowledgeBaseEntityDTOs();
		super.onReload();
	}
	
	protected void reloadKnowledgeBaseEntityDTOs() throws Throwable {
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getKnowledgeBaseProxyDERuntime(false);
		IPSDEDataSet iPSDEDataSet = knowledgeBaseProxyDERuntime.getPSDEDataSet(KnowledgeBaseDataSet.VALID);
		ISearchContextDTO iSearchContextDTO = knowledgeBaseProxyDERuntime.getReal().createSearchContext().count(false).all();
		List<IEntityDTO> list = knowledgeBaseProxyDERuntime.getReal().selectDataSet(iPSDEDataSet, iSearchContextDTO);
		
		Map<Object, IEntityDTO> knowledgeBaseEntityDTOMap = new LinkedHashMap<Object, IEntityDTO>();
		if(!ObjectUtils.isEmpty(list)) {
			for(IEntityDTO iEntityDTO : list) {
				Object objKey = knowledgeBaseProxyDERuntime.getReal().getKeyFieldValue(iEntityDTO);
				knowledgeBaseEntityDTOMap.put(objKey, iEntityDTO);
			}
		}
		this.knowledgeBaseEntityDTOMap = knowledgeBaseEntityDTOMap;
	}
	
	protected Collection<IEntityDTO> getKnowledgeBaseEntityDTOs(){
		Map<Object, IEntityDTO> knowledgeBaseEntityDTOMap = this.knowledgeBaseEntityDTOMap;
		return Collections.unmodifiableCollection(knowledgeBaseEntityDTOMap.values());
	}
	
	protected IEntityDTO getKnowledgeBaseEntityDTO(Object key, boolean tryMode) throws Throwable {
		Map<Object, IEntityDTO> knowledgeBaseEntityDTOMap = this.knowledgeBaseEntityDTOMap;
		IEntityDTO knowledgeBaseEntityDTO = knowledgeBaseEntityDTOMap.get(key);
		if(knowledgeBaseEntityDTO == null) {
			knowledgeBaseEntityDTO = this.getKnowledgeBaseProxyDERuntime(false).getReal().get(key, tryMode);
		}
		return knowledgeBaseEntityDTO;
	}
	
	protected IEntityDTO getKnowledgeBaseEntityDTOByDocId(Object key, boolean tryMode) throws Throwable {
		IEntityDTO documentEntityDTO = this.getDocumentProxyDERuntime(false).getReal().getSessionEntityIf(key);
		Object kbId = this.getDocumentProxyDERuntime(false).getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		return getKnowledgeBaseEntityDTO(kbId, tryMode);
	}
//	
//	protected String getKnowledgeBaseEmbeddingAgent(IEntityDTO knowledgeBaseEntityDTO) throws Throwable {
//		Object embeddingAgent = this.getKnowledgeBaseProxyDERuntime(false).getFieldValue(knowledgeBaseEntityDTO, KnowledgeBaseField.EMBEDDING_MODEL_ID);
//		if(!ObjectUtils.isEmpty(embeddingAgent)) {
//			return this.getAIAgentConfigId(embeddingAgent);
//		}
//		return null;
//	}
//	
//	protected String getKnowledgeBaseChatAgent(IEntityDTO knowledgeBaseEntityDTO) throws Throwable {
//		Object chatAgent = this.getKnowledgeBaseProxyDERuntime(false).getFieldValue(knowledgeBaseEntityDTO, KnowledgeBaseField.CHAT_MODEL_ID);
//		if(!ObjectUtils.isEmpty(chatAgent)) {
//			return this.getAIAgentConfigId(chatAgent);
//		}
//		return null;
//	}
//	
//	protected String getKnowledgeBaseReRankAgent(IEntityDTO knowledgeBaseEntityDTO) throws Throwable {
//		Object reRankAgent = this.getKnowledgeBaseProxyDERuntime(false).getFieldValue(knowledgeBaseEntityDTO, KnowledgeBaseField.RERANK_MODEL_ID);
//		if(!ObjectUtils.isEmpty(reRankAgent)) {
//			return this.getAIAgentConfigId(reRankAgent);
//		}
//		return null;
//	}
	
	protected String getDocumentChunkMethod(IEntityDTO documentEntityDTO) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getKnowledgeBaseProxyDERuntime(false);
		IEntityDTO knowledgeBaseEntityDTO = this.getKnowledgeBaseEntityDTO(documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID), false);

		boolean bCustomChunk = documentEntityDTO.getBoolean(documentProxyDERuntime.getPSDEField(DocumentField.CUSTOM_CHUNK, false).getLowerCaseName(), false);
		String strChunkMethod = knowledgeBaseEntityDTO.getString(knowledgeBaseProxyDERuntime.getPSDEField(KnowledgeBaseField.CHUNK_METHOD, false).getLowerCaseName(), null);
		if(!bCustomChunk) {
			return strChunkMethod;
		}
		
		String strDocChunkMethod = (String) documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.CHUNK_METHOD);
		if(StringUtils.hasLength(strDocChunkMethod)) {
			return strDocChunkMethod;
		}
		return strChunkMethod;
	}
	
	
	protected ParserConfig getDocumentParserConfig(Object key) throws Throwable {
		IEntityDTO documentEntityDTO = this.getDocumentProxyDERuntime(false).getReal().getSessionEntityIf(key);
		return this.getDocumentParserConfig(documentEntityDTO);
	}
	
	
	protected ParserConfig getDocumentParserConfig(IEntityDTO documentEntityDTO) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		boolean bCustomChunk = documentEntityDTO.getBoolean(documentProxyDERuntime.getPSDEField(DocumentField.CUSTOM_CHUNK, false).getLowerCaseName(), false);
		IEntityDTO knowledgeBaseEntityDTO = this.getKnowledgeBaseEntityDTO(documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID), false);
		ParserConfig parserConfig = this.getKnowledgeBaseParserConfig(knowledgeBaseEntityDTO);
		if(!bCustomChunk) {
			return parserConfig;
		}
				
		Object config2 = documentEntityDTO.get(documentProxyDERuntime.getPSDEField(DocumentField.PARSER_CONFIG).getLowerCaseName());
		if(config2 == null) {
			return parserConfig;
		}
		
		ParserConfig parserConfig2 = (config2 != null)?JsonUtils.as(config2, ParserConfig.class):new ParserConfig();
		parserConfig2.setChatAgent(parserConfig.getChatAgent());
		parserConfig2.setEmbeddingAgent(parserConfig.getEmbeddingAgent());
		parserConfig2.setReRankAgent(parserConfig.getReRankAgent());
		return parserConfig2;
	}
	
	protected ParserConfig getKnowledgeBaseParserConfig(Object key) throws Throwable {
		IEntityDTO knowledgeBaseEntityDTO = null;
		if(key instanceof IEntityDTO) {
			knowledgeBaseEntityDTO = (IEntityDTO)key;
		}
		else {
			knowledgeBaseEntityDTO = this.getKnowledgeBaseEntityDTO(key, false);
		}
		return this.getKnowledgeBaseParserConfig(knowledgeBaseEntityDTO);
	}
	
	protected ParserConfig getKnowledgeBaseParserConfig(IEntityDTO knowledgeBaseEntityDTO) throws Throwable {
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getKnowledgeBaseProxyDERuntime(false);
		Object parserConfig = knowledgeBaseEntityDTO.get(knowledgeBaseProxyDERuntime.getPSDEField(KnowledgeBaseField.PARSER_CONFIG.name(), false).getLowerCaseName());
		ParserConfig config = (parserConfig != null)?JsonUtils.as(parserConfig, ParserConfig.class):new ParserConfig();
		
		Object chatAgent = knowledgeBaseProxyDERuntime.getFieldValue(knowledgeBaseEntityDTO, KnowledgeBaseField.CHAT_MODEL_ID);
		if(!ObjectUtils.isEmpty(chatAgent)) {
			config.setChatAgent(this.getAIAgentConfigId(chatAgent));
		}
		Object embeddingAgent = knowledgeBaseProxyDERuntime.getFieldValue(knowledgeBaseEntityDTO, KnowledgeBaseField.EMBEDDING_MODEL_ID);
		if(!ObjectUtils.isEmpty(embeddingAgent)) {
			config.setEmbeddingAgent(this.getAIAgentConfigId(embeddingAgent));
		}
		Object reRankAgent = knowledgeBaseProxyDERuntime.getFieldValue(knowledgeBaseEntityDTO, KnowledgeBaseField.RERANK_MODEL_ID);
		if(!ObjectUtils.isEmpty(reRankAgent)) {
			config.setReRankAgent(this.getAIAgentConfigId(reRankAgent));
		}
		
		return config;		
	}
	
	@Override
	protected void onUninstall() throws Throwable {

		if (!ObjectUtils.isEmpty(this.documentSplitterMap)) {
			this.documentSplitterMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.documentSplitterMap2)) {
			this.documentSplitterMap2.clear();
		}
		
		if (!ObjectUtils.isEmpty(this.chunkClustererMap)) {
			this.chunkClustererMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.chunkClustererMap2)) {
			this.chunkClustererMap2.clear();
		}
		
		if (!ObjectUtils.isEmpty(this.chunkRetrieverMap)) {
			this.chunkRetrieverMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.chunkRetrieverMap2)) {
			this.chunkRetrieverMap2.clear();
		}

		if (!ObjectUtils.isEmpty(this.chunkGraphExtractorMap)) {
			this.chunkGraphExtractorMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.chunkGraphExtractorMap2)) {
			this.chunkGraphExtractorMap2.clear();
		}

		this.getDEMethodPluginRuntimeRepo().shutdown();

		this.bRunParseKnowledgeBaseTimer = false;
		
		super.onUninstall();
	}

	

	protected void runParseKnowledgeBaseTimer() {
		runParseKnowledgeBaseTimer(false);
	}

	protected final boolean isRunParseKnowledgeBaseTimer() {
		return this.bRunParseKnowledgeBaseTimer;
	}

	protected void runParseKnowledgeBaseTimer(boolean bTimerOnly) {
		if (!this.bRunParseKnowledgeBaseTimer) {
			return;
		}

		if (!bTimerOnly) {
			try {
				onParseKnowledgeBaseTimer();
			} catch (Throwable ex) {
				log.error(String.format("[%1$s]列出未解析文档定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}

		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runParseKnowledgeBaseTimer();
			}
		}, System.currentTimeMillis() + 30000, "ParseKnowledgeBaseTimer_SysKnowledgeBaseUtil_" + this.getFullUniqueTag());
	}

	protected void onParseKnowledgeBaseTimer() throws Throwable {
		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.tryGetSysUniStateUtilRuntime();
		if (iSysUniStateUtilRuntime != null) {
			if (!iSysUniStateUtilRuntime.hasLeadership(KeyValueUtils.genUniqueId(this.getSystemRuntime().getDeploySystemId(), KNOWLEDGEBASEUTIL_TIMERTASK, this.getFullUniqueTag()))) {
				return;
			}
		}

		Collection<IEntityDTO> list = this.getKnowledgeBaseEntityDTOs();
		try {
			this.parseKnowledgeBases();
		} catch (Throwable ex) {
			//log.error(String.format("解析知识库[%1$s][%2$s]发生异常，%3$s", knowledgeBaseProxyDERuntime.getReal().getKeyFieldValue(iEntityDTO), knowledgeBaseProxyDERuntime.getReal().getMajorTextIf(iEntityDTO), ex.getMessage()), ex);
			log.error(String.format("解析知识库发生异常，%1$s", ex.getMessage()), ex);
		}
//		
//		// 循环资料库
//		if (!ObjectUtils.isEmpty(list)) {
//			for (IEntityDTO iEntityDTO : list) {
//				try {
//					this.parseKnowledgeBase(iEntityDTO);
//				} catch (Throwable ex) {
//					log.error(String.format("解析知识库[%1$s][%2$s]发生异常，%3$s", knowledgeBaseProxyDERuntime.getReal().getKeyFieldValue(iEntityDTO), knowledgeBaseProxyDERuntime.getReal().getMajorTextIf(iEntityDTO), ex.getMessage()), ex);
//				}
//			}
//		}
	}

	protected void parseKnowledgeBases() throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getKnowledgeBaseProxyDERuntime(false);

		IPSDEDataSet iPSDEDataSet = documentProxyDERuntime.getPSDEDataSet(DocumentDataSet.UNPARSED.name(), false);
		ISearchContextDTO iSearchContextDTO = documentProxyDERuntime.getReal().createSearchContext().count(false).limit(50);
		//IPSDEField knowledgeBaseIdPSDEField = documentProxyDERuntime.getPSDEField(DocumentField.KNOWLEDGE_BASE_ID.name(), false);
		//iSearchContextDTO.eq(knowledgeBaseIdPSDEField.getLowerCaseName(), knowledgeBaseProxyDERuntime.getReal().getKeyFieldValue(knowledgeBaseEntityDTO));
		List<IEntityDTO> list = documentProxyDERuntime.getReal().selectDataSet(iPSDEDataSet, iSearchContextDTO);
		if (ObjectUtils.isEmpty(list)) {
			return;
		}
		
		IPSDEField contentPSDEField = documentProxyDERuntime.getPSDEField(DocumentField.CONTENT, false);
		IPSDEField filePSDEField = documentProxyDERuntime.getPSDEField(DocumentField.FILE, true);
		IPSDEField kbIdPSDEField = documentProxyDERuntime.getPSDEField(DocumentField.KNOWLEDGE_BASE_ID, false);

		for (IEntityDTO documentEntityDTO : list) {
			String strChunkMethod = this.getDocumentChunkMethod(documentEntityDTO);
			ParserConfig parserConfig = this.getDocumentParserConfig(documentEntityDTO);
			
			String strContent = null;
			Object file = null;
			if (contentPSDEField != null) {
				strContent = documentEntityDTO.getString(contentPSDEField.getLowerCaseName(), null);
			}
			if (filePSDEField != null) {
				file = documentEntityDTO.get(filePSDEField.getLowerCaseName());
			}
			try {
				if (!StringUtils.hasLength(strChunkMethod)) {
					throw new Exception("未指定切片方法");
				}
				
				IDocumentSplitter iDocumentSplitter = this.getDocumentSplitter(strChunkMethod, true);
				if (iDocumentSplitter == null) {
					throw new Exception(String.format("无法获取切片器[%1$s]", strChunkMethod));
				}

				// 切换至切片中状态
				doUpdateDocumentStatus(documentEntityDTO, DocumentStatus.CHUNKING, null, null);

				if (!StringUtils.hasLength(strContent)) {
					if (file != null) {
						// 按文件进行解析
						JsonNode node = JsonUtils.toJsonNode(file);
						if (node instanceof ArrayNode) {
							ArrayNode arrayNode = (ArrayNode) node;
							if (arrayNode.size() == 0) {
								throw new Exception("未指定文件");
							}
							node = arrayNode.get(0);
						}
					} else {
						// 标记解析错误，未指定有效内容
						throw new Exception("未指定有效内容");
					}
				}

				// 放入准备处理队列
				synchronized (this.processDocumentList) {
					this.processDocumentList.add(documentEntityDTO);
				}
			} catch (Throwable ex) {
				log.error(String.format("文档切片处理发生异常，%1$s", ex.getMessage()), ex);
				try {
					doUpdateDocumentStatus(documentEntityDTO, DocumentStatus.FAILED, null, ex);
				} catch (Throwable ex2) {
					log.error(String.format("更新文档分析失败发生异常，%1$s", ex2.getMessage()), ex2);
				}
			}
		}

		Map<String, Object> kbIdMap = new HashMap<String, Object>();
		
		while (true) {
			IEntityDTO documentEntityDTO = null;
			synchronized (this.processDocumentList) {
				if (this.processDocumentList.size() > 0) {
					documentEntityDTO = this.processDocumentList.remove(0);
				}
			}

			if (documentEntityDTO != null) {
				if (isRunParseKnowledgeBaseTimer()) {
					this.parseDocument(documentEntityDTO);
					String strKBId = documentEntityDTO.getString(kbIdPSDEField.getLowerCaseName(), null);
					if(StringUtils.hasLength(strKBId)) {
						kbIdMap.put(strKBId, null);
					}
				} else {
					try {
						doUpdateDocumentStatus(documentEntityDTO, DocumentStatus.FAILED, "调度中断", null);
					} catch (Throwable ex2) {
						log.error(String.format("更新文档分析失败发生异常，%1$s", ex2.getMessage()), ex2);
					}
				}
			} else {
				break;
			}
		}
		
		for(String strKBId : kbIdMap.keySet()) {
			IEntityDTO knowledgeBaseEntityDTO = this.getKnowledgeBaseEntityDTO(strKBId, true);
			if(knowledgeBaseEntityDTO == null) {
				continue;
			}
			try {
				this.doUpdateKnowledgeBaseStatus(knowledgeBaseEntityDTO, null);
			} catch (Throwable ex2) {
				log.error(String.format("更新知识库状态发生异常，%1$s", ex2.getMessage()), ex2);
			}
		}
	}

	protected void parseDocument(IEntityDTO documentEntityDTO) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		final ITagProxyDERuntime tagProxyDERuntime = this.getTagProxyDERuntime(false);
		final IGraphEntityTypeProxyDERuntime graphEntityTypeProxyDERuntime = this.getGraphEntityTypeProxyDERuntime(false);
		IPSDEField contentPSDEField = documentProxyDERuntime.getPSDEField(DocumentField.CONTENT, false);
		IPSDEField filePSDEField = documentProxyDERuntime.getPSDEField(DocumentField.FILE, false);
		IPSDEField tagSetsPSDEField = documentProxyDERuntime.getPSDEField(DocumentField.TAG_SETS, true);

		String strChunkMethod = this.getDocumentChunkMethod(documentEntityDTO);
		ParserConfig parserConfig = this.getDocumentParserConfig(documentEntityDTO);
		Object keyValue = documentProxyDERuntime.getReal().getKeyFieldValue(documentEntityDTO);
		
		String strContent = null;
		Object file = null;
		List<String> tagSetIdList = null;
		if (contentPSDEField != null) {
			strContent = documentEntityDTO.getString(contentPSDEField.getLowerCaseName(), null);
		}
		if (filePSDEField != null) {
			file = documentEntityDTO.get(filePSDEField.getLowerCaseName());
		}
		if (tagSetsPSDEField != null) {
			String strTagSets = documentEntityDTO.getString(tagSetsPSDEField.getLowerCaseName(), null);
			if(StringUtils.hasLength(strTagSets)) {
				tagSetIdList = Arrays.asList(strTagSets.split("[,]"));
			}
		}
		try {
			if (!StringUtils.hasLength(strChunkMethod)) {
				throw new Exception("未指定切片方法");
			}
			IDocumentSplitter iDocumentSplitter = this.getDocumentSplitter(strChunkMethod, true);
			if (iDocumentSplitter == null) {
				throw new Exception(String.format("无法获取切片器[%1$s]", strChunkMethod));
			}
			
			if(!ObjectUtils.isEmpty(tagSetIdList)) {
				IPSDEDataSet iPSDEDataSet = tagProxyDERuntime.getPSDEDataSet(TagDataSet.VALID, false);
				ISearchContextDTO iSearchContextDTO = tagProxyDERuntime.getReal().createSearchContext().count(false).all();
				IPSDEField setIdPSDEField = tagProxyDERuntime.getPSDEField(TagField.SET_ID, false);
				iSearchContextDTO.in(setIdPSDEField.getLowerCaseName(), tagSetIdList);
				List<IEntityDTO> list = tagProxyDERuntime.getReal().selectDataSet(iPSDEDataSet, iSearchContextDTO);
				if (!ObjectUtils.isEmpty(list)) {
					Map<String, String> tagMap = new LinkedHashMap<String, String>();
					for(IEntityDTO tagEntityDTO : list) {
						String tagValue = (String)tagProxyDERuntime.getFieldValue(tagEntityDTO, TagField.VALUE);
						String tagDescription = (String)tagProxyDERuntime.getFieldValue(tagEntityDTO, TagField.DESCRIPTION);
						if(ObjectUtils.isEmpty(tagValue) || ObjectUtils.isEmpty(tagDescription) ) {
							continue;
						}
						tagMap.put(tagValue, tagDescription);
					}
					parserConfig.setTags(tagMap);
				}
			}
			
			if(parserConfig.getGraphRAGConfig().isUseGraphRAG()) {
				IPSDEDataSet iPSDEDataSet = graphEntityTypeProxyDERuntime.getPSDEDataSet(GraphEntityTypeDataSet.VALID, false);
				ISearchContextDTO iSearchContextDTO = graphEntityTypeProxyDERuntime.getReal().createSearchContext().count(false).all();
				List<IEntityDTO> list = graphEntityTypeProxyDERuntime.getReal().selectDataSet(iPSDEDataSet, iSearchContextDTO);
				if (!ObjectUtils.isEmpty(list)) {
					Map<String, String> graphEntityTypeMap = new LinkedHashMap<String, String>();
					for(IEntityDTO graphEntityTypeEntityDTO : list) {
						String graphEntityTypeValue = (String)graphEntityTypeProxyDERuntime.getFieldValue(graphEntityTypeEntityDTO, GraphEntityTypeField.VALUE);
						String graphEntityTypeDescription = (String)graphEntityTypeProxyDERuntime.getFieldValue(graphEntityTypeEntityDTO, GraphEntityTypeField.DESCRIPTION);
						if(ObjectUtils.isEmpty(graphEntityTypeValue) ) {
							continue;
						}
						String strName = graphEntityTypeProxyDERuntime.getReal().getMajorTextIf(graphEntityTypeEntityDTO);
						if(StringUtils.hasLength(graphEntityTypeDescription)) {
							strName+= ", ";
							strName+= graphEntityTypeDescription;
						}
						graphEntityTypeMap.put(graphEntityTypeValue, strName);
					}
					parserConfig.getGraphRAGConfig().setOptionalEntityTypes(graphEntityTypeMap);
				}
			}

			List<Chunk> chunkList = null;
			if (StringUtils.hasLength(strContent)) {
				// 按直接进行解析
				chunkList = iDocumentSplitter.split(keyValue, strContent, strChunkMethod, parserConfig);
			} else if (file != null) {
				// 按文件进行解析
				JsonNode node = JsonUtils.toJsonNode(file);
				if (node instanceof ArrayNode) {
					node = ((ArrayNode) node).get(0);
				}
				net.ibizsys.runtime.util.domain.File ossFile = JsonUtils.as(node, net.ibizsys.runtime.util.domain.File.class);
				chunkList = iDocumentSplitter.split(keyValue, ossFile, strChunkMethod, parserConfig);
			} else {
				// 标记解析错误，未指定有效内容
				throw new Exception("未指定有效内容");
			}
			
			try {
				final List<Chunk> finalChunkList = chunkList;
				ActionSessionManager.execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						doCreateChunks(documentEntityDTO, finalChunkList);
						return null;
					}
				}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("插入资料片段发生异常，%1$s", ex.getMessage()), ex);
			}
			
			try {
				final List<Chunk> finalChunkList = chunkList;
				ActionSessionManager.execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						indexDocument(documentEntityDTO, finalChunkList, parserConfig);
						return null;
					}
				}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("索引文档资料片段发生异常，%1$s", ex.getMessage()), ex);
			}

			try {
				doUpdateDocumentStatus(documentEntityDTO, DocumentStatus.READY, String.format("知识片段[%1$s]", chunkList.size()), null);
			} catch (Throwable ex2) {
				log.error(String.format("更新文档分析完成发生异常，%1$s", ex2.getMessage()), ex2);
			}
		} catch (Throwable ex) {
			log.error(String.format("文档切片处理发生异常，%1$s", ex.getMessage()), ex);
			try {
				doUpdateDocumentStatus(documentEntityDTO, DocumentStatus.FAILED, null, ex);
			} catch (Throwable ex2) {
				log.error(String.format("更新文档分析失败发生异常，%1$s", ex2.getMessage()), ex2);
			}
		}
	}

	/**
	 * 进行文档索引
	 * 
	 * @param documentEntityDTO
	 * @param chunkList
	 * @param config
	 * @throws Throwable
	 */
	protected void indexDocument(IEntityDTO documentEntityDTO, List<Chunk> chunkList, ParserConfig config) throws Throwable {
		// 判断是否进行图索引
		GraphRAGConfig graphRAGConfig = config.getGraphRAGConfig();
		if (graphRAGConfig != null && graphRAGConfig.isUseGraphRAG()) {
			this.handleGraphRAGIndexing(documentEntityDTO, chunkList, graphRAGConfig);
		}
	}

	/**
	 * 生成并保存图结构
	 * 
	 * @param documentEntityDTO
	 *            文档实体DTO
	 * @param chunkList
	 *            文本块列表
	 * @param graphRAGConfig
	 *            图RAG配置
	 * @throws Throwable
	 *             可能抛出的异常
	 */
	protected void handleGraphRAGIndexing(IEntityDTO documentEntityDTO, List<Chunk> chunkList, GraphRAGConfig graphRAGConfig) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		Object keyValue = documentProxyDERuntime.getReal().getKeyFieldValue(documentEntityDTO);
		try {
			IChunkGraphExtractor iChunkGraphExtractor = this.getChunkGraphExtractor(GRAPHEXTRACTOR_GENERAL, false);
			Graph<List<Chunk>> graph = iChunkGraphExtractor.generate(keyValue, chunkList, graphRAGConfig);
			// 存盘实体
			this.doCreateGraph(documentEntityDTO, graph, graphRAGConfig);
		} catch (Throwable ex) {
			throw ex;
		}
	}

	protected void resetDocumentIndexData(IEntityDTO documentEntityDTO) throws Throwable {
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		//final IProxyDERuntime graphEntityChunkProxyDERuntime = this.getGraphEntityChunkProxyDERuntime(false);
		final IGraphRelationChunkProxyDERuntime graphRelationChunkProxyDERuntime = this.getGraphRelationChunkProxyDERuntime(false);

		Object documentId = documentProxyDERuntime.getReal().getKeyFieldValue(documentEntityDTO);

		IPSDEField documentIdPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID);

		// 移除图相关
		String strSQL = String.format("DELETE FROM %1$s WHERE %2$s IN (SELECT %3$s FROM %4$s WHERE %5$s = ?);", graphRelationChunkProxyDERuntime.getReal().getTableName(), graphRelationChunkProxyDERuntime.getPSDEField(GraphRelationChunkField.CHUNK_ID.name(), false).getName(), chunkProxyDERuntime.getIdPSDEField().getName(), chunkProxyDERuntime.getReal().getTableName(), documentIdPSDEField.getName());
		graphRelationChunkProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().executeSQL(strSQL, Arrays.asList(documentId));

//		strSQL = String.format("DELETE FROM %1$s WHERE %2$s IN (SELECT %3$s FROM %4$s WHERE %5$s = ?);", graphEntityChunkProxyDERuntime.getReal().getTableName(), graphEntityChunkProxyDERuntime.getPSDEField(GraphRelationChunkField.CHUNK_ID.name(), false).getName(), chunkProxyDERuntime.getIdPSDEField().getName(), chunkProxyDERuntime.getReal().getTableName(), documentIdPSDEField.getName());
//		graphEntityChunkProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().executeSQL(strSQL, Arrays.asList(documentId));
	}

	protected void doCreateChunks(IEntityDTO documentEntityDTO, List<Chunk> chunkList) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);

		this.resetDocumentIndexData(documentEntityDTO);

		IPSDEField documentIdPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID);
		Object documentId = documentProxyDERuntime.getReal().getKeyFieldValue(documentEntityDTO);

		// 清理
		String strSQL = String.format("DELETE FROM %1$s where %2$s = ?", chunkProxyDERuntime.getReal().getTableName(), documentIdPSDEField.getName());
		chunkProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().executeSQL(strSQL, Arrays.asList(documentId));

		RecursiveCharacterTextSplitter recursiveCharacterTextSplitter = new RecursiveCharacterTextSplitter(Arrays.asList("\n", " ", ",", ".", "，", "。"), 100, 0);
		for (Chunk chunk : chunkList) {
			Map<String, Object> item = new LinkedHashMap<String, Object>();
			if (StringUtils.hasLength(chunk.getId())) {
				item.put(FIELD_ID, chunk.getId());
			}
			
			String strContent = chunk.getContent();
			strContent = strContent.replace("\r\n", "\n").replaceFirst("^\\n+", "");
			chunk.setContent(strContent);
			
			// 放入名称
			String strName = chunk.getName();
			if(ObjectUtils.isEmpty(strName)) {
				strName = recursiveCharacterTextSplitter.splitText(chunk.getContent()).get(0);
			}
			if (StringUtils.hasLength(strName)) {
				if(!strName.equals(chunk.getContent())) {
					strName = strName.trim().replace("\r\n", "\n").replace("\n", ",");
					if (strName.length() > 150) {
						strName = strName.substring(0, 150) + "...";
					}
					else {
						if(ObjectUtils.isEmpty(chunk.getName())) {
							strName = strName + "...";
						}
					}
				}
				else {
					strName = strName.trim().replace("\r\n", "\n").replace("\n", ",");
					if (strName.length() > 150) {
						strName = strName.substring(0, 150) + "...";
					}
				}
				
				item.put(FIELD_NAME, strName);
			}

			String strPId = DataTypeUtils.asString(chunk.get("pid"));
			if (StringUtils.hasLength(strPId)) {
				item.put(ChunkField.PID.name(), strPId);
			}
			item.put(ChunkField.DOCUMENT_ID.name(), documentId);
			item.put(ChunkField.CONTENT.name(), chunk.getContent());
			item.put(ChunkField.CONTENT_VECTOR.name(), chunk.get("content_vector"));
			item.put(ChunkField.QUESTIONS.name(), chunk.getQuestion());
			item.put(ChunkField.QUESTIONS_VECTOR.name(), chunk.get("question_vector"));
			item.put(ChunkField.SEQUENCE.name(), chunk.get(ChunkField.SEQUENCE.name()));
			item.put(ChunkField.TYPE.name(), chunk.getType());
			item.put(ChunkField.KEYWORDS.name(), chunk.getKeyword());
			item.put(ChunkField.TAGS.name(), chunk.getTag());
			item.put(ChunkField.USER_TAG.name(), chunk.get(ChunkField.USER_TAG.name()));
			item.put(ChunkField.USER_TAG2.name(), chunk.get(ChunkField.USER_TAG2.name()));
			item.put(ChunkField.USER_TAG3.name(), chunk.get(ChunkField.USER_TAG3.name()));
			item.put(ChunkField.USER_TAG4.name(), chunk.get(ChunkField.USER_TAG4.name()));
			item.put(ChunkField.METADATA.name(), chunk.get(ChunkField.METADATA.name()));

			IEntityDTO chunkEntityDTO = chunkProxyDERuntime.getEntityDTO(item);

			IUserContext lastUserContext = UserContext.getCurrent();
			try {
				UserContext.setCurrent(getDefaultUserContext());
				documentProxyDERuntime.getReal().execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						chunkProxyDERuntime.getReal().create(chunkEntityDTO, false);
						chunk.setId((String) chunkProxyDERuntime.getReal().getKeyFieldValue(chunkEntityDTO));
						return null;
					}
				}, null);
			} finally {
				UserContext.setCurrent(lastUserContext);
			}
		}
	}

	protected void doUpdateDocumentProgress(Object documentId, String progress) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		Map<String, Object> item = new LinkedHashMap<String, Object>();
		item.put(FIELD_ID, documentId);
		item.put(DocumentField.RESULT.name(), progress);
		IEntityDTO iEntityDTO = documentProxyDERuntime.getEntityDTO(item);
		
		IUserContext lastUserContext = UserContext.getCurrent();
		try {
			UserContext.setCurrent(getDefaultUserContext());
			ActionSessionManager.execute(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					documentProxyDERuntime.getReal().sysUpdate(iEntityDTO, true);
					return null;
				}
			}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
		} catch(Throwable ex) {
			log.error(String.format("更新文档进展发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}
	
	protected void doUpdateDocumentStatus(IEntityDTO documentEntityDTO, DocumentStatus documentStatus, String strResult, Object data) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);

		Map<String, Object> item = new LinkedHashMap<String, Object>();
		item.put(FIELD_ID, documentProxyDERuntime.getReal().getKeyFieldValue(documentEntityDTO));
		item.put(DocumentField.STATUS.name(), documentStatus.name());
		if (!StringUtils.hasLength(strResult)) {
			if (data instanceof Throwable) {
				strResult = ((Throwable) data).getMessage();
			}
		}
		item.put(DocumentField.RESULT.name(), strResult);
		IEntityDTO iEntityDTO = documentProxyDERuntime.getEntityDTO(item);
		IPSDEAction updateDocumentStatusPSDEAction = documentProxyDERuntime.getPSDEAction(DocumentAction.UPDATE_STATUS, false);

		IUserContext lastUserContext = UserContext.getCurrent();
		try {
			UserContext.setCurrent(getDefaultUserContext());
			ActionSessionManager.execute(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return documentProxyDERuntime.getReal().executeAction(updateDocumentStatusPSDEAction.getName(), updateDocumentStatusPSDEAction, new Object[] { iEntityDTO });
				}
			}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
		} catch(Throwable ex) {
			log.error(String.format("更新文档状态发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}
	
	protected void doUpdateKnowledgeBaseStatus(IEntityDTO knowledgeBaseEntityDTO, Object data) throws Throwable {
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getKnowledgeBaseProxyDERuntime(false);

		Map<String, Object> item = new LinkedHashMap<String, Object>();
		item.put(FIELD_ID, knowledgeBaseProxyDERuntime.getReal().getKeyFieldValue(knowledgeBaseEntityDTO));
//		if (!StringUtils.hasLength(strResult)) {
//			if (data instanceof Throwable) {
//				strResult = ((Throwable) data).getMessage();
//			}
//		}
		//item.put(DocumentField.RESULT.name(), strResult);
		IEntityDTO iEntityDTO = knowledgeBaseProxyDERuntime.getEntityDTO(item);
		IPSDEAction updateKnowledgeBaseStatusPSDEAction = knowledgeBaseProxyDERuntime.getPSDEAction(KnowledgeBaseAction.UPDATE_STATUS, true);
		if(updateKnowledgeBaseStatusPSDEAction == null) {
			return;
		}

		IUserContext lastUserContext = UserContext.getCurrent();
		try {
			UserContext.setCurrent(getDefaultUserContext());
			knowledgeBaseProxyDERuntime.getReal().execute(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return knowledgeBaseProxyDERuntime.getReal().executeAction(updateKnowledgeBaseStatusPSDEAction.getName(), updateKnowledgeBaseStatusPSDEAction, new Object[] { iEntityDTO });
				}
			}, null);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}
	

	protected void doCreateGraph(IEntityDTO documentEntityDTO, Graph<List<Chunk>> graph, GraphRAGConfig graphRAGConfig) throws Throwable {
		try {
			this.doCreateGraphNodes(documentEntityDTO, graph, graphRAGConfig);
			this.doCreateGraphEdges(documentEntityDTO, graph, graphRAGConfig);
		} catch (Throwable ex) {
			throw ex;
		}
	}

	protected void doCreateGraphNodes(IEntityDTO documentEntityDTO, Graph<List<Chunk>> graph, GraphRAGConfig graphRAGConfig) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		final IGraphEntityProxyDERuntime graphEntityProxyDERuntime = this.getGraphEntityProxyDERuntime(false);
		//final IProxyDERuntime graphEntityChunkProxyDERuntime = this.getGraphEntityChunkProxyDERuntime(false);

		if (ObjectUtils.isEmpty(graph.getNodes())) {
			return;
		}

		Object kbId = documentEntityDTO.get(documentProxyDERuntime.getPSDEField(DocumentField.KNOWLEDGE_BASE_ID, false).getLowerCaseName());
		try {
			List<IAction> actionList = new ArrayList<>();
			for (GraphNode<List<Chunk>> node : graph.getNodes()) {
				
				//判断节点是否有邻居
				if(ObjectUtils.isEmpty(node.getNeighbors())) {
					log.warn(String.format("节点[%1$s]没有邻居，忽略", node.getId()));
					continue;
				}
				
				
				String strNodeType = ((String) node.getAttribute("entity_type")).toLowerCase();
				String strNodeDescription = (String) node.getAttribute("description");

				// 查出知识库里面的实体对象
				ISearchContextDTO graphEntitySearchContextDTO = graphEntityProxyDERuntime.getReal().createSearchContext().count(false).all();
				graphEntitySearchContextDTO.eq(graphEntityProxyDERuntime.getPSDEField(GraphEntityField.KNOWLEDGE_BASE_ID).getLowerCaseName(), kbId);
				graphEntitySearchContextDTO.eq(graphEntityProxyDERuntime.getPSDEField(GraphEntityField.TYPE).getLowerCaseName(), strNodeType);
				graphEntitySearchContextDTO.eq(graphEntityProxyDERuntime.getNamePSDEField().getLowerCaseName(), node.getId());
				List<IEntityDTO> graphEntityList = graphEntityProxyDERuntime.getReal().select(graphEntitySearchContextDTO);
				List<Map> graphEntityArrayNode = new ArrayList<Map>();
				if (!ObjectUtils.isEmpty(graphEntityList)) {
					for (IEntityDTO graphEntityDTO : graphEntityList) {
						Map<String, Object> graphEntityNode = new LinkedHashMap<String, Object>();
						graphEntityArrayNode.add(graphEntityNode);

						// - `node_id`（string）：图谱内部唯一标识符
						// - `normalized_name`（string）：该节点的规范化名称
						// - `context`（string）：该节点的上下文/领域
						// - `description`（string）：该节点的描述
						// - `reference_type`（string）：`"specific"` 或 `"generic"`

						graphEntityNode.put("node_id", graphEntityProxyDERuntime.getReal().getKeyFieldValue(graphEntityDTO).toString());
						Object value = graphEntityProxyDERuntime.getFieldValue(graphEntityDTO, GraphEntityField.NORMALIZED_NAME, null);
						if (!ObjectUtils.isEmpty(value)) {
							graphEntityNode.put("normalized_name", value);
						}

						value = graphEntityProxyDERuntime.getFieldValue(graphEntityDTO, GraphEntityField.CONTEXT, null);
						if (!ObjectUtils.isEmpty(value)) {
							graphEntityNode.put("context", value);
						}

						value = graphEntityProxyDERuntime.getFieldValue(graphEntityDTO, GraphEntityField.DESCRIPTION, null);
						if (!ObjectUtils.isEmpty(value)) {
							graphEntityNode.put("description", value);
						}

						value = graphEntityProxyDERuntime.getFieldValue(graphEntityDTO, GraphEntityField.REFERENCE_TYPE, null);
						if (!ObjectUtils.isEmpty(value)) {
							graphEntityNode.put("reference_type", value.toString().toLowerCase());
						}
					}
				}

				String strPrompt = this.getGraphEntityDisambiguationPrompt(graphRAGConfig);
				Map<String, String> templParams = new LinkedHashMap<String, String>();
				templParams.put("sub_prompt", graphRAGConfig.getDisambiguationSubPrompt());
				templParams.put("node_name", node.getId());
				templParams.put("node_description", strNodeDescription);
				if (ObjectUtils.isEmpty(graphEntityArrayNode)) {
					templParams.put("existing_nodes", "[]");
				} else {
					templParams.put("existing_nodes", String.format("\r\n```json\r\n%1$s\r\n```", JsonUtils.toArrayNode(graphEntityArrayNode).toPrettyString()));
				}

				String strPrompt2 = getTemplateContent(strPrompt, templParams);
				IAction iAction = new INamedAction() {

					@Override
					public Object execute(Object[] args) throws Throwable {
						if ("person".equalsIgnoreCase(strNodeType)) {
							ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
							chatCompletionRequest.setMessages(ChatMessagesBuilder.create().xml(strPrompt2).build());
							return doChatCompletion(graphRAGConfig.getChatAgent(), chatCompletionRequest);
						} else {
							// 仿真
							ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
							Map<String, Object> item = new LinkedHashMap<String, Object>();

							if (!ObjectUtils.isEmpty(graphEntityArrayNode)) {
								Map<String, Object> first = graphEntityArrayNode.get(0);
								// 描述未来需要融合
								item.put("description", first.get("description"));
								item.put("normalized_name", first.get("normalized_name"));
								item.put("reference_type", first.get("reference_type"));
								item.put("existing_node_id", first.get("node_id"));
								item.put("context", first.get("context"));
							} else {
								item.put("description", strNodeDescription);
							}
							chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(JsonUtils.toString(Arrays.asList(item))).build());
							return chatCompletionResult;
						}
					}

					@Override
					public String getName() {
						return node.getId();
					}
				};
				actionList.add(iAction);
			}

			Map<String, Object> actionRets = this.threadRunAllOf(actionList, false, null);

			for (GraphNode<List<Chunk>> node : graph.getNodes()) {
				String strNodeType = ((String) node.getAttribute("entity_type")).toLowerCase();
				ChatCompletionResult ret = (ChatCompletionResult) actionRets.get(node.getId());
				List<Map<String, Object>> nodeList = JsonUtils.asList(AIChatUtils.getJsonContent(ret.getChoices().get(0).getContent()));
				for (Map<String, Object> item : nodeList) {
					Object existing_node_id = item.remove("existing_node_id");
					//移除action，避免将action再次送入LLM
					Object action = item.remove("action");
					String strNodeDescription = (String) item.get("description");
					String strNormalizedName = (String) item.get("normalized_name");
					String strReferenceType = (String) item.get("reference_type");
					String strContext = (String) item.get("context");

					item.put(IProxyDERuntime.FIELD_NAME, node.getId());
					item.put(GraphEntityField.KNOWLEDGE_BASE_ID.name(), kbId);
					item.put(GraphEntityField.DESCRIPTION.name(), strNodeDescription);
					item.put(GraphEntityField.DESCRIPTION_VECTOR.name(), this.getEmbedding(graphRAGConfig.getEmbeddingAgent(), strNodeDescription));
					item.put(GraphEntityField.TYPE.name(), strNodeType);
					item.put(GraphEntityField.NORMALIZED_NAME.name(), strNormalizedName);
					item.put(GraphEntityField.REFERENCE_TYPE.name(), strReferenceType);
					item.put(GraphEntityField.CONTEXT.name(), strContext);

					IUserContext lastUserContext = UserContext.getCurrent();
					try {
						UserContext.setCurrent(getDefaultUserContext());
						documentProxyDERuntime.getReal().execute(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								IEntityDTO iEntityDTO = graphEntityProxyDERuntime.getEntityDTO(item);
								if (ObjectUtils.isEmpty(existing_node_id)) {
									graphEntityProxyDERuntime.getReal().create(iEntityDTO, false);
								} else {
									iEntityDTO.set(graphEntityProxyDERuntime.getReal().getKeyPSDEField().getLowerCaseName(), existing_node_id);
									graphEntityProxyDERuntime.getReal().update(iEntityDTO, false);
								}

								Object entityId = graphEntityProxyDERuntime.getReal().getKeyFieldValue(iEntityDTO);
								// node.setAttribute("_id", entityId);
								item.put("node_id", entityId);

								// 循环构建资料库清单
								// for(Chunk chunk : node.getData()) {
								// Map<String, Object> item2 = new
								// LinkedHashMap<String, Object>();
								// item2.put(GraphEntityChunkField.ENTITY_ID.name(),
								// entityId);
								// item2.put(GraphEntityChunkField.CHUNK_ID.name(),
								// chunk.getId());
								//
								// IEntityDTO iEntityDTO2 =
								// graphEntityChunkProxyDERuntime.getEntityDTO(item2);
								// graphEntityChunkProxyDERuntime.getReal().create(iEntityDTO2,
								// false);
								// }

								return null;
							}
						}, null);
					} finally {
						UserContext.setCurrent(lastUserContext);
					}

					item.remove(GraphEntityField.DESCRIPTION_VECTOR.name());
					item.remove(GraphEntityField.KNOWLEDGE_BASE_ID.name());
					item.remove(GraphEntityField.TYPE.name());
				}

				node.setAttribute("_nodes", nodeList);
			}
		} catch (Throwable ex) {
			throw ex;
		}
	}

	protected void doCreateGraphEdges(IEntityDTO documentEntityDTO, Graph<List<Chunk>> graph, GraphRAGConfig graphRAGConfig) throws Throwable {
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		final IGraphRelationProxyDERuntime graphRelationProxyDERuntime = this.getGraphRelationProxyDERuntime(false);
		final IGraphRelationChunkProxyDERuntime graphRelationChunkProxyDERuntime = this.getGraphRelationChunkProxyDERuntime(false);

		if (ObjectUtils.isEmpty(graph.getEdges())) {
			return;
		}

		Object kbId = documentEntityDTO.get(documentProxyDERuntime.getPSDEField(DocumentField.KNOWLEDGE_BASE_ID).getLowerCaseName());
		try {
			for (GraphEdge<List<Chunk>> edge : graph.getEdges()) {

				List<Map<String, Object>> sourceNodes = (List<Map<String, Object>>) edge.getSource().getAttribute("_nodes");
				List<Map<String, Object>> targetNodes = (List<Map<String, Object>>) edge.getTarget().getAttribute("_nodes");

				if (sourceNodes.size() > 1 || targetNodes.size() > 1) {
					// if(sourceNodes.size()> 1 || targetNodes.size() > 1) {
					List<Map> edgeDataList = (List<Map>) edge.getAttribute("edges");
					Map<String, Map> edgeDataMap = (Map<String, Map>) (Object) edgeDataList.stream().filter(it -> !ObjectUtils.isEmpty(it.get("description"))).collect(Collectors.toMap(it -> it.get("description"), it -> it));

					// 需要分拆
					if (sourceNodes.size() > 1) {
						List<Map> nodeList = new ArrayList<Map>();
						for (Map<String, Object> node : sourceNodes) {
							Map<String, Object> nodeMap = new LinkedHashMap<String, Object>();
							for (java.util.Map.Entry<String, Object> entry : node.entrySet()) {
								nodeMap.put(entry.getKey().toLowerCase(), entry.getValue());
							}
							nodeList.add(nodeMap);
						}

						String strPrompt = this.getGraphRelationDisambiguationPrompt(graphRAGConfig);
						Map<String, String> templParams = new LinkedHashMap<String, String>();
						templParams.put("sub_prompt", graphRAGConfig.getRelationDisambiguationSubPrompt());
						templParams.put("nodes", JsonUtils.toArrayNode(nodeList).toPrettyString());
						templParams.put("edges", StringUtils.collectionToDelimitedString(edgeDataMap.keySet(), "\r\n", "- ", ""));

						strPrompt = this.getTemplateContent(strPrompt, templParams);
						ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
						chatCompletionRequest.setMessages(ChatMessagesBuilder.create().xml(strPrompt).build());
						ChatCompletionResult chatCompletionResult = doChatCompletion(graphRAGConfig.getChatAgent(), chatCompletionRequest);
						Map<String, List<String>> nodeEdgeMap = JsonUtils.asMap(AIChatUtils.getJsonContent(chatCompletionResult.getChoices().get(0).getContent()));
						for (Map.Entry<String, List<String>> entry : nodeEdgeMap.entrySet()) {
							for (String strDescription : entry.getValue()) {
								Map edgeData = edgeDataMap.get(strDescription);
								edgeData.put("_source_id", entry.getKey());
							}
						}
					} else {
						String strSourceId = (String) sourceNodes.get(0).get("node_id");
						for (Map edgeData : edgeDataList) {
							edgeData.put("_source_id", strSourceId);
						}
					}
					
					if (targetNodes.size() > 1) {
						List<Map<String, Object>> nodeList = new ArrayList<Map<String, Object>>();
						for (Map<String, Object> node : targetNodes) {
							Map<String, Object> nodeMap = new LinkedHashMap<String, Object>();
							for (java.util.Map.Entry<String, Object> entry : node.entrySet()) {
								nodeMap.put(entry.getKey().toLowerCase(), entry.getValue());
							}
							nodeList.add(nodeMap);
						}
						String strPrompt = this.getGraphRelationDisambiguationPrompt(graphRAGConfig);
						Map<String, String> templParams = new LinkedHashMap<String, String>();
						templParams.put("sub_prompt", graphRAGConfig.getRelationDisambiguationSubPrompt());
						templParams.put("nodes", JsonUtils.toArrayNode(nodeList).toPrettyString());
						templParams.put("edges", StringUtils.collectionToDelimitedString(edgeDataMap.keySet(), "\r\n", "- ", ""));

						strPrompt = this.getTemplateContent(strPrompt, templParams);
						ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
						chatCompletionRequest.setMessages(ChatMessagesBuilder.create().xml(strPrompt).build());
						ChatCompletionResult chatCompletionResult = doChatCompletion(graphRAGConfig.getChatAgent(), chatCompletionRequest);
						Map<String, List<String>> nodeEdgeMap = JsonUtils.asMap(AIChatUtils.getJsonContent(chatCompletionResult.getChoices().get(0).getContent()));
						for (Map.Entry<String, List<String>> entry : nodeEdgeMap.entrySet()) {
							for (String strDescription : entry.getValue()) {
								Map edgeData = edgeDataMap.get(strDescription);
								edgeData.put("_target_id", entry.getKey());
							}
						}
					} else {
						String strTargetId = (String) targetNodes.get(0).get("node_id");
						for (Map edgeData : edgeDataList) {
							edgeData.put("_target_id", strTargetId);
						}
					}

					for (Map<String, Object> sourceNode : sourceNodes) {
						String strSourceId = (String) sourceNode.get("node_id");
						for (Map<String, Object> targetNode : targetNodes) {
							String strTargetId = (String) targetNode.get("node_id");

							String strAllDesc = "";
							List<String> chunkList = new ArrayList<>();
							for (Map edgeData : edgeDataList) {

								String strSourceId2 = (String) edgeData.get("_source_id");
								String strTargetId2 = (String) edgeData.get("_target_id");
								if (!strSourceId.equals(strSourceId2) || !strTargetId.equals(strTargetId2)) {
									continue;
								}

								String strDesc = (String) edgeData.get("description");
								if (!StringUtils.hasLength(strDesc)) {
									continue;
								}

								String strChunkId = (String) edgeData.get("source_id");
								if (!StringUtils.hasLength(strChunkId)) {
									continue;
								}

								if (StringUtils.hasLength(strAllDesc)) {
									strAllDesc += "。";
								}
								strAllDesc += strDesc;
								chunkList.add(strChunkId);
							}

							if (!StringUtils.hasLength(strAllDesc)) {
								continue;
							}

							Map<String, Object> item = new LinkedHashMap<String, Object>();
							String strName = strAllDesc;
							if (!ObjectUtils.isEmpty(strName) && strName.length() > 150) {
								strName = strName.substring(0, 150);
							}
							item.put(IProxyDERuntime.FIELD_NAME, strName);
							item.put(GraphRelationField.KNOWLEDGE_BASE_ID.name(), kbId);
							item.put(GraphRelationField.DESCRIPTION.name(), strAllDesc);
							item.put(GraphRelationField.DESCRIPTION_VECTOR.name(), this.getEmbedding(graphRAGConfig.getEmbeddingAgent(), strAllDesc));
							item.put(GraphRelationField.SOURCE_ID.name(), strSourceId);
							item.put(GraphRelationField.TARGET_ID.name(), strTargetId);

							IUserContext lastUserContext = UserContext.getCurrent();
							try {
								UserContext.setCurrent(getDefaultUserContext());
								documentProxyDERuntime.getReal().execute(new IAction() {
									@Override
									public Object execute(Object[] args) throws Throwable {
										IEntityDTO iEntityDTO = graphRelationProxyDERuntime.getEntityDTO(item);
										graphRelationProxyDERuntime.getReal().create(iEntityDTO, false);
										Object relationId = graphRelationProxyDERuntime.getReal().getKeyFieldValue(iEntityDTO);
										// edge.setAttribute("_id", relationId);

										// 循环构建资料库清单
										for (String strChunkId : chunkList) {
											Map<String, Object> item2 = new LinkedHashMap<String, Object>();
											item2.put(GraphRelationChunkField.RELATION_ID.name(), relationId);
											item2.put(GraphRelationChunkField.CHUNK_ID.name(), strChunkId);

											IEntityDTO iEntityDTO2 = graphRelationChunkProxyDERuntime.getEntityDTO(item2);
											graphRelationChunkProxyDERuntime.getReal().create(iEntityDTO2, false);
										}

										return null;
									}
								}, null);
							} finally {
								UserContext.setCurrent(lastUserContext);
							}
						}
					}

				} else {
					String strSourceId = (String) sourceNodes.get(0).get("node_id");
					String strTargetId = (String) targetNodes.get(0).get("node_id");
					if (ObjectUtils.isEmpty(strSourceId)) {
						log.warn(String.format("源节点[%1$s]未指定标识", edge.getSource().getId()));
						continue;
					}
					if (ObjectUtils.isEmpty(strTargetId)) {
						log.warn(String.format("目标节点[%1$s]未指定标识", edge.getTarget().getId()));
						continue;
					}

					Map<String, Object> item = new LinkedHashMap<String, Object>();
					String strDesc = (String) edge.getAttribute("description");
					String strName = strDesc;
					if (!ObjectUtils.isEmpty(strName) && strName.length() > 150) {
						strName = strName.substring(0, 150);
					}
					item.put(IProxyDERuntime.FIELD_NAME, strName);
					item.put(GraphRelationField.KNOWLEDGE_BASE_ID.name(), kbId);
					item.put(GraphRelationField.DESCRIPTION.name(), strDesc);
					item.put(GraphRelationField.DESCRIPTION_VECTOR.name(), this.getEmbedding(graphRAGConfig.getEmbeddingAgent(), strDesc));
					item.put(GraphRelationField.SOURCE_ID.name(), strSourceId);
					item.put(GraphRelationField.TARGET_ID.name(), strTargetId);

					IUserContext lastUserContext = UserContext.getCurrent();
					try {
						UserContext.setCurrent(getDefaultUserContext());
						documentProxyDERuntime.getReal().execute(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								IEntityDTO iEntityDTO = graphRelationProxyDERuntime.getEntityDTO(item);
								graphRelationProxyDERuntime.getReal().create(iEntityDTO, false);
								Object relationId = graphRelationProxyDERuntime.getReal().getKeyFieldValue(iEntityDTO);
								// edge.setAttribute("_id", relationId);

								// 循环构建资料库清单
								for (Chunk chunk : edge.getData()) {
									Map<String, Object> item2 = new LinkedHashMap<String, Object>();
									item2.put(GraphRelationChunkField.RELATION_ID.name(), relationId);
									item2.put(GraphRelationChunkField.CHUNK_ID.name(), chunk.getId());

									IEntityDTO iEntityDTO2 = graphRelationChunkProxyDERuntime.getEntityDTO(item2);
									graphRelationChunkProxyDERuntime.getReal().create(iEntityDTO2, false);
								}

								return null;
							}
						}, null);
					} finally {
						UserContext.setCurrent(lastUserContext);
					}
				}

			}
		} catch (Throwable ex) {
			throw ex;
		}
	}

	protected IUserContext getDefaultUserContext() {
		return this.getSystemRuntime().createDefaultUserContext();
	}



	protected void prepareConfig() throws Exception {

	}

	private SysKnowledgeBaseUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected ISysKnowledgeBaseUtilRuntimeContext getModelRuntimeContext() {
		return (ISysKnowledgeBaseUtilRuntimeContext) super.getModelRuntimeContext();
	}

	@Override
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(getModelRuntimeContext(), ISysKnowledgeBaseUtilRTAddin.class, String.format("%1$s:", this.getFullUniqueTag()));
	}

	@Override
	public boolean containsDocumentSplitter(String strDocumentSplitterName) {
		Assert.hasLength(strDocumentSplitterName, "未传入文档分割器名称");
		strDocumentSplitterName = strDocumentSplitterName.toUpperCase();
		List<IDocumentSplitter> list = this.documentSplitterMap2.get(strDocumentSplitterName);
		if (!ObjectUtils.isEmpty(list)) {
			return true;
		}

		IDocumentSplitter iSplitter = this.documentSplitterMap.get(strDocumentSplitterName);
		if (iSplitter != null) {
			return true;
		}
		return false;
	}

	@Override
	public void registerDocumentSplitter(String strDocumentSplitterName, IDocumentSplitter iSplitter) {
		Assert.hasLength(strDocumentSplitterName, "未传入文档分割器名称");
		Assert.notNull(iSplitter, "未传入文档分割器对象");
		strDocumentSplitterName = strDocumentSplitterName.toUpperCase();
		synchronized (this.documentSplitterMap2) {
			List<IDocumentSplitter> last = this.documentSplitterMap2.get(strDocumentSplitterName);
			List<IDocumentSplitter> list = new ArrayList<IDocumentSplitter>();
			if (last != null) {
				list.addAll(last);
			}
			if (!list.contains(iSplitter)) {
				list.add(iSplitter);
				Collections.sort(list, new Comparator<IDocumentSplitter>() {
					@Override
					public int compare(IDocumentSplitter o1, IDocumentSplitter o2) {
						return Integer.compare(o1.getPriority(), o2.getPriority());
					}
				});
			}
			this.documentSplitterMap2.put(strDocumentSplitterName, list);
		}
	}

	@Override
	public boolean unregisterDocumentSplitter(String strDocumentSplitterName, IDocumentSplitter iSplitter) {
		Assert.hasLength(strDocumentSplitterName, "未传入文档分割器名称");
		Assert.notNull(iSplitter, "未传入文档分割器对象");
		strDocumentSplitterName = strDocumentSplitterName.toUpperCase();
		synchronized (this.documentSplitterMap2) {
			List<IDocumentSplitter> last = this.documentSplitterMap2.get(strDocumentSplitterName);
			List<IDocumentSplitter> list = new ArrayList<IDocumentSplitter>();
			if (last != null) {
				list.addAll(last);
			}
			if (list.contains(iSplitter)) {
				list.remove(iSplitter);
				this.documentSplitterMap2.put(strDocumentSplitterName, list);
				return true;
			}
			return false;
		}
	}

	public IDocumentSplitter getDocumentSplitter(String strType, boolean bTryMode) {
		Assert.hasLength(strType, "传入分割器类型无效");
		String strType2 = strType.toUpperCase();
		return (IDocumentSplitter) executeAction("获取分割器", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetDocumentSplitter(strType2, bTryMode);
			}
		}, null);
	}

	protected IDocumentSplitter onGetDocumentSplitter(String strType, boolean bTryMode) throws Throwable {
		IDocumentSplitter iDocumentSplitter = null;
		List<IDocumentSplitter> list = this.documentSplitterMap2.get(strType);
		if (!ObjectUtils.isEmpty(list)) {
			iDocumentSplitter = list.get(0);
		} else {
			iDocumentSplitter = this.documentSplitterMap.get(strType);
			if (iDocumentSplitter == null) {
				iDocumentSplitter = this.documentSplitterMap.get("*");
			}
		}

		if (iDocumentSplitter == null) {
			if (bTryMode) {
				return null;
			}
			throw new Exception(String.format("分割器[%1$s]提供方无效", strType));
		}

		return iDocumentSplitter;
	}

	
	
	
	
	@Override
	public boolean containsChunkClusterer(String strChunkClustererName) {
		Assert.hasLength(strChunkClustererName, "未传入片段聚合器名称");
		strChunkClustererName = strChunkClustererName.toUpperCase();
		List<IChunkClusterer> list = this.chunkClustererMap2.get(strChunkClustererName);
		if (!ObjectUtils.isEmpty(list)) {
			return true;
		}

		IChunkClusterer iSplitter = this.chunkClustererMap.get(strChunkClustererName);
		if (iSplitter != null) {
			return true;
		}
		return false;
	}

	@Override
	public void registerChunkClusterer(String strChunkClustererName, IChunkClusterer iSplitter) {
		Assert.hasLength(strChunkClustererName, "未传入片段聚合器名称");
		Assert.notNull(iSplitter, "未传入片段聚合器对象");
		strChunkClustererName = strChunkClustererName.toUpperCase();
		synchronized (this.chunkClustererMap2) {
			List<IChunkClusterer> last = this.chunkClustererMap2.get(strChunkClustererName);
			List<IChunkClusterer> list = new ArrayList<IChunkClusterer>();
			if (last != null) {
				list.addAll(last);
			}
			if (!list.contains(iSplitter)) {
				list.add(iSplitter);
				Collections.sort(list, new Comparator<IChunkClusterer>() {
					@Override
					public int compare(IChunkClusterer o1, IChunkClusterer o2) {
						return Integer.compare(o1.getPriority(), o2.getPriority());
					}
				});
			}
			this.chunkClustererMap2.put(strChunkClustererName, list);
		}
	}

	@Override
	public boolean unregisterChunkClusterer(String strChunkClustererName, IChunkClusterer iSplitter) {
		Assert.hasLength(strChunkClustererName, "未传入片段聚合器名称");
		Assert.notNull(iSplitter, "未传入片段聚合器对象");
		strChunkClustererName = strChunkClustererName.toUpperCase();
		synchronized (this.chunkClustererMap2) {
			List<IChunkClusterer> last = this.chunkClustererMap2.get(strChunkClustererName);
			List<IChunkClusterer> list = new ArrayList<IChunkClusterer>();
			if (last != null) {
				list.addAll(last);
			}
			if (list.contains(iSplitter)) {
				list.remove(iSplitter);
				this.chunkClustererMap2.put(strChunkClustererName, list);
				return true;
			}
			return false;
		}
	}

	public IChunkClusterer getChunkClusterer(String strType, boolean bTryMode) {
		Assert.hasLength(strType, "传入聚合器类型无效");
		String strType2 = strType.toUpperCase();
		return (IChunkClusterer) executeAction("获取聚合器", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetChunkClusterer(strType2, bTryMode);
			}
		}, null);
	}

	protected IChunkClusterer onGetChunkClusterer(String strType, boolean bTryMode) throws Throwable {
		IChunkClusterer iChunkClusterer = null;
		List<IChunkClusterer> list = this.chunkClustererMap2.get(strType);
		if (!ObjectUtils.isEmpty(list)) {
			iChunkClusterer = list.get(0);
		} else {
			iChunkClusterer = this.chunkClustererMap.get(strType);
			if (iChunkClusterer == null) {
				iChunkClusterer = this.chunkClustererMap.get("*");
			}
		}

		if (iChunkClusterer == null) {
			if (bTryMode) {
				return null;
			}
			throw new Exception(String.format("聚合器[%1$s]提供方无效", strType));
		}

		return iChunkClusterer;
	}

	@Override
	public boolean containsChunkGraphExtractor(String strChunkGraphExtractorName) {
		Assert.hasLength(strChunkGraphExtractorName, "未传入片段图展开名称");
		strChunkGraphExtractorName = strChunkGraphExtractorName.toUpperCase();
		List<IChunkGraphExtractor> list = this.chunkGraphExtractorMap2.get(strChunkGraphExtractorName);
		if (!ObjectUtils.isEmpty(list)) {
			return true;
		}

		IChunkGraphExtractor iSplitter = this.chunkGraphExtractorMap.get(strChunkGraphExtractorName);
		if (iSplitter != null) {
			return true;
		}
		return false;
	}

	@Override
	public void registerChunkGraphExtractor(String strChunkGraphExtractorName, IChunkGraphExtractor iSplitter) {
		Assert.hasLength(strChunkGraphExtractorName, "未传入片段图展开器名称");
		Assert.notNull(iSplitter, "未传入片段图展开器对象");
		strChunkGraphExtractorName = strChunkGraphExtractorName.toUpperCase();
		synchronized (this.chunkGraphExtractorMap2) {
			List<IChunkGraphExtractor> last = this.chunkGraphExtractorMap2.get(strChunkGraphExtractorName);
			List<IChunkGraphExtractor> list = new ArrayList<IChunkGraphExtractor>();
			if (last != null) {
				list.addAll(last);
			}
			if (!list.contains(iSplitter)) {
				list.add(iSplitter);
				Collections.sort(list, new Comparator<IChunkGraphExtractor>() {
					@Override
					public int compare(IChunkGraphExtractor o1, IChunkGraphExtractor o2) {
						return Integer.compare(o1.getPriority(), o2.getPriority());
					}
				});
			}
			this.chunkGraphExtractorMap2.put(strChunkGraphExtractorName, list);
		}
	}

	@Override
	public boolean unregisterChunkGraphExtractor(String strChunkGraphExtractorName, IChunkGraphExtractor iSplitter) {
		Assert.hasLength(strChunkGraphExtractorName, "未传入片段图展开器名称");
		Assert.notNull(iSplitter, "未传入片段图展开器对象");
		strChunkGraphExtractorName = strChunkGraphExtractorName.toUpperCase();
		synchronized (this.chunkGraphExtractorMap2) {
			List<IChunkGraphExtractor> last = this.chunkGraphExtractorMap2.get(strChunkGraphExtractorName);
			List<IChunkGraphExtractor> list = new ArrayList<IChunkGraphExtractor>();
			if (last != null) {
				list.addAll(last);
			}
			if (list.contains(iSplitter)) {
				list.remove(iSplitter);
				this.chunkGraphExtractorMap2.put(strChunkGraphExtractorName, list);
				return true;
			}
			return false;
		}
	}

	public IChunkGraphExtractor getChunkGraphExtractor(String strType, boolean bTryMode) {
		Assert.hasLength(strType, "传入图展开器类型无效");
		String strType2 = strType.toUpperCase();
		return (IChunkGraphExtractor) executeAction("获取图展开器", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetChunkGraphExtractor(strType2, bTryMode);
			}
		}, null);
	}

	protected IChunkGraphExtractor onGetChunkGraphExtractor(String strType, boolean bTryMode) throws Throwable {
		IChunkGraphExtractor iChunkGraphExtractor = null;
		List<IChunkGraphExtractor> list = this.chunkGraphExtractorMap2.get(strType);
		if (!ObjectUtils.isEmpty(list)) {
			iChunkGraphExtractor = list.get(0);
		} else {
			iChunkGraphExtractor = this.chunkGraphExtractorMap.get(strType);
			if (iChunkGraphExtractor == null) {
				iChunkGraphExtractor = this.chunkGraphExtractorMap.get("*");
			}
		}

		if (iChunkGraphExtractor == null) {
			if (bTryMode) {
				return null;
			}
			throw new Exception(String.format("图展开器[%1$s]提供方无效", strType));
		}

		return iChunkGraphExtractor;
	}
	
	@Override
	public boolean containsChunkRetriever(String strChunkRetrieverName) {
		Assert.hasLength(strChunkRetrieverName, "未传入片段召回器名称");
		strChunkRetrieverName = strChunkRetrieverName.toUpperCase();
		List<IChunkRetriever> list = this.chunkRetrieverMap2.get(strChunkRetrieverName);
		if (!ObjectUtils.isEmpty(list)) {
			return true;
		}

		IChunkRetriever iSplitter = this.chunkRetrieverMap.get(strChunkRetrieverName);
		if (iSplitter != null) {
			return true;
		}
		return false;
	}

	@Override
	public void registerChunkRetriever(String strChunkRetrieverName, IChunkRetriever iSplitter) {
		Assert.hasLength(strChunkRetrieverName, "未传入片段召回器名称");
		Assert.notNull(iSplitter, "未传入片段召回器对象");
		strChunkRetrieverName = strChunkRetrieverName.toUpperCase();
		synchronized (this.chunkRetrieverMap2) {
			List<IChunkRetriever> last = this.chunkRetrieverMap2.get(strChunkRetrieverName);
			List<IChunkRetriever> list = new ArrayList<IChunkRetriever>();
			if (last != null) {
				list.addAll(last);
			}
			if (!list.contains(iSplitter)) {
				list.add(iSplitter);
				Collections.sort(list, new Comparator<IChunkRetriever>() {
					@Override
					public int compare(IChunkRetriever o1, IChunkRetriever o2) {
						return Integer.compare(o1.getPriority(), o2.getPriority());
					}
				});
			}
			this.chunkRetrieverMap2.put(strChunkRetrieverName, list);
		}
	}

	@Override
	public boolean unregisterChunkRetriever(String strChunkRetrieverName, IChunkRetriever iSplitter) {
		Assert.hasLength(strChunkRetrieverName, "未传入片段召回器名称");
		Assert.notNull(iSplitter, "未传入片段召回器对象");
		strChunkRetrieverName = strChunkRetrieverName.toUpperCase();
		synchronized (this.chunkRetrieverMap2) {
			List<IChunkRetriever> last = this.chunkRetrieverMap2.get(strChunkRetrieverName);
			List<IChunkRetriever> list = new ArrayList<IChunkRetriever>();
			if (last != null) {
				list.addAll(last);
			}
			if (list.contains(iSplitter)) {
				list.remove(iSplitter);
				this.chunkRetrieverMap2.put(strChunkRetrieverName, list);
				return true;
			}
			return false;
		}
	}

	public IChunkRetriever getChunkRetriever(String strType, boolean bTryMode) {
		Assert.hasLength(strType, "传入召回器类型无效");
		String strType2 = strType.toUpperCase();
		return (IChunkRetriever) executeAction("获取召回器", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetChunkRetriever(strType2, bTryMode);
			}
		}, null);
	}

	protected IChunkRetriever onGetChunkRetriever(String strType, boolean bTryMode) throws Throwable {
		IChunkRetriever iChunkRetriever = null;
		List<IChunkRetriever> list = this.chunkRetrieverMap2.get(strType);
		if (!ObjectUtils.isEmpty(list)) {
			iChunkRetriever = list.get(0);
		} else {
			iChunkRetriever = this.chunkRetrieverMap.get(strType);
			if (iChunkRetriever == null) {
				iChunkRetriever = this.chunkRetrieverMap.get("*");
			}
		}

		if (iChunkRetriever == null) {
			if (bTryMode) {
				return null;
			}
			throw new Exception(String.format("召回器[%1$s]提供方无效", strType));
		}

		return iChunkRetriever;
	}
	

	protected ChatCompletionResult doChatCompletion(String strChatAgent, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		if(StringUtils.hasLength(strChatAgent)) {
			return this.getSysAIUtilRuntime(false).chatCompletion(strChatAgent, chatCompletionRequest);
		}
		else {
			return this.getSysAIUtilRuntime(false).chatCompletion(this.getChatAgent(), chatCompletionRequest);
		}
		
	}

	/**
	 * 获取传入内容的嵌入值
	 * 
	 * @param strContent
	 * @return
	 * @throws Throwable
	 */
	protected double[] getEmbedding(String strEmbeddingAgent, String strContent) throws Throwable {
		EmbeddingRequest embeddingRequest = new EmbeddingRequest();
		embeddingRequest.setContent(strContent);
		EmbeddingResult embeddingResult = doEmbedding(strEmbeddingAgent, embeddingRequest);
		List<Double> list = embeddingResult.getData().get(0).getEmbedding();
		double[] doubleArray = list.stream().mapToDouble(Double::doubleValue) // 等价于
																				// .mapToDouble(d
																				// ->
																				// d)
				.toArray();
		return doubleArray;
	}

	protected EmbeddingResult doEmbedding(String strEmbeddingAgent, EmbeddingRequest embeddingRequest) throws Throwable {
		if(embeddingRequest.getDimensions() == null && this.getEmbeddingDimensions() != null) {
			embeddingRequest.setDimensions(this.getEmbeddingDimensions());
		}
		if(StringUtils.hasLength(strEmbeddingAgent)) {
			return this.getSysAIUtilRuntime(false).embedding(strEmbeddingAgent, embeddingRequest);
		}
		else {
			return this.getSysAIUtilRuntime(false).embedding(this.getEmbeddingAgent(), embeddingRequest);
		}
	}

	protected TextReRankResult doTextReRank(String strReRankAgent, TextReRankRequest textReRankRequest) throws Throwable {
		if(StringUtils.hasLength(strReRankAgent)) {
			return this.getSysAIUtilRuntime(false).textReRank(strReRankAgent, textReRankRequest);
		}
		else {
			return this.getSysAIUtilRuntime(false).textReRank(this.getTextReRankAgent(), textReRankRequest);
		}
	}

	protected List<Integer> doClusterEmbeddings(ClusterEmbeddingsRequest clusterEmbeddingsRequest) throws Throwable {
		return this.getSysKBUtilRuntime(false).clusterEmbeddings(clusterEmbeddingsRequest);
	}

	@Override
	protected boolean isThreadRunning() {
		return isRunParseKnowledgeBaseTimer();
	}
	
	@Override
	public Page fetchChunks(String kb_ids, Map<String, Object> data) {
		return (Page) this.executeAction("获取知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_ids, DataAccessActions.READ)) {
					throw new ErrorException("无法读取指定知识库", Errors.ACCESSDENY);
				}
				
				try {
					ChunkSearchContext chunkSearchContext = new ChunkSearchContext(data);
					
					chunkIndexThreadLocal.set(0);
					chunkSearchContexThreadLocal.set(chunkSearchContext);
					
					//String strQuery = (String)data.get(ISearchContextDTO.PARAM_QUERY);
					if(!ObjectUtils.isEmpty(chunkSearchContext.getQueries())) {
						//throw new Exception("未传入查询内容");
						int nPage = chunkSearchContext.getPage();
						if(nPage == 0) {
							//判断是否有graphrag
							int nGraphRAG = DataTypeUtils.asInteger(data.get(ChunkSearchContext.FIELD_GRAPHRAG), IChunkSearchContext.GRAPHRAG_DISABLED);
							if(nGraphRAG == IChunkSearchContext.GRAPHRAG_ENABLED) {
								if(!data.containsKey(IChunkSearchContext.PARAM_TRIPLET) && !data.containsKey(IChunkSearchContext.PARAM_TRIPLETS)) {
									//进一步判断知识库是否支持GraphRAG
									String ids[] = kb_ids.split("[,]");
									for(String strKBId : ids) {
										ParserConfig parserConfig = getKnowledgeBaseParserConfig(strKBId);
										if(parserConfig.getGraphRAGConfig().isUseGraphRAG()) {
											//仿真聊天记录，后续将调整为循环多个查询
											data.put(IChunkSearchContext.PARAM_HISTORIES, JsonUtils.toString(ChatMessagesBuilder.create().user(chunkSearchContext.getQueries().get(0)).build()));
											return onFetchChunksByHistories(kb_ids, data);				
										}
									}
								}
							}
						}
					}
					
					return onFetchChunks(kb_ids, data);
				}
				finally{
					chunkIndexThreadLocal.set(0);
					chunkSearchContexThreadLocal.set(null);
				}
				
			}
		}, null);
	}

	protected Page onFetchChunks(String kb_ids, Map<String, Object> data) throws Throwable {
		ChunkSearchContext chunkSearchContext = new ChunkSearchContext(data);
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getKnowledgeBaseProxyDERuntime(false);
		IDBDialect iDBDialect = knowledgeBaseProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().getDBDialect();

		String ids[] = kb_ids.split("[,]");
		List<Object> idList = new ArrayList<Object>();
		for (int i = 0; i < ids.length; i++) {
			idList.add(ids[i]);
		}
		
		if(!chunkSearchContext.contains(ChunkSearchContext.FIELD_PAGEINDEX) || !chunkSearchContext.contains(ChunkSearchContext.FIELD_RERANK)) {
			IEntityDTO kbEntityDTO = this.getKnowledgeBaseEntityDTO(idList.get(0), true);
			if(kbEntityDTO != null) {
				if(!chunkSearchContext.contains(ChunkSearchContext.FIELD_PAGEINDEX)) {
					Object value = knowledgeBaseProxyDERuntime.getFieldValue(kbEntityDTO, KnowledgeBaseField.PAGE_INDEX, null);
					if(value != null) {
						chunkSearchContext.setPageIndex(DataTypeUtils.asInteger(value));
					}
					
				}
				if(!chunkSearchContext.contains(ChunkSearchContext.FIELD_RERANK)) {
					Object value = knowledgeBaseProxyDERuntime.getFieldValue(kbEntityDTO, KnowledgeBaseField.RERANK, null);
					if(value != null) {
						chunkSearchContext.setTextReRank(DataTypeUtils.asInteger(value));
					}
				}
			}
		}
		
		
		List<Chunk> kbGuidanceList = new ArrayList<Chunk>();
		IPSDEField guidancePSDEField = knowledgeBaseProxyDERuntime.getPSDEField(KnowledgeBaseField.GUIDANCE_PROMPT, true);
		if((chunkSearchContext.getPageable().getPageNumber() == 0)  && DataTypeUtils.asBoolean(chunkSearchContext.getKBGuidance(), false) && guidancePSDEField!= null) {
			for(Object kbId : idList) {
				IEntityDTO kbEntityDTO = this.getKnowledgeBaseEntityDTO(kbId, true);
				if(kbEntityDTO == null) {
					log.error(String.format("指定知识库标识[%1$s]不存在", kbId));
					continue;
				}
				
				String strGuidanceInfo = kbEntityDTO.getString(guidancePSDEField.getLowerCaseName(), null);
				if(!StringUtils.hasLength(strGuidanceInfo)) {
					continue;
				}
				
				Chunk chunk = new Chunk();
				chunk.setKBId(DataTypeUtils.asString(knowledgeBaseProxyDERuntime.getReal().getKeyFieldValue(kbEntityDTO)));
				chunk.setKBName(knowledgeBaseProxyDERuntime.getReal().getMajorTextIf(kbEntityDTO));
				chunk.setType(net.ibizsys.central.cloud.core.util.domain.ChunkType.KBGUIDANCE.getValue());
				chunk.setContent(strGuidanceInfo);
				kbGuidanceList.add(chunk);
			}
		}
		
	
		
		//根据实体类型获取召回器
		String strRetrieverType = String.format("%1$s.%2$s", RETRIEVER_GENERAL, iDBDialect.getDBType());
		IChunkRetriever iChunkRetriever = this.getChunkRetriever(strRetrieverType, false);
		
		//如果多个库，需要判断每个的向量是否一致
		Map<String, List<Object>> kbIdGroup = new LinkedHashMap<String, List<Object>>();
		for(Object kbId : idList) {
			ParserConfig parserConfig = this.getKnowledgeBaseParserConfig(kbId);
			String strEmbeddingAgent = parserConfig.getEmbeddingAgent();
			List<Object> last = kbIdGroup.get(strEmbeddingAgent);
			if(last == null) {
				last = new ArrayList<Object>();
				kbIdGroup.put(strEmbeddingAgent, last);
			}
			last.add(kbId);
		}
		
		Map<String, Chunk> chunkMap = new HashMap<String, Chunk>();
		//未来考虑多线程
		for(List<Object> list : kbIdGroup.values()) {
			List<Chunk> chunkList = iChunkRetriever.retrieve(list, chunkSearchContext, this.getKnowledgeBaseParserConfig(list.get(0)));
			if(!ObjectUtils.isEmpty(chunkList)) {
				for(Chunk chunk : chunkList) {
					chunkMap.put(chunk.getId(), chunk);
				}
			}
		}
		
		List<String> types = chunkSearchContext.getTypes();
		
		List<Chunk> chunkList = new ArrayList<Chunk>();
		List<Chunk> pageChunkList = new ArrayList<Chunk>();
		//只让碎片块参与
		for(Chunk chunk : chunkMap.values()) {
			if(StringUtils.hasLength(chunk.getType())) {
				if(net.ibizsys.central.cloud.core.util.domain.ChunkType.PAGE.getValue().equalsIgnoreCase(chunk.getType())) {
					pageChunkList.add(chunk);
					continue;
				}
				else
					if(net.ibizsys.central.cloud.core.util.domain.ChunkType.CLUSTER.getValue().equalsIgnoreCase(chunk.getType())
							|| net.ibizsys.central.cloud.core.util.domain.ChunkType.INDEX.getValue().equalsIgnoreCase(chunk.getType())) {
						if(ObjectUtils.isEmpty(types) || !types.contains(chunk.getType()) ) {
							continue;
						}
					}
					
			}
			chunkList.add(chunk);
		}
		
		if(!ObjectUtils.isEmpty(pageChunkList)) {
			Collections.sort(pageChunkList, new Comparator<Chunk>() {
				@Override
				public int compare(Chunk o1, Chunk o2) {
					return o1.getDocId().compareTo(o2.getDocId());
				}
			});
			
			Collections.sort(pageChunkList, new Comparator<Chunk>() {
				@Override
				public int compare(Chunk o1, Chunk o2) {
					return Integer.compare((int)o1.get(ChunkField.SEQUENCE.name()), (int)o2.get(ChunkField.SEQUENCE.name()));
				}
			});
			//按照置信度进行排序
			Collections.sort(pageChunkList, new Comparator<Chunk>() {
				@Override
				public int compare(Chunk o1, Chunk o2) {
					return Double.compare(o2.getSimilarity(), o1.getSimilarity());
				}
			});
			kbGuidanceList.addAll(pageChunkList);
		}
		
		Collections.sort(chunkList, new Comparator<Chunk>() {
			@Override
			public int compare(Chunk o1, Chunk o2) {
				return o2.getSimilarity().compareTo(o1.getSimilarity());
			}
		});
		
		float fThreshold = 0.3f;
		if(chunkSearchContext.getSimilarityThreshold() != null) {
			fThreshold = chunkSearchContext.getSimilarityThreshold();
		}
		if(fThreshold <= 0 || fThreshold>=1) {
			fThreshold = 0.3f;
		}
		
		int nRaptor = DataTypeUtils.asInteger(chunkSearchContext.getRaptor(), IChunkSearchContext.RAPTOR_ENABLED);
		
		int nDocTopK = 0;
		if(chunkSearchContext.getDocTopK()!=null) {
			nDocTopK = chunkSearchContext.getDocTopK();
		}
		if(nDocTopK > 0) {
			// 放入阈值
			List<Chunk> otherChunkList = new ArrayList<Chunk>();
			List<Chunk> otherChunkList2 = new ArrayList<Chunk>();
			Map<String, List<Chunk>> docChunkListMap = new LinkedHashMap<String, List<Chunk>>();
			for(Chunk chunk : chunkList) {
				if(chunk.getSimilarity() == null) {
					continue;
				}
				
				if(chunk.getSimilarity().floatValue() < fThreshold) {
					continue;
				}
				
				String strDocId = chunk.getDocId();
				if(strDocId == null) {
					strDocId = "";
				}
				
				 List<Chunk> list = docChunkListMap.get(strDocId);
				 if(list == null) {
					 list = new ArrayList<Chunk>();
					 docChunkListMap.put(strDocId, list);
				 }
				 if(list.size()>=nDocTopK) {
					 //放入其它
					 otherChunkList.add(chunk);
				 }
				 else
					 list.add(chunk);
			}
			
			chunkList.clear();
			for(List<Chunk> list : docChunkListMap.values()) {
				chunkList.add(list.remove(0));
				otherChunkList2.addAll(list);
			}
			
			Collections.sort(otherChunkList2, new Comparator<Chunk>() {
				@Override
				public int compare(Chunk o1, Chunk o2) {
					return o2.getSimilarity().compareTo(o1.getSimilarity());
				}
			});
			
			chunkList.addAll(otherChunkList2);
			
			
			Collections.sort(otherChunkList, new Comparator<Chunk>() {
				@Override
				public int compare(Chunk o1, Chunk o2) {
					return o2.getSimilarity().compareTo(o1.getSimilarity());
				}
			});
			
			chunkList.addAll(otherChunkList);
		}	
		
		
		int nGraphRAG = DataTypeUtils.asInteger(chunkSearchContext.getGraphRAG(), IChunkSearchContext.GRAPHRAG_DISABLED);
		// 第一页才支持GraphRAG
		if (chunkSearchContext.getPageable().getPageNumber() == 0 && chunkList.size() > 0 && nGraphRAG!= IChunkSearchContext.GRAPHRAG_DISABLED) {
			String strGraphRAGRetrieverType = String.format("%1$s.%2$s", RETRIEVER_GRAPHRAG, iDBDialect.getDBType());
			IChunkRetriever graphRAGChunkRetriever = this.getChunkRetriever(strGraphRAGRetrieverType, false);
			for(Object kbId : idList) {
				ParserConfig parserConfig = this.getKnowledgeBaseParserConfig(kbId);
				if(parserConfig.getGraphRAGConfig().isUseGraphRAG()) {
					List<Chunk> chunkList2 = graphRAGChunkRetriever.retrieve(Arrays.asList(kbId), chunkSearchContext, parserConfig);
					if(!ObjectUtils.isEmpty(chunkList2)) {
						kbGuidanceList.addAll(chunkList2);
					}
				}
			}
		}
		
		boolean bAppendChunkViewUrl = StringUtils.hasLength(this.getChunkViewUrl("demo"));
		if(bAppendChunkViewUrl) {
			for (Chunk chunk : kbGuidanceList) {
				StringBuilder sb = new StringBuilder();
				if (net.ibizsys.central.cloud.core.util.domain.ChunkType.GRAPH.getValue().equals(chunk.getType())) {
					if (StringUtils.hasLength(chunk.getKBName())) {
						sb.append(String.format("# 资料库`%1$s`知识图谱\r\n", chunk.getKBName()));
					} else {
						sb.append(String.format("# 资料库知识图谱\r\n"));
					}
					sb.append("---\r\n");
					sb.append(chunk.getContent());
					chunk.setContent(sb.toString());
					continue;
				}
				if (net.ibizsys.central.cloud.core.util.domain.ChunkType.KBGUIDANCE.getValue().equals(chunk.getType())) {
					if (StringUtils.hasLength(chunk.getKBName())) {
						sb.append(String.format("# 资料库简介`%1$s`\r\n", chunk.getKBName()));
					} else {
						sb.append(String.format("# 资料库简介\r\n"));
					}
					sb.append("---\r\n");
					sb.append(chunk.getContent());
					chunk.setContent(sb.toString());
					continue;
				}
				
				if (StringUtils.hasLength(chunk.getDocName())) {
					sb.append(String.format("# [%1$s](%2$s)，来自文档`%3$s`\r\n", this.getChunkSN(), this.getChunkViewUrl(chunk.getId()), chunk.getDocName()));
				} else {
					sb.append(String.format("# [%1$s](%2$s)\r\n", this.getChunkSN(), this.getChunkViewUrl(chunk.getId())));
				}

				sb.append("---\r\n");
				sb.append(chunk.getContent());
				chunk.setContent(sb.toString());
				continue;
			}
		}

		int nTaskReRank = DataTypeUtils.asInteger(chunkSearchContext.getTextReRank(), IChunkSearchContext.TEXTRERANK_DISABLED);
		// 第一页才支持重排序
		if (chunkSearchContext.getPageable().getPageNumber() == 0 && chunkList.size() > 0 && nTaskReRank!= IChunkSearchContext.TEXTRERANK_DISABLED) {
			List<Chunk> backupChunkList = new ArrayList<Chunk>(chunkList);
			TextReRankRequest textReRankRequest = new TextReRankRequest();
			Map<Integer, Chunk> indexChunkMap = new LinkedHashMap<Integer, Chunk>();
			List<net.ibizsys.central.cloud.core.util.domain.Document> documentList = new ArrayList<>();
			int nTestSize = chunkSearchContext.getPageable().getPageSize() + 10;
			int nTotal = chunkList.size();
			for (int i = 0; i < chunkList.size(); i++) {
				if (i >= nTestSize) {
					break;
				}
				net.ibizsys.central.cloud.core.util.domain.Document document = new net.ibizsys.central.cloud.core.util.domain.Document();
				document.setContent(chunkList.get(i).getContent());
				documentList.add(document);
				indexChunkMap.put(i, chunkList.get(i));
			}
			textReRankRequest.setQuery(chunkSearchContext.getQueries());
			textReRankRequest.setInstruct(chunkSearchContext.getInstruct());
			textReRankRequest.setDocuments(documentList);
			
			//获取rerankAgent
			String strReRankAgent = null;
			for(Object kbId : idList) {
				ParserConfig parserConfig = this.getKnowledgeBaseParserConfig(kbId);
				strReRankAgent = parserConfig.getReRankAgent();
				if(StringUtils.hasLength(strReRankAgent)) {
					break;
				}
			}
			
			TextReRankResult textReRankResult = this.doTextReRank(strReRankAgent, textReRankRequest);
			List<TextReRankDocument> textReRankDocumentList = textReRankResult.getDocuments();
			if (!ObjectUtils.isEmpty(textReRankDocumentList)) {
				chunkList.clear();
				for (TextReRankDocument textReRankDocument : textReRankDocumentList) {
					int nIndex = DataTypeUtils.asInteger(textReRankDocument.getIndex(), -1);
					if (nIndex == -1) {
						continue;
					}
					Chunk chunk = indexChunkMap.get(nIndex);
					if (chunk != null) {
						// 调整得分
						if (textReRankDocument.getRelevanceScore() != null) {
							chunk.setOriginal(chunk.getSimilarity());
							chunk.setSimilarity(textReRankDocument.getRelevanceScore().doubleValue());
						}
						chunkList.add(chunk);
					}
				}
			}
			//DataTypeUtils.asFloat(chunkSearchContext.getSimilarityThreshold(), new Float(0.0));
			if (fThreshold > 0.0) {
				List<Chunk> filteredList = new ArrayList<Chunk>();
				for(Chunk chunk : chunkList) {
					if(chunk.getSimilarity() == null) {
						continue;
					}
					
					if(chunk.getSimilarity().floatValue() < fThreshold) {
						continue;
					}
					
					filteredList.add(chunk);
				}
				//		chunkList.parallelStream().filter(chunk -> DataTypeUtils.asDouble(chunk.getSimilarity(), new Double(0.0)) > fThreshold).collect(Collectors.toList());
				chunkList.clear();
				chunkList.addAll(filteredList);
			}
			
			if(chunkList.size() > 0 || nTaskReRank != IChunkSearchContext.TEXTRERANK_AUTO) {
				if(nRaptor >= IChunkSearchContext.RAPTOR_ENABLED) {
					this.fillRaptorClusterChunks(chunkList, chunkMap);
					this.processRaptorClusterChunks(chunkList, nRaptor);
				}
				else {
					if(bAppendChunkViewUrl) {
						for (Chunk chunk : chunkList) {
							StringBuilder sb = new StringBuilder();
							if (StringUtils.hasLength(chunk.getDocName())) {
								sb.append(String.format("# [%1$s](%2$s)，来自文档`%3$s`\r\n", this.getChunkSN(), this.getChunkViewUrl(chunk.getId()), chunk.getDocName()));
							} else {
								sb.append(String.format("# [%1$s](%2$s)\r\n", this.getChunkSN(), this.getChunkViewUrl(chunk.getId())));
							}
							sb.append("---\r\n");
							sb.append(chunk.getContent());
							chunk.setContent(sb.toString());
							continue;
						}
					}
				}
				
				//补充资料库
				for(int i = 0;i<kbGuidanceList.size();i++) {
					chunkList.add(i, kbGuidanceList.get(i));
				}
				PageImpl ret = new PageImpl<Chunk>(chunkList, chunkSearchContext.getPageable(), chunkList.size());
				ret.getMetadataIf().put("rerank", EntityBase.BOOLEAN_TRUE);
				ret.getMetadataIf().put("threshold", fThreshold);
				return ret;
			}

			//恢复片段列表
			chunkList.addAll(backupChunkList);
		}

		// 放入阈值
		if (fThreshold > 0.0) {
			List<Chunk> filteredList = new ArrayList<Chunk>();
			for(Chunk chunk : chunkList) {
				if(chunk.getSimilarity() == null) {
					continue;
				}
				
				if(chunk.getSimilarity().floatValue() < fThreshold) {
					continue;
				}
				
				filteredList.add(chunk);
			}
			chunkList.clear();
			chunkList.addAll(filteredList);
		}
		

		int nStartPos = chunkSearchContext.getPageable().getPageNumber() * chunkSearchContext.getPageable().getPageSize();
		int nEndPos = (chunkSearchContext.getPageable().getPageNumber() + 1) * chunkSearchContext.getPageable().getPageSize();
		if (chunkList.size() < nEndPos) {
			nEndPos = chunkList.size();
		}
		// 截断
		List<Chunk> retChunkList = new ArrayList<Chunk>();
		if (nEndPos > nStartPos) {
			retChunkList.addAll(chunkList.subList(nStartPos, nEndPos));
		}
		if (chunkSearchContext.getPageable().getPageNumber() == 0 && (nRaptor >= IChunkSearchContext.RAPTOR_ENABLED)) {
			this.fillRaptorClusterChunks(retChunkList, chunkMap);
			this.processRaptorClusterChunks(retChunkList, nRaptor);
		}
		else {
			if(bAppendChunkViewUrl) {
				for (Chunk chunk : retChunkList) {
					StringBuilder sb = new StringBuilder();
					if (StringUtils.hasLength(chunk.getDocName())) {
						sb.append(String.format("# [%1$s](%2$s)，来自文档`%3$s`\r\n", this.getChunkSN(), this.getChunkViewUrl(chunk.getId()), chunk.getDocName()));
					} else {
						sb.append(String.format("# [%1$s](%2$s)\r\n", this.getChunkSN(), this.getChunkViewUrl(chunk.getId())));
					}
					sb.append("---\r\n");
					sb.append(chunk.getContent());
					chunk.setContent(sb.toString());
					continue;
				}
			}
		}
		
		//补充资料库
		for(int i = 0;i<kbGuidanceList.size();i++) {
			retChunkList.add(i, kbGuidanceList.get(i));
		}

		PageImpl ret =  new PageImpl<Chunk>(retChunkList, chunkSearchContext.getPageable(), chunkList.size() + kbGuidanceList.size());
		ret.getMetadataIf().put("rerank", EntityBase.BOOLEAN_FALSE);
		ret.getMetadataIf().put("threshold", fThreshold);
		return ret;

	}
	
	protected void processRaptorClusterChunks(List<Chunk> chunkList, int nRaptor) throws Throwable {
		if(ObjectUtils.isEmpty(chunkList)) {
			return;
		}
		
		if(nRaptor == IChunkSearchContext.RAPTOR_ENABLED) {
			return;
		}
		
		if(nRaptor == IChunkSearchContext.RAPTOR_ENABLEDWITHOUTSOURCE) {
			List<Chunk> chunkList2 = new ArrayList<Chunk>(chunkList);
			chunkList.clear();
			for(Chunk chunk : chunkList2) {
				if(!ObjectUtils.isEmpty(chunk.getType()) && net.ibizsys.central.cloud.core.util.domain.ChunkType.SOURCE.getValue().equals(chunk.getType())) {
					continue;
				}
				chunkList.add(chunk);
			}
		}
		
	}

	protected void fillRaptorClusterChunks(List<Chunk> chunkList, Map<String, Chunk> chunkMap) throws Throwable {

		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);

		Map<String, Chunk> validChunkMap = new HashMap<>();
		
		//对所有叶子节点排序
		if(nRaptorLeafCount>0 && nRaptorLeafCount<chunkList.size()) {
			for(int i = nRaptorLeafCount;i<chunkList.size();i++) {
				chunkList.get(i).set("_ignored", 1);
			}
		}
		
		// 补充全部片段
		for (Chunk chunk : chunkList) {
			validChunkMap.put(chunk.getId(), chunk);
			
			if (!StringUtils.hasLength(chunk.getPid())) {
				continue;
			}

			String strPId = chunk.getPid();
			while (StringUtils.hasLength(strPId)) {
				Chunk parentChunk = chunkMap.get(strPId);
				if (parentChunk == null) {
					IEntityDTO parentChunkDTO = chunkProxyDERuntime.getReal().get(strPId, true);
					if (parentChunkDTO == null) {
						log.error(String.format("无法获取父片段[%1$s]", strPId));
						break;
					}

					Map<String, Object> item = chunkProxyDERuntime.getDataItem(parentChunkDTO);
					parentChunk = new Chunk();
					parentChunk.setId(DataTypeUtils.asString(item.get(FIELD_ID)));
					parentChunk.setPid(DataTypeUtils.asString(item.get(ChunkField.PID.name())));
					parentChunk.setContent(DataTypeUtils.asString(item.get(ChunkField.CONTENT.name())));
					parentChunk.set(ChunkField.SEQUENCE.name(), item.get(ChunkField.SEQUENCE.name()));
					parentChunk.setDocId(DataTypeUtils.asString(item.get(ChunkField.DOCUMENT_ID.name())));
					parentChunk.setDocName(DataTypeUtils.asString(item.get(ChunkField.DOCUMENT_NAME.name())));
					//不用类型
					//parentChunk.setType(DataTypeUtils.asString(item.get(ChunkField.TYPE.name())));
					chunkMap.put(parentChunk.getId(), parentChunk);
				}
				validChunkMap.put(parentChunk.getId(), parentChunk);
				strPId = parentChunk.getPid();
			}
		}
		
		List<Chunk> chunkList2 = new ArrayList<>(validChunkMap.values());
		Collections.sort(chunkList2, new Comparator<Chunk>() {
			@Override
			public int compare(Chunk o1, Chunk o2) {
				Integer s1 = DataTypeUtils.asInteger(o1.get(ChunkField.SEQUENCE.name()), 0);
				Integer s2 = DataTypeUtils.asInteger(o2.get(ChunkField.SEQUENCE.name()), 0);
				return s1.compareTo(s2);
			}
		});
		
		Map<String, Chunk> processMap = new HashMap<String, Chunk>();
		List<Chunk> realChunkList = new ArrayList<>();
		for (Chunk chunk : chunkList) {
			realChunkList.add(chunk);
			
			if (!StringUtils.hasLength(chunk.getPid())) {
				continue;
			}

			if (net.ibizsys.central.cloud.core.util.domain.ChunkType.SOURCE.getValue().equals(chunk.getType())) {
				continue;
			}

			// 计算当前块的顶级块
			Chunk rootChunk = null;
			String strPId = chunk.getPid();
			while (StringUtils.hasLength(strPId)) {
				Chunk parentChunk = chunkMap.get(strPId);
				if (parentChunk == null) {
					log.warn(String.format("未能获取父标识[%1$s]指定片段", strPId));
					break;
				}
				rootChunk = parentChunk;
				strPId = parentChunk.getPid();
			}

			if (rootChunk != null) {
				String strChunkSN = this.getChunkSN();
				
				// 合并内容
				StringBuilder sb = new StringBuilder();
				fillRaptorClusterChunkContent(sb, rootChunk, rootChunk, chunkList2, processMap);
				
				//设置根相关信息
				rootChunk.setSimilarity(chunk.getSimilarity());
				rootChunk.setContent(sb.toString());
				rootChunk.setType(net.ibizsys.central.cloud.core.util.domain.ChunkType.CLUSTER.getValue());
				
				if(StringUtils.hasLength(strChunkSN)) {
					sb = null;
					sb = new StringBuilder();
					if (StringUtils.hasLength(rootChunk.getDocName())) {
						sb.append(String.format("# [%1$s](%2$s)，来自文档`%3$s`\r\n", strChunkSN, this.getChunkViewUrl(rootChunk.getId()), rootChunk.getDocName()));
					} else {
						sb.append(String.format("# [%1$s](%2$s)\r\n", strChunkSN, this.getChunkViewUrl(rootChunk.getId())));
					}
					sb.append("---\r\n");
					sb.append(rootChunk.getContent());
					rootChunk.setContent(sb.toString());
				}
				
				//插入到当前位置得得上一片
				realChunkList.add(realChunkList.size()-1, rootChunk);
				
			}
		}
		
		chunkList.clear();
		chunkList.addAll(realChunkList);
	}

	protected void fillRaptorClusterChunkContent(StringBuilder sb, Chunk rootChunk, Chunk parentChunk, List<Chunk> chunkList, Map<String, Chunk> processMap) throws Throwable {

		
		sb.append(parentChunk.getContent());
		
		for (Chunk chunk : chunkList) {
			if (!StringUtils.hasLength(chunk.getPid())) {
				continue;
			}

			if (parentChunk.getId().equals(chunk.getPid())) {
				if (net.ibizsys.central.cloud.core.util.domain.ChunkType.SOURCE.getValue().equals(chunk.getType())) {
					continue;
				}
				
				if(!processMap.containsKey(chunk.getId())) {
					processMap.put(chunk.getId(), chunk);
				}
				else {
					log.warn(String.format("Chunk[%1$s]重复", chunk.getId()));
					continue;
				}
				
				chunk.setType(net.ibizsys.central.cloud.core.util.domain.ChunkType.SOURCE.getValue());
				int nIgnored = DataTypeUtils.asInteger(chunk.get("_ignored"), 0);
				if(nIgnored == 0) {
					sb.append("\r\n");
					String strChunkSN = this.getChunkSN();
					if(StringUtils.hasLength(strChunkSN)) {
						sb.append(String.format("## [%1$s](%2$s)\r\n", strChunkSN, this.getChunkViewUrl(chunk.getId())));
						sb.append("---\r\n");
					}
					this.fillRaptorClusterChunkContent(sb, rootChunk, chunk, chunkList, processMap);
				}
				
				//修改碎片得父标识
				chunk.setPid(rootChunk.getId());
			}
		}
	}



	@Override
	public Page fetchChunksByHistories(String kb_ids, Map<String, Object> data) {
		return (Page) this.executeAction("获取知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_ids, DataAccessActions.READ)) {
					throw new ErrorException("无法读取指定知识库", Errors.ACCESSDENY);
				}
				
				try {
					ChunkSearchContext chunkSearchContext = new ChunkSearchContext(data);
					
					chunkIndexThreadLocal.set(0);
					chunkSearchContexThreadLocal.set(chunkSearchContext);
					return onFetchChunksByHistories(kb_ids, data);
				}
				finally{
					chunkIndexThreadLocal.set(0);
					chunkSearchContexThreadLocal.set(null);
				}
			}
		}, null);
	}

	protected int getMaxHistories() {
		return 3;
	}

	protected Page onFetchChunksByHistories(String kb_ids, Map<String, Object> data) throws Throwable {
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getKnowledgeBaseProxyDERuntime(false);
		Object histories = data.remove(IChunkSearchContext.PARAM_HISTORIES);
		if (ObjectUtils.isEmpty(histories)) {
			throw new Exception("未传入历史对话");
		}

		List<ChatMessage> historyList = JsonUtils.as(histories, ChatMessageListType);

		ChatMessage systemChatMessage = null;
		List<ChatMessage> validHistoryList = new ArrayList<ChatMessage>();
		if (!ObjectUtils.isEmpty(historyList)) {
			Collections.reverse(historyList);
			for (ChatMessage chatMessage : historyList) {
				if (ChatMessageRole.SYSTEM.getValue().equals(chatMessage.getRole())) {
					systemChatMessage = chatMessage;
					continue;
				}
				validHistoryList.add(0, chatMessage);
				if (validHistoryList.size() >= getMaxHistories()) {
					break;
				}
			}
		}

//		 if(systemChatMessage != null) {
//			 validHistoryList.add(0, systemChatMessage);
//		 }

		if (!ObjectUtils.isEmpty(validHistoryList)) {
			RecursiveCharacterTextSplitter recursiveCharacterTextSplitter = new RecursiveCharacterTextSplitter(Arrays.asList("\n", " ", ",", ".", "，", "。"), 256, 0);

			StringBuilder sb = new StringBuilder();
			
			String ids[] = kb_ids.split("[,]");
			List<Object> idList = new ArrayList<Object>();
			for (int i = 0; i < ids.length; i++) {
				idList.add(ids[i]);
			}
			
			IPSDEField guidancePSDEField = knowledgeBaseProxyDERuntime.getPSDEField(KnowledgeBaseField.GUIDANCE_PROMPT, true);
			boolean bFirst = true;
			if(guidancePSDEField!= null) {
				for(Object kbId : idList) {
					IEntityDTO kbEntityDTO = this.getKnowledgeBaseEntityDTO(kbId, true);
					if(kbEntityDTO == null) {
						log.error(String.format("指定知识库标识[%1$s]不存在", kbId));
						continue;
					}
					
					String strGuidanceInfo = kbEntityDTO.getString(guidancePSDEField.getLowerCaseName(), null);
					if(!StringUtils.hasLength(strGuidanceInfo)) {
						continue;
					}
					
					if(bFirst) {
						sb.append(String.format("# 检索知识库简介\n"));
						bFirst = false;
					}
					
					
					sb.append(String.format("## %1$s\n```markdown\n%2$s\n```\n", knowledgeBaseProxyDERuntime.getReal().getMajorTextIf(kbEntityDTO), strGuidanceInfo));
				}
			}
			
			if(!bFirst) {
				sb.append(String.format("# 对话历史\n"));
			}
			
			for (ChatMessage chatMessage : validHistoryList) {
				String strContent = HtmlUtils.toPlainText(MarkdownUtils.toHtml(chatMessage.getContent()));
				strContent = strContent.replace("\r\n", "\n").replace("\n", " ");
				sb.append(String.format("%1$s：“%2$s”\n\n", chatMessage.getRole().toLowerCase(), recursiveCharacterTextSplitter.splitText(strContent).get(0)));
			}

			// String strPrompt = getMiniRagPrompt();
			String strPrompt = getHistories2queryPrompt();
			//strPrompt = strPrompt.replace("{query}", sb.toString());
			// strPrompt = strPrompt.replace("{query}", sb.toString());

			// sb.append(String.format("注意，使用中文回答# `%1$s`：\n%2$s\n\n",
			// chatMessage.getRole().toLowerCase(),
			// recursiveCharacterTextSplitter.splitText(strContent).get(0)));

			// 获取知识库配置
			ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
			chatCompletionRequest.setMessages(ChatMessagesBuilder.create().system(strPrompt).user(sb.toString()).build());
			// chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strPrompt).build());
			List<Map> questionList = null;
			try {
				ChatCompletionResult result = this.doChatCompletion(this.getQueryChatAgent(), chatCompletionRequest);
				JsonNode jsonNode = JsonUtils.toJsonNode(AIChatUtils.getJsonContent(result));
				if(jsonNode != null) {
					if(jsonNode instanceof ArrayNode) {
						questionList = JsonUtils.asList(jsonNode);
					}
					else
						if(jsonNode instanceof ObjectNode) {
							questionList = Arrays.asList(JsonUtils.asMap(jsonNode));
						}
				}
			}
			catch (Throwable ex) {
				log.error(String.format("分析用户查询意图发生异常，%1$s。请求内容：\r\n%2$s", ex.getMessage(), JsonUtils.toString(chatCompletionRequest.getMessages())), ex);
			}
			
			if (!ObjectUtils.isEmpty(questionList) && !ObjectUtils.isEmpty(questionList.get(0).get("question"))) {
				log.debug(String.format("Histories2Query返回：\r\n%1$s", questionList));
				
				List<String> queryList = new ArrayList<String>();
				List<Map> tripletList = new ArrayList<>();
				
				for(Map ret : questionList) {
					String strQuestion = (String)ret.get("question");
					Object triplet = ret.get("graphrag");
					if(StringUtils.hasLength(strQuestion)) {
						queryList.add(strQuestion);
					}
					if(triplet instanceof Map && !ObjectUtils.isEmpty(triplet)) {
						tripletList.add((Map)triplet);
					}
				}
				
				if(queryList.size()>1) {
					data.put(IChunkSearchContext.PARAM_QUERIES, queryList);
				}
				else {
					data.put(IChunkSearchContext.PARAM_QUERY, queryList.get(0));
				}
				
				if(tripletList.size()>0) {
					if(tripletList.size()>1) {
						data.put(IChunkSearchContext.PARAM_TRIPLETS, tripletList);
					}
					else {
						data.put(IChunkSearchContext.PARAM_TRIPLET, tripletList.get(0));
					}
				}
				
				Page page = this.onFetchChunks(kb_ids, data);
				if (page instanceof PageImpl) {
					((PageImpl) page).getMetadataIf().put(IChunkSearchContext.PARAM_QUERY, queryList.get(0));
					if(tripletList.size()>0) {
						((PageImpl) page).getMetadataIf().put(IChunkSearchContext.PARAM_TRIPLET, tripletList.get(0));
					}
					if(queryList.size()>1) {
						((PageImpl) page).getMetadataIf().put(IChunkSearchContext.PARAM_QUERIES, queryList);
					}
					if(tripletList.size()>1) {
						((PageImpl) page).getMetadataIf().put(IChunkSearchContext.PARAM_TRIPLETS, tripletList);
					}
				}
				return page;
			} else {
				// 没有问题，直接查询
				String strQuestion = validHistoryList.get(validHistoryList.size() - 1).getContent();
				if (!ObjectUtils.isEmpty(strQuestion) && strQuestion.length() >= 6) {
					data.put("query", strQuestion);
					Page page = this.onFetchChunks(kb_ids, data);
					if (page instanceof PageImpl) {
						if(strQuestion.length()<=256) {
							((PageImpl) page).getMetadataIf().put("query", strQuestion);
						}
						((PageImpl) page).getMetadataIf().put("original", true);
					}
					return page;
				}
			}
		}
		ChunkSearchContext chunkSearchContext = new ChunkSearchContext(data);
		return new PageImpl<Chunk>(Collections.EMPTY_LIST, chunkSearchContext.getPageable(), 0);
	}

	protected String getTemplateContent(String strTemplate, Map<String, String> variables) {
		if (!ObjectUtils.isEmpty(variables)) {
			for (java.util.Map.Entry<String, String> entry : variables.entrySet()) {
				String strContent = ObjectUtils.isEmpty(entry.getValue())?"":entry.getValue();
				strTemplate = strTemplate.replace(String.format("{%1$s}", entry.getKey()), strContent);
			}
		}
		return strTemplate;
	}

	protected String getHistories2queryPrompt() {
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(SysKnowledgeBaseUtilRuntimeBase.class, "Histories2queryPrompt.md", false);
	}

	protected String getMiniRagQuery2kwdPrompt() {
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(SysKnowledgeBaseUtilRuntimeBase.class, "MiniRagQuery2kwdPrompt.md", false);
	}

	protected String getGraphEntityDisambiguationPrompt(GraphRAGConfig graphRAGConfig) {
		if(StringUtils.hasLength(graphRAGConfig.getDisambiguationPrompt())) {
			return graphRAGConfig.getDisambiguationPrompt();
		}
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(SysKnowledgeBaseUtilRuntimeBase.class, "GraphEntityDisambiguationPrompt.md", false);
	}

	protected String getGraphRelationDisambiguationPrompt(GraphRAGConfig graphRAGConfig) {
		if(StringUtils.hasLength(graphRAGConfig.getRelationDisambiguationPrompt())) {
			return graphRAGConfig.getRelationDisambiguationPrompt();
		}
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(SysKnowledgeBaseUtilRuntimeBase.class, "GraphRelationDisambiguationPrompt.md", false);
	}
	

	protected String getAIAgentConfigId(Object tag) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("key", tag);
		params.put("system", this.getSystemRuntime().getDeploySystemId());
		if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
			if(StringUtils.hasLength(iServiceSystemRuntime.getMainSystemId())) {
				params.put("system", iServiceSystemRuntime.getMainSystemId());
			}
		}
		return ExpressionUtils.getValue(this.strAIAgentConfigIdFormat, params).toLowerCase();
	}
	
	@Override
	public List listFiles(String kb_id, Map<String, Object> params) {
		return (List) this.executeAction("列出文档集合", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.READ)) {
					throw new ErrorException("无法读取指定知识库", Errors.ACCESSDENY);
				}
				return onListFiles(kb_id, params);
			}
		}, null);
	}
	
	
	protected List onListFiles(String kb_id, Map<String, Object> params) throws Throwable{
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getKnowledgeBaseProxyDERuntime(false);
		IPSDEAction lsPSDEAction = knowledgeBaseProxyDERuntime.getPSDEAction(KnowledgeBaseAction.LS);
		if(lsPSDEAction == null) {
			throw new Exception(String.format("未提供[LS]行为"));
		}
		
		return (List)knowledgeBaseProxyDERuntime.getReal().executeAction(lsPSDEAction.getName(), lsPSDEAction, new Object[] {kb_id});
	}
	
	

	@Override
	public Document createDocument(String kb_id, Document document) {
		return (Document) this.executeAction("建立文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.UPDATE)) {
					throw new ErrorException("无法写入指定知识库", Errors.ACCESSDENY);
				}
				return onCreateDocument(kb_id, document);
			}
		}, null);
	}
	
	
	protected Document onCreateDocument(String kb_id, Document document) throws Throwable{
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		
		boolean bRechunk = DataTypeUtils.asBoolean(document.get("rechunk"), false);
		document.reset("rechunk");
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		
		String strChunkMode =  DataTypeUtils.asString(document.get("chunk_method"), null);
		document.reset("chunk_method");
		if(StringUtils.hasLength(strChunkMode)) {
			data.put(DocumentField.CHUNK_METHOD.name(), strChunkMode.toUpperCase());
			data.put(DocumentField.CUSTOM_CHUNK.name(), EntityBase.BOOLEAN_TRUE);
		}
		
		if(StringUtils.hasLength(document.getId())) {
			data.put(IProxyDERuntime.FIELD_ID, document.getId());
		}
		data.put(IProxyDERuntime.FIELD_NAME, document.getName());
		data.put(DocumentField.STATUS.name(), DocumentStatus.READY.value());
		data.put(DocumentField.KNOWLEDGE_BASE_ID.name(), kb_id);
		data.put(DocumentField.CATEGORIES.name(), document.getCategories());
		data.put(DocumentField.CONTENT.name(), document.getContent());
		data.put(DocumentField.FILE_TYPE.name(), document.getFileType());
		data.put(DocumentField.TYPE.name(), document.getType());
		
		IEntityDTO documentEntityDTO = documentProxyDERuntime.getEntityDTO(data);
		documentProxyDERuntime.getReal().create(documentEntityDTO);
		
		document.resetAll();
		document = this.getDocument(kb_id, null, documentEntityDTO);
		
		if(bRechunk) {
			IPSDEAction rechunkPSDEAction = documentProxyDERuntime.getPSDEAction(DocumentAction.RECHUNK, true);
			if(rechunkPSDEAction!=null) {
				this.getSystemRuntime().threadRun(new Runnable() {
					@Override
					public void run() {
						try {
							documentProxyDERuntime.getReal().executeAction(rechunkPSDEAction.getName(), rechunkPSDEAction, new Object[] {documentEntityDTO});
						}
						catch (Throwable ex) {
							log.error(String.format("执行文档重切片发生异常，%1$s", ex.getMessage()), ex);
						}
					}
				});
			}
		}
		
		return document;
	}
	

	@Override
	public Document updateDocument(String kb_id, String document_id, Document document) {
		return (Document) this.executeAction("更新文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.UPDATE)) {
					throw new ErrorException("无法写入指定知识库", Errors.ACCESSDENY);
				}
				return onUpdateDocument(kb_id, document_id, document);
			}
		}, null);
	}
	
	protected Document onUpdateDocument(String kb_id, String document_id, Document document) throws Throwable{
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		
		boolean bRechunk = DataTypeUtils.asBoolean(document.get("rechunk"), false);
		document.reset("rechunk");
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		
		String strChunkMode =  DataTypeUtils.asString(document.get("chunk_method"), null);
		document.reset("chunk_method");
		if(StringUtils.hasLength(strChunkMode)) {
			data.put(DocumentField.CHUNK_METHOD.name(), strChunkMode.toUpperCase());
			data.put(DocumentField.CUSTOM_CHUNK.name(), EntityBase.BOOLEAN_TRUE);
		}
		
		
		data.put(IProxyDERuntime.FIELD_ID, document_id);
		if(document.containsName()) {
			data.put(IProxyDERuntime.FIELD_NAME, document.getName());
		}
		data.put(DocumentField.STATUS.name(), DocumentStatus.READY.value());
		data.put(DocumentField.KNOWLEDGE_BASE_ID.name(), kb_id);
		if(document.containsCategories()) {
			data.put(DocumentField.CATEGORIES.name(), document.getCategories());
		}
		if(document.containsContent()) {
			data.put(DocumentField.CONTENT.name(), document.getContent());
		}
		
		if(document.containsFileType()) {
			data.put(DocumentField.FILE_TYPE.name(), document.getFileType());
		}
		if(document.containsType()) {
			data.put(DocumentField.TYPE.name(), document.getType());
		}

		IEntityDTO documentEntityDTO = documentProxyDERuntime.getEntityDTO(data);
		
		IEntityDTO lastDocumentEntityDTO = documentProxyDERuntime.getReal().rawGet(documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		//判断知识库是否一致
		Object curKBId = documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		Object lastKBId = documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		
		if(ObjectUtils.isEmpty(curKBId)) {
			throw new Exception("传入知识库标识无效");
		}
		
		if(!curKBId.equals(lastKBId)) {
			throw new Exception("知识库标识不一致");
		}
		
		documentProxyDERuntime.getReal().update(documentEntityDTO);
		
		document.resetAll();
		document = this.getDocument(kb_id, document_id, documentEntityDTO);
		
		if(bRechunk) {
			IPSDEAction rechunkPSDEAction = documentProxyDERuntime.getPSDEAction(DocumentAction.RECHUNK, true);
			if(rechunkPSDEAction!=null) {
				this.getSystemRuntime().threadRun(new Runnable() {
					@Override
					public void run() {
						try {
							documentProxyDERuntime.getReal().executeAction(rechunkPSDEAction.getName(), rechunkPSDEAction, new Object[] {documentEntityDTO});
						}
						catch (Throwable ex) {
							log.error(String.format("执行文档重切片发生异常，%1$s", ex.getMessage()), ex);
						}
					}
				});
			}
		}
		
		return document;
	}
	
	@Override
	public Document saveDocument(String kb_id, String document_id, Document document) {
		return (Document) this.executeAction("保存文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.UPDATE)) {
					throw new ErrorException("无法写入指定知识库", Errors.ACCESSDENY);
				}
				return onSaveDocument(kb_id, document_id, document);
			}
		}, null);
	}
	
	protected Document onSaveDocument(String kb_id, String document_id, Document document) throws Throwable{
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put(IProxyDERuntime.FIELD_ID, document_id);
		
		IEntityDTO documentEntityDTO = documentProxyDERuntime.getEntityDTO(data);
		if(documentProxyDERuntime.getReal().existsData(documentProxyDERuntime.getReal().getKeyFieldValue(documentEntityDTO))) {
			return this.onUpdateDocument(kb_id, document_id, document);
		}
		else {
			return this.onCreateDocument(kb_id, document);
		}
	}

	@Override
	public Document getDocument(String kb_id, String document_id) {
		return (Document) this.executeAction("获取文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.READ)) {
					throw new ErrorException("无法读取指定知识库", Errors.ACCESSDENY);
				}
				return onGetDocument(kb_id, document_id);
			}
		}, null);
	}
	
	protected Document onGetDocument(String kb_id, String document_id) throws Throwable{
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		
		Map<String, Object> queryParams = null;
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if (requestAttributes instanceof ServletRequestAttributes) {
			queryParams = RestUtils.queryString2Map(((ServletRequestAttributes) requestAttributes).getRequest().getQueryString(), true, KeyNameCaseMode.LOWER);
		}
		
		boolean tryMode = false;
		if(queryParams != null) {
			tryMode = DataTypeUtils.asBoolean(queryParams.get(ICloudKBClient.GET_DOCUMENT_PARAM__TRYMODE), false);
		}
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put(IProxyDERuntime.FIELD_ID, document_id);
		data.put(DocumentField.KNOWLEDGE_BASE_ID.name(), kb_id);
		
		IEntityDTO documentEntityDTO = documentProxyDERuntime.getEntityDTO(data);
		IEntityDTO lastDocumentEntityDTO = null;
		try {
			lastDocumentEntityDTO = documentProxyDERuntime.getReal().rawGet(documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName()));	
		}
		catch (Throwable ex) {
			if(tryMode) {
				return null;
			}
			throw ex;
		}
		
		//判断知识库是否一致
		Object curKBId = documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		Object lastKBId = documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		
		if(ObjectUtils.isEmpty(curKBId)) {
			throw new Exception("传入知识库标识无效");
		}
		
		if(!curKBId.equals(lastKBId)) {
			throw new Exception("知识库标识不一致");
		}
		
		return this.getDocument(kb_id, document_id, lastDocumentEntityDTO);
	}
	
	protected Document getDocument(String kb_id, String document_id, IEntityDTO documentEntityDTO) throws Throwable{
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		Document document = new Document();
		if(StringUtils.hasLength(document_id)) {
			document.setId(document_id);
		}
		else {
			document.setId(documentEntityDTO.getString(documentProxyDERuntime.getIdPSDEField().getLowerCaseName(), null));
		}
		document.setName(documentEntityDTO.getString(documentProxyDERuntime.getNamePSDEField().getLowerCaseName(), null));
		document.setKBId(kb_id);
		document.setCategories((String)documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.CATEGORIES));
		document.setContent((String)documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.CONTENT));
		String strFileType = (String)documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.FILE_TYPE);
		Object file = documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.FILE);
		if(!ObjectUtils.isEmpty(file)) {
			JsonNode node = JsonUtils.toJsonNode(file);
			if (node instanceof ArrayNode) {
				ArrayNode arrayNode = (ArrayNode)node;
				if(arrayNode.size()>0) {
					node = arrayNode.get(0);
				}
				else {
					node = null;
				}
			}
			if(node != null) {
				net.ibizsys.runtime.util.domain.File ossFile = JsonUtils.as(node, net.ibizsys.runtime.util.domain.File.class);
				if(StringUtils.hasLength(ossFile.getFileName())) {
					String strRealFileType = FilenameUtils.getExtension(ossFile.getFileName());
					if(StringUtils.hasLength(strRealFileType)) {
						strFileType = strRealFileType;
					}
				}
			}
		}
		if(StringUtils.hasLength(strFileType))
			document.setFileType(strFileType.toLowerCase());
		return document;
	}
	
	@Override
	public void downloadDocument(String kb_id, String document_id, HttpServletRequest request, HttpServletResponse response) {
		this.executeAction("下载文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.READ)) {
					throw new ErrorException("无法读取指定知识库", Errors.ACCESSDENY);
				}
				onDownloadDocument(kb_id, document_id, request, response);
				return null;
			}
		}, null);
	}
	
	protected void onDownloadDocument(String kb_id, String document_id, HttpServletRequest request, HttpServletResponse response) throws Throwable{
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put(IProxyDERuntime.FIELD_ID, document_id);
		data.put(DocumentField.KNOWLEDGE_BASE_ID.name(), kb_id);
		
		IEntityDTO documentEntityDTO = documentProxyDERuntime.getEntityDTO(data);
		
		IEntityDTO lastDocumentEntityDTO = documentProxyDERuntime.getReal().rawGet(documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		//判断知识库是否一致
		Object curKBId = documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		Object lastKBId = documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		
		if(ObjectUtils.isEmpty(curKBId)) {
			throw new Exception("传入知识库标识无效");
		}
		
		if(!curKBId.equals(lastKBId)) {
			throw new Exception("知识库标识不一致");
		}
		
		Map<String, Object> queryParams = RestUtils.queryString2Map(request.getQueryString(), true, KeyNameCaseMode.LOWER);
		//如果指定内容类型，则需要先下载
		Object type = queryParams.get(ICloudKBClient.DOWNLOAD_DOCUMENT_PARAM__TYPE);
		if(!ObjectUtils.isEmpty(type) && !ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__RAW.equalsIgnoreCase(String.valueOf(type))) {
			if(ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__FULL.equalsIgnoreCase(String.valueOf(type))) {
				//获取
				String fullText = (String)this.getDocumentContent(lastDocumentEntityDTO, ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__FULL);
				RestUtils.downloadFile(response, String.format("%1$s.full.md", documentProxyDERuntime.getReal().getMajorTextIf(lastDocumentEntityDTO, "document")), new ByteArrayInputStream(fullText.getBytes(StandardCharsets.UTF_8)), false);
				return;
			}
			
			if(ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__XLSX.equalsIgnoreCase(String.valueOf(type))) {
				//获取base64编码
				String fullText = (String)this.getDocumentContent(lastDocumentEntityDTO, String.valueOf("base64_"+type));
				RestUtils.downloadFile(response, String.format("%1$s.%2$s", documentProxyDERuntime.getReal().getMajorTextIf(lastDocumentEntityDTO, "document"), type), new ByteArrayInputStream(Base64.getDecoder().decode(fullText)), false);
				return;
			}
			
			
			String fullText = (String)this.getDocumentContent(lastDocumentEntityDTO, String.valueOf(type));
			RestUtils.downloadFile(response, String.format("%1$s.%2$s", documentProxyDERuntime.getReal().getMajorTextIf(lastDocumentEntityDTO, "document"), type), new ByteArrayInputStream(fullText.getBytes(StandardCharsets.UTF_8)), false);
			return;
		}
		
		
		String content = (String)documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.CONTENT);
		if(!ObjectUtils.isEmpty(content)) {
			String fileType = (String)documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.FILE_TYPE);
			if(ObjectUtils.isEmpty(fileType)) {
				fileType = "md";
			}
			RestUtils.downloadFile(response, String.format("%1$s.%2$s", documentProxyDERuntime.getReal().getMajorTextIf(lastDocumentEntityDTO, "document"), fileType), new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8)), false);
			return;
		}
		
		Object file = documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.FILE);
		if(!ObjectUtils.isEmpty(file)) {
			JsonNode node = JsonUtils.toJsonNode(file);
			if (node instanceof ArrayNode) {
				ArrayNode arrayNode = (ArrayNode)node;
				if(arrayNode.size()>0) {
					node = arrayNode.get(0);
				}
				else {
					node = null;
				}
			}
			
			if(node == null) {
				throw new Exception("文件对象无效");
			}
			net.ibizsys.runtime.util.domain.File ossFile = JsonUtils.as(node, net.ibizsys.runtime.util.domain.File.class);
			String strDownloadUrl = "lb://ibizcloud-oss/ibizutil/download/";
			if(StringUtils.hasLength(ossFile.getFolder())) {
				strDownloadUrl += String.format("%1$s/%2$s", java.net.URLDecoder.decode(ossFile.getFolder(), "UTF-8"), java.net.URLDecoder.decode(ossFile.getFileId(), "UTF-8"));
			}
			else {
				strDownloadUrl += String.format("%1$s", java.net.URLDecoder.decode(ossFile.getFileId(), "UTF-8"));
			}
			response.sendRedirect(strDownloadUrl);
			return;
		}
		
		
//		Document document = new Document();
//		document.setId(lastDocumentEntityDTO.getString(documentProxyDERuntime.getIdPSDEField().getLowerCaseName(), null));
//		document.setName(lastDocumentEntityDTO.getString(documentProxyDERuntime.getNamePSDEField().getLowerCaseName(), null));
//		document.setKBId(kb_id);
//		return document;
	}

	@Override
	public Integer deleteDocument(String kb_id, String document_id) {
		return (Integer) this.executeAction("删除文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.UPDATE)) {
					throw new ErrorException("无法写入指定知识库", Errors.ACCESSDENY);
				}
				return onDeleteDocument(kb_id, document_id);
			}
		}, null);
	}
	
	protected Integer onDeleteDocument(String kb_id, String document_id) throws Throwable{
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put(IProxyDERuntime.FIELD_ID, document_id);
		data.put(DocumentField.KNOWLEDGE_BASE_ID.name(), kb_id);
		
		IEntityDTO documentEntityDTO = documentProxyDERuntime.getEntityDTO(data);
		IEntityDTO lastDocumentEntityDTO = documentProxyDERuntime.getReal().rawGet(documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		
		//判断知识库是否一致
		Object curKBId = documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		Object lastKBId = documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		
		if(ObjectUtils.isEmpty(curKBId)) {
			throw new Exception("传入知识库标识无效");
		}
		
		if(!curKBId.equals(lastKBId)) {
			throw new Exception("知识库标识不一致");
		}
		
		documentProxyDERuntime.getReal().remove(documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		return 1;
	}
	

	@Override
	public Chunk createChunk(String kb_id, String document_id, Chunk chunk) {
		return (Chunk) this.executeAction("建立片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.UPDATE)) {
					throw new ErrorException("无法写入指定知识库", Errors.ACCESSDENY);
				}
				return onCreateChunk(kb_id, document_id, chunk);
			}
		}, null);
	}
	
	protected String calcChunkName(Chunk chunk) {
		String strName = chunk.getName();
		if(ObjectUtils.isEmpty(strName) && StringUtils.hasLength(chunk.getContent())) {
			strName = chunkNameRecursiveCharacterTextSplitter.splitText(chunk.getContent()).get(0);
		}
		if (StringUtils.hasLength(strName)) {
			if(!strName.equals(chunk.getContent())) {
				strName = strName.trim().replace("\r\n", "\n").replace("\n", ",");
				if (strName.length() > 150) {
					strName = strName.substring(0, 150) + "...";
				}
				else {
					if(ObjectUtils.isEmpty(chunk.getName())) {
						strName = strName + "...";
					}
				}
			}
			else {
				strName = strName.trim().replace("\r\n", "\n").replace("\n", ",");
				if (strName.length() > 150) {
					strName = strName.substring(0, 150) + "...";
				}
			}
		}
		return strName;
	}
	
	
	protected Chunk onCreateChunk(String kb_id, String document_id, Chunk chunk) throws Throwable{
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put(IProxyDERuntime.FIELD_ID, document_id);
		data.put(DocumentField.KNOWLEDGE_BASE_ID.name(), kb_id);
		
		IEntityDTO documentEntityDTO = documentProxyDERuntime.getEntityDTO(data);
		IEntityDTO lastDocumentEntityDTO = documentProxyDERuntime.getReal().rawGet(documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		//判断知识库是否一致
		Object curKBId = documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		Object lastKBId = documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		
		if(ObjectUtils.isEmpty(curKBId)) {
			throw new Exception("传入知识库标识无效");
		}
		
		if(!curKBId.equals(lastKBId)) {
			throw new Exception("知识库标识不一致");
		}
	
		Map<String, Object> item = new LinkedHashMap<String, Object>();
		if (StringUtils.hasLength(chunk.getId())) {
			item.put(FIELD_ID, chunk.getId());
		}
		
		String strContent = chunk.getContent();
		if(StringUtils.hasLength(strContent)) {
			strContent = strContent.replace("\r\n", "\n").replaceFirst("^\\n+", "");
			chunk.setContent(strContent);
		}
		
		
		// 放入名称
		String strName = calcChunkName(chunk);
		item.put(FIELD_NAME, strName);
		item.put(ChunkField.DOCUMENT_ID.name(), document_id);
		item.put(ChunkField.CONTENT.name(), chunk.getContent());
		item.put(ChunkField.QUESTIONS.name(), chunk.getQuestion());
		//item.put(ChunkField.SEQUENCE.name(), chunk.get(ChunkField.SEQUENCE.name()));
		if(StringUtils.hasLength(chunk.getType())) {
			item.put(ChunkField.TYPE.name(), chunk.getType());
		}
		else {
			item.put(ChunkField.TYPE.name(), net.ibizsys.central.cloud.core.util.domain.ChunkType.MANUAL.getValue());
		}
		
		item.put(ChunkField.KEYWORDS.name(), chunk.getKeyword());
		item.put(ChunkField.TAGS.name(), chunk.getTag());

		IEntityDTO chunkEntityDTO = chunkProxyDERuntime.getEntityDTO(item);
		
		chunkProxyDERuntime.getReal().create(chunkEntityDTO);
		
		chunk.setId(chunkEntityDTO.getString(documentProxyDERuntime.getIdPSDEField().getLowerCaseName(), null));
		chunk.setKBId(kb_id);
		chunk.setDocId(document_id);
		chunk.setName(chunkEntityDTO.getString(chunkProxyDERuntime.getNamePSDEField().getLowerCaseName(), null));
		chunk.setContent((String)chunkProxyDERuntime.getFieldValue(chunkEntityDTO, ChunkField.CONTENT));
		chunk.setQuestion((String)chunkProxyDERuntime.getFieldValue(chunkEntityDTO, ChunkField.QUESTIONS));
		chunk.setKeyword((String)chunkProxyDERuntime.getFieldValue(chunkEntityDTO, ChunkField.KEYWORDS));
		chunk.setType((String)chunkProxyDERuntime.getFieldValue(chunkEntityDTO, ChunkField.TYPE));
		chunk.setTag((String)chunkProxyDERuntime.getFieldValue(chunkEntityDTO, ChunkField.TAGS));
		return chunk;
	}

	@Override
	public Chunk updateChunk(String kb_id, String document_id, String chunk_id, Chunk chunk) {
		return (Chunk) this.executeAction("更新片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.UPDATE)) {
					throw new ErrorException("无法写入指定知识库", Errors.ACCESSDENY);
				}
				return onUpdateChunk(kb_id, document_id, chunk_id, chunk);
			}
		}, null);
	}
	
	
	
	protected Chunk onUpdateChunk(String kb_id, String document_id, String chunk_id, Chunk chunk) throws Throwable{
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put(IProxyDERuntime.FIELD_ID, document_id);
		data.put(DocumentField.KNOWLEDGE_BASE_ID.name(), kb_id);
		
		IEntityDTO documentEntityDTO = documentProxyDERuntime.getEntityDTO(data);
		IEntityDTO lastDocumentEntityDTO = documentProxyDERuntime.getReal().rawGet(documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		//判断知识库是否一致
		Object curKBId = documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		Object lastKBId = documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		
		if(ObjectUtils.isEmpty(curKBId)) {
			throw new Exception("传入知识库标识无效");
		}
		
		if(!curKBId.equals(lastKBId)) {
			throw new Exception("知识库标识不一致");
		}
		
		data.clear();
		data.put(IProxyDERuntime.FIELD_ID, chunk_id);
		IEntityDTO chunkEntityDTO = chunkProxyDERuntime.getEntityDTO(data);
		IEntityDTO lastChunkEntityDTO = chunkProxyDERuntime.getReal().rawGet(chunkEntityDTO.get(chunkProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		Object curDocId = documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName());
		Object lastDocId = chunkProxyDERuntime.getFieldValue(lastChunkEntityDTO, ChunkField.DOCUMENT_ID);
		if(!curDocId.equals(lastDocId)) {
			throw new Exception("文档标识不一致");
		}
		
	
		Map<String, Object> item = new LinkedHashMap<String, Object>();
		item.put(FIELD_ID, chunk_id);
		
		String strContent = chunk.getContent();
		if(StringUtils.hasLength(strContent)) {
			strContent = strContent.replace("\r\n", "\n").replaceFirst("^\\n+", "");
			chunk.setContent(strContent);
		}
		
		// 放入名称
		if(chunk.containsName()) {
			String strName = calcChunkName(chunk);
			item.put(FIELD_NAME, strName);
		}
		
		item.put(ChunkField.DOCUMENT_ID.name(), document_id);
		if(chunk.containsContent()) {
			item.put(ChunkField.CONTENT.name(), chunk.getContent());
		}
		if(chunk.containsQuestion()) {
			item.put(ChunkField.QUESTIONS.name(), chunk.getQuestion());
		}
		
		//item.put(ChunkField.SEQUENCE.name(), chunk.get(ChunkField.SEQUENCE.name()));
		if(chunk.containsType()) {
			item.put(ChunkField.TYPE.name(), chunk.getType());
		}
		if(chunk.containsKeyword()) {
			item.put(ChunkField.KEYWORDS.name(), chunk.getKeyword());
		}
		if(chunk.containsTag()) {
			item.put(ChunkField.TAGS.name(), chunk.getTag());
		}
		chunkEntityDTO = chunkProxyDERuntime.getEntityDTO(item);
		
		chunkProxyDERuntime.getReal().update(chunkEntityDTO);
		
		chunk.setId(chunk_id);
		chunk.setKBId(kb_id);
		chunk.setDocId(document_id);
		chunk.setName(chunkEntityDTO.getString(chunkProxyDERuntime.getNamePSDEField().getLowerCaseName(), null));
		chunk.setContent((String)chunkProxyDERuntime.getFieldValue(chunkEntityDTO, ChunkField.CONTENT));
		chunk.setQuestion((String)chunkProxyDERuntime.getFieldValue(chunkEntityDTO, ChunkField.QUESTIONS));
		chunk.setKeyword((String)chunkProxyDERuntime.getFieldValue(chunkEntityDTO, ChunkField.KEYWORDS));
		chunk.setType((String)chunkProxyDERuntime.getFieldValue(chunkEntityDTO, ChunkField.TYPE));
		chunk.setTag((String)chunkProxyDERuntime.getFieldValue(chunkEntityDTO, ChunkField.TAGS));
		return chunk;
	}
	
	
	@Override
	public Chunk saveChunk(String kb_id, String document_id, String chunk_id, Chunk chunk) {
		return (Chunk) this.executeAction("保存片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.UPDATE)) {
					throw new ErrorException("无法写入指定知识库", Errors.ACCESSDENY);
				}
				return onSaveChunk(kb_id, document_id, chunk_id, chunk);
			}
		}, null);
	}
	
	protected Chunk onSaveChunk(String kb_id, String document_id, String chunk_id, Chunk chunk) throws Throwable{
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put(IProxyDERuntime.FIELD_ID, chunk_id);
		IEntityDTO chunkEntityDTO = chunkProxyDERuntime.getEntityDTO(data);
		if(chunkProxyDERuntime.getReal().existsData(chunkProxyDERuntime.getReal().getKeyFieldValue(chunkEntityDTO))) {
			return this.onUpdateChunk(kb_id, document_id, chunk_id, chunk);
		}
		else {
			return this.onCreateChunk(kb_id, document_id, chunk);
		}
	}

	@Override
	public Chunk getChunk(String kb_id, String document_id, String chunk_id) {
		return (Chunk)this.executeAction("获取片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.UPDATE)) {
					throw new ErrorException("无法读取指定知识库", Errors.ACCESSDENY);
				}
				return onGetChunk(kb_id, document_id, chunk_id);
			}
		}, null);
	}
	
	protected Chunk onGetChunk(String kb_id, String document_id, String chunk_id) throws Throwable{
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put(IProxyDERuntime.FIELD_ID, document_id);
		data.put(DocumentField.KNOWLEDGE_BASE_ID.name(), kb_id);
		
		IEntityDTO documentEntityDTO = documentProxyDERuntime.getEntityDTO(data);
		IEntityDTO lastDocumentEntityDTO = documentProxyDERuntime.getReal().rawGet(documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		//判断知识库是否一致
		Object curKBId = documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		Object lastKBId = documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		
		if(ObjectUtils.isEmpty(curKBId)) {
			throw new Exception("传入知识库标识无效");
		}
		
		if(!curKBId.equals(lastKBId)) {
			throw new Exception("知识库标识不一致");
		}
		
		data.clear();
		data.put(IProxyDERuntime.FIELD_ID, chunk_id);
		IEntityDTO chunkEntityDTO = chunkProxyDERuntime.getEntityDTO(data);
		IEntityDTO lastChunkEntityDTO = chunkProxyDERuntime.getReal().get(chunkEntityDTO.get(chunkProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		Object curDocId = documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName());
		Object lastDocId = chunkProxyDERuntime.getFieldValue(lastChunkEntityDTO, ChunkField.DOCUMENT_ID);
		if(!curDocId.equals(lastDocId)) {
			throw new Exception("文档标识不一致");
		}
		
		Chunk chunk = new Chunk();
		chunk.setId(chunk_id);
		chunk.setKBId(kb_id);
		chunk.setDocId(document_id);
		chunk.setName(lastChunkEntityDTO.getString(chunkProxyDERuntime.getNamePSDEField().getLowerCaseName(), null));
		chunk.setContent((String)chunkProxyDERuntime.getFieldValue(lastChunkEntityDTO, ChunkField.CONTENT));
		chunk.setQuestion((String)chunkProxyDERuntime.getFieldValue(lastChunkEntityDTO, ChunkField.QUESTIONS));
		chunk.setKeyword((String)chunkProxyDERuntime.getFieldValue(lastChunkEntityDTO, ChunkField.KEYWORDS));
		chunk.setType((String)chunkProxyDERuntime.getFieldValue(lastChunkEntityDTO, ChunkField.TYPE));
		chunk.setTag((String)chunkProxyDERuntime.getFieldValue(lastChunkEntityDTO, ChunkField.TAGS));
		return chunk;
	}

	@Override
	public Integer deleteChunk(String kb_id, String document_id, String chunk_id) {
		return (Integer) this.executeAction("删除片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(!testKnowledgeBaseAccessAction(kb_id, DataAccessActions.UPDATE)) {
					throw new ErrorException("无法写入指定知识库", Errors.ACCESSDENY);
				}
				return onDeleleChunk(kb_id, document_id, chunk_id);
			}
		}, null);
	}
	
	protected Integer onDeleleChunk(String kb_id, String document_id, String chunk_id) throws Throwable{
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getChunkProxyDERuntime(false);
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getDocumentProxyDERuntime(false);
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put(IProxyDERuntime.FIELD_ID, document_id);
		data.put(DocumentField.KNOWLEDGE_BASE_ID.name(), kb_id);
		
		IEntityDTO documentEntityDTO = documentProxyDERuntime.getEntityDTO(data);
		IEntityDTO lastDocumentEntityDTO = documentProxyDERuntime.getReal().rawGet(documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		//判断知识库是否一致
		Object curKBId = documentProxyDERuntime.getFieldValue(documentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		Object lastKBId = documentProxyDERuntime.getFieldValue(lastDocumentEntityDTO, DocumentField.KNOWLEDGE_BASE_ID);
		
		if(ObjectUtils.isEmpty(curKBId)) {
			throw new Exception("传入知识库标识无效");
		}
		
		if(!curKBId.equals(lastKBId)) {
			throw new Exception("知识库标识不一致");
		}
		
		data.clear();
		data.put(IProxyDERuntime.FIELD_ID, chunk_id);
		IEntityDTO chunkEntityDTO = chunkProxyDERuntime.getEntityDTO(data);
		IEntityDTO lastChunkEntityDTO = chunkProxyDERuntime.getReal().rawGet(chunkEntityDTO.get(chunkProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		Object curDocId = documentEntityDTO.get(documentProxyDERuntime.getIdPSDEField().getLowerCaseName());
		Object lastDocId = chunkProxyDERuntime.getFieldValue(lastChunkEntityDTO, ChunkField.DOCUMENT_ID);
		if(!curDocId.equals(lastDocId)) {
			throw new Exception("文档标识不一致");
		}
		
		chunkProxyDERuntime.getReal().remove(chunkEntityDTO.get(chunkProxyDERuntime.getIdPSDEField().getLowerCaseName()));
		return 1;
	}
	
	protected String getChunkSN() {
		IChunkSearchContext iChunkSearchContext = chunkSearchContexThreadLocal.get();
		if(iChunkSearchContext == null) {
			return null;
		}
		
		String strChunkSNPrefix = iChunkSearchContext.getChunkSNPrefix();
		if(ObjectUtils.isEmpty(strChunkSNPrefix)) {
			return null;
		}
		
		Integer value = DataTypeUtils.asInteger(chunkIndexThreadLocal.get(), 0);
		value ++;
		
		chunkIndexThreadLocal.set(value);
		return String.format("%1$s%2$d", strChunkSNPrefix, value);
	}
	
	
	protected String getChunkViewUrl(String strId) {
		IChunkSearchContext iChunkSearchContext = chunkSearchContexThreadLocal.get();
		if(iChunkSearchContext == null) {
			return null;
		}
		String strChunkViewUrl = iChunkSearchContext.getChunkViewUrl();
		if(ObjectUtils.isEmpty(strChunkViewUrl)) {
			return null;
		}
		return strChunkViewUrl.replace("{id}", strId);
	}
	
	
	protected boolean testKnowledgeBaseAccessAction(String kb_ids, String strAccessAction) throws Exception {
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getKnowledgeBaseProxyDERuntime(false);
		
		Set<Object> set = new HashSet<>();
		String ids[] = kb_ids.split("[,]");
		for (int i = 0; i < ids.length; i++) {
			set.add(ids[i]);
		}
		if(!knowledgeBaseProxyDERuntime.getReal().getDataEntityAccessManager().testDataAccessActionIf(UserContext.getCurrent(), set, strAccessAction)) {
			return false;
		}
		return true;	
	}
	
}
