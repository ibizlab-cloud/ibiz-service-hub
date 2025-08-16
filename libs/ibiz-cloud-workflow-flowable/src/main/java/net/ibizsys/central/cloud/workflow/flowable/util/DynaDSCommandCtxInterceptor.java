package net.ibizsys.central.cloud.workflow.flowable.util;

import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.database.SysDBSchemeRuntime;
import org.flowable.common.engine.impl.interceptor.AbstractCommandInterceptor;
import org.flowable.common.engine.impl.interceptor.Command;
import org.flowable.common.engine.impl.interceptor.CommandConfig;

public class DynaDSCommandCtxInterceptor extends AbstractCommandInterceptor {

    private String dsTag;

    private ISysDBSchemeRuntime wfSysDBSchemeRuntime;

    public DynaDSCommandCtxInterceptor(String strDsTag , ISysDBSchemeRuntime sysDBSchemeRuntime) {
        if (sysDBSchemeRuntime == null) {
            sysDBSchemeRuntime = new SysDBSchemeRuntime();
        }
        sysDBSchemeRuntime.setDataSourceTag(strDsTag);
        this.dsTag = strDsTag;
        this.wfSysDBSchemeRuntime = sysDBSchemeRuntime;
    }
    @Override
    public <T> T execute(CommandConfig config, Command<T> command) {
//        DynamicDataSourceContextHolder.push(dsTag);
        DynamicDataSourcePush();
        try {
            return this.getNext().execute(config,command);
        }finally {
//            DynamicDataSourceContextHolder.poll();
            DynamicDataSourcePull();
        }
    }

    protected void DynamicDataSourcePush(){
        wfSysDBSchemeRuntime.push();
    }

    protected void DynamicDataSourcePull(){
        wfSysDBSchemeRuntime.poll();
    }
}