package net.ibizsys.central.app.dataentity;

import net.ibizsys.central.app.IApplicationRuntimeContext;
import net.ibizsys.model.app.dataentity.IPSAppDERS;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 应用实体关系运行时对象接口
 * @author lionlau
 *
 */
public interface IAppDataEntityRSRuntime extends IModelRuntime{

	/**
	 * 初始化应用实体关系运行时	
	 * @param iApplicationRuntimeContext
	 * @param iPSAppDERS
	 * @throws Exception
	 */
	void init(IApplicationRuntimeContext iApplicationRuntimeContext, IPSAppDERS iPSAppDERS) throws Exception;
	
	
	
	/**
	 * 获取应用实体关系模型对象
	 * @return
	 */
	IPSAppDERS getPSAppDERS();
	
	
	
	/**
	 * 获取主应用实体运行时
	 * @return
	 */
	IAppDataEntityRuntime getMajorAppDataEntityRuntime();
	
	
	/**
	 * 获取从应用实体运行时
	 * @return
	 */
	IAppDataEntityRuntime getMinorAppDataEntityRuntime();
}
