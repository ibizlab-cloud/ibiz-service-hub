package net.ibizsys.central.util;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.LogLevels;

public class ActionUtils {

	public static Object executeAction(ISystemRuntime iSystemRuntime, IModelRuntime iModelRuntime, String strActionName, IAction iAction, Object[] args) {
		return executeAction(iSystemRuntime, iModelRuntime, strActionName, iAction, args, Object.class, ActionSessionManager.getLogPOTime());
	}
	
	public static <T> T executeAction(ISystemRuntime iSystemRuntime, IModelRuntime iModelRuntime, String strActionName, IAction iAction, Object[] args, Class<T> cls) {
		return executeAction(iSystemRuntime, iModelRuntime, strActionName, iAction, args, cls, ActionSessionManager.getLogPOTime());
	}
	
	public static <T> T executeAction(ISystemRuntime iSystemRuntime, IModelRuntime iModelRuntime, String strActionName, IAction iAction, Object[] args, TypeReference<T> type) {
		return executeAction(iSystemRuntime, iModelRuntime, strActionName, iAction, args, type, ActionSessionManager.getLogPOTime());
	}
	

	/**
	 * 使用闭包的方式执行行为，提供性能监测
	 * @param iSystemRuntime
	 * @param iModelRuntime
	 * @param strActionName
	 * @param iAction
	 * @param args
	 * @param cls
	 * @param nPOTime
	 * @return
	 */
	public static <T> T executeAction(ISystemRuntime iSystemRuntime, IModelRuntime iModelRuntime, String strActionName, IAction iAction, Object[] args, Class<T> cls, int nPOTime) {
		try {
			long nBeginTime = System.currentTimeMillis();
			Object objRet = iAction.execute(args);
			long bEndTime = System.currentTimeMillis();
			if(bEndTime - nBeginTime > nPOTime) {
				//log.warn(String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime));
				iSystemRuntime.logPO(LogLevels.WARN, iModelRuntime.getClass().getName(), String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime), iModelRuntime.getLogicName(), strActionName, bEndTime - nBeginTime, null);
			}
			
			return (T)objRet;
		}
		catch (Throwable ex) {
			//log.error(String.format("%1$s[%2$s]发生异常，%3$s", this.getLogicName(), strActionName, ex.getMessage()), ex);
			throw dealException(iSystemRuntime, iModelRuntime, String.format("%1$s发生异常，%2$s", strActionName, ex.getMessage()), ex);
		}
	}
	

	/**
	 * 用闭包的方式执行行为，提供性能监测
	 * @param iSystemRuntime
	 * @param iModelRuntime
	 * @param strActionName
	 * @param iAction
	 * @param args
	 * @param type
	 * @param nPOTime
	 * @return
	 */
	public static <T> T executeAction(ISystemRuntime iSystemRuntime, IModelRuntime iModelRuntime, String strActionName, IAction iAction, Object[] args, TypeReference<T> type, int nPOTime) {
		try {
			long nBeginTime = System.currentTimeMillis();
			Object objRet = iAction.execute(args);
			long bEndTime = System.currentTimeMillis();
			if(bEndTime - nBeginTime > nPOTime) {
				//log.warn(String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime));
				iSystemRuntime.logPO(LogLevels.WARN, iModelRuntime.getClass().getName(), String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime), iModelRuntime.getLogicName(), strActionName, bEndTime - nBeginTime, null);
			}
			
			return (T)objRet;
		}
		catch (Throwable ex) {
			//log.error(String.format("%1$s[%2$s]发生异常，%3$s", this.getLogicName(), strActionName, ex.getMessage()), ex);
			throw dealException(iSystemRuntime, iModelRuntime, String.format("%1$s发生异常，%2$s", strActionName, ex.getMessage()), ex);
		}
	}
	
	
	public static RuntimeException dealException(ISystemRuntime iSystemRuntime, IModelRuntime iModelRuntime, String strMessage, Throwable ex) {
		iSystemRuntime.log(LogLevels.ERROR, iModelRuntime.getClass().getName(), String.format("%1$s%2$s", iModelRuntime.getLogicName(), strMessage), null);
//		if(ex instanceof ISystemRuntimeException) {
//			return (RuntimeException)ex;
//		}
		return new SystemRuntimeException(iSystemRuntime, iModelRuntime, strMessage, ex);
	}
	
	
}
