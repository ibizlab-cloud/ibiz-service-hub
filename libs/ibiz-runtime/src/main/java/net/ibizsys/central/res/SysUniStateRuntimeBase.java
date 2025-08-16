package net.ibizsys.central.res;

import java.util.Set;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.sysutil.ISysUniStateListener;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.UniStateMode;
import net.ibizsys.model.PSModelEnums.UniStateType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.res.IPSSysUniState;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.SystemRuntimeException;

public abstract class SysUniStateRuntimeBase extends SystemModelRuntimeBase implements ISysUniStateRuntime, IModelRuntimeShutdownable {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysUniStateRuntimeBase.class);
	private IPSSysUniState iPSSysUniState = null;
	private ISysUniStateUtilRuntimeBase iSysUniStateUtilRuntimeBase = null;
	private UniStateType uniStateType = UniStateType.DE;
	private UniStateMode uniStateMode = UniStateMode.DEFAULT;
	private String strMonitorPath = null;
	
	/**
	 * 获取系统统一状态的配置目录
	 * @param iPSSysBDScheme
	 * @return
	 */
	public static String getConfigFolder(IPSSysUniState iPSSysUniState) {
		return ISystemRuntimeSetting.CONFIGFOLDER_SYSUNISTATE + "." + PSModelUtils.calcUniqueTag(iPSSysUniState.getPSSystemModule(), iPSSysUniState.getUniqueTag());
	}
	

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysUniState iPSSysUniState) throws Exception {
		Assert.notNull(iSystemRuntimeContext, "传入系统上下文对象无效");
		Assert.notNull(iPSSysUniState, "传入系统统一状态模型对象无效");
		
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysUniState = iPSSysUniState;

		this.setConfigFolder(getConfigFolder(iPSSysUniState));

		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {
		
		if(StringUtils.hasLength(this.getPSSysUniState().getUniStateType())) {
			this.uniStateType = UniStateType.from(this.getPSSysUniState().getUniStateType());
		}
		
		if(StringUtils.hasLength(this.getPSSysUniState().getUniStateMode())) {
			this.uniStateMode = UniStateMode.from(this.getPSSysUniState().getUniStateMode());
		}
		
		if(this.getSysUniStateUtilRuntimeBase(true) == null) {
			this.prepareSysUniStateUtilRuntimeBase();
			this.getSysUniStateUtilRuntimeBase(false);
		}
		

		super.onInit();
	}
	
	protected void prepareSysUniStateUtilRuntimeBase() throws Exception {
		
		if(UniStateMode.CACHE.value.equals(this.getPSSysUniState().getUniStateMode())) {
			this.setSysUniStateUtilRuntimeBase(this.getSystemRuntime().getSysUtilRuntime(ISysCacheUtilRuntime.class, false));
			return;
		}
		
		this.setSysUniStateUtilRuntimeBase(this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, false));
	}
	

	@Override
	public IPSSysUniState getPSSysUniState() {
		return this.iPSSysUniState;
	}

	@Override
	public String getId() {
		return getPSSysUniState().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysUniState().getName();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysUniState();
	}


	@Override
	public ISysUniStateUtilRuntimeBase getSysUniStateUtilRuntimeBase() {
		try {
			return getSysUniStateUtilRuntimeBase(false);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, ex.getMessage(), ex);
		}
	}
	
	protected ISysUniStateUtilRuntimeBase getSysUniStateUtilRuntimeBase(boolean bTryMode) throws Exception {
		if(this.iSysUniStateUtilRuntimeBase != null || bTryMode) {
			return this.iSysUniStateUtilRuntimeBase;
		}
		throw new Exception(String.format("系统统一状态组件对象无效"));
	}

	protected void setSysUniStateUtilRuntimeBase(ISysUniStateUtilRuntimeBase iSysUniStateUtilRuntimeBase) {
		this.iSysUniStateUtilRuntimeBase = iSysUniStateUtilRuntimeBase;
	}
	
	@Override
	public String getMonitorPath() {
		return strMonitorPath;
	}



	protected void setMonitorPath(String strMonitorPath) {
		this.strMonitorPath = strMonitorPath;
	}
	
	@Override
	public boolean contains(String strPath) {
		return this.getSysUniStateUtilRuntimeBase().contains(strPath);
	}


	@Override
	public void set(String strPath, String strValue) {
		this.getSysUniStateUtilRuntimeBase().set(strPath, strValue);
	}


	@Override
	public void set(String strPath, Object objValue) {
		this.getSysUniStateUtilRuntimeBase().set(strPath, objValue);
	}


	@Override
	public <T> T get(String strPath, Class<T> cls) {
		return this.getSysUniStateUtilRuntimeBase().get(strPath, cls);
	}


	@Override
	public <T> T get(String strPath, TypeReference<T> type) {
		return this.getSysUniStateUtilRuntimeBase().get(strPath, type);
	}


	@Override
	public String get(String strPath) {
		return this.getSysUniStateUtilRuntimeBase().get(strPath);
	}


	@Override
	public void reset(String strPath) {
		this.getSysUniStateUtilRuntimeBase().reset(strPath);
	}


	@Override
	public String getPathFormat(Set<String> folderList) {
		return this.getSysUniStateUtilRuntimeBase().getPathFormat(folderList);
	}


	@Override
	public boolean isEnableListener(boolean bPattern) {
		return this.getSysUniStateUtilRuntimeBase().isEnableListener(bPattern);
	}


	@Override
	public void registerListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) {
		this.getSysUniStateUtilRuntimeBase().registerListener(strPath, bPattern, iSysUniStateListener);
	}


	@Override
	public void unregisterListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) {
		this.getSysUniStateUtilRuntimeBase().unregisterListener(strPath, bPattern, iSysUniStateListener);
	}


	@Override
	public UniStateType getUniStateType() {
		return this.uniStateType;
	}


	@Override
	public UniStateMode getUniStateMode() {
		return this.uniStateMode;
	}

	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}
	
	protected void onShutdown() throws Exception{
		
	}

	
	
}
