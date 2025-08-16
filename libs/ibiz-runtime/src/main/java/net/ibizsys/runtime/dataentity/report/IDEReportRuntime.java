package net.ibizsys.runtime.dataentity.report;

import java.io.OutputStream;

import net.ibizsys.model.dataentity.report.IPSDEReport;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 实体报表运行时接口
 * @author lionlau
 *
 */
public interface IDEReportRuntime extends IDataEntityModelRuntime, IDEReportRuntimeBase{

	/**
	 * 初始化实体报表运行时	
	 * @param iDataEntityRuntimeBase
	 * @param iPSDEReport
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBase iDataEntityRuntimeBase, IPSDEReport iPSDEReport) throws Exception;
	
	
	
	/**
	 * 获取实体报表模型对象
	 * @return
	 */
	IPSDEReport getPSDEReport();
	
	
	
	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	
	/**
	 * 输出打印内容到输出流
	 * @param outputStream
	 * @param iSearchContextBase
	 * @param strType
	 * @param bTestPriv 是否进行权限检测
	 * @throws Exception
	 */
	void output(OutputStream outputStream, ISearchContextBase iSearchContextBase, String strType, boolean bTestPriv) throws Throwable; 
	
}
