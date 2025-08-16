package net.ibizsys.central.cloud.kb.core.addin;

import net.ibizsys.central.cloud.kb.core.cloudutil.ICloudKBUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 云体系KB功能插件对象接口
 * @author lionlau
 *
 */
public interface ICloudKBUtilRTAddin extends IModelRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ICloudKBUtilRuntimeContext ctx, Object addinData) throws Exception;

	

}
