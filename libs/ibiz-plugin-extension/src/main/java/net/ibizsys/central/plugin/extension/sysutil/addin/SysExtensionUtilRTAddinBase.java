package net.ibizsys.central.plugin.extension.sysutil.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.plugin.extension.sysutil.ISysExtensionUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class SysExtensionUtilRTAddinBase extends ModelRTAddinBase implements ISysExtensionUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysExtensionUtilRTAddinBase.class);
	
	@Override
	public void init(ISysExtensionUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ISysExtensionUtilRuntimeContext getContext() {
		return (ISysExtensionUtilRuntimeContext)super.getContext();
	}

	protected ISysExtensionUtilRuntime getSysExtensionUtilRuntime() {
		return this.getContext().getSysExtensionUtilRuntime();
	}
	
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getSysExtensionUtilRuntime().getSystemRuntime();
	}
}
