package net.ibizsys.runtime.util;

import java.util.concurrent.TimeUnit;

/**
 * 支持Cloud事务服务对象接口
 * @author lionlau
 *
 */
public interface IInterProcessMutexUtil {

	/**
	 * 执行Cloud事务处理
	 * @param iAction
	 * @param args
	 * @param strCrossProcess
	 * @return
	 * @throws Throwable
	 */
	Object execute(IAction iAction, Object[] args, String strCrossProcess) throws Throwable;
	
	
	/**
	 * 执行Cloud事务处理
	 * @param iAction
	 * @param args
	 * @param strCrossProcess
	 * @param strSessionId
	 * @return
	 * @throws Throwable
	 */
	Object execute(IAction iAction, Object[] args, String strCrossProcess, String strSessionId) throws Throwable;
	
	
	/**
	 * 执行Cloud事务处理（指定超时时间）
	 * @param iAction
	 * @param args
	 * @param strCrossProcess
	 * @param time
	 * @param unit
	 * @return
	 * @throws Throwable
	 */
	Object execute(IAction iAction, Object[] args, String strCrossProcess, long time, TimeUnit unit) throws Throwable;
	
	
	/**
	 * 执行Cloud事务处理（指定超时时间）
	 * @param iAction
	 * @param args
	 * @param strCrossProcess
	 * @param strSessionId
	 * @param time
	 * @param unit
	 * @return
	 * @throws Throwable
	 */
	Object execute(IAction iAction, Object[] args, String strCrossProcess, String strSessionId, long time, TimeUnit unit) throws Throwable;
}
