package net.ibizsys.central.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.dataentity.service.DEServiceAPIModes;
import net.ibizsys.central.dataentity.service.DEServiceAPIRSRuntime;
import net.ibizsys.central.dataentity.service.DEServiceAPIRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.runtime.util.domain.File;

public class SysServiceAPIRuntime extends SystemModelRuntimeBase implements ISysServiceAPIRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysServiceAPIRuntime.class);
	
	private IPSSysServiceAPI iPSSysServiceAPI = null;
	
	private Map<String, IDEServiceAPIRuntime> deServiceAPIRuntimeMap = null;
	private Map<String, IDEServiceAPIRSRuntime> deServiceAPIRSRuntimeMap = null;
	
	
	private ISysServiceAPIRuntimeContext iSysServiceAPIRuntimeContext = new ISysServiceAPIRuntimeContext() {

		@Override
		public ISysServiceAPIRuntime getSysServiceAPIRuntime() {
			return getSelf();
		}
		
	};
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysServiceAPI iPSSysServiceAPI) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysServiceAPI = iPSSysServiceAPI;
		Assert.notNull(this.iPSSysServiceAPI, "传入系统服务接口模型对象无效");
		
		 
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		// 准备实体服务接口
		java.util.List<IPSDEServiceAPI> psDEServiceAPIs = this.getPSSysServiceAPI().getPSDEServiceAPIs();
		if (psDEServiceAPIs != null) {
			for (IPSDEServiceAPI iPSDEServiceAPI : psDEServiceAPIs) {
				this.registerPSDEServiceAPI(iPSDEServiceAPI);
			}
		}
		
		java.util.List<IPSDEServiceAPIRS> psDEServiceAPIRSs = this.getPSSysServiceAPI().getPSDEServiceAPIRSs();
		if (psDEServiceAPIRSs != null) {
			for (IPSDEServiceAPIRS iPSDEServiceAPIRS : psDEServiceAPIRSs) {
				this.registerPSDEServiceAPIRS(iPSDEServiceAPIRS);
			}
		}
	}

	@Override
	public IPSSysServiceAPI getPSSysServiceAPI() {
		return this.iPSSysServiceAPI;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysServiceAPI();
	}
	
	@Override
	public int getAPILevel() {
		return getPSSysServiceAPI().getAPILevel();
	}
	
	
	@Override
	public String getId() {
		return getPSSysServiceAPI().getId();
	}

	@Override
	public String getName() {
		return getPSSysServiceAPI().getName();
	}

	protected ISysServiceAPIRuntimeContext getSysServiceAPIRuntimeContext() {
		return this.iSysServiceAPIRuntimeContext;
	}
	
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return (ISystemRuntimeContext)super.getSystemRuntimeBaseContext();
	}
	
	private ISysServiceAPIRuntime getSelf() {
		return this;
	}
	
	@Override
	public IDEServiceAPIRSRuntime getDEServiceAPIRSRuntime(String strMajorDETag, String strMinorDETag, boolean bTryMode) {
		Assert.hasLength(strMajorDETag, "传入服务实体主接口标记无效");
		Assert.hasLength(strMinorDETag, "传入服务实体从接口标记无效");
		
		return this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strMajorDETag, strMinorDETag).toUpperCase(), bTryMode);
	}
	
	@Override
	public IDEServiceAPIRuntime getDEServiceAPIRuntime(String strTag, boolean bTryMode){
		Assert.hasLength(strTag, "传入服务接口标记无效");
		IDEServiceAPIRuntime iDEServiceAPIRuntime = null;
		if (this.deServiceAPIRuntimeMap != null) {
			iDEServiceAPIRuntime = this.deServiceAPIRuntimeMap.get(strTag);
			if (iDEServiceAPIRuntime == null) {
				iDEServiceAPIRuntime = this.deServiceAPIRuntimeMap.get(strTag.toUpperCase());
			}
		}
		if (iDEServiceAPIRuntime != null || bTryMode) {
			return iDEServiceAPIRuntime;
		}
		throw new SysServiceAPIRuntimeException(this, String.format("无法获取指定实体服务接口[%1$s]运行时对象", strTag));
	}
	
	

	protected IDEServiceAPIRuntime registerPSDEServiceAPI(IPSDEServiceAPI iPSDEServiceAPI) {
		IDEServiceAPIRuntime iDEServiceAPIRuntime = this.createDEServiceAPIRuntime(iPSDEServiceAPI);
		if (iDEServiceAPIRuntime == null) {
			return null;
		}
		try {
			iDEServiceAPIRuntime.init(this.getSysServiceAPIRuntimeContext(), iPSDEServiceAPI);
		}
		catch(Exception ex) {
			throw new SysServiceAPIRuntimeException(this, String.format("初始化实体服务接口[%1$s]运行时对象发生异常，%2$s", iPSDEServiceAPI.getName(),ex.getMessage()), ex);
		}
		
		if (this.deServiceAPIRuntimeMap == null) {
			this.deServiceAPIRuntimeMap = new HashMap<>();
		}
		this.deServiceAPIRuntimeMap.put(iPSDEServiceAPI.getName().toUpperCase(), iDEServiceAPIRuntime);
		this.deServiceAPIRuntimeMap.put(iPSDEServiceAPI.getId(), iDEServiceAPIRuntime);
		if(StringUtils.hasLength(iPSDEServiceAPI.getCodeName())) {
			if(!this.deServiceAPIRuntimeMap.containsKey(iPSDEServiceAPI.getCodeName().toUpperCase())) {
				this.deServiceAPIRuntimeMap.put(iPSDEServiceAPI.getCodeName().toUpperCase(), iDEServiceAPIRuntime);
			}
		}
		//注入复数形
//		String strCodeName2 = iPSDEServiceAPI.getCodeName2();
//		if(!StringUtils.hasLength(strCodeName2)) {
//			strCodeName2 = Inflector.getInstance().pluralize(iPSDEServiceAPI.getCodeName());
//		}
//		
//		if(!this.deServiceAPIRuntimeMap.containsKey(strCodeName2.toUpperCase())) {
//			this.deServiceAPIRuntimeMap.put(strCodeName2.toUpperCase(), iDEServiceAPIRuntime);
//		}
		
		return iDEServiceAPIRuntime;
	}
	
	protected IDEServiceAPIRuntime createDEServiceAPIRuntime(IPSDEServiceAPI iPSDEServiceAPI)  {
		IDEServiceAPIRuntime iDEServiceAPIRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEServiceAPI.getPSSysSFPlugin(), IDEServiceAPIRuntime.class, true);
		if(iDEServiceAPIRuntime != null) {
			return iDEServiceAPIRuntime;
		}
		return createDefaultDEServiceAPIRuntime();
	}
	
	protected IDEServiceAPIRuntime createDefaultDEServiceAPIRuntime() {
		return new DEServiceAPIRuntime();
	}
	
	@Override
	public IDEServiceAPIRSRuntime getDEServiceAPIRSRuntime(String strTag, boolean bTryMode){
		Assert.notNull(strTag, "传入服务接口关系标记无效");
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if (this.deServiceAPIRSRuntimeMap != null) {
			iDEServiceAPIRSRuntime = this.deServiceAPIRSRuntimeMap.get(strTag);
			if (iDEServiceAPIRSRuntime == null) {
				iDEServiceAPIRSRuntime = this.deServiceAPIRSRuntimeMap.get(strTag.toUpperCase());
			}
		}
		if (iDEServiceAPIRSRuntime != null || bTryMode) {
			return iDEServiceAPIRSRuntime;
		}
		throw new SysServiceAPIRuntimeException(this, String.format("无法获取指定实体服务接口关系[%1$s]运行时对象", strTag));
	}
	
	protected IDEServiceAPIRSRuntime registerPSDEServiceAPIRS(IPSDEServiceAPIRS iPSDEServiceAPIRS) {
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = this.createDEServiceAPIRSRuntime(iPSDEServiceAPIRS);
		if (iDEServiceAPIRSRuntime == null) {
			return null;
		}
		try {
			iDEServiceAPIRSRuntime.init(this.getSysServiceAPIRuntimeContext(), iPSDEServiceAPIRS);
		}
		catch(Exception ex) {
			throw new SysServiceAPIRuntimeException(this, String.format("初始化实体服务接口关系[%1$s]运行时对象发生异常，%2$s", iPSDEServiceAPIRS.getName(),ex.getMessage()), ex);
		}
		
		if (this.deServiceAPIRSRuntimeMap == null) {
			this.deServiceAPIRSRuntimeMap = new HashMap<>();
		}
		this.deServiceAPIRSRuntimeMap.put(String.format("%1$s|%2$s",iPSDEServiceAPIRS.getMajorPSDEServiceAPIMust().getName(),
				iPSDEServiceAPIRS.getMinorPSDEServiceAPIMust().getName()).toUpperCase(), iDEServiceAPIRSRuntime);
		if(StringUtils.hasLength(iPSDEServiceAPIRS.getCodeName())) {
			//放入关系代码标识
			this.deServiceAPIRSRuntimeMap.put(String.format("%1$s|%2$s",iPSDEServiceAPIRS.getMajorPSDEServiceAPIMust().getName(),
					iPSDEServiceAPIRS.getCodeName()).toUpperCase(), iDEServiceAPIRSRuntime);
		}
		this.deServiceAPIRSRuntimeMap.put(iPSDEServiceAPIRS.getId(), iDEServiceAPIRSRuntime);
		return iDEServiceAPIRSRuntime;
	}
	
	protected IDEServiceAPIRSRuntime createDEServiceAPIRSRuntime(IPSDEServiceAPIRS iPSDEServiceAPIRS)  {
//		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEServiceAPIRS.getPSSysSFPlugin(), IDEServiceAPIRSRuntime.class, true);
//		if(iDEServiceAPIRSRuntime != null) {
//			return iDEServiceAPIRSRuntime;
//		}
		return this.createDefaultDEServiceAPIRSRuntime();
	}
	
	protected IDEServiceAPIRSRuntime createDefaultDEServiceAPIRSRuntime() {
		return new DEServiceAPIRSRuntime();
	}
	
	@Override
	public Object invokeDEMethod(String strScope, String strDataEntityName, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		return invokeDEMethod(strScope, null, null, strDataEntityName, strMethodName, objBody, strKey, objTag);
	
	}
	
	@Override
	public Object invokeDEMethod(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		return this.onInvokeDEMethod(strScope, strParentDEName, strParentKey, strDataEntityName, strMethodName, objBody, strKey, objTag);
	}
	
	protected Object onInvokeDEMethod(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}
		
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.invokeMethod(strScope, iDEServiceAPIRSRuntime, strParentKey, strMethodName, objBody, strKey, objTag);
	}

	@Override
	public Object invokeDEImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		return this.onInvokeDEImportData(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);
	}
	
	protected Object onInvokeDEImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.importData(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, objBody, objTag);
	}
	
	@Override
	public Object invokeDEImportData2(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		return this.onInvokeDEImportData2(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);		
	}
	
	protected Object onInvokeDEImportData2(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}

		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.importData2(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, objBody, objTag);
	}
	
	@Override
	public Object invokeDEAsyncImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		return this.onInvokeDEAsyncImportData(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);
	}
	
	protected Object onInvokeDEAsyncImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.asyncImportData(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, objBody, objTag);
	}
	
	
	@Override
	public Object invokeDEAsyncImportData2(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		return this.onInvokeDEAsyncImportData2(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);		
	}
	
	protected Object onInvokeDEAsyncImportData2(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}

		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.asyncImportData2(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, objBody, objTag);
	}

	
	
	@Override
	public Object invokeDEGetImportTemplate(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objTag) throws Throwable {
		return this.onInvokeDEGetImportTemplate(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objTag);
	}
	
	protected Object onInvokeDEGetImportTemplate(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objTag) throws Throwable {
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}
//		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
//		if(StringUtils.hasLength(strParentDEName)) {
//			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
//					iDEServiceAPIRuntime.getName()).toUpperCase(), false);
//		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.getImportTemplate(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, objTag);
	}
	

	@Override
	public Object invokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, Object objTag) throws Throwable {
		return this.onInvokeDEExportData(strScope, strParentDEName, strParentKey, strDataEntityName, strExportTag, objBody, objTag);
	}

	protected Object onInvokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.exportData(strScope, iDEServiceAPIRSRuntime, strParentKey, strExportTag, objBody, objTag);
	}
	
	
	@Override
	public Object invokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		return this.onInvokeDEExportData(strScope, strParentDEName, strParentKey, strDataEntityName, strExportTag, strMethodName, objBody, strKey, objTag);
	}
	
	protected Object onInvokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.exportData(strScope, iDEServiceAPIRSRuntime, strParentKey, strExportTag, strMethodName, objBody, strKey, objTag);
	}

	
	@Override
	public Object invokeDEAsyncExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		return this.onInvokeDEAsyncExportData(strScope, strParentDEName, strParentKey, strDataEntityName, strExportTag, strMethodName, objBody, strKey, objTag);
	}
	
	protected Object onInvokeDEAsyncExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.asyncExportData(strScope, iDEServiceAPIRSRuntime, strParentKey, strExportTag, strMethodName, objBody, strKey, objTag);
	}
	
	
	@Override
	public Object invokeDEPrintData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, Object objTag) throws Throwable {
		return this.onInvokeDEPrintData(strScope, strParentDEName, strParentKey, strDataEntityName, strPrintTag, strPrintType, objBody, strKey, objTag);		
	}

	protected Object onInvokeDEPrintData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}
