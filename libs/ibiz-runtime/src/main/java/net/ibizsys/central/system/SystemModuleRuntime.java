package net.ibizsys.central.system;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.system.IPSSystemModule;

public class SystemModuleRuntime extends SystemModelRuntimeBase implements ISystemModuleRuntime {

	private IPSSystemModule iPSSystemModule = null;
	
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSystemModule iPSSystemModule) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSystemModule = iPSSystemModule;
		this.onInit();
	}

	@Override
	public IPSSystemModule getPSSystemModule() {
		return this.iPSSystemModule;
	}
	
	protected void setPSSystemModule(IPSSystemModule iPSSystemModule) {
		this.iPSSystemModule = iPSSystemModule;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSystemModule();
	}

	public IPSSystemService getPSSystemService() {
		return this.getSystemRuntime().getPSSystemService();
	}
	
	
}
