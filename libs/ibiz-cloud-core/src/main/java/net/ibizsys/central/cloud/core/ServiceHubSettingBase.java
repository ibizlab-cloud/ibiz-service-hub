package net.ibizsys.central.cloud.core;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class ServiceHubSettingBase implements IServiceHubSetting {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ServiceHubSettingBase.class);
	
	/**
	 * 服务网关
	 */
	public static final String PREFIX = "ibiz.servicehub";
	
	

	
	
	private String id = null;
	private Long node = null;
	private boolean registerNamingService = true;
	private boolean publishConfig = true;
	private boolean enableReloadSystem = true;
	private boolean enableDebug = false;
	private boolean enableServletApp = true;
	private boolean enableServiceApp = true;
	private boolean enableRTCodeMode = false;
	private boolean enableProdMode = false;
	private boolean enableModelSnapshot = false;
	private boolean enableMergeSystem = false;
	private boolean concurrentLoadSystemMergences = true;
	
	
	private List<DataSource> dataSources = null;
	private List<DeploySystem> deploySystems = null;
	private boolean enableAppGateway = false;

	
	private String tempFolder = null;
	private String fileFolder = null;
	private String fontFolder = null;
	private String libraryFolder = null;
	private String systemModelFolder = null;
	
	
	private String reportFolder = null;
	private String debuggerCmd = null;
	private boolean startDebugger = false;
	private String cloudPluginServiceId = null;

	private int workThreadCorePoolSize = 20;
	private int workThreadMaximumPoolSize = 40;
	private int workThreadBlockingQueueSize = 2000;

	private int monitorDebugModelPathsTimer = -1;
	
	private Map<String, String> systemRuntimeClass = null;
	
	@Override
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Long getNode() {
		return this.node;
	}
	
	public void setNode(Long node) {
		this.node = node;
		if(node != null && node != 0) {
			KeyValueUtils.setWorkerId(node);
		}
	}
	
	@Override
	public boolean isRegisterNamingService() {
		return this.registerNamingService;
	}
	
	public void setRegisterNamingService(boolean registerNamingService) {
		this.registerNamingService = registerNamingService;
	}
	
	
	@Override
	public boolean isPublishConfig() {
		return this.publishConfig;
	}
	
	public void setPublishConfig(boolean publishConfig) {
		this.publishConfig = publishConfig;
	}
	
	@Override
	public boolean isEnableReloadSystem() {
		return enableReloadSystem;
	}

	public void setEnableReloadSystem(boolean enableReloadSystem) {
		this.enableReloadSystem = enableReloadSystem;
	}
	
	@Override
	public boolean isEnableModelSnapshot() {
		return enableModelSnapshot;
	}

	public void setEnableModelSnapshot(boolean enableModelSnapshot) {
		this.enableModelSnapshot = enableModelSnapshot;
	}
	
	@Override
	public boolean isEnableMergeSystem() {
		return enableMergeSystem;
	}

	public void setEnableMergeSystem(boolean enableMergeSystem) {
		this.enableMergeSystem = enableMergeSystem;
	}
	

	@Override
	public List<DataSource> getDataSources() {
		return this.dataSources;
	}
	
	public void setDataSources(List<DataSource> dataSources) {
		this.dataSources = dataSources;
	}
	
	
	@Override
	public boolean isEnableServletApp() {
		return this.enableServletApp;
	}
	
	
	public void setEnableServletApp(boolean enableServletApp) {
		this.enableServletApp = enableServletApp;
	}

	@Override
	public boolean isEnableServiceApp() {
		return this.enableServiceApp;
	}
	
	public void setEnableServiceApp(boolean enableServiceApp) {
		this.enableServiceApp = enableServiceApp;
	}

	@Override
	public boolean isEnableDebug() {
		return this.enableDebug;
	}
	
	public void setEnableDebug(boolean enableDebug) {
		this.enableDebug = enableDebug;
	}
	

	@Override
	public List<DeploySystem> getDeploySystems() {
		return this.deploySystems;
	}
	
	public void setDeploySystems(List<DeploySystem> deploySystems) {
		this.deploySystems = deploySystems;
	}

	@Override
	public boolean isEnableAppGateway() {
		return enableAppGateway;
	}

	public void setEnableAppGateway(boolean enableAppGateway) {
		this.enableAppGateway = enableAppGateway;
	}

	@Override
	public String getTempFolder() {
		return tempFolder;
	}

	public void setTempFolder(String tempFolder) {
		this.tempFolder = tempFolder;
	}

	@Override
	public String getFileFolder() {
		return fileFolder;
	}

	public void setFileFolder(String fileFolder) {
		this.fileFolder = fileFolder;
	}

	@Override
	public String getFontFolder() {
		return fontFolder;
	}

	public void setFontFolder(String fontFolder) {
		this.fontFolder = fontFolder;
	}
	
	@Override
	public String getReportFolder() {
		return reportFolder;
	}

	public void setReportFolder(String reportFolder) {
		this.reportFolder = reportFolder;
	}

	@Override
	public String getLibraryFolder() {
		return libraryFolder;
	}

	public void setLibraryFolder(String libraryFolder) {
		this.libraryFolder = libraryFolder;
	}
	
	@Override
	public String getSystemModelFolder() {
		return systemModelFolder;
	}

	public void setSystemModelFolder(String systemModelFolder) {
		this.systemModelFolder = systemModelFolder;
	}
	
	
	@Override
	public String getDebuggerCmd() {
		return this.debuggerCmd;
	}
	
	public void setDebuggerCmd(String debuggerCmd) {
		this.debuggerCmd = debuggerCmd;
	}

	@Override
	public boolean isStartDebugger() {
		return startDebugger;
	}

	public void setStartDebugger(boolean startDebugger) {
		this.startDebugger = startDebugger;
	}

	@Override
	public String getCloudPluginServiceId() {
		return this.cloudPluginServiceId;
	}
	
	public void setCloudPluginServiceId(String cloudPluginServiceId) {
		this.cloudPluginServiceId = cloudPluginServiceId;
	}

	
	@Override
	public boolean isEnableRTCodeMode() {
		return enableRTCodeMode;
	}

	public void setEnableRTCodeMode(boolean enableRTCodeMode) {
		this.enableRTCodeMode = enableRTCodeMode;
	}

	@Override
	public void loadConfig() {
		
	}

	@Override
	public int getWorkThreadCorePoolSize() {
		return this.workThreadCorePoolSize;
	}
	
	public void setWorkThreadCorePoolSize(int workThreadCorePoolSize) {
		this.workThreadCorePoolSize = workThreadCorePoolSize;
	}

	@Override
	public int getWorkThreadMaximumPoolSize() {
		return this.workThreadMaximumPoolSize;
	}

	public void setWorkThreadMaximumPoolSize(int workThreadMaximumPoolSize) {
		this.workThreadMaximumPoolSize = workThreadMaximumPoolSize;
	}
	
	@Override
	public int getWorkThreadBlockingQueueSize() {
		return this.workThreadBlockingQueueSize;
	}
	
	public void setWorkThreadBlockingQueueSize(int workThreadBlockingQueueSize) {
		this.workThreadBlockingQueueSize = workThreadBlockingQueueSize;
	}

	@Override
	public boolean isEnableProdMode() {
		return enableProdMode;
	}

	public void setEnableProdMode(boolean enableProdMode) {
		this.enableProdMode = enableProdMode;
	}


	public int getMonitorDebugModelPathsTimer() {
		return monitorDebugModelPathsTimer;
	}

	public void setMonitorDebugModelPathsTimer(int monitorDebugModelPathsTimer) {
		this.monitorDebugModelPathsTimer = monitorDebugModelPathsTimer;
	}

	public Map<String, String> getSystemRuntimeClass() {
		return systemRuntimeClass;
	}

	public void setSystemRuntimeClass(Map<String, String> systemRuntimeClass) {
		this.systemRuntimeClass = systemRuntimeClass;
	}

	@Override
	public boolean isConcurrentLoadSystemMergences() {
		return this.concurrentLoadSystemMergences;
	}
	
	public void setConcurrentLoadSystemMergences(boolean concurrentLoadSystemMergences) {
		this.concurrentLoadSystemMergences = concurrentLoadSystemMergences;
	}
	
	
	
}
