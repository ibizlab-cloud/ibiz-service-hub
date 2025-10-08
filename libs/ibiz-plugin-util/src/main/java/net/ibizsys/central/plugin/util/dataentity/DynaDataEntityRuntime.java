package net.ibizsys.central.plugin.util.dataentity;

import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.plugin.util.dataentity.ds.RealtimeDEDataQueryCodeRuntime;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;

public class DynaDataEntityRuntime extends DataEntityRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DynaDataEntityRuntime.class);
	
	@Override
	protected IDEDataQueryCodeRuntime createDefaultDEDataQueryCodeRuntime(IPSDEDataQueryCode iPSDEDataQueryCode) {
		return new RealtimeDEDataQueryCodeRuntime();
	}

}
