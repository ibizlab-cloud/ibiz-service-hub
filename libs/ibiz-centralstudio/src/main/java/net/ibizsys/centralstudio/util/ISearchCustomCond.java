package net.ibizsys.centralstudio.util;

/**
 * 搜索自定义条件
 * @author lionlau
 *
 */
public interface ISearchCustomCond extends ISearchCond{

	/**
	 * 恒为假条件
	 */
	final public static String FALSE = "1 <> 1";
	
	/**
	 * 恒为真条件
	 */
	final public static String TRUE = "1 = 1";
	
	
	/**
	 * 获取自定义条件
	 * @return
	 */
	String getCustomCond();
}
