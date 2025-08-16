package net.ibizsys.central.plugin.neo4j.dataentity.action;

import net.ibizsys.central.dataentity.action.DEActionRuntimeBase;
import net.ibizsys.central.plugin.neo4j.ba.INeo4jBDSchemeRuntime;

public abstract class Neo4jDEActionRuntimeBase extends DEActionRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Neo4jDEActionRuntimeBase.class);
	private INeo4jBDSchemeRuntime iNeo4jBDSchemeRuntime = null;
	
	protected INeo4jBDSchemeRuntime getNeo4jBDSchemeRuntime() throws Exception {
		if(this.iNeo4jBDSchemeRuntime == null) {
			if(this.getDataEntityRuntime().getSysBDSchemeRuntime() instanceof INeo4jBDSchemeRuntime) {
				this.iNeo4jBDSchemeRuntime = (INeo4jBDSchemeRuntime)this.getDataEntityRuntime().getSysBDSchemeRuntime();
			}
			if(this.iNeo4jBDSchemeRuntime == null) {
				throw new Exception("Neo4j数据库运行时对象无效");
			}
		}
		return this.iNeo4jBDSchemeRuntime;
	}
}
