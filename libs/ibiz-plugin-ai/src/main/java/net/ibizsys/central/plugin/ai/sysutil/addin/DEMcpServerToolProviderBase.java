package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.plugin.ai.mcp.server.McpServerFeatures.AsyncToolSpecification;
import net.ibizsys.central.plugin.ai.mcp.server.McpServerFeatures.SyncToolSpecification;
import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.CallToolResult;
import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.Tool;
import net.ibizsys.central.plugin.groovy.support.DataEntityRuntimeExtension;
import net.ibizsys.codegen.core.util.StdDataTypeUtils;
import net.ibizsys.codegen.groovy.util.GroovyUtils;
import net.ibizsys.model.PSModelEnums.DEMethodInputType;
import net.ibizsys.model.PSModelEnums.DEMethodReturnType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class DEMcpServerToolProviderBase extends McpServerToolProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DEMcpServerToolProviderBase.class);
	private List<IPSDataEntity> totalPSDataEntityList = null;
	@Override
	protected void onInit() throws Exception {
		
		prepareToolSpecifications();
		super.onInit();
	}
	
	protected abstract List<IPSDataEntity> getPSDataEntities(); 
	
	protected List<IPSDataEntity> getTotalPSDataEntities() throws Exception{
		if(this.totalPSDataEntityList == null) {
			Map<String, IPSDataEntity> psDataEntityMap = new LinkedHashMap<String, IPSDataEntity>();
			for(IPSDataEntity iPSDataEntity : this.getPSDataEntities()) {
				fillRealPSDataEntityMap(iPSDataEntity, psDataEntityMap);
			}
			List<IPSDataEntity> realPSDataEntityList = new ArrayList<IPSDataEntity>();
			realPSDataEntityList.addAll(psDataEntityMap.values());
			this.totalPSDataEntityList = Collections.unmodifiableList(realPSDataEntityList);
		}
		return this.totalPSDataEntityList;
	}
	
	protected void fillRealPSDataEntityMap(IPSDataEntity iPSDataEntity, Map<String, IPSDataEntity> psDataEntityMap) throws Exception{
		if(psDataEntityMap.containsKey(iPSDataEntity.getCodeName())) {
			return;
		}
		
		psDataEntityMap.put(iPSDataEntity.getCodeName(), iPSDataEntity);
		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
		if(iDataEntityRuntime.getDefaultPSDEMethodDTO() != null) {
			IDEMethodDTORuntime iDEMethodDTORuntime = iDataEntityRuntime.getDEMethodDTORuntime(iDataEntityRuntime.getDefaultPSDEMethodDTO(), false);
			List<IDEMethodDTORuntime> nestedDEMethodDTORuntimes	= iDEMethodDTORuntime.getNestedDEMethodDTORuntimes();
			if(!ObjectUtils.isEmpty(nestedDEMethodDTORuntimes)) {
				for(IDEMethodDTORuntime nestedDEMethodDTORuntime : nestedDEMethodDTORuntimes) {
					this.fillRealPSDataEntityMap(nestedDEMethodDTORuntime.getDataEntityRuntime().getPSDataEntity(), psDataEntityMap);
				}
			}
		}
	}
	
	protected void prepareToolSpecifications() throws Exception {
		
		
		List<SyncToolSpecification> syncToolSpecificationList = new ArrayList<SyncToolSpecification>();
		List<AsyncToolSpecification> asyncToolSpecificationList = new ArrayList<AsyncToolSpecification>();
		
		//准备JsonSchema定义函数
		SyncToolSpecification tool = getGetEntityJsonSchemaSyncToolSpecification();
		if(tool != null) {
			syncToolSpecificationList.add(tool);
		}
		
		SyncToolSpecification tool2 = getListEntityMethodsSyncToolSpecification();
		if(tool2 != null) {
			syncToolSpecificationList.add(tool2);
		}
		
		SyncToolSpecification tool3 = getExecuteEntityMethodSyncToolSpecification();
		if(tool3 != null) {
			syncToolSpecificationList.add(tool3);
		}
		
		//
		
		for(SyncToolSpecification item :  syncToolSpecificationList) {
			asyncToolSpecificationList.add(AsyncToolSpecification.fromSync(item));
		}
		
		setSyncToolSpecifications(Collections.unmodifiableList(syncToolSpecificationList));
		setAsyncToolSpecifications(Collections.unmodifiableList(asyncToolSpecificationList));
	}

	protected SyncToolSpecification getGetEntityJsonSchemaSyncToolSpecification() throws Exception{
		String strCallSchema = "\"properties\": {\r\n" + 
		"          \"entity_name\": {\r\n" + 
		"            \"type\": \"string\",\r\n" + 
		"            \"enum\": [\r\n" ;
		boolean bFirst = true;
		for(IPSDataEntity iPSDataEntity : this.getTotalPSDataEntities()) {
			if(bFirst) {
				bFirst = false;
			}
			else {
				strCallSchema += ",\r\n";
			}
			strCallSchema += String.format("              \"%1$s\"", iPSDataEntity.getCodeName());
		}
		
		strCallSchema = strCallSchema + "\r\n" + 
		"            ],\r\n" + 
		"            \"description\": \"目标实体的名称\"\r\n" + 
		"          }\r\n" + 
		"        }\r\n";
		String strToolSchema = "{\n" +
        "  \"type\": \"object\",\n" +
        "  \"id\": \"tool_get_entity_jsons_chema\",\n" +
        strCallSchema +
        "}";
		
		StringBuilder sb = new StringBuilder();
		sb.append("获取传入实体的JsonSchema，目前支持的实体如下：\r\n");
		for(IPSDataEntity iPSDataEntity : this.getTotalPSDataEntities()) {
			sb.append(String.format("`%1$s` : %2$s", iPSDataEntity.getCodeName(), iPSDataEntity.getLogicName()));
			if(StringUtils.hasLength(iPSDataEntity.getMemo())) {
				sb.append(String.format("，%1$s", iPSDataEntity.getMemo().replace("\r\n", " ").replace("\n", " ")));
			}
		}
		
		SyncToolSpecification syncToolSpecification = new SyncToolSpecification(
			    new Tool("get_entity_jsons_chema", sb.toString(), strToolSchema),
			    (exchange, arguments) -> {
			    	String strEntityName = arguments.get("entity_name").toString();
			        return new CallToolResult(getEntityJsonSchema(strEntityName), false);
			    }
			);
		
		return syncToolSpecification;
	}
	
	protected String getEntityJsonSchema(String strEntityName) {
		
		try {
			IPSDataEntity iPSDataEntity = null;
			List<IPSDataEntity> list = this.getTotalPSDataEntities();
			if(!ObjectUtils.isEmpty(list)) {
				for(IPSDataEntity item : this.getTotalPSDataEntities()) {
					if(item.getCodeName().equalsIgnoreCase(strEntityName)) {
						iPSDataEntity = item;
						break;
					}
				}
			}
			if(iPSDataEntity == null) {
				throw new Exception("指定实体不存在");
			}
			IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
			String strRet =  DataEntityRuntimeExtension.getJsonSchemaModel(iDataEntityRuntime).toPrettyString();
			return strRet;
		}
		catch (Throwable ex) {
			log.error(String.format("获取实体`%1$s`JsonSchema发生错误，%2$s", strEntityName, ex.getMessage()), ex);
			return String.format("获取实体`%1$s`JsonSchema发生错误，%2$s", strEntityName, ex.getMessage());
		}
	}
	
	
	protected SyncToolSpecification getListEntityMethodsSyncToolSpecification() throws Exception{
		String strCallSchema = "\"properties\": {\r\n" + 
		"          \"entity_name\": {\r\n" + 
		"            \"type\": \"string\",\r\n" + 
		"            \"enum\": [\r\n" ;
		boolean bFirst = true;
		for(IPSDataEntity iPSDataEntity : this.getPSDataEntities()) {
			if(bFirst) {
				bFirst = false;
			}
			else {
				strCallSchema += ",\r\n";
			}
			strCallSchema += String.format("              \"%1$s\"", iPSDataEntity.getCodeName());
		}
		
		strCallSchema = strCallSchema + "\r\n" + 
		"            ],\r\n" + 
		"            \"description\": \"目标实体的名称\"\r\n" + 
		"          }\r\n" + 
		"        }\r\n";
		String strToolSchema = "{\n" +
        "  \"type\": \"object\",\n" +
        "  \"id\": \"tool_list_entity_methods\",\n" +
        strCallSchema +
        "}";
		
		StringBuilder sb = new StringBuilder();
		sb.append("获取传入实体的方法集合，目前支持的实体如下：\r\n");
		for(IPSDataEntity iPSDataEntity : this.getPSDataEntities()) {
			sb.append(String.format("`%1$s` : %2$s", iPSDataEntity.getCodeName(), iPSDataEntity.getLogicName()));
			if(StringUtils.hasLength(iPSDataEntity.getMemo())) {
				sb.append(String.format("，%1$s", iPSDataEntity.getMemo().replace("\r\n", " ").replace("\n", " ")));
			}
		}
		
		SyncToolSpecification syncToolSpecification = new SyncToolSpecification(
			    new Tool("list_entity_methods", sb.toString(), strToolSchema),
			    (exchange, arguments) -> {
			    	String strEntityName = arguments.get("entity_name").toString();
			        return new CallToolResult(listEntityMethods(strEntityName), false);
			    }
			);
		
		return syncToolSpecification;
	}

	protected String listEntityMethods(String strEntityName) {
		
		try {
			IPSDataEntity iPSDataEntity = null;
			List<IPSDataEntity> list = this.getTotalPSDataEntities();
			if(!ObjectUtils.isEmpty(list)) {
				for(IPSDataEntity item : this.getTotalPSDataEntities()) {
					if(item.getCodeName().equalsIgnoreCase(strEntityName)) {
						iPSDataEntity = item;
						break;
					}
				}
			}
			if(iPSDataEntity == null) {
				throw new Exception("指定实体不存在");
			}
			
			ArrayNode arrayNode = JsonUtils.createArrayNode();
			List<IPSDEAction> psDEActionList = iPSDataEntity.getAllPSDEActions();
			if(!ObjectUtils.isEmpty(psDEActionList)) {
				for(IPSDEAction iPSDEAction : psDEActionList) {
					if(!iPSDEAction.isEnableBackend()) {
						continue;
					}
					if(DEActionModes.READ.equals(iPSDEAction.getActionMode())
							|| DEActionModes.CREATE.equals(iPSDEAction.getActionMode())
							|| DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())
							|| DEActionModes.REMOVE.equals(iPSDEAction.getActionMode())) {
						
						ObjectNode node = arrayNode.addObject();
						node.put("name", iPSDEAction.getCodeName());
						if(StringUtils.hasLength(iPSDEAction.getMemo())) {
							node.put("description", iPSDEAction.getMemo());
						}
					
						if(iPSDEAction.getPSDEActionInput() != null) {
							ObjectNode input_node = node.putObject("input_schema");
							DEMethodInputType inputType = DEMethodInputType.from(iPSDEAction.getPSDEActionInput().getType());
							switch(inputType) {
							case NONE:
								input_node.put("type", "void");
								break;
							case KEYFIELD:
							case KEYFIELDS:
								StdDataType stdDataType = StdDataType.from(iPSDEAction.getPSDEActionInput().getKeyPSDEFieldMust().getStdDataType());
								if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)
										|| StdDataTypeUtils.isBigIntDataType(stdDataType)) {
									input_node.put("type", "number");
								}
								else {
									input_node.put("type", GroovyUtils.getJavaScriptType(stdDataType));
								}
								if(inputType == DEMethodInputType.KEYFIELDS) {
									input_node.put("array", true);
								}
								break;
							case DTO:
							case DTOS:
								
								input_node.put("type", "object");
								input_node.put("$ref", String.format("%1$s.json", iPSDataEntity.getCodeName()));
								if(inputType == DEMethodInputType.DTOS) {
									input_node.put("array", true);
								}
								break;
							default:
								break;
							}
						}
						if(iPSDEAction.getPSDEActionReturn() != null) {
							ObjectNode return_node = node.putObject("return_schema");
							DEMethodReturnType returnType = DEMethodReturnType.from(iPSDEAction.getPSDEActionReturn().getType());
							switch(returnType) {
							case VOID:
								if(iPSDEAction.getPSDEActionInput() != null && iPSDEAction.getPSDEActionInput().isOutput()) {
									DEMethodInputType inputType = DEMethodInputType.from(iPSDEAction.getPSDEActionInput().getType());
									return_node.put("type", "object");
									return_node.put("$ref", String.format("%1$s.json", iPSDataEntity.getCodeName()));
									if(inputType == DEMethodInputType.DTOS) {
										return_node.put("array", true);
									}
								}
								else
									return_node.put("type", "void");
								break;
							case SIMPLE:
							case SIMPLES:
								StdDataType stdDataType = StdDataType.from(iPSDEAction.getPSDEActionReturn().getStdDataType());
								if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)
										|| StdDataTypeUtils.isBigIntDataType(stdDataType)) {
									return_node.put("type", "number");
								}
								else {
									return_node.put("type", GroovyUtils.getJavaScriptType(stdDataType));
								}
								if(returnType == DEMethodReturnType.SIMPLES) {
									return_node.put("array", true);
								}
								break;
							case DTO:
							case DTOS:
								return_node.put("type", "object");
								return_node.put("$ref", String.format("%1$s.json", iPSDataEntity.getCodeName()));
								if(returnType == DEMethodReturnType.DTOS) {
									return_node.put("array", true);
								}
								break;
							default:
								break;
							}
						}
					}
				}
			}
			
			String strRet = arrayNode.toPrettyString();
			return strRet;
		}
		catch (Throwable ex) {
			log.error(String.format("获取实体`%1$s`方法集合发生错误，%2$s", strEntityName, ex.getMessage()), ex);
			return String.format("获取实体`%1$s`方法集合发生错误，%2$s", strEntityName, ex.getMessage());
		}
	}
	
	protected SyncToolSpecification getExecuteEntityMethodSyncToolSpecification() throws Exception{
		String strCallSchema = "\"properties\": {\r\n" + 
		"          \"entity_name\": {\r\n" + 
		"            \"type\": \"string\",\r\n" + 
		"            \"enum\": [\r\n" ;
		boolean bFirst = true;
		for(IPSDataEntity iPSDataEntity : this.getPSDataEntities()) {
			if(bFirst) {
				bFirst = false;
			}
			else {
				strCallSchema += ",\r\n";
			}
			strCallSchema += String.format("              \"%1$s\"", iPSDataEntity.getCodeName());
		}
		
		strCallSchema = strCallSchema + "\r\n" + 
		"            ],\r\n" + 
		"            \"description\": \"目标实体的名称\"\r\n" + 
		"          }\r\n" + 
		"          ,\"method_name\": {\r\n" + 
		"            \"type\": \"string\"\r\n" + 
		"            ,\"description\": \"执行方法名称\"\r\n" + 
		"          }\r\n" + 
		"          ,\"input\": {\r\n" + 
		"            \"description\": \"根据method的input_schema发送输入参数\"\r\n" + 
		"          }\r\n" + 
		"        }\r\n";
		String strToolSchema = "{\n" +
        "  \"type\": \"object\",\n" +
        "  \"id\": \"tool_execute_entity_method\",\n" +
        strCallSchema +
        "}";
		
		StringBuilder sb = new StringBuilder();
		sb.append("执行实体的方法，调用之前需要`list_entity_methods`获取实体支持的方法，包括方法名称，输入参数及返回值类型。");
		
		SyncToolSpecification syncToolSpecification = new SyncToolSpecification(
			    new Tool("execute_entity_method", sb.toString(), strToolSchema),
			    (exchange, arguments) -> {
			    	String strEntityName = arguments.get("entity_name").toString();
			    	String strMethodName = arguments.get("method_name").toString();
			    	Object input = arguments.get("input");
			        return new CallToolResult(executeEntityMethod(strEntityName, strMethodName, input), false);
			    }
			);
		
		return syncToolSpecification;
	}
	
	
	protected String executeEntityMethod(String strEntityName, String strMethodName, Object input) {
		return "";
	}
}
