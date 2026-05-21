package net.ibizsys.central.plugin.util.sysutil;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.domain.KBAccess;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.expression.ExpressionUtils;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.YamlUtils;

public class KBAgentDESyncUtilRuntime extends SysCloudConfigDESyncUtilRuntimeBase{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(KBAgentDESyncUtilRuntime.class);
	
	/**
	 * 路径参数：组件标识
	 */
	public final static String UTILPARAM_UTIL = "util";
	
	/**
	 * 预定义属性：TYPE 代理类型
	 */
	public final static String PREDEFINEDFIELD_TYPE = "TYPE";
	
	/**
	 * 预定义属性：引导提示词
	 */
	public final static String PREDEFINEDFIELD_GUIDANCE_PROMPT = "GUIDANCE_PROMPT";
	
	/**
	 * 预定义属性：模型 API 地址
	 */
	public final static String PREDEFINEDFIELD_API_BASE_URL = "API_BASE_URL";
	

	/**
	 * 预定义属性：凭证标识
	 */
	public final static String PREDEFINEDFIELD_CREDENTIAL_ID = "CREDENTIAL_ID";
	
	/**
	 * 预定义属性：扩展参数
	 */
	public final static String PREDEFINEDFIELD_EXTRA_PARAMS = "EXTRA_PARAMS";
	
	
	/**
	 * 预定义属性：过期时间
	 */
	public final static String PREDEFINEDFIELD_EXPIRATION_DATE = "EXPIRATION_DATE";
	
	/**
	 * 预定义属性：凭证状态
	 */
	public final static String PREDEFINEDFIELD_STATUS = "STATUS";
	
	
	public final static String STATUS_ACTIVE = "active";
	
	public final static String STATUS_EXPIRED = "expired";
	
