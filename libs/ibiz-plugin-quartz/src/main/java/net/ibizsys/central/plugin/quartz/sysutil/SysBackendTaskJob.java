package net.ibizsys.central.plugin.quartz.sysutil;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.backend.ISysBackendTaskRuntimeBase;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.runtime.util.LogLevels;

public class SysBackendTaskJob implements org.quartz.Job {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysBackendTaskJob.class);
	
	public final static String CONTEXT_DYNAINSTID = "SRFDYNAINSTID";
	public final static String CONTEXT_PARAM = "SRFPARAM";
	public final static String CONTEXT_BACKENDTASK = "SRFBACKENDTASK";
	public final static String CONTEXT_LEADERSELECTOR = "SRFLEADERSELECTOR";
	public final static String CONTEXT_LEADERSHIPTAG = "SRFLEADERSHIPTAG";
	public final static String CONTEXT_SYSTEM = "SRFSYSTEM";
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ISysBackendTaskRuntimeBase iSysBackendTaskRuntime = (ISysBackendTaskRuntimeBase)context.getJobDetail().getJobDataMap().get(CONTEXT_BACKENDTASK);
		String strDynaInstId = (String) context.getJobDetail().getJobDataMap().get(CONTEXT_DYNAINSTID);
		String strParam = (String) context.getJobDetail().getJobDataMap().get(CONTEXT_PARAM);
		ISystemRuntime iSystemRuntime = (ISystemRuntime) context.getJobDetail().getJobDataMap().get(CONTEXT_SYSTEM);
		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = (ISysUniStateUtilRuntime) context.getJobDetail().getJobDataMap().get(CONTEXT_LEADERSELECTOR);
		if(iSysUniStateUtilRuntime != null) {
			String strLeadershipTag = (String) context.getJobDetail().getJobDataMap().get(CONTEXT_LEADERSHIPTAG);
			if(!iSysUniStateUtilRuntime.hasLeadership(strLeadershipTag)) {
				iSystemRuntime.log(LogLevels.DEBUG, SysBackendTaskJob.class.getName(), String.format("未获取业务执行控制权，忽略执行后台任务[%1$s]", iSysBackendTaskRuntime.getName()), null);
				return;
			}
		}
		
		iSystemRuntime.log(LogLevels.DEBUG, SysBackendTaskJob.class.getName(), String.format("执行后台任务[%1$s]", iSysBackendTaskRuntime.getName()), null);
		
		try {
			iSysBackendTaskRuntime.execute(strDynaInstId, strParam);
		} catch (Throwable ex) {
			log.error(String.format("执行后台任务[%1$s]发生异常，%2$s", iSysBackendTaskRuntime.getName(), ex.getMessage()), ex);
			iSystemRuntime.log(LogLevels.ERROR, SysBackendTaskJob.class.getName(), String.format("执行后台任务[%1$s]发生异常，%2$s", iSysBackendTaskRuntime.getName(), ex.getMessage()), null);
		}
	}

}
