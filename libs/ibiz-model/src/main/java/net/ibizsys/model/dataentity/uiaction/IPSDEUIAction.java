package net.ibizsys.model.dataentity.uiaction;



/**
 * 实体界面行为模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO}运行时对象
 *
 */
public interface IPSDEUIAction extends net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.view.IPSUIAction{

	
	
	/**
	 * 获取前端应用视图，根据{@link #isFrontPDTView}优先处理预置视图，否则按应用类型计算对应的实体视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEVIEWBASEID}、{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_MOBPSDEVIEWID}、{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSSYSPDTVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getFrontPSAppView();


	/**
	 * 获取前端应用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getFrontPSAppViewMust();
	
	
	/**
	 * 获取应用实体方法
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod();


	/**
	 * 获取应用实体方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethodMust();
	
	
	/**
	 * 获取相关实体操作标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEOPPRIVID}
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv();


	/**
	 * 获取相关实体操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust();
	
	
	/**
	 * 获取是否异步操作行为
	 * @return
	 */
	boolean isAsyncAction();
	
	
	/**
	 * 获取是否先保存目标数据
	 * @return
	 */
	boolean isSaveTargetFirst();
}