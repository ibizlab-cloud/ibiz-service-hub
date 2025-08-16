package net.ibizsys.central.cloud.kb.core.cloudutil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.domain.KBAccess;
import net.ibizsys.central.cloud.kb.core.addin.ICloudKBUtilRTAddin;
import net.ibizsys.central.cloud.kb.core.addin.IKBAccessAgent;
import net.ibizsys.central.cloud.kb.core.addin.IKBPlatform;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class CloudKBUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudKBUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudKBUtilRuntimeBase.class);

	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudKBUtilRTAddin.class, "KBPLATFORM:MILVUS", "net.ibizsys.central.cloud.kb.milvus.addin.MilvusKBPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudKBUtilRTAddin.class, "KBPLATFORM:RAGFLOW", "net.ibizsys.central.cloud.kb.ragflow.addin.RagFlowKBPlatform");
	}

	private Map<String, IKBAccessAgent> kbAccessAgentMap = new HashMap<String, IKBAccessAgent>();
	private Map<String, IKBPlatform> kbPlatformMap = null;
	private Map<String, IConfigListener> kbAccessConfigListenerMap = new HashMap<String, IConfigListener>();
	
	
	private String strCloudKBUtilRuntimeUniqueTag = null;

	private String strDefaultAgent = KBPLATFORM_RAGFLOW;

	

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
		return (ICloudKBUtilRuntimeContext)super.getModelRuntimeContext();
	}
	

	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {

		super.onReloadSetting(bFirst);
		
		if(!bFirst) {
			List<IKBAccessAgent> list = new ArrayList<IKBAccessAgent>();
			synchronized (this.kbAccessAgentMap) {
				list.addAll(this.kbAccessAgentMap.values());
				this.kbAccessAgentMap.clear();
			}
			
			if(!ObjectUtils.isEmpty(list)) {
				for(IKBAccessAgent iKBAccessAgent : list) {
					try {
						iKBAccessAgent.stop();
					}
					catch (Exception ex) {
						log.error(String.format("停止KB应用代理[%1$s]发生异常，%2$s", iKBAccessAgent.getName(), ex.getMessage()), ex);
					}
				}
			}
		}

		String strDefaultAgent = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".defaultagent", KBPLATFORM_RAGFLOW);
		if (StringUtils.hasLength(strDefaultAgent)) {
			this.setDefaultAgent(strDefaultAgent);
		}
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
		if(iKBAccessAgent!=null) {
			try {
				iKBAccessAgent.stop();
			}
			catch (Exception ex) {
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
			}
			else {
				//没有配置，尝试获取默认代理的配置
				String strConfigId2 = String.format("%1$s-agent-%2$s", getCloudConfigId(), this.getDefaultAgent().toLowerCase());
				String strConfig2 = ServiceHub.getInstance().getConfig(strConfigId2);
				if (StringUtils.hasLength(strConfig2)) {
					ConfigEntity configEntity = new ConfigEntity(strConfig2);
					params = configEntity.any();
				}
			}
			
			
			synchronized (this.kbAccessConfigListenerMap) {
				if(!this.kbAccessConfigListenerMap.containsKey(strConfigId)) {
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
		if(!StringUtils.hasLength(kbAccess.getKBType())) {
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


	protected String getCloudKBUtilRuntimeUniqueTag() {
		return this.strCloudKBUtilRuntimeUniqueTag;
	}

}
