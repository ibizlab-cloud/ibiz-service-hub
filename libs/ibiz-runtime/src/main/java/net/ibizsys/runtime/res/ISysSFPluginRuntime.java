package net.ibizsys.runtime.res;

import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeContext;

/**
 * 系统后台插件运行时对象
 * @author lionlau
 *
 */
public interface ISysSFPluginRuntime extends ISystemModelRuntime {

	/**
	 * Groovy运行时插件名称
	 */
	public final static String RTOBJECTNAME_GROOVY = "GROOVY";

	
	
	/**
	 * 初始化系统后台插件运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysSFPlugin
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysSFPlugin iPSSysSFPlugin) throws Exception;
	
	
	
	
	/**
	 * 获取后台插件模型对象
	 * @return
	 */
	IPSSysSFPlugin getPSSysSFPlugin();
	
	
	
	/**
	 * 获取运行时对象（是否新建实例由插件决定）
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	<T> T getRuntimeObject(Class<T> cls)throws Exception;
	
	
	
	
	/**
	 * 获取运行时对象（是否新建实例由插件决定）
	 * @return
	 * @throws Exception
	 */
	Object getRuntimeObject()throws Exception;
	
	

	/**
	 * 获取运行时对象
	 * @param cls
	 * @param bNewInstance
	 * @return
	 * @throws Exception
	 */
	<T> T getRuntimeObject(Class<T> cls, boolean bNewInstance)throws Exception;
	
	
	
	
	/**
	 * 获取运行时对象
	 * @param bNewInstance
	 * @return
	 * @throws Exception
	 */
	Object getRuntimeObject(boolean bNewInstance)throws Exception;
	
	
	
	/**
	 * 是否为运行时组件对象
	 * @return
	 */
	boolean isRuntimePlugin();
	
	
	
	
	/**
	 * 获取运行对象名称
	 * @return
	 */
	String getRTObjectName();
	
	
	
	/**
	 * 是否为Groovy运行时插件
	 * @return
	 */
	boolean isGroovyRTObject();
	
	
	
	/**
	 * 获取运行时对象代码
	 * @return
	 */
	String getRTObjectCode();
	
	
	
	/**
	 * 获取全局运行时对象类型
	 * @return
	 */
	Class<?> getGlobalRuntimeObjectClass();
	
	
	/**
	 * 获取全局运行时对象模式
	 * @return
	 */
	String getGlobalRuntimeObjectType();
	
	
	
	
	/**
	 * 获取运行时对象类型
	 * @return
	 */
	Class<?> getRuntimeObjectClass();
}
