package net.ibizsys.central.cloud.uaa.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUAAUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

/**
 * 云体系UAA功能运行时对象上下文接口
 * 
 * @author lionlau
 *
 */
public interface ICloudUAAUtilRuntimeContext extends ICloudUtilRuntimeContext {

	/**
	 * 获取UAA运行时对象
	 * 
	 * @return
	 */
	default ICloudUAAUtilRuntime getCloudUAAUtilRuntime() {
		return this.getModelRuntime();
	}

	@Override
	ICloudUAAUtilRuntime getModelRuntime();
}
