package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.IDynaInstRuntime;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;

/**
 * 实体逻辑运行时上下文
 * @author lionlau
 *
 */
public interface IDELogicRuntimeContext extends net.ibizsys.runtime.dataentity.logic.IDELogicRuntimeContext{

	/**
	 * 获取相关的实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	
	/**
	 * 获取实体逻辑运行时对象
	 * @return
	 */
	IDELogicRuntime getDELogicRuntime();
	
	
	/**
	 * 获取系统动态实例运行时对象
	 * @return
	 */
	IDynaInstRuntime getDynaInstRuntime();
	
	
	/**
	 * 获取系统动态实例运行时对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	

	
//	/**
//	 * 获取传入逻辑节点运行时对象
//	 * @param iPSDELogicNode
//	 * @return
//	 */
//	IDELogicNodeRuntime getDELogicNodeRuntime(IPSDELogicNode iPSDELogicNode);

	
	
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
	
	
	/**
	 * 获取实体脚本逻辑运行时对象
	 * @param iPSDELogicNode
	 * @param strScriptCode
	 * @param strMode
	 * @param bTryMode
	 * @return
	 */
	IDELogicScriptNodeRuntime getDEScriptLogicRuntime(IPSDELogicNode iPSDELogicNode, String strScriptCode, String strMode, boolean bTryMode)throws Throwable;
	
	
	
	
	/**
	 * 执行节点
	 * @param iDELogicSession
	 * @param iPSDELogicNode
	 * @throws Throwable
	 */
	void executeNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable;
	
	
	/**
	 * 测试连接条件
	 * @param iDELogicSession
	 * @param iPSDELogicLinkCond
	 * @return
	 * @throws Throwable
	 */
	boolean testLinkCond(IDELogicSession iDELogicSession, IPSDELogicLinkCond iPSDELogicLinkCond) throws Throwable;
}
