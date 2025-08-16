package net.ibizsys.runtime.dataentity.report;

import net.ibizsys.runtime.security.IUserContext;

/**
 * 实体报表运行时上下文对象接口
 * @author lionlau
 *
 */
public interface IDEReportRuntimeContext {

	/**
	 * 获取用户上下文对象
	 * @return
	 */
	IUserContext getUserContext();
	
	
	/**
	 * 获取内容类型
	 * @return
	 */
	String getContentType();
}
