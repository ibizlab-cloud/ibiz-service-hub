package net.ibizsys.runtime.dataentity.dataexport;

import java.io.File;
import java.io.OutputStream;

import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;

/**
 * 实体数据导出运行时接口
 * @author lionlau
 *
 */
public interface IDEDataExportRuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化实体打印运行时	
	 * @param iDataEntityRuntimeBase
	 * @param iPSDEDataExport
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDEDataExport iPSDEDataExport) throws Exception;
	
	
	
	/**
	 * 获取实体数据导出模型对象
	 * @return
	 */
	IPSDEDataExport getPSDEDataExport();
	
	


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
	
	
	
	
	
	
	/**
	 * 最大记录数
	 * @return
	 */
	int getMaxRowCount();
}
