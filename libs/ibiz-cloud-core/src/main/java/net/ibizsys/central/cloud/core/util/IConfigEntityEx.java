package net.ibizsys.central.cloud.core.util;

import java.util.Map;
import java.util.Set;

public interface IConfigEntityEx extends IConfigEntity {

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
