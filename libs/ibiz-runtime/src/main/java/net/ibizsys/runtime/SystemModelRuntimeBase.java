package net.ibizsys.runtime;

import org.springframework.util.StringUtils;

/**
 * 系统模型运行时实现基类对象
 * @author lionlau
 *
 */
public abstract class SystemModelRuntimeBase extends ModelRuntimeBase2 implements ISystemModelRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SystemModelRuntimeBase.class);
	
	private ISystemRuntime iSystemRuntime = null;
	private IDynaInstRuntime iDynaInstRuntime = null;
	private ISystemRuntimeBaseContext iSystemRuntimeBaseContext = null;
	private String strConfigFolder = null;
	private IModelRuntimeSetting iModelRuntimeSetting = null;
	
	protected void setSystemRuntimeBaseContext(ISystemRuntimeBaseContext iSystemRuntimeBaseContext) {
		this.iSystemRuntimeBaseContext = iSystemRuntimeBaseContext;
		if(this.iSystemRuntimeBaseContext == null) {
			this.setSystemRuntimeBase(null);
		}
		else {
			this.setSystemRuntimeBase(this.iSystemRuntimeBaseContext.getSystemRuntime());
		}
	}
	
	protected ISystemRuntimeBaseContext getSystemRuntimeBaseContext() {
		return this.iSystemRuntimeBaseContext;
	}
	
	protected void setSystemRuntimeBase(ISystemRuntimeBase iSystemRuntimeBase) {
		if(iSystemRuntimeBase == null) {
			this.iSystemRuntime = null;
			this.iDynaInstRuntime = null;
		}
		else {
			if(iSystemRuntimeBase instanceof ISystemRuntime) {
				this.iSystemRuntime = (ISystemRuntime)iSystemRuntimeBase;
			}
			else
				if(iSystemRuntimeBase instanceof IDynaInstRuntime) {
					this.iDynaInstRuntime = (IDynaInstRuntime)iSystemRuntimeBase;
					this.iSystemRuntime = this.iDynaInstRuntime.getSystemRuntime();
				}
		}
		this.setSetting();
	}
	
	@Override
	public IDynaInstRuntime getDynaInstRuntime() {
		return this.iDynaInstRuntime;
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}
	
	
	
	public ISystemRuntimeBase getSystemRuntimeBase() {
		return (getDynaInstRuntime()!=null)?getDynaInstRuntime():getSystemRuntime();
	}
	
	
	protected void setConfigFolder(String strConfigFolder) {
		this.strConfigFolder = strConfigFolder;
		this.setSetting();
	}
	
	
	/**
	 * 获取模型的运行时配置目录
	 * @return
	 */
	protected String getConfigFolder() {
		return this.strConfigFolder;
	}
	
	
	private void setSetting() {
		if(StringUtils.hasLength(getConfigFolder()) && getSystemRuntime() != null) {
			if(this.getSetting() == null) {
				this.setSetting(new ModelRuntimeSetting(this, getSystemRuntime().getSystemRuntimeSetting(), getConfigFolder()));
			}
		}
		else {
			if(this.getSetting() != null) {
				this.setSetting(null);
			}
		}
	}
	
	@Override
	public IModelRuntimeSetting getSetting() {
		return this.iModelRuntimeSetting;
	}
	
	protected void setSetting(IModelRuntimeSetting iModelRuntimeSetting) {
		this.iModelRuntimeSetting = iModelRuntimeSetting;
	}
	
	
}
