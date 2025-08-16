package net.ibizsys.central.cloud.saas.jenkins.addin;

import net.ibizsys.central.cloud.core.util.domain.SaaSFunc;
import net.ibizsys.central.cloud.saas.core.addin.ISaaSFuncAgent;
import net.ibizsys.central.cloud.saas.core.addin.SaaSFuncProviderBase;

public class JenkinsSaaSFuncProvider extends SaaSFuncProviderBase {

	@Override
	public ISaaSFuncAgent createSaaSFuncAgent(SaaSFunc saaSFunc) {
		ISaaSFuncAgent iSaaSFuncAgent = new JenkinsSaaSFuncAgent();
		this.getSystemRuntime().autowareObject(iSaaSFuncAgent);
		return iSaaSFuncAgent;
	}

}
