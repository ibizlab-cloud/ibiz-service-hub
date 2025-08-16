package net.ibizsys.runtime.util.groovy;

public interface ISystemRTGroovyContext {

	public final static String PROPERTY_SYS = "sys";
	
	public final static String PROPERTY_USER = "user";
	
	public final static String PROPERTY_LOG = "log";
	
	public final static String PROPERTY_CONTEXT = "context";
	
	/**
	 * 获取系统相关的运行时对象
	 * @param theClass
	 * @param tag
	 * @return
	 */
	Object getModelRuntime(Class<?> theClass, String tag);
	
	
	/**
	 * 获取系统相关的运行时对象
	 * @param type
	 * @param tag
	 * @return
	 */
	Object getModelRuntime(String type, String tag);
	
}
