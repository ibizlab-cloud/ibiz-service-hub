package net.ibizsys.central.dataentity.search;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.central.search.ISysSearchSchemeRuntime;
import net.ibizsys.model.dataentity.search.IPSDESearch;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;

/**
 * 实体检索运行时接口
 * @author lionlau
 *
 */
public interface IDESearchRuntime extends IDataEntityModelRuntime{

	
	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDESearch
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDESearch iPSDESearch) throws Exception;
	
	
	/**
	 * 获取相关的实体检索模型对象
	 * @return
	 */
	IPSDESearch getPSDESearch();
	
	
	/**
	 * 获取系统搜索体系运行时对象
	 * @return
	 */
	ISysSearchSchemeRuntime getSysSearchSchemeRuntime();
	
	
	
//	/**
//	 * 获取系统搜索体系文档运行时对象
//	 * @return
//	 */
//	ISysSearchDocRuntime getSysSearchDocRuntime();
	
	
	
	/**
	 * 同步数据对象
	 * @param nEvent
	 * @param arg0
	 */
	void syncEntity(int nEvent, Object arg0);
}
