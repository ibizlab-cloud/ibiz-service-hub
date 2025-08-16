package net.ibizsys.central.plugin.es.search;

import net.ibizsys.central.search.SysSearchDocRuntimeBase;

public class ESSearchDocRuntimeBase extends SysSearchDocRuntimeBase implements IESSearchDocRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ESSearchDocRuntimeBase.class);
	
	
	
	@Override
	public IESSearchSchemeRuntime getSysSearchSchemeRuntime() {
		return (IESSearchSchemeRuntime)this.getSysSearchSchemeRuntimeContext().getSysSearchSchemeRuntime();
	}
	
//	@Override
//	public String getIndexName() {
//		if("DEFAULT".equalsIgnoreCase(this.getName())) {
//			return this.get
//		}
//		return null;
//	}
}
