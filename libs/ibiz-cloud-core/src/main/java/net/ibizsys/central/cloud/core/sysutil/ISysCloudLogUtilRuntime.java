package net.ibizsys.central.cloud.core.sysutil;

import java.util.List;

import net.ibizsys.central.sysutil.ISysUtilRuntime;

/**
 * 系统云端日志功能组件运行时接口
 * @author lionlau
 *
 */
public interface ISysCloudLogUtilRuntime extends ISysUtilRuntime,ISysUtilContainerOnly{

	/**
	 * 控制台类型：命令
	 */
	public final static String CONSOLETYPE_COMMAND = "COMMAND";
	
	/**
	 * 控制台类型：信息
	 */
	public final static String CONSOLETYPE_CONSOLE = "CONSOLE";
	
	
	/**
	 * 进行常规日志操作
	 * @param list
	 */
	void logs(List<net.ibizsys.runtime.util.domain.Log> list);
	 
	 
	
	/**
	 * 发送控制台信息
	 * @param list
	 */
	void sendConsoleMessages(List<net.ibizsys.runtime.util.domain.Log> list);
	 
	
	/**
	 * 发送控制台信息
	 * @param strConsoleId
	 * @param strConsoleSender
	 * @param strInfo
	 */
	void sendConsoleMessage(String strConsoleId, String strConsoleSender, String strInfo);
	
	
	/**
	 * 发送控制台命令
	 * @param strConsoleId
	 * @param strConsoleSender
	 * @param strInfo
	 */
	void sendConsoleCommand(String strConsoleId, String strCommandSubType, String strInfo);
	
	
	/**
	 * 发送控制台信息
	 * @param strConsoleId
	 * @param strConsoleSender
	 * @param bAppendTime
	 * @param nLogLevel
	 * @param strInfo
	 */
	void sendConsoleMessage(String strConsoleId, String strConsoleSender, boolean bAppendTime, int nLogLevel, String strLogCat, String strInfo);
	
	
	/**
	 * 发送控制台信息
	 * @param strConsoleId
	 * @param strConsoleSender
	 * @param strInfo
	 * @param strData 
	 */
	void sendConsoleMessage(String strConsoleId, String strConsoleSender, String strInfo, String strData);
	
	
	/**
	 * 发送控制台信息
	 * @param strConsoleId
	 * @param strConsoleSender
	 * @param bAppendTime
	 * @param nLogLevel
	 * @param strInfo
	 * @param strData
	 */
	void sendConsoleMessage(String strConsoleId, String strConsoleSender, boolean bAppendTime, int nLogLevel, String strLogCat, String strInfo, String strData);
}
