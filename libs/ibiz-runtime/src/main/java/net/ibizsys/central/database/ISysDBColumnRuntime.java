package net.ibizsys.central.database;

import net.ibizsys.model.database.IPSSysDBColumn;
import net.ibizsys.runtime.IModelRuntime;

public interface ISysDBColumnRuntime extends IModelRuntime{

	void init(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, IPSSysDBColumn iPSSysDBColumn) throws Exception;
	
	
	
	IPSSysDBColumn getPSSysDBColumn();
	
	
	/**
	 * 获取标准名称
	 * @return
	 */
	String getStandardName();
	
	
	
	/**
	 * 字段长度
	 * @return
	 */
	int getLength();
	
	
	/**
	 * 逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 字段精度
	 * @return
	 */
	int getPrecision();
	
	

	/**
	 * 标准数据类型
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 自增列
	 * @return
	 */
	boolean isAutoIncrement();
	
	
	/**
	 * 外键
	 * @return
	 */
	boolean isFKey();
	
	
	/**
	 * 允许空值输入
	 * @return
	 */
	boolean isNullable();
	
	
	/**
	 * 主键
	 * @return
	 */
	boolean isPKey();
	
	
	/**
	 * 无符号列
	 * @return
	 */
	boolean isUnsigned();
	
	
	/**
	 * 数据项名称
	 * @return
	 */
	java.lang.String getDataItemName();
}
