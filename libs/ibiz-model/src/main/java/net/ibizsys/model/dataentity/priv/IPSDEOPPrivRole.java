package net.ibizsys.model.dataentity.priv;



/**
 * 实体角色操作标识模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEOPPrivRoleDTO}运行时对象
 *
 */
public interface IPSDEOPPrivRole extends net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv{

	
	
	/**
	 * 获取实体数据查询
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEOPPrivRoleDTO#FIELD_PSDEDQID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEOPPrivRoleDTO#FIELD_PSDEOPPRIVID}
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv();


	/**
	 * 获取实体操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust();
}