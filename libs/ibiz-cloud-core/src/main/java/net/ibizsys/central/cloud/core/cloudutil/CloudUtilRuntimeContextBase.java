package net.ibizsys.central.cloud.core.cloudutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;

public abstract class CloudUtilRuntimeContextBase<M extends ICloudUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements ICloudUtilRuntimeContext {

	public CloudUtilRuntimeContextBase(C proxyContext) {
		super(proxyContext);
	}
	
}
