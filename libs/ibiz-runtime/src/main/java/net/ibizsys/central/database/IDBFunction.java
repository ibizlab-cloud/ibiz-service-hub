package net.ibizsys.central.database;


/**
 * 数据库函数对象
 * @author Administrator
 *
 */
public interface IDBFunction {

	
	/**
	 * 获取名称
	 * @return
	 */
	String getName();
	
	
	/**
	 * 获取数据库的函数代码
	 * @param args
	 * @param bInsert 插入时使用
	 * @return
	 * @throws Throwable
	 */
	String getFuncSQL(String[] args, boolean bInsert) throws Throwable;
	
	/**
	 * 获取数据库的函数代码
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	String getFuncSQL(String[] args) throws Throwable;
	
	
	/**
	 * 获取返回的数据类型
	 * @return
	 */
	int getOutputDataType();
}
