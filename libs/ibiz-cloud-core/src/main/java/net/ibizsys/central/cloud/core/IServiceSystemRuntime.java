package net.ibizsys.central.cloud.core;

import java.util.Collection;

import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEService;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.ISystemAccessManager;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.cloud.core.util.IChatResourceUtils;
import net.ibizsys.central.cloud.core.util.IConfigListenerRepo;
import net.ibizsys.central.cloud.core.util.IRTCodeUtils;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2SystemMerge;
import net.ibizsys.central.cloud.core.util.groovy.ISystemRTGroovyContext;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.model.res.IPSSysContent;
import net.ibizsys.model.system.IPSSysRef;

public interface IServiceSystemRuntime extends IServiceSystemRuntimeBase,ISystemUtilRuntime {

	/**
	 * 全局插件标识：插件系统运行时
	 */
	final static String GLOBALPLUGIN_ADDINSYSTEMRUNTIME = "GLOBAL_ADDINSYSTEMRUNTIME";
	
	
	/**
	 * 系统事件：系统关闭
	 */
	public final static String SYSTEMEVENT_SHUTDOWN = "SHUTDOWN";
	
	
	/**
	 * 系统事件：CLOUD事件前缀
	 */
	public final static String SYSTEMEVENT_CLOUD_PREFIX = "CLOUD:";
	
	/**
	 * Cloud配置标识：系统事件前缀
	 */
	public final static String CLOUDCONFIGID_SYSTEMEVENT_PREFIX = "systemevent-" ;
	
	/**
	 * 系统扩展内容的内容分类代码标识
	 */
	public final static String EXTENSION_PSSYSCONTENTCAT = "EXTENSION";
	
	
	
//	/**
//	 * 主系统实体事件侦听器前缀
//	 */
//	public final static String ADDIN_DATAENTITYEVENTLISTENEREX_PREFIX = "DATAENTITYEVENTLISTENEREX:";
//	
//	
//	/**
//	 * 主系统实体行为逻辑附加前缀
//	 */
//	public final static String ADDIN_DEACTIONLOGICEX_PREFIX = "DEACTIONLOGICEX:";
	
	
	
	/**
	 * 参数：启用的服务接口，忽略服务总线默认接口
	 */
	public final static String PARAM_ENABLEAPIS_NOSERVICEHUB = "-noservicehub";
	
	
	
	/**
	 * 参数：数据流系统标识
	 */
	public final static String PARAM_DATAFLOWSYSTEMID = "dataflowsystemid";
	
	
	
	
	/**
	 * 参数：v2部署系统
	 */
	public final static String PARAM_V2DEPLOYSYSTEM = "v2deploysystem";

	
	/**
	 * 参数：v2系统合并
	 */
	public final static String PARAM_V2SYSTEMMERGE = "v2systemmerge";
	
	
	/**
	 * 参数：主系统标识
	 */
	public final static String PARAM_MAINSYSTEMID = "mainsystemid";
	
	/**
	 * 参数：主系统运行时
	 */
	public final static String PARAM_MAINSYSTEMRUNTIME = "mainsystemruntime";
	
	
	/**
	 * 参数：合并系统集合
	 */
	public final static String PARAM_MERGESYSTEMS = "mergesystems";
	
	/**
	 * 参数：更新数据库体系
	 */
	public final static String PARAM_UPDATEDBSCHEMA = "updatedbschema";
	
	
	/**
	 * 参数：默认OSS文件夹
	 */
	public final static String PARAM_OSSFOLDER = "ossfolder";
	
	/**
	 * 获取系统访问管理对象
	 */
	ISystemAccessManager getSystemAccessManager();
	
	
	/**
	 * 获取系统功能运行时
	 * @param cls
	 * @param bTryMode
	 * @param bSystemOnly 仅从当前系统获取
	 * @return
	 */
	<T> T getSysUtilRuntime(Class<T> cls, boolean bTryMode, boolean bSystemOnly);
	
	
	
	/**
	 * 调用获取应用数据
	 * @param strSystemTag
	 * @param strOrgId
	 * @param iAuthenticationUser
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	AppData invokeGetAppData(String strSystemTag, String strOrgId, IAuthenticationUser iAuthenticationUser, Object objTag) throws Throwable;
	
	
	/**
	 * 调用获取应用数据
	 * @param strDCSystemTag
	 * @param iAuthenticationUser
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	AppData invokeGetAppData(String strDCSystemTag, IAuthenticationUser iAuthenticationUser, Object objTag) throws Throwable;
	
	
	/**
	 * 是否启用默认的服务总线系统接口
	 * @return
	 */
	boolean isEnableServiceHubAPI();
	
	
	
