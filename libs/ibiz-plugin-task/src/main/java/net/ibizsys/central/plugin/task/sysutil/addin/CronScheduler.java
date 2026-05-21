package net.ibizsys.central.plugin.task.sysutil.addin;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.LogFactory;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.plugin.task.util.TaskJob;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public class CronScheduler extends SchedulerBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CronScheduler.class);
	private Scheduler scheduler = null;
	
	protected Scheduler getScheduler() throws Exception{
		return this.getScheduler(false);
	}

	protected Scheduler getScheduler(boolean bTryMode) throws Exception{
		if (this.scheduler != null || bTryMode) {
			return this.scheduler;
		}
		throw new Exception("Quartz调度对象无效");
	}

	protected void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	protected void prepareScheduler() throws Exception {
		String strThreadCount = this.getContext().getSetting("quartz.threadpoolsize", "10");
		Properties properties = new Properties();
		properties.setProperty(StdSchedulerFactory.PROP_THREAD_POOL_PREFIX + ".threadCount", strThreadCount);
		SchedulerFactory schedulerFactory = new StdSchedulerFactory(properties);
		this.setScheduler(schedulerFactory.getScheduler());
		this.getScheduler().start();
	}
	
	@Override
	protected void onStart() throws Exception {
		prepareScheduler();
		super.onStart();
	}
	
	@Override
	protected void onStop() throws Exception {
		if(this.getScheduler(true)!=null) {
			this.getScheduler().clear();
			this.setScheduler(null);
		}
		super.onStop();
	}

	@Override
	protected void doStartSchedule(Map<String, Object> item) throws Throwable {
		String strJobId = DataTypeUtils.asString(item.get(SCHEDULEPARAM_ID));
		String strTimerPolicy = DataTypeUtils.asString(item.get(SCHEDULEPARAM_TIMER_POLICY));
		if(ObjectUtils.isEmpty(strTimerPolicy)) {
			throw new Exception("未传入时间策略");
		}
		
		JobDataMap jobDataMap = new JobDataMap();
		jobDataMap.put(TaskJob.CONTEXT_JOBINFO, item);
		jobDataMap.put(TaskJob.CONTEXT_RUNTIMECONTEXT, this.getContext());
		jobDataMap.put(TaskJob.CONTEXT_PARAM, new HashMap<>());
		
		JobDetail jobDetail = org.quartz.JobBuilder.newJob(TaskJob.class).withIdentity(strJobId)
				.usingJobData(jobDataMap)
				.build();


		String[] timers = strTimerPolicy.replace("\r\n", ";").replace("\r", ";").replace("\n", ";").split("[;]");
		for(String strPolicy : timers) {
			strPolicy = strPolicy.trim();
			if(!StringUtils.hasLength(strPolicy)) {
				continue;
			}

			try {
				Trigger trigger = org.quartz.TriggerBuilder.newTrigger()
						.withIdentity(KeyValueUtils.genUniqueId(strJobId, strPolicy))
						.startNow()
						.withSchedule(CronScheduleBuilder.cronSchedule(strPolicy))
						.build();
				this.getScheduler().scheduleJob(jobDetail, trigger);
			}
			catch (Throwable ex) {
				this.doStopSchedule(item);
				throw ex;
			}
		}
	}

	@Override
	protected void doStopSchedule(Map<String, Object> item) throws Throwable {
		String strJobId = DataTypeUtils.asString(item.get(SCHEDULEPARAM_ID));
		JobKey jobKey = JobKey.jobKey(strJobId);

		if(this.getScheduler().checkExists(jobKey)) {
			this.getScheduler().deleteJob(jobKey);
		}
	}
}
