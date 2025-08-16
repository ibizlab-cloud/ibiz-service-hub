package net.ibizsys.central.plugin.extension.dataentity.util;

import net.ibizsys.central.dataentity.util.DEUtilRuntimeContextProxy;
import net.ibizsys.central.dataentity.util.IDEUtilRuntimeContext;

public abstract class DEExtensionUtilRuntimeContextBase <M extends IDEExtensionUtilRuntime, C extends IDEUtilRuntimeContext> extends DEUtilRuntimeContextProxy<M, C> implements IDEExtensionUtilRuntimeContext {

	public DEExtensionUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public IDEExtensionUtilRuntime getDEExtensionUtilRuntime() {
		return this.getModelRuntime();
	}
}
