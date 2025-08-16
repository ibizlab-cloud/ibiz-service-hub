package net.ibizsys.central.cloud.core.cloudutil;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.security.AuthenticationInfo;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.OrgSystem;

/**
 * Cloud体系UAA功能组件
 * @author lionlau
 *
 */
public interface ICloudUAAUtilRuntime extends ICloudUtilRuntime{

	/**
	 * 系统内置用户标识
	 */
	public final static String USERID_SYSTEM = "SYSTEM";
	
	/**
	 * 系统内置用户名称
	 */
	public final static String USERNAME_SYSTEM = "内置用户";
	
	/**
	 * 默认用户角色（多租户模式下不存在）
	 */
	//final static String ROLE_USERS = "ROLE_USERS";
	
	/**
	 * 产生Token
	 * @param iAuthenticationUser
	 * @return
	 */
	String generateToken(IAuthenticationUser iAuthenticationUser);
	
	
	/**
	 * 产生Token
	 * @param iAuthenticationUser
	 * @param nTokenExpiration 指定超时时长
	 * @return
	 */
	String generateToken(IAuthenticationUser iAuthenticationUser, long nTokenExpiration);
	
	
	
	/**
	 * 刷新Token
	 * 
	 * @param strToken
	 */
	String refreshToken(String strToken);
	
	/**
	 * 刷新Token
	 * @param strToken
	 * @param nTokenExpiration 指定超时时长
	 */
	String refreshToken(String strToken, long nTokenExpiration);
	


	/**
	 * 通过名称重置用户（进行缓存清除等操作）
	 * @param iAuthenticationUser
	 * @return
	 */
	void resetUser(IAuthenticationUser iAuthenticationUser);
	
	
	/**
	 * 获取当前用户的应用数据对象
	 * @param strSystemId
	 * @param strOrgId 组织标识
	 * @return
	 */
	AppData getAppData(String strSystemId, String strOrgId);
	
	
	
	/**
	 * 获取当前用户的应用数据对象
	 * @param iAuthenticationUser 认证用户 
	 * @param strSystemId
	 * @param strOrgId 组织标识
	 * @return
	 */
	AppData getAppData(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId);
	
	
	/**
	 * 获取当前用户在指定租户系统的组织身份
	 * @param strDCSystemId
	 * @return
	 */
	Collection<OrgSystem> getOrgSystems(String strDCSystemId);
	
//	
//	
//	
//	/**
//	 * 获取当前机构用户的授权清单
//	 * @return
//	 */
//	Collection<IUAAGrantedAuthority> getGrantedAuthorities();
//	
	/**
	 * 鉴别Token
	 * @param token
	 * @return
	 */
	boolean validateToken(String token);
	
	
	/**
	 * 鉴别Token
	 * @param token
	 * @param iAuthenticationUser
	 * @return
	 */
	boolean validateToken(String token, IAuthenticationUser iAuthenticationUser);

	/**
	 * 从Token中获取用户名称
	 * @param token
	 * @return
	 */
	String getUsernameFromToken(String token);

	/**
	 * 从Token中获取过期时间
	 * @param token
	 * @return
	 */
	Date getExpirationDateFromToken(String token);
	
	
	/**
	 * 从Token中获取过期间隔
	 * @param token
	 * @return
	 */
	int getExpireInFromToken(String token);
	
	

	/**
	 * 获取开放应用信息
	 * @param strDCSystemId 
	 * @param strOpenType
	 * @param strOpenAccessId
	 * @return
	 */
	ObjectNode getOpenAccessInfo(String strDCSystemId, String strOpenType, String strOpenAccessId);
	
	

	/**
	 * 通用开放平台临时授权码获取认证用户
	 * @param strDCSystemId
	 * @param strOpenType
	 * @param strOpenCode
	 * @param strOpenAccessId
	 * @return
	 */
	IAuthenticationUser getUserByOpenSNSCode(String strDCSystemId, String strOpenType, String strOpenCode, String strOpenAccessId);
	
	
	/**
	 * 通用开放平台认证码获取认证用户
	 * @param strDCSystemId
	 * @param strOpenType
	 * @param strOpenCode
	 * @param strOpenAccessId
	 * @return
	 */
	IAuthenticationUser getUserByOpenAuthCode(String strDCSystemId, String strOpenType, String strOpenCode, String strOpenAccessId);
	
	
	/**
	 * 获取公钥
	 * @return
	 */
	String getPublicKey();
	

	
	
	/**
	 * 获取传入认证用户的认证代码
	 * @param iAuthenticationUser
	 * @param strScope 授权范围
	 * @return
	 */
	String getAuthorizationCode(IAuthenticationUser iAuthenticationUser, String strScope);
	
	
	/**
	 * 通过认证代码获取认证用户
	 * @param strAuthCode
	 * @return
	 */
	IAuthenticationUser getUserByAuthCode(String strAuthCode);
	
	
	
	/**
	 * 获取当前认证用户的OIDC结果对象
	 * @return
	 */
	Map<String, Object> getOIDCResult();

	
	
	/**
	 * 获取Token过期时长，毫秒
	 * @return
	 */
	long getTokenExpiration();
	
	
	/**
	 * 获取接口用户Token过期时长，毫秒
	 * @return
	 */
	long getApiTokenExpiration();
	
	
	/**
	 * 获取记住我过期时长，毫秒，小于等于0不启用
	 * @return
	 */
	long getRememberMe();
	
	
	
	/**
	 * 刷新Token
	 * 
	 * @param strToken
	 */
	AuthenticationInfo refreshToken2(String strToken);
	
	/**
	 * 刷新Token
	 * @param strToken
	 * @param nTokenExpiration 指定超时时长
	 */
	AuthenticationInfo refreshToken2(String strToken, long nTokenExpiration);
	
	
	
	/**
	 * 产生Token
	 * @param iAuthenticationUser
	 * @return
	 */
	AuthenticationInfo generateToken2(IAuthenticationUser iAuthenticationUser);
	
	
	/**
	 * 产生Token
	 * @param iAuthenticationUser
	 * @param nTokenExpiration 指定超时时长
	 * @return
	 */
	AuthenticationInfo generateToken2(IAuthenticationUser iAuthenticationUser, long nTokenExpiration);
	
	
	
	/**
	 * 生成开放平台登录二维码
	 * @param strDCSystemId
	 * @param strOpenType
	 * @param strOpenAccessId
	 * @param strInfo
	 * @return
	 */
	ObjectNode createOpenQRCode(String strDCSystemId, String strOpenType, String strOpenAccessId);
	
	
	/**
	 * 通用开放平台二维码获取认证用户
	 * @param strDCSystemId
	 * @param strOpenType
	 * @param strOpenQRCode
	 * @param strOpenAccessId
	 * @return
	 */
	IAuthenticationUser getUserByOpenQRCode(String strDCSystemId, String strOpenType, String strOpenQRCode, String strOpenAccessId);
}
