package net.ibizsys.central.cloud.kb.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public interface ICloudKBUtilRuntimeContext extends ICloudUtilRuntimeContext{

	/**
	 * 获取云体系KB功能对象
	 * @return
	 */
	default ICloudKBUtilRuntime getCloudKBUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ICloudKBUtilRuntime getModelRuntime();
	
	
}
