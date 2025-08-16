package net.ibizsys.runtime.dataentity.logic;


import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;


public interface IDEMSLogicRuntime extends IDELogicRuntimeBase{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeBaseContext
	 * @param iPSDEMSLogic
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDEMSLogic iPSDEMSLogic) throws Exception;
	
	
	
	/**
	 * 获取实体主状态迁移逻辑
	 * @return
	 */
	IPSDEMSLogic getPSDEMSLogic();
	
	
	
	
}
