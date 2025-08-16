package net.ibizsys.central.service;

import java.util.Map;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 外部服务接口实体运行时对象接口
 * @author lionlau
 *
 */
public interface ISubSysServiceAPIDERuntime extends IModelRuntime{

	/**
	 * 初始化
	 * @param iSubSysServiceAPIRuntimeContext
	 * @param iPSSubSysServiceAPIDE
	 * @throws Exception
	 */
	void init(ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext, IPSSubSysServiceAPIDE iPSSubSysServiceAPIDE) throws Exception;
	
	
	
	/**
	 * 获取外部服务接口实体模型对象
	 * @return
	 */
	IPSSubSysServiceAPIDE getPSSubSysServiceAPIDE();
	
	
	/**
	 * 获取外部接口运行时对象
	 * @return
	 */
	ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime();
	
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	
	
	/**
	 * 获取服务代码标识，未指定时为代码标识为复数形式
	 * @return
	 */
	String getServiceCodeName();
	
	
	/**
	 * 获取请求路径（父模式）
	 * @param context
	 * @return
	 */
	String getRequestPath(Map<String, ?> context);
	
	/**
	 * 获取请求路径
	 * @param context
	 * @param bParent 是否父模式
	 * @return
	 */
	String getRequestPath(Map<String, ?> context, boolean bParent);
	
	
	/**
	 * 调用方法
	 * @param strMethodName
	 * @param context
	 * @param objBody
	 * @param params
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeMethod(String strMethodName, Map<String, Object> context, Object objBody, Map<String, Object> params, Object objTag) throws Throwable;
	
	
	/**
	 * 调用方法
	 * @param strMethodName
	 * @param context
	 * @param objBody
	 * @param params
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, Object objBody, Map<String, Object> params, Object objTag) throws Throwable;
	
	

	/**
	 * 调用方法
	 * @param iPSSubSysServiceAPIDEMethod
	 * @param iDataEntityRuntime
	 * @param iPSDEAction
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object[] args) throws Throwable;
	
	
	/**
	 * 调用方法
	 * @param iPSSubSysServiceAPIDEMethod
	 * @param iDataEntityRuntime
	 * @param iPSDEDataSet
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable;
	
	
	/**
	 * 调用方法
	 * @param iPSSubSysServiceAPIDEMethod
	 * @param context 上下文对象
	 * @param iDataEntityRuntime
	 * @param iPSDEAction
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object[] args) throws Throwable;
	
	
	/**
	 * 调用方法
	 * @param iPSSubSysServiceAPIDEMethod
	 * @param context 上下文对象
	 * @param iDataEntityRuntime
	 * @param iPSDEDataSet
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable;
	
	
	
	/**
	 * 调用方法
	 * @param iPSSubSysServiceAPIDEMethod
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Object[] args) throws Throwable;
	
	

	/**
	 * 调用方法
	 * @param iPSSubSysServiceAPIDEMethod
	 * @param context 上下文对象
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, Object[] args) throws Throwable;
	
	
	
	
	/**
	 * 获取指定标记接口实体方法
	 * @param strMethodName
	 * @param bTryMode
	 * @return
	 */
	IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod(String strMethodName, boolean bTryMode);
}
