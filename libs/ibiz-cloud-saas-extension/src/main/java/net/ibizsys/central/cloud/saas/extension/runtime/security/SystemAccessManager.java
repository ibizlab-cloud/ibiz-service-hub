package net.ibizsys.central.cloud.saas.extension.runtime.security;

import net.ibizsys.central.cloud.core.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.cloud.saas.extension.runtime.dataentity.security.DataEntityAccessManager;
import net.ibizsys.central.dataentity.IDataEntityRuntime;

/*
 * 系统默认访问管理对象
 */
public class SystemAccessManager extends net.ibizsys.central.cloud.core.security.SystemAccessManager{
    private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SystemAccessManager.class);

    
    @Override
    public IDataEntityAccessManager createDataEntityAccessManager(IDataEntityRuntime iDataEntityRuntime) {
    	return new DataEntityAccessManager();
    }

}