//		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
//		if(StringUtils.hasLength(strParentDEName)) {
//			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
//					iDEServiceAPIRuntime.getName()).toUpperCase(), false);
//		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.printData(strScope, iDEServiceAPIRSRuntime, strParentKey, strPrintTag, strPrintType, objBody, strKey, objTag);
	}

	
	@Override
	public Object invokeDEWFStart(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		return this.onInvokeDEWFStart(strScope, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, objTag);
	}
	

	protected Object onInvokeDEWFStart(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}
//		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
//		if(StringUtils.hasLength(strParentDEName)) {
//			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
//					iDEServiceAPIRuntime.getName()).toUpperCase(), false);
//		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.wfStart(strScope, iDEServiceAPIRSRuntime, strParentKey, strWFTag, objBody, strKey, objTag);
	}
	
	@Override
	public Object invokeDEWFCancel(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		return this.onInvokeDEWFCancel(strScope, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, objTag);
	}
	
	protected Object onInvokeDEWFCancel(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
		}
//		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
//		if(StringUtils.hasLength(strParentDEName)) {
//			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
//					iDEServiceAPIRuntime.getName()).toUpperCase(), false);
//		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.wfCancel(strScope, iDEServiceAPIRSRuntime, strParentKey, strWFTag, objBody, strKey, objTag);
	}
	
	
	
	@Override
	public Object invokeDEDownloadFile(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		return this.onInvokeDEDownloadFile(strScope, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, objTag);
	}
	
	
	protected Object onInvokeDEDownloadFile(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);

