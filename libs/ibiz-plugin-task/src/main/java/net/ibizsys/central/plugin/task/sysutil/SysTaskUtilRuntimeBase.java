package net.ibizsys.central.plugin.task.sysutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.plugin.task.addin.IExecutor;
import net.ibizsys.central.plugin.task.addin.IExecutorProvider;
import net.ibizsys.central.plugin.task.addin.IScheduler;
import net.ibizsys.central.plugin.task.addin.ISchedulerProvider;
import net.ibizsys.central.plugin.task.sysutil.addin.CronSchedulerProvider;
import net.ibizsys.central.plugin.task.sysutil.addin.DefaultExecutorProvider;
import net.ibizsys.central.plugin.task.sysutil.addin.ISysTaskUtilRTAddin;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.runtime.ISystemEventListener;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;


/**
 * 系统任务功能组件运行时基类
 * @author lionlau
 *
 */
public abstract class SysTaskUtilRuntimeBase extends SysUtilRuntimeBase implements ISysTaskUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysTaskUtilRuntimeBase.class);
	//private static final Logger logger = LoggerFactory.getLogger(SysTaskUtilRuntimeBase.class);
	public final static String TASKUTIL_TIMERTASK = "TASKUTIL_TIMERTASK";

	
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysTaskUtilRTAddin.class, "*:" + ADDIN_SCHEDULER_PREFIX + "CRON", CronSchedulerProvider.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysTaskUtilRTAddin.class, "*:" + ADDIN_EXECUTOR_PREFIX + "DEFAULT", DefaultExecutorProvider.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysTaskUtilRTAddin.class, "*:" + ADDIN_EXECUTOR_PREFIX + "INTERNAL", DefaultExecutorProvider.class);
	}
	
	
	@Override
	protected ISysTaskUtilRuntimeContext createModelRuntimeContext() {
		return new SysTaskUtilRuntimeContextBase<ISysTaskUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {

			@Override
			public void executeSchedule(Map<String, Object> schedule, Object objData) {
				SysTaskUtilRuntimeBase.this.executeSchedule(schedule, objData);
			}
		};
	}
	
	
	private Map<String, ISchedulerProvider> schedulerProviderMap = null;
	
	private Map<String, List<ISchedulerProvider>> schedulerProviderMap2 = new HashMap<String, List<ISchedulerProvider>>();
	
	private Map<String, IScheduler> schedulerMap = new ConcurrentHashMap<String, IScheduler>();
	
	
	private Map<String, IExecutorProvider> executorProviderMap = null;
	
	private Map<String, List<IExecutorProvider>> executorProviderMap2 = new HashMap<String, List<IExecutorProvider>>();
	
	private Map<String, IExecutor> executorMap = new ConcurrentHashMap<String, IExecutor>();
	
	private Map<String, Map<String, Object>> taskTypeMap = new ConcurrentHashMap<String, Map<String, Object>>();
	
	private Map<String, Map<String, Object>> scheduleMap = new ConcurrentHashMap<String, Map<String, Object>>();
	
	
	private ISysUniStateUtilRuntime iSysUniStateUtilRuntime = null;
	
	@Override
	protected void onPrepareDefaultSetting() throws Exception {
	
		
		super.onPrepareDefaultSetting();
	}
	
	
	@Override
	protected void onInit() throws Exception {

		this.prepareSysUniStateUtilRuntime();
		super.onInit();
	}
	
	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime() throws Exception {
		return getSysUniStateUtilRuntime(false);
	}
	
	protected ISysUniStateUtilRuntime tryGetSysUniStateUtilRuntime() {
		try {
			return getSysUniStateUtilRuntime(true);
		} catch (Exception ex) {
			return null;
		}
	}

	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime(boolean bTryMode) throws Exception {
		if (this.iSysUniStateUtilRuntime != null || bTryMode) {
			return this.iSysUniStateUtilRuntime;
		}
		throw new Exception("未指定系统统一状态功能组件");
	}

	protected void setSysUniStateUtilRuntime(ISysUniStateUtilRuntime iSysUniStateUtilRuntime) {
		this.iSysUniStateUtilRuntime = iSysUniStateUtilRuntime;
	}

	protected void prepareSysUniStateUtilRuntime() {
		this.setSysUniStateUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, true));
	}
	
	
	@Override
	protected void onInstall() throws Exception {
		
		super.onInstall();
	
		this.schedulerProviderMap = this.getDefaultSchedulerProviders();
		this.executorProviderMap = this.getDefaultExecutorProviders();
		
		this.listenReloadSignal();
		
		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.getSysUniStateUtilRuntime(true);
		if(iSysUniStateUtilRuntime != null) {
			iSysUniStateUtilRuntime.addLeaderLatchIf(KeyValueUtils.genUniqueId(this.getSystemRuntime().getDeploySystemId(), TASKUTIL_TIMERTASK, this.getFullUniqueTag()));
		}
		
		this.getSystemRuntime().registerSystemLoadEventListener(new ISystemEventListener() {
			@Override
			public void receiveEvent(String event, Object[] params) {
				try {
					refreshSchedules();
				}
				catch (Throwable ex) {
					log.error(String.format("刷新计划任务发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		});
	}
	
	protected Map<String, IExecutorProvider> getDefaultExecutorProviders() {
		return this.getAddins(IExecutorProvider.class, ADDIN_EXECUTOR_PREFIX);
	}
	
	protected Map<String, ISchedulerProvider> getDefaultSchedulerProviders() {
		return this.getAddins(ISchedulerProvider.class, ADDIN_SCHEDULER_PREFIX);
	}
	
	protected void listenReloadSignal() throws Exception {
		if (!(this.getSystemRuntime() instanceof IServiceSystemRuntime)) {
			return;
		}

		
	}
	
	@Override
	public void reload() {
		try {
			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onReload() throws Throwable {
		
	}
	
	
	@Override
	protected void onUninstall() throws Throwable {
		
		if(!ObjectUtils.isEmpty(this.schedulerProviderMap)) {
			this.schedulerProviderMap.clear();
		}
		
		if(!ObjectUtils.isEmpty(this.schedulerProviderMap2)) {
			this.schedulerProviderMap2.clear();
		}
		
		
		if(!ObjectUtils.isEmpty(this.executorProviderMap)) {
			this.executorProviderMap.clear();
		}
		
		if(!ObjectUtils.isEmpty(this.executorProviderMap2)) {
			this.executorProviderMap2.clear();
		}
		
		this.resetSchedulers();
		
		if(!ObjectUtils.isEmpty(this.executorMap)) {
			this.executorMap.clear();
		}
		
		if(!ObjectUtils.isEmpty(this.taskTypeMap)) {
			this.taskTypeMap.clear();
		}
		
		if(!ObjectUtils.isEmpty(this.scheduleMap)) {
			this.scheduleMap.clear();
		}
		
		super.onUninstall();
	}

	
	private SysTaskUtilRuntimeBase getSelf() {
		return this;
	}
	
	@Override
	protected ISysTaskUtilRuntimeContext getModelRuntimeContext() {
		return (ISysTaskUtilRuntimeContext)super.getModelRuntimeContext();
	}
	

	@Override
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(getModelRuntimeContext(), ISysTaskUtilRTAddin.class, String.format("%1$s:",this.getFullUniqueTag()));
	}
	
	
	public IScheduler getScheduler(String strType, boolean bTryMode) {
		Assert.hasLength(strType, "传入调度器类型无效");
		String strType2 = strType.toUpperCase();
		return (IScheduler)executeAction("获取调度器", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				synchronized (schedulerMap) {
					Object item = schedulerMap.get(strType2);
					if (item != null) {
						return (IScheduler) item;
					}
					
					IScheduler iScheduler = onGetScheduler(strType2, bTryMode);
					if(iScheduler != null)  {
						schedulerMap.put(strType2, iScheduler);
					}
					return iScheduler;
				}
			}
		}, null);
	}
	
	protected IScheduler onGetScheduler(String strType, boolean bTryMode) throws Throwable {
		ISchedulerProvider iSchedulerProvider = null;
		List<ISchedulerProvider> list = this.schedulerProviderMap2.get(strType);
		if(!ObjectUtils.isEmpty(list)) {
			iSchedulerProvider = list.get(0);
		}
		else {
			iSchedulerProvider = this.schedulerProviderMap.get(strType);
		}
		
		if(iSchedulerProvider == null) {
			if(bTryMode) {
				return null;
			}
			throw new Exception(String.format("调度器[%1$s]提供方无效", strType));
		}
		
		IScheduler iScheduler = iSchedulerProvider.createScheduler(strType);
		iScheduler.init(this.getModelRuntimeContext(), strType);
		iScheduler.start();
	//	this.prepareScheduler(iScheduler);
		return iScheduler;
	}
	
	public IExecutor getExecutor(String strType, boolean bTryMode) {
		Assert.hasLength(strType, "传入执行器类型无效");
		String strType2 = strType.toUpperCase();
		return (IExecutor)executeAction("获取执行器", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				synchronized (executorMap) {
					Object item = executorMap.get(strType2);
					if (item != null) {
						return (IExecutor) item;
					}
					
					IExecutor iExecutor = onGetExecutor(strType2, bTryMode);
					if(iExecutor != null)  {
						executorMap.put(strType2, iExecutor);
					}
					return iExecutor;
				}
			}
		}, null);
	}
	
	protected IExecutor onGetExecutor(String strType, boolean bTryMode) throws Throwable {
		
		IExecutorProvider iExecutorProvider = this.executorProviderMap.get(strType);
		if(iExecutorProvider == null) {
			if(bTryMode) {
				return null;
			}
			throw new Exception(String.format("执行器[%1$s]提供方无效", strType));
		}
		
		IExecutor iExecutor = iExecutorProvider.createExecutor(strType);
		iExecutor.init(this.getModelRuntimeContext(), strType);
		return iExecutor;
	}
	
	protected void destoryScheduler(IScheduler iScheduler) throws Throwable {
		
	}
	

	
	protected synchronized void resetSchedulers() {
		List<IScheduler> agents = new ArrayList<IScheduler>(this.schedulerMap.values());
		this.schedulerMap.clear();
		if(!ObjectUtils.isEmpty(agents)) {
			for(IScheduler iScheduler : agents) {
				try {
					destoryScheduler(iScheduler);
				}
				catch (Throwable ex) {
					log.error(ex);
				}
				try {
					iScheduler.stop();
				}
				catch (Throwable ex) {
					log.error(ex);
				}
			}
		}
	}
	
	@Override
	public boolean containsSchedulerProvider(String strSchedulerProviderName) {
		Assert.hasLength(strSchedulerProviderName, "未传入调度器提供器名称");
		strSchedulerProviderName = strSchedulerProviderName.toUpperCase();
		List<ISchedulerProvider> list = this.schedulerProviderMap2.get(strSchedulerProviderName);
		if(!ObjectUtils.isEmpty(list)) {
			return true;
		}
		
		ISchedulerProvider iScheduler = this.schedulerProviderMap.get(strSchedulerProviderName);
		if(iScheduler != null) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public void registerSchedulerProvider(String strSchedulerProviderName, ISchedulerProvider iScheduler) {
		Assert.hasLength(strSchedulerProviderName, "未传入调度器提供器名称");
		Assert.notNull(iScheduler, "未传入调度器提供器对象");
		strSchedulerProviderName = strSchedulerProviderName.toUpperCase();
		synchronized (this.schedulerProviderMap2) {
			List<ISchedulerProvider> last = this.schedulerProviderMap2.get(strSchedulerProviderName);
			List<ISchedulerProvider> list = new ArrayList<ISchedulerProvider>();
			if(last != null) {
				list.addAll(last);
			}
			if(!list.contains(iScheduler)) {
				list.add(iScheduler);
				Collections.sort(list, new Comparator<ISchedulerProvider>() {
					@Override
					public int compare(ISchedulerProvider o1, ISchedulerProvider o2) {
						return Integer.compare(o1.getPriority(), o2.getPriority());
					}
				});
			}
			this.schedulerProviderMap2.put(strSchedulerProviderName, list);
			//resetAsyncSchedulerSpecifications();
		}
	}

	@Override
	public boolean unregisterSchedulerProvider(String strSchedulerProviderName, ISchedulerProvider iScheduler) {
		Assert.hasLength(strSchedulerProviderName, "未传入调度器提供器名称");
		Assert.notNull(iScheduler, "未传入调度器提供器对象");
		strSchedulerProviderName = strSchedulerProviderName.toUpperCase();
		synchronized (this.schedulerProviderMap2) {
			List<ISchedulerProvider> last = this.schedulerProviderMap2.get(strSchedulerProviderName);
			List<ISchedulerProvider> list = new ArrayList<ISchedulerProvider>();
			if(last != null) {
				list.addAll(last);
			}
			if(list.contains(iScheduler)) {
				list.remove(iScheduler);
				this.schedulerProviderMap2.put(strSchedulerProviderName, list);
				//resetAsyncSchedulerSpecifications();
				return true;
			}
			return false;			
		}
	}
	
	
	@Override
	public boolean containsExecutorProvider(String strToolProviderName) {
		Assert.hasLength(strToolProviderName, "未传入执行器提供器名称");
		strToolProviderName = strToolProviderName.toUpperCase();
		List<IExecutorProvider> list = this.executorProviderMap2.get(strToolProviderName);
		if(!ObjectUtils.isEmpty(list)) {
			return true;
		}
		
		IExecutorProvider iExecutor = this.executorProviderMap.get(strToolProviderName);
		if(iExecutor != null) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public void registerExecutorProvider(String strToolProviderName, IExecutorProvider iExecutor) {
		Assert.hasLength(strToolProviderName, "未传入执行器提供器名称");
		Assert.notNull(iExecutor, "未传入执行器提供器对象");
		strToolProviderName = strToolProviderName.toUpperCase();
		synchronized (this.executorProviderMap2) {
			List<IExecutorProvider> last = this.executorProviderMap2.get(strToolProviderName);
			List<IExecutorProvider> list = new ArrayList<IExecutorProvider>();
			if(last != null) {
				list.addAll(last);
			}
			if(!list.contains(iExecutor)) {
				list.add(iExecutor);
				Collections.sort(list, new Comparator<IExecutorProvider>() {
					@Override
					public int compare(IExecutorProvider o1, IExecutorProvider o2) {
						return Integer.compare(o1.getPriority(), o2.getPriority());
					}
				});
			}
			this.executorProviderMap2.put(strToolProviderName, list);
			//resetAsyncToolSpecifications();
		}
	}

	@Override
	public boolean unregisterExecutorProvider(String strToolProviderName, IExecutorProvider iExecutor) {
		Assert.hasLength(strToolProviderName, "未传入执行器提供器名称");
		Assert.notNull(iExecutor, "未传入执行器提供器对象");
		strToolProviderName = strToolProviderName.toUpperCase();
		synchronized (this.executorProviderMap2) {
			List<IExecutorProvider> last = this.executorProviderMap2.get(strToolProviderName);
			List<IExecutorProvider> list = new ArrayList<IExecutorProvider>();
			if(last != null) {
				list.addAll(last);
			}
			if(list.contains(iExecutor)) {
				list.remove(iExecutor);
				this.executorProviderMap2.put(strToolProviderName, list);
				//resetAsyncToolSpecifications();
				return true;
			}
			return false;			
		}
	}
	
	protected synchronized void refreshSchedules(List<Map> list) throws Throwable {
		
		//放入静态组
		synchronized (this.scheduleMap) {
			list.addAll(this.scheduleMap.values());
		}
		
		//进行分组
		Map<String, List<Map>> typeMap = new LinkedHashMap<String, List<Map>>();
		for(Map item : list) {
			String type = DataTypeUtils.asString(item.get(IScheduler.SCHEDULEPARAM_SCHEDULE_TYPE));
			List<Map> subList = typeMap.get(type);
			if(subList == null) {
				subList = new ArrayList<Map>();
				typeMap.put(type, subList);
			}
			subList.add(item);
		}
		
		Map<String, IScheduler> schedulerMap2 = new LinkedHashMap<String, IScheduler>();
		schedulerMap2.putAll(this.schedulerMap);
		
		for(String type : typeMap.keySet()) {
			IScheduler iScheduler = schedulerMap2.remove(type); 
			if(iScheduler == null) {
				iScheduler = this.getScheduler(type, false);
			}
			iScheduler.refreshSchedules(typeMap.get(type));
		}
		
		for(String type : schedulerMap2.keySet()) {
			schedulerMap2.get(type).refreshSchedules(Collections.EMPTY_LIST);
		}
	}
	
	
	protected void executeSchedule(Map<String, Object> schedule, Object objData) {
		try {
			Map<String, Object> taskTypeParams = null;
			String strTaskType = DataTypeUtils.asString(schedule.get(IScheduler.SCHEDULEPARAM_TASK_TYPE));
			if(ObjectUtils.isEmpty(strTaskType)) {
				throw new Exception("未指定任务类型");
			}
			
			taskTypeParams = this.getTaskTypeParams(strTaskType);
			
			Object localExecution = taskTypeParams.get(TASKTYPEPARAM_LOCAL_EXECUTION);
			if(!DataTypeUtils.asBoolean(localExecution, false)) {
				ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.tryGetSysUniStateUtilRuntime();
				if(iSysUniStateUtilRuntime != null) {
					if(!iSysUniStateUtilRuntime.hasLeadership(KeyValueUtils.genUniqueId(this.getSystemRuntime().getDeploySystemId(), TASKUTIL_TIMERTASK, this.getFullUniqueTag()))) {
						return;
					}
				}
			}
			doExecuteSchedule(schedule, taskTypeParams, objData);
		}
		catch (Throwable ex) {
			log.error(String.format("执行作业[%1$s]发生异常，%2$s", JsonUtils.toString(schedule), ex.getMessage()), ex);
		}
	}
	
	protected Object doExecuteSchedule(Map<String, Object> schedule, Map<String, Object> taskTypeParams, Object objData) throws Throwable {
		
		Object executor = taskTypeParams.get(TASKTYPEPARAM_EXECUTOR);
		if(executor != null) {
			IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
			try {
				UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
				if(executor instanceof IExecutor) {
					return this.doExecuteSchedule((IExecutor)executor, schedule, taskTypeParams, objData);
				}
				
				if(executor instanceof IAction) {
					return ((IAction)executor).execute(new Object[] {schedule, taskTypeParams, objData});
				}
				
				if(executor instanceof Runnable) {
					((Runnable)executor).run();
					return null;
				}
				throw new Exception(String.format("无法识别的任务类型[%1$s]执行器[%2$s]", DataTypeUtils.asString(schedule.get(IScheduler.SCHEDULEPARAM_TASK_TYPE)), executor.getClass().getCanonicalName()));
			}
			finally {
				EmployeeContext.setCurrent(lastEmployeeContext);
			}
		}
		
		String strExecutorType = DataTypeUtils.asString(taskTypeParams.get(IExecutor.TASKTYPEPARAM_EXECUTOR_TYPE));
		if(ObjectUtils.isEmpty(strExecutorType)) {
			throw new Exception("未指定执行器类型");
		}
		
		IExecutor iExecutor = this.getExecutor(strExecutorType, false);
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
			return this.doExecuteSchedule(iExecutor, schedule, taskTypeParams, objData);
		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	@Override
	public void registerTaskType(String strTaskTypeId, Map<String, Object> taskTypeParams, boolean bOverwrite) {
		this.registerTaskType(strTaskTypeId, taskTypeParams, bOverwrite, false);
	}
	
	
	@Override
	public void registerTaskType(String strTaskTypeId, Map<String, Object> taskTypeParams, boolean bOverwrite, boolean bPersistent) {
		Assert.hasLength(strTaskTypeId, "传入任务类型无效");
		Assert.notEmpty(taskTypeParams, "传入任务类型参数无效");
		this.executeAction("注册任务类型", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onRegisterTaskType(strTaskTypeId, taskTypeParams, bOverwrite, bPersistent);
				return null;
			}
			
		}, null);
	}
	
	protected void onRegisterTaskType(String strTaskTypeId, Map<String, Object> taskTypeParams, boolean bOverwrite, boolean bPersistent) throws Throwable {
		synchronized (this.taskTypeMap) {
			if(!this.taskTypeMap.containsKey(strTaskTypeId) || bOverwrite) {
				this.taskTypeMap.put(strTaskTypeId, taskTypeParams);
			}
		}
	}
	


	@Override
	public boolean unregisterTaskType(String strTaskTypeId) {
		Assert.hasLength(strTaskTypeId, "传入任务类型无效");
		return (boolean) this.executeAction("注销任务类型", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onUnregisterTaskType(strTaskTypeId);
			}
		}, null);
	}

	protected boolean onUnregisterTaskType(String strTaskTypeId) throws Throwable{
		synchronized (this.taskTypeMap) {
			return this.taskTypeMap.remove(strTaskTypeId) != null;
		}
	}
	
	@Override
	public void addSchedule(String strScheduleId, Map<String, Object> scheduleParams, boolean bOverwrite) {
		this.addSchedule(strScheduleId, scheduleParams, bOverwrite, false);
	}
	

	@Override
	public void addSchedule(String strScheduleId, Map<String, Object> scheduleParams, boolean bOverwrite, boolean bPersistent) {
		Assert.hasLength(strScheduleId, "传入计划任务标识无效");
		Assert.notEmpty(scheduleParams, "传入计划任务类型参数无效");
		this.executeAction("添加计划任务", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onAddSchedule(strScheduleId, scheduleParams, bOverwrite, bPersistent);
				return null;
			}
			
		}, null);
	}

	protected void onAddSchedule(String strScheduleId, Map<String, Object> scheduleParams, boolean bOverwrite, boolean bPersistent) throws Throwable{
		synchronized (this.scheduleMap) {
			if(!this.scheduleMap.containsKey(strScheduleId) || bOverwrite) {
				this.scheduleMap.put(strScheduleId, scheduleParams);
				this.refreshSchedules();
			}
		}
	}

	@Override
	public boolean removeSchedule(String strScheduleId) {
		Assert.hasLength(strScheduleId, "传入计划任务标识无效");
		return (boolean) this.executeAction("移除计划任务", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onRemoveSchedule(strScheduleId);
			}
		}, null);
	}

	protected boolean onRemoveSchedule(String strScheduleId) throws Throwable{
		synchronized (this.scheduleMap) {
			if(this.scheduleMap.remove(strScheduleId) != null) {
				this.refreshSchedules();
				return true;
			}
		}
		return false;
	}

	protected Map<String, Object> getTaskTypeParams(String strTaskType) throws Throwable {
		return this.taskTypeMap.get(strTaskType);
	}
	
	protected Object doExecuteSchedule(IExecutor iExecutor, Map<String, Object> schedule, Map<String, Object> taskType, Object objData) throws Throwable {
		return iExecutor.execute(schedule, taskType, objData);
	}
	
	protected void refreshSchedules() throws Throwable {
		if(!this.isInstalled()) {
			return;
		}
		this.refreshSchedules(new ArrayList<Map>());
	}
	
}
