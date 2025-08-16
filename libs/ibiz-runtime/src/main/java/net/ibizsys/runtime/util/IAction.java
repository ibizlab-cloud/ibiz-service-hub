package net.ibizsys.runtime.util;

/**
 * 服务作业接口
 * 
 * @author lionlau
 *
 */
public interface IAction {
	
	/**
	 * 执行作业
	 * 
	 * @param args
	 * @throws Exception
	 */
	Object execute(Object[] args) throws Throwable;
}
