package net.ibizsys.central.plugin.util.sysutil;

import java.util.Date;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.domain.Credential;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.YamlUtils;

public class CredentialDESyncUtilRuntime extends SysCloudConfigDESyncUtilRuntimeBase{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CredentialDESyncUtilRuntime.class);
	
	/**
	 * 路径参数：组件标识
	 */
	public final static String UTILPARAM_UTIL = "util";
	
	/**
	 * 预定义属性：TYPE 凭证类型
	 */
	public final static String PREDEFINEDFIELD_TYPE = "TYPE";
	
	/**
	 * 预定义属性：ACCESS_KEY
	 */
	public final static String PREDEFINEDFIELD_ACCESS_KEY = "ACCESS_KEY";

	/**
	 * 预定义属性：SECRET_KEY
	 */
	public final static String PREDEFINEDFIELD_SECRET_KEY = "SECRET_KEY";
	
	/**
	 * 预定义属性：TOKEN_URL
	 */
	public final static String PREDEFINEDFIELD_TOKEN_URL = "TOKEN_URL";
	
	/**
	 * 预定义属性：DIGEST/api密钥
	 */
	public final static String PREDEFINEDFIELD_DIGEST = "DIGEST";
	
	/**
	 * 预定义属性：BEARER_TOKEN
	 */
	public final static String PREDEFINEDFIELD_BEARER_TOKEN = "BEARER_TOKEN";
	
	/**
	 * 预定义属性：CLIENT_ID
	 */
	public final static String PREDEFINEDFIELD_CLIENT_ID = "CLIENT_ID";
	
	/**
	 * 预定义属性：CLIENT_SECRET
	 */
	public final static String PREDEFINEDFIELD_CLIENT_SECRET = "CLIENT_SECRET";
	
	
	/**
	 * 预定义属性：凭证状态
	 */
	public final static String PREDEFINEDFIELD_STATUS = "STATUS";
	
	
	public final static String STATUS_ACTIVE = "active";
	
	public final static String STATUS_EXPIRED = "expired";
	
	public final static String STATUS_DISABLED = "disabled";
	
	
	/**
	 * 预定义属性：过期时间
	 */
	public final static String PREDEFINEDFIELD_EXPIRATION_DATE = "EXPIRATION_DATE";
	
	

	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	@Override
	protected String getConfig(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO) throws Throwable {
		String strConfig = super.getConfig(iDataEntityRuntimeContext, iEntityDTO);
		if(StringUtils.hasLength(strConfig)) {
			return strConfig;
		}
		
		Map<String, Object> map = this.getConfigMap(iDataEntityRuntimeContext, iEntityDTO);
		if(!map.containsKey(Credential.FIELD_TYPE)) {
			IPSDEField typePSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_TYPE, true);
			if(typePSDEField != null) {
				Object type = iEntityDTO.get(typePSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(type)) {
					String strType = String.valueOf(type);
					map.put(Credential.FIELD_TYPE, strType);
					if(typePSDEField.getPSCodeList() != null) {
						ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(typePSDEField.getPSCodeList().getId(), true);
						if(iCodeListRuntime != null) {
							IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItem(strType, true);
							if(iPSCodeItem!=null && StringUtils.hasLength(iPSCodeItem.getUserData())) {
								map.put(Credential.FIELD_TYPE, iPSCodeItem.getUserData());
							}
						}
					}
				}
			}
		}
		
		if(!map.containsKey(Credential.FIELD_ACCESSKEY)) {
			IPSDEField iPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_ACCESS_KEY, true);
			if(iPSDEField != null) {
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(value)) {
					String strValue = String.valueOf(value);
					map.put(Credential.FIELD_ACCESSKEY, strValue);
				}
			}
		}
		
		if(!map.containsKey(Credential.FIELD_SECRETKEY)) {
			IPSDEField iPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_SECRET_KEY, true);
			if(iPSDEField != null) {
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(value)) {
					String strValue = String.valueOf(value);
					map.put(Credential.FIELD_SECRETKEY, strValue);
				}
			}
		}
		
		if(!map.containsKey(Credential.FIELD_TOKENURL)) {
			IPSDEField iPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_TOKEN_URL, true);
			if(iPSDEField != null) {
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(value)) {
					String strValue = String.valueOf(value);
					map.put(Credential.FIELD_TOKENURL, strValue);
				}
			}
		}
		
		if(!map.containsKey(Credential.FIELD_CONTENT)) {
			IPSDEField iPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_DIGEST, true);
			if(iPSDEField != null) {
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(value)) {
					String strValue = String.valueOf(value);
					map.put(Credential.FIELD_CONTENT, strValue);
				}
			}
		}
		
		if(!map.containsKey(Credential.FIELD_ACCESSTOKEN)) {
			IPSDEField iPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_BEARER_TOKEN, true);
			if(iPSDEField != null) {
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(value)) {
					String strValue = String.valueOf(value);
					map.put(Credential.FIELD_ACCESSTOKEN, strValue);
				}
			}
		}
		
		if(!map.containsKey(Credential.FIELD_CLIENTID)) {
			IPSDEField iPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_CLIENT_ID, true);
			if(iPSDEField != null) {
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(value)) {
					String strValue = String.valueOf(value);
					map.put(Credential.FIELD_CLIENTID, strValue);
				}
			}
		}
		
		if(!map.containsKey(Credential.FIELD_CLIENTSECRET)) {
			IPSDEField iPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_CLIENT_SECRET, true);
			if(iPSDEField != null) {
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(value)) {
					String strValue = String.valueOf(value);
					map.put(Credential.FIELD_CLIENTSECRET, strValue);
				}
			}
		}
		
		
		if(!map.containsKey(Credential.FIELD_EXPIRESTIME)) {
			IPSDEField expirationDatePSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_EXPIRATION_DATE, true);
			if(expirationDatePSDEField != null) {
				Object expirationDate = iEntityDTO.get(expirationDatePSDEField.getLowerCaseName());
				if(expirationDate != null) {
					if(expirationDate instanceof String) {
						map.put(Credential.FIELD_EXPIRESTIME, expirationDate);
					}
					else
						if(expirationDate instanceof Date) {
							map.put(Credential.FIELD_EXPIRESTIME, DateUtils.toDateTimeString((Date)expirationDate));
						}
						else 
						{
							try {
								map.put(Credential.FIELD_EXPIRESTIME, DateUtils.toDateTimeString(DataTypeUtils.asDateTime(expirationDate)));
							}
							catch (Throwable ex) {
								log.error(String.format("过期时间[%1$s]类型不支持", expirationDate));
							}
						}
				}
			}
		}
		
		if(!map.containsKey(Credential.FIELD_DISABLED)) {
			map.put(Credential.FIELD_DISABLED, 0);
			IPSDEField statusPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_STATUS, true);
			if(statusPSDEField != null) {
				Object status = iEntityDTO.get(statusPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(status)) {
					String strStatus = String.valueOf(status);
					if(STATUS_ACTIVE.equalsIgnoreCase(strStatus) || STATUS_DISABLED.equalsIgnoreCase(strStatus) || STATUS_EXPIRED.equalsIgnoreCase(strStatus)) {
						if(STATUS_EXPIRED.equalsIgnoreCase(strStatus) || STATUS_DISABLED.equalsIgnoreCase(strStatus)) {
							map.put(Credential.FIELD_DISABLED, 1);
						}
					}
					else {
						if(statusPSDEField.getPSCodeList() != null) {
							ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(statusPSDEField.getPSCodeList().getId(), true);
							if(iCodeListRuntime != null) {
								IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItem(strStatus, true);
								if(iPSCodeItem!=null && StringUtils.hasLength(iPSCodeItem.getUserData())) {
									if(STATUS_EXPIRED.equalsIgnoreCase(iPSCodeItem.getUserData()) || STATUS_DISABLED.equalsIgnoreCase(iPSCodeItem.getUserData())) {
										map.put(Credential.FIELD_DISABLED, 1);
									}
								}
							}
						}
					}
				}
			}
		}
		
		return this.getConfig(iDataEntityRuntimeContext, map, iEntityDTO);
	}
	
	protected String getConfig(IDataEntityRuntimeContext iDataEntityRuntimeContext, Map<String, Object> map, IEntityDTO iEntityDTO) throws Throwable {
		return YamlUtils.toString(map);
	}
	
	
	@Override
	protected String getCloudConfigId(IDataEntityRuntimeContext iDataEntityRuntimeContext, Map<String, Object> map, IEntityDTO iEntityDTO) throws Exception {
		if(!map.containsKey(UTILPARAM_UTIL)) {
			map.put(UTILPARAM_UTIL, this.getUtilParam(UTILPARAM_UTIL, "unknown"));
		}
		
		return super.getCloudConfigId(iDataEntityRuntimeContext, map, iEntityDTO);
	}
	
	@Override
	protected String getDefaultCloudConfigIdFormat(IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception {
		return "credential-{system}-{util}--{key}";
	}
}
