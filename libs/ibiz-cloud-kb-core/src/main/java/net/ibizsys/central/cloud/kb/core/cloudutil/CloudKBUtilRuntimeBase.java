package net.ibizsys.central.cloud.kb.core.cloudutil;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ClusterEmbeddingsRequest;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.cloud.core.util.domain.KBAccess;
import net.ibizsys.central.cloud.kb.core.addin.ICloudKBUtilRTAddin;
import net.ibizsys.central.cloud.kb.core.addin.IKBAccessAgent;
import net.ibizsys.central.cloud.kb.core.addin.IKBPlatform;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.central.util.PageRequest;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class CloudKBUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudKBUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudKBUtilRuntimeBase.class);

	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudKBUtilRTAddin.class, "KBPLATFORM:MILVUS", "net.ibizsys.central.cloud.kb.milvus.addin.MilvusKBPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudKBUtilRTAddin.class, "KBPLATFORM:RAGFLOW", "net.ibizsys.central.cloud.kb.ragflow.addin.RagFlowKBPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudKBUtilRTAddin.class, "KBPLATFORM:CLOUD", "net.ibizsys.central.cloud.kb.core.addin.CloudKBPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudKBUtilRTAddin.class, "KBPLATFORM:OUTSIDE_CLOUD", "net.ibizsys.central.cloud.kb.core.addin.OutsideCloudKBPlatform");
	}

	private Map<String, IKBAccessAgent> kbAccessAgentMap = new HashMap<String, IKBAccessAgent>();
	private Map<String, IKBPlatform> kbPlatformMap = null;
	private Map<String, IConfigListener> kbAccessConfigListenerMap = new HashMap<String, IConfigListener>();
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;

	private String strCloudKBUtilRuntimeUniqueTag = null;

	private String strDefaultAgent = KBPLATFORM_RAGFLOW;

	private String strClusterEmbeddingsUrl = null;

	private Map<String, Object> fetchKBsParams = null;
	
	
	@Override
	protected String getGlobalConfigId() {
		return CLOUDKBUTIL_CONFIGFOLDER;
	}

	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_KB;
	}

	@Override
	protected boolean isEnableReloadSetting() {
		return true;
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return true;
	}

	@Override
	protected void onInstall() throws Exception {

		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudKBUtilRTAddin.class, null);
		super.onInstall();

		this.strCloudKBUtilRuntimeUniqueTag = KeyValueUtils.genUniqueId(ICloudKBUtilRuntime.class.getCanonicalName(), ICloudUtilRuntime.CLOUDSERVICE_KB);
		this.kbPlatformMap = this.getAddins(IKBPlatform.class, ADDIN_KBPLATFORM_PREFIX);

	}

	@Override
	protected ICloudKBUtilRuntimeContext createModelRuntimeContext() {
		return new CloudKBUtilRuntimeContextBase<ICloudKBUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {

		};
	}

	private CloudKBUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected ICloudKBUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudKBUtilRuntimeContext) super.getModelRuntimeContext();
	}

	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {

		super.onReloadSetting(bFirst);

		if (!bFirst) {
			List<IKBAccessAgent> list = new ArrayList<IKBAccessAgent>();
			synchronized (this.kbAccessAgentMap) {
				list.addAll(this.kbAccessAgentMap.values());
				this.kbAccessAgentMap.clear();
			}

			if (!ObjectUtils.isEmpty(list)) {
				for (IKBAccessAgent iKBAccessAgent : list) {
					try {
						iKBAccessAgent.stop();
					} catch (Exception ex) {
						log.error(String.format("停止KB应用代理[%1$s]发生异常，%2$s", iKBAccessAgent.getName(), ex.getMessage()), ex);
					}
				}
			}
		}

		String strDefaultAgent = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".defaultagent", KBPLATFORM_RAGFLOW);
		if (StringUtils.hasLength(strDefaultAgent)) {
			this.setDefaultAgent(strDefaultAgent);
		}

		String strClusterEmbeddingsUrl = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clusterembeddingsurl", "http://localhost:9801/cluster_embeddings");
		if (StringUtils.hasLength(strClusterEmbeddingsUrl)) {
			this.setClusterEmbeddingsUrl(strClusterEmbeddingsUrl);
		}
		
		this.fetchKBsParams = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".fetchkbs", new HashMap<String, Object>());
		
	}

	@Override
	public Page fetchChunks(String type, Map<String, Object> data) {
		return (Page) this.executeAction("获取知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchChunks(type, data);
			}
		}, null);
	}

	protected Page onFetchChunks(String type, Map<String, Object> data) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.fetchChunks(new ChunkSearchContext(data));
	}

	@Override
	public Page fetchChunksByHistories(String type, Map<String, Object> data) {
		return (Page) this.executeAction("获取知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchChunksByHistories(type, data);
			}
		}, null);
	}

	protected Page onFetchChunksByHistories(String type, Map<String, Object> data) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.fetchChunksByHistories(new ChunkSearchContext(data));
	}

	protected IKBAccessAgent getKBAccessAgent(String strKBAccessId) throws Throwable {

		if (KBPLATFORM_DEFAULT.equalsIgnoreCase(strKBAccessId)) {
			strKBAccessId = this.getDefaultAgent();
		} else {
			strKBAccessId = strKBAccessId.toUpperCase();
		}

		IKBAccessAgent iKBAccessAgent = this.kbAccessAgentMap.get(strKBAccessId);
		if (iKBAccessAgent != null) {
			return iKBAccessAgent;
		}

		KBAccess kbAccess = getKBAccess(strKBAccessId);
		IKBPlatform iKBPlatform = getKBPlatform(kbAccess.getKBType().toUpperCase());
		return this.onGetKBAccessAgent(iKBPlatform, kbAccess);
	}

	protected synchronized IKBAccessAgent onGetKBAccessAgent(IKBPlatform iKBPlatform, KBAccess kbAccess) throws Throwable {

		synchronized (this.kbAccessAgentMap) {
			IKBAccessAgent iKBAccessAgent = this.kbAccessAgentMap.get(kbAccess.getId());
			if (iKBAccessAgent != null) {
				return iKBAccessAgent;
			}

			iKBAccessAgent = iKBPlatform.createKBAccessAgent(kbAccess);
			iKBAccessAgent.init(this.getModelRuntimeContext(), kbAccess);
			iKBAccessAgent.start();
			this.kbAccessAgentMap.put(kbAccess.getId(), iKBAccessAgent);
			return iKBAccessAgent;
		}

	}

	protected void resetKBAccessAgent(String strKBAccessId) {
		IKBAccessAgent iKBAccessAgent = null;
		synchronized (this.kbAccessAgentMap) {
			iKBAccessAgent = this.kbAccessAgentMap.remove(strKBAccessId);
		}
		if (iKBAccessAgent != null) {
			try {
				iKBAccessAgent.stop();
			} catch (Exception ex) {
				log.error(String.format("停止KB应用代理[%1$s]发生异常，%2$s", iKBAccessAgent.getName(), ex.getMessage()), ex);
			}
		}
	}

	protected IKBPlatform getKBPlatform(String strKBPlatformType) throws Throwable {

		IKBPlatform iKBPlatform = this.kbPlatformMap.get(strKBPlatformType);
		if (iKBPlatform != null) {
			return iKBPlatform;
		}

		throw new Exception(String.format("无法获取指定KB平台对象[%1$s]", strKBPlatformType));
	}

	public KBAccess getKBAccess(String strKBAccessId) {
		KBAccess kbAccess = new KBAccess();

		Map<String, Object> params = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".agent." + strKBAccessId.toLowerCase(), null);
		if (ObjectUtils.isEmpty(params)) {
			// 尝试从Cloud获取
			String strConfigId = String.format("%1$s-agent-%2$s", getCloudConfigId(), strKBAccessId.toLowerCase());
			String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
			if (StringUtils.hasLength(strConfig)) {
				ConfigEntity configEntity = new ConfigEntity(strConfig);
				params = configEntity.any();
			} else {
				// 没有配置，尝试获取默认代理的配置
				String strConfigId2 = String.format("%1$s-agent-%2$s", getCloudConfigId(), this.getDefaultAgent().toLowerCase());
				String strConfig2 = ServiceHub.getInstance().getConfig(strConfigId2);
				if (StringUtils.hasLength(strConfig2)) {
					ConfigEntity configEntity = new ConfigEntity(strConfig2);
					params = configEntity.any();
				}
			}

			synchronized (this.kbAccessConfigListenerMap) {
				if (!this.kbAccessConfigListenerMap.containsKey(strConfigId)) {
					IConfigListener iConfigListener = new IConfigListener() {
						@Override
						public void receiveConfigInfo(String configInfo) {
							resetKBAccessAgent(strKBAccessId);
						}

						@Override
						public Executor getExecutor() {
							return null;
						}
					};
					ServiceHub.getInstance().addConfigListener(strConfigId, iConfigListener);
					this.kbAccessConfigListenerMap.put(strConfigId, iConfigListener);
				}
			}
		}

		if (!ObjectUtils.isEmpty(params)) {
			kbAccess.putAll(params);
		}

		kbAccess.setId(strKBAccessId);
		if (!StringUtils.hasLength(kbAccess.getKBType())) {
			kbAccess.setKBType(strKBAccessId);
		}

		return kbAccess;
	}

	protected String getDefaultAgent() {
		return strDefaultAgent;
	}

	protected void setDefaultAgent(String strDefaultAgent) {
		this.strDefaultAgent = strDefaultAgent;
	}

	protected String getClusterEmbeddingsUrl() {
		return this.strClusterEmbeddingsUrl;
	}

	protected void setClusterEmbeddingsUrl(String strClusterEmbeddingsUrl) {
		this.strClusterEmbeddingsUrl = strClusterEmbeddingsUrl;
	}
	
	protected Map<String, Object> getFetchKBsParams() {
		return this.fetchKBsParams;
	}

	@Override
	public List<Integer> clusterEmbeddings(ClusterEmbeddingsRequest clusterEmbeddingsRequest) {
		return (List) this.executeAction("聚合嵌入值", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onClusterEmbeddings(clusterEmbeddingsRequest);
			}
		}, null);
	}

	protected List<Integer> onClusterEmbeddings(ClusterEmbeddingsRequest clusterEmbeddingsRequest) throws Throwable {
		Map<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("embeddings", clusterEmbeddingsRequest.getEmbeddings());
		body.put("max_clusters", clusterEmbeddingsRequest.getMaxClusters());
		body.put("threshold", clusterEmbeddingsRequest.getThreshold());
		body.put("random_state", clusterEmbeddingsRequest.getRandomState());

		String callRet = this.getSystemRuntime().getDefaultWebClient().post(this.getClusterEmbeddingsUrl(), body).getBody();
		List<Integer> labelList = JsonUtils.asList(callRet);
		return labelList;
	}
	
	@Override
	public String getGuidancePrompt(String type) {
		return (String) this.executeAction("获取知识库引导词", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetGuidancePrompt(type);
			}
		}, null);
	}

	protected String onGetGuidancePrompt(String type) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.getGuidancePrompt();
	}

	
	
	@Override
	public List listFiles(String type, Map<String, Object> params) {
		return (List) this.executeAction("列出知识库文档清单", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onListFiles(type, params);
			}
		}, null);
	}

	protected List onListFiles(String type, Map<String, Object> params) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.listFiles(params);
	}

	@Override
	public Document createDocument(String type, Document document) {
		return (Document) this.executeAction("建立文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateDocument(type, document);
			}
		}, null);
	}

	protected Document onCreateDocument(String type, Document document) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.createDocument(document);
	}

	@Override
	public Document updateDocument(String type, String document_id, Document document) {
		return (Document) this.executeAction("更新文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onUpdateDocument(type, document_id, document);
			}
		}, null);
	}

	protected Document onUpdateDocument(String type, String document_id, Document document) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.updateDocument(document_id, document);
	}

	@Override
	public Document saveDocument(String type, String document_id, Document document) {
		return (Document) this.executeAction("保存文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onSaveDocument(type, document_id, document);
			}
		}, null);
	}

	protected Document onSaveDocument(String type, String document_id, Document document) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.saveDocument(document_id, document);
	}

	
	@Override
	public Document getDocument(String type, String document_id) {
		return (Document) this.executeAction("获取文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetDocument(type, document_id);
			}
		}, null);
	}

	protected Document onGetDocument(String type, String document_id) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.getDocument(document_id);
	}

	@Override
	public Integer deleteDocument(String type, String document_id) {
		return (Integer) this.executeAction("删除文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onDeleteDocument(type, document_id);
			}
		}, null);
	}

	protected Integer onDeleteDocument(String type, String document_id) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.deleteDocument(document_id);
	}

	
	@Override
	public void downloadDocument(String type, String document_id, HttpServletRequest request, HttpServletResponse response) {
		this.executeAction("下载文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onDownloadDocument(type, document_id, request, response);
				return null;
			}
		}, null);
	}

	protected void onDownloadDocument(String type, String document_id, HttpServletRequest request, HttpServletResponse response) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		iKBAccessAgent.downloadDocument(document_id, request, response);
	}

	
	
	@Override
	public Chunk createChunk(String type, String document_id, Chunk chunk) {
		return (Chunk) this.executeAction("建立片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return coCreateChunk(type, document_id, chunk);
			}
		}, null);
	}

	protected Chunk coCreateChunk(String type, String document_id, Chunk chunk) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.createChunk(document_id, chunk);
	}

	@Override
	public Chunk updateChunk(String type, String document_id, String chunk_id, Chunk chunk) {
		return (Chunk) this.executeAction("更新片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onUpdateChunk(type, document_id, chunk_id, chunk);
			}
		}, null);
	}

	protected Chunk onUpdateChunk(String type, String document_id, String chunk_id, Chunk chunk) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.updateChunk(document_id, chunk_id, chunk);
	}

	@Override
	public Chunk saveChunk(String type, String document_id, String chunk_id, Chunk chunk) {
		return (Chunk) this.executeAction("保存片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onSaveChunk(type, document_id, chunk_id, chunk);
			}
		}, null);
	}

	protected Chunk onSaveChunk(String type, String document_id, String chunk_id, Chunk chunk) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.saveChunk(document_id, chunk_id, chunk);
	}
	
	@Override
	public Chunk getChunk(String type, String document_id, String chunk_id) {
		return (Chunk) this.executeAction("获取片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetChunk(type, document_id, chunk_id);
			}
		}, null);
	}

	protected Chunk onGetChunk(String type, String document_id, String chunk_id) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.getChunk(document_id, chunk_id);
	}

	@Override
	public Integer deleteChunk(String type, String document_id, String chunk_id) {
		return (Integer) this.executeAction("删除片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onDeleteChunk(type, document_id, chunk_id);
			}
		}, null);
	}

	protected Integer onDeleteChunk(String type, String document_id, String chunk_id) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.deleteChunk(document_id, chunk_id);
	}

	@Override
	public Page fetchChunks(String type, String document_id, Map data) {
		return (Page) this.executeAction("获取知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchChunks(type, document_id, data);
			}
		}, null);
	}

	protected Page onFetchChunks(String type, String document_id, Map data) throws Throwable {
		IKBAccessAgent iKBAccessAgent = this.getKBAccessAgent(type);
		return iKBAccessAgent.fetchChunks(document_id, new ChunkSearchContext(data));
	}
	
	@Override
	public Page fetchKBs(Map<String, Object> data) {
		return (Page) this.executeAction("查询知识库", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchKBs(data);
			}
		}, null);
	}

	protected Page onFetchKBs(Map<String, Object> data) throws Throwable {
		Map<String, Object> fetchKBsParams = this.getFetchKBsParams();
		if(ObjectUtils.isEmpty(fetchKBsParams)) {
			throw new Exception("未定义查询知识库相关参数");
		}
		
		String strUrl = DataTypeUtils.asString(fetchKBsParams.get("url"));
		if(ObjectUtils.isEmpty(strUrl)) {
			throw new Exception("未定义查询知识库远程服务路径");
		}
		
		String strMethod = DataTypeUtils.asString(fetchKBsParams.get("method"), "POST");
		String strKBAgentFormat = DataTypeUtils.asString(fetchKBsParams.get("agentformat"));
		
		IWebClient iWebClient = this.getSysCloudClientUtilRuntime().getServiceClient(strUrl);
		List contentList = new ArrayList<>();
		IWebClientRep<String> rep = null;
		if("GET".equalsIgnoreCase(strMethod)) {
			rep = iWebClient.get(strUrl, null, null, data, String.class, null);
		}
		else {
			rep = iWebClient.post(strUrl, null, null, null, data, null, String.class, null);
		}
		
		if(!ObjectUtils.isEmpty(rep.getBody())) {
			List<?> list = WebClientBase.MAPPER.readValue(rep.getBody(), List.class);
			if(!ObjectUtils.isEmpty(list)) {
				for(Object objItem: list) {
					IEntity dto = WebClientBase.MAPPER.convertValue(objItem, Entity.class);
					contentList.add(dto);
					String strId = (String) dto.get("id");
					if(StringUtils.hasLength(strId)) {
						if(StringUtils.hasLength(strKBAgentFormat)) {
							strId = strKBAgentFormat.replace("{key}", strId);
						}
						dto.set("id", strId.toLowerCase());
					}
				}
			}
		}
		
		int nTotal = DataTypeUtils.getIntegerValue(rep.getHeader("x-total"), 0);
		int nSize = DataTypeUtils.getIntegerValue(rep.getHeader("x-per-page"), contentList.size());
		int nPage = DataTypeUtils.getIntegerValue(rep.getHeader("x-page"), 0);
		
		PageImpl pageImpl = new PageImpl(contentList, PageRequest.of(nPage, nSize, 0), nTotal);
		Object metaData = rep.getHeader("x-metadata");
		if(!ObjectUtils.isEmpty(metaData)) {
			Map<String, Object> map = JsonUtils.asMap(new String(Base64.getDecoder().decode((String)metaData), "utf-8"));
			pageImpl.getMetadataIf().putAll(map);
		}
		return pageImpl;
	}
	

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if(this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

	protected String getCloudKBUtilRuntimeUniqueTag() {
		return this.strCloudKBUtilRuntimeUniqueTag;
	}

}
