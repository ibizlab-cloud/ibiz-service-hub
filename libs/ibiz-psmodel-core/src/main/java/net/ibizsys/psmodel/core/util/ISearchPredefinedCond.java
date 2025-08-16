package net.ibizsys.psmodel.core.util;

/**
 * 搜索预定义条件
 * @author lionlau
 *
 */
public interface ISearchPredefinedCond extends ISearchCond{

	/**
	 * 获取预定义类型
	 * @return
	 */
	String getPredefinedType();
	
	
	/**
	 * 获取预定义条件
	 * @return
	 */
	String getPredefinedCond();
}
