package cn.ibizlab.central.plugin.groovy.dataentity.dataexport

import net.ibizsys.central.cloud.core.dataentity.dataexport.CsvDEDataExportRuntime
import net.ibizsys.central.cloud.core.util.annotation.DEDataExportRuntime

@DEDataExportRuntime("")
class SimpleDEDataExportRuntime extends CsvDEDataExportRuntime{
	@Override
	protected void onInit() throws Exception {
		
		System.out.println("SimpleDEDataExportRuntime init");
		
		super.onInit();
	}
}
