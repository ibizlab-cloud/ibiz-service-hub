package net.ibizsys.runtime.util;

import java.util.List;

/**
 * 子项计数过滤器
 * @author Administrator
 *
 */
public interface ISearchItemsCond extends ISearchCond{

	
	/**
	 * 获取表达式名称
	 * 
	 * @return
	 */
	String getName();
	
	
	/**
	 * 获取属性名称
	 * @return
	 */
	String getFieldName();
	

	/**
	 * 获取条件操作，值参考 net.ibizsys.runtime.util.Conditions 
	 * 
	 * @return
	 */
	String getCondOp();


////
////	/**
////	 * 是否为逻辑取反模式
////	 * 
////	 * @return
////	 */
////	boolean isNotMode();
////
//	/**
//	 * 获取值的标准数据类型
//	 * 
//	 * @return
//	 */
//	int getDataType();
	
	
	
	/**
	 * 获取值处理函数
	 * @return
	 */
	String getValueFunc();
	
	
	/**
	 * 获取条件对象值
	 * @return
	 */
	Object getValue();

	
	
	/**
	 * 指定值是否来自参数
	 * @return
	 */
	boolean isParamMode();
	
	
	
	
	/**
	 * 获取条件选项
	 * @return
	 */
	int getOption();
	
	
	/**
	 * 获取查询过滤对象集合
	 * @return
	 */
	List<ISearchCond> getSearchConds();
	
	
	
	/**
	 * 获取查询条件，不存在时提供列表
	 * @return
	 */
	List<ISearchCond> getSearchCondsIf();
	
	
	
//	/**
//	 * 获取子项类型
//	 * @return
//	 */
//	String getItemType();
	
	

}
