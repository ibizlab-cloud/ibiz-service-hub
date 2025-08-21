package net.ibizsys.model.wf;



/**
 * 工作流工作时间模型对象接口
 *
 */
public interface IPSWFWorkTime extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取工作时间数据
	 * @return
	 */
	java.lang.String getUserData();
	
	
	/**
	 * 获取工作时间数据2
	 * @return
	 */
	java.lang.String getUserData2();
	
	
	/**
	 * 获取工作时间编号
	 * @return
	 */
	java.lang.String getWFWorkTimeSN();
}