	/**
	 * 关闭系统，执行释放
	 */
	void shutdown();
	
	
	
	/**
	 * 是否启用运行时代码模式
	 * @return
	 */
	boolean isEnableRTCodeMode();
	
	
	
	/**
	 * 是否启用生产模式
	 * @return
	 */
	boolean isEnableProdMode();
	
	
	
	/**
	 * 获取主系统标识
	 * @return
	 */
	String getMainSystemId();
	
	
	
	
	/**
	 * 获取主系统运行时
	 * @param bTryMode
	 * @return
	 */
	IServiceSystemRuntime getMainSystemRuntime(boolean bTryMode);
	
	
	/**
	 * 获取数据流系统标识
	 * @return
	 */
	String getDataFlowSystemId();
	

	
	/**
	 * 获取RT代码功能组件
	 * @return
	 */
	IRTCodeUtils getRTCodeUtils();
	
	
	
	/**
	 * 获取V2部署系统信息
	 * @return
	 */
	V2DeploySystem getV2DeploySystem();
	
	
	/**
	 * 获取V2合并系统信息
	 * @return
	 */
	V2SystemMerge getV2SystemMerge();
	
	
	
	/**
	 * 获取V2系统标识
	 * @return
	 */
	String getV2SystemId();
	
	
	
	/**
	 * 是否支持扩展
	 * @return
	 */
	boolean isEnableExtension();
	
	
	
	/**
	 * 获取扩展标识
	 * @return
	 */
	String getExtensionId();
	
	
	/**
	 * 获取扩展会话标识
	 * @return
	 */
	String getExtensionSessionId();
	
	
	
	/**
	 * 获取扩展系统引用运行时集合
	 * @param 是否包含原始引用模型
	 * @return
	 */
	Collection<IExtensionSysRefRuntime> getExtensionSysRefRuntimes(boolean bIncludeOrigin);
	
	
	
	/**
	 * 注册扩展系统引用运行时
	 * @param iPSSysRef
	 * @return
	 */
	IExtensionSysRefRuntime registerExtensionSysRefRuntime(IPSSysRef iPSSysRef);
	
	
	
	/**
	 * 注销扩展系统引用运行时
	 * @param iPSSysRef
	 */
	void unregisterExtensionSysRefRuntime(IPSSysRef iPSSysRef);
	
	
	/**
	 * 获取扩展系统应用运行时
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IExtensionSysRefRuntime getExtensionSysRefRuntime(String strTag, boolean bTryMode);
	
	/**
	 * 注销全部扩展系统引用运行时
	 */
	void unregisterExtensionSysRefRuntimes();
	
	
	/**
	 * 获取系统合并会话标识
	 * @return
	 */
	String getSystemMergeSessionId();
	
	
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.central.ISystemRuntime#getSystemRTGroovyContext()
	 */
	ISystemRTGroovyContext getSystemRTGroovyContext();
	
	
	
	
	/**
	 * 建立插件系统运行时
	 * @param deploySystem
	 * @return
	 */
	IServiceSystemRuntime createAddinSystemRuntime(DeploySystem deploySystem);
	
	
	
	/**
	 * 获取合并的系统标识集合
	 * @return
	 */
	Collection<String> getMergeSystemIds();
	
	
	/**
	 * 是否更新数据库体系
	 * @return
	 */
	boolean isUpdateDBSchema();
	
	
	
	/**
	 * 获取默认的OSS文件夹
	 * @return
	 */
	String getOSSFolder();
	
	
	/**
	 * 获取扩展系统内容模型对象
	 * @param strPath
	 * @param bTryMode
	 * @return
	 */
	IPSSysContent getExtensionPSSysContent(String strPath, boolean bTryMode);
	
	
	/**
	 * 是否有扩展定义的系统内容
	 * @return
	 */
	boolean hasExtensionPSSysContent();
	
//	/**
//	 * 是否支持扩展内容
//	 * @return
//	 */
//	boolean isEnableExtensionContent();
	
	/**
	 * 获取系统AI工厂运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysAIFactoryRuntime getSysAIFactoryRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取系统AI工厂运行时对象
	 * 
	 * @param iPSSysAIFactory
	 * @return
	 */
	ISysAIFactoryRuntime getSysAIFactoryRuntime(IPSSysAIFactory iPSSysAIFactory);
	
	
	
	
	/**
	 * 获取代理的实体服务对象
	 * @param cls
	 * @return
	 */
	<T> T getProxyDEService(Class<? extends IProxyDEService> cls);
	
	
	
	/**
	 * 获取 AI 聊天资源辅助对象
	 * @return
	 */
	IChatResourceUtils getChatResourceUtils();
}
