package net.ibizsys.central.cloud.ai.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public interface ICloudAIUtilRuntimeContext extends ICloudUtilRuntimeContext{

	/**
	 * 获取云体系AI功能对象
	 * @return
	 */
	ICloudAIUtilRuntime getModelRuntime();
	
	/**
	 * 获取云体系AI功能对象（旧版本）
	 * @return
	 */
	default ICloudAIUtilRuntime getCloudAIUtilRuntime() {
		return getModelRuntime();
	}
	
	
	
}
