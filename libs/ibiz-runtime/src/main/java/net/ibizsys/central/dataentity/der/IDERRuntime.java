package net.ibizsys.central.dataentity.der;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.runtime.IModelRuntime;

public interface IDERRuntime extends IModelRuntime, IDERRuntimeBase{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param IPSDERBase
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDERBase IPSDERBase) throws Exception;
	
	
	
	/**
	 * 获取关系主实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getMajorDataEntityRuntime();
	
	
	
	
	/**
	 * 获取关系从实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getMinorDataEntityRuntime();
}
