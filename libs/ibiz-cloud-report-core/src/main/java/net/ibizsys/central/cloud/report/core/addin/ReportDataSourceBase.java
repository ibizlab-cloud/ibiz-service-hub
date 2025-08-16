package net.ibizsys.central.cloud.report.core.addin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class ReportDataSourceBase extends CloudReportUtilRTAddinBase implements IReportDataSource {

	private static final Log log = LogFactory.getLog(ReportDataSourceBase.class);
	
	
	@Override
	public Object executeAction(String strAction, Object params) {
		try {
			return this.onExecuteAction(strAction, params);
		} catch (Throwable ex) {
			log.error(String.format("报表数据源[%1$s]执行操作发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.REPORT_DATASOURCE, String.format("报表数据源[%1$s]执行操作发生异常，%2$s", getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudReportUtilRuntime(), String.format("报表数据源[%1$s]执行操作发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected Object onExecuteAction(String strAction, Object params) throws Throwable{
		throw new Exception("没有实现");
	}
	
//	protected Employee getEmployee(String strSystemId, String strOrgId, String strUAAUserName, String strToken) {
//		String strCacheCat = CloudCacheTagUtils.getAuthenticationUserCat(strUAAUserName, strToken);
//		String strCacheTag = CloudCacheTagUtils.getUserEmployeeTag(strSystemId, strOrgId);
//		return  this.getSysCacheUtilRuntime().get(strCacheCat, strCacheTag, Employee.class);
//	}
}
