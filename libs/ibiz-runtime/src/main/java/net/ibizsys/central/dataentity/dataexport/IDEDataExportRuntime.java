package net.ibizsys.central.dataentity.dataexport;

import java.io.File;
import java.io.OutputStream;

import net.ibizsys.central.dataentity.IDataEntityRuntime;

/**
 * 实体数据导出运行时接口
 * @author lionlau
 *
 */
public interface IDEDataExportRuntime extends net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime{




	/**
	 * 导出传入数据源到文件（废弃）
	 * @param objData
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @param bTestPriv
	 * @param parentDataEntityRuntime
	 * @param strParentKey
	 * @return
	 */
	@Deprecated
	File exportFile(Object objData, String strMethodName, Object objBody, String strKey, Object objTag, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) ;
	
	
	
	/**
	 * 导出传入数据到输出流
	 * @param objData
	 * @param outputStream
	 */
	void exportStream(Object objData, OutputStream outputStream) throws Throwable;
}
