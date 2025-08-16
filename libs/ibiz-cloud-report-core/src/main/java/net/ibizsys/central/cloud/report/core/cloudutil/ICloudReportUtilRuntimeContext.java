package net.ibizsys.central.cloud.report.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudReportUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.service.client.IWebClientRep;

public interface ICloudReportUtilRuntimeContext extends ICloudUtilRuntimeContext{

	/**
	 * 获取云体系报表功能对象
	 * @return
	 */
	default ICloudReportUtilRuntime getCloudReportUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ICloudReportUtilRuntime getModelRuntime();
	
	
	/**
	 * 指定Cloud服务调用
	 * @param strServiceId
	 * @param strServiceUrl
	 * @param objData
	 * @param cls
	 * @param strSystemTag
	 * @return
	 */
	<T> IWebClientRep<T> executeCloudServiceCall(String strServiceId, String strServiceUrl, Object objData, Class<T> cls, String strSystemTag);
	
}
