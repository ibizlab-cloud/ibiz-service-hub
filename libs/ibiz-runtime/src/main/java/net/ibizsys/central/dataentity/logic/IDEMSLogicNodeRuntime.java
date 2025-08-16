package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 实体主状态逻辑实体运行时对象接口
 * @author lionlau
 *
 */
public interface IDEMSLogicNodeRuntime extends IModelRuntime{

	/**
	 * 初始化
	 * @param iDEMSLogicRuntimeContext
	 * @param iPSDEMSLogicNode
	 * @throws Exception
	 */
	void init(IDEMSLogicRuntimeContext iDEMSLogicRuntimeContext, IPSDEMSLogicNode iPSDEMSLogicNode) throws Exception;
}
