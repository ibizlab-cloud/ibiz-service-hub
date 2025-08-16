package net.ibizsys.central.system;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import net.ibizsys.central.ISystemPersistentAdapter;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.der.IDERRuntime;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.system.IPSSystemModule;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.action.IDEActionRuntime;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetRuntime;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.runtime.plugin.IModelRTAddin;
import net.ibizsys.runtime.plugin.ModelRTAddinRepo;
import net.ibizsys.runtime.util.LogLevels;

public abstract class SystemModuleUtilRuntimeBase extends SystemModuleRuntime implements ISystemModuleUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SystemModuleUtilRuntimeBase.class);
	
	private IPSSystemService iPSSystemService = null;
	private ISystemPersistentAdapter iSystemPersistentAdapter = null;
	private Map<String, Object> utilParamMap = new HashMap<>();
	private boolean bInstalled = false;
	private ModelRTAddinRepo modelRTAddinRepo = null;
	
	private ISystemModuleUtilRuntimeContext iSystemModuleUtilRuntimeContext;
	
	public void init(IPSSystemService iPSSystemService, IPSSystemModule iPSSystemModule )throws Exception {
		this.iPSSystemService = iPSSystemService;
		this.setPSSystemModule(iPSSystemModule);
		this.onInit();
	}
	
	protected ISystemModuleUtilRuntimeContext getModelRuntimeContext() {
		if(this.iSystemModuleUtilRuntimeContext == null) {
			this.iSystemModuleUtilRuntimeContext = this.createModelRuntimeContext();
		}
		return this.iSystemModuleUtilRuntimeContext;
	}
	
	private SystemModuleUtilRuntimeBase getSelf() {
		return this;
	}
	
	protected ISystemModuleUtilRuntimeContext createModelRuntimeContext() {
		return new SystemModuleUtilRuntimeContextBase() {
			
			@Override
			public ISystemModuleUtilRuntime getModelRuntime() {
				return getSelf();
			}

			@Override
			public <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
				return getSelf().getAddins(cls, strTypePrefix);
			}

			@Override
			public ISystemRuntimeContext getSystemRuntimeContext() {
				return getSelf().getSystemRuntimeContext();
			}
		};
	}
	
	@Override
	public synchronized void install() throws Exception {
		if(!this.bInstalled) {
			this.onInstall();
			this.bInstalled = true;
		}
	}
	
	protected void onInstall() throws Exception {
		if(this.getAddinRepo(true) == null) {
			prepareAddinRepo();
		}
	}
	
	protected void prepareAddinRepo() throws Exception {
		
	}
	
	@Override
	public synchronized void uninstall() {
		try {
			if(this.bInstalled) {
				onUninstall();
				this.bInstalled = false;
			}
		}
		catch(Throwable ex) {
			log.error(String.format("卸载模块功能[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("卸载模块功能[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}
	
	protected void onUninstall() throws Throwable{
		
	}
	
	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}

	@Override
	public IPSSystemService getPSSystemService() {
		if(this.iPSSystemService != null) {
			return this.iPSSystemService;
		}
		return super.getPSSystemService();
	}

	@Override
	public ISystemPersistentAdapter getSystemPersistentAdapter(IPSDataEntity iPSDataEntity) throws Exception {
		if(this.getSystemPersistentAdapter()!=null) {
			return this.getSystemPersistentAdapter();
		}
		return this.getSystemRuntimeContext().getSystemPersistentAdapter(iPSDataEntity);
	}
	
	protected void setSystemPersistentAdapter(ISystemPersistentAdapter iSystemPersistentAdapter) {
		this.iSystemPersistentAdapter = iSystemPersistentAdapter;
	}
	
	public ISystemPersistentAdapter getSystemPersistentAdapter() {
		return this.iSystemPersistentAdapter;
	}
	

	@Override
	public int getStorageMode(IPSDataEntity iPSDataEntity) {
		return this.getSystemRuntimeContext().getStorageMode(iPSDataEntity);
	}

	@Override
	public IDataEntityRuntime createDataEntityRuntime(IPSDataEntity iPSDataEntity) {
		return null;
	}

	@Override
	public IDELogicRuntime createDELogicRuntime(IPSDELogic iPSDELogic) {
		return null;
	}
	
	@Override
	public IDEMSLogicRuntime createDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic) {
		return null;
	}
	

	@Override
	public IDEDataSetRuntime createDEDataSetRuntime(IPSDEDataSet iPSDEDataSet) {
		
		return null;
	}

	@Override
	public IDEActionRuntime createDEActionRuntime(IPSDEAction iPSDEAction) {
		return null;
	}

	@Override
	public IDEDataImportRuntime createDEDataImportRuntime(IPSDEDataImport iPSDEDataImport) {
		return null;
	}

	@Override
	public IDEDataExportRuntime createDEDataExportRuntime(IPSDEDataExport iPSDEDataExport) {
		return null;
	}
	
	
	@Override
	public IDENotifyRuntime createDENotifyRuntime(IPSDENotify iPSDENotify) {
		return null;
	}

	
	@Override
	public IDERRuntime createDERRuntime(IPSDERBase iPSDERBase) {
		return null;
	}
	
	

	@Override
	public void setUtilParam(String strName, Object objValue) {
		Assert.hasLength(strName, "传入功能参数名称无效");
		this.utilParamMap.put(strName.toUpperCase(), objValue);
	}

	@Override
	public Object getUtilParam(String strName) {
		Assert.hasLength(strName, "传入功能参数名称无效");
		return this.utilParamMap.get(strName.toUpperCase());
	}
	
	public String getUtilParam(String strName, String strDefault) {
		Object objValue = this.getUtilParam(strName);
		if(objValue == null) {
			return strDefault;
		}
		return String.valueOf(objValue);
	}
	
	protected ModelRTAddinRepo getAddinRepo(boolean bTryMode) {
		if (this.modelRTAddinRepo != null || bTryMode) {
			return this.modelRTAddinRepo;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "插件仓库无效");
	}

	protected ModelRTAddinRepo getAddinRepo() {
		return this.getAddinRepo(false);
	}

	protected void setAddinRepo(ModelRTAddinRepo modelRTAddinRepo) {
		this.modelRTAddinRepo = modelRTAddinRepo;
	}

	protected void prepareAddinRepo(IModelRuntimeContext ctx, Class<? extends IModelRTAddin> addinCls, String strTypePrefix) throws Exception {
		ModelRTAddinRepo modelRTAddinRepo = new ModelRTAddinRepo();
		modelRTAddinRepo.init(ctx, addinCls, strTypePrefix, this.getSystemRuntime().getRuntimeObjectFactory());
		this.setAddinRepo(modelRTAddinRepo);
	}

	protected <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
		return this.getAddinRepo().getAddins(cls, strTypePrefix);
	}
	
}
