package net.ibizsys.central.search;

import net.ibizsys.model.search.IPSSysSearchDoc;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 系统检索文档运行时
 * @author lionlau
 *
 */
public interface ISysSearchDocRuntime extends IModelRuntime{

	/**
	 * 初始化
	 * @param iSysSearchSchemeRuntimeContext
	 * @param iPSSysSearchDoc
	 * @throws Exception
	 */
	void init(ISysSearchSchemeRuntimeContext iSysSearchSchemeRuntimeContext, IPSSysSearchDoc iPSSysSearchDoc) throws Exception;
	
	
	/**
	 * 获取系统检索文档对象
	 * @return
	 */
	IPSSysSearchDoc getPSSysSearchDoc();
	
	
	/**
	 * 获取系统检索体系
	 * @return
	 */
	ISysSearchSchemeRuntime getSysSearchSchemeRuntime();
	

	
}
