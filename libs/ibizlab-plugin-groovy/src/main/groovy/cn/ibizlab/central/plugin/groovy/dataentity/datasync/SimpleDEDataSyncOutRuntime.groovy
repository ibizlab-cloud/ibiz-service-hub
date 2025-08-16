package cn.ibizlab.central.plugin.groovy.dataentity.datasync

import groovy.transform.CompileStatic
import net.ibizsys.central.dataentity.datasync.DEDataSyncOutRuntime

@CompileStatic
class SimpleDEDataSyncOutRuntime extends DEDataSyncOutRuntime{
	
	@Override
	protected void onSend(int nEvent, Object objData, boolean bImmediately) throws Throwable {
		// TODO Auto-generated method stub
		super.onSend(nEvent, objData, bImmediately);
	}
}
