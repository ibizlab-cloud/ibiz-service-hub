package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询代码模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDQCodeDTO}运行时对象
 *
 */
public interface IPSDEDataQueryCode extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取数据库类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQCodeDTO#FIELD_DBTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBType}
	 * @return
	 */
	java.lang.String getDBType();
	
	
	/**
	 * 获取查询代码条件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond> getPSDEDataQueryCodeConds();
	
	/**
	 * 获取查询代码条件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond getPSDEDataQueryCodeCond(Object objKey, boolean bTryMode);
	
	/**
	 * 设置查询代码条件集合
	 * @param list 查询代码条件集合
	 */
	void setPSDEDataQueryCodeConds(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond> list);
	
	
	/**
	 * 获取查询代码表达式集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp> getPSDEDataQueryCodeExps();
	
	/**
	 * 获取查询代码表达式集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp getPSDEDataQueryCodeExp(Object objKey, boolean bTryMode);
	
	/**
	 * 设置查询代码表达式集合
	 * @param list 查询代码表达式集合
	 */
	void setPSDEDataQueryCodeExps(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp> list);
	
	
	/**
	 * 获取查询代码，优先使用用户查询代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQCodeDTO#FIELD_USERQUERYCODE}、{@link net.ibizsys.centralstudio.dto.PSDEDQCodeDTO#FIELD_QUERYCODE}
	 * @return
	 */
	java.lang.String getQueryCode();
}