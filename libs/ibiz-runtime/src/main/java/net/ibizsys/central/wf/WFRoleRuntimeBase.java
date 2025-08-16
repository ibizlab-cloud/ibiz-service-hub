package net.ibizsys.central.wf;

import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

/**
 * 工作流角色运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class WFRoleRuntimeBase extends SystemModelRuntimeBase implements IWFRoleRuntime {

	private IPSWFRole iPSWFRole = null;

	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSWFRole iPSWFRole) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSWFRole = iPSWFRole;
		this.onInit();
	}

	public IPSWFRole getPSWFRole() {
		return this.iPSWFRole;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSWFRole();
	}

	@Override
	public String getLogicName() {
		return String.format("工作流角色[%1$s]", this.getName());
	}
}
