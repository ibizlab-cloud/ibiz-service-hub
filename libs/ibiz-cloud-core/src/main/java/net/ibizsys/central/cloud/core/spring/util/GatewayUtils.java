package net.ibizsys.central.cloud.core.spring.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.util.Inflector;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelEnums.DynaSysMode;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.codelist.IPSAppCodeList;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.runtime.dataentity.DEExtendModes;
import net.ibizsys.runtime.dataentity.DEStorageModes;
import net.ibizsys.runtime.util.JsonUtils;

public class GatewayUtils {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(GatewayUtils.class);
	
	//private static ObjectMapper MAPPER = new ObjectMapper();
	
	public static ObjectNode getAppGatewayNode(String strDeploySystemId, String strServiceId, IPSApplication iPSApplication) throws Exception {
		return getAppGatewayNode(strDeploySystemId, strServiceId, iPSApplication, false);
	}
	
	public static ObjectNode getAppGatewayNode(String strDeploySystemId, String strServiceId, IPSApplication iPSApplication, boolean bEnableExtension) throws Exception {
		return getAppGatewayNode(strDeploySystemId, strServiceId, iPSApplication, bEnableExtension, false);
	}
	
	/**
	 * 获取应用路由配置模型（不使用运行时模型，考虑后续仅模型场景）
	 * @param strDeploySystemId
	 * @param iPSApplication
	 * @return
	 */
	public static ObjectNode getAppGatewayNode(String strDeploySystemId, String strServiceId, IPSApplication iPSApplication, boolean bEnableExtension, boolean bPlaceHolder) throws Exception {
		
		IPSSystem iPSSystem = iPSApplication.getParentPSModelObject(IPSSystem.class, false);
		
		
		strServiceId = strServiceId.toLowerCase();
		String strAPIPrefix = String.format("%1$s__%2$s", strDeploySystemId, iPSApplication.getCodeName()).toLowerCase();
		
		
		ObjectNode gatewayNode = JsonUtils.createObjectNode();
		ArrayNode routesNode = gatewayNode.putArray("routes");
		
		//appdata
		if(!bEnableExtension || strDeploySystemId.equalsIgnoreCase(strServiceId) || bPlaceHolder) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__appdata", strAPIPrefix));
			objectNode.put("uri", String.format("lb://servicehub-%1$s", strServiceId));
			objectNode.put("order", 50);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/appdata/**",strAPIPrefix));
			
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
			filtersNode.add(String.format("PrefixPath=/%1$s", strServiceId));
		}
	
		
		//cloud-uaa
		if(true) {
			///ls/v7/**,/ls/ibizutil/**,/ls/configs/**,/ls/ibzemployees/**,/ls/wfcore/**,/ls/uaa/**
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_uaa", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_UAA));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/v7/**,/%1$s/uaa/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}
		
		//cloud-oss
		if(true) {
			///ls/v7/**,/ls/ibizutil/**,/ls/configs/**,/ls/ibzemployees/**,/ls/wfcore/**,/ls/uaa/**
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_oss", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_OSS));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/ibizutil/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}
		
		
		if(bEnableExtension) {
			//转发启用动态系统的代码表
			List<IPSAppCodeList> psAppCodeLists = iPSApplication.getAllPSAppCodeLists();
			if(!ObjectUtils.isEmpty(psAppCodeLists)) {
				List<String> list = new ArrayList<>();
				for(IPSAppCodeList iPSAppCodeList : psAppCodeLists) {
					if(iPSAppCodeList.getDynaSysMode() != DynaSysMode.DISABLED.value) {
						list.add(String.format("/%1$s/dictionaries/codelist/%2$s/**", strAPIPrefix, iPSAppCodeList.getCodeListTag()));
						list.add(String.format("/%1$s/dictionarys/codelist/%2$s/**", strAPIPrefix, iPSAppCodeList.getCodeListTag()));
					}
				}
				
				if(!ObjectUtils.isEmpty(list)) {
					ObjectNode objectNode = routesNode.addObject();
					objectNode.put("id", String.format("%1$s__cloud_conf_dynasys", strAPIPrefix));
					objectNode.put("uri", String.format("lb://servicehub-%1$s", strServiceId));
					objectNode.put("order", 50);
					ArrayNode predicatesNode = objectNode.putArray("predicates");
					predicatesNode.add(String.format("Path=%1$s", StringUtils.collectionToDelimitedString(list, ",")));
					ArrayNode filtersNode = objectNode.putArray("filters");
					filtersNode.add("StripPrefix=2");
					filtersNode.add(String.format("PrefixPath=/%1$s/extension/dictionaries", strServiceId));
				}
			}
		}
		
		//cloud-conf
		if(true) {
			///ls/v7/**,/ls/ibizutil/**,/ls/configs/**,/ls/ibzemployees/**,/ls/wfcore/**,/ls/uaa/**
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_conf", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_CONF));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/configs/**,/%1$s/dictionaries/**,/%1$s/dictionarys/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}
		
		

		//cloud-workflow
		if(true) {
			///ls/v7/**,/ls/ibizutil/**,/ls/configs/**,/ls/ibzemployees/**,/ls/wfcore/**,/ls/uaa/**
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_workflow", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_WF));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/wfcore/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}
			
		//cloud-devops
		if(!bEnableExtension) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_devops", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_DEVOPS));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/remotemodel/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=2");
			filtersNode.add(String.format("PrefixPath=/devops/dynamodels/pssysapps/%1$s", iPSApplication.getCodeName()));
		}
		else {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_devops", strAPIPrefix));
			objectNode.put("uri", String.format("lb://servicehub-%1$s", strServiceId));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/remotemodel/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=2");
			filtersNode.add(String.format("PrefixPath=/%2$s/extension/dynamodels/pssysapps/%1$s", iPSApplication.getCodeName(), strServiceId));
		}
		
		if(!bEnableExtension) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_devops_jsonschema", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_DEVOPS));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/jsonschema/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=2");
			filtersNode.add(String.format("PrefixPath=/devops/jsonschemas/pssysapps/%1$s", iPSApplication.getCodeName()));
		}
		else {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_devops_jsonschema", strAPIPrefix));
			objectNode.put("uri", String.format("lb://servicehub-%1$s", strServiceId));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/jsonschema/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=2");
			filtersNode.add(String.format("PrefixPath=/%2$s/extension/jsonschemas/pssysapps/%1$s", iPSApplication.getCodeName(), strServiceId));
		}
		
		//cloud-portal
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_portal", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/portal/markopendata/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}
		
		//cloud-portal-collaborate，协同编辑
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_portal_collaborate", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/portal/collaborate/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}
		
		
		//cloud-portal-asyncaction，只需要GET行为
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_portal_asyncaction", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/portal/asyncaction/**",strAPIPrefix));
			predicatesNode.add(String.format("Method=GET"));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}
		
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_portal_asyncaction_select", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/portal/asyncaction/executing,/%1$s/portal/asyncaction/finished,/%1$s/portal/asyncaction/error,/%1$s/portal/asyncaction/all",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}
		
				
		//cloud-portal-mqtt
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_portal_mqtt", strAPIPrefix));
			objectNode.put("uri", String.format("lb:ws://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL_MQTT));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/portal/mqtt/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=3");
		}
		
		//cloud-saas-extendsion
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_saas_extension", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_EXTENSION));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/extension/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=2");
			filtersNode.add("PrefixPath=/extension/api");
		}
		
		//webhook
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__webhooks", strAPIPrefix));
			objectNode.put("uri", String.format("lb://servicehub-%1$s", strServiceId));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/webhooks/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=2");
			filtersNode.add(String.format("PrefixPath=/%1$s/extension/webhooks", strServiceId));
		}
		
//		
//		if(true) {
//			ObjectNode objectNode = routesNode.addObject();
//			objectNode.put("id", String.format("%1$s__cloud_devops_dynamodelapi", strAPIPrefix));
//			objectNode.put("uri", String.format("lb://servicehub-%1$s", strServiceId));
//			objectNode.put("order", 60);
//			ArrayNode predicatesNode = objectNode.putArray("predicates");
//			predicatesNode.add(String.format("Path=/%1$s/extension/**",strAPIPrefix));
//			ArrayNode filtersNode = objectNode.putArray("filters");
//			filtersNode.add("StripPrefix=2");
//			filtersNode.add("PrefixPath=/extension/api");
//			
//			{
//			    "id" : "workflowdesign__workflowdesign__proxy_ibizoa",
//			    "uri" : "lb://ibizoa-serviceapi",
//			    "order" : 80,
//			    "predicates" : [ "Path=/workflowdesign__workflowdesign/**" ,"Header=Srfsystemid,ibizoa"],
//			    "filters" : [ "StripPrefix=1", "PrefixPath=/ibizoa/extension/dynamodelapi" ]
//			  }
//		}
				
		
		//循环应用实体
		java.util.List<IPSAppDataEntity> psAppDataEntities = iPSApplication.getAllPSAppDataEntities();
		if(!ObjectUtils.isEmpty(psAppDataEntities)) {
			
			Map<String, IPSDEServiceAPI> psPSDEServiceAPIMap = getPSDEServiceAPIMap(iPSSystem);
			if(!ObjectUtils.isEmpty(psPSDEServiceAPIMap)) {
				for(IPSAppDataEntity iPSAppDataEntity : psAppDataEntities) {
					
					if(!StringUtils.hasLength(iPSAppDataEntity.getSysAPITag()) || !StringUtils.hasLength(iPSAppDataEntity.getDEAPITag())) {
						continue;
					}
					
					IPSDEServiceAPI iPSDEServiceAPI = psPSDEServiceAPIMap.get(String.format("%1$s-%2$s", iPSAppDataEntity.getSysAPITag(), iPSAppDataEntity.getDEAPITag()).toLowerCase());
					if(iPSDEServiceAPI == null) {
						throw new Exception(String.format("无法获取应用实体[%1$s]绑定的服务接口[%2$s-%3$s]", iPSAppDataEntity.getName(), iPSAppDataEntity.getSysAPITag(), iPSAppDataEntity.getDEAPITag()));
					}
					
					if(!iPSDEServiceAPI.isMajor()) {
						continue;
					}
					
					String strAppDataEntityCodeName = iPSAppDataEntity.getDEAPICodeName2();
					if(!StringUtils.hasLength(strAppDataEntityCodeName)) {
						if(StringUtils.hasLength(iPSAppDataEntity.getDEAPICodeName())) {
							strAppDataEntityCodeName = Inflector.getInstance().pluralize(iPSAppDataEntity.getDEAPICodeName());
						}
						else {
							strAppDataEntityCodeName = iPSAppDataEntity.getCodeName2();
							if(!StringUtils.hasLength(strAppDataEntityCodeName)) {
								strAppDataEntityCodeName = Inflector.getInstance().pluralize(iPSAppDataEntity.getCodeName());
							}
						}
					}
					
					strAppDataEntityCodeName = strAppDataEntityCodeName.toLowerCase();
					
					IPSDataEntity iPSDataEntity = iPSDEServiceAPI.getPSDataEntityMust();
					//判断实体是否为外部服务实体
					if(((iPSDataEntity.getStorageMode() & DEStorageModes.SERVICEAPI) == DEStorageModes.SERVICEAPI)
							&& iPSDataEntity.getPSSubSysServiceAPI() != null
							&& iPSDataEntity.getPSSubSysServiceAPIDE() != null
							&& iPSDataEntity.getExtendMode() == DEExtendModes.NONE
							&& StringUtils.hasLength(iPSDataEntity.getPSSubSysServiceAPI().getServicePath())
							&& iPSDataEntity.getPSSubSysServiceAPI().getServicePath().indexOf("lb://") == 0) {
						
						ObjectNode objectNode = routesNode.addObject();
						objectNode.put("id", String.format("%1$s__%2$s", strAPIPrefix, iPSAppDataEntity.getCodeName().toLowerCase()));
						String strServicePath = iPSDataEntity.getPSSubSysServiceAPI().getServicePath();
						String strPrefixPath = "";
						int nPos = strServicePath.indexOf("//");
						
						if(nPos == -1) {
							nPos = strServicePath.indexOf("/");
							if(nPos != -1) {
								strPrefixPath = strServicePath.substring(nPos);
								strServicePath = strServicePath.substring(0, nPos);
							}
						}
						else {
							nPos = strServicePath.indexOf("/", nPos + 2);
							if(nPos != -1) {
								strPrefixPath = strServicePath.substring(nPos);
								strServicePath = strServicePath.substring(0, nPos);
							}
						}
						objectNode.put("uri", strServicePath);
						objectNode.put("order", 100);
						ArrayNode predicatesNode = objectNode.putArray("predicates");
						predicatesNode.add(String.format("Path=/%1$s/%2$s/**",strAPIPrefix, strAppDataEntityCodeName));
						
						ArrayNode filtersNode = objectNode.putArray("filters");
						filtersNode.add("StripPrefix=1");
						if(StringUtils.hasLength(strPrefixPath)) {
							filtersNode.add(String.format("PrefixPath=%1$s", strPrefixPath));
						}
						continue;
					}
					
					//未来需要转服务代码（获取强行要求代码名不能改）
					
					
					
					ObjectNode objectNode = routesNode.addObject();
					objectNode.put("id", String.format("%1$s__%2$s", strAPIPrefix, iPSAppDataEntity.getCodeName().toLowerCase()));
					objectNode.put("uri", String.format("lb://%1$s-%2$s", strServiceId, iPSAppDataEntity.getSysAPITag().toLowerCase()));
					objectNode.put("order", 100);
					ArrayNode predicatesNode = objectNode.putArray("predicates");
					predicatesNode.add(String.format("Path=/%1$s/%2$s/**",strAPIPrefix, strAppDataEntityCodeName));
					
					ArrayNode filtersNode = objectNode.putArray("filters");
					filtersNode.add("StripPrefix=1");
					filtersNode.add(String.format("PrefixPath=/%1$s/%2$s", strServiceId, iPSAppDataEntity.getSysAPITag().toLowerCase()));
					
				}
			}
			
		}
		
		//旧版本OU支持
		if(true) {
			Map<String, String> map = new LinkedHashMap<String, String>();
			map.put("ibzemployees", "");
			map.put("sysemployees", "");
			map.put("ibzdepartments", "");
			map.put("sysdepartments", "");
			map.put("ibzorganizations", "");
			map.put("sysorganizations", "");
			
			String strOldOUServiceId = "ebsx-oldou";
			for(java.util.Map.Entry<String, String> entry : map.entrySet()) {
				
				ObjectNode objectNode = routesNode.addObject();
				objectNode.put("id", String.format("%1$s__oldou__%2$s", strAPIPrefix, entry.getKey()));
				objectNode.put("uri", String.format("lb://%1$s", strOldOUServiceId));
				objectNode.put("order", 120);
				ArrayNode predicatesNode = objectNode.putArray("predicates");
				predicatesNode.add(String.format("Path=/%1$s/%2$s/**",strAPIPrefix, entry.getKey()));
				
				ArrayNode filtersNode = objectNode.putArray("filters");
				filtersNode.add("StripPrefix=1");
				filtersNode.add(String.format("PrefixPath=/ebsx/oldou"));
			}
		}
		
		
		
		
		return gatewayNode;
	}
	
	protected static Map<String, IPSDEServiceAPI> getPSDEServiceAPIMap(IPSSystem iPSSystem){
		java.util.List<IPSSysServiceAPI> psSysServiceAPIs = iPSSystem.getAllPSSysServiceAPIs();
		if(ObjectUtils.isEmpty(psSysServiceAPIs)) {
			return null;
		}
		
		Map<String, IPSDEServiceAPI> psDEServiceAPIMap = new HashMap<>();
		for(IPSSysServiceAPI iPSSysServiceAPI : psSysServiceAPIs) {
			java.util.List<IPSDEServiceAPI> psDEServiceAPIs = iPSSysServiceAPI.getPSDEServiceAPIs();
			if(ObjectUtils.isEmpty(psDEServiceAPIs)) {
				continue;
			}
			
			for(IPSDEServiceAPI iPSDEServiceAPI : psDEServiceAPIs) {
				psDEServiceAPIMap.put(String.format("%1$s-%2$s", iPSSysServiceAPI.getCodeName(), iPSDEServiceAPI.getName()).toLowerCase(), iPSDEServiceAPI);
			}
		
		}
		
		return psDEServiceAPIMap;
	}
	
	/**
	 * 获取模型工具应用路由配置模型
	 * @param strDeploySystemId
	 * @param strServiceId
	 * @param iPSApplication
	 * @return
	 * @throws Exception
	 */
	public static ObjectNode getPSModelToolAppGatewayNode(String strDeploySystemId, String strServiceId, IPSApplication iPSApplication) throws Exception {
		return getPSModelToolAppGatewayNode(strDeploySystemId, strServiceId, iPSApplication, null);
	}
	
	/**
	 * 获取模型工具应用路由配置模型
	 * @param strDeploySystemId
	 * @param strServiceId
	 * @param iPSApplication
	 * @param strDynaModelAPIUri
	 * @return
	 */
	public static ObjectNode getPSModelToolAppGatewayNode(String strDeploySystemId, String strServiceId, IPSApplication iPSApplication, String strDynaModelAPI) throws Exception {
		
		strServiceId = strServiceId.toLowerCase();
		String strAPIPrefix = String.format("%1$s__%2$s", strDeploySystemId, iPSApplication.getCodeName()).toLowerCase();
		
		
		ObjectNode gatewayNode = JsonUtils.createObjectNode();
		ArrayNode routesNode = gatewayNode.putArray("routes");
			
		//cloud-devops
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_devops", strAPIPrefix));
			objectNode.put("uri", String.format("lb://servicehub-%1$s", strServiceId));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/remotemodel/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=2");
			filtersNode.add(String.format("PrefixPath=/%2$s/extension/dynamodels/pssysapps/%1$s", iPSApplication.getCodeName(), strServiceId));
		}
		
		
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_devops_jsonschema", strAPIPrefix));
			objectNode.put("uri", String.format("lb://servicehub-%1$s", strServiceId));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/jsonschema/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=2");
			filtersNode.add(String.format("PrefixPath=/%2$s/extension/jsonschemas/pssysapps/%1$s", iPSApplication.getCodeName(), strServiceId));
		}
		
