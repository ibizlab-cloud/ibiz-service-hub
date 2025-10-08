package net.ibizsys.runtime.plugin;

public interface IModelRTAddin2 extends IModelRTAddin{
	/**
	 * 注册排序值：优先
	 */
	public final int PRIORITY_PRIMARY = 50;
	
	/**
	 * 注册排序值：默认
	 */
	public final int PRIORITY_DEFAULT = 100;
	
	/**
	 * 获取优先级
	 * @return
	 */
	default int getPriority() {
		return PRIORITY_DEFAULT;
	}
	
	
	/**
	 * 是否启用
	 * @return
	 */
	default boolean isEnabled() {
		return true;
	}
}
