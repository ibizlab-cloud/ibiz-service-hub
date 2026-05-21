package net.ibizsys.central.plugin.task.sysutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.plugin.task.addin.IExecutor;
import net.ibizsys.central.plugin.task.addin.IScheduler;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.IPSDEGroup;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.ISystemEventListener;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class SysDETaskUtilRuntimeBase extends SysTaskUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysDETaskUtilRuntimeBase.class);
	
	public final static String DE_SCHEDULE = "SCHEDULE";
	public final static String DE_TASK_TYPE = "TASK_TYPE";
	public final static String DE_SCHEDULED_TASK = "SCHEDULED_TASK";
	public final static String DE_SCHEDULED_TASK_HIS = "SCHEDULED_TASK_HIS";
	
	/**
	 * 启用的计划数据集
	 */
	public final static String DATASET_SCHEDULE_VALID = "VALID";
	
	private Map<String, IPSDataEntity> deMap = new HashMap<String, IPSDataEntity>();
	
	
	private IDataEntityRuntime scheduleDERuntime = null;
	
	private IDataEntityRuntime taskTypeDERuntime = null;
	
	private IDataEntityRuntime scheduledTaskDERuntime = null;
	
	private IDataEntityRuntime scheduledTaskHisDERuntime = null;
	
	private Map<String, IPSDEField> schedulePSDEFieldMap = new LinkedHashMap<String, IPSDEField>();
	
	private Map<String, IPSDEField> taskTypePSDEFieldMap = new LinkedHashMap<String, IPSDEField>();
	
	private Map<String, IPSDEField> scheduledTaskPSDEFieldMap = new LinkedHashMap<String, IPSDEField>();
	
	private boolean bRunListScheduleTimer = false;
	
	
	@Override
	protected void onInit() throws Exception {
		
		final IPSDEGroup iPSDEGroup = getPSDEGroup();
		if (iPSDEGroup == null) {
			throw new Exception("未指定系统实体组模型对象");
		}
		
		java.util.List<IPSDEGroupDetail> psDEGroupDetailList = iPSDEGroup.getPSDEGroupDetails();
		if(!ObjectUtils.isEmpty(psDEGroupDetailList)) {
			for(IPSDEGroupDetail iPSDEGroupDetail : psDEGroupDetailList) {
				if(DE_SCHEDULE.equalsIgnoreCase(iPSDEGroupDetail.getCodeName()) || DE_SCHEDULE.equalsIgnoreCase(iPSDEGroupDetail.getPSDataEntityMust().getName())) {
					deMap.put(DE_SCHEDULE, iPSDEGroupDetail.getPSDataEntityMust());
					continue;
				}
				if(DE_TASK_TYPE.equalsIgnoreCase(iPSDEGroupDetail.getCodeName()) || DE_TASK_TYPE.equalsIgnoreCase(iPSDEGroupDetail.getPSDataEntityMust().getName())) {
					deMap.put(DE_TASK_TYPE, iPSDEGroupDetail.getPSDataEntityMust());
					continue;
				}
				if(DE_SCHEDULED_TASK.equalsIgnoreCase(iPSDEGroupDetail.getCodeName()) || DE_SCHEDULED_TASK.equalsIgnoreCase(iPSDEGroupDetail.getPSDataEntityMust().getName())) {
					deMap.put(DE_SCHEDULED_TASK, iPSDEGroupDetail.getPSDataEntityMust());
					continue;
				}
				if(DE_SCHEDULED_TASK_HIS.equalsIgnoreCase(iPSDEGroupDetail.getCodeName()) || DE_SCHEDULED_TASK_HIS.equalsIgnoreCase(iPSDEGroupDetail.getPSDataEntityMust().getName())) {
					deMap.put(DE_SCHEDULED_TASK_HIS, iPSDEGroupDetail.getPSDataEntityMust());
					continue;
				}
			}
		}
		
		
		super.onInit();
	}
	
	
	
	protected IPSDEGroup getPSDEGroup() {
		return this.getPSSysUtil().getPSSysDEGroup();
	}
	
	
	protected IDataEntityRuntime getScheduleDERuntime(boolean tryMode) throws Exception {
		if(this.scheduleDERuntime != null || tryMode) {
			return this.scheduleDERuntime;
		}
		throw new Exception(String.format("计划实体运行时对象无效"));
	}
	
	protected void setScheduleDERuntime(IDataEntityRuntime scheduleDERuntime) {
		this.scheduleDERuntime = scheduleDERuntime;
	}
	
	protected IDataEntityRuntime getTaskTypeDERuntime(boolean tryMode) throws Exception {
		if(this.taskTypeDERuntime != null || tryMode) {
			return this.taskTypeDERuntime;
		}
		throw new Exception(String.format("任务类型实体运行时对象无效"));
	}
	
	protected void setTaskTypeDERuntime(IDataEntityRuntime taskTypeDERuntime) {
		this.taskTypeDERuntime = taskTypeDERuntime;
	}
	
	protected IDataEntityRuntime getScheduledTaskDERuntime(boolean tryMode) throws Exception {
		if(this.scheduledTaskDERuntime != null || tryMode) {
			return this.scheduledTaskDERuntime;
		}
		throw new Exception(String.format("调度任务实体运行时对象无效"));
	}
	
	protected void setScheduledTaskDERuntime(IDataEntityRuntime scheduledTaskDERuntime) {
		this.scheduledTaskDERuntime = scheduledTaskDERuntime;
	}
	
	
	@Override
	protected void onInstall() throws Exception {
		if(this.getScheduleDERuntime(true) == null) {
			IPSDataEntity iPSDataEntity = deMap.get(DE_SCHEDULE);
			if(iPSDataEntity == null) {
				throw new Exception(String.format("未定义计划实体"));
			}
			this.setScheduleDERuntime((IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId()));
		}
		
		if(this.getTaskTypeDERuntime(true) == null) {
			IPSDataEntity iPSDataEntity = deMap.get(DE_TASK_TYPE);
			if(iPSDataEntity == null) {
				throw new Exception(String.format("未定义任务类型实体"));
			}
			this.setTaskTypeDERuntime((IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId()));
		}
		
		if(this.getScheduledTaskDERuntime(true) == null) {
			IPSDataEntity iPSDataEntity = deMap.get(DE_SCHEDULED_TASK);
			if(iPSDataEntity == null) {
				throw new Exception(String.format("未定义调度任务实体"));
			}
			this.setScheduledTaskDERuntime((IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId()));
		}
		
		
		this.getScheduleDERuntime(false).getPSDEDataSetByTag(DATASET_SCHEDULE_VALID, false);
		this.fillSchedulePSDEFieldMap(this.schedulePSDEFieldMap);
		this.fillTaskTypePSDEFieldMap(this.taskTypePSDEFieldMap);
		this.fillScheduledTaskPSDEFieldMap(this.scheduledTaskPSDEFieldMap);
		
		super.onInstall();
		this.bRunListScheduleTimer = true;
		runListScheduleTimer();
	}
	
	protected void fillSchedulePSDEFieldMap(Map<String, IPSDEField> schedulePSDEFieldMap) throws Exception {
		final IDataEntityRuntime scheduleDERuntime = this.getScheduleDERuntime(false);
		schedulePSDEFieldMap.put(SCHEDULEPARAM_ID, scheduleDERuntime.getKeyPSDEField());
		schedulePSDEFieldMap.put(SCHEDULEPARAM_NAME, scheduleDERuntime.getMajorPSDEField());
		
		schedulePSDEFieldMap.put(SCHEDULEPARAM_TASK_TYPE, scheduleDERuntime.getPSDEFieldByTag(SCHEDULEPARAM_TASK_TYPE, false));
		schedulePSDEFieldMap.put(SCHEDULEPARAM_TIMER_POLICY, scheduleDERuntime.getPSDEFieldByTag(SCHEDULEPARAM_TIMER_POLICY, false));
		schedulePSDEFieldMap.put(SCHEDULEPARAM_SCHEDULE_TYPE, scheduleDERuntime.getPSDEFieldByTag(SCHEDULEPARAM_SCHEDULE_TYPE, false));
		schedulePSDEFieldMap.put(SCHEDULEPARAM_PAYLOAD, scheduleDERuntime.getPSDEFieldByTag(SCHEDULEPARAM_PAYLOAD, true));
		schedulePSDEFieldMap.put(IScheduler.SCHEDULEPARAM_PRINCIPAL_ID, scheduleDERuntime.getPSDEFieldByTag(IScheduler.SCHEDULEPARAM_PRINCIPAL_ID, true));
		schedulePSDEFieldMap.put(IScheduler.SCHEDULEPARAM_PRINCIPAL_NAME, scheduleDERuntime.getPSDEFieldByTag(IScheduler.SCHEDULEPARAM_PRINCIPAL_NAME, true));
		schedulePSDEFieldMap.put(IScheduler.SCHEDULEPARAM_PRINCIPAL_TYPE, scheduleDERuntime.getPSDEFieldByTag(IScheduler.SCHEDULEPARAM_PRINCIPAL_TYPE, true));
		//schedulePSDEFieldMap.put(SCHEDULEPARAM_NEXT_TRIGGER_TIME, scheduleDERuntime.getPSDEFieldByTag(SCHEDULEPARAM_NEXT_TRIGGER_TIME, true));
	}
	
	protected void fillTaskTypePSDEFieldMap(Map<String, IPSDEField> taskTypePSDEFieldMap) throws Exception {
		final IDataEntityRuntime taskTypeDERuntime = this.getTaskTypeDERuntime(false);
		taskTypePSDEFieldMap.put(IExecutor.TASKTYPEPARAM_ID, taskTypeDERuntime.getKeyPSDEField());
		taskTypePSDEFieldMap.put(IExecutor.TASKTYPEPARAM_NAME, taskTypeDERuntime.getMajorPSDEField());
		
		taskTypePSDEFieldMap.put(IExecutor.TASKTYPEPARAM_EXECUTOR_TYPE, taskTypeDERuntime.getPSDEFieldByTag(IExecutor.TASKTYPEPARAM_EXECUTOR_TYPE, false));
		taskTypePSDEFieldMap.put(IExecutor.TASKTYPEPARAM_CODE, taskTypeDERuntime.getPSDEFieldByTag(IExecutor.TASKTYPEPARAM_CODE, false));
		taskTypePSDEFieldMap.put(IExecutor.TASKTYPEPARAM_EXECUTOR_TAG, taskTypeDERuntime.getPSDEFieldByTag(IExecutor.TASKTYPEPARAM_EXECUTOR_TAG, true));
		taskTypePSDEFieldMap.put(IExecutor.TASKTYPEPARAM_EXECUTOR_CONFIG, taskTypeDERuntime.getPSDEFieldByTag(IExecutor.TASKTYPEPARAM_EXECUTOR_CONFIG, true));
		taskTypePSDEFieldMap.put(IExecutor.TASKTYPEPARAM_EXECUTOR_SUBTYPE, taskTypeDERuntime.getPSDEFieldByTag(IExecutor.TASKTYPEPARAM_EXECUTOR_SUBTYPE, true));
		taskTypePSDEFieldMap.put(IExecutor.TASKTYPEPARAM_RETRYABLE, taskTypeDERuntime.getPSDEFieldByTag(IExecutor.TASKTYPEPARAM_RETRYABLE, true));
		taskTypePSDEFieldMap.put(IExecutor.TASKTYPEPARAM_MAX_RETRY, taskTypeDERuntime.getPSDEFieldByTag(IExecutor.TASKTYPEPARAM_MAX_RETRY, true));
		taskTypePSDEFieldMap.put(IExecutor.TASKTYPEPARAM_TIMEOUT, taskTypeDERuntime.getPSDEFieldByTag(IExecutor.TASKTYPEPARAM_TIMEOUT, true));
		
	}
	
	protected void fillScheduledTaskPSDEFieldMap(Map<String, IPSDEField> scheduledTaskPSDEFieldMap) throws Exception {
		final IDataEntityRuntime scheduledTaskDERuntime = this.getScheduledTaskDERuntime(false);
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_ID, scheduledTaskDERuntime.getKeyPSDEField());
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_NAME, scheduledTaskDERuntime.getMajorPSDEField());
		
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_SCHEDULED_AT, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_SCHEDULED_AT, false));
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_STATUS, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_STATUS, false));
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_RESULT, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_RESULT, false));
		
		
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_PRINCIPAL_ID, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_PRINCIPAL_ID, true));
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_PRINCIPAL_NAME, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_PRINCIPAL_NAME, true));
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_PRINCIPAL_TYPE, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_PRINCIPAL_TYPE, true));
		
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_SCHEDULE_ID, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_SCHEDULE_ID, true));
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_TASK_TYPE, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_TASK_TYPE, true));
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_PAYLOAD, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_PAYLOAD, true));
		
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_STARTED_AT, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_STARTED_AT, true));
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_FINISHED_AT, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_FINISHED_AT, true));
		
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_RETRY_COUNT, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_RETRY_COUNT, true));
		scheduledTaskPSDEFieldMap.put(IExecutor.SCHEDULEDTASKPARAM_RESULT_MESSAGE, scheduledTaskDERuntime.getPSDEFieldByTag(IExecutor.SCHEDULEDTASKPARAM_RESULT_MESSAGE, true));
	}
	
	
	@Override
	protected void onUninstall() throws Throwable {
		this.bRunListScheduleTimer = false;
		super.onUninstall();
	}
	
	protected void runListScheduleTimer() {
		runListScheduleTimer(false);
	}
	
	protected final boolean isRunListScheduleTimer() {
		return this.bRunListScheduleTimer;
	}

	protected void runListScheduleTimer(boolean bTimerOnly) {
		if(!this.bRunListScheduleTimer) {
			return;
		}
		
		if(!bTimerOnly) {
			try {
				onListScheduleTimer();
			} catch (Throwable ex) {
				log.error(String.format("[%1$s]列出计划定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}
		
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runListScheduleTimer();
			}
		}, System.currentTimeMillis() + 30000, "ListScheduleTimer_SysTaskUtil_" + this.getFullUniqueTag());
	}

	protected void onListScheduleTimer() throws Throwable {
		final IDataEntityRuntime scheduleDERuntime = this.getScheduleDERuntime(false);
		IPSDEDataSet iPSDEDataSet  = scheduleDERuntime.getPSDEDataSetByTag(DATASET_SCHEDULE_VALID, false);
		ISearchContextDTO iSearchContextDTO = scheduleDERuntime.createSearchContext().count(false).all();
		List<IEntityDTO> list =	scheduleDERuntime.selectDataSet(iPSDEDataSet, iSearchContextDTO);
		List<Map> scheduleList = new ArrayList<Map>();
		if(!ObjectUtils.isEmpty(list)) {
			for(IEntityDTO iEntityDTO : list) {
				Map<String, Object> item = new LinkedHashMap<String, Object>();
				for(java.util.Map.Entry<String, IPSDEField> entry : schedulePSDEFieldMap.entrySet()) {
					IPSDEField iPSDEField = entry.getValue();
					if(iPSDEField == null) {
						continue;
					}
					item.put(entry.getKey(), iEntityDTO.get(iPSDEField.getLowerCaseName()));
				}
				//item.remove(SCHEDULEPARAM_NEXT_TRIGGER_TIME);
				scheduleList.add(item);
			}
		}
		this.refreshSchedules(scheduleList);
	}
	
	@Override
	protected void refreshSchedules() throws Throwable {
		if(this.isRunListScheduleTimer()) {
			onListScheduleTimer();
			return;
		}
		super.refreshSchedules();
	}
	
	@Override
	protected Map<String, Object> getTaskTypeParams(String strTaskType) throws Throwable {
		
		Map<String, Object> last = super.getTaskTypeParams(strTaskType);
		if(last != null) {
			return last;
		}
		
		final IDataEntityRuntime taskTypeDERuntime = this.getTaskTypeDERuntime(false);
		IEntityDTO iEntityDTO = taskTypeDERuntime.get(strTaskType);
		Map<String, Object> item = new LinkedHashMap<String, Object>();
		for(java.util.Map.Entry<String, IPSDEField> entry : taskTypePSDEFieldMap.entrySet()) {
			IPSDEField iPSDEField = entry.getValue();
			if(iPSDEField == null) {
				continue;
			}
			item.put(entry.getKey(), iEntityDTO.get(iPSDEField.getLowerCaseName()));
		}
		return item;
	}
	
	@Override
	protected Object doExecuteSchedule(Map<String, Object> schedule, Map<String, Object> taskTypeParams, Object objData) throws Throwable {
		java.util.Date date = DataTypeUtils.asDateTime(schedule.get(IScheduler.SCHEDULEPARAM_NEXT_TRIGGER_TIME));
		if(date != null) {
			final IDataEntityRuntime scheduleDERuntime = this.getScheduleDERuntime(false);
			IPSDEField nextTriggerTimePSDEField = scheduleDERuntime.getPSDEFieldByTag(IScheduler.SCHEDULEPARAM_NEXT_TRIGGER_TIME, true);
			if(nextTriggerTimePSDEField != null) {
				Object id = schedule.get(IScheduler.SCHEDULEPARAM_ID);
				
				IEntityDTO iEntityDTO = scheduleDERuntime.createEntity();
				iEntityDTO.set(scheduleDERuntime.getKeyPSDEField().getLowerCaseName(), id);
				iEntityDTO.set(nextTriggerTimePSDEField.getLowerCaseName(), date);
				
				scheduleDERuntime.execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						scheduleDERuntime.rawUpdate(Arrays.asList(iEntityDTO), true);
						return null;
					}
				}, null);
			}
		}
		return super.doExecuteSchedule(schedule, taskTypeParams, objData);
	}
	
	@Override
	protected Object doExecuteSchedule(IExecutor iExecutor,  Map<String, Object> schedule, Map<String, Object> taskType, Object objData) throws Throwable {
		java.util.Date fireDate = DataTypeUtils.asDateTime(schedule.get(IScheduler.SCHEDULEPARAM_FIRE_TIME));
		String strScheduleId = DataTypeUtils.asString(schedule.get(IScheduler.SCHEDULEPARAM_ID));
		String strTaskType = DataTypeUtils.asString(schedule.get(IScheduler.SCHEDULEPARAM_TASK_TYPE));
		String strPayload = DataTypeUtils.asString(schedule.get(IScheduler.SCHEDULEPARAM_PAYLOAD));
		String strPrincipalId = DataTypeUtils.asString(schedule.get(IScheduler.SCHEDULEPARAM_PRINCIPAL_ID));
		String strPrincipalName = DataTypeUtils.asString(schedule.get(IScheduler.SCHEDULEPARAM_PRINCIPAL_NAME));
		String strPrincipalType = DataTypeUtils.asString(schedule.get(IScheduler.SCHEDULEPARAM_PRINCIPAL_TYPE));
		
		boolean bEnableRetry = DataTypeUtils.asBoolean(taskType.get(IExecutor.TASKTYPEPARAM_RETRYABLE));
		int nRetryCount = DataTypeUtils.asInteger(taskType.get(IExecutor.TASKTYPEPARAM_MAX_RETRY), -1);
		
		final IDataEntityRuntime scheduledTaskDERuntime = this.getScheduledTaskDERuntime(false);
		IEntityDTO iEntityDTO = scheduledTaskDERuntime.createEntity();
		Map<String, Object> scheduledTaskMap = new LinkedHashMap<String, Object>();
		String strId = KeyValueUtils.genUniqueId();
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_ID, strId);
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_PAYLOAD, strPayload);
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_SCHEDULE_ID, strScheduleId);
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_TASK_TYPE, strTaskType);
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_SCHEDULED_AT, new java.sql.Timestamp(fireDate.getTime()));
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_STARTED_AT, new java.sql.Timestamp(System.currentTimeMillis()));
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_STATUS, IExecutor.SCHEDULETASKSTATUS_RUNNING);
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_PRINCIPAL_ID, strPrincipalId);
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_PRINCIPAL_NAME, strPrincipalName);
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_PRINCIPAL_TYPE, strPrincipalType);
		
		for(java.util.Map.Entry<String, Object> entry : scheduledTaskMap.entrySet()) {
			IPSDEField iPSDEField = scheduledTaskPSDEFieldMap.get(entry.getKey());
			if(iPSDEField == null) {
				continue;
			}
			iEntityDTO.put(iPSDEField.getLowerCaseName(), entry.getValue());
		}
		
		scheduledTaskDERuntime.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				scheduledTaskDERuntime.rawCreate(Arrays.asList(iEntityDTO), true);
				return null;
			}
		}, null);
		
		int nLoopCount = 1;
		if(bEnableRetry && nRetryCount >0) {
			nLoopCount = nRetryCount;
		}
		
		Object ret = null;
		Throwable error = null;
		int nErrorCnt = 0;
		for(int i = 0; i<nLoopCount; i++) {
			error = null;
			try {
				ret = super.doExecuteSchedule(iExecutor, schedule, taskType, objData);
				break;
			}
			catch (Throwable ex) {
				error = ex;
				nErrorCnt ++;
			}
		}
		
		scheduledTaskMap.clear();
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_ID, strId);
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_FINISHED_AT, new java.sql.Timestamp(System.currentTimeMillis()));
		scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_RETRY_COUNT, nErrorCnt);
		if(error != null) {
			scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_STATUS, IExecutor.SCHEDULETASKSTATUS_FAILED);
			String strErrorInfo = error.getMessage();
			scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_RESULT_MESSAGE, strErrorInfo);
		}
		else {
			scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_STATUS, IExecutor.SCHEDULETASKSTATUS_SUCCESS);
			if(ret != null) {
				scheduledTaskMap.put(IExecutor.SCHEDULEDTASKPARAM_RESULT, JsonUtils.toString(ret));
			}
		}

		IEntityDTO iEntityDTO2 = scheduledTaskDERuntime.createEntity();
		for(java.util.Map.Entry<String, Object> entry : scheduledTaskMap.entrySet()) {
			IPSDEField iPSDEField = scheduledTaskPSDEFieldMap.get(entry.getKey());
			if(iPSDEField == null) {
				continue;
			}
			iEntityDTO2.put(iPSDEField.getLowerCaseName(), entry.getValue());
		}
		
		scheduledTaskDERuntime.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				scheduledTaskDERuntime.rawUpdate(Arrays.asList(iEntityDTO2), true);
				return null;
			}
		}, null);
		
		if(error != null) {
			throw error;
		}
		
		return ret;
	}
	
	@Override
	public void addSchedule(String strScheduleId, Map<String, Object> scheduleParams, boolean bOverwrite, boolean bPersistent) {
		if(bPersistent && !this.isInstalled()) {
			//组件还未安装，注册系统加载事件
			this.getSystemRuntime().registerSystemLoadEventListener(new ISystemEventListener() {
				@Override
				public void receiveEvent(String event, Object[] params) {
					try {
						addSchedule(strScheduleId, scheduleParams, bOverwrite, bPersistent);
					}
					catch (Throwable ex) {
						log.error(String.format("异步添加调度任务[%1$s]发生异常，%2$s", strScheduleId, ex.getMessage()), ex);
					}
				}
			});
			return;
		}
		super.addSchedule(strScheduleId, scheduleParams, bOverwrite, bPersistent);
	}
	
	@Override
	public boolean removeSchedule(String strScheduleId) {
		if(!this.isInstalled()) {
			//组件还未安装，注册系统加载事件
			this.getSystemRuntime().registerSystemLoadEventListener(new ISystemEventListener() {
				@Override
				public void receiveEvent(String event, Object[] params) {
					try {
						removeSchedule(strScheduleId);
					}
					catch (Throwable ex) {
						log.error(String.format("异步删除调度任务[%1$s]发生异常，%2$s", strScheduleId, ex.getMessage()), ex);
					}
				}
			});
			return true;
		}
		return super.removeSchedule(strScheduleId);
	}
	
	@Override
	public void registerTaskType(String strTaskTypeId, Map<String, Object> taskTypeParams, boolean bOverwrite, boolean bPersistent) {
		if(bPersistent && !this.isInstalled()) {
			//组件还未安装，注册系统加载事件
			this.getSystemRuntime().registerSystemLoadEventListener(new ISystemEventListener() {
				@Override
				public void receiveEvent(String event, Object[] params) {
					try {
						registerTaskType(strTaskTypeId, taskTypeParams, bOverwrite, bPersistent);
					}
					catch (Throwable ex) {
						log.error(String.format("异步注册任务类型[%1$s]发生异常，%2$s", strTaskTypeId, ex.getMessage()), ex);
					}
				}
			});
			return;
		}
		super.registerTaskType(strTaskTypeId, taskTypeParams, bOverwrite, bPersistent);
	}
	
	
	@Override
	public boolean unregisterTaskType(String strTaskTypeId) {
		if(!this.isInstalled()) {
			//组件还未安装，注册系统加载事件
			this.getSystemRuntime().registerSystemLoadEventListener(new ISystemEventListener() {
				@Override
				public void receiveEvent(String event, Object[] params) {
					try {
						unregisterTaskType(strTaskTypeId);
					}
					catch (Throwable ex) {
						log.error(String.format("异步注销任务类型[%1$s]发生异常，%2$s", strTaskTypeId, ex.getMessage()), ex);
					}
				}
			});
			return true;
		}
		return super.unregisterTaskType(strTaskTypeId);
	}
	
	
	@Override
	protected void onAddSchedule(String strScheduleId, Map<String, Object> scheduleParams, boolean bOverwrite, boolean bPersistent) throws Throwable {
		if(bPersistent) {
			IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
			try {
				UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
				this.doAddSchedule(strScheduleId, scheduleParams, bOverwrite);
			}
			finally {
				EmployeeContext.setCurrent(lastEmployeeContext);
			}
			return;
		}
		super.onAddSchedule(strScheduleId, scheduleParams, bOverwrite, bPersistent);
	}
	
	protected void doAddSchedule(String strScheduleId, Map<String, Object> scheduleParams, boolean bOverwrite) throws Throwable {
		final IDataEntityRuntime scheduleDERuntime = this.getScheduleDERuntime(false);
		Object key = DataTypeUtils.parse(scheduleDERuntime.getKeyPSDEField().getStdDataType(), strScheduleId);
		boolean exist = scheduleDERuntime.existsData(key);
		if(exist && !bOverwrite) {
			return;
		}
		
		IEntityDTO iEntityDTO = scheduleDERuntime.createEntity();
		for(java.util.Map.Entry<String, Object> entry : scheduleParams.entrySet()) {
			IPSDEField iPSDEField = this.schedulePSDEFieldMap.get(entry.getKey());
			if(iPSDEField != null) {
				iEntityDTO.set(iPSDEField.getLowerCaseName(), entry.getValue());
			}
			else {
				iEntityDTO.set(entry.getKey().toLowerCase(), entry.getValue());
			}
		}
		iEntityDTO.set(scheduleDERuntime.getKeyPSDEField().getLowerCaseName(), key);
		if(!exist) {
			scheduleDERuntime.create(iEntityDTO, false);
		}
		else {
			scheduleDERuntime.update(iEntityDTO, false);
		}
	}
	
	@Override
	protected boolean onRemoveSchedule(String strScheduleId) throws Throwable {
		boolean ret = super.onRemoveSchedule(strScheduleId);
		if(ret) {
			return ret;
		}
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
			return this.doRemoveSchedule(strScheduleId);
		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	protected boolean doRemoveSchedule(String strScheduleId) throws Throwable {
		final IDataEntityRuntime scheduleDERuntime = this.getScheduleDERuntime(false);
		Object key = DataTypeUtils.parse(scheduleDERuntime.getKeyPSDEField().getStdDataType(), strScheduleId);
		boolean exist = scheduleDERuntime.existsData(key);
		if(!exist) {
			return false;
		}	
		scheduleDERuntime.remove(key);
		return true;
	}
	
	@Override
	protected void onRegisterTaskType(String strTaskTypeId, Map<String, Object> taskTypeParams, boolean bOverwrite, boolean bPersistent) throws Throwable {
		if(bPersistent) {
			IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
			try {
				UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
				this.doAddTaskType(strTaskTypeId, taskTypeParams, bOverwrite);
			}
			finally {
				EmployeeContext.setCurrent(lastEmployeeContext);
			}
			return;
		}
		super.onRegisterTaskType(strTaskTypeId, taskTypeParams, bOverwrite, bPersistent);
	}
	
	protected void doAddTaskType(String strTaskTypeId, Map<String, Object> taskTypeParams, boolean bOverwrite) throws Throwable {
		final IDataEntityRuntime taskTypeDERuntime = this.getTaskTypeDERuntime(false);
		Object key = DataTypeUtils.parse(taskTypeDERuntime.getKeyPSDEField().getStdDataType(), strTaskTypeId);
		boolean exist = taskTypeDERuntime.existsData(key);
		if(exist && !bOverwrite) {
			return;
		}
		
		IEntityDTO iEntityDTO = taskTypeDERuntime.createEntity();
		for(java.util.Map.Entry<String, Object> entry : taskTypeParams.entrySet()) {
			IPSDEField iPSDEField = this.taskTypePSDEFieldMap.get(entry.getKey());
			if(iPSDEField != null) {
				iEntityDTO.set(iPSDEField.getLowerCaseName(), entry.getValue());
			}
			else {
				iEntityDTO.set(entry.getKey().toLowerCase(), entry.getValue());
			}
		}
		iEntityDTO.set(taskTypeDERuntime.getKeyPSDEField().getLowerCaseName(), key);
		if(!exist) {
			taskTypeDERuntime.create(iEntityDTO, false);
		}
		else {
			taskTypeDERuntime.update(iEntityDTO, false);
		}
	}
	
	@Override
	protected boolean onUnregisterTaskType(String strTaskTypeId) throws Throwable {
		boolean ret = super.onUnregisterTaskType(strTaskTypeId);
		if(ret) {
			return ret;
		}
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
			return this.doRemoveTaskType(strTaskTypeId);
		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	protected boolean doRemoveTaskType(String strTaskTypeId) throws Throwable {
		final IDataEntityRuntime taskTypeDERuntime = this.getTaskTypeDERuntime(false);
		Object key = DataTypeUtils.parse(taskTypeDERuntime.getKeyPSDEField().getStdDataType(), strTaskTypeId);
		boolean exist = taskTypeDERuntime.existsData(key);
		if(!exist) {
			return false;
		}	
		taskTypeDERuntime.remove(key);
		return true;
	}
}
