package net.ibizsys.central.cloud.saas.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

/**
 * 云体系SaaS运行时组件上下文对象接口
 * 
 * @author lionlau
 *
 */
public interface ICloudSaaSUtilRuntimeContext extends ICloudUtilRuntimeContext {

	@Override
	ICloudSaaSUtilRuntime getModelRuntime();

	/**
	 * 获取SaaS运行时对象
	 * 
	 * @return
	 */
	default ICloudSaaSUtilRuntime getCloudSaaSUtilRuntime() {
		return this.getModelRuntime();
	}
}
