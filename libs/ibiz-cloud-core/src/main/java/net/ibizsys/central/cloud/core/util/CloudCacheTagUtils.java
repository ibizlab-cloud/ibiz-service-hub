package net.ibizsys.central.cloud.core.util;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 云体系缓存标记工具类
 * @author lionlau
 *
 */
public class CloudCacheTagUtils {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudCacheTagUtils.class);
	
	public final static String PREFIX = "ibiz-cloud";
	
	public final static String DEFAULTTAG = "$default$";
	
	public final static String GLOBALTAG = "$saas$";
	
	public final static String DCTAG = "$dc$";
	
	public final static String USERTAG = "$user$";
	
	public final static String USERTAG_PREFIX = "ex-";
	
	public final static String EMPLOYEETAG_PREFIX = "sysemp-";
	
	
	
	public static String getAuthenticationUserTag(String strUserName) {
		return String.format("%1$s-uaa-user-%2$s", PREFIX, strUserName);
	}
	
//	public static String getAuthenticationUserCat(String strUserName) {
//		return String.format("%1$s-uaa-cat-%2$s", PREFIX, strUserName);
//	}
	
	public static String getAuthenticationUserCat(String strUserName, String strToken) {
		if(StringUtils.hasLength(strToken)) {
			return String.format("%1$s-uaa-cat-%2$s--%3$s", PREFIX, strUserName, KeyValueUtils.genUniqueId(strToken));
		}
		else {
			log.warn(String.format("认证用户分类[%1$s]未指定Token值，可能会发生问题"));
			
			throw new RuntimeException(String.format("认证用户分类[%1$s]未指定Token值"));
			
			//return String.format("%1$s-uaa-cat-%2$s", PREFIX, strUserName);
		}
		
	}
	
	
	public static String getUserEmployeeTag(String strSystemId, String strOrgId) {
		return String.format("sysemp-%1$s--%2$s", strSystemId, strOrgId);
	}
	
	public static String getUserAuthoritiesTag(String strDCSystemId) {
		return String.format("authorities-%1$s", strDCSystemId);
	}
	
	public static String getUserOrgSystemsTag(String strDCSystemId) {
		return String.format("orgsystems-%1$s", strDCSystemId);
	}
	
	
	public static String getUserAppDataTag(String strSystemId, String strOrgId) {
		return String.format("appdata-%1$s--%2$s", strSystemId, strOrgId);
	}
	
	public static String getUserSessionTag(String strDCSystemId) {
		return String.format("session-%1$s", strDCSystemId);
	}
	
	/**
	 * 获取用户动态角色标记
	 * @param strDCSystemId
	 * @return
	 */
	public static String getUserDynaRolesTag(String strDCSystemId) {
		return String.format("dynaroles-%1$s", strDCSystemId);
	}
	
	public static String getMetaDynaModelTag(String strSystemId, String strOrgId) {
		return String.format("%1$s-saas-dym-%2$s--%3$s", PREFIX, strSystemId, strOrgId);
	}
	
	
	public static String getConfigTag(String strSystemId, String strConfigType, String strTargetType, String strUserId) {
		return String.format("%1$s-saas-config-%2$s--%3$s--%4$s", PREFIX, strSystemId, strConfigType, strTargetType, strUserId);
	}
	
	
	public static String getCodeListTag(String strSrfdcId, String strCodeListTag) {
		return String.format("%1$s-codelist-%2$s--%3$s", PREFIX, strSrfdcId, strCodeListTag);
	}
	
	
	public static String getCloudDataCat(String strDataType) {
		return getCloudDataCat(GLOBALTAG, strDataType);
	}
	
	public static String getCloudDataCat(String strSrfdcId, String strDataType) {
		return String.format("%1$s-clouddata-%2$s--%3$s", PREFIX, strSrfdcId, strDataType);
	}
	
	public static String getCloudDataCat(String strSrfdcId, String strUserId, String strDataType) {
		return String.format("%1$s-clouddata-%2$s-%3$s--%4$s", PREFIX, strSrfdcId, strUserId, strDataType);
	}
	
	public static String getPortalOpenDataCat(String strSystemId, String strEntity, String strKey) {
		return String.format("%1$s-portal-opendata-%2$s--%3$s--%4$s", PREFIX, strSystemId, strEntity, strKey);
	}
	
	public static String getPortalEmployeeCat(String strEmployeeId) {
		return String.format("%1$s-portal-employee-%2$s", PREFIX, strEmployeeId);
	}
	
}
