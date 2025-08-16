package net.ibizsys.model.database;



/**
 * 实体数据表关系模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDBTableDTO}运行时对象
 *
 */
public interface IPSDEDBTable extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取相关属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> getAllPSDEFields();
	
	/**
	 * 获取相关属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置相关属性集合
	 * @param list 相关属性集合
	 */
	void setPSDEFields(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取关系数据库表
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBTable getPSSysDBTable();


	/**
	 * 获取关系数据库表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBTable getPSSysDBTableMust();
	
	
	/**
	 * 获取实体表类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDBTableDTO#FIELD_TABLETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDBTableType}
	 * @return
	 */
	java.lang.String getTableType();
}