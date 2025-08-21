package net.ibizsys.model.dataentity.mainstate;



/**
 * 实体主状态操作标识模型对象接口
 *
 */
public interface IPSDEMainStateOPPriv extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取实体操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv();


	/**
	 * 获取实体操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust();
}