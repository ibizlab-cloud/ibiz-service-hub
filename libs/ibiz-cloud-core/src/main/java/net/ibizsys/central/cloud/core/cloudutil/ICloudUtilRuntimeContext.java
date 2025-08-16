package net.ibizsys.central.cloud.core.cloudutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;

public interface ICloudUtilRuntimeContext extends ISysUtilRuntimeContext {

	/* (non-Javadoc)
	 * @see net.ibizsys.central.sysutil.ISysUtilRuntimeContext#getModelRuntime()
	 */
	ICloudUtilRuntime getModelRuntime();
}
