package net.ibizsys.central.plugin.task.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import net.ibizsys.central.plugin.task.addin.IScheduler;
import net.ibizsys.central.plugin.task.sysutil.ISysTaskUtilRuntimeContext;

public class TaskJob implements org.quartz.Job {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(TaskJob.class);
	
	public final static String CONTEXT_DYNAINSTID = "SRFDYNAINSTID";
	public final static String CONTEXT_PARAM = "SRFPARAM";
	public final static String CONTEXT_JOBINFO = "SRFJOBINFO";
	public final static String CONTEXT_RUNTIMECONTEXT = "SRFRUNTIMECONTEXT";
	public final static String CONTEXT_LEADERSELECTOR = "SRFLEADERSELECTOR";
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		Map map = (Map)context.getJobDetail().getJobDataMap().get(CONTEXT_JOBINFO);
		Map jobsInfo = new LinkedHashMap(map);
		jobsInfo.put(IScheduler.SCHEDULEPARAM_FIRE_TIME, new java.sql.Timestamp(context.getFireTime().getTime()));
		try {
			java.util.Date nextTime = TaskUtils.calcNextFireTime(context.getScheduler(), context.getJobDetail().getKey(), context.getFireTime());
			if(nextTime != null) {
				jobsInfo.put(IScheduler.SCHEDULEPARAM_NEXT_TRIGGER_TIME, new java.sql.Timestamp(nextTime.getTime()));
			}
			
		} catch (Exception ex) {
			log.error(ex);
		}
		
		Object objParam = context.getJobDetail().getJobDataMap().get(CONTEXT_PARAM);
		ISysTaskUtilRuntimeContext iSysTaskUtilRuntimeContext = (ISysTaskUtilRuntimeContext) context.getJobDetail().getJobDataMap().get(CONTEXT_RUNTIMECONTEXT);
		if(iSysTaskUtilRuntimeContext != null) {
			iSysTaskUtilRuntimeContext.executeSchedule(jobsInfo, objParam);
		}
	}

}
