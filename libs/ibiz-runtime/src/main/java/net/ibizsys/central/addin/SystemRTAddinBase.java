package net.ibizsys.central.addin;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.addin.ISystemRTAddin;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

/**
 * 系统运行时插件对象基类
 * @author lionlau
 *
 */
public abstract class SystemRTAddinBase extends ModelRTAddinBase implements ISystemRTAddin{
	
	@Override
	public void init(IModelRuntimeContext ctx, Object addinData) throws Exception {
		if(!(ctx instanceof ISystemRuntimeContext)){
			throw new Exception(String.format("传入上下文对象[%1$s]类型不正确", ctx));
		}
		super.init(ctx, addinData);
	}
	
	@Override
	protected ISystemRuntimeContext getContext() {
		return (ISystemRuntimeContext) super.getContext();
	}
	
	
	/**
	 * 获取系统运行时
	 * @return
	 */
	public ISystemRuntime getSystemRuntime() {
		return getContext().getSystemRuntime();
	}
}
