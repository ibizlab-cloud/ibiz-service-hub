package net.ibizsys.central.system;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.system.IPSSysModelGroup;


public abstract class SysModelGroupRuntimeBase extends SystemModelRuntimeBase implements ISysModelGroupRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysModelGroupRuntimeBase.class);
	
	private IPSSysModelGroup iPSSysModelGroup = null;
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysModelGroup iPSSysModelGroup) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysModelGroup = iPSSysModelGroup;
		this.onInit();
	}
	
	@Override
	public IPSSysModelGroup getPSSysModelGroup() {
		return this.iPSSysModelGroup;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysModelGroup();
	}
}
