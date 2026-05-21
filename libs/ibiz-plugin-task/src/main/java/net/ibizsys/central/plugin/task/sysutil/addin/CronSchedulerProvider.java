package net.ibizsys.central.plugin.task.sysutil.addin;

import net.ibizsys.central.plugin.task.addin.IScheduler;

public class CronSchedulerProvider extends SchedulerProviderBase {

	@Override
	public IScheduler createScheduler(Object addin) {
		return this.getSystemRuntime().createObject(IScheduler.class, CronScheduler.class);
	}

}
