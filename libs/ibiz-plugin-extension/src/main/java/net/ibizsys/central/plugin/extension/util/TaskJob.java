package net.ibizsys.central.plugin.extension.util;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.plugin.extension.sysutil.ISysExtensionUtilRuntimeContext;

public class TaskJob implements org.quartz.Job {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(TaskJob.class);
	
	public final static String CONTEXT_DYNAINSTID = "SRFDYNAINSTID";
	public final static String CONTEXT_PARAM = "SRFPARAM";
	public final static String CONTEXT_JOBINFO = "SRFJOBINFO";
	public final static String CONTEXT_RUNTIMECONTEXT = "SRFRUNTIMECONTEXT";
	public final static String CONTEXT_LEADERSELECTOR = "SRFLEADERSELECTOR";
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		V2SystemExtensionLogic jobsInfo = (V2SystemExtensionLogic)context.getJobDetail().getJobDataMap().get(CONTEXT_JOBINFO);
//		String strDynaInstId = (String) context.getJobDetail().getJobDataMap().get(CONTEXT_DYNAINSTID);
		Object objParam = context.getJobDetail().getJobDataMap().get(CONTEXT_PARAM);
		ISysExtensionUtilRuntimeContext iSysExtensionUtilRuntimeContext = (ISysExtensionUtilRuntimeContext) context.getJobDetail().getJobDataMap().get(CONTEXT_RUNTIMECONTEXT);
		if(iSysExtensionUtilRuntimeContext != null) {
			iSysExtensionUtilRuntimeContext.executeExtensionLogic(jobsInfo, objParam);
		}
	}

}
