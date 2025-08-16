package net.ibizsys.central.cloud.dataflow.core.cloudutil;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDataFlowUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.domain.DataFlowAccess;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.dataflow.core.addin.ICloudDataFlowUtilRTAddin;
import net.ibizsys.central.cloud.dataflow.core.addin.IDataFlowAccessAgent;
import net.ibizsys.central.cloud.dataflow.core.addin.IDataFlowPlatform;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class CloudDataFlowUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudDataFlowUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudDataFlowUtilRuntimeBase.class);

	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudDataFlowUtilRTAddin.class, "DATAFLOWPLATFORM:SPARK", "net.ibizsys.central.cloud.dataflow.spark.addin.SparkDataFlowPlatform");
	}

	private Map<String, IDataFlowAccessAgent> dataFlowAccessAgentMap = new HashMap<String, IDataFlowAccessAgent>();
	private Map<String, IDataFlowPlatform> dataFlowPlatformMap = null;

	private String strCloudDataFlowUtilRuntimeUniqueTag = null;

	private String strDefaultAgent = null;
	
	@Override
	protected ICloudDataFlowUtilRuntimeContext createModelRuntimeContext() {
		return new CloudDataFlowUtilRuntimeContextBase<ICloudDataFlowUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {
			
		};
	}

	@Override
	protected String getGlobalConfigId() {
		return CLOUDDATAFLOWUTIL_CONFIGFOLDER;
	}

	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_DATAFLOW;
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

		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudDataFlowUtilRTAddin.class, null);
		super.onInstall();

		this.strCloudDataFlowUtilRuntimeUniqueTag = KeyValueUtils.genUniqueId(ICloudDataFlowUtilRuntime.class.getCanonicalName(), ICloudUtilRuntime.CLOUDSERVICE_DATAFLOW);
		this.dataFlowPlatformMap = this.getAddins(IDataFlowPlatform.class, ADDIN_DATAFLOWPLATFORM_PREFIX);

	}

	private CloudDataFlowUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected ICloudDataFlowUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudDataFlowUtilRuntimeContext)super.getModelRuntimeContext();
	}
	

	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {

		super.onReloadSetting(bFirst);
		
		if(!bFirst) {
			dataFlowAccessAgentMap.clear();
		}

		String strDefaultAgent = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".defaultagent", DATAFLOWPLATFORM_SPARK);
		if (StringUtils.hasLength(strDefaultAgent)) {
			this.setDefaultAgent(strDefaultAgent);
		}
	}
	
	@Override
	public PortalAsyncAction start(String type, String id, Map<String, Object> params) {
		return (PortalAsyncAction) this.executeAction("开始数据流作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onStart(type, id, params);
			}
		}, null);
	}

	protected PortalAsyncAction onStart(String type, String id, Map<String, Object> params) throws Throwable {
		return getDataFlowAccessAgent(type).start(id, params);
	}
	

	
	

	protected IDataFlowAccessAgent getDataFlowAccessAgent(String strDataFlowAccessId) throws Throwable {

		if (DATAFLOWPLATFORM_DEFAULT.equalsIgnoreCase(strDataFlowAccessId)) {
			strDataFlowAccessId = this.getDefaultAgent();
		} else {
			strDataFlowAccessId = strDataFlowAccessId.toUpperCase();
		}

		IDataFlowAccessAgent iDataFlowAccessAgent = this.dataFlowAccessAgentMap.get(strDataFlowAccessId);
		if (iDataFlowAccessAgent != null) {
			return iDataFlowAccessAgent;
		}

		DataFlowAccess dataFlowAccess = getDataFlowAccess(strDataFlowAccessId);
		IDataFlowPlatform iDataFlowPlatform = getDataFlowPlatform(dataFlowAccess.getType().toUpperCase());
		return this.onGetDataFlowAccessAgent(iDataFlowPlatform, dataFlowAccess);
	}

	protected synchronized IDataFlowAccessAgent onGetDataFlowAccessAgent(IDataFlowPlatform iDataFlowPlatform, DataFlowAccess dataFlowAccess) throws Throwable {

		IDataFlowAccessAgent iDataFlowAccessAgent = this.dataFlowAccessAgentMap.get(dataFlowAccess.getId());
		if (iDataFlowAccessAgent != null) {
			return iDataFlowAccessAgent;
		}

		iDataFlowAccessAgent = iDataFlowPlatform.createDataFlowAccessAgent(dataFlowAccess);
		iDataFlowAccessAgent.init(this.getModelRuntimeContext(), dataFlowAccess);
		this.dataFlowAccessAgentMap.put(dataFlowAccess.getId(), iDataFlowAccessAgent);
		return iDataFlowAccessAgent;
	}

	protected IDataFlowPlatform getDataFlowPlatform(String strDataFlowPlatformType) throws Throwable {

		IDataFlowPlatform iDataFlowPlatform = this.dataFlowPlatformMap.get(strDataFlowPlatformType);
		if (iDataFlowPlatform != null) {
			return iDataFlowPlatform;
		}

		throw new Exception(String.format("无法获取指定数据流平台对象[%1$s]", strDataFlowPlatformType));
	}

	public DataFlowAccess getDataFlowAccess(String strDataFlowAccessId) {
		DataFlowAccess dataFlowAccess = new DataFlowAccess();

		Map<String, Object> params = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".agent." + strDataFlowAccessId.toLowerCase(), null);
		if (ObjectUtils.isEmpty(params)) {
			// 尝试从Cloud获取
			String strConfigId = String.format("%1$s-agent-%2$s", getCloudConfigId(), strDataFlowAccessId.toLowerCase());
			String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
			if (StringUtils.hasLength(strConfig)) {
				ConfigEntity configEntity = new ConfigEntity(strConfig);
				params = configEntity.any();
			}
		}

		if (!ObjectUtils.isEmpty(params)) {
			dataFlowAccess.putAll(params);
		}

		dataFlowAccess.setId(strDataFlowAccessId);
		dataFlowAccess.setType(strDataFlowAccessId);

		return dataFlowAccess;
	}

	protected String getDefaultAgent() {
		return strDefaultAgent;
	}

	protected void setDefaultAgent(String strDefaultAgent) {
		this.strDefaultAgent = strDefaultAgent;
	}

	protected String getCloudDataFlowUtilRuntimeUniqueTag() {
		return this.strCloudDataFlowUtilRuntimeUniqueTag;
	}

}
