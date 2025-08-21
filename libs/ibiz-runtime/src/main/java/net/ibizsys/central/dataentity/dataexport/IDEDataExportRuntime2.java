package net.ibizsys.central.dataentity.dataexport;

import java.io.OutputStream;

import net.ibizsys.central.util.domain.ExportDataResult;

public interface IDEDataExportRuntime2 extends IDEDataExportRuntime {

	/**
	 * 导出传入数据到输出流
	 * @param objData
	 * @param outputStream
	 */
	ExportDataResult exportStream2(Object objData, OutputStream outputStream) throws Throwable;
}
