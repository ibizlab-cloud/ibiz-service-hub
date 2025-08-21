package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询模型对象接口
 * <P>
 * 实体数据查询模型除了自身逻辑还包括了输入{@link #getPSDEDataQueryInput}及返回{@link #getPSDEDataQueryReturn}模型
 *
 */
public interface IPSDEDataQuery extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取查询代码集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode> getAllPSDEDataQueryCodes();
	
	/**
	 * 获取查询代码集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode getPSDEDataQueryCode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置查询代码集合
	 * @param list 查询代码集合
	 */
	void setPSDEDataQueryCodes(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取属性组类型，来自{@link #getPSDEFGroup}的类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFGroupType}
	 * @return
	 */
	java.lang.String getDEFGroupType();
	
	
	/**
	 * 获取子系统扩展
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEExtendMode}
	 * @return
	 */
	int getExtendMode();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取查询主表对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDQMain getPSDEDQMain();


	/**
	 * 获取查询主表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDQMain getPSDEDQMainMust();
	
	
	/**
	 * 获取调用输入对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput getPSDEDataQueryInput();


	/**
	 * 获取调用输入对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput getPSDEDataQueryInputMust();
	
	
	/**
	 * 获取调用返回对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQueryReturn getPSDEDataQueryReturn();


	/**
	 * 获取调用返回对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQueryReturn getPSDEDataQueryReturnMust();
	
	
	/**
	 * 获取属性组
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroup();


	/**
	 * 获取属性组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroupMust();
	
	
	/**
	 * 获取选择列级别
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataQueryViewLevel}
	 * @return
	 */
	int getViewLevel();
	
	
	/**
	 * 获取是否自定义数据查询
	 * @return
	 */
	boolean isCustomCode();
	
	
	/**
	 * 获取是否实体默认查询
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否启用PQL
	 * @return
	 */
	boolean isEnablePQL();
	
	
	/**
	 * 获取是否权限使用查询
	 * @return
	 */
	boolean isPrivQuery();
	
	
	/**
	 * 获取是否默认发布服务
	 * @return
	 */
	boolean isPubServiceDefault();
	
	
	/**
	 * 获取是否从视图查询
	 * @return
	 */
	boolean isQueryFromView();
}