package net.ibizsys.central.sysutil;

/**
 * 系统统一状态功能对象
 * @author lionlau
 *
 */
public interface ISysUniStateUtilRuntime extends ISysUtilRuntime, ISysUniStateUtilRuntimeBase{

	/**
	 * 添加主控关系监控
	 * @param strTag
	 */
	void addLeaderLatch(String strTag);
	
	/**
	 * 添加主控关系监控（如果不存在）
	 * @param strTag
	 */
	void addLeaderLatchIf(String strTag);
	
	/**
	 * 移除主控关系监控
	 * @param strTag
	 */
	void removeLeaderLatch(String strTag);
	
	/**
	 * 判断传入路径是否具备主控能力
	 * @param strTag
	 * @return
	 */
	boolean hasLeadership(String strTag);
	
	

}
