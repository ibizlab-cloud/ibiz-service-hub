package net.ibizsys.central.plugin.cloud.sysutil;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudKBClient;
import net.ibizsys.central.cloud.core.sysutil.CloudSysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.sysutil.ISysKBUtilRuntime;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ClusterEmbeddingsRequest;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统KB组件运行时对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class SysKBUtilRuntimeBase extends CloudSysUtilRuntimeBase implements ISysKBUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysKBUtilRuntimeBase.class);
	private ICloudKBClient iCloudKBClient = null;
	private String strDefaultKBPlatformType = KBPLATFORM_DEFAULT;

	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {

		super.onPrepareDefaultSetting();
	}

	protected ICloudKBClient getCloudKBClient() {
		if (this.iCloudKBClient == null) {
			this.iCloudKBClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_KB, ICloudKBClient.class);
		}
		return this.iCloudKBClient;
	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
	}

	@Override
	public String getLogicName() {
		return String.format("系统KB功能组件[%1$s]", this.getName());
	}

	@Override
	public String getDefaultKBPlatformType() {
		return this.strDefaultKBPlatformType;
	}

	protected void setDefaultKBPlatformType(String strDefaultKBPlatformType) {
		this.strDefaultKBPlatformType = strDefaultKBPlatformType;
	}

	@Override
	public Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext) {
		return this.fetchChunks(null, iChunkSearchContext);
	}

	@Override
	public Page<Chunk> fetchChunks(String type, IChunkSearchContext iChunkSearchContext) {
		return (Page<Chunk>) this.executeAction("查询知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchChunks(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), iChunkSearchContext);
			}
		}, null);
	}

	protected Page<Chunk> onFetchChunks(String type, IChunkSearchContext iChunkSearchContext) throws Throwable {
		return getCloudKBClient().fetchChunks(type, iChunkSearchContext);
	}

	@Override
	public Page<Chunk> fetchChunksByHistories(IChunkSearchContext iChunkSearchContext) {
		return this.fetchChunksByHistories(null, iChunkSearchContext);
	}

	@Override
	public Page<Chunk> fetchChunksByHistories(String type, IChunkSearchContext iChunkSearchContext) {
		return (Page<Chunk>) this.executeAction("查询知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchChunksByHistories(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), iChunkSearchContext);
			}
		}, null);
	}

	protected Page<Chunk> onFetchChunksByHistories(String type, IChunkSearchContext iChunkSearchContext) throws Throwable {
		return getCloudKBClient().fetchChunksByHistories(type, iChunkSearchContext);
	}

	@Override
	public List<Integer> clusterEmbeddings(ClusterEmbeddingsRequest clusterEmbeddingsRequest) {
		return (List<Integer>) this.executeAction("聚合向量值", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onClusterEmbeddings(clusterEmbeddingsRequest);
			}
		}, null);
	}

	protected List<Integer> onClusterEmbeddings(ClusterEmbeddingsRequest clusterEmbeddingsRequest) throws Throwable {
		return getCloudKBClient().clusterEmbeddings(clusterEmbeddingsRequest);
	}

	@Override
	public String getGuidancePrompt(String type) {
		return (String) this.executeAction("获取知识库引导信息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetGuidancePrompt(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType());
			}
		}, null);
	}

	protected String onGetGuidancePrompt(String type) throws Throwable {
		return getCloudKBClient().getGuidancePrompt(type);
	}

	@Override
	public Document createDocument(String type, Document document) {
		return (Document) this.executeAction("创建知识文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateDocument(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document);
			}
		}, null);
	}

	protected Document onCreateDocument(String type, Document document) throws Throwable {
		return getCloudKBClient().createDocument(type, document);
	}

	@Override
	public Document updateDocument(String type, String document_id, Document document) {
		return (Document) this.executeAction("更新知识文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onUpdateDocument(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document_id, document);
			}
		}, null);
	}

	protected Document onUpdateDocument(String type, String document_id, Document document) throws Throwable {
		return getCloudKBClient().updateDocument(type, document_id, document);
	}

	@Override
	public Document saveDocument(String type, String document_id, Document document) {
		return (Document) this.executeAction("保存知识文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onSaveDocument(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document_id, document);
			}
		}, null);
	}

	protected Document onSaveDocument(String type, String document_id, Document document) throws Throwable {
		return getCloudKBClient().saveDocument(type, document_id, document);
	}

	@Override
	public Document getDocument(String type, String document_id) {
		return (Document) this.executeAction("获取知识文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetDocument(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document_id);
			}
		}, null);
	}

	protected Document onGetDocument(String type, String document_id) throws Throwable {
		return getCloudKBClient().getDocument(type, document_id);
	}

	@Override
	public Document getDocument(String type, String document_id, boolean try_mode) {
		return (Document) this.executeAction("获取知识文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetDocument(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document_id, try_mode);
			}
		}, null);
	}

	protected Document onGetDocument(String type, String document_id, boolean try_mode) throws Throwable {
		return getCloudKBClient().getDocument(type, document_id, try_mode);
	}
	
	@Override
	public Integer deleteDocument(String type, String document_id) {
		return (Integer) this.executeAction("删除知识文档", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onDeleteDocument(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document_id);
			}
		}, null);
	}

	protected Integer onDeleteDocument(String type, String document_id) throws Throwable {
		return getCloudKBClient().deleteDocument(type, document_id);
	}

	@Override
	public Chunk createChunk(String type, String document_id, Chunk chunk) {
		return (Chunk) this.executeAction("创建知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateChunk(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document_id, chunk);
			}
		}, null);
	}

	protected Chunk onCreateChunk(String type, String document_id, Chunk chunk) throws Throwable {
		return getCloudKBClient().createChunk(type, document_id, chunk);
	}

	@Override
	public Chunk updateChunk(String type, String document_id, String chunk_id, Chunk chunk) {
		return (Chunk) this.executeAction("更新知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onUpdateChunk(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document_id, chunk_id, chunk);
			}
		}, null);
	}

	protected Chunk onUpdateChunk(String type, String document_id, String chunk_id, Chunk chunk) throws Throwable {
		return getCloudKBClient().updateChunk(type, document_id, chunk_id, chunk);
	}

	@Override
	public Chunk saveChunk(String type, String document_id, String chunk_id, Chunk chunk) {
		return (Chunk) this.executeAction("保存知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onSaveChunk(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document_id, chunk_id, chunk);
			}
		}, null);
	}

	protected Chunk onSaveChunk(String type, String document_id, String chunk_id, Chunk chunk) throws Throwable {
		return getCloudKBClient().saveChunk(type, document_id, chunk_id, chunk);
	}

	@Override
	public Chunk getChunk(String type, String document_id, String chunk_id) {
		return (Chunk) this.executeAction("获取知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetChunk(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document_id, chunk_id);
			}
		}, null);
	}

	protected Chunk onGetChunk(String type, String document_id, String chunk_id) throws Throwable {
		return getCloudKBClient().getChunk(type, document_id, chunk_id);
	}

	@Override
	public Integer deleteChunk(String type, String document_id, String chunk_id) {
		return (Integer) this.executeAction("删除知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onDeleteChunk(StringUtils.hasLength(type) ? type : getDefaultKBPlatformType(), document_id, chunk_id);
			}
		}, null);
	}

	protected Integer onDeleteChunk(String type, String document_id, String chunk_id) throws Throwable {
		return getCloudKBClient().deleteChunk(type, document_id, chunk_id);
	}

}
