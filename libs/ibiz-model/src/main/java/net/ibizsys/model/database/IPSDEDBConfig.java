package net.ibizsys.model.database;



/**
 *
 */
public interface IPSDEDBConfig extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取数据库类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBType}
	 * @return
	 */
	java.lang.String getDBType();
	
	
	/**
	 * 获取对象名称转化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_OBJNAMECASE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBObjNameCaseMode}
	 * @return
	 */
	java.lang.String getObjNameCase();
	
	
	/**
	 * 获取标准表名
	 * @return
	 */
	java.lang.String getStandardTableName();
	
	
	/**
	 * 获取表名称
	 * @return
	 */
	java.lang.String getTableName();
	
	
	/**
	 * 获取视图2名称
	 * @return
	 */
	java.lang.String getView2Name();
	
	
	/**
	 * 获取视图3名称
	 * @return
	 */
	java.lang.String getView3Name();
	
	
	/**
	 * 获取视图4名称
	 * @return
	 */
	java.lang.String getView4Name();
	
	
	/**
	 * 获取视图名称
	 * @return
	 */
	java.lang.String getViewName();
	
	
	/**
	 * 获取是否自定义表或视图名称
	 * @return
	 */
	boolean isCustomTableOrView();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}