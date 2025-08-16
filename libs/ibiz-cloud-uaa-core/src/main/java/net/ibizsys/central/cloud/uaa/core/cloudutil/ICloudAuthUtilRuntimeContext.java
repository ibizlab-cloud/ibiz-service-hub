package net.ibizsys.central.cloud.uaa.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

/**
 * 云体系认证功能运行时对象上下文接口
 * @author lionlau
 *
 */
public interface ICloudAuthUtilRuntimeContext  extends ICloudUtilRuntimeContext{

	/**
	 * 获取Auth运行时对象
	 * @return
	 */
	default ICloudAuthUtilRuntime getCloudAuthUtilRuntime() {
		return getModelRuntime();
	}
	
	
	@Override
	ICloudAuthUtilRuntime getModelRuntime();
	
	
	
}
