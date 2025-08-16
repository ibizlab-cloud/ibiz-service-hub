package net.ibizsys.model.app.wf;



/**
 *
 */
public interface IPSAppWFDE extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取流程状态值
	 * @return
	 */
	java.lang.String getEntityWFState();
	
	
	/**
	 * 获取应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取应用工作流
	 * @return
	 */
	net.ibizsys.model.app.wf.IPSAppWF getPSAppWF();


	/**
	 * 获取应用工作流，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.wf.IPSAppWF getPSAppWFMust();
	
	
	/**
	 * 获取流程状态应用应用属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getWFStatePSAppDEField();


	/**
	 * 获取流程状态应用应用属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getWFStatePSAppDEFieldMust();
}