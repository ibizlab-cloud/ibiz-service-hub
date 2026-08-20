package net.ibizsys.central.testing;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.model.testing.IPSSysTestPrj;
import net.ibizsys.runtime.IModelRuntimeShutdownable;

/**
 * 系统测试项目运行时
 * @author lionlau
 *
 */
public interface ISysTestPrjRuntime extends ISystemModelRuntime ,IModelRuntimeShutdownable{

	
	/**
	 * 初始化测试项目运行时
	 * @param iSystemRuntimeBaseContext
	 * @param iPSSysTestPrj
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysTestPrj iPSSysTestPrj) throws Exception;

	
	IPSSysTestPrj getPSModelObject();
}
