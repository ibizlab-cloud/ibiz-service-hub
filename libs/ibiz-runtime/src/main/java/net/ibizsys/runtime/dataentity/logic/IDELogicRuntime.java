package net.ibizsys.runtime.dataentity.logic;


import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;


public interface IDELogicRuntime extends IDELogicRuntimeBase{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDELogic
	 * @param iDynaInstRuntime
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDELogic iPSDELogic) throws Exception;
	
	
	
	/**
	 * 获取实体处理逻辑
	 * @return
	 */
	IPSDELogic getPSDELogic();
	
	
	
	/**
	 * 执行
	 * @param args
	 * @return
	 */
	Object execute(Object[] args) throws Throwable;
	
	
	

	
}
