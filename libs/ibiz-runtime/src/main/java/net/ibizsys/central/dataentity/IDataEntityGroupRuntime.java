package net.ibizsys.central.dataentity;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.model.dataentity.IPSDEGroup;

/**
 * 实体组模型运行时
 * @author lionlau
 *
 */
public interface IDataEntityGroupRuntime extends ISystemModelRuntime{

	/**
	 * 初始化
	 * @param iSystemRuntimeContext
	 * @param iPSDEGroup
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSDEGroup iPSDEGroup) throws Exception;

	/**
	 * 获取实体组模型对象
	 * @return
	 */
	IPSDEGroup getPSDEGroup();
}
