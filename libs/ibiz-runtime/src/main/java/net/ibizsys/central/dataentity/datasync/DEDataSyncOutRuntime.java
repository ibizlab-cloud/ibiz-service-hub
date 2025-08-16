package net.ibizsys.central.dataentity.datasync;

import net.ibizsys.central.dataentity.IDataEntityRuntime;

public class DEDataSyncOutRuntime extends net.ibizsys.runtime.dataentity.datasync.DEDataSyncOutRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataSyncOutRuntime.class);
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		
	}
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime) super.getDataEntityRuntime();
	}
	
}
