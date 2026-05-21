package net.ibizsys.central.plugin.es.ba;

import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.plugin.es.util.ESClientPool;
import net.ibizsys.central.plugin.es.util.IESAction;

/**
 * ES 大数据体系运行时对象接口
 * @author lionlau
 *
 */
public interface IESBDSchemeRuntime extends ISysBDSchemeRuntime, IESBDSchemeRuntimeBase{

	public final static String BDTYPE_ES = "ES";
	
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
	
	
	
	/**
	 * 执行ES行为
	 * @param iESAction
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object executeESAction(IESAction iESAction, Object[] args) throws Throwable;
}
