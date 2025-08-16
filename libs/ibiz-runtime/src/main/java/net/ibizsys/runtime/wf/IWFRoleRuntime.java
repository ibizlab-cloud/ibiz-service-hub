package net.ibizsys.runtime.wf;

import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;

/**
 * 工作流角色运行时
 * @author lionlau
 *
 */
public interface IWFRoleRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化消息模板运行时
	 * @param iSystemRuntimeBase
	 * @param iPSWFRole
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSWFRole iPSWFRole) throws Exception;

	
	
}
