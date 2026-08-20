package net.ibizsys.model.security;



/**
 * 系统用户模式模型对象接口
 *
 */
public interface IPSSysUserMode extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	String getLogicName();
	
	
	/**
	 * 获取用户模式编号
	 * @return
	 */
	String getUserModeSN();
	
	
	/**
	 * 获取用户模式标记
	 * @return
	 */
	String getUserModeTag();
}