	public final static String STATUS_DISABLED = "disabled";
	
	
	

	
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
		if(!map.containsKey(KBAccess.FIELD_KBTYPE)) {
			map.put(KBAccess.FIELD_KBTYPE, "cloud");
			IPSDEField typePSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_TYPE, true);
			if(typePSDEField != null) {
				Object type = iEntityDTO.get(typePSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(type)) {
					String strType = String.valueOf(type);
					map.put(KBAccess.FIELD_KBTYPE, strType);
					if(typePSDEField.getPSCodeList() != null) {
						ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(typePSDEField.getPSCodeList().getId(), true);
						if(iCodeListRuntime != null) {
							IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItem(strType, true);
							if(iPSCodeItem!=null && StringUtils.hasLength(iPSCodeItem.getUserData())) {
								map.put(KBAccess.FIELD_KBTYPE, iPSCodeItem.getUserData());
							}
						}
					}
				}
			}
		}
		
		
		if(!map.containsKey(KBAccess.FIELD_SERVICEURL)) {
			IPSDEField iPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_API_BASE_URL, true);
			if(iPSDEField != null) {
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(value)) {
					String strValue = String.valueOf(value);
					map.put(KBAccess.FIELD_SERVICEURL, strValue);
				}
			}
		}
		
		if(!map.containsKey(KBAccess.FIELD_CREDENTIALID)) {
			IPSDEField iPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_CREDENTIAL_ID, true);
			if(iPSDEField != null) {
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(value)) {
					String strValue = String.valueOf(value);
					
					Map<String, Object> map2 = new LinkedHashMap<String, Object>();
					map2.put(PARAM_KEY, strValue);
					String strCloudCredentialId = this.getCloudCredentialId(iDataEntityRuntimeContext, map2, iEntityDTO);
					map.put(KBAccess.FIELD_CREDENTIALID, strCloudCredentialId);
				}
			}
		}

		
		if(!map.containsKey(KBAccess.FIELD_EXPIRESTIME)) {
			IPSDEField expirationDatePSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_EXPIRATION_DATE, true);
			if(expirationDatePSDEField != null) {
				Object expirationDate = iEntityDTO.get(expirationDatePSDEField.getLowerCaseName());
				if(expirationDate != null) {
					if(expirationDate instanceof String) {
						map.put(KBAccess.FIELD_EXPIRESTIME, expirationDate);
					}
					else
						if(expirationDate instanceof Date) {
							map.put(KBAccess.FIELD_EXPIRESTIME, DateUtils.toDateTimeString((Date)expirationDate));
						}
						else 
						{
							try {
								map.put(KBAccess.FIELD_EXPIRESTIME, DateUtils.toDateTimeString(DataTypeUtils.asDateTime(expirationDate)));
							}
							catch (Throwable ex) {
								log.error(String.format("过期时间[%1$s]类型不支持", expirationDate));
							}
						}
				}
			}
		}
		
		if(!map.containsKey(KBAccess.FIELD_DISABLED)) {
			map.put(KBAccess.FIELD_DISABLED, 0);
			IPSDEField statusPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_STATUS, true);
			if(statusPSDEField != null) {
				Object status = iEntityDTO.get(statusPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(status)) {
					String strStatus = String.valueOf(status);
					if(STATUS_ACTIVE.equalsIgnoreCase(strStatus) || STATUS_DISABLED.equalsIgnoreCase(strStatus) || STATUS_EXPIRED.equalsIgnoreCase(strStatus)) {
						if(STATUS_EXPIRED.equalsIgnoreCase(strStatus) || STATUS_DISABLED.equalsIgnoreCase(strStatus)) {
							map.put(KBAccess.FIELD_DISABLED, 1);
						}
					}
					else {
						if(statusPSDEField.getPSCodeList() != null) {
							ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(statusPSDEField.getPSCodeList().getId(), true);
							if(iCodeListRuntime != null) {
								IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItem(strStatus, true);
								if(iPSCodeItem!=null && StringUtils.hasLength(iPSCodeItem.getUserData())) {
									if(STATUS_EXPIRED.equalsIgnoreCase(iPSCodeItem.getUserData()) || STATUS_DISABLED.equalsIgnoreCase(iPSCodeItem.getUserData())) {
										map.put(KBAccess.FIELD_DISABLED, 1);
									}
								}
							}
						}
					}
				}
			}
		}
		
		if(!map.containsKey(KBAccess.FIELD_SERVICEURL)) {
			String strHubSystemId = this.getSystemRuntime().getDeploySystemId();
			if (this.getSystemRuntime() instanceof IServiceSystemRuntime) {
				IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) this.getSystemRuntime();
				if (StringUtils.hasLength(iServiceSystemRuntime.getMainSystemId())) {
					strHubSystemId = iServiceSystemRuntime.getMainSystemId();
				}
			}
			String strDeploySystemId = this.getSystemRuntime().getDeploySystemId();
			map.put(KBAccess.FIELD_SERVICEURL, String.format("lb://servicehub-%1$s/%2$s/kb", strHubSystemId, strDeploySystemId).toLowerCase());
		}
		
		if(!map.containsKey(KBAccess.FIELD_GUIDANCEPROMPT)) {
			IPSDEField iPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_GUIDANCE_PROMPT, true);
			if(iPSDEField != null) {
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(value)) {
					String strValue = String.valueOf(value);
					map.put(KBAccess.FIELD_GUIDANCEPROMPT, strValue);
				}
			}
		}
		
		if(!map.containsKey("kb_ids")) {
			map.put("kb_ids", iDataEntityRuntimeContext.getDataEntityRuntime().getKeyFieldValue(iEntityDTO).toString().toLowerCase());
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
	
	protected String getCloudCredentialId(IDataEntityRuntimeContext iDataEntityRuntimeContext, Map<String, Object> map, IEntityDTO iEntityDTO) throws Exception {
		if(!map.containsKey(UTILPARAM_UTIL)) {
			map.put(UTILPARAM_UTIL, this.getUtilParam(UTILPARAM_UTIL, "unknown"));
		}
		if(!map.containsKey(PARAM_SYSTEM)) {
			map.put(PARAM_SYSTEM, this.getSystemRuntime().getDeploySystemId());
		}
		return ExpressionUtils.getValue(this.getDefaultCloudCredentialIdFormat(iDataEntityRuntimeContext), map).toLowerCase();
	}
	
	
	@Override
	protected String getDefaultCloudConfigIdFormat(IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception {
		return "cloud-kb-agent-{system}-{util}--{key}";
	}
	
	protected String getDefaultCloudCredentialIdFormat(IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception {
		return "credential-{system}-{util}--{key}";
	}
}
