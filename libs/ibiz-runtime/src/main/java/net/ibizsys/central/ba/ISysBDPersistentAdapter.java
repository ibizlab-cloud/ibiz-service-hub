package net.ibizsys.central.ba;

import net.ibizsys.central.ISystemPersistentAdapter;
import net.ibizsys.central.ISystemRuntimeContext;

/**
 * 系统大数据持久化适配层
 * @author lionlau
 *
 */
public interface ISysBDPersistentAdapter extends ISystemPersistentAdapter{

	/**
	 * 初始化
	 * @param iSystemRuntimeContext
	 * @param iSysBDSchemeRuntime
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, ISysBDSchemeRuntime iSysBDSchemeRuntime) throws Exception;
	
	
	
	
	/**
	 * 获取大数据体系运行时
	 * @return
	 */
	ISysBDSchemeRuntime getSysBDSchemeRuntime();
	
	
	
	/**
	 * 获取数据库类型
	 * @return
	 */
	String getBDType();
}
