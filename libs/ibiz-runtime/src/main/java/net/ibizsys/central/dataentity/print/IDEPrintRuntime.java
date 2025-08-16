package net.ibizsys.central.dataentity.print;

import javax.servlet.ServletResponse;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;

public interface IDEPrintRuntime extends net.ibizsys.runtime.dataentity.print.IDEPrintRuntime,IDataEntityModelRuntime {


	
	/**
	 * 输出打印内容到输出流
	 * @param servletResponse
	 * @param keys
	 * @param strType
	 * @param bTestPriv
	 * @throws Exception
	 */
	void output(ServletResponse servletResponse, Object[] keys, String strType, boolean bTestPriv) throws Throwable; 
}
