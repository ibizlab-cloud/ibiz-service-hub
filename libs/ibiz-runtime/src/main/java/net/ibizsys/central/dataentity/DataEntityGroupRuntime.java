package net.ibizsys.central.dataentity;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.dataentity.IPSDEGroup;

public class DataEntityGroupRuntime extends SystemModelRuntimeBase implements IDataEntityGroupRuntime {

	private IPSDEGroup iPSDEGroup = null;
	
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSDEGroup iPSDEGroup) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSDEGroup = iPSDEGroup;
		this.onInit();
	}

	@Override
	public IPSDEGroup getPSDEGroup() {
		return this.iPSDEGroup;
	}
	
	protected void setPSDEGroup(IPSDEGroup iPSDEGroup) {
		this.iPSDEGroup = iPSDEGroup;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEGroup();
	}

	public IPSSystemService getPSSystemService() {
		return this.getSystemRuntime().getPSSystemService();
	}
	
	
}
