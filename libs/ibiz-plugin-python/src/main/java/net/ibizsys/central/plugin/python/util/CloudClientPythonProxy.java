package net.ibizsys.central.plugin.python.util;

import java.util.Map;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

public class CloudClientPythonProxy implements ICloudClientPythonProxy {

	@Override
	public IWebClientRep<String> get(String url, Map<String, Object> kwargs) {
		
		return null;
	}

	@Override
	public IWebClientRep<String> post(String url, Map<String, Object> kwargs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWebClientRep<String> put(String url, Map<String, Object> kwargs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWebClientRep<String> delete(String url, Map<String, Object> kwargs) {
		// TODO Auto-generated method stub
		return null;
	}

	protected IWebClient getWebClient(String url) {
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) SystemRuntimeHolder.peekMust();
		ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = iServiceSystemRuntime.getSysCloudClientUtilRuntime(false);
		return iSysCloudClientUtilRuntime.getServiceClient(url);
	}
}
