package net.ibizsys.central;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.domain.Log;
import net.ibizsys.runtime.util.domain.LogTypes;

public class DefaultSystemLogAdapter extends SimpleSystemLogAdapter implements ISystemLogListenerProxy, IModelRuntimeShutdownable{

	private static final org.apache.commons.logging.Log logger = LogFactory.getLog(DefaultSystemLogAdapter.class);
	
	/**
	 * 运行时日志对象表名称
	 */
	public final static String RTLOG_TABLENAME = "_rt_log";
	
	/**
	 * 运行时日志（审计）对象表名称
	 */
	public final static String RTAUDITLOG_TABLENAME = "_rt_auditlog";
	
	
	/**
	 * 运行时日志（系统事件）对象表名称
	 */
	public final static String RTEVENTLOG_TABLENAME = "_rt_eventlog";
	
	
	/**
	 * 运行时日志（性能检测）对象表名称
	 */
	public final static String RTPOLOG_TABLENAME = "_rt_polog";
	
	
	private List<ISystemLogListener> systemLogListenerList = null;
	
	private ConcurrentLinkedQueue<Log> logList = new ConcurrentLinkedQueue<Log>();
	private boolean bLogThreadRun = false;
	
	private boolean bEnableBDSchemeLog = false;
	
	
	@Override
	protected void onInit() throws Exception {
		this.getSystemRuntime().registerModelRuntimeShutdownable(this);
		super.onInit();
		startLogThread();
		
	}
	
