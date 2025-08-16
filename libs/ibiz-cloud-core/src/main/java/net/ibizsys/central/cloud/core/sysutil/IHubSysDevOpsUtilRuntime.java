package net.ibizsys.central.cloud.core.sysutil;

/**
 * 服务总线DevOps功能运行时对象接口
 * @author lionlau
 *
 */
public interface IHubSysDevOpsUtilRuntime extends IHubSysUtilRuntime{

	/**
	 * DevOps组件操作：重新加载系统
	 */
	public final static String DEVOPSACTION_RELOADSYSTEM = "RELOADSYSTEM";
	
	
	
	/**
	 * DevOps组件操作：应用热代码
	 */
	public final static String DEVOPSACTION_APPLYHOTCODE = "APPLYHOTCODE";
}
