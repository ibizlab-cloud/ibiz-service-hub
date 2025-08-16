package net.ibizsys.central.plugin.quartz.sysutil;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import org.quartz.CronScheduleBuilder;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.backend.ISysBackendTaskRuntime;
import net.ibizsys.central.backend.ISysBackendTaskRuntimeBase;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.SysUtilRuntimeBase;
import net.ibizsys.model.backservice.IPSSysBackService;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;

/**
 * Quartz 系统功能组件基类，用于完成后台任务的定时调度功能
 * @author lionlau
 *
 */
public abstract class SysQuartzUtilRuntimeBase extends SysUtilRuntimeBase implements ISysQuartzUtilRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysQuartzUtilRuntimeBase.class);
	
	private Scheduler scheduler = null;
	public final static String SYSBACKSERVICE_TIMERTASK = "SYSBACKSERVICE_TIMERTASK";
	
	private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();
	
	private Map<String, ISysBackendTaskRuntimeBase> sysBackendTaskRuntimeBaseMap = new ConcurrentHashMap<String, ISysBackendTaskRuntimeBase>();
	
	@Override
	protected void onInit() throws Exception {
		this.deMethodPluginRuntimeRepo.init(this.getSystemRuntime(), true);
		super.onInit();
	}

	protected DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
		return this.deMethodPluginRuntimeRepo;
	}
	
	@Override
	public Scheduler getScheduler() {
		return this.getScheduler(false);
	}
	
	@Override
	public Scheduler getScheduler(boolean bTryMode) {
		if(this.scheduler != null || bTryMode) {
			return this.scheduler;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this, "Quartz调度对象无效");
	}
	
	protected void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}
	
	protected void prepareScheduler() throws Exception{
		String strThreadCount = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".quartz.threadpoolsize", "10");
		Properties properties = new Properties();
		properties.setProperty(StdSchedulerFactory.PROP_THREAD_POOL_PREFIX + ".threadCount", strThreadCount);
		SchedulerFactory schedulerFactory = new StdSchedulerFactory(properties);
		this.setScheduler(schedulerFactory.getScheduler());
		this.getScheduler().start();
	}
	
	/**
	 * 是否仅启用本地模式
	 * @return
	 */
	protected boolean isStartLocalModeOnly() {
		return true;
	}
	
	protected void startAllSysBackendTasks() throws Exception{
		
		//获取系统的功能选举对象
		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = (ISysUniStateUtilRuntime)this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, true);
		if(iSysUniStateUtilRuntime == null) {
			this.getSystemRuntime().log(LogLevels.WARN, SysQuartzUtilRuntime.class.getName(), String.format("系统未配置统一状态组件，多节点运行会出现重复调度问题"), null);
		}
		
		java.util.List<IPSSysBackService> psSysBackServices = this.getSystemRuntime().getPSSystem().getAllPSSysBackServices();
		if(psSysBackServices != null) {
			for(IPSSysBackService iPSSysBackService : psSysBackServices ) {
				ISysBackendTaskRuntime iSysBackendTaskRuntime = this.getSystemRuntime().getSysBackendTaskRuntime(iPSSysBackService);
				if(!iSysBackendTaskRuntime.isTimerMode()) {
					continue;
				}
				
				if(isStartLocalModeOnly()) {
					if(!iSysBackendTaskRuntime.isLocalMode()) {
						continue;
					}
				}
				
				this.startSysBackendTask(iSysBackendTaskRuntime);
			}
		}
	}
	
	
	protected void stopAllSysBackendTasks() throws Exception{
		
		Collection<ISysBackendTaskRuntimeBase> sysBackendTaskRuntimeBases = this.sysBackendTaskRuntimeBaseMap.values();
		if(ObjectUtils.isEmpty(sysBackendTaskRuntimeBases)) {
			return;
		}
		
		for(ISysBackendTaskRuntimeBase iSysBackendTaskRuntimeBase : sysBackendTaskRuntimeBases) {
			try {
				this.stopSysBackendTask(iSysBackendTaskRuntimeBase);
			}
			catch (Throwable ex) {
				log.error(String.format("停止后台任务[%1$s]发生异常，%2$s", iSysBackendTaskRuntimeBase.getName(), ex.getMessage()), ex);
			}
		}
		
	}


	protected Class<? extends Job> getJobClass(ISysBackendTaskRuntimeBase iSysBackendTaskRuntime) throws Exception{
		return SysBackendTaskJob.class;
	}
	
	
	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
		
		this.onRegisterDEMethodPluginRuntimes();
		
		if(this.getScheduler(true) == null) {
			this.prepareScheduler();
			if(this.getScheduler(true) == null) {
				throw new Exception(String.format("Quartz调度对象无效"));
			}
		}
		
		this.startAllSysBackendTasks();
	}
	
	protected void onRegisterDEMethodPluginRuntimes() throws Exception {
		
	}
	
	@Override
	public synchronized void startSysBackendTask(ISysBackendTaskRuntimeBase iSysBackendTaskRuntimeBase) {
		Assert.notNull(iSysBackendTaskRuntimeBase, "未传入后台作业运行时对象");
		
		this.executeAction("启动后台作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onStartSysBackendTask(iSysBackendTaskRuntimeBase);
				return null;
			}
		});
	}
	
	protected void onStartSysBackendTask(ISysBackendTaskRuntimeBase iSysBackendTaskRuntime) throws Throwable {
		
		if(this.sysBackendTaskRuntimeBaseMap.containsKey(iSysBackendTaskRuntime.getId())) {
			throw new Exception(String.format("作业标识[%1$s]已存在", iSysBackendTaskRuntime.getId()));
		}
		
		
		if(!iSysBackendTaskRuntime.isTimerMode()) {
			throw new Exception(String.format("后台任务[%1$s]非定时模式", iSysBackendTaskRuntime.getName()));
		}
		
		String strTimerPolicy = iSysBackendTaskRuntime.getTimerPolicy();
		if(!StringUtils.hasLength(strTimerPolicy)) {
			throw new Exception(String.format("后台任务[%1$s]未定义定时策略", iSysBackendTaskRuntime.getName()));
		}
		
		
		String strContainer = iSysBackendTaskRuntime.getServiceContainer();
		if(!StringUtils.hasLength(strContainer)) {
			strContainer = "SC01";
		}
		
		JobDataMap jobDataMap = new JobDataMap();
		jobDataMap.put(SysBackendTaskJob.CONTEXT_BACKENDTASK, iSysBackendTaskRuntime);
		jobDataMap.put(SysBackendTaskJob.CONTEXT_SYSTEM, this.getSystemRuntime());
		
		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = iSysBackendTaskRuntime.isStandalone()?null:(ISysUniStateUtilRuntime)this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, true);
		if(iSysUniStateUtilRuntime != null) {
			jobDataMap.put(SysBackendTaskJob.CONTEXT_LEADERSELECTOR, iSysUniStateUtilRuntime);
			String strLeadershipTag = KeyValueUtils.genUniqueId(this.getSystemRuntime().getDeploySystemId(), SYSBACKSERVICE_TIMERTASK, iSysBackendTaskRuntime.getId());
			jobDataMap.put(SysBackendTaskJob.CONTEXT_LEADERSHIPTAG, strLeadershipTag);
			iSysUniStateUtilRuntime.addLeaderLatchIf(strLeadershipTag);
		}
		
		strContainer = String.format("%1$s__%2$s", SYSBACKSERVICE_TIMERTASK, strContainer);
		
		JobDetail jobDetail = org.quartz.JobBuilder.newJob(getJobClass(iSysBackendTaskRuntime)).withIdentity(iSysBackendTaskRuntime.getId(), strContainer)
				.usingJobData(jobDataMap)
				.build();
		 
		String[] timers = strTimerPolicy.replace("\r\n", ";").replace("\r", ";").replace("\n", ";").split("[;]");
		for(String strPolicy : timers) {
			strPolicy = strPolicy.trim();
			if(!StringUtils.hasLength(strPolicy)) {
				continue;
			}
			
			Trigger trigger = org.quartz.TriggerBuilder.newTrigger()
				      .withIdentity(KeyValueUtils.genUniqueId(iSysBackendTaskRuntime.getId(), strPolicy), strContainer)
				      .startNow()
				      .withSchedule(CronScheduleBuilder.cronSchedule(strPolicy))          
				      .build();
			
			this.getScheduler().scheduleJob(jobDetail, trigger);
		}
		
		this.sysBackendTaskRuntimeBaseMap.put(iSysBackendTaskRuntime.getId(), iSysBackendTaskRuntime);
	}

	@Override
	public synchronized void stopSysBackendTask(ISysBackendTaskRuntimeBase iSysBackendTaskRuntimeBase) {
		Assert.notNull(iSysBackendTaskRuntimeBase, "未传入后台作业运行时对象");
		this.executeAction("停止后台作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onStopSysBackendTask(iSysBackendTaskRuntimeBase);
				return null;
			}
		});
	}
	
	protected void onStopSysBackendTask(ISysBackendTaskRuntimeBase iSysBackendTaskRuntimeBase2) throws Throwable {
		ISysBackendTaskRuntimeBase iSysBackendTaskRuntime = this.sysBackendTaskRuntimeBaseMap.get(iSysBackendTaskRuntimeBase2.getId());
		if(iSysBackendTaskRuntime != iSysBackendTaskRuntimeBase2) {
			throw new Exception(String.format("作业标识[%1$s]不存在", iSysBackendTaskRuntimeBase2.getId()));
		}
		
		String strContainer = iSysBackendTaskRuntime.getServiceContainer();
		if(!StringUtils.hasLength(strContainer)) {
			strContainer = "SC01";
		}
		
		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = iSysBackendTaskRuntime.isStandalone()?null:(ISysUniStateUtilRuntime)this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, true);
		if(iSysUniStateUtilRuntime != null) {
			String strLeadershipId = KeyValueUtils.genUniqueId(this.getSystemRuntime().getDeploySystemId(), SYSBACKSERVICE_TIMERTASK, iSysBackendTaskRuntime.getId());
			iSysUniStateUtilRuntime.removeLeaderLatch(strLeadershipId);
		}
		
		strContainer = String.format("%1$s__%2$s", SYSBACKSERVICE_TIMERTASK, strContainer);
		
		try {
			this.getScheduler().deleteJob(new JobKey(iSysBackendTaskRuntime.getId(), strContainer));
		}
		catch (Throwable ex) {
			log.error(String.format("移除定时器作业发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	

	@Override
	protected void onUninstall() throws Throwable {
		
		this.stopAllSysBackendTasks();
		
		if (this.getScheduler(true) != null) {
			this.getScheduler().clear();
			this.setScheduler(null);
		}
		
		this.getDEMethodPluginRuntimeRepo().shutdown();
		
		super.onUninstall();
	}
}
