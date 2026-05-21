package net.ibizsys.central.plugin.es.util;

import org.elasticsearch.client.RestClient;

public interface IESAction {

	/**
	 * 执行作业
	 * 
	 * @param args
	 * @throws Exception
	 */
	Object execute(IESModelRuntimeContextBase iESModelRuntimeContextBase, RestClient httpESClient, Object[] args) throws Throwable;
}
