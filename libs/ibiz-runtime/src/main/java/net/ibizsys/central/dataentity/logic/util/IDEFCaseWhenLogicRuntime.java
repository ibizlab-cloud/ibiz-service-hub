package net.ibizsys.central.dataentity.logic.util;

import java.util.List;

import net.ibizsys.model.dataentity.logic.IPSDEFLogic;
import net.ibizsys.runtime.IModelRuntime;

public interface IDEFCaseWhenLogicRuntime extends IModelRuntime {

	
	/**
	 * 获取实体属性处理逻辑模型对象
	 * @return
	 */
	IPSDEFLogic getPSDEFLogic();
	
	/**
	 * 获取默认的CaseWhen逻辑
	 * @return
	 */
	IDEFCaseWhenLogicNodeRuntime getDefaultDEFCaseWhenLogicNodeRuntime();
	
	
	/**
	 * 获取非默认的CaseWhen逻辑集合
	 * @return
	 */
	List<IDEFCaseWhenLogicNodeRuntime> getDEFCaseWhenLogicNodeRuntimes();
}
