package cn.ibizlab.central.plugin.odoo.psmodel.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.plugin.extension.psmodel.service.PSCorePrdFuncRTService;
import net.ibizsys.psmodel.core.domain.PSCorePrdFunc;

public class OdooPSCorePrdFuncRTService extends PSCorePrdFuncRTService {

	private static final Log log = LogFactory.getLog(OdooPSCorePrdFuncRTService.class);
	
	@Override
	protected Object doInstall(PSCorePrdFunc m) throws Exception {
		// TODO Auto-generated method stub
		return super.doInstall(m);
	}
	
	
	@Override
	protected Object doUninstall(PSCorePrdFunc m) throws Exception {
		// TODO Auto-generated method stub
		return super.doUninstall(m);
	}
	
	
}
