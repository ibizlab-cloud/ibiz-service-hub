package net.ibizsys.central.util;

import net.ibizsys.central.ISystemRuntimeContext;

public interface ISystemRuntimeContextAction {

	Object execute(ISystemRuntimeContext iSystemRuntimeContext, Object[] args) throws Throwable;
}
