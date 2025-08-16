package net.ibizsys.central.plugin.zk.sysutil;

import org.apache.curator.framework.CuratorFramework;

import net.ibizsys.central.sysutil.ISysUtilRuntime;

/**
 * 系统zk功能运行时对象
 * @author lionlau
 *
 */
public interface ISysZooKeeperUtilRuntime extends ISysUtilRuntime{

	
	
	/**
	 * 获取ZK框架对象
	 * @return
	 */
	CuratorFramework getCuratorFramework();
	
	

	

}
