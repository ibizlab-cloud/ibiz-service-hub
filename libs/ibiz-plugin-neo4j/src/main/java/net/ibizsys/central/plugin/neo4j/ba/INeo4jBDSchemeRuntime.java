package net.ibizsys.central.plugin.neo4j.ba;

import org.neo4j.driver.Driver;

import net.ibizsys.central.ba.ISysBDSchemeRuntime;

public interface INeo4jBDSchemeRuntime extends ISysBDSchemeRuntime {

	/**
	 * 获取Neo4j驱动
	 * @return
	 */
	Driver getDriver();
}
