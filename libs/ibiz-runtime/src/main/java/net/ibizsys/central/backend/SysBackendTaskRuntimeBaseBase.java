package net.ibizsys.central.backend;

import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class SysBackendTaskRuntimeBaseBase implements ISysBackendTaskRuntimeBase {

	private String strId = KeyValueUtils.genUniqueId();
	
	@Override
	public String getId() {
		return strId;
	}

	@Override
	public String getName() {
		return "系统后台定时作业";
	}

	@Override
	public boolean isTimerMode() {
		return true;
	}

	@Override
	public boolean isLocalMode() {
		return true;
	}

	@Override
	public String getServiceContainer() {
		return null;
	}

	@Override
	public boolean isStandalone() {
		return false;
	}

}
