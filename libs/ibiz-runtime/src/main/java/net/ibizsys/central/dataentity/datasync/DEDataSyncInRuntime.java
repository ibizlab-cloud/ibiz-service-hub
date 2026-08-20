package net.ibizsys.central.dataentity.datasync;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOCase;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.eai.ISysFileSyncAgentRuntime;
import net.ibizsys.central.sysutil.ISysTaskUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionInput;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.ISystemEventListener;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.service.DEMethodInputTypes;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.domain.DataSyncIn;

public class DEDataSyncInRuntime extends net.ibizsys.runtime.dataentity.datasync.DEDataSyncInRuntime implements IDEDataSyncInRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataSyncInRuntime.class);

	private ISysTaskUtilRuntime sysTaskUtilRuntime = null;
	private volatile boolean syncEnabled = false;
	private String syncTaskType = null;
	private String syncTimerPolicy = null;
	/**
	 * 目标文件名称模式
	 */
	public static final String PARAM_FILE_PATTERN = "FILE_PATTERN";

	/**
	 * 目标文件名称模式（常规）
	 */
	public static final String PARAM_FILE = "FILE";

	private Set<Pattern> includePatterns;
	private Set<String> includeWildcards;

	private IModelRuntimeShutdownable iModelRuntimeShutdownable = new IModelRuntimeShutdownable() {
		@Override
		public void shutdown() throws Exception {
			onShutdown();
		}
	};

	@Override
	protected void onInit() throws Exception {
		this.syncTaskType = String.format("dedatasyncout.%1$s.%2$s", this.getFullUniqueTag(), "SyncTimer");
		super.onInit();

		if (this.getSysDataSyncAgentRuntime() instanceof ISysFileSyncAgentRuntime) {
			String strConfigFolder = String.format("dedatasync.%1$s", this.getPSDEDataSync().getCodeName()).toLowerCase();
			// 代理是文件同步，启动定时器自行扫描
			if (ObjectUtils.isEmpty(this.getSyncTimerPolicy())) {
				this.syncTimerPolicy = this.getDataEntityRuntime().getSetting().getParam(strConfigFolder + ".timerpolicy", this.getPSDEDataSync().getTimerPolicy());
			}

			String filePattern = JsonUtils.getField(this.getFilterModel(), PARAM_FILE_PATTERN, true, null);
			if (StringUtils.hasLength(filePattern)) {
				String[] parts = filePattern.replace(",", ";").split("[;]");
				this.includePatterns = new HashSet<>();
				for (String part : parts) {
					String trimmed = part.trim();
					if (ObjectUtils.isEmpty(trimmed)) {
						continue;
					}
					try {
						this.includePatterns.add(Pattern.compile(trimmed));
					} catch (Exception e) {
						log.warn(String.format("无效的正则表达式 '%s'，忽略", trimmed), e);
					}
				}
			}

			String file = JsonUtils.getField(this.getFilterModel(), PARAM_FILE, true, null);
			if (StringUtils.hasLength(file)) {
				String[] parts = file.replace(",", ";").split("[;]");
				this.includeWildcards = new HashSet<>();
				for (String part : parts) {
					String trimmed = part.trim();
					if (ObjectUtils.isEmpty(trimmed)) {
						continue;
					}
					this.includeWildcards.add(trimmed);
				}
			}

			// 非实时模式，系统启动时将注册定时器，关闭时注销定时器
			this.getSystemRuntime().registerSystemLoadEventListener(new ISystemEventListener() {
				@Override
				public void receiveEvent(String event, Object[] params) {
					try {
						startSync();
					} catch (Throwable ex) {
						log.error(String.format("启动数据同步发生异常，%1$s", ex.getMessage()), ex);
					}
				}
			});

			this.getSystemRuntime().registerModelRuntimeShutdownable(this.iModelRuntimeShutdownable);
		}
	}

	protected String getSyncTaskType() {
		return this.syncTaskType;
	}

	protected String getSyncTimerPolicy() {
		return this.syncTimerPolicy;
	}

	protected void setSyncTimerPolicy(String syncTimerPolicy) {
		this.syncTimerPolicy = syncTimerPolicy;
	}

	protected void startSync() throws Exception {

		if (syncEnabled) {
			log.warn("同步任务已在运行");
			return;
		}

		if (ObjectUtils.isEmpty(getSyncTimerPolicy())) {
			throw new Exception("未定义同步时间策略");
		}

		if (this.getSysTaskUtilRuntime(true) == null) {
			throw new Exception("系统未提供任务调度组件");
		}

		try {
			syncEnabled = true;

			Map<String, Object> taskTypeParams = new LinkedHashMap<>();
			// taskTypeParams.put(ISysTaskUtilRuntime.TASKTYPEPARAM_LOCAL_EXECUTION,
			// false);
			taskTypeParams.put(ISysTaskUtilRuntime.TASKTYPEPARAM_LOCAL_EXECUTION, false);
			taskTypeParams.put(ISysTaskUtilRuntime.TASKTYPEPARAM_EXECUTOR, new Runnable() {
				@Override
				public void run() {
					try {
						onSyncTimer();
					} catch (Throwable ex) {
						log.error(String.format("数据同步定时处理发生异常：%s", ex.getMessage()), ex);
					}
				}
			});
			taskTypeParams.put(ISysTaskUtilRuntime.TASKTYPEPARAM_RETRYABLE, false);

			// 注册任务类型
			this.getSysTaskUtilRuntime(false).registerTaskType(getSyncTaskType(), taskTypeParams, true);

			String strTimerPolicy = getSyncTimerPolicy();

			// 注册激活
			String strScheduleId = KeyValueUtils.genUniqueId(getSyncTaskType(), strTimerPolicy);

			Map<String, Object> scheduleParams = new LinkedHashMap<>();
			scheduleParams.put(ISysTaskUtilRuntime.SCHEDULEPARAM_ID, strScheduleId);
			scheduleParams.put(ISysTaskUtilRuntime.SCHEDULEPARAM_NAME, strTimerPolicy);
			scheduleParams.put(ISysTaskUtilRuntime.SCHEDULEPARAM_TASK_TYPE, getSyncTaskType());
			scheduleParams.put(ISysTaskUtilRuntime.SCHEDULEPARAM_SCHEDULE_TYPE, ISysTaskUtilRuntime.SCHEDULE_TYPE_CRON);
			scheduleParams.put(ISysTaskUtilRuntime.SCHEDULEPARAM_TIMER_POLICY, strTimerPolicy);

			this.getSysTaskUtilRuntime(false).addSchedule(strScheduleId, scheduleParams, true);
		} catch (Throwable ex) {
			try {
				stopSync();
			} catch (Throwable ignore) {
			}
			throw ex;
		}
	}

	protected void stopSync() throws Exception {
		syncEnabled = false;

		if (ObjectUtils.isEmpty(getSyncTimerPolicy())) {
			return;
		}

		if (this.getSysTaskUtilRuntime(true) == null) {
			return;
		}

		String strTimerPolicy = getSyncTimerPolicy();
		String strScheduleId = KeyValueUtils.genUniqueId(getSyncTaskType(), strTimerPolicy);

		this.getSysTaskUtilRuntime(false).removeSchedule(strScheduleId);
		this.getSysTaskUtilRuntime(false).unregisterTaskType(getSyncTaskType());
	}

	protected void onSyncTimer() {
		if (!syncEnabled)
			return;
		try {
			fetchAndImport();
		} catch (Throwable ex) {
			log.error(String.format("同步定时处理发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void fetchAndImport() throws Throwable {
		if (!(this.getSysDataSyncAgentRuntime() instanceof ISysFileSyncAgentRuntime)) {
			throw new Exception("数据同步代理类型不正确");
		}

		((ISysFileSyncAgentRuntime) this.getSysDataSyncAgentRuntime()).recv(null, this, new HashMap<String, Object>());
	}

	@Override
	protected Object[] getActionArgs(IPSDEAction iPSDEAction, IEntity iEntity, DataSyncIn dataSyncIn) throws Throwable {

		IPSDEActionInput iPSDEActionInput = iPSDEAction.getPSDEActionInput();
		if (iPSDEActionInput == null) {
			throw new ModelException(iPSDEAction, String.format("实体行为[%1$s]没有指定输入对象", iPSDEAction.getName()));
		}

		if (DEMethodInputTypes.KEYFIELD.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.KEYFIELDS.equals(iPSDEActionInput.getType())) {
			String strKey = dataSyncIn.getDataKey();
			if (ObjectUtils.isEmpty(strKey)) {
				throw new Exception("没有指定输入参数");
			}
			String[] items = strKey.trim().replace(",", ";").split("[;]");
			if (DEMethodInputTypes.KEYFIELD.equals(iPSDEActionInput.getType())) {
				if (items.length == 1) {
					Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), (String) strKey);
					return new Object[] { objValue };
				} else {
					List list = new ArrayList();
					for (int i = 0; i < items.length; i++) {
						Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), items[i]);
						list.add(objValue);
					}
					return new Object[] { list };
				}
			}

			if (DEMethodInputTypes.KEYFIELDS.equals(iPSDEActionInput.getType())) {
				List list = new ArrayList();
				for (int i = 0; i < items.length; i++) {
					Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), items[i]);
					list.add(objValue);
				}
				return new Object[] { list };
			}
		}

		if (DEMethodInputTypes.DTO.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.DTOS.equals(iPSDEActionInput.getType())) {
			if (iEntity == null) {
				throw new Exception("没有指定输入参数");
			}

			IEntityDTO iEntityDTO = (IEntityDTO) this.getDataEntityRuntime().getDEMethodDTO(iPSDEActionInput.getPSDEMethodDTOMust(), iEntity.any(), true);
			return new Object[] { iEntityDTO };
		}

		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("无法识别的实体行为输入类型[%1$s][%2$s]", iPSDEAction.getName(), iPSDEActionInput.getType()));

	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime) super.getDataEntityRuntime();
	}

	@Override
	public List<String> filter(String remoteDir, List<String> fileNames, Map<String, Object> params) {
		if (ObjectUtils.isEmpty(fileNames)) {
			return fileNames;
		}

		if (ObjectUtils.isEmpty(this.includePatterns) && ObjectUtils.isEmpty(this.includeWildcards)) {
			return fileNames;
		}

		List<String> filterList = new ArrayList<String>();
		for (String strFileName : fileNames) {
			boolean bAdd = false;
			if (!ObjectUtils.isEmpty(this.includePatterns)) {
				for (Pattern pattern : this.includePatterns) {
					if (pattern.matcher(strFileName).matches()) {
						bAdd = true;
						break;
					}
				}
			}

			if (!bAdd && !ObjectUtils.isEmpty(this.includeWildcards)) {
				for (String strWildcard : this.includeWildcards) {
					if (FilenameUtils.wildcardMatch(strFileName, strWildcard, IOCase.INSENSITIVE)) {
						bAdd = true;
						break;
					}
				}
			}

			if (bAdd) {
				filterList.add(strFileName);
			}
		}

		return filterList;
	}

	@Override
	public void recv(String remotePath, File file, Map<String, Object> params) {
		try {
			onRecv(remotePath, file, params);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("处理输入文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onRecv(String remotePath, File file, Map<String, Object> params) throws Throwable {
		IPSDEDataImport iPSDEDataImport = this.getPSDEDataSync().getPSDEDataImport();
		if (iPSDEDataImport == null) {
			throw new Exception(String.format("未定义数据导入模型对象"));
		}

		IDEDataImportRuntime iDEDataImportRuntime = this.getDataEntityRuntime().getDEDataImportRuntime(iPSDEDataImport);
		iDEDataImportRuntime.importFile(new Entity(), file, false, null, null);

	}

	protected ISysTaskUtilRuntime getSysTaskUtilRuntime(boolean tryMode) throws Exception {
		if (this.sysTaskUtilRuntime == null) {
			this.sysTaskUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysTaskUtilRuntime.class, true);
			if (this.sysTaskUtilRuntime == null) {
				if (tryMode) {
					return null;
				}
				throw new Exception("未指定系统任务功能组件");
			}
		}

		return this.sysTaskUtilRuntime;
	}

	protected void onShutdown() throws Exception {
		stopSync();
	}
}
