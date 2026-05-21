package net.ibizsys.central.plugin.pg.search;

import net.ibizsys.central.cloud.core.search.SysSearchDocRuntimeBase;

public class PGSearchDocRuntimeBase extends SysSearchDocRuntimeBase implements IPGSearchDocRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PGSearchDocRuntimeBase.class);
	
	
	
	@Override
	public IPGSearchSchemeRuntime getSysSearchSchemeRuntime() {
		return (IPGSearchSchemeRuntime)this.getSysSearchSchemeRuntimeContext().getSysSearchSchemeRuntime();
	}
	
//	@Override
//	public String getIndexName() {
//		if("DEFAULT".equalsIgnoreCase(this.getName())) {
//			return this.get
//		}
//		return null;
//	}
}
