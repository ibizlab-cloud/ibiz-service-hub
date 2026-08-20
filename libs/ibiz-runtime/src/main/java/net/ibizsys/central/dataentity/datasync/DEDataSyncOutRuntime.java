package net.ibizsys.central.dataentity.datasync;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.data.domain.PageImpl;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.eai.ISysFileSyncAgentRuntime;
import net.ibizsys.central.sysutil.ISysTaskUtilRuntime;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.central.util.domain.ExportDataResult;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.ISystemEventListener;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.KeyValueUtils;

public class DEDataSyncOutRuntime extends net.ibizsys.runtime.dataentity.datasync.DEDataSyncOutRuntime implements IDEDataSyncOutRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataSyncOutRuntime.class);
	private ISysTaskUtilRuntime sysTaskUtilRuntime = null;
	private volatile boolean syncEnabled = false;
	private String syncTaskType = null;
	private String syncTimerPolicy = null;

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

		if (!this.isRealTimeMode()) {
			String strConfigFolder = String.format("dedatasync.%1$s", this.getPSDEDataSync().getCodeName()).toLowerCase();
			//代理是文件同步，启动定时器自行扫描
			if (ObjectUtils.isEmpty(this.getSyncTimerPolicy())) {
				this.syncTimerPolicy = this.getDataEntityRuntime().getSetting().getParam(strConfigFolder + ".timerpolicy", this.getPSDEDataSync().getTimerPolicy());
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

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime) super.getDataEntityRuntime();
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
			//taskTypeParams.put(ISysTaskUtilRuntime.TASKTYPEPARAM_LOCAL_EXECUTION, false);
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
		}
		catch (Throwable ex) {
			try {
				stopSync();
			}
			catch (Throwable ignore) {
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
			fetchAndExport();
		} catch (Throwable ex) {
			log.error(String.format("同步定时处理发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void fetchAndExport() throws Throwable {
//		if (this.getPSDEDataSync().getOutPSDEDataSet() == null) {
//			throw new Exception("未定义输出数据集");
//		}

		if (this.getPSDEDataSync().getPSDEDataExport() == null) {
			throw new Exception("未定义数据导出处理");
		}

		if (!(this.getSysDataSyncAgentRuntime() instanceof ISysFileSyncAgentRuntime)) {
			throw new Exception("数据同步代理类型不正确");
		}
		
		ISysFileSyncAgentRuntime iSysFileSyncAgentRuntime = (ISysFileSyncAgentRuntime)this.getSysDataSyncAgentRuntime();

		Object ret = fetchDEDataSet();
		
		// 生成临时文件

		File tempFile = getExportFile();
		String strTargetFilePath = null;

		try (FileOutputStream fos = new FileOutputStream(tempFile)) {
			ExportDataResult result = this.getDataEntityRuntime().exportData2(this.getPSDEDataSync().getPSDEDataExport().getCodeName(), ret, fos);
			if(StringUtils.hasLength(result.getFileName())) {
				//重新生成文件
				strTargetFilePath = getTargetFilePath(iSysFileSyncAgentRuntime.getTargetDir(), result.getFileName());
			}
		} catch (Throwable ex) {
			throw new Exception(String.format("导出数据发生异常，%1$s", ex.getMessage()));
		}

		// 发送
		try {
			this.send(strTargetFilePath, tempFile, new HashMap<String, Object>());
		}
		finally {
			if (tempFile != null && tempFile.exists()) {
		        tempFile.delete();
		    }
		}
		
	}
	
	protected Object fetchDEDataSet() throws Throwable{
		if(this.getPSDEDataSync().getOutPSDEDataSet()!=null) {
			ISearchContextDTO iSearchContextDTO = new SearchContextDTO().all();
			return this.getDataEntityRuntime().fetchDataSet(this.getPSDEDataSync().getOutPSDEDataSet().getName(), this.getPSDEDataSync().getOutPSDEDataSet(), new Object[] { iSearchContextDTO });
		}
		else {
			return new PageImpl(new ArrayList());
		}
	}
	
	protected String getTargetFilePath(String strTargetDir, String strFileName ) {
		String strTargetFilePath = strTargetDir;
		if(StringUtils.hasLength(strTargetFilePath)) {
			if(strTargetFilePath.lastIndexOf("/") != (strTargetFilePath.length() - 1)) {
				strTargetFilePath += "/";
			}
			strTargetFilePath +=  strFileName;
		}
		else {
			strTargetFilePath = strFileName;
		}
		return strTargetFilePath;
	}

	protected File getExportFile() throws Exception {
		String strFileExt = this.getPSDEDataSync().getPSDEDataExport().getContentType();
		if (!StringUtils.hasLength(strFileExt)) {
			strFileExt = "xlsx";
		}
		File tempFile = File.createTempFile("dataexport", "." + strFileExt.toLowerCase());
		return tempFile;
	}

	@Override
	public void send(String remotePath, File file, Map<String, Object> params) {
		Assert.notNull(file, "传入文件无效");

		try {

			if (!file.exists() || !file.isFile()) {
				throw new Exception(String.format("发送文件[%1$s]无效", file.getCanonicalPath()));
			}

			this.onSend(remotePath, file, params);

		} catch (Throwable ex) {
			if (ex instanceof ISystemRuntimeException) {
				throw (RuntimeException) ex;
			}

			log.error(String.format("发送文件发生异常，%1$s", ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("发送文件发生异常，%1$s", ex.getMessage()), ex);
		}

	}

	protected void onSend(String remotePath, File file, Map<String, Object> params) throws Throwable {
		((ISysFileSyncAgentRuntime) this.getSysDataSyncAgentRuntime()).send(remotePath, file, new HashMap<String, Object>());
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
