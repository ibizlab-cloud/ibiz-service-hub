package net.ibizsys.model.requirement;



/**
 *
 */
public interface IPSSysReqItem extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取项编号
	 * @return
	 */
	java.lang.String getItemSN();
	
	
	/**
	 * 获取项标记
	 * @return
	 */
	java.lang.String getItemTag();
	
	
	/**
	 * 获取项标记2
	 * @return
	 */
	java.lang.String getItemTag2();
	
	
	/**
	 * 获取需求模块
	 * @return
	 */
	net.ibizsys.model.requirement.IPSSysReqModule getPSSysReqModule();


	/**
	 * 获取需求模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.requirement.IPSSysReqModule getPSSysReqModuleMust();
	
	
	/**
	 * 获取系统用例
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysUseCase getPSSysUseCase();


	/**
	 * 获取系统用例，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysUseCase getPSSysUseCaseMust();
	
	
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
}