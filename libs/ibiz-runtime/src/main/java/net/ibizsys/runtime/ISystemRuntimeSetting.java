package net.ibizsys.runtime;

import java.util.Map;
import java.util.Set;

/**
 * 系统运行时设置
 * @author lionlau
 *
 */
public interface ISystemRuntimeSetting extends IModelRuntimeSetting{

	/**
	 * 配置目录：系统后台插件
	 */
	final static String CONFIGFOLDER_SYSSFPLUGIN = "syssfplugin";
	
	/**
	 * 配置目录：实体
	 */
	final static String CONFIGFOLDER_DATAENTITY = "dataentity";
	
	
	/**
	 * 配置目录：系统值转换器
	 */
	final static String CONFIGFOLDER_SYSTRANSLATOR = "systranslator";
	
	
	
	/**
	 * 配置目录：系统值序列
	 */
	final static String CONFIGFOLDER_SYSSEQUENCE = "syssequence";
	
		
	/**
	 * 配置目录：系统消息模板
	 */
	final static String CONFIGFOLDER_SYSMSGTEMPL = "sysmsgtempl";
	
	
	/**
	 * 配置目录：系统消息队列
	 */
	final static String CONFIGFOLDER_SYSMSGQUEUE = "sysmsgqueue";
	
	/**
	 * 配置目录：系统消息目标
	 */
	final static String CONFIGFOLDER_SYSMSGTARGET = "sysmsgtarget";
	
	
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
	 * @param nDefault
	 * @return
	 */
	long getParam(String strKey, long nDefault);
	
	
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
	 * 设置动态配置参数
	 * @param strKey
	 * @param objValue
	 */
	void setParam(String strKey, Object objValue);
	
	
	
	
	
	/**
	 * 获取指定父键的参数集合
	 * @param strPKey
	 * @param params
	 * @return
	 */
	Map<String, Object> getParams(String strPKey, Map<String, Object> params);
	
	
	
	/**
	 * 设置参数集合，附加父键
	 * @param strPKey
	 * @param params
	 */
	void setParams(String strPKey, Map<String, Object> params);
	
	
	/**
	 * 设置参数集合，附加父键（目标键不存在时）
	 * @param strPKey
	 * @param params
	 */
	void setParamsIf(String strPKey, Map<String, Object> params);
	
	
	/**
	 * 判断指定参数是否存在
	 * @param strKey
	 * @return
	 */
	boolean containsParam(String strKey);
	
	
	
	/**
	 * 删除参数
	 * @param strKey
	 */
	void removeParam(String strKey);
	
	/**
	 * 删除指定父键名参数
	 * @param strKey
	 */
	void removeParams(String strPKey);
	
	
	/**
	 * 删除键名集合
	 * @param keys
	 */
	void removeParams(Set<String> keys);
}
