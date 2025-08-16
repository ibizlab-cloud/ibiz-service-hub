package net.ibizsys.central.plugin.open.sysutil.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.addin.SysUtilRTAddinBase;
import net.ibizsys.central.plugin.open.sysutil.ISysOpenUtilRuntime;
import net.ibizsys.central.plugin.open.sysutil.ISysOpenUtilRuntimeContext;

public abstract class SysOpenUtilRTAddinBase extends SysUtilRTAddinBase implements ISysOpenUtilRTAddin {
	
	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysOpenUtilRTAddinBase.class);

	@Override
	public void init(ISysOpenUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}
	
	@Override
	protected void onInit() throws Exception {
		if(!(super.getContext() instanceof ISysOpenUtilRuntimeContext)){
			throw new Exception(String.format("上下文对象[%1$s]类型不正确", super.getContext()));
		}
		super.onInit();
	}

	@Override
	protected ISysOpenUtilRuntimeContext getContext() {
		return (ISysOpenUtilRuntimeContext)super.getContext();
	}

	@Override
	protected ISysOpenUtilRuntime getSysUtilRuntime() {
		return this.getContext().getModelRuntime();
	}
}