package net.ibizsys.model.database;



/**
 *
 */
public interface IPSDEFDTColumn extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取列名称
	 * @return
	 */
	String getColumnName();
	
	
	/**
	 * 获取数据库类型
	 * @return
	 */
	String getDBType();
	
	
	/**
	 * 获取公式列参数
	 * @return
	 */
	String getFormulaColumns();
	
	
	/**
	 * 获取公式列格式
	 * @return
	 */
	String getFormulaFormat();
	
	
	/**
	 * 获取查询代码表达式
	 * @return
	 */
	String getQueryCodeExp();
	
	
	/**
	 * 获取标准列名
	 * @return
	 */
	String getStandardColumnName();
	
	
	/**
	 * 获取是否自增列
	 * @return
	 */
	boolean isAutoIncrement();
	
	
	/**
	 * 获取是否自动产生值
	 * @return
	 */
	boolean isValueAutoGen();
}