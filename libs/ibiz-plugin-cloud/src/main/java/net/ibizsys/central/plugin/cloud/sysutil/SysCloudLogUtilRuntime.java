package net.ibizsys.central.plugin.cloud.sysutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemLogListener;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.CloudSysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.runtime.util.ConsoleUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.Log;

/**
 * 系统日志侦听器组件运行时对象
 * @author lionlau
 *
 */
public class SysCloudLogUtilRuntime extends CloudSysUtilRuntimeBase implements ISysCloudLogUtilRuntime, ISystemLogListener {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysCloudLogUtilRuntime.class);
	
	private ConcurrentLinkedQueue<Log> logList = new ConcurrentLinkedQueue<Log>();
	
	
	@Override
	protected void onInit() throws Exception {
	
		super.onInit();
		
		this.getSystemRuntime().registerSystemLogListener(this);
		
	}
	
	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
		for(int i =0;i<10;i++) {
			runLogTimer(i+"");
		}
	}

	protected void runLogTimer() {
		runLogTimer(false,"");
	}
	protected void runLogTimer(String timerTag) {
		runLogTimer(false,timerTag);
	}

	protected void runLogTimer(boolean bTimerOnly,String timerTag) {
		if(!bTimerOnly) {
			try {
				onLogTimer();
			} catch (Throwable ex) {
				log.error(String.format("Cloud日志[%1$s]定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
				//getSystemRuntime().log(LogLevels.ERROR, "外部服务接口", String.format("外部服务接口[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}
		
		
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runLogTimer(false,timerTag);
			}
		}, System.currentTimeMillis() + 5000, String.format("CloudLogTimer_%1$s_%2$s",this.getId(),timerTag));
	}
	
	
	protected void onLogTimer() {
		List<Log> list = new ArrayList<Log>();
		int nCount = 100;
		while(nCount>0) {
			nCount --;
			Log log = logList.poll();
			if(log == null) {
				break;
			}
			list.add(log);
		}
		if(list.size() == 0) {
			return;
		}
		String strUrl = "/log";
		try {
			this.getWebClient().post(strUrl, null, null, null, list, null, String.class, null);
		} catch (Throwable ex) {
			log.error(String.format("Cloud日志[%1$s]日志发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	

	@Override
	public void log(Log log) {
		this.onLog(log);
	}
	
	protected void onLog(Log log) {
		logList.add(log);
	}
	
	protected IWebClient getWebClient() {
		//如果是单体模式可考虑优化获取自身Cloud功能
		return this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_LOG);
	}

	@Override
	public void logs(List<Log> list) {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		if(iEmployeeContext!=null){
			for(Log log : list) {
				log.set("dcsystemid", iEmployeeContext.getDcsystemid());
			}
		}
				
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				onLog(list);
			}
		});
	}
	
	protected void onLog(List<Log> list) {
		String strUrl = "/log";
		try {
			this.getWebClient().post(strUrl, null, null, null, list, null, String.class, null);
		} catch (Throwable ex) {
			log.error(String.format("Cloud日志[%1$s]日志发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}

	@Override
	public void sendConsoleMessages(List<Log> list) {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		if(iEmployeeContext!=null){
			for(Log log : list) {
				log.set("dcsystemid", iEmployeeContext.getDcsystemid());
			}
		}
			
		
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				onSendConsoleMessages(list);
			}
		});
	}
	
	protected void onSendConsoleMessages(List<Log> list) {
		String strUrl = "/console";
		try {
			this.getWebClient().post(strUrl, null, null, null, list, null, String.class, null);
		} catch (Throwable ex) {
			log.error(String.format("Cloud日志[%1$s]发送控制台信息发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}

	
	@Override
	public void sendConsoleMessage(String strConsoleId, String strConsoleSender, boolean bAppendTime, int nLogLevel, String strLogCat, String strInfo) {
		this.sendConsoleMessage(strConsoleId, strConsoleSender, bAppendTime, nLogLevel, strLogCat, strInfo, null);
	}
	
	@Override
	public void sendConsoleMessage(String strConsoleId, String strConsoleSender, String strInfo) {
		this.sendConsoleMessage(strConsoleId, strConsoleSender, strInfo, null);
	}
	
	@Override
	public void sendConsoleMessage(String strConsoleId, String strConsoleSender, String strLogInfo, String strData) {
		//Assert.hasLength(strConsoleId, "未传入控制台标识");
//		if(!StringUtils.hasLength(strConsoleId)) {
//			return;
//		}
		Log log = new Log();
		log.setConsoleId(strConsoleId);
		log.setConsoleSender(strConsoleSender);
		log.setConsoleInfo(strLogInfo);
		log.setData(strData);
		this.sendConsoleMessages(Arrays.asList(log));
	}
	
	@Override
	public void sendConsoleCommand(String strConsoleId, String strCommandSubType, String strInfo) {
		Log log = new Log();
		log.setConsoleId(strConsoleId);
		log.setConsoleType(CONSOLETYPE_COMMAND);
		log.setConsoleSender(strCommandSubType);
		log.setConsoleInfo(strInfo);
		this.sendConsoleMessages(Arrays.asList(log));
	}

	@Override
	public void sendConsoleMessage(String strConsoleId, String strConsoleSender, boolean bAppendTime, int nLogLevel, String strLogCat, String strLogInfo, String strData) {
		//Assert.hasLength(strConsoleId, "未传入控制台标识");
//		if(!StringUtils.hasLength(strConsoleId)) {
//			return;
//		}
		
		StringBuilder sb = new StringBuilder();
		if(bAppendTime) {
			sb.append(String.format("%1$tm-%1$td %1$tH:%1$tM:%1$tS ", new java.util.Date()));
		}
		
		switch(nLogLevel) {
		case LogLevels.INFO:
			sb.append("INFO ");
			break;
		case LogLevels.DEBUG:
			sb.append("DEBUG ");
			break;
		case LogLevels.ERROR:
			sb.append("ERROR ");
			break;
		case LogLevels.FATAL:
			sb.append("FATAL ");
			break;
		case LogLevels.TRACE:
			sb.append("TRACE ");
			break;
		case LogLevels.WARN:
			sb.append("WARN ");
			break;
		}
		
		if(StringUtils.hasLength(strLogCat)) {
			sb.append(String.format("[%1$s] ", strLogCat));
		}
		if(StringUtils.hasLength(strLogInfo)) {
			sb.append(strLogInfo);
		}
		
		switch(nLogLevel) {
		case LogLevels.ERROR:
		case LogLevels.FATAL:
			sendConsoleMessage(strConsoleId, strConsoleSender, ConsoleUtils.getErrorContent(sb.toString()), strData);
			break;
		case LogLevels.WARN:
			sendConsoleMessage(strConsoleId, strConsoleSender, ConsoleUtils.getWarnContent(sb.toString()), strData);
			break;
		case LogLevels.TRACE:
		case LogLevels.INFO:
		case LogLevels.DEBUG:
		default:
			sendConsoleMessage(strConsoleId, strConsoleSender, sb.toString(), strData);
			break;
		}
		
	}
	
	
	
	
}
