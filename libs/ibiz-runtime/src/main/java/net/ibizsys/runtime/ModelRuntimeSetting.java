package net.ibizsys.runtime;

import java.util.Map;

import org.springframework.util.Assert;

public class ModelRuntimeSetting implements IModelRuntimeSetting {

	private IModelRuntime iModelRuntime = null;
	private ISystemRuntimeSetting iSystemRuntimeSetting = null;
	private String strConfigFolder = null;
	
	public ModelRuntimeSetting(IModelRuntime iModelRuntime, ISystemRuntimeSetting iSystemRuntimeSetting, String strConfigFolder) {
		Assert.notNull(iModelRuntime, "传入模型运行时对象无效");
		Assert.notNull(iSystemRuntimeSetting, "传入模型运行时设置对象无效");
		Assert.hasLength(strConfigFolder, "传入配置目录无效");
		
		this.setModelRuntime(iModelRuntime);
		this.setSystemRuntimeSetting(iSystemRuntimeSetting);
		this.setConfigFolder(strConfigFolder);
	}
	
	protected IModelRuntime getModelRuntime() {
		return iModelRuntime;
	}

	protected void setModelRuntime(IModelRuntime iModelRuntime) {
		this.iModelRuntime = iModelRuntime;
	}

	protected ISystemRuntimeSetting getSystemRuntimeSetting() {
		return iSystemRuntimeSetting;
	}

	protected void setSystemRuntimeSetting(ISystemRuntimeSetting iSystemRuntimeSetting) {
		this.iSystemRuntimeSetting = iSystemRuntimeSetting;
	}

	protected String getConfigFolder() {
		return strConfigFolder;
	}

	protected void setConfigFolder(String strConfigFolder) {
		this.strConfigFolder = strConfigFolder;
	}


	@Override
	public Object getParam(String strKey) {
		return getSystemRuntimeSetting().getParam(String.format("%1$s.%2$s", getConfigFolder(), strKey));
	}

	@Override
	public String getParam(String strKey, String strDefault) {
		return getSystemRuntimeSetting().getParam(String.format("%1$s.%2$s", getConfigFolder(), strKey), strDefault);
	}

	@Override
	public int getParam(String strKey, int nDefault) {
		return getSystemRuntimeSetting().getParam(String.format("%1$s.%2$s", getConfigFolder(), strKey), nDefault);
	}

	@Override
	public double getParam(String strKey, double fDefault) {
		return getSystemRuntimeSetting().getParam(String.format("%1$s.%2$s", getConfigFolder(), strKey), fDefault);
	}

	@Override
	public boolean getParam(String strKey, boolean bDefault) {
		return getSystemRuntimeSetting().getParam(String.format("%1$s.%2$s", getConfigFolder(), strKey), bDefault);
	}

	@Override
	public Map<String, Object> getParams(String strPKey, Map<String, Object> params) {
		return getSystemRuntimeSetting().getParams(String.format("%1$s.%2$s", getConfigFolder(), strPKey), params);
	}

	@Override
	public boolean containsParam(String strKey) {
		return getSystemRuntimeSetting().containsParam(String.format("%1$s.%2$s", getConfigFolder(), strKey));
	}

}
