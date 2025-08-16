package net.ibizsys.runtime.dataentity.print;

import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体打印运行时上下文对象接口
 * @author lionlau
 *
 */
public interface IDEPrintRuntimeContext {

	/**
	 * 获取用户上下文对象
	 * @return
	 */
	IUserContext getUserContext();
	
	
	/**
	 * 获取内容类型
	 * @return
	 */
	String getContentType();
	
	
	
	/**
	 * 判断是否包含指定属性
	 * 
	 * @param strName
	 * @return
	 */
	boolean contains(String strName);
	
	
	/**
	 * 获取对应属性的值
	 * 
	 * @param strName 属性名称
	 * @return 返回指定属性名称的值，不存在时返回null
	 */
	Object get(String strName);
	
	
	
	
	/**
	 * 获取当前数据对象
	 * @return
	 */
	IEntityBase getEntity();
}
