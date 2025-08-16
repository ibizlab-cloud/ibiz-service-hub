package net.ibizsys.runtime.res;

import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;

/**
 * 系统逻辑运行时对象接口
 * @author lionlau
 *
 */
public interface ISysLogicRuntime extends ISystemModelRuntime {

	
	
	/**
	 * 初始化逻辑运行时
	 * @param iSystemRuntimeBase
	 * @param iPSSysLogic
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysLogic iPSSysLogic) throws Exception;

	
	
	/**
	 * 获取相关的系统逻辑对象
	 * @return
	 */
	IPSSysLogic getPSSysLogic();
	
	
	
	/**
	 * 执行
	 * @param args
	 * @return
	 */
	Object execute(Object... args);

}
