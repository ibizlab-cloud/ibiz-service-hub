package net.ibizsys.model.dataentity.mainstate;



/**
 * 实体主状态操作标识模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEMSOPPrivDTO}运行时对象
 *
 */
public interface IPSDEMainStateOPPriv extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取实体操作标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMSOPPrivDTO#FIELD_PSDEOPPRIVID}
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv();


	/**
	 * 获取实体操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust();
}