package net.ibizsys.central.dataentity.service;

import net.ibizsys.central.service.ISysServiceAPIRuntimeContext;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 实体服务接口关系运行时对象接口
 * @author lionlau
 *
 */
public interface IDEServiceAPIRSRuntime extends IModelRuntime{

	/**
	 * 初始化实体服务接口关系运行时	
	 * @param iSysServiceAPIRuntimeContext
	 * @param iPSDEServiceAPIRS
	 * @throws Exception
	 */
	void init(ISysServiceAPIRuntimeContext iSysServiceAPIRuntimeContext, IPSDEServiceAPIRS iPSDEServiceAPIRS) throws Exception;
	
	
	
	/**
	 * 获取实体服务接口关系模型对象
	 * @return
	 */
	IPSDEServiceAPIRS getPSDEServiceAPIRS();
	
	
	
	/**
	 * 获取实体服务接口方法
	 * @param strMethodCodeName
	 * @param bTryMode
	 * @return
	 */
	IPSDEServiceAPIMethod getPSDEServiceAPIMethod(String strMethodCodeName, boolean bTryMode);
	
	
	
	
	/**
	 * 获取主接口运行时
	 * @return
	 */
	IDEServiceAPIRuntime getMajorDEServiceAPIRuntime();
	
	
	/**
	 * 获取从接口运行时
	 * @return
	 */
	IDEServiceAPIRuntime getMinorDEServiceAPIRuntime();
}
