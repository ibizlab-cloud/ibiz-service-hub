package net.ibizsys.central.cloud.core.dataentity;

import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;

/**
 * 实体运行时成员对象接口
 * @author lionlau
 *
 */
public interface IDataEntityRTAddin {


	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param strPartId
	 * @param data
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strPartId, Object data) throws Exception;
	
	
	
	/**
	 * 获取成员标识
	 * @return
	 */
	String getId();
}
