package net.ibizsys.runtime.dataentity.util;

import net.ibizsys.model.dataentity.util.IPSDEUtil;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;

/**
 * 实体功能运行时对象接口
 * @author lionlau
 *
 */
public interface IDEUtilRuntime  extends IModelRuntime{


	/**
	 * 初始化实体功能运行时
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEUtil
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext  iDataEntityRuntimeContext, IPSDEUtil iPSDEUtil) throws Exception;
}
