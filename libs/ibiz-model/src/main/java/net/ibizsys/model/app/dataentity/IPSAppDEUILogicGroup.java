package net.ibizsys.model.app.dataentity;



/**
 * 应用实体界面逻辑组模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGroupDTO}运行时对象
 *
 */
public interface IPSAppDEUILogicGroup extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroup{

	
	
	/**
	 * 获取逻辑组成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail> getPSAppDEUILogicGroupDetails();
	
	/**
	 * 获取逻辑组成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail getPSAppDEUILogicGroupDetail(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑组成员集合
	 * @param list 逻辑组成员集合
	 */
	void setPSAppDEUILogicGroupDetails(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail> list);
}