package net.ibizsys.central.cloud.core.dataentity.print;

import java.io.OutputStream;

import javax.servlet.ServletResponse;

import net.ibizsys.model.PSModelEnums.DEPrintDynamicMode;

public interface IDEPrintRuntime extends net.ibizsys.central.dataentity.print.IDEPrintRuntime {

	/**
	 * 获取实体打印动态模式
	 * @return
	 */
	DEPrintDynamicMode getDynamicMode();
	
	
	/**
	 * 输出打印内容到输出流
	 * @param servletResponse
	 * @param keys
	 * @param strType
	 * @param bTestPriv
	 * @throws Exception
	 */
	void output(String strSubPrintTag, ServletResponse servletResponse, Object[] keys, String strType, boolean bTestPriv) throws Throwable; 
	
	/**
	 * 输出打印内容到输出流
	 * @param outputStream
	 * @param keys
	 * @param strType
	 * @param bTestPriv
	 * @throws Exception
	 */
	void output(String strSubPrintTag, OutputStream outputStream, Object[] keys, String strType, boolean bTestPriv) throws Throwable; 
	
	
	/**
	 * 重新加载代理
	 */
	void reload();
}
