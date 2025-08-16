package net.ibizsys.central.dataentity.logic.util;

import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond;
import net.ibizsys.runtime.IModelRuntime;

public interface IDEFCaseWhenLogicNodeRuntime extends IModelRuntime {

	/**
	 * 获取实体逻辑连接模型对象
	 * @return
	 */
	IPSDELogicLink getPSDELogicLink();
	
	
	/**
	 * 获取值类型
	 * @return
	 */
	String getValueType();
	
	
	/**
	 * 获取结果值
	 * @return
	 */
	Object getValue();
	
	
	/**
	 * 获取CaseWhen条件
	 * @return
	 */
	IPSDELogicLinkGroupCond getPSDELogicLinkGroupCond();
}
