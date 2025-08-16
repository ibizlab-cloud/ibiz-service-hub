package net.ibizsys.central.cloud.core.cloudutil;

import java.util.List;

import net.ibizsys.central.cloud.core.util.domain.SysAudit;
import net.ibizsys.central.cloud.core.util.domain.SysEvent;
import net.ibizsys.central.cloud.core.util.domain.SysLog;
import net.ibizsys.central.cloud.core.util.domain.SysPO;
import net.ibizsys.runtime.util.domain.Log;

/**
 * Cloud体系日志功能运行时对象接口
 * @author lionlau
 *
 */
public interface ICloudLogUtilRuntime extends ICloudUtilRuntime{

	/**
	 * Console信息发送插件前缀
	 */
	public final static String ADDIN_CONSOLESENDER_PREFIX = "CONSOLESENDER:";
	
	/**
	 * 常规日志 
	 * @param sysLog
	 */
	void log(SysLog sysLog);
	
	
	
	/**
	 * 日志审计信息
	 * @param sysAudit
	 */
	void logAudit(SysAudit sysAudit);
	
	
	
	/**
	 * 日志系统事件
	 * @param sysEvent
	 */
	void logEvent(SysEvent sysEvent);
	
	
	
	/**
	 * 日志性能记录
	 * @param sysEvent
	 */
	void logPO(SysPO sysPO);
	
	
	
	/**
	 * 批量日志（通用日志对象）
	 * @param list
	 */
	void log(List<Log> list);
	
	
	/**
	 * 控制台日志（通用日志对象）
	 * @param list
	 */
	void sendConsoleMessages(List<Log> list);
}
