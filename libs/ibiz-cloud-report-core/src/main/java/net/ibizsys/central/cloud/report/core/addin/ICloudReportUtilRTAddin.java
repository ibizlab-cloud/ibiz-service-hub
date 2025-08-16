package net.ibizsys.central.cloud.report.core.addin;

import net.ibizsys.central.cloud.report.core.cloudutil.ICloudReportUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 云体系报表功能插件对象接口
 * @author lionlau
 *
 */
public interface ICloudReportUtilRTAddin extends IModelRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ICloudReportUtilRuntimeContext ctx, Object addinData) throws Exception;

	

}
