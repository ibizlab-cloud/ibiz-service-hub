package net.ibizsys.central.wx;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.model.wx.IPSWXAccount;

/**
 * 微信账户接口运行时
 * @author lionlau
 *
 */
public interface IWXAccountRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化微信账户运行时
	 * @param iSystemRuntimeContext
	 * @param iPSWXAccount
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSWXAccount iPSWXAccount) throws Exception;

	
	/**
	 * 获取微信账户模型
	 * @return
	 */
	IPSWXAccount getPSWXAccount();
	
	
}
