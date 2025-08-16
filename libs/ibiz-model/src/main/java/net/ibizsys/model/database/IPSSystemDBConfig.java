package net.ibizsys.model.database;



/**
 *
 */
public interface IPSSystemDBConfig extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取数据库类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBType}
	 * @return
	 */
	java.lang.String getDBType();
	
	
	/**
	 * 获取数据空值排序模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBNullValueOrderMode}
	 * @return
	 */
	java.lang.String getNullValueOrderMode();
	
	
	/**
	 * 获取对象名称转化
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBObjNameCaseMode}
	 * @return
	 */
	java.lang.String getObjNameCase();
	
	
	/**
	 * 获取是否默认数据库支持
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否发布外键
	 * @return
	 */
	boolean isPubFKey();
	
	
	/**
	 * 获取是否发布索引
	 * @return
	 */
	boolean isPubIndex();
	
	
	/**
	 * 获取是否发布数据库模型
	 * @return
	 */
	boolean isPubModel();
	
	
	/**
	 * 获取是否发布注释
	 * @return
	 */
	boolean isPubModelComment();
	
	
	/**
	 * 获取是否发布视图
	 * @return
	 */
	boolean isPubView();
}