package net.ibizsys.central.dataentity.ac;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.model.dataentity.ac.IPSDEACMode;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;

/**
 * 获取实体自填模型运行时对象接口
 * @author lionlau
 *
 */
public interface IDEAutoCompleteRuntime extends IDEAutoCompleteRuntimeBase, IDataEntityModelRuntime{

	/**
	 * 方法：获取自填项分页集合
	 */
	final static String METHOD_FETCH = "FETCH";
	
	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEACMode
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEACMode iPSDEACMode) throws Exception;
	
	
	/**
	 * 获取相关的实体自填模型对象
	 * @return
	 */
	IPSDEACMode getPSDEACMode();

	
	
	
}
