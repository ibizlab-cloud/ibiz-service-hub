package net.ibizsys.central.cloud.saas.extension.runtime;

import net.ibizsys.central.cloud.core.ServiceSystemRuntime;
import net.ibizsys.central.cloud.core.security.ISystemAccessManager;
import net.ibizsys.central.cloud.saas.extension.runtime.security.SystemAccessManager;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelServiceImpl;

public class SystemRuntime extends ServiceSystemRuntime {

	@Override
	protected IPSSystemService createPSSystemService() throws Exception {
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath("/sysmodel/saas-extension", true);
		return psModelServiceImpl;
	}

	@Override
	protected ISystemAccessManager createSystemAccessManager() {
		ISystemAccessManager iSystemAccessManager = new SystemAccessManager();
		this.autowareObject(iSystemAccessManager);
		return iSystemAccessManager;
	}

	@Override
	public boolean isEnableRTCodeMode() {
		return false;
	}
}
