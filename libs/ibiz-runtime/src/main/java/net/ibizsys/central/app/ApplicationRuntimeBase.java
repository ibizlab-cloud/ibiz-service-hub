package net.ibizsys.central.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.app.dataentity.AppDataEntityRSRuntime;
import net.ibizsys.central.app.dataentity.AppDataEntityRuntime;
import net.ibizsys.central.app.dataentity.IAppDataEntityRSRuntime;
import net.ibizsys.central.app.dataentity.IAppDataEntityRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDERS;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.IModelRTAddin;
import net.ibizsys.runtime.plugin.ModelRTAddinRepo;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.File;

public abstract class ApplicationRuntimeBase extends SystemModelRuntimeBase implements IApplicationRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ApplicationRuntimeBase.class);

	private IPSApplication iPSApplication = null;
	private boolean bInstalled = false;
	private ModelRTAddinRepo modelRTAddinRepo = null;
	
	private Map<String, IAppDataEntityRuntime> appDataEntityRuntimeMap = null;
	private Map<String, IAppDataEntityRSRuntime> appDataEntityRSRuntimeMap = null;

	/**
	 * 获取前端应用的配置目录
	 * @param iPSApplication
	 * @return
	 */
	public static String getConfigFolder(IPSApplication iPSApplication) {
		return ISystemRuntimeSetting.CONFIGFOLDER_APP + "." + PSModelUtils.calcUniqueTag(iPSApplication.getCodeName());
	}
	
	private IApplicationRuntimeContext iApplicationRuntimeContext = new IApplicationRuntimeContext() {

		@Override
		public IApplicationRuntime getApplicationRuntime() {
			return getSelf();
		}

	};

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSApplication iPSApplication) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSApplication = iPSApplication;
		Assert.notNull(this.iPSApplication, "传入系统前端应用模型对象无效");
		this.setConfigFolder(getConfigFolder(iPSApplication));
		
		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		// 准备应用实体
		preparePSAppDataEntities();
	}
	
	protected void preparePSAppDataEntities() throws Exception{
		java.util.List<IPSAppDataEntity> psAppDataEntitys = this.getPSApplication().getAllPSAppDataEntities();
		if (psAppDataEntitys != null) {
			for (IPSAppDataEntity iPSAppDataEntity : psAppDataEntitys) {
				this.registerPSAppDataEntity(iPSAppDataEntity);
			}

			for (IPSAppDataEntity iPSAppDataEntity : psAppDataEntitys) {
				java.util.List<IPSAppDERS> psAppDERSs = iPSAppDataEntity.getMinorPSAppDERSs();
				if (psAppDERSs != null) {
					for (IPSAppDERS iPSAppDERS : psAppDERSs) {
						this.registerPSAppDERS(iPSAppDERS);
					}
				}
			}
		}
	}

	@Override
	public IPSApplication getPSApplication() {
		return this.iPSApplication;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSApplication();
	}

	@Override
	public String getId() {
		return getPSApplication().getId();
	}

	@Override
	public String getName() {
		return getPSApplication().getName();
	}

	protected IApplicationRuntimeContext getApplicationRuntimeContext() {
		return this.iApplicationRuntimeContext;
	}

	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return (ISystemRuntimeContext) super.getSystemRuntimeBaseContext();
	}

	private IApplicationRuntime getSelf() {
		return this;
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
	
	@Override
	public IAppDataEntityRuntime getAppDataEntityRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入前端应用标记无效");
		IAppDataEntityRuntime iAppDataEntityRuntime = null;
		if (this.appDataEntityRuntimeMap != null) {
			iAppDataEntityRuntime = this.appDataEntityRuntimeMap.get(strTag);
			if (iAppDataEntityRuntime == null) {
				iAppDataEntityRuntime = this.appDataEntityRuntimeMap.get(strTag.toUpperCase());
			}
		}
		if (iAppDataEntityRuntime != null || bTryMode) {
			return iAppDataEntityRuntime;
		}
		throw new ApplicationRuntimeException(this, String.format("无法获取指定应用实体[%1$s]运行时对象", strTag));
	}

	protected IAppDataEntityRuntime registerPSAppDataEntity(IPSAppDataEntity iPSAppDataEntity) {
		IAppDataEntityRuntime iAppDataEntityRuntime = this.createAppDataEntityRuntime(iPSAppDataEntity);
		if (iAppDataEntityRuntime == null) {
			return null;
		}
		try {
			iAppDataEntityRuntime.init(this.getApplicationRuntimeContext(), iPSAppDataEntity);
		} catch (Exception ex) {
			throw new ApplicationRuntimeException(this, String.format("初始化应用实体[%1$s]运行时对象发生异常，%2$s", iPSAppDataEntity.getName(), ex.getMessage()), ex);
		}

		if (this.appDataEntityRuntimeMap == null) {
			this.appDataEntityRuntimeMap = new HashMap<>();
		}
		this.appDataEntityRuntimeMap.put(iPSAppDataEntity.getName().toUpperCase(), iAppDataEntityRuntime);
		this.appDataEntityRuntimeMap.put(iPSAppDataEntity.getId(), iAppDataEntityRuntime);
		return iAppDataEntityRuntime;
	}

	protected IAppDataEntityRuntime createAppDataEntityRuntime(IPSAppDataEntity iPSAppDataEntity) {
		 IAppDataEntityRuntime iAppDataEntityRuntime = this.getSystemRuntime().getRuntimeObject(iPSAppDataEntity.getPSSysSFPlugin(), IAppDataEntityRuntime.class, true);
		 if(iAppDataEntityRuntime != null) {
			 return iAppDataEntityRuntime;
		 }
		return createDefaultAppDataEntityRuntime();
	}

	protected IAppDataEntityRuntime createDefaultAppDataEntityRuntime() {
		return new AppDataEntityRuntime();
	}

	@Override
	public IAppDataEntityRSRuntime getAppDataEntityRSRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入前端应用关系标记无效");
		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = null;
		if (this.appDataEntityRSRuntimeMap != null) {
			iAppDataEntityRSRuntime = this.appDataEntityRSRuntimeMap.get(strTag);
			if (iAppDataEntityRSRuntime == null) {
				iAppDataEntityRSRuntime = this.appDataEntityRSRuntimeMap.get(strTag.toUpperCase());
			}
		}
		if (iAppDataEntityRSRuntime != null || bTryMode) {
			return iAppDataEntityRSRuntime;
		}
		throw new ApplicationRuntimeException(this, String.format("无法获取指定应用实体关系[%1$s]运行时对象", strTag));
	}

	protected IAppDataEntityRSRuntime registerPSAppDERS(IPSAppDERS iPSAppDERS) {
		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = this.createAppDataEntityRSRuntime(iPSAppDERS);
		if (iAppDataEntityRSRuntime == null) {
			return null;
		}
		try {
			iAppDataEntityRSRuntime.init(this.getApplicationRuntimeContext(), iPSAppDERS);
		} catch (Exception ex) {
			throw new ApplicationRuntimeException(this, String.format("初始化应用实体关系[%1$s]运行时对象发生异常，%2$s", iPSAppDERS.getName(), ex.getMessage()), ex);
		}

		if (this.appDataEntityRSRuntimeMap == null) {
			this.appDataEntityRSRuntimeMap = new HashMap<>();
		}
		this.appDataEntityRSRuntimeMap.put(String.format("%1$s|%2$s", iPSAppDERS.getMajorPSAppDataEntityMust().getName(), iPSAppDERS.getMinorPSAppDataEntityMust().getName()).toUpperCase(), iAppDataEntityRSRuntime);
		this.appDataEntityRSRuntimeMap.put(iPSAppDERS.getId(), iAppDataEntityRSRuntime);
		return iAppDataEntityRSRuntime;
	}

	protected IAppDataEntityRSRuntime createAppDataEntityRSRuntime(IPSAppDERS iPSAppDERS) {
		// IAppDataEntityRSRuntime iAppDataEntityRSRuntime =
		// this.getSystemRuntime().getRuntimeObject(iPSAppDERS.getPSSysSFPlugin(),
		// IAppDataEntityRSRuntime.class, true);
		// if(iAppDataEntityRSRuntime != null) {
		// return iAppDataEntityRSRuntime;
		// }
		return this.createDefaultAppDataEntityRSRuntime();
	}

	protected IAppDataEntityRSRuntime createDefaultAppDataEntityRSRuntime() {
		return new AppDataEntityRSRuntime();
	}

	@Override
	public Object invokeDEMethod(String strScope, String strDataEntityName, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		return invokeDEMethod(strScope, null, null, strDataEntityName, strMethodName, objBody, strKey, objTag);

	}

	@Override
	public Object invokeDEMethod(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		IAppDataEntityRuntime iAppDataEntityRuntime = (IAppDataEntityRuntime) this.getAppDataEntityRuntime(strDataEntityName, false);
		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = null;
		if (StringUtils.hasLength(strParentDEName)) {
			iAppDataEntityRSRuntime = this.getAppDataEntityRSRuntime(String.format("%1$s|%2$s", strParentDEName, iAppDataEntityRuntime.getName()).toUpperCase(), false);
		}

		return iAppDataEntityRuntime.invokeMethod(strScope, iAppDataEntityRSRuntime, strParentKey, strMethodName, objBody, strKey, objTag);
	}

	@Override
	public Object invokeDEImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		IAppDataEntityRuntime iAppDataEntityRuntime = (IAppDataEntityRuntime) this.getAppDataEntityRuntime(strDataEntityName, false);

		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = null;
		if (StringUtils.hasLength(strParentDEName)) {
			iAppDataEntityRSRuntime = this.getAppDataEntityRSRuntime(String.format("%1$s|%2$s", strParentDEName, iAppDataEntityRuntime.getName()).toUpperCase(), false);
		}

		return iAppDataEntityRuntime.importData(strScope, iAppDataEntityRSRuntime, strParentKey, strImportTag, objBody, objTag);
	}

	@Override
	public Object invokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, Object objTag) throws Throwable {
		IAppDataEntityRuntime iAppDataEntityRuntime = (IAppDataEntityRuntime) this.getAppDataEntityRuntime(strDataEntityName, false);
		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = null;
		if (StringUtils.hasLength(strParentDEName)) {
			iAppDataEntityRSRuntime = this.getAppDataEntityRSRuntime(String.format("%1$s|%2$s", strParentDEName, iAppDataEntityRuntime.getName()).toUpperCase(), false);
		}

		return iAppDataEntityRuntime.exportData(strScope, iAppDataEntityRSRuntime, strParentKey, strExportTag, objBody, objTag);
	}

	
	@Override
	public Object invokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		IAppDataEntityRuntime iAppDataEntityRuntime = (IAppDataEntityRuntime) this.getAppDataEntityRuntime(strDataEntityName, false);
		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = null;
		if (StringUtils.hasLength(strParentDEName)) {
			iAppDataEntityRSRuntime = this.getAppDataEntityRSRuntime(String.format("%1$s|%2$s", strParentDEName, iAppDataEntityRuntime.getName()).toUpperCase(), false);
		}

		return iAppDataEntityRuntime.exportData(strScope, iAppDataEntityRSRuntime, strParentKey, strExportTag, strMethodName, objBody, strKey, objTag);
	}
	
	@Override
	public Object invokeDEPrintData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, Object objTag) throws Throwable {
		IAppDataEntityRuntime iAppDataEntityRuntime = (IAppDataEntityRuntime) this.getAppDataEntityRuntime(strDataEntityName, false);
		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = null;
		if (StringUtils.hasLength(strParentDEName)) {
			iAppDataEntityRSRuntime = this.getAppDataEntityRSRuntime(String.format("%1$s|%2$s", strParentDEName, iAppDataEntityRuntime.getName()).toUpperCase(), false);
		}
		return iAppDataEntityRuntime.printData(strScope, iAppDataEntityRSRuntime, strParentKey, strPrintTag, strPrintType, objBody, strKey, objTag);
	}

	@Override
	public Object invokeDEWFStart(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		IAppDataEntityRuntime iAppDataEntityRuntime = (IAppDataEntityRuntime) this.getAppDataEntityRuntime(strDataEntityName, false);
		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = null;
		if (StringUtils.hasLength(strParentDEName)) {
			iAppDataEntityRSRuntime = this.getAppDataEntityRSRuntime(String.format("%1$s|%2$s", strParentDEName, iAppDataEntityRuntime.getName()).toUpperCase(), false);
		}
		return iAppDataEntityRuntime.wfStart(strScope, iAppDataEntityRSRuntime, strParentKey, strWFTag, objBody, strKey, objTag);
	}

	@Override
	public Object invokeDEWFCancel(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		IAppDataEntityRuntime iAppDataEntityRuntime = (IAppDataEntityRuntime) this.getAppDataEntityRuntime(strDataEntityName, false);
		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = null;
		if (StringUtils.hasLength(strParentDEName)) {
			iAppDataEntityRSRuntime = this.getAppDataEntityRSRuntime(String.format("%1$s|%2$s", strParentDEName, iAppDataEntityRuntime.getName()).toUpperCase(), false);
		}
		return iAppDataEntityRuntime.wfCancel(strScope, iAppDataEntityRSRuntime, strParentKey, strWFTag, objBody, strKey, objTag);
	}
	
	@Override
	public Object invokeDEUploadFile(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		IAppDataEntityRuntime iAppDataEntityRuntime = (IAppDataEntityRuntime) this.getAppDataEntityRuntime(strDataEntityName, false);
		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = null;
		if (StringUtils.hasLength(strParentDEName)) {
			iAppDataEntityRSRuntime = this.getAppDataEntityRSRuntime(String.format("%1$s|%2$s", strParentDEName, iAppDataEntityRuntime.getName()).toUpperCase(), false);
		}
		return iAppDataEntityRuntime.uploadFile(strScope, iAppDataEntityRSRuntime, strParentKey, strKey, strStorageField, file, objBody, objTag);
	}
	
	@Override
	public Object invokeDEDownloadFile(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		IAppDataEntityRuntime iAppDataEntityRuntime = (IAppDataEntityRuntime) this.getAppDataEntityRuntime(strDataEntityName, false);
		IAppDataEntityRSRuntime iAppDataEntityRSRuntime = null;
		if (StringUtils.hasLength(strParentDEName)) {
			iAppDataEntityRSRuntime = this.getAppDataEntityRSRuntime(String.format("%1$s|%2$s", strParentDEName, iAppDataEntityRuntime.getName()).toUpperCase(), false);
		}
		return iAppDataEntityRuntime.downloadFile(strScope, iAppDataEntityRSRuntime, strParentKey, strKey, strStorageField, file, objBody, objTag);
	}
	
}
