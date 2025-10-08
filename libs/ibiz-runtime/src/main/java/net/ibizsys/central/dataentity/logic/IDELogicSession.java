package net.ibizsys.central.dataentity.logic;

import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IWebContext;

/**
 * 实体逻辑执行会话
 * @author lionlau
 *
 */
public interface IDELogicSession {

	/**
	 * 下一步：结束并返回LastReturn
	 */
	public final static Object NEXT_END = new Object();
	
	/**
	 * 调试信息类型：进入节点
	 */
	public final static String DEBUGTYPE_ENTERNODE = "enternode";
	
	/**
	 * 调试信息类型：进入连接
	 */
	public final static String DEBUGTYPE_ENTERLINK = "enterlink";
	
	/**
	 * 调试信息类型：离开节点
	 */
	public final static String DEBUGTYPE_EXITNODE = "exitnode";
	
	/**
	 * 调试信息类型：调试信息
	 */
	public final static String DEBUGTYPE_DEBUGINFO = "debuginfo";
	
	/**
	 * 调试信息类型：调试参数
	 */
	public final static String DEBUGTYPE_DEBUGPARAM = "debugparam";
	
	/**
	 * 实体逻辑运行时对象
	 * @return
	 */
	IDELogicRuntime getDELogicRuntime();
	
	/**
	 * 获取逻辑参数，该方法已废弃，使用 getParamObject 代替 
	 * @param strName
	 * @return
	 */
	@Deprecated
	IEntity getParam(String strName) throws Throwable;
	
	
	/**
	 * 设置逻辑参数，该方法已废弃，使用 setParamObject 代替 
	 * @param strName
	 * @param iEntity
	 */
	@Deprecated
	void setParam(String strName, IEntity iEntity);
	
	
	
	/**
	 * 获取逻辑参数，该方法已废弃，使用 getParamObject 代替 
	 * @param strName
	 * @return
	 */
	@Deprecated
	IEntity getParam(String strName, boolean bTryMode) throws Throwable;
	
	
	/**
	 * 获取逻辑参数
	 * @param strName
	 * @return
	 */
	Object getParamObject(String strName) throws Throwable;
	
	
	/**
	 * 设置逻辑参数
	 * @param objParam
	 * @param iEntity
	 */
	void setParamObject(String strName, Object objParam);
	
	
	
	/**
	 * 获取逻辑参数
	 * @param strName
	 * @return
	 */
	Object getParamObject(String strName, boolean bTryMode) throws Throwable;
	
	
	/**
	 * 获取用户上下文
	 * @return
	 */
	IUserContext getUserContext();


	
	
	/**
	 * 获取返回结果
	 * @return
	 */
	Object getResult();
	
	
	/**
	 * 设置返回结果
	 * @return
	 */
	void setResult(Object object);
	
	
	
	/**
	 * 获取上一次逻辑节点调用返回值
	 * @return
	 */
	Object getLastReturn();
	
	
	/**
	 * 设置上一次逻辑节点调用返回值
	 * @param object
	 */
	void setLastReturn(Object object);
	
	
	/**
	 * 调试进入节点
	 * @param iDELogicNodeRuntime
	 * @param iPSDELogicNode
	 */
	void debugEnterNode(IDELogicNodeRuntime iDELogicNodeRuntime, IPSDELogicNode iPSDELogicNode);
	

	
	/**
	 * 调试离开节点
	 * @param iDELogicNodeRuntime
	 * @param iPSDELogicNode
	 */
	void debugExitNode(IDELogicNodeRuntime iDELogicNodeRuntime, IPSDELogicNode iPSDELogicNode);
	
	
	/**
	 * 调试进入节点连接
	 * @param iDELogicNodeRuntime
	 * @param iPSDELogicNode
	 * @param iPSDELogicLink
	 */
	void debugEnterLink(IDELogicNodeRuntime iDELogicNodeRuntime, IPSDELogicNode iPSDELogicNode, IPSDELogicLink iPSDELogicLink);
	
	
	
	/**
	 * 调试逻辑参数
	 * @param iDELogicNodeRuntime
	 */
	void debugParam(IDELogicParamRuntime iDELogicParamRuntime);
	
	
	
	/**
	 * 获取调试信息数组节点
	 * @return
	 */
	ArrayNode getDebugArrayNode();
	
	
	/**
	 * 获取当前应用上下文
	 * @return
	 */
	IAppContext getAppContext();
	
	
	/**
	 * 获取当前Web上下文
	 * @return
	 */
	IWebContext getWebContext();
	
	/**
	 * 调试信息
	 * @param strInfo
	 */
	void debugInfo(String strInfo);
//	/**
//	 * 设置当前应用上下文
//	 * @param iAppContext
//	 */
//	void setAppContext(IAppContext iAppContext);
	
	
	
//	/**
//	 * 获取指定参数的指定属性值
//	 * @param strParam
//	 * @param strField
//	 * @return
//	 * @throws Throwable
//	 */
//	Object value(String  strParam, String strField) throws Throwable;
//	
//	
//	/**
//	 * 获取指定参数的指定实际值
//	 * @param strParam
//	 * @return
//	 * @throws Throwable
//	 */
//	Object value(String  strParam) throws Throwable;
	
	/**
	 * 设置下一个节点
	 * @param next
	 */
	void setNext(Object next); 
	
	
	/**
	 * 获取下一个节点
	 * @return
	 */
	Object getNext();
	
	
	
	/**
	 * 克隆新会话
	 * @return
	 */
	IDELogicSession clone();
	
}
