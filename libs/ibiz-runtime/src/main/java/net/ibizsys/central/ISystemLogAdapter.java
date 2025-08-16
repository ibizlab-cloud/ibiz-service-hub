package net.ibizsys.central;

import net.ibizsys.runtime.ISystemRuntimeUtil;

/**
 * 系统日志适配器接口
 * @author lionlau
 *
 */
public interface ISystemLogAdapter extends ISystemRuntimeUtil{

	/**
	 * 初始化
	 * @param iSystemRuntimeContext
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext) throws Exception;
	
	
	/**
	 * 日志常规信息
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param objData
	 */
	void log(int nLogLevel, String strCat, String strInfo, Object objData);

	
	/**
	 * 日志审计信息
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param strPersonId
	 * @param strAddress
	 * @param objData
	 */
	void logAudit(int nLogLevel, String strCat, String strInfo, String strPersonId, String strAddress, Object objData);

	/**
	 * 日志事件
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param objData
	 */
	void logEvent(int nLogLevel, String strCat, String strInfo, Object objData);

	
	/**
	 * 日志性能优化信息
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param strDEName
	 * @param strAction
	 * @param nTime
	 * @param objData
	 */
	void logPO(int nLogLevel, String strCat, String strInfo, String strDEName, String strAction, long nTime, Object objData);
}
