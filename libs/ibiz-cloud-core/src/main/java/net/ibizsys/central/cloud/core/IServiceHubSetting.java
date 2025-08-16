package net.ibizsys.central.cloud.core;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;

/**
 * 服务网关配置接口
 * @author lionlau
 *
 */
public interface IServiceHubSetting {

	/**
	 * 服务总线标识
	 * @return
	 */
	String getId();
	
	
	/**
	 * 是否注册命名服务
	 * @return
	 */
	boolean isRegisterNamingService();
	
	
	/**
	 * 是否支持重新加载系统
	 * @return
	 */
	boolean isEnableReloadSystem();
	
	/**
	 * 是否发布配置
	 * @return
	 */
	boolean isPublishConfig();
	
	
	
	/**
	 * 是否支持Servlet应用
	 * @return
	 */
	boolean isEnableServletApp();
	
	
	/**
	 * 是否支持服务应用
	 * @return
	 */
	boolean isEnableServiceApp();
	
	
	/**
	 * 是否启用调试
	 * @return
	 */
	boolean isEnableDebug();
	
	
	/**
	 * 是否启动调试器
	 * @return
	 */
	boolean isStartDebugger();
	
	
	/**
	 * 加载配置
	 */
	void loadConfig();
	
	
	/**
	 * 重新加载配置
	 */
	void reloadConfig();
	
	 
	/**
	 * 获取数据源集合
	 * @return
	 */
	List<DataSource> getDataSources();
	
	/**
	 * 获取部署系统集合
	 * @return
	 */
	List<DeploySystem> getDeploySystems();
	
	
	/**
	 * 获取是否启用应用网关
	 * @return
	 */
	boolean isEnableAppGateway();
	
	
	/**
	 * 获取临时数据存储文件夹
	 * @return
	 */
	String getTempFolder();
	
	
	/**
	 * 获取本地文件存储文件夹
	 * @return
	 */
	String getFileFolder();
	
	
	/**
	 * 获取报表存储文件夹，用于报表输出
	 * @return
	 */
	String getReportFolder();
	
	
	/**
	 * 获取字体存储文件夹，用于报表输出
	 * @return
	 */
	String getFontFolder();
	
	
	/**
	 * 获取动态组件包文件夹
	 * @return
	 */
	String getLibraryFolder();
	
	
	/**
	 * 获取系统模型文件夹
	 * @return
	 */
	String getSystemModelFolder();
	
	
	
	/**
	 * 获取调试器的启动命令
	 * @return
	 */
	String getDebuggerCmd();
	
	
	
	/**
	 * 获取Cloud插件服务标识
	 * @return
	 */
	String getCloudPluginServiceId();
	
	
	
	/**
	 * 是否启用运行时代码模式
	 * @return
	 */
	boolean isEnableRTCodeMode();
	
	
	/**
	 * 获取工作线程核心池数量
	 * @return
	 */
	int getWorkThreadCorePoolSize();
	
	/**
	 * 获取工作线程池最大数量
	 * @return
	 */
	int getWorkThreadMaximumPoolSize();
	
	/**
	 * 获取工作线程池处理队列大小
	 * @return
	 */
	int getWorkThreadBlockingQueueSize();
	
	
	
	/**
	 * 是否启用生产模式
	 * @return
	 */
	boolean isEnableProdMode();


	/**
	 * Git模式调试重载检测间隔时间（毫秒） 设置-1不检测
	 * @return
	 */
	int getMonitorDebugModelPathsTimer();

	
	/**
	 * 是否启用系统模型快照
	 * @return
	 */
	boolean isEnableModelSnapshot();
	
	
	/**
	 * 是否支持系统模型合并
	 * @return
	 */
	boolean isEnableMergeSystem();
	
	
	
	/**
	 * 是否并行加载系统合并
	 * @return
	 */
	boolean isConcurrentLoadSystemMergences();
	
	
	/**
	 * 获取默认系统设置
	 * @return
	 */
	Map<String, Object> getDefaultSystemSettings();
	
	
	
}
