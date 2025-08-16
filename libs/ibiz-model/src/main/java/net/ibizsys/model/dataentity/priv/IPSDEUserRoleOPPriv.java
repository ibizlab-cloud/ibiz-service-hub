package net.ibizsys.model.dataentity.priv;



/**
 * 实体角色操作标识模型基础对象接口
 *
 */
public interface IPSDEUserRoleOPPriv extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取自定义条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CUSTOMCOND}
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取数据访问标识
	 * @return
	 */
	java.lang.String getDataAccessAction();
	
	
	/**
	 * 获取实体数据查询
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEDQID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery();


	/**
	 * 获取实体数据查询，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQueryMust();
	
	
	/**
	 * 获取实体操作标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEOPPRIVID}
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv();


	/**
	 * 获取实体操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust();
}