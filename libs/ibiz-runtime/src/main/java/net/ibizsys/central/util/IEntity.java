package net.ibizsys.central.util;

import java.util.Map;

public interface IEntity extends net.ibizsys.runtime.util.IEntity {

	/**
	 * 直接获取原始数据Map对象
	 * @return
	 */
	Map<String, Object> any();
	
	
	
	/**
	 * 设置指定属性值
	 * @param strName
	 * @param objValue
	 */
	void set(String strName,String strValue);
	
	
	

}
