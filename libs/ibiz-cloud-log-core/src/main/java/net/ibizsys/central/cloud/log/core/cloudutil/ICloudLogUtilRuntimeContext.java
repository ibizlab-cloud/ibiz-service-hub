package net.ibizsys.central.cloud.log.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public interface ICloudLogUtilRuntimeContext extends ICloudUtilRuntimeContext{

	/**
	 * 获取云体系日志功能对象
	 * @return
	 */
	default ICloudLogUtilRuntime getCloudLogUtilRuntime() {
		return getModelRuntime();
	}
	
	
	@Override
	ICloudLogUtilRuntime getModelRuntime();
	
	
}
