package net.ibizsys.central.cloud.portal.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudPortalUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public interface ICloudPortalUtilRuntimeContext extends ICloudUtilRuntimeContext{

	/**
	 * 获取云体系应用门户功能对象
	 * @return
	 */
	default ICloudPortalUtilRuntime getCloudPortalUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ICloudPortalUtilRuntime getModelRuntime();
	
	
}
