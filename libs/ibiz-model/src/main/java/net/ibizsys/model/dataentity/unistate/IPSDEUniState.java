package net.ibizsys.model.dataentity.unistate;



/**
 * 实体统一状态模型对象接口
 *
 */
public interface IPSDEUniState extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取系统状态协同对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysUniState getPSSysUniState();


	/**
	 * 获取系统状态协同对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysUniState getPSSysUniStateMust();
	
	
	/**
	 * 获取是否实体默认
	 * @return
	 */
	boolean isDefault();
}