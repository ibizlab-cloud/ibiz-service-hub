package net.ibizsys.central.app.dataentity;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.app.IApplicationRuntime;
import net.ibizsys.central.app.IApplicationRuntimeContext;
import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.runtime.util.domain.File;

/**
 * 应用实体运行时对象接口
 * 
 * @author lionlau
 *
 */
public class AppDataEntityRuntime extends DataEntityModelRuntimeBase implements IAppDataEntityRuntime {

	private IApplicationRuntimeContext iApplicationRuntimeContext = null;
	private IPSAppDataEntity iPSAppDataEntity = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
//	private Map<String, IPSAppDEMethod> psAppDataEntityMethodMap = new HashMap<String, IPSAppDEMethod>();
	private ISysServiceAPIRuntime iSysServiceAPIRuntime = null;
	private String strPSDEServiceAPIName = null;

	@Override
	public void init(IApplicationRuntimeContext iApplicationRuntimeContext, IPSAppDataEntity iPSAppDataEntity) throws Exception {
		Assert.notNull(iApplicationRuntimeContext, "传入系统前端应用运行时上下文对象无效");
		Assert.notNull(iPSAppDataEntity, "传入应用实体模型对象无效");

		this.iApplicationRuntimeContext = iApplicationRuntimeContext;
		// 获取对应的实体运行时对象，运行时模型不存在实体模型引用
//		Object objDataEntityRuntime = iApplicationRuntimeContext.getApplicationRuntime().getSystemRuntime().getDataEntityRuntime(iPSAppDataEntity.getPSDataEntityMust().getId());
//		if (!(objDataEntityRuntime instanceof IDataEntityRuntime)) {
//			throw new AppDataEntityRuntimeException(this, String.format("实体[%1$s]运行时对象不正确", iPSAppDataEntity.getPSDataEntityMust().getId()));
//		}
//		iDataEntityRuntime = (IDataEntityRuntime) objDataEntityRuntime;
//		this.setDataEntityRuntimeBase(iDataEntityRuntime);

		this.iPSAppDataEntity = iPSAppDataEntity;

		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {

		if(!StringUtils.hasLength(this.getPSAppDataEntity().getSysAPITag()) || !StringUtils.hasLength(this.getPSAppDataEntity().getDEAPITag())) {
			return;
		}
		
		this.setSysServiceAPIRuntime(this.getApplicationRuntimeContext().getApplicationRuntime().getSystemRuntime().getSysServiceAPIRuntime(this.getPSAppDataEntity().getSysAPITag(), false));
		this.setPSDEServiceAPIName(this.getPSAppDataEntity().getDEAPITag());
		IDEServiceAPIRuntime iDEServiceAPIRuntime = this.getSysServiceAPIRuntime().getDEServiceAPIRuntime(this.getPSAppDataEntity().getDEAPITag(), false);
		this.setDataEntityRuntimeBase(iDEServiceAPIRuntime.getDataEntityRuntime());
//		

		super.onInit();
	}

	@Override
	public IApplicationRuntime getApplicationRuntime() {
		return this.getApplicationRuntimeContext().getApplicationRuntime();
	}
	
	@Override
	public IPSAppDataEntity getPSAppDataEntity() {
		return this.iPSAppDataEntity;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSAppDataEntity();
	}

	protected IApplicationRuntimeContext getApplicationRuntimeContext() {
		return this.iApplicationRuntimeContext;
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	@Override
	public ISysServiceAPIRuntime getSysServiceAPIRuntime() {
		return this.iSysServiceAPIRuntime;
	}
	
	protected void setSysServiceAPIRuntime(ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
	}
	
	@Override
	public String getPSDEServiceAPIName() {
		return this.strPSDEServiceAPIName;
	}
	
	protected void setPSDEServiceAPIName(String strPSDEServiceAPIName) {
		this.strPSDEServiceAPIName = strPSDEServiceAPIName;
	}
	


	@Override
	public Object invokeMethod(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		if(this.getSysServiceAPIRuntime() == null || !StringUtils.hasLength(this.getPSDEServiceAPIName())) {
			throw new AppDataEntityRuntimeException(this, "应用实体服务接口无效");
		}
		if(iAppDataEntityRSRuntime == null) {
			return this.getSysServiceAPIRuntime().invokeDEMethod(strScope, getPSDEServiceAPIName(), strMethodName, objBody, strKey, objTag);
		}
		else {
			return this.getSysServiceAPIRuntime().invokeDEMethod(strScope, iAppDataEntityRSRuntime.getMajorAppDataEntityRuntime().getPSDEServiceAPIName(), strParentKey, this.getPSDEServiceAPIName(), strMethodName, objBody, strKey, objTag);
		}
	}
	

	@Override
	public Object importData(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable {
		if(this.getSysServiceAPIRuntime() == null || !StringUtils.hasLength(this.getPSDEServiceAPIName())) {
			throw new AppDataEntityRuntimeException(this, "应用实体服务接口无效");
		}
		if(iAppDataEntityRSRuntime == null) {
			return this.getSysServiceAPIRuntime().invokeDEImportData(strScope, null, null, this.getPSDEServiceAPIName(), strImportTag, objBody, objTag);
		}
		else {
			return this.getSysServiceAPIRuntime().invokeDEImportData(strScope, iAppDataEntityRSRuntime.getMajorAppDataEntityRuntime().getPSDEServiceAPIName(), strParentKey, this.getPSDEServiceAPIName(), strImportTag, objBody, objTag);
		}
	}

	@Override
	public Object exportData(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strExportTag, Object objBody, Object objTag) throws Throwable {
		if(this.getSysServiceAPIRuntime() == null || !StringUtils.hasLength(this.getPSDEServiceAPIName())) {
			throw new AppDataEntityRuntimeException(this, "应用实体服务接口无效");
		}
		if(iAppDataEntityRSRuntime == null) {
			return this.getSysServiceAPIRuntime().invokeDEExportData(strScope, null, null, this.getPSDEServiceAPIName(), strExportTag, objBody, objTag);
		}
		else {
			return this.getSysServiceAPIRuntime().invokeDEExportData(strScope, iAppDataEntityRSRuntime.getMajorAppDataEntityRuntime().getPSDEServiceAPIName(), strParentKey, this.getPSDEServiceAPIName(), strExportTag, objBody, objTag);
		}
	}
	
	@Override
	public Object exportData(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		if(this.getSysServiceAPIRuntime() == null || !StringUtils.hasLength(this.getPSDEServiceAPIName())) {
			throw new AppDataEntityRuntimeException(this, "应用实体服务接口无效");
		}
		if(iAppDataEntityRSRuntime == null) {
			return this.getSysServiceAPIRuntime().invokeDEExportData(strScope, null, null, this.getPSDEServiceAPIName(), strExportTag, strMethodName, objBody, strKey, objTag);
		}
		else {
			return this.getSysServiceAPIRuntime().invokeDEExportData(strScope, iAppDataEntityRSRuntime.getMajorAppDataEntityRuntime().getPSDEServiceAPIName(), strParentKey, this.getPSDEServiceAPIName(), strExportTag, strMethodName, objBody, strKey, objTag);
		}
	}
	

	@Override
	public Object printData(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strPrintTag, String strPrintType, Object objBody, String strKey, Object objTag) throws Throwable {
		if(this.getSysServiceAPIRuntime() == null || !StringUtils.hasLength(this.getPSDEServiceAPIName())) {
			throw new AppDataEntityRuntimeException(this, "应用实体服务接口无效");
		}
		if(iAppDataEntityRSRuntime == null) {
			return this.getSysServiceAPIRuntime().invokeDEPrintData(strScope, null, null, this.getPSDEServiceAPIName(), strPrintTag, strPrintType, objBody, strKey, objTag);
		}
		else {
			return this.getSysServiceAPIRuntime().invokeDEPrintData(strScope, iAppDataEntityRSRuntime.getMajorAppDataEntityRuntime().getPSDEServiceAPIName(), strParentKey, this.getPSDEServiceAPIName(), strPrintTag, strPrintType, objBody, strKey, objTag);
		}
	}

	@Override
	public Object wfStart(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		if(this.getSysServiceAPIRuntime() == null || !StringUtils.hasLength(this.getPSDEServiceAPIName())) {
			throw new AppDataEntityRuntimeException(this, "应用实体服务接口无效");
		}
		if(iAppDataEntityRSRuntime == null) {
			return this.getSysServiceAPIRuntime().invokeDEWFStart(strScope, null, null, this.getPSDEServiceAPIName(), strWFTag, objBody, strKey, objTag);
		}
		else {
			return this.getSysServiceAPIRuntime().invokeDEWFStart(strScope, iAppDataEntityRSRuntime.getMajorAppDataEntityRuntime().getPSDEServiceAPIName(), strParentKey, this.getPSDEServiceAPIName(), strWFTag, objBody, strKey, objTag);
		}
	}

	
	@Override
	public Object wfCancel(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		if(this.getSysServiceAPIRuntime() == null || !StringUtils.hasLength(this.getPSDEServiceAPIName())) {
			throw new AppDataEntityRuntimeException(this, "应用实体服务接口无效");
		}
		if(iAppDataEntityRSRuntime == null) {
			return this.getSysServiceAPIRuntime().invokeDEWFCancel(strScope, null, null, this.getPSDEServiceAPIName(), strWFTag, objBody, strKey, objTag);
		}
		else {
			return this.getSysServiceAPIRuntime().invokeDEWFCancel(strScope, iAppDataEntityRSRuntime.getMajorAppDataEntityRuntime().getPSDEServiceAPIName(), strParentKey, this.getPSDEServiceAPIName(), strWFTag, objBody, strKey, objTag);
		}
	}
	
	
	
	@Override
	public Object uploadFile(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		if(this.getSysServiceAPIRuntime() == null || !StringUtils.hasLength(this.getPSDEServiceAPIName())) {
			throw new AppDataEntityRuntimeException(this, "应用实体服务接口无效");
		}
		if(iAppDataEntityRSRuntime == null) {
			return this.getSysServiceAPIRuntime().invokeDEUploadFile(strScope, null, null, this.getPSDEServiceAPIName(), strKey, strStorageField, file, objBody, objTag);
		}
		else {
			return this.getSysServiceAPIRuntime().invokeDEUploadFile(strScope, iAppDataEntityRSRuntime.getMajorAppDataEntityRuntime().getPSDEServiceAPIName(), strParentKey, this.getPSDEServiceAPIName(), strKey, strStorageField, file, objBody, objTag);
		}
	}
	
	@Override
	public Object downloadFile(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		if(this.getSysServiceAPIRuntime() == null || !StringUtils.hasLength(this.getPSDEServiceAPIName())) {
			throw new AppDataEntityRuntimeException(this, "应用实体服务接口无效");
		}
		if(iAppDataEntityRSRuntime == null) {
			return this.getSysServiceAPIRuntime().invokeDEDownloadFile(strScope, null, null, this.getPSDEServiceAPIName(), strKey, strStorageField, file, objBody, objTag);
		}
		else {
			return this.getSysServiceAPIRuntime().invokeDEDownloadFile(strScope, iAppDataEntityRSRuntime.getMajorAppDataEntityRuntime().getPSDEServiceAPIName(), strParentKey, this.getPSDEServiceAPIName(), strKey, strStorageField, file, objBody, objTag);
		}
	}
}
