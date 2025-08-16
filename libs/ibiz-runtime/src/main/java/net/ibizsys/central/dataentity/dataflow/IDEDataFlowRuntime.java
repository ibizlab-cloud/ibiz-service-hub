package net.ibizsys.central.dataentity.dataflow;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow;

public interface IDEDataFlowRuntime  extends IDataEntityModelRuntime{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEDataFlow
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataFlow iPSDEDataFlow) throws Exception;
	
	
	
	/**
	 * 获取实体数据流逻辑
	 * @return
	 */
	IPSDEDataFlow getPSDEDataFlow();
	
	
	
	/**
	 * 执行
	 * @param args
	 * @return
	 */
	Object execute(Object[] args) throws Throwable;
}
