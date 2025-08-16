package net.ibizsys.central.plugin.ai.agent;

/**
 * 流水线运行会话对象接口
 * @author lionlau
 *
 */
public interface IAIPipelineRunSession {

		
	
	/**
	 * 获取生产线数据
	 * @return
	 */
	Object getData();
	
	
	
	/**
	 * 设置参数
	 * @param strKey
	 * @param value
	 */
	void setParam(String strKey, Object value);
	
	
	/**
	 * 获取参数
	 * @param strKey
	 * @return
	 */
	Object getParam(String strKey);
	
	
	/**
	 * 重置参数
	 * @param strKey
	 * @return
	 */
	Object resetParam(String strKey);
}
