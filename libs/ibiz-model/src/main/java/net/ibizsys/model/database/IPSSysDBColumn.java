package net.ibizsys.model.database;



/**
 * 数据库列对象接口
 *
 */
public interface IPSSysDBColumn extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取数据列标记
	 * @return
	 */
	java.lang.String getColumnTag();
	
	
	/**
	 * 获取数据列标记2
	 * @return
	 */
	java.lang.String getColumnTag2();
	
	
	/**
	 * 获取建立SQL
	 * @return
	 */
	java.lang.String getCreateSql();
	
	
	/**
	 * 获取数据类型
	 * @return
	 */
	java.lang.String getDataType();
	
	
	/**
	 * 获取默认值
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取移除SQL
	 * @return
	 */
	java.lang.String getDropSql();
	
	
	/**
	 * 获取字段长度
	 * @return
	 */
	int getLength();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取字段精度
	 * @return
	 */
	int getPrecision();
	
	
	/**
	 * 获取引用数据列
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBColumn getRefPSSysDBColumn();


	/**
	 * 获取引用数据列，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBColumn getRefPSSysDBColumnMust();
	
	
	/**
	 * 获取引用数据表
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBTable getRefPSSysDBTable();


	/**
	 * 获取引用数据表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBTable getRefPSSysDBTableMust();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取是否自增列
	 * @return
	 */
	boolean isAutoIncrement();
	
	
	/**
	 * 获取是否外键
	 * @return
	 */
	boolean isFKey();
	
	
	/**
	 * 获取是否允许空值输入
	 * @return
	 */
	boolean isNullable();
	
	
	/**
	 * 获取是否主键
	 * @return
	 */
	boolean isPKey();
	
	
	/**
	 * 获取是否无符号列
	 * @return
	 */
	boolean isUnsigned();
}