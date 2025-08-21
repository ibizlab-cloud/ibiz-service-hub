package net.ibizsys.central.cloud.core.dataentity.dataexport;

import java.io.OutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.dataentity.dataexport.DEDataExportRuntime;
import net.ibizsys.central.util.domain.ExportDataResult;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

public abstract class DEDataExportRuntimeBase extends DEDataExportRuntime implements IDEDataExportRuntime{

	private static final Log log = LogFactory.getLog(DEDataExportRuntimeBase.class);
	
	@Override
	public ExportDataResult exportStream2(Object objData, OutputStream outputStream) throws Throwable {
		try {
			return onExportStream2(objData, outputStream);
		}
		catch(Throwable ex) {
			log.error(String.format("实体数据导出[%1$s]导出数据发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导出数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected ExportDataResult onExportStream2(Object objData, OutputStream outputStram) throws Throwable{
		ExportDataResult exportDataResult = new ExportDataResult();
		this.onExportStream(objData, outputStram);		
		return exportDataResult;
	}
	
	
}
