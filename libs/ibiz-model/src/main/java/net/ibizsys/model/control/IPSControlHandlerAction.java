package net.ibizsys.model.control;



/**
 * 界面部件处理器行为模型基础对象接口
 *
 */
public interface IPSControlHandlerAction extends net.ibizsys.model.control.IPSControlAction{

	
	
	/**
	 * 获取目标行为名称
	 * @return
	 */
	java.lang.String getActionName();
	
	
	/**
	 * 获取行为类型
	 * @return
	 */
	java.lang.String getActionType();
	
	
	/**
	 * 获取结果集附加条件
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取数据访问行为
	 * @return
	 */
	java.lang.String getDataAccessAction();
	
	
	/**
	 * 获取实体操作标识对象
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv();


	/**
	 * 获取实体操作标识对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust();
}