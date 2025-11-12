package net.ibizsys.central.plugin.util.sysutil;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.YamlUtils;

public class AccessTokenDESyncUtilRuntime extends SysCloudConfigDESyncUtilRuntimeBase{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(AccessTokenDESyncUtilRuntime.class);
	
	/**
	 * 路径参数：组件标识
	 */
	public final static String UTILPARAM_UTIL = "util";
	
	/**
	 * 预定义属性：Token
	 */
	public final static String PREDEFINEDFIELD_TOKEN = "TOKEN";
	
	
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
	
	/**
	 * 预定义属性：代理用户
	 */
	public final static String PREDEFINEDFIELD_PROXY_USER = "PROXY_USER";
	
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
		if(!map.containsKey(AccessToken.FIELD_EXPIRESTIME)) {
			IPSDEField expirationDatePSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_EXPIRATION_DATE, true);
			if(expirationDatePSDEField != null) {
				Object expirationDate = iEntityDTO.get(expirationDatePSDEField.getLowerCaseName());
				if(expirationDate != null) {
					if(expirationDate instanceof String) {
						map.put(AccessToken.FIELD_EXPIRESTIME, expirationDate);
					}
					else
						if(expirationDate instanceof Date) {
							map.put(AccessToken.FIELD_EXPIRESTIME, DateUtils.toDateTimeString((Date)expirationDate));
						}
						else 
						{
							try {
								map.put(AccessToken.FIELD_EXPIRESTIME, DateUtils.toDateTimeString(DataTypeUtils.asDateTime(expirationDate)));
							}
							catch (Throwable ex) {
								log.error(String.format("过期时间[%1$s]类型不支持", expirationDate));
							}
						}
				}
			}
		}
		
		if(!map.containsKey(AccessToken.FIELD_DISABLED)) {
			map.put(AccessToken.FIELD_DISABLED, 0);
			IPSDEField statusPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_STATUS, true);
			if(statusPSDEField != null) {
				Object status = iEntityDTO.get(statusPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(status)) {
					String strStatus = String.valueOf(status);
					if(STATUS_ACTIVE.equalsIgnoreCase(strStatus) || STATUS_DISABLED.equalsIgnoreCase(strStatus) || STATUS_EXPIRED.equalsIgnoreCase(strStatus)) {
						if(STATUS_EXPIRED.equalsIgnoreCase(strStatus) || STATUS_DISABLED.equalsIgnoreCase(strStatus)) {
							map.put(AccessToken.FIELD_DISABLED, 1);
						}
					}
					else {
						if(statusPSDEField.getPSCodeList() != null) {
							ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(statusPSDEField.getPSCodeList().getId(), true);
							if(iCodeListRuntime != null) {
								IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItem(strStatus, true);
								if(iPSCodeItem!=null && StringUtils.hasLength(iPSCodeItem.getUserData())) {
									if(STATUS_EXPIRED.equalsIgnoreCase(iPSCodeItem.getUserData()) || STATUS_DISABLED.equalsIgnoreCase(iPSCodeItem.getUserData())) {
										map.put(AccessToken.FIELD_DISABLED, 1);
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
		if(!map.containsKey(PARAM_KEY)) {
			IPSDEField tokenPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_TOKEN, true);
			if(tokenPSDEField != null) {
				String strToken = iEntityDTO.getString(tokenPSDEField.getLowerCaseName(), null);
				if(StringUtils.hasLength(strToken)) {
					map.put(PARAM_KEY, strToken);
				}
			}
		}
		return super.getCloudConfigId(iDataEntityRuntimeContext, map, iEntityDTO);
	}
	
	@Override
	protected String getDefaultCloudConfigIdFormat(IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception {
		return "accesstoken-{system}-{util}--{key}";
	}
}
