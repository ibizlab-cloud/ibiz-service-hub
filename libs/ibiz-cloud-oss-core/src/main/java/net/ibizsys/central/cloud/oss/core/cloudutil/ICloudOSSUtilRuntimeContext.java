package net.ibizsys.central.cloud.oss.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudOSSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public interface ICloudOSSUtilRuntimeContext extends ICloudUtilRuntimeContext{

	/**
	 * 获取云体系OSS功能对象
	 * @return
	 */
	default ICloudOSSUtilRuntime getCloudOSSUtilRuntime(){
		return this.getModelRuntime();
	}
	
	
	@Override
	ICloudOSSUtilRuntime getModelRuntime();
	

	
	
}
