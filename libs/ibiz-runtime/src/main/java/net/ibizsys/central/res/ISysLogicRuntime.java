package net.ibizsys.central.res;

/**
 * 系统逻辑运行时对象接口
 * @author lionlau
 *
 */
public interface ISysLogicRuntime extends net.ibizsys.runtime.res.ISysLogicRuntime {

	
	/**
	 * 执行
	 * @param args
	 * @param logicParam
	 * @param logicParam2
	 * @return
	 */
	Object execute(Object[] args, Object logicParam, Object logicParam2);
	
	
	

	
}
