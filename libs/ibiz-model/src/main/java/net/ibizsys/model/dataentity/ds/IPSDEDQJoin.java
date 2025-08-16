package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询连接模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDQJoinDTO}运行时对象
 *
 */
public interface IPSDEDQJoin extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取别名
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQJoinDTO#FIELD_ALIASNAME}
	 * @return
	 */
	java.lang.String getAlias();
	
	
	/**
	 * 获取子查询连接集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQJoin> getChildPSDEDQJoins();
	
	/**
	 * 获取子查询连接集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDQJoin getChildPSDEDQJoin(Object objKey, boolean bTryMode);
	
	/**
	 * 设置子查询连接集合
	 * @param list 子查询连接集合
	 */
	void setChildPSDEDQJoins(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQJoin> list);
	
	
	/**
	 * 获取连接关系所在实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDERPSDataEntity();


	/**
	 * 获取连接关系所在实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDERPSDataEntityMust();
	
	
	/**
	 * 获取连接实体关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getJoinPSDER();


	/**
	 * 获取连接实体关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getJoinPSDERMust();
	
	
	/**
	 * 获取连接实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQJoinDTO#FIELD_JOINPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getJoinPSDataEntity();


	/**
	 * 获取连接实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getJoinPSDataEntityMust();
	
	
	/**
	 * 获取连接标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQJoinDTO#FIELD_JOINTAG}
	 * @return
	 */
	java.lang.String getJoinTag();
	
	
	/**
	 * 获取连接标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQJoinDTO#FIELD_JOINTAG2}
	 * @return
	 */
	java.lang.String getJoinTag2();
	
	
	/**
	 * 获取连接类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQJoinDTO#FIELD_PSDEJOINTYPEID}
	 * @return
	 */
	java.lang.String getJoinType();
	
	
	/**
	 * 获取查询条件对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition getPSDEDQGroupCondition();


	/**
	 * 获取查询条件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition getPSDEDQGroupConditionMust();
	
	
	/**
	 * 获取所属实体数据查询对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery();


	/**
	 * 获取所属实体数据查询对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQueryMust();
	
	
	/**
	 * 获取查询列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQColumn> getSelectedPSDEDQColumns();
	
	/**
	 * 获取查询列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDQColumn getSelectedPSDEDQColumn(Object objKey, boolean bTryMode);
	
	/**
	 * 设置查询列集合
	 * @param list 查询列集合
	 */
	void setSelectedPSDEDQColumns(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQColumn> list);
}