		/*
		 *  "id" : "formdesign__formdesign__proxy_ibizoa",
    "uri" : "lb://ibizoa-serviceapi",
    "order" : 80,
    "predicates" : [ "Path=/formdesign__formdesign/**" ,"Header=Srfsystemid,ibizoa"],
    "filters" : [ "StripPrefix=1", "PrefixPath=/ibizoa/extension/dynamodelapi" ]
		 */

		//cloud-portal
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_portal", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/portal/markopendata/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}

		//cloud-portal-collaborate，协同编辑
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_portal_collaborate", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/portal/collaborate/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}

		//cloud-portal-mqtt
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_portal_mqtt", strAPIPrefix));
			objectNode.put("uri", String.format("lb:ws://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL_MQTT));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/portal/mqtt/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=3");
		}

		//cloud-conf
		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_conf", strAPIPrefix));
			objectNode.put("uri", String.format("lb://%1$s", ICloudUtilRuntime.CLOUDSERVICEURL_CONF));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/configs/**,/%1$s/dictionaries/**,/%1$s/dictionarys/**",strAPIPrefix));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
		}

		if(true) {
			ObjectNode objectNode = routesNode.addObject();
			objectNode.put("id", String.format("%1$s__cloud_devops_dynamodelapi", strAPIPrefix));
			objectNode.put("uri", String.format("lb://servicehub-%1$s", strServiceId));
			objectNode.put("order", 60);
			ArrayNode predicatesNode = objectNode.putArray("predicates");
			predicatesNode.add(String.format("Path=/%1$s/**",strAPIPrefix));
			predicatesNode.add(String.format("Header=Srfsystemid,%1$s",strServiceId));
			ArrayNode filtersNode = objectNode.putArray("filters");
			filtersNode.add("StripPrefix=1");
			if(StringUtils.hasLength(strDynaModelAPI)) {
				filtersNode.add(String.format("PrefixPath=/%1$s/%2$s", strServiceId, strDynaModelAPI));
			}
			else {
				filtersNode.add(String.format("PrefixPath=/%1$s/extension/dynamodelapi", strServiceId));
			}

		}
		return gatewayNode;
	}
	
	public static ObjectNode appendAppGatewayNode(ObjectNode gatewayNode, ObjectNode gatewayNode2) throws Exception{
		JsonNode routesNode = gatewayNode.get("routes");
		JsonNode routesNode2 = gatewayNode2.get("routes");
		if(routesNode != null) {
			if(routesNode2!=null) {
				ArrayNode routesArrayNode = (ArrayNode)routesNode;
				ArrayNode routesArrayNode2 = (ArrayNode)routesNode2;
				routesArrayNode.addAll(routesArrayNode2);
			}
			return gatewayNode;
		}
		else {
			return gatewayNode2;
		}
	}
}
