package net.ibizsys.runtime.util;

/**
 * 行为操作会话后续操作接口，用于完成在事物提交后执行的操作
 * @author lionlau
 *
 */
public interface IASFutureAction {
	
	/**
	 * 获取行为标识
	 * @return
	 */
	String getId();
	
	
	/**
	 * 获取行为标记
	 * @return
	 */
	Object getTag();
	
	/**
	 * 提交
	 */
	void commit();
	
	
	
	/**
	 * 回滚
	 */
	void rollback();
}
