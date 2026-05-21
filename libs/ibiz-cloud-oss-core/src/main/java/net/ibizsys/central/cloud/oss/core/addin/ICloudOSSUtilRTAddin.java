package net.ibizsys.central.cloud.oss.core.addin;

import net.ibizsys.central.cloud.core.addin.ICloudUtilRTAddin;
import net.ibizsys.central.cloud.oss.core.cloudutil.ICloudOSSUtilRuntimeContext;

/**
 * 云体系OSS功能插件对象接口
 * @author lionlau
 *
 */
public interface ICloudOSSUtilRTAddin extends ICloudUtilRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ICloudOSSUtilRuntimeContext ctx, Object addinData) throws Exception;

	

}
