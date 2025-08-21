package net.ibizsys.runtime.res;

import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeContext;

/**
 * 系统功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysUtilRuntime extends IModelRuntime {

	
	/**
	 * 初始化系统功能运行时
	 * @param iSystemRuntimeBase
	 * @param iPSSysUtil
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysUtil iPSSysUtil) throws Exception;


}
