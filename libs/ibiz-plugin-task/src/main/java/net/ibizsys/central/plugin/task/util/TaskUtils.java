package net.ibizsys.central.plugin.task.util;

import java.util.Date;
import java.util.List;

import org.quartz.CronTrigger;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.springframework.util.ObjectUtils;

public class TaskUtils {

	public static java.util.Date calcNextFireTime(Scheduler scheduler, JobKey jobKey, java.util.Date fromTime) throws Exception {
		List<? extends Trigger> list = scheduler.getTriggersOfJob(jobKey);
		if(ObjectUtils.isEmpty(list)) {
			return null;
		}
		
		if(fromTime == null) {
			fromTime = new Date(System.currentTimeMillis());
		}
		java.util.Date nextTime = null;
		for(Trigger trigger : list) {
			 if (trigger instanceof CronTrigger) {
	                CronTrigger cronTrigger = (CronTrigger) trigger;
	                // 直接获取下次触发时间
	                java.util.Date time = cronTrigger.getNextFireTime();
	                if(nextTime == null || time.compareTo(nextTime)<0) {
	                	nextTime = time;
	                }
			 }
		}
		return nextTime;
	}
}
