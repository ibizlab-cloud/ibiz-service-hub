package net.ibizsys.model.dataentity;



/**
 * 系统实体组模型对象接口
 *
 */
public interface IPSSysDEGroup extends net.ibizsys.model.dataentity.IPSDEGroup{

	
	
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