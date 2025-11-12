package net.ibizsys.central.cloud.core.util;

import net.ibizsys.central.cloud.core.util.domain.Credential;

/**
 * 凭证仓库对象接口
 * @author lionlau
 *
 */
public interface ICredentialRepo {

	/**
	 * 获取凭证
	 * @param strConfigId
	 * @param bTryMode
	 * @return
	 */
	Credential getCredential(String strConfigId, boolean bTryMode);
	
	/**
	 * 更新凭证
	 * @param strConfigId
	 * @param credential
	 */
	void updateCredential(String strConfigId, Credential credential);
	
	
	/**
	 * 异常凭证
	 * @param strConfigId
	 */
	void removeCredential(String strConfigId);
	
}
