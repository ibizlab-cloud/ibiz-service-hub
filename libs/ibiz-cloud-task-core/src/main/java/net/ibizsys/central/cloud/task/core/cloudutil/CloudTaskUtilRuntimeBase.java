package net.ibizsys.central.cloud.task.core.cloudutil;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.LogFactory;
import org.quartz.CronScheduleBuilder;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudTaskUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.JobsInfo;
import net.ibizsys.central.cloud.task.core.util.TaskJob;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;

public abstract class CloudTaskUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudTaskUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudTaskUtilRuntimeBase.class);
	private ISysUniStateUtilRuntime iSysUniStateUtilRuntime = null;
	private Scheduler scheduler = null;
	private String strCloudTaskUtilRuntimeUniqueTag = null;
	private ICloudTaskUtilRuntimeContext iCloudTaskUtilRuntimeContext = new ICloudTaskUtilRuntimeContext() {

		@Override
		public void executeTask(JobsInfo jobsInfo, Object objData) {
			getSelf().executeTimerTask(jobsInfo, objData);
		}
		
	};
	
	@Override
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return true;
	}
	
	@Override
	protected void onInstall() throws Exception {
	
		super.onInstall();
		
		this.strCloudTaskUtilRuntimeUniqueTag = KeyValueUtils.genUniqueId(ICloudTaskUtilRuntime.class.getCanonicalName(), ICloudUtilRuntime.CLOUDSERVICE_TASK);
		
		//获取系统的功能选举对象
		if(this.getSysUniStateUtilRuntime(true) == null) {
			this.prepareSysUniStateUtilRuntime();
			if(this.getSysUniStateUtilRuntime(true) == null) {
				this.getSystemRuntime().log(LogLevels.WARN, CloudTaskUtilRuntimeBase.class.getName(), String.format("系统未配置统一状态组件，多节点运行会出现重复调度问题"), null);
			}
		}
		
		if(this.getScheduler(true) == null) {
			this.prepareScheduler();
			if(this.getScheduler(true) == null) {
				throw new Exception(String.format("Quartz调度对象无效"));
			}
		}
	}
	
	private CloudTaskUtilRuntimeBase getSelf() {
		return this;
	}
	
	protected Scheduler getScheduler() {
		return this.getScheduler(false);
	}
	
	protected Scheduler getScheduler(boolean bTryMode) {
		if(this.scheduler != null || bTryMode) {
			return this.scheduler;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this, "Quartz调度对象无效");
	}
	
	protected void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}
	
	protected void prepareScheduler() throws Exception{
		String strThreadCount = this.getSystemRuntimeSetting().getParam(CLOUDTASKUTIL_CONFIGFOLDER + ".threadpoolsize", "10");
		Properties properties = new Properties();
		properties.setProperty(StdSchedulerFactory.PROP_THREAD_POOL_PREFIX+".threadCount",strThreadCount);
		SchedulerFactory schedulerFactory = new StdSchedulerFactory(properties);
		this.setScheduler(schedulerFactory.getScheduler());
		this.getScheduler().start();
	}
	
	protected ICloudTaskUtilRuntimeContext getCloudTaskUtilRuntimeContext() {
		return this.iCloudTaskUtilRuntimeContext;
	}
	
	
	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime() {
		return getSysUniStateUtilRuntime(false);
	}
	
	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime(boolean bTryMode) {
		if(this.iSysUniStateUtilRuntime != null || bTryMode) {
			return this.iSysUniStateUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定系统统一状态功能组件");
	}
	
	protected void setSysUniStateUtilRuntime(ISysUniStateUtilRuntime iSysUniStateUtilRuntime) {
		this.iSysUniStateUtilRuntime = iSysUniStateUtilRuntime;
	}
	
	protected void prepareSysUniStateUtilRuntime() {
		this.setSysUniStateUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, true));
	}
	
	protected boolean hasDCTaskLeadership(String strDCId, String strJobId) {
		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.getSysUniStateUtilRuntime(true);
		if(iSysUniStateUtilRuntime != null) {
			if(!iSysUniStateUtilRuntime.hasLeadership(KeyValueUtils.genUniqueId(getCloudTaskUtilRuntimeUniqueTag(), strDCId))) {
				return false;
			}
		}
		return true;
	}
	
	protected void executeTimerTask(JobsInfo jobsInfo, Object objData) {
		
		String strDCId = (String)jobsInfo.get("srfdcid");
		if(!hasDCTaskLeadership(strDCId, jobsInfo.getId())) {
			log.debug(String.format("未获取定时调度作业执行权[%1$s][%2$s]，忽略本次执行", jobsInfo.getId(), strDCId));
			return;
		}
		
		/**
		 * 调整为工作线程执行
		 */
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				try {
					executeAction("执行定时作业", new IAction() {
						@Override
						public Object execute(Object[] args) throws Throwable {
							return onExecuteTask(jobsInfo, objData);
						}
					} , null);
				}
				catch (Throwable ex) {
					log.error(ex);
				}
			}
		});
		
	}
	
	protected Object onExecuteTask(JobsInfo jobsInfo, Object objData) throws Throwable {
		return this.executeTaskCallback(jobsInfo, objData, String.class).getBody();
	}
	
	
	@Override
	public Object executeTask(String strId, Map params) {
		return this.executeAction("执行作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteTask(strId, params);
			}
		}, null);
	}
	
	protected Object onExecuteTask(String strId, Map params) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public void startTask(String strId) {
		this.executeAction("开启定时作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onStartTask(strId);
				return null;
			}
		}, null);
	}
	
	protected void onStartTask(String strId) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public void stopTask(String strId) {
		this.executeAction("停止定时作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onStopTask(strId);
				return null;
			}
		}, null);
	}
	
	
	protected void onStopTask(String strId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	protected void startJob(JobsInfo jobsInfo) throws Throwable{
		
		String strDCId = (String)jobsInfo.get("srfdcid");
		String strJobId = jobsInfo.getId();
		
		JobDataMap jobDataMap = new JobDataMap();
		jobDataMap.put(TaskJob.CONTEXT_JOBINFO, jobsInfo);
		jobDataMap.put(TaskJob.CONTEXT_RUNTIMECONTEXT, this.getCloudTaskUtilRuntimeContext());
		jobDataMap.put(TaskJob.CONTEXT_PARAM, new HashMap<>());
//		
		
		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.getSysUniStateUtilRuntime(true);
		if(iSysUniStateUtilRuntime != null) {
			iSysUniStateUtilRuntime.addLeaderLatchIf(KeyValueUtils.genUniqueId(getCloudTaskUtilRuntimeUniqueTag(), strDCId));
		}
		
//		if(iSysUniStateUtilRuntime != null) {
//			jobDataMap.put(TaskJob.CONTEXT_LEADERSELECTOR, iSysUniStateUtilRuntime);
//			//iSysUniStateUtilRuntime.addLeaderLatch(iSysBackendTaskRuntime.getId());
//		}
		
		JobDetail jobDetail = org.quartz.JobBuilder.newJob(getJobClass(jobsInfo)).withIdentity(strJobId, strDCId)
				.usingJobData(jobDataMap)
				.build();
		 
		String[] timers = jobsInfo.getCron().replace("\r\n", ";").replace("\r", ";").replace("\n", ";").split("[;]");
		for(String strPolicy : timers) {
			strPolicy = strPolicy.trim();
			if(!StringUtils.hasLength(strPolicy)) {
				continue;
			}
			
			Trigger trigger = org.quartz.TriggerBuilder.newTrigger()
				      .withIdentity(KeyValueUtils.genUniqueId(strJobId, strPolicy), strDCId)
				      .startNow()
				      .withSchedule(CronScheduleBuilder.cronSchedule(strPolicy))          
				      .build();
			
			this.getScheduler().scheduleJob(jobDetail, trigger);
		}
		
	}
	
	protected void stopJob(JobsInfo jobsInfo) throws Throwable{
		String strDCId = (String)jobsInfo.get("srfdcid");
		String strJobId = jobsInfo.getId();
		
		JobKey jobKey = JobKey.jobKey(strJobId, strDCId);
		if(this.getScheduler().checkExists(jobKey)) {
			this.getScheduler().deleteJob(jobKey);
		}
	}
	
	
	
	

	protected Class<? extends Job> getJobClass(JobsInfo jobsInfo) throws Exception{
		return TaskJob.class;
	}
	
	
	protected DCSystem getDCSystem(String strDCSystemId) {
		return this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);
	}
	
	protected <T> IWebClientRep<T> executeTaskCallback(JobsInfo jobsInfo, Object objData, Class<T> cls) throws Throwable{
		
		DCSystem dcSystem = this.getDCSystem(jobsInfo.getApp());
		String strSystemId =dcSystem.getSystemId();
		Employee employee = new Employee();
		employee.setSrfdcid(dcSystem.getSrfdcid());
		employee.setUserId("SYSTEM");
		employee.setUserName("后台作业");
		employee.setPersonName("后台作业");
		employee.setDCSystemId(jobsInfo.getApp());
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		if(lastEmployeeContext != null) {
			employee.setSrfdcid(lastEmployeeContext.getTenant());
			employee.setUserId(lastEmployeeContext.getUserid());
			employee.setUserName(lastEmployeeContext.getUaausername());
			employee.setPersonName(lastEmployeeContext.getUsername());
		}
		
		IEmployeeContext iEmployeeContext = new EmployeeContext(employee, null, strSystemId);
		EmployeeContext.setCurrent(iEmployeeContext);
		try {
			IWebClientRep<T> rep = this.onExecuteTaskCallback(jobsInfo, objData, cls);
			return rep;
		}
		catch(Throwable ex) {	
			throw ex;
		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	protected <T> IWebClientRep<T> onExecuteTaskCallback(JobsInfo jobsInfo, Object objData, Class<T> cls) throws Throwable{
		String strTaskCallbackUrl = this.getTaskCallbackUrl(jobsInfo);
		IWebClient iWebClient = this.getSysCloudClientUtilRuntime().getServiceClient(strTaskCallbackUrl);
		return iWebClient.post(strTaskCallbackUrl, null, null, null, objData, null, cls, null);
	}
	
	protected String getTaskCallbackUrl(JobsInfo jobsInfo) throws Throwable{
		
		String strServiceId = this.getCloudSaaSUtilRuntime().getServiceId(jobsInfo.getApp());
		
		String strHandler = jobsInfo.getHandler();
		if(StringUtils.hasLength(strHandler)) {
			strHandler = strHandler.replace("JobHandler", "");
		}
		return String.format("lb://servicehub-%1$s/taskcallback/%2$s/%3$s/%4$s", strServiceId, strServiceId, jobsInfo.getTaskType(), strHandler);
	}
	
	protected String getCloudTaskUtilRuntimeUniqueTag() {
		return this.strCloudTaskUtilRuntimeUniqueTag;
	}
	
}
