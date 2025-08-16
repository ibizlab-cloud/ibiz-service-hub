package net.ibizsys.central.system;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.system.IPSSysRef;


public abstract class SysRefRuntimeBase extends SystemModelRuntimeBase implements ISysRefRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysRefRuntimeBase.class);
	
	private IPSSysRef iPSSysRef = null;
	private boolean bInstalled = false;
	
	/**
	 * 获取系统引用的配置目录
	 * @param iPSSysBDScheme
	 * @return
	 */
	public static String getConfigFolder(IPSSysRef iPSSysRef) {
		return ISystemRuntimeSetting.CONFIGFOLDER_SYSREF + "." + PSModelUtils.calcUniqueTag(iPSSysRef.getSysRefTag());
	}
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysRef iPSSysRef) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysRef = iPSSysRef;
		this.setConfigFolder(getConfigFolder(iPSSysRef));
		this.onInit();
	}
	
	@Override
	public IPSSysRef getPSSysRef() {
		return this.iPSSysRef;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysRef();
	}
	
	@Override
	public synchronized void install() throws Exception {
		if(!this.bInstalled) {
			
			this.onInstall();
			
			this.bInstalled = true;
		}
	}
	
	
	protected void onInstall() throws Exception {
		
	}
	
	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}
	
	@Override
	public synchronized void uninstall() {
		try {
			onUninstall();
		}
		catch(Throwable ex) {
			log.error(String.format("卸载系统引用[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			//this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("卸载系统功能[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}
	
	protected void onUninstall() throws Throwable{
		
	}
}
