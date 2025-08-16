package net.ibizsys.central.service.client;

public interface ITokenUtil {

	
	/**
	 * 获取Token
	 * @return
	 */
	String getToken();
	
	
	
	/**
	 * 请求凭证
	 * @param bImmediately
	 */
	void requestTokenIf(boolean bImmediately);

	/**
	 * 请求凭证
	 */
	void requestToken();
}
