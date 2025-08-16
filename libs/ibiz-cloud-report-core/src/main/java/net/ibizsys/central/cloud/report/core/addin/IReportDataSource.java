package net.ibizsys.central.cloud.report.core.addin;

/**
 * 报表平台数据源
 * @author lionlau
 *
 */
public interface IReportDataSource extends ICloudReportUtilRTAddin{

	/**
	 * 执行数据源操作
	 * @param strAction
	 * @param params
	 * @return
	 */
	Object executeAction(String strAction, Object params) ;
}
