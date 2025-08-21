package net.ibizsys.model.control;



/**
 * 多项数据界面部件相关对象模型基础对象接口
 *
 */
public interface IPSControlMDObject extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
}