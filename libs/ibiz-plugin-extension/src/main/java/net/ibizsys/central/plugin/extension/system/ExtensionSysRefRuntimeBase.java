package net.ibizsys.central.plugin.extension.system;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.security.ISystemAccessManager;
import net.ibizsys.central.system.SysRefRuntimeBase;
import net.ibizsys.codegen.groovy.support.PSDataEntityExtension;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.ZipUtils;

public abstract class ExtensionSysRefRuntimeBase extends SysRefRuntimeBase implements IExtensionSysRefRuntime {
	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ExtensionSysRefRuntimeBase.class);
	
	private String strDeploySystemModelPath = null;
	private IPSSystemService iPSSystemService = null;
	private String strExtensionTag = null;
	private DeploySystem deploySystem = null;
	private List<INamedAction> unregisterActionList = new ArrayList<INamedAction>();
	private Map<String, IPSApplication> psApplicationMap = new HashMap<String, IPSApplication>();
	private Map<String, String> mainAppRefAppMap = new HashMap<String, String>();
	
	@Override
	protected void onInstall() throws Exception {
		this.strExtensionTag = KeyValueUtils.genUniqueId(this.getSystemRuntime().getServiceId(), this.getId());
		if(this.getPSSystemService(true)==null) {
			preparePSSystemService();
			this.getPSSystemService(false);
		}
		super.onInstall();
	}
	
	@Override
	protected void onUninstall() throws Throwable {
		unregisterPlugins();
		super.onUninstall();
	}
	
	protected String getDeploySystemModelPath() {
		if (!StringUtils.hasLength(this.strDeploySystemModelPath)) {
			String strPath = String.format("%1$s%2$sdeploysystem", ServiceHub.getInstance().getServiceHubSetting().getSystemModelFolder(), File.separator);
			File folder = new File(strPath);
			if (!folder.exists()) {
				folder.mkdirs();
			}
			this.strDeploySystemModelPath = strPath;
		}
		return this.strDeploySystemModelPath;
	}
	
	protected void preparePSSystemService() throws Exception{
		String strFileId = this.getPSSysRef().getRefParam();
		if(!StringUtils.hasLength(strFileId)) {
			//尝试合并
			if(StringUtils.hasLength(this.getPSSysRef().getSysRefType())) {
				String[] types = this.getPSSysRef().getSysRefType().split("[_]");
				String strFileId2 = this.getSystemRuntime().getPSSystemService().getPSModelFolderPath() + File.separator + types[0].toLowerCase() + File.separator + this.getPSSysRef().getId();
				File systemModelFile = new File(strFileId2 + File.separator + "PSSYSTEM.json");
				if (systemModelFile.exists()) {
					strFileId = strFileId2;
				}
			}
			
			if(!StringUtils.hasLength(strFileId)) {
				throw new Exception("未指定模型OSS文件标识");
			}
		}
		
		
		String strDynaModelPath = null;
		//判断文件ID是否存在路径符号
		if(strFileId.indexOf("\\") != -1 || strFileId.indexOf("/") != -1) {
			strDynaModelPath = strFileId;
		}
		else {
			strDynaModelPath = String.format("%1$s%2$s%3$s", this.getDeploySystemModelPath(), File.separator, strFileId);
		}
		// 判断本地路径是否存在
		File systemModelFile = new File(strDynaModelPath + File.separator + "PSSYSTEM.json");
		if (!systemModelFile.exists()) {

			ISysFileUtilRuntime iSysFileUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysFileUtilRuntime.class, false);

			net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.getOSSFile(strFileId, ISysExtensionUtilRuntime.OSSCAT_DYNAMODEL, true);
			if (ossFile == null) {
				ossFile = iSysFileUtilRuntime.getOSSFile(strFileId, null, true);
				if (ossFile == null) {
					throw new Exception(String.format("指定模型文件[%1$s]不存在", strFileId));
				}
			}
			File dynaModelFolder = new File(strDynaModelPath);
			if (!systemModelFile.exists()) {
				ZipUtils.unzip(new File(ossFile.getLocalPath()), dynaModelFolder);
			}
			
			log.debug(String.format("系统引用[%1$s]使用远程模型[%2$s][%3$s]", this.getName() ,strFileId, strDynaModelPath));
		}
		else {
			log.debug(String.format("系统引用[%1$s]使用本地模型[%2$s]", this.getName() ,strDynaModelPath));
		}
		
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(strDynaModelPath);
		psModelServiceImpl.setModelDigest(this.getPSSysRef().getRefParam2());
		this.setPSSystemService(psModelServiceImpl);
		
		
		List<IPSApplication> psApplicationList = psModelServiceImpl.getPSSystem().getAllPSApps();
		if(!ObjectUtils.isEmpty(psApplicationList)) {
			for(IPSApplication iPSApplication : psApplicationList) {
				final String strCodeName =iPSApplication.getCodeName();
				if(!StringUtils.hasLength(strCodeName)) {
					continue;
				}
				this.psApplicationMap.put(strCodeName.toUpperCase(), iPSApplication);
			}
		}
		
	}
	
	protected IPSSystemService getPSSystemService(boolean bTryMode) throws Exception{
		if(this.iPSSystemService != null || bTryMode) {
			return this.iPSSystemService;
		}
		throw new Exception(String.format("未指定引用系统服务对象"));
	} 
	
	@Override
	public IPSSystemService getPSSystemService() {
		try {
			return this.getPSSystemService(false);
		}catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, ex.getMessage(), ex);
		}
	}
	
	protected void setPSSystemService(IPSSystemService iPSSystemService) {
		this.iPSSystemService = iPSSystemService;
	}
	
	@Override
	public String getExtensionTag() {
		return this.strExtensionTag;
	}

	@Override
	public DeploySystem getDeploySystem() {
		return this.deploySystem;
	}

	@Override
	public synchronized void setDeploySystem(DeploySystem deploySystem) {
		if(this.deploySystem == deploySystem) {
			return;
		}
		
		if(this.deploySystem!=null) {
			this.unregisterPlugins();
		}
		this.deploySystem = deploySystem;
		
		if(this.deploySystem!=null) {
			try {
				registerPlugins();
			}
			catch (Throwable ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("挂接主系统插件发生异常，%1$s", ex.getMessage()), ex);
			}
		}
	}
	
	
	protected void registerPlugins() throws Throwable{
		
//		ISystemRuntime iSystemRuntime = ServiceHub.getInstance().getLoadedSystemRuntime(this.getDeploySystem().getDeploySystemId(), false);
//		
//		iSystemRuntime.getAddins(IDEActionLogicRuntime.class, IServiceSystemRuntime.ADDIN_DEACTIONLOGICEX_PREFIX);
	}
	
	protected void unregisterPlugins() {
		synchronized (this.unregisterActionList) {
			for(INamedAction runnable : this.unregisterActionList) {
				try {
					runnable.execute(null);
				}
				catch (Throwable ex) {
					log.error(String.format("%1$s发生异常，%2$s", runnable.getName(), ex.getMessage()), ex);
				}
			}
		}
	}
	
	@Override
	public IPSApplication getPSApplication(String strAppTag, boolean bTryMode){
		IPSApplication iPSApplication = this.psApplicationMap.get(strAppTag.toUpperCase());
		if(iPSApplication != null || bTryMode) {
			return iPSApplication;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("指定应用[%1$s]模型对象不存在", strAppTag));
	}
	

	@Override
	public File getAppDynaModelFile(String strAppTag, String strModelUri, Object param, boolean bTryMode) {
		try {
			return this.onGetAppDynaModelFile(strAppTag, strModelUri, param, bTryMode);
		}
		catch (Throwable ex) {
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("获取应用模型文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected File onGetAppDynaModelFile(String strAppTag, String strModelUri, Object param, boolean bTryMode) throws Throwable {
		String strPSModelFolderPath = this.getPSSystemService().getPSModelFolderPath();
		String strRealModelUri = String.format("PSSYSAPPS%1$s", strModelUri);
		String strFilePath = String.format("%1$s/%2$s", strPSModelFolderPath, strRealModelUri);
		File file = new File(strFilePath);
		if (file.exists()) {
			return file;
		}
		if (bTryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定路径[%1$s]模型文件", strModelUri));
	}

	@Override
	public ObjectNode getAppDataEntityJsonSchema(IPSApplication iPSApplication, String strAppDataEntityTag, Object param, boolean bTryMode) {
		Assert.notNull(iPSApplication, "未传入应用程序模型对象");
		try {
			return this.onGetAppDataEntityJsonSchema(iPSApplication, strAppDataEntityTag, param, bTryMode);
		}
		catch (Throwable ex) {
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("获取应用实体JsonSchema发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected ObjectNode onGetAppDataEntityJsonSchema(IPSApplication iPSApplication, String strAppDataEntityTag, Object param, boolean bTryMode) throws Throwable {
		
		IPSAppDataEntity iPSAppDataEntity = null;

		java.util.List<IPSAppDataEntity> psAppDataEntityList = iPSApplication.getAllPSAppDataEntities();
		if (!ObjectUtils.isEmpty(psAppDataEntityList)) {
			for (IPSAppDataEntity item : psAppDataEntityList) {
				if (!StringUtils.hasLength(item.getCodeName())) {
					continue;
				}
				if (item.getCodeName().equalsIgnoreCase(strAppDataEntityTag)) {
					iPSAppDataEntity = item;
					break;
				}
			}
		}

		if (iPSAppDataEntity == null) {
			if (bTryMode) {
				return null;
			}
			throw new Exception(String.format("无法获取指定应用实体[%1$s]", strAppDataEntityTag));
		}
		
		if(this.getDeploySystem() != null) {
			ISystemRuntime iSystemRuntime = ServiceHub.getInstance().getLoadedSystemRuntime(this.getDeploySystem().getDeploySystemId(), false);
			if(iSystemRuntime != null) {
				IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) iSystemRuntime.getDataEntityRuntime(iPSAppDataEntity.getPSDataEntityMust().getId());
				if (iDataEntityRuntime.isEnableExtension() && iDataEntityRuntime.getDEExtensionUtilRuntime() != null) {
					return iDataEntityRuntime.getDEExtensionUtilRuntime().getJsonSchemaModel(iPSAppDataEntity, param);
				}
			}
		}

		return JsonUtils.toObjectNode(PSDataEntityExtension.getJsonSchema(iPSAppDataEntity));
	}
	
	
	@Override
	public void fillAddinAppData(AppData appData, Entity session) {
		try {
			this.onFillAddinAppData(appData, session);
		}
		catch (Throwable ex) {
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("填充插件系统应用数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onFillAddinAppData(AppData appData, Entity session) throws Exception {
		if(this.getDeploySystem() != null) {
			ISystemRuntime iSystemRuntime = ServiceHub.getInstance().getLoadedSystemRuntime(this.getDeploySystem().getDeploySystemId(), false);
			if(iSystemRuntime != null) {
				ISystemAccessManager iSystemAccessManager = iSystemRuntime.getSystemAccessManager();
				if(iSystemAccessManager instanceof net.ibizsys.central.cloud.core.security.ISystemAccessManager) {
					((net.ibizsys.central.cloud.core.security.ISystemAccessManager)iSystemAccessManager).fillAddinAppData(appData, session);
				}
			}
		}
	}

	@Override
	public void registerMainAppRefApp(String strMainAppTag, String strSubAppTag) {
		this.mainAppRefAppMap.put(strMainAppTag.toUpperCase(), strSubAppTag);
	}

	@Override
	public IPSApplication getMainAppRefPSApplication(String strMainAppTag, boolean bTryMode) {
		String strSubAppTag = this.mainAppRefAppMap.get(strMainAppTag.toUpperCase());
		try {
			IPSApplication iPSApplication = null;
			if(StringUtils.hasLength(strSubAppTag)) {
				iPSApplication = this.getPSApplication(strSubAppTag, bTryMode);
			}
			if(iPSApplication != null || bTryMode) {
				return iPSApplication;
			}
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("指定主应用[%1$s]引用子应用不存在", strMainAppTag));
		}
		catch (Throwable ex) {
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("指定主应用[%1$s]引用子应用发生异常，%2$s", strMainAppTag, ex.getMessage()), ex);
		}
		
	}

	@Override
	public boolean unregisterMainAppRefApp(String strMainAppTag, String strSubAppTag) {
		return this.mainAppRefAppMap.remove(strMainAppTag, strSubAppTag);
	}
	
	
	
}