	protected void startLogThread() {
		
		setLogThreadRun(true);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				runLogThread();
			}
		}).start();
	}
	
	
	@Override
	public synchronized void registerSystemLogListener(ISystemLogListener iSystemLogListener) {
		List<ISystemLogListener> list =  getSystemLogListenerList();
		List<ISystemLogListener> newList = new ArrayList<ISystemLogListener>();
		if(list != null) {
			newList.addAll(list);
		}
		newList.add(iSystemLogListener);
		this.setSystemLogListenerList(newList);
	}

	@Override
	public synchronized void unregisterSystemLogListener(ISystemLogListener iSystemLogListener) {
		List<ISystemLogListener> list =  getSystemLogListenerList();
		if(list == null) {
			return ;
		}
		List<ISystemLogListener> newList = new ArrayList<ISystemLogListener>();
		newList.addAll(list);
		newList.remove(iSystemLogListener);
		if(newList.size() == 0) {
			this.setSystemLogListenerList(null);
		}
		else {
			this.setSystemLogListenerList(newList);
		}
	}
	
	protected List<ISystemLogListener> getSystemLogListenerList(){
		return this.systemLogListenerList;
	}
	
	protected void setSystemLogListenerList(List<ISystemLogListener> systemLogListenerList) {
		this.systemLogListenerList = systemLogListenerList;
	}

	protected ISysBDSchemeRuntime getSysBDSchemeRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime().getDefaultSysBDSchemeRuntime();
	}
	
	
	@Override
	public void log(int nLogLevel, String strCat, String strInfo, Object objData) {
		super.log(nLogLevel, strCat, strInfo, objData);
		
		Log log = new Log();
		if(objData instanceof Log) {
			Log data = (Log)objData;
			data.copyTo(log);
		}
	//	log.setSystemId(systemId);
		log.setLogType(LogTypes.NORMAL);
		log.setLogTime(new java.sql.Timestamp(System.currentTimeMillis()));
		log.setLogLevel(nLogLevel);
		log.setLogCat(strCat);
		log.setInfo(strInfo);
		this.appendLogList(log, objData);
	}

	@Override
	public void logAudit(int nLogLevel, String strCat, String strInfo, String strPersonId, String strAddress, Object objData) {
		super.logAudit(nLogLevel, strCat, strInfo, strPersonId, strAddress, objData);
		
		Log log = new Log();
		if(objData instanceof Log) {
			Log data = (Log)objData;
			data.copyTo(log);
		}
		log.setLogType(LogTypes.AUDIT);
		log.setLogTime(new java.sql.Timestamp(System.currentTimeMillis()));
		log.setLogLevel(nLogLevel);
		log.setLogCat(strCat);
		log.setInfo(strInfo);
		log.setUserId(strPersonId);
		log.setRemoteAddress(strAddress);
		IUserContext iUserContext = ActionSessionManager.getUserContext();
		if(iUserContext != null) {
			log.setTenant(iUserContext.getTenant());
			log.setOrgId(iUserContext.getOrgid());
			log.setDeptId(iUserContext.getDeptid());
		}
		
		this.appendLogList(log, objData);
		
	}

	@Override
	public void logEvent(int nLogLevel, String strCat, String strInfo, Object objData) {
		super.logEvent(nLogLevel, strCat, strInfo, objData);
		
		Log log = new Log();
		if(objData instanceof Log) {
			Log data = (Log)objData;
			data.copyTo(log);
		}
		log.setLogType(LogTypes.EVENT);
		log.setLogTime(new java.sql.Timestamp(System.currentTimeMillis()));
		log.setLogLevel(nLogLevel);
		log.setLogCat(strCat);
		log.setInfo(strInfo);
		this.appendLogList(log, objData);
	}

	@Override
	public void logPO(int nLogLevel, String strCat, String strInfo, String strDEName, String strAction, long nTime, Object objData) {
		super.logPO(nLogLevel, strCat, strInfo, strDEName, strAction, nTime, objData);
		
		Log log = new Log();
		if(objData instanceof Log) {
			Log data = (Log)objData;
			data.copyTo(log);
		}
		log.setLogType(LogTypes.PO);
		log.setLogTime(new java.sql.Timestamp(System.currentTimeMillis()));
		log.setLogLevel(nLogLevel);
		log.setLogCat(strCat);
		log.setInfo(strInfo);
		log.setActionOwner(strDEName);
		log.setAction(strAction);
		log.setActionDuration((int)nTime);
		this.appendLogList(log, objData);
	}
	
	
	protected void appendLogList(Log log, Object objData) {
		if(this.isLogThreadRun()) {
//			synchronized (this.logList) {
//				this.logList.add(log);
//			}
			this.logList.add(log);
		}
		
		
	}
	
	protected boolean isLogThreadRun() {
		return this.bLogThreadRun;
	}
	
	protected void setLogThreadRun(boolean bLogThreadRun) {
		this.bLogThreadRun = bLogThreadRun;
	}

	
	protected void runLogThread() {
		while(isLogThreadRun()) {
			Log log = this.logList.poll();
			if(log != null) {
				onThreadLog(log);
			}
			else {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					setLogThreadRun(false);
					logger.error(e);
					break;
				}
			}
				
		}
	}
	
	protected void onThreadLog(Log log) {
		
		if(isEnableBDSchemeLog()) {
			//后续大数据要修改为时间差批存盘（优化性能）
			ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime();
			if(iSysBDSchemeRuntime != null) {
				try {
					if(log.any() != null) {
						String strLogType = log.getLogType();
						if(LogTypes.AUDIT.equals(strLogType)) {
							iSysBDSchemeRuntime.insert(RTAUDITLOG_TABLENAME, log.any(), null);
						}
						else
							if(LogTypes.EVENT.equals(strLogType)) {
								iSysBDSchemeRuntime.insert(RTEVENTLOG_TABLENAME, log.any(), null);
							}
							else
								if(LogTypes.PO.equals(strLogType)) {
									iSysBDSchemeRuntime.insert(RTPOLOG_TABLENAME, log.any(), null);
								}
								else{
										iSysBDSchemeRuntime.insert(RTLOG_TABLENAME, log.any(), null);
									}
					}
				}
				catch(Throwable ex) {
					logger.debug(String.format("存储大数据日志发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		
		
		List<ISystemLogListener> list =  getSystemLogListenerList();
		if(list != null) {
			for(ISystemLogListener iSystemLogListener : list) {
				try {
					iSystemLogListener.log(log);
				}
				catch(Throwable ex) {
					logger.debug(String.format("日志侦听对象日志发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
	}
	
	public void setEnableBDSchemeLog(boolean bEnableBDSchemeLog) {
		this.bEnableBDSchemeLog = bEnableBDSchemeLog;
	}
	
	public boolean isEnableBDSchemeLog() {
		return this.bEnableBDSchemeLog;
	}

	@Override
	public void shutdown() throws Exception {
		try {
			this.setLogThreadRun(false);
			this.logList.clear();
		}
		catch (Throwable ex) {
			logger.error(ex);
		}
		
		if(!ObjectUtils.isEmpty(this.systemLogListenerList)) {
			this.systemLogListenerList.clear();
			this.systemLogListenerList = null;
		}
	}
	
}
