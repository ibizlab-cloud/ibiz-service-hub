package cn.ibizlab.central.plugin.odoo.bi;

import net.ibizsys.central.bi.ISysBICubeRuntime;
import net.ibizsys.central.plugin.util.bi.SimpleSysBISchemeRuntime;
import net.ibizsys.model.bi.IPSSysBICube;

public class OdooSysBISchemeRuntime extends SimpleSysBISchemeRuntime{

	@Override
	protected ISysBICubeRuntime createSysBICubeRuntime(IPSSysBICube iPSSysBICube) {
		return new OdooSysBICubeRuntime();
	}
}
