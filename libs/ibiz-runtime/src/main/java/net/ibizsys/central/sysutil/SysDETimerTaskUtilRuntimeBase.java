package net.ibizsys.central.sysutil;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogLevels;

public abstract class SysDETimerTaskUtilRuntimeBase extends SysUtilRuntimeBase implements ISysDETimerTaskUtilRuntime {

	private IDataEntityRuntime taskDataEntityRuntime = null;
	private IDataEntityRuntime logDataEntityRuntime = null;
	
	
	private ISysUniStateUtilRuntime iSysUniStateUtilRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		if (this.getTaskDataEntityRuntime(true) == null) {
			prepareTaskDataEntityRuntime();
		}
		
		if (this.getLogDataEntityRuntime(true) == null) {
			prepareLogDataEntityRuntime();
		}
		
		super.onInit();
	}
	
	@Override
	protected void onInstall() throws Exception {
		
		super.onInstall();

		// 获取系统的功能选举对象
		if (this.getSysUniStateUtilRuntime(true) == null) {
			this.prepareSysUniStateUtilRuntime();
			if (this.getSysUniStateUtilRuntime(true) == null) {
				this.getSystemRuntime().log(LogLevels.WARN, SysDETimerTaskUtilRuntimeBase.class.getName(), String.format("系统未配置统一状态组件，多节点运行会出现重复调度问题"), null);
			}
		}
	}

	@Override
	protected void onUninstall() throws Throwable {
		
		super.onUninstall();
	}
	
	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime() {
		return getSysUniStateUtilRuntime(false);
	}

	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime(boolean bTryMode) {
		if (this.iSysUniStateUtilRuntime != null || bTryMode) {
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
	
	protected void prepareTaskDataEntityRuntime() throws Exception {
		if (this.getPSSysUtil().getUtilPSDE() != null) {
			IDataEntityRuntime taskDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSSysUtil().getUtilPSDE().getId());
			this.setTaskDataEntityRuntime(taskDataEntityRuntime);
		}
	}
	
	protected IDataEntityRuntime getTaskDataEntityRuntime(boolean bTryMode) throws Exception {
		if (this.taskDataEntityRuntime != null || bTryMode) {
			return this.taskDataEntityRuntime;
		}
		throw new Exception("任务实体运行时对象无效");
	}

	protected void setTaskDataEntityRuntime(IDataEntityRuntime logDataEntityRuntime) {
		this.logDataEntityRuntime = logDataEntityRuntime;
	}
	
	
	protected void prepareLogDataEntityRuntime() throws Exception {
		if (this.getPSSysUtil().getUtilPSDE2() != null) {
			IDataEntityRuntime logDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSSysUtil().getUtilPSDE2().getId());
			this.setLogDataEntityRuntime(logDataEntityRuntime);
		}
	}
	
	protected IDataEntityRuntime getLogDataEntityRuntime(boolean bTryMode) throws Exception {
		if (this.logDataEntityRuntime != null || bTryMode) {
			return this.logDataEntityRuntime;
		}
		throw new Exception("日志实体运行时对象无效");
	}

	protected void setLogDataEntityRuntime(IDataEntityRuntime logDataEntityRuntime) {
		this.logDataEntityRuntime = logDataEntityRuntime;
	}

	
}
