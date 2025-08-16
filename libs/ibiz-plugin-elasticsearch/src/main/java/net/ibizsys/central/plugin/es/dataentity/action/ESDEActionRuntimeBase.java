package net.ibizsys.central.plugin.es.dataentity.action;

import net.ibizsys.central.dataentity.action.DEActionRuntimeBase;
import net.ibizsys.central.plugin.es.ba.IESBDSchemeRuntime;

public abstract class ESDEActionRuntimeBase extends DEActionRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ESDEActionRuntimeBase.class);
	private IESBDSchemeRuntime iESBDSchemeRuntime = null;
	
	protected IESBDSchemeRuntime getESBDSchemeRuntime() throws Exception {
		if(this.iESBDSchemeRuntime == null) {
			if(this.getDataEntityRuntime().getSysBDSchemeRuntime() instanceof IESBDSchemeRuntime) {
				this.iESBDSchemeRuntime = (IESBDSchemeRuntime)this.getDataEntityRuntime().getSysBDSchemeRuntime();
			}
			if(this.iESBDSchemeRuntime == null) {
				throw new Exception("ES数据库运行时对象无效");
			}
		}
		return this.iESBDSchemeRuntime;
	}
	
}
