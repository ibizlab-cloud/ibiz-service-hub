package net.ibizsys.model.database;



/**
 * 数据库列对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO}运行时对象
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_CODENAME2}
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取建立SQL
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_CREATESQL}
	 * @return
	 */
	java.lang.String getCreateSql();
	
	
	/**
	 * 获取数据类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_DATATYPE}
	 * @return
	 */
	java.lang.String getDataType();
	
	
	/**
	 * 获取默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_DEFAULTVALUE}
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取移除SQL
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_DROPSQL}
	 * @return
	 */
	java.lang.String getDropSql();
	
	
	/**
	 * 获取字段长度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_LENGTH}
	 * @return
	 */
	int getLength();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取字段精度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_PRECISION2}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_STDDATATYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取是否自增列
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_IDENTITYMODE}
	 * @return
	 */
	boolean isAutoIncrement();
	
	
	/**
	 * 获取是否外键
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_FKEY}
	 * @return
	 */
	boolean isFKey();
	
	
	/**
	 * 获取是否允许空值输入
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_ALLOWEMPTY}
	 * @return
	 */
	boolean isNullable();
	
	
	/**
	 * 获取是否主键
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_PKEY}
	 * @return
	 */
	boolean isPKey();
	
	
	/**
	 * 获取是否无符号列
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO#FIELD_UNSIGNEDMODE}
	 * @return
	 */
	boolean isUnsigned();
}