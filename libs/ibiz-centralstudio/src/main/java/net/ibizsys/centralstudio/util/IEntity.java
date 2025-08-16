package net.ibizsys.centralstudio.util;

import java.io.Serializable;
import java.util.Map;

/**
 * 数据对象
 * @author lionlau
 *
 */
public interface IEntity extends Serializable{

	/**
	 * 获取指定属性值
	 * @param strName
	 * @return
	 */
	Object get(String strName);
	
	
	/**
	 * 判断是否包含指定属性
	 * @param strName
	 * @return
	 */
	boolean contains(String strName);
	
	/**
	 * 设置指定属性值
	 * @param strName
	 * @param objValue
	 */
	void set(String strName,Object objValue);
	
	
	
	/**
	 * 移除属性值
	 * @param strName
	 */
	void reset(String strName);
	
	
	/**
	 * 重置数据对象
	 */
	void resetAll();
	
	/**
	 * 拷贝到目标数据对象
	 * @param iEntity
	 */
	void copyTo(IEntity iEntity);
	
	
	
	/**
	 * 直接获取原始数据Map对象
	 * @return
	 */
	Map<String, Object> any();
}
