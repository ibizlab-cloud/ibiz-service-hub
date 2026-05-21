package net.ibizsys.central.plugin.ai.sysutil.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase2;

public abstract class SysKnowledgeBaseUtilRTAddinBase extends ModelRTAddinBase2 implements ISysKnowledgeBaseUtilRTAddin{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysKnowledgeBaseUtilRTAddinBase.class);
	
	protected ISysKnowledgeBaseUtilRuntimeContext getContext() {
		return (ISysKnowledgeBaseUtilRuntimeContext)super.getContext();
	}
	
	public IServiceSystemRuntime getSystemRuntime() {
		return (IServiceSystemRuntime)getContext().getSysKnowledgeBaseUtilRuntime().getSystemRuntime();
	}
	
	public ISysKnowledgeBaseUtilRuntime getSysKnowledgeBaseUtilRuntime() {
		return this.getContext().getSysKnowledgeBaseUtilRuntime();
	}
	
}
