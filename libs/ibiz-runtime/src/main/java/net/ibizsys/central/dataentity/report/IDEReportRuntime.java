package net.ibizsys.central.dataentity.report;

import javax.servlet.ServletResponse;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.central.util.ISearchContext;

/**
 * CLoud实体报表运行时对象接口，为Cloud体系中的报表系统提供接口数据源支持
 * @author lionlau
 *
 */
public interface IDEReportRuntime extends net.ibizsys.runtime.dataentity.report.IDEReportRuntime,IDataEntityModelRuntime {

	/**
	 * 获取访问标识
	 * @return
	 */
	String getAccessKey();
	
//	/**
//	 * 执行作业
//	 * @param strAction
//	 * @param objBody
//	 * @param strKey
//	 * @param objTag
//	 * @return
//	 */
//	Object executeAction(String strAction, Object objBody, String strKey, Object objTag);
	
	
	/**
	 * 输出打印内容到输出流
	 * @param servletResponse
	 * @param iSearchContext
	 * @param strType
	 * @param bTestPriv 是否进行权限检测
	 * @throws Exception
	 */
	void output(ServletResponse servletResponse, ISearchContext iSearchContext, String strType, boolean bTestPriv) throws Throwable; 
	
}
