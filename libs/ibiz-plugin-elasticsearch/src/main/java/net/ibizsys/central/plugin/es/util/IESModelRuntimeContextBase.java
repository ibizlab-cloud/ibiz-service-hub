package net.ibizsys.central.plugin.es.util;

public interface IESModelRuntimeContextBase {

	/**
	 * 获取文档对应的索引名称
	 * @param strDocName
	 * @return
	 */
	String getIndexName(String strDocName);
}
