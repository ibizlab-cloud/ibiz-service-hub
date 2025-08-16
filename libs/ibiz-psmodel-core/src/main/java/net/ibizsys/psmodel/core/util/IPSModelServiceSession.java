package net.ibizsys.psmodel.core.util;

/**
 * 平台标准模型服务会话对象接口
 * @author lionlau
 *
 */
public interface IPSModelServiceSession {

	/**
	 * 获取会话参数名称
	 * @param name
	 * @return
	 */
	Object getParam(String name);
	
	
	/**
	 * 设置会话参数
	 * @param name
	 * @param value
	 */
	void setParam(String name, Object value);
	
	
	
	
	/**
	 * 移除会话参数
	 * @param name
	 */
	void removeParam(String name);
	
	
	/**
	 * 获取模型存储对象
	 * @return
	 * @throws Exception
	 */
	IPSModelStorage getPSModelStorage() throws Exception;
	
	/**
	 * 获取模型存储对象
	 * @param tryMode 尝试模式
	 * @return
	 */
	IPSModelStorage getPSModelStorage(boolean tryMode) throws Exception;
	
	
	
	IPSModelService getPSModelService(String modelName) throws Exception;
	

	IPSModelService getPSModelService(String modelName, boolean tryMode) throws Exception;
	
	
	
	
	
	
	
	
}
