package net.ibizsys.runtime.util;

import org.springframework.data.domain.Sort;

/**
 * 搜索上下文对象接口
 * @author lionlau
 *
 */
public interface ISearchContext extends ISearchContextBase,IEntity{

	/**
	 * 起始页码
	 */
	final static int STARTPAGE = 0;
	
	
	/**
	 * 默认页大小
	 */
	final static int DEFAULTPAGESIZE = 1000;
	
	/**
	 * 获取分页排序信息
	 * @return
	 */
	Sort getPageSort();
	
	
	/**
	 * 设置分页排序信息
	 */
	void setPageSort(Sort sort);
	
	
	/**
	 * 获取是否填充动态扩展属性
	 * @return
	 */
	boolean isFillDynaFields();
	
	
	/**
	 * 设置是否填充动态扩展属性
	 * @param bFillDynaFields
	 */
	void setFillDynaFields(boolean bFillDynaFields);
	
	
	/**
	 * 获取是否填充动态计算属性
	 * @return
	 */
	boolean isFillComputedFields();
	
	
	
	/**
	 * 设置是否填充动态计算属性
	 * @param bFillComputedFields
	 */
	void setFillComputedFields(boolean bFillComputedFields);
}
