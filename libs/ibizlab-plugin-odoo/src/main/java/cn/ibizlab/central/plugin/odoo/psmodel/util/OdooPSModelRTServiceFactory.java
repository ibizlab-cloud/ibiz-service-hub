package cn.ibizlab.central.plugin.odoo.psmodel.util;

import net.ibizsys.central.plugin.extension.psmodel.util.PSModelRTServiceFactory;

public class OdooPSModelRTServiceFactory extends PSModelRTServiceFactory {

	public OdooPSModelRTServiceFactory() {
		super();
		registerPSModelRTServices(this);
	}
	
	private static void registerPSModelRTServices(PSModelRTServiceFactory instance) {
        instance.registerPSModelService("PSCOREPRDFUNC", cn.ibizlab.central.plugin.odoo.psmodel.service.OdooPSCorePrdFuncRTService.class);
        instance.registerPSModelService("PSCOREPRDFUNCS", cn.ibizlab.central.plugin.odoo.psmodel.service.OdooPSCorePrdFuncRTService.class);
	}
}
