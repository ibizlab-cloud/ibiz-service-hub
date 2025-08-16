package net.ibizsys.central.app.dataentity.uilogic;

import net.ibizsys.central.app.dataentity.IAppDataEntityRuntimeContext;
import net.ibizsys.model.app.dataentity.IPSAppDEUILogic;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 应用实体界面逻辑运行时对象接口
 * @author lionlau
 *
 */
public interface IAppDEUILogicRuntime extends IModelRuntime {

	/**
	 * 初始化应用实体界面逻辑运行时对象
	 * @param iAppDataEntityRuntimeContext
	 * @param iPSAppDEUILogic
	 * @throws Exception
	 */
	void init(IAppDataEntityRuntimeContext iAppDataEntityRuntimeContext, IPSAppDEUILogic iPSAppDEUILogic) throws Exception;
}
