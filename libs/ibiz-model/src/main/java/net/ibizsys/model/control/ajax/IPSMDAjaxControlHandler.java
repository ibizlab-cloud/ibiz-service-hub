package net.ibizsys.model.control.ajax;



/**
 * 异步处理多项数据界面部件处理器模型对象接口
 *
 */
public interface IPSMDAjaxControlHandler extends net.ibizsys.model.control.ajax.IPSAjaxControlHandler{

	
	
	/**
	 * 获取获取数据超时（毫秒）
	 * @return
	 */
	int getFetchTimeout();
	
	
	/**
	 * 获取用户数据范围对象
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR();


	/**
	 * 获取用户数据范围对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDRMust();
	
	
	/**
	 * 获取用户数据范围对象2
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2();


	/**
	 * 获取用户数据范围对象2，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2Must();
}