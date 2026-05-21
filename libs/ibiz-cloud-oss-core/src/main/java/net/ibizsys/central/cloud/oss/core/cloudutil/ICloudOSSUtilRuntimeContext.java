package net.ibizsys.central.cloud.oss.core.cloudutil;

import java.io.File;

import net.ibizsys.central.cloud.core.cloudutil.ICloudOSSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.oss.core.addin.IOSSTextProvider;

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
	

	/**
	 * 获取OSS根文件夹
	 * @return
	 */
	File getOSSRootFolder();
	
	
	/**
	 * 获取OSS文本提供器
	 * @param strFileExt
	 * @param tryMode
	 * @return
	 */
	IOSSTextProvider getOSSTextProvider(String strFileExt, boolean tryMode) throws Exception;
}
