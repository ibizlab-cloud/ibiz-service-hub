package net.ibizsys.central;

/**
 * 系统模型运行时实现基类对象
 * @author lionlau
 *
 */
public abstract class SystemModelRuntimeBase extends net.ibizsys.runtime.SystemModelRuntimeBase implements ISystemModelRuntime{

	@Override
	public IDynaInstRuntime getDynaInstRuntime() {
		return (IDynaInstRuntime) super.getDynaInstRuntime();
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return (ISystemRuntime) super.getSystemRuntime();
	}
	
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return (ISystemRuntimeContext) super.getSystemRuntimeBaseContext();
	}
	
	
	public ISystemRuntimeSetting getSystemRuntimeSetting() {
		if(this.getSystemRuntime() != null) {
			return this.getSystemRuntime().getSystemRuntimeSetting();
		}
		return null;
	}
	
}
