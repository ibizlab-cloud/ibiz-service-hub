package net.ibizsys.central.cloud.task.core.util;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import net.ibizsys.central.cloud.core.util.domain.JobsInfo;
import net.ibizsys.central.cloud.task.core.cloudutil.ICloudTaskUtilRuntimeContext;

public class TaskJob implements org.quartz.Job {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(TaskJob.class);
	
	public final static String CONTEXT_DYNAINSTID = "SRFDYNAINSTID";
	public final static String CONTEXT_PARAM = "SRFPARAM";
	public final static String CONTEXT_JOBINFO = "SRFJOBINFO";
	public final static String CONTEXT_RUNTIMECONTEXT = "SRFRUNTIMECONTEXT";
	
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobsInfo jobsInfo = (JobsInfo)context.getJobDetail().getJobDataMap().get(CONTEXT_JOBINFO);
//		String strDynaInstId = (String) context.getJobDetail().getJobDataMap().get(CONTEXT_DYNAINSTID);
		Object objParam = context.getJobDetail().getJobDataMap().get(CONTEXT_PARAM);
		ICloudTaskUtilRuntimeContext iCloudTaskUtilRuntimeContext = (ICloudTaskUtilRuntimeContext) context.getJobDetail().getJobDataMap().get(CONTEXT_RUNTIMECONTEXT);
		if(iCloudTaskUtilRuntimeContext != null) {
			iCloudTaskUtilRuntimeContext.executeTask(jobsInfo, objParam);
		}
	}

}
