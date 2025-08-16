package net.ibizsys.central.service;

import java.util.Map;

import net.ibizsys.model.service.IPSSubSysServiceAPIMethod;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 外部服务接口方法运行时对象接口
 * @author lionlau
 *
 */
public interface ISubSysServiceAPIMethodRuntime extends IModelRuntime{

	/**
	 * 初始化
	 * @param iSubSysServiceAPIRuntimeContext
	 * @param iSubSysServiceAPIDERuntime
	 * @throws Exception
	 */
	void init(ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext, ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, IPSSubSysServiceAPIMethod iPSSubSysServiceAPIMethod) throws Exception;
	
	
	/**
	 * 获取外部接口运行时对象
	 * @return
	 */
	ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime();
	
	
	/**
	 * 获取外部接口实体运行时对象
	 * @return
	 */
	ISubSysServiceAPIDERuntime getSubSysServiceAPIDERuntime();
	
	
	/**
	 * 获取外部服务接口方法模型对象
	 * @return
	 */
	IPSSubSysServiceAPIMethod getPSSubSysServiceAPIMethod();
	
	
	
	/**
	 * 执行接口方法
	 * @param context
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object execute(Map<String, Object> context, Object[] args) throws Throwable;
}
