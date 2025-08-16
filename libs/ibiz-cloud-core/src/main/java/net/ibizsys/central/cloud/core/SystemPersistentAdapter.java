package net.ibizsys.central.cloud.core;


import net.ibizsys.central.ba.ISysBDPersistentAdapter;
import net.ibizsys.central.cloud.core.ba.SysBDPersistentAdapter;
import net.ibizsys.central.cloud.core.database.SysDBPersistentAdapter;
import net.ibizsys.central.database.ISysDBPersistentAdapter;

public class SystemPersistentAdapter extends net.ibizsys.central.SystemPersistentAdapter {

//    @Override
//    protected ISysDBPersistentAdapter createSysDBPersistentAdapter(ISysDBSchemeRuntime iSysDBSchemeRuntime) {
//        return new SysDBPersistentAdapter();
//    }
//    
//    
//    @Override
//    protected ISysBDPersistentAdapter createSysBDPersistentAdapter(ISysBDSchemeRuntime iSysBDSchemeRuntime) {
//    	return new SysBDPersistentAdapter();
//    }
//    
    
    @Override
    protected ISysBDPersistentAdapter createDefaultSysBDPersistentAdapter() {
    	return new SysBDPersistentAdapter();
    }
    
    @Override
    protected ISysDBPersistentAdapter createDefaultSysDBPersistentAdapter() {
    	return new SysDBPersistentAdapter();
    }

}
