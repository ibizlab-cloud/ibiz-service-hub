package net.ibizsys.runtime;

import java.util.Map;

/**
 * 模型运行时设置
 * @author lionlau
 *
 */
public interface IModelRuntimeSetting {

	
	/**
	 * 配置分类：自定义参数
	 */
	public static final String CONFIGCAT_PARAM = "param";
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @return
	 */
	Object getParam(String strKey);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	String getParam(String strKey, String strDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	int getParam(String strKey, int nDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param fDefault
	 * @return
	 */
	double getParam(String strKey, double fDefault);
	
	
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param bDefault
	 * @return
	 */
	boolean getParam(String strKey, boolean bDefault);
	
	

	
	/**
	 * 获取指定父键的参数集合
	 * @param strPKey
	 * @param params
	 * @return
	 */
	Map<String, Object> getParams(String strPKey, Map<String, Object> params);
	
	
	
	/**
	 * 判断指定参数是否存在
	 * @param strKey
	 * @return
	 */
	boolean containsParam(String strKey);
	
	

}
