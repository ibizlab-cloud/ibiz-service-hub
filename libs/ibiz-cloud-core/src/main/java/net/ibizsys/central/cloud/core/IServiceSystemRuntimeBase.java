package net.ibizsys.central.cloud.core;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.util.IConfigListenerRepo;
import net.ibizsys.central.cloud.core.util.ICredentialRepo;

public interface IServiceSystemRuntimeBase extends ISystemRuntime{
	/**
	 * 获取配置侦听器仓库对象
	 * @return
	 */
	IConfigListenerRepo getConfigListenerRepo();

	
	/**
	 * 获取凭证仓库
	 * @return
	 */
	ICredentialRepo getCredentialRepo();
}
