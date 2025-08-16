package net.ibizsys.central.plugin.es.ba;

import net.ibizsys.central.plugin.es.util.ESClientPool;
import net.ibizsys.central.service.ISubSysServiceAPIRuntimeBase;

public interface IESBDSchemeRuntimeBase extends ISubSysServiceAPIRuntimeBase{

	/**
	 * 获取ES客户端连接池
	 * @return
	 */
	ESClientPool getESClientPool();
	
	
	
	/**
	 * 是否启用文档名称作为索引名称
	 * @return
	 */
	boolean isEnableDocIndexName();
}
