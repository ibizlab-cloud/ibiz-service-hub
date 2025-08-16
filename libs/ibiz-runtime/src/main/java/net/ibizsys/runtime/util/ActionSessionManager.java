package net.ibizsys.runtime.util;

import java.util.concurrent.TimeUnit;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;

/**
 * 服务操作会话管理类
 * 
 * @author lionlau
 *
 */
public class ActionSessionManager {
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ActionSessionManager.class);
	
	private static ThreadLocal<ActionSession> actionSession = new ThreadLocal<ActionSession>();
	
	private static ThreadLocal<StringBuilder> actionInfoBuilder = new ThreadLocal<StringBuilder>();
	
	private static ThreadLocal<MultiValueMap<String, String>> headers = new ThreadLocal<MultiValueMap<String, String>>();
	
	
	
	private static ITransactionalUtil iTransactionalUtil = null;
	private static IInterProcessMutexUtil iInterProcessMutexUtil = null;
	private static int nLogPOTime = 200; 
	private static int nReportLogPOTime = 30000;
	private static int nImportDataLogPOTime = 30000;
	private static int nExportDataLogPOTime = 30000;

	/**
	 * 设置事务辅助对象
	 * @param iTransactionalUtil
	 */
	public static void setTransactionalUtil(ITransactionalUtil iTransactionalUtil) {
		ActionSessionManager.iTransactionalUtil = iTransactionalUtil;
	}
	
	/**
	 * 获取事务功能对象
	 * @return
	 */
	public static ITransactionalUtil getTransactionalUtil() {
		return ActionSessionManager.iTransactionalUtil;
	}
	
	/**
	 * 设置Cloud事务辅助对象
	 * @param iInterProcessMutexUtil
	 */
	public static void setInterProcessMutexUtil(IInterProcessMutexUtil iInterProcessMutexUtil) {
		ActionSessionManager.iInterProcessMutexUtil = iInterProcessMutexUtil;
	}
	
	/**
	 * 获取Cloud事务功能对象
	 * @return
	 */
	public static IInterProcessMutexUtil getInterProcessMutexUtil() {
		return ActionSessionManager.iInterProcessMutexUtil;
	}
	
	

	/**
	 * 获取默认性能日志时间间隔
	 * @return
	 */
	public static int getLogPOTime() {
		return ActionSessionManager.nLogPOTime;
	}
	
	/**
	 * 设置默认性能日志时间间隔
	 * @param nLogPOTime
	 */
	public static void setLogPOTime(int nLogPOTime) {
		ActionSessionManager.nLogPOTime = nLogPOTime;
	}
	
	/**
	 * 获取报表性能日志时间间隔
	 * @return
	 */
	public static int getReportLogPOTime() {
		return ActionSessionManager.nReportLogPOTime;
	}
	
	/**
	 * 设置报表性能日志时间间隔
	 * @param nReportLogPOTime
	 */
	public static void setReportLogPOTime(int nReportLogPOTime) {
		ActionSessionManager.nReportLogPOTime = nReportLogPOTime;
	}
	
	/**
	 * 获取导入数据性能日志时间间隔
	 * @return
	 */
	public static int getImportDataLogPOTime() {
		return ActionSessionManager.nImportDataLogPOTime;
	}
	
	/**
	 * 设置导入数据日志时间间隔
	 * @param nImportDataLogPOTime
	 */
	public static void setImportDataLogPOTime(int nImportDataLogPOTime) {
		ActionSessionManager.nImportDataLogPOTime = nImportDataLogPOTime;
	}
	
	
	/**
	 * 获取导出数据性能日志时间间隔
	 * @return
	 */
	public static int getExportDataLogPOTime() {
		return ActionSessionManager.nExportDataLogPOTime;
	}
	
	/**
	 * 设置导出数据日志时间间隔
	 * @param nExportDataLogPOTime
	 */
	public static void setExportDataLogPOTime(int nExportDataLogPOTime) {
		ActionSessionManager.nExportDataLogPOTime = nExportDataLogPOTime;
	}
	
	
	
	/**
	 * 打开会话
	 * 
	 * @return
	 */
	static public ActionSession openSession() {
		return openSession("DEFAULT");
	}

	/**
	 * 打开新会话
	 * @strName 会话名称
	 * @return
	 */
	static public ActionSession openSession(String strName) {
		ActionSession currentSession = actionSession.get();
		if (currentSession == null) {
			currentSession = new ActionSession();
			currentSession.setName(strName);
			actionSession.set(currentSession);
		}
		return currentSession;
	}
	
	
