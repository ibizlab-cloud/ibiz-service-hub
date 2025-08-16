package net.ibizsys.runtime.util;

/**
 * 只读数据对象接口
 * @author lionlau
 *
 */
public interface IReadOnlyEntity extends IEntityBase{

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
	
}
