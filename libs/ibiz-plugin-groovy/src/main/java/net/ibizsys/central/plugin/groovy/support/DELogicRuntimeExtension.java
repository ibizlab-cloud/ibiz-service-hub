package net.ibizsys.central.plugin.groovy.support;

import net.ibizsys.central.dataentity.logic.DELogicSession;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicSession;

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
	
	public static void beginTrans(IDELogicRuntime iDELogicRuntime) throws Throwable{
		beginTrans(iDELogicRuntime, net.ibizsys.runtime.util.ITransactionalUtil.PROPAGATION_REQUIRED);
	}
	
	
	public static void beginTrans(IDELogicRuntime iDELogicRuntime, int propagation) throws Throwable{
		DELogicSession.getCurrentMust().beginTrans(propagation);
	}
	
	public static void commitTrans(IDELogicRuntime iDELogicRuntime) throws Throwable{
		DELogicSession.getCurrentMust().commitTrans();
	}
	
	public static void rollbackTrans(IDELogicRuntime iDELogicRuntime) throws Throwable{
		DELogicSession.getCurrentMust().rollbackTrans();
	}
	
	public static IDELogicSession session(IDELogicRuntime iDELogicRuntime) throws Throwable{
		return DELogicSession.getCurrentMust();
	}
	
}
