package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;

/**
 * 系统门户功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysPortalUtilRuntime extends net.ibizsys.central.sysutil.ISysUtilRuntime{

	PortalAsyncAction createAsyncAction(PortalAsyncAction action);

	
	PortalAsyncAction executeAsyncAction(PortalAsyncAction action);

	
	PortalAsyncAction errorAsyncAction(PortalAsyncAction action);
	
	
	PortalAsyncAction finishAsyncAction(PortalAsyncAction action);
	
	
	PortalAsyncAction getAsyncAction(String id);
	
}