//	/**
//	 * 打开新会话
//	 * @strName 会话名称
//	 * @bTopSession true 只打开顶级，如果顶级操作会话已经存在，则直接返回顶级会话，false，如顶级操作会话已经存在，则创建子会话
//	 * @return
//	 */
//	static public ActionSession openSession(String strName,boolean bTopSession) {
//		ActionSession currentSession = actionSession.get();
//		if(currentSession!=null ){
//			if(bTopSession)
//				return currentSession;
//			return currentSession.openChildSession(strName);
//		}
//			
//		currentSession = new ActionSession();
//		currentSession.setName(strName);
//		actionSession.set(currentSession);
//		return currentSession;
//	}

//	/**
//	 * 关闭当前会话
//	 * @return
//	 */
//	static public void closeSession() {
//		closeSession(true);
//	}
	
	/**
	 * 关闭当前会话
	 * @param bCommit 是否提交
	 * @return
	 */
	static public void closeSession(boolean bCommit) {
		ActionSession currentSession = actionSession.get();
		if(currentSession != null) {
			currentSession.close(bCommit);
			actionSession.set(null);
		}
		
	}
	


	/**
	 * 获取当前会话
	 * 
	 * @return
	 */
	static public ActionSession getCurrentSession() {
		ActionSession actionSession2 = actionSession.get();
		if(actionSession2!=null)
			//return actionSession2.getCurrentSession();
			return actionSession2;
		return null;
	}
	
	/**
	 * 获取当前会话，必须存在
	 * 
	 * @return
	 */
	static public ActionSession getCurrentSessionMust() {
		ActionSession actionSession2 = getCurrentSession();
		if(actionSession2==null) {
			throw new RuntimeException("当前操作会话无效"); 
		}	
		return actionSession2;
	}

	/**
	 * 获取当前会话
	 * 
	 * @param bCreateIfNotExists 不存在时建立
	 * @return
	 */
	static public ActionSession getCurrentSession(boolean bCreateIfNotExists) {
		ActionSession actionSession2 = actionSession.get();
		if (actionSession2 == null && bCreateIfNotExists) {
			return openSession();
		}
		return actionSession2;
//		if(actionSession2==null)
//			return null;
//		return actionSession2.getCurrentSession();
	}

	/**
	 * 附加当前操作信息
	 * 
	 * @param strInfo
	 */
	public static void appendActionInfo(String strInfo) {
		StringBuilder stringBuilder = getActionInfoBuilder();
		if(stringBuilder != null) {
			stringBuilder.append(strInfo);
		}
//		if (getCurrentSession() == null) {
//			return;
//		}
//		getCurrentSession().appendActionInfo(strInfo);
	}

	/**
	 * 获取当前操作信息
	 * 
	 * @param strInfo
	 */
	public static String getActionInfo() {
		StringBuilder stringBuilder = getActionInfoBuilder();
		if(stringBuilder != null) {
			return stringBuilder.toString();
		}
		
		return null;
	}
	
	
	/**
	 * 获取当前的用户上下文
	 * @return
	 */
	public static IUserContext getUserContext() {
		if(getCurrentSession()!=null) {
			return getCurrentSession().getUserContext();
		}
		return UserContext.getCurrent();
	}
	
	/**
	 * 获取当前用户上下文（必须存在）
	 * @return
	 */
	public static IUserContext getUserContextMust() {
		IUserContext iUserContext = getUserContext();
		if(iUserContext == null) {
			throw new RuntimeException("用户上下文对象无效");
		}
		return iUserContext;
	}
	
	/**
	 * 获取当前的应用上下文
	 * @return
	 */
	public static IAppContext getAppContext() {
		if(getCurrentSession()!=null) {
			return getCurrentSession().getAppContext();
		}
		if(UserContext.getCurrent() != null) {
			return UserContext.getCurrent().getAppContext();
		}
		return null;
	}
	
	/**
	 * 获取当前的应用上下文（没有则建立）
	 * @return
	 */
	public static IAppContext getAppContextIf() {
		IAppContext iAppContext = getAppContext();
		if(iAppContext == null) {
			iAppContext = AppContext.newInstance(null);
			getCurrentSessionMust().setAppContext(iAppContext);
		}
		return iAppContext;
	}
	
	
	/**
	 * 获取当前应用上下文（必须存在）
	 * @return
	 */
	public static IAppContext getAppContextMust() {
		IAppContext iAppContext = getAppContext();
		if(iAppContext == null) {
			throw new RuntimeException("应用上下文对象无效");
		}
		return iAppContext;
	}
	
	
	/**
	 * 获取当前的Web上下文
	 * @return
	 */
	public static IWebContext getWebContext() {
		if(UserContext.getCurrent() != null) {
			return UserContext.getCurrent().getWebContext();
		}
		return null;
	}
	

	
	/**
	 * 获取当前Web上下文（必须存在）
	 * @return
	 */
	public static IWebContext getWebContextMust() {
		IWebContext  iWebContext = getWebContext();
		if(iWebContext == null) {
			throw new RuntimeException("Web上下文对象无效");
		}
		return iWebContext;
	}
	
	
	/**
	 * 执行事务控制行为
	 * @param iAction
	 * @param args
	 * @param nPropagation 事务控制模式
	 * @return
	 * @throws Throwable
	 */
	public static Object execute(IAction iAction, Object[] args, int nPropagation) throws Throwable{
		boolean bOpenActionSession = (ActionSessionManager.getCurrentSession() == null);
		
		boolean bCommit = true;
		try {
			return ActionSessionManager.openSession().execute(null, iAction, args, nPropagation);
		}
		catch (Throwable ex) {
			bCommit = false;
			throw ex;
		}
		finally {
			if (bOpenActionSession) {
				ActionSessionManager.closeSession(bCommit);
			}
		}
	}
	
	/**
	 * 执行Cloud事务处理
	 * @param iAction
	 * @param args
	 * @param strInterProcessLock
	 * @return
	 * @throws Throwable
	 */
	public static Object execute(IAction iAction, Object[] args, String strInterProcessLock) throws Throwable{
		return execute(iAction, args, strInterProcessLock, ITransactionalUtil.PROPAGATION_UNKNOWN);
	}
	
	/**
	 * 执行Cloud事务处理（ 指定超时）
	 * @param iAction
	 * @param args
	 * @param strInterProcessLock
	 * @param time
	 * @param unit
	 * @return
	 * @throws Throwable
	 */
	public static Object execute(IAction iAction, Object[] args, String strInterProcessLock, long time, TimeUnit unit) throws Throwable{
		return execute(iAction, args, strInterProcessLock, time, unit, ITransactionalUtil.PROPAGATION_UNKNOWN);
	}
	
	/**
	 * 执行Cloud事务处理，并联合本地事务模式
	 * @param iAction
	 * @param args
	 * @param strInterProcessLock
	 * @param nPropagation
	 * @return
	 * @throws Throwable
	 */
	public static Object execute(IAction iAction, Object[] args, String strInterProcessLock, int nPropagation) throws Throwable{
		IInterProcessMutexUtil iInterProcessMutexUtil = getInterProcessMutexUtil();
		if(iInterProcessMutexUtil != null) {
			return iInterProcessMutexUtil.execute(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return ActionSessionManager.execute(iAction, args, nPropagation);
				}
			}, args, strInterProcessLock);
		}
		else {
			log.warn(String.format("未定义Cloud事务辅助对象，忽略Cloud事务模式"));
			return execute(iAction, args, nPropagation);
		}
	}

	/**
	 * 执行Cloud事务处理，并联合本地事务模式
	 * @param iAction
	 * @param args
	 * @param strInterProcessLock
	 * @param strSessionId 会话标识
	 * @param nPropagation
	 * @return
	 * @throws Throwable
	 */
	public static Object execute(IAction iAction, Object[] args, String strInterProcessLock, String strSessionId, int nPropagation) throws Throwable{
		IInterProcessMutexUtil iInterProcessMutexUtil = getInterProcessMutexUtil();
		if(iInterProcessMutexUtil != null) {
			return iInterProcessMutexUtil.execute(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return ActionSessionManager.execute(iAction, args, nPropagation);
				}
			}, args, strInterProcessLock, strSessionId);
		}
		else {
			log.warn(String.format("未定义Cloud事务辅助对象，忽略Cloud事务模式"));
			return execute(iAction, args, nPropagation);
		}
	}
	
	
	/**
	 * 执行Cloud事务处理（ 指定超时），并联合本地事务模式
	 * @param iAction
	 * @param args
	 * @param strInterProcessLock
	 * @param time
	 * @param unit
	 * @param nPropagation
	 * @return
	 * @throws Throwable
	 */
	public static Object execute(IAction iAction, Object[] args, String strInterProcessLock, long time, TimeUnit unit, int nPropagation) throws Throwable{
		IInterProcessMutexUtil iInterProcessMutexUtil = getInterProcessMutexUtil();
		if(iInterProcessMutexUtil != null) {
			return iInterProcessMutexUtil.execute(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return ActionSessionManager.execute(iAction, args, nPropagation);
				}
			}, args, strInterProcessLock, time, unit);
		}
		else {
			log.warn(String.format("未定义Cloud事务辅助对象，忽略Cloud事务模式"));
			return execute(iAction, args, strInterProcessLock, nPropagation);
		}
	}
	
	/**
	 * 执行Cloud事务处理（ 指定超时），并联合本地事务模式
	 * @param iAction
	 * @param args
	 * @param strInterProcessLock
	 * @param strSessionId 会话标识
	 * @param time
	 * @param unit
	 * @param nPropagation
	 * @return
	 * @throws Throwable
	 */
	public static Object execute(IAction iAction, Object[] args, String strInterProcessLock, String strSessionId, long time, TimeUnit unit, int nPropagation) throws Throwable{
		IInterProcessMutexUtil iInterProcessMutexUtil = getInterProcessMutexUtil();
		if(iInterProcessMutexUtil != null) {
			return iInterProcessMutexUtil.execute(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return ActionSessionManager.execute(iAction, args, nPropagation);
				}
			}, args, strInterProcessLock, strSessionId, time, unit);
		}
		else {
			log.warn(String.format("未定义Cloud事务辅助对象，忽略Cloud事务模式"));
			return execute(iAction, args, strInterProcessLock, nPropagation);
		}
	}
	
	/**
	 * 设置操作信息构建器
	 * @param stringBuilder
	 */
	public static void setActionInfoBuilder(StringBuilder stringBuilder) {
		ActionSessionManager.actionInfoBuilder.set(stringBuilder);
	}
	
	
	/**
	 * 获取操作信息构建器
	 * @return
	 */
	public static StringBuilder getActionInfoBuilder() {
		return ActionSessionManager.actionInfoBuilder.get();
	}
	
	
	/**
	 * 获取操作信息构建器（不存在时建立）
	 * @return
	 */
	public static StringBuilder getActionInfoBuilderIf() {
		StringBuilder stringBuilder = ActionSessionManager.actionInfoBuilder.get();
		if(stringBuilder == null) {
			stringBuilder = new StringBuilder();
			ActionSessionManager.actionInfoBuilder.set(stringBuilder);
		}
		return stringBuilder;
	}
	
	
	/**
	 * 设置反馈头部集合
	 * @param stringBuilder
	 */
	public static void setResponseHeaders(MultiValueMap<String, String> headers) {
		ActionSessionManager.headers.set(headers);
	}
	
	
	/**
	 * 获取反馈头部集合
	 * @return
	 */
	public static MultiValueMap<String, String> getResponseHeaders() {
		return ActionSessionManager.headers.get();
	}
	
	/**
	 * 获取反馈头部集合（不存在时建立）
	 * @return
	 */
	public static MultiValueMap<String, String> getResponseHeadersIf() {
		MultiValueMap<String, String> headers = ActionSessionManager.headers.get();
		if(headers == null) {
			headers = new LinkedMultiValueMap<String, String>();
			ActionSessionManager.headers.set(headers);
		}
		return headers;
	}
}
