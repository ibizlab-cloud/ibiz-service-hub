package net.ibizsys.central.service;

/**
 * 外部服务接口实体方法脚本运行时上下文对象
 * @author lionlau
 *
 */
public interface ISubSysSADEMethodRTScriptContext {

	/**
	 * 接口对象名称
	 * @return
	 */
	String getDename();
	
	/**
	 * 请求路径
	 * @return
	 */
	String getPath();
	
	
	/**
	 * 请求类型
	 * @return
	 */
	String getMethod();
	
	
	/**
	 * 方法类型
	 * @return
	 */
	String getType();
	
	
	
	/**
	 * 代码标识
	 * @return
	 */
	String getCodename();
	
	
	
	/**
	 * 方法标记
	 * @return
	 */
	String getTag();
	
	
	
	/**
	 * 方法标记2
	 * @return
	 */
	String getTag2();
	
	
	
	/**
	 * 请求内容类型
	 * @return
	 */
	String getContenttype();
	
	
	
	/**
	 * 获取方法输入对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput getInput();


	
	/**
	 * 获取方法返回对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn getReturn();
}
