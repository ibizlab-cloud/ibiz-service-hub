package cn.ibizlab.central.plugin.odoo.service;

import net.ibizsys.central.service.ISubSysServiceAPIDERuntime;
import net.ibizsys.central.service.SubSysServiceAPIRuntime;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;

/**
 * Odoo服务接口客户端运行时
 * 
 * @author lionlau
 *
 */
public class OdooSubSysServiceAPIRuntime extends SubSysServiceAPIRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(OdooSubSysServiceAPIRuntime.class);

	public final static String APITAG_ODOOCLIENT = "ODOOCLIENT";

	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	protected ISubSysServiceAPIDERuntime createSubSysServiceAPIDERuntime(IPSSubSysServiceAPIDE iPSSubSysServiceAPIDE) throws Exception {
		return new OdooSubSysServiceAPIDERuntime();
	}

}
