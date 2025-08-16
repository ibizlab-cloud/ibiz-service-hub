package net.ibizsys.central.cloud.devops.dynamodelapi.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.util.domain.System;
import net.ibizsys.central.cloud.devops.core.addin.DevOpsDynaModelAPIBase;
import net.ibizsys.central.cloud.devops.dynamodelapi.util.PSModelRTStorage;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.psmodel.core.util.IPSModelServiceSession;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceSession;

public class DefaultDevOpsDynaModelAPI extends DevOpsDynaModelAPIBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DefaultDevOpsDynaModelAPI.class);
	
	@Override
	protected Object onInvoke(System system, IPSSystemService iPSSystemService, String strPModelName, String strPKey, String strModelName, String strMethodName, String strKey, Object param) throws Throwable {
		PSModelRTServiceSession psModelServiceSession = new PSModelRTServiceSession();
		psModelServiceSession.setPSSystemService(iPSSystemService);
		
		IPSModelServiceSession lastPSModelServiceSession = PSModelServiceSession.getCurrent(true);
		PSModelRTStorage devOpsDynaModelAPIPSModelRTStorage = new PSModelRTStorage();
		
		psModelServiceSession.setPSModelStorage(devOpsDynaModelAPIPSModelRTStorage);
		try {
			PSModelServiceSession.setCurrent(psModelServiceSession);
			IPSModelRTService iPSModelService = (IPSModelRTService)psModelServiceSession.getPSModelService(strModelName.toUpperCase());
			return iPSModelService.invoke(strPModelName, strPKey, strMethodName, strKey, param);
		}
		finally {
			PSModelServiceSession.setCurrent(lastPSModelServiceSession);
		}
	}
	
}
