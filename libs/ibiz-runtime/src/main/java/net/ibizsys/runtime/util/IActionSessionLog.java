package net.ibizsys.runtime.util;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.runtime.IModelRuntime;

/**
 * 行为会话日志
 * @author lionlau
 *
 */
public interface IActionSessionLog {

	/**
	 * 获取父日志对象
	 * @return
	 */
	IActionSessionLog getParent();
	
	
	/**
	 * 获取根日志对象，如未指定则返回当前
	 * @return
	 */
	IActionSessionLog getRoot();
	
	/**
	 * 获取持续时间
	 * @return
	 */
	long getTime();
	
	/**
	 * 获取开始时间
	 * @return
	 */
	long getBeginTime();
	
	/**
	 * 获取结束时间
	 * @return
	 */
	long getEndTime();
	
	/**
	 * 获取实体名称
	 * @return
	 */
	String getDEName();
	
	/**
	 * 获取行为名称
	 * @return
	 */
	String getAction();
	
	/**
	 * 获取信息
	 * @return
	 */
	String getInfo();
	
	
	/**
	 * 是否错误
	 * @return
	 */
	boolean isError();
	
	
	
	/**
	 * 获取错误原因
	 * @return
	 */
	Throwable getCause();
	
	/**
	 * 获取所属的模型运行时
	 * @return
	 */
	IModelRuntime getModelRuntime();
	
	
	/**
	 * 导出Json对象
	 * @return
	 */
	ObjectNode toObjectNode();
	
	
	/**
	 * 输出信息
	 * @param bJsonDetail 明细信息以Json形式输出
	 * @return
	 */
	String toString(boolean bJsonDetail);
}
