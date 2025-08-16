package net.ibizsys.central.security;

import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.security.IPSSysUniRes;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IEntity;

public class SysUniResRuntime extends SystemModelRuntimeBase implements ISysUniResRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysUniResRuntime.class);
	private IPSSysUniRes iPSSysUniRes = null;
	private ISystemAccessManager iSystemAccessManager = null;
	
	
	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, ISystemAccessManager iSystemAccessManager, IPSSysUniRes iPSSysUniRes) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSSysUniRes = iPSSysUniRes;
		this.iSystemAccessManager = iSystemAccessManager;
		if(this.iSystemAccessManager == null) {
			this.iSystemAccessManager = this.getSystemRuntime().getSystemAccessManager();
		}
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		
	
		
		super.onInit();
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return getPSSysUniRes();
	}

	

	@Override
	public IPSSysUniRes getPSSysUniRes() {
		return this.iPSSysUniRes;
	}


	
	@Override
	public ISystemAccessManager getSystemAccessManager() {
		return this.iSystemAccessManager;
	}

	@Override
	public boolean test(IUserContext iUserContext, IEntity iEntity) {
		return true;
	}

	@Override
	public String getResCode() {
		return this.getPSSysUniRes().getResCode();
	}

}
