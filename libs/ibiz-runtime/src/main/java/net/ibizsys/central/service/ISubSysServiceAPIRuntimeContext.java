package net.ibizsys.central.service;

import java.util.Map;

import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;

/**
 * 外部服务接口运行时上下文对象
 * @author lionlau
 *
 */
public interface ISubSysServiceAPIRuntimeContext {

	/**
	 * 获取外部服务接口运行时对象
	 * @return
	 */
	ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime();
	
	
	
	/**
	 * 获取方法的脚本逻辑对象
	 * @return
	 */
	ISubSysServiceAPIScriptLogicRuntime getMethodSubSysServiceAPIScriptLogicRuntime();
	
	
	
	
	/**
	 * 获取方法的脚本逻辑对象
	 * @param strScriptCode 脚本代码
	 * @return
	 */
	ISubSysServiceAPIScriptLogicRuntime getMethodSubSysServiceAPIScriptLogicRuntime(String strScriptCode);
	
	

	/**
	 * 获取方法参数脚本对象
	 * @return
	 */
	Object createMethodParamScriptObject();
	
	

	
	/**
	 * 获取客户端对象
	 * @param iSubSysServiceAPIDERuntime
	 * @param iPSSubSysServiceAPIDEMethod
	 * @param context
	 * @param args
	 * @param objTag
	 * @return
	 */
	Object getClientObject(ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, Object[] args, Object objTag);
}
