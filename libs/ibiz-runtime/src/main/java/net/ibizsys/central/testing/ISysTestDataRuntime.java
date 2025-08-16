package net.ibizsys.central.testing;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.model.testing.IPSSysTestData;
import net.ibizsys.runtime.util.IEntity;

/**
 * 系统测试数据运行时
 * @author lionlau
 *
 */
public interface ISysTestDataRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化测试数据运行时
	 * @param iSystemRuntimeBaseContext
	 * @param iPSSysTestData
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysTestData iPSSysTestData) throws Exception;

	

	
	/**
	 * 获取数据对象
	 * @return
	 */
	IEntity getEntity(IEntity iEntity);
	
}
