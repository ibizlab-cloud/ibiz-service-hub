package net.ibizsys.central.plugin.ai.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;

public abstract class SysKnowledgeBaseUtilRuntimeContextBase <M extends ISysKnowledgeBaseUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements ISysKnowledgeBaseUtilRuntimeContext {

	public SysKnowledgeBaseUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ISysKnowledgeBaseUtilRuntime getSysKnowledgeBaseUtilRuntime() {
		return this.getModelRuntime();
	}


	
}
