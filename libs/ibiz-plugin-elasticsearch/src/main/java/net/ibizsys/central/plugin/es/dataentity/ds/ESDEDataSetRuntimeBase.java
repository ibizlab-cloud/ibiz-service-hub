package net.ibizsys.central.plugin.es.dataentity.ds;

import net.ibizsys.central.dataentity.ds.DEDataSetRuntimeBase;
import net.ibizsys.central.plugin.es.ba.IESBDSchemeRuntime;

public abstract class ESDEDataSetRuntimeBase extends DEDataSetRuntimeBase {

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
