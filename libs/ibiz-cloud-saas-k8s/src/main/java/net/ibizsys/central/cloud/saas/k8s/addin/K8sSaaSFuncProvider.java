package net.ibizsys.central.cloud.saas.k8s.addin;

import net.ibizsys.central.cloud.core.util.domain.SaaSFunc;
import net.ibizsys.central.cloud.saas.core.addin.ISaaSFuncAgent;
import net.ibizsys.central.cloud.saas.core.addin.SaaSFuncProviderBase;

public class K8sSaaSFuncProvider extends SaaSFuncProviderBase {

	@Override
	public ISaaSFuncAgent createSaaSFuncAgent(SaaSFunc saaSFunc) {
		ISaaSFuncAgent iSaaSFuncAgent = new K8sSaaSFuncAgent();
		this.getSystemRuntime().autowareObject(iSaaSFuncAgent);
		return iSaaSFuncAgent;
	}

}
