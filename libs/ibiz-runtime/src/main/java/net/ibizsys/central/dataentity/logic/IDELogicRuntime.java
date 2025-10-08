package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;

/**
 * 实体逻辑运行时对象接口
 * @author lionlau
 *
 */
public interface IDELogicRuntime extends net.ibizsys.runtime.dataentity.logic.IDELogicRuntime,IDataEntityModelRuntime{

	/**
	 * 获取逻辑参数运行时对象
	 * @param strName
	 * @return
	 */
	IDELogicParamRuntime getDELogicParamRuntime(String strName, boolean bTryMode) throws Throwable;
	
	
	
	/**
	 * 获取逻辑节点运行时对象
	 * @param strName
	 * @return
	 */
	IDELogicNodeRuntime getDELogicNodeRuntime(String strName, boolean bTryMode) throws Throwable;
	
	/**
	 * 获取调试模式
	 * @return
	 */
	int getDebugMode();
	
	
	
	/**
	 * 是否输出调试信息
	 * @return
	 */
	boolean isOutputDebugInfo();
	
	

	/**
	 * 获取默认实体逻辑参数运行时对象
	 * @return
	 */
	IDELogicParamRuntime getDefaultDELogicParamRuntime();
	
	
	
	/**
	 * 计算节点参数值
	 * @param iDELogicSession
	 * @param iPSDELogicNodeParam
	 * @return
	 * @throws Throwable
	 */
	Object getNodeParamValue(IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable;
	
	
	/**
	 * 计算获取参数值
	 * @param iDELogicSession
	 * @param strLogicParamCodeName
	 * @return
	 * @throws Throwable
	 */
	Object getLogicParamValue(IDELogicSession iDELogicSession, String strLogicParamCodeName) throws Throwable;
	
	
	/**
	 * 计算节点参数值
	 * @param iPSDELogicNodeParam
	 * @return
	 * @throws Throwable
	 */
	Object getNodeParamValue(IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable;
	
	
	/**
	 * 计算获取参数值
	 * @param strLogicParamCodeName
	 * @return
	 * @throws Throwable
	 */
	Object getLogicParamValue(String strLogicParamCodeName) throws Throwable;
}
