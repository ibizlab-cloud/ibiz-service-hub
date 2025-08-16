package net.ibizsys.central.plugin.groovy.support;

import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntime;

public class DELogicRuntimeExtension {

	/**
	 * 获取处理逻辑参数
	 * @param iDELogicRuntime
	 * @param strParamName
	 * @return
	 * @throws Throwable
	 */
	public static IDELogicParamRuntime param(IDELogicRuntime iDELogicRuntime, String strParamName) throws Throwable{
		return iDELogicRuntime.getDELogicParamRuntime(strParamName, false);
	}
	
	
}
