package net.ibizsys.model;



public interface IPSModelSortable{

	
	
	/**
	 * 代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 参数名称
	 * @return
	 */
	java.lang.String getName();
	
	
	/**
	 * 排序值
	 * @return
	 */
	int getOrderValue();
}