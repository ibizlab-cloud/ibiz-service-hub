package net.ibizsys.central.plugin.es.search;

import net.ibizsys.central.plugin.es.ba.IESBDSchemeRuntimeBase;
import net.ibizsys.central.plugin.es.util.ESClientPool;
import net.ibizsys.central.search.ISysSearchSchemeRuntime;

/**
 * ES 检索体系运行时对象接口
 * @author lionlau
 *
 */
public interface IESSearchSchemeRuntime extends ISysSearchSchemeRuntime, IESBDSchemeRuntimeBase {

	public final static String SEARCHENGINETYPE_ELASTICSEARCH = "ELASTICSEARCH";
	
	
	/**
	 * 获取ES客户端连接池
	 * @return
	 */
	ESClientPool getESClientPool();
	

	
//	
//	
//	
//	
//	/**
//	 * 获取索引名称
//	 * @return
//	 */
//	String getIndexName();
}
