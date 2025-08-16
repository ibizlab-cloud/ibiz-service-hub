package net.ibizsys.runtime.dataentity.print;

import java.io.OutputStream;

import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.dataentity.report.IDEReportRuntimeBase;

/**
 * 实体打印运行时接口
 * @author lionlau
 *
 */
public interface IDEPrintRuntime extends IDataEntityModelRuntime, IDEReportRuntimeBase{


	
	
	/**
	 * 初始化实体打印运行时	
	 * @param iDataEntityRuntimeBase
	 * @param iPSDEPrint
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBase iDataEntityRuntimeBase, IPSDEPrint iPSDEPrint) throws Exception;
	
	
	
	/**
	 * 获取实体打印模型对象
	 * @return
	 */
	IPSDEPrint getPSDEPrint();
	
	
	
	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	

	
	/**
	 * 输出打印内容到输出流
	 * @param outputStream
	 * @param keys
	 * @param strType
	 * @param bTestPriv
	 * @throws Exception
	 */
	void output(OutputStream outputStream, Object[] keys, String strType, boolean bTestPriv) throws Throwable; 
	
}
