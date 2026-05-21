package net.ibizsys.central.cloud.core.util;

import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.runtime.util.INamedAction;

public interface IPortalAsyncAction extends INamedAction{

	PortalAsyncAction getPortalAsyncAction();
	
	@Override
	default String getName() {
		return getPortalAsyncAction().getAsyncAcitonName();
	}
}