//		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
//		if(StringUtils.hasLength(strParentDEName)) {
//			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
//					iDEServiceAPIRuntime.getName()).toUpperCase(), false);
//		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.downloadFile(strScope, iDEServiceAPIRSRuntime, strParentKey, strKey, strStorageField, file, objBody, objTag);
	}

	@Override
	public Object invokeDEUploadFile(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		return this.onInvokeDEUploadFile(strScope, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, objTag);
	}
	
	protected Object onInvokeDEUploadFile(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {

		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);

//		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
//		if(StringUtils.hasLength(strParentDEName)) {
//			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
//					iDEServiceAPIRuntime.getName()).toUpperCase(), false);
//		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.uploadFile(strScope, iDEServiceAPIRSRuntime, strParentKey, strKey, strStorageField, file, objBody, objTag);
	}
	

	@Override
	public Object invokeDEAutoComplete(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strACTag, String strMethodName, Object objBody, Object objTag) throws Throwable {
		return this.onInvokeDEAutoComplete(strScope, strParentDEName, strParentKey, strDataEntityName, strACTag, strMethodName, objBody, objTag);
	}
	
	protected Object onInvokeDEAutoComplete(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strACTag, String strMethodName, Object objBody, Object objTag) throws Throwable {
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);

//		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
//		if(StringUtils.hasLength(strParentDEName)) {
//			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
//					iDEServiceAPIRuntime.getName()).toUpperCase(), false);
//		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.autoComplete(strScope, iDEServiceAPIRSRuntime, strParentKey, strACTag, strMethodName, objBody, objTag);
	}
	
	
	@Override
	public Object invokeDEReport(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strReportTag, String strReportType, Object objBody, Object objTag) throws Throwable {
		return this.onInvokeDEReport(strScope, strParentDEName, strParentKey, strDataEntityName, strReportTag, strReportType, objBody, objTag);
	}
	
	
	protected Object onInvokeDEReport(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strReportTag, String strReportType, Object objBody, Object objTag) throws Throwable {
		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
		if(StringUtils.hasLength(strParentDEName)) {
			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
					strDataEntityName).toUpperCase(), false);
			//重写实体名称
			String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
			if(!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
				log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
				strDataEntityName = strMinorDEServiceAPIName;
			}
		}
		
		IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);

//		IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
//		if(StringUtils.hasLength(strParentDEName)) {
//			iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
//					iDEServiceAPIRuntime.getName()).toUpperCase(), false);
//		}
		
		if(iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
		}
		
		return iDEServiceAPIRuntime.report(strScope, iDEServiceAPIRSRuntime, strParentKey, strReportTag, strReportType, objBody, objTag);
	}
}
