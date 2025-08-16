package net.ibizsys.central.cloud.uaa.core.addin;

/**
 * 远端HTTP认证代理
 * @author lionlau
 *
 */
public interface IHttpAuthAgent extends IAuthAgent{

	/**
	 * 认证结果：允许用户访问
	 */
	public final static String RESULT_ALLOW = "allow";
	
	
	/**
	 * 认证结果：拒绝用户访问
	 */
	public final static String RESULT_DENY = "deny";
	
}
