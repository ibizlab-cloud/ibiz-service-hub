package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;

/**
 * 系统DataFlow功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysDataFlowUtilRuntime extends ISysUtilRuntime{

	/**
	 * DataFlow平台：默认，由Cloud平台默认DataFlow引擎提供服务
	 */
	public final static String DATAFLOWPLATFORM_DEFAULT = "DEFAULT";
	
	
	
	/**
	 * 启动指定数据流
	 * @param type
	 * @param id
	 * @param body
	 * @return
	 */
	PortalAsyncAction start(String type, String id, Object body);
	
	/**
	 * 启动指定数据流
	 * @param id
	 * @param body
	 * @return
	 */
	PortalAsyncAction start(String id, Object body);
	
}
