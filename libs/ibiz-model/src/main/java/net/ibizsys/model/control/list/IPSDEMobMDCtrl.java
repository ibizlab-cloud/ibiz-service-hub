package net.ibizsys.model.control.list;



/**
 * 实体移动端多数据部件处理器模型对象接口
 * <P>
 * 移动端多数据部件会同时绑定多个界面行为组，这些行为组用途由部件解释使用用途，例如左侧滑动、右侧滑动等
 *
 */
public interface IPSDEMobMDCtrl extends net.ibizsys.model.control.list.IPSDEList{

	
	
	/**
	 * 获取界面行为组
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup();


	/**
	 * 获取界面行为组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroupMust();
	
	
	/**
	 * 获取界面行为组2
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup2();


	/**
	 * 获取界面行为组2，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup2Must();
	
	
	/**
	 * 获取界面行为组3
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup3();


	/**
	 * 获取界面行为组3，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup3Must();
	
	
	/**
	 * 获取界面行为组4
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup4();


	/**
	 * 获取界面行为组4，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup4Must();
	
	
	/**
	 * 获取界面行为组5
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup5();


	/**
	 * 获取界面行为组5，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup5Must();
	
	
	/**
	 * 获取界面行为组6
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup6();


	/**
	 * 获取界面行为组6，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup6Must();
}