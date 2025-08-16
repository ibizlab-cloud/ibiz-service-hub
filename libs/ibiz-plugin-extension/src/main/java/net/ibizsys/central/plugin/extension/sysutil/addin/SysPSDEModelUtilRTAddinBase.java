package net.ibizsys.central.plugin.extension.sysutil.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.plugin.extension.sysutil.ISysPSDEModelUtilRuntime;
import net.ibizsys.central.plugin.extension.sysutil.ISysPSDEModelUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class SysPSDEModelUtilRTAddinBase extends ModelRTAddinBase implements ISysPSDEModelUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysPSDEModelUtilRTAddinBase.class);
	
	@Override
	public void init(ISysPSDEModelUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ISysPSDEModelUtilRuntimeContext getContext() {
		return (ISysPSDEModelUtilRuntimeContext)super.getContext();
	}

	protected ISysPSDEModelUtilRuntime getSysPSDEModelUtilRuntime() {
		return this.getContext().getModelRuntime();
	}
	
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getSysPSDEModelUtilRuntime().getSystemRuntime();
	}
}
