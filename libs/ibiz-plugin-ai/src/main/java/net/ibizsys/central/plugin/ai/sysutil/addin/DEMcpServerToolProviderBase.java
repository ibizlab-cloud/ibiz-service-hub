package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.modelcontextprotocol.server.McpServerFeatures.AsyncToolSpecification;
import io.modelcontextprotocol.server.McpServerFeatures.SyncToolSpecification;
import io.modelcontextprotocol.spec.McpSchema.CallToolResult;
import io.modelcontextprotocol.spec.McpSchema.Tool;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.sysutil.IHubSysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUtilContainerOnly;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.central.plugin.groovy.support.DataEntityRuntimeExtension;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.codegen.core.util.StdDataTypeUtils;
import net.ibizsys.codegen.groovy.util.GroovyUtils;
import net.ibizsys.model.PSModelEnums.DEMethodInputType;
import net.ibizsys.model.PSModelEnums.DEMethodReturnType;
import net.ibizsys.model.PSModelEnums.SADEMethodType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class DEMcpServerToolProviderBase extends McpServerToolProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DEMcpServerToolProviderBase.class);
	private List<IPSDataEntity> totalPSDataEntityList = null;
	@Override
	protected void onInit() throws Exception {
		
		prepareToolSpecifications();
		super.onInit();
	}
	
	protected abstract List<IDEServiceAPIRuntime> getDEServiceAPIRuntimes(); 
	
	protected List<IPSDataEntity> getTotalPSDataEntities() throws Exception{
		if(this.totalPSDataEntityList == null) {
			Map<String, IPSDataEntity> psDataEntityMap = new LinkedHashMap<String, IPSDataEntity>();
			for(IDEServiceAPIRuntime iDEServiceAPIRuntime : this.getDEServiceAPIRuntimes()) {
				fillRealPSDataEntityMap(iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity(), psDataEntityMap);
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
		
		SyncToolSpecification tool4 = getGetEnumSyncToolSpecification();
		if(tool4 != null) {
			syncToolSpecificationList.add(tool4);
		}
		
		for(SyncToolSpecification item : syncToolSpecificationList) {
			asyncToolSpecificationList.add(fromSync(item));
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
			strCallSchema += String.format("              \"%1$s.json\"", iPSDataEntity.getCodeName());
		}
		
		strCallSchema = strCallSchema + "\r\n" + 
		"            ],\r\n" + 
		"            \"description\": \"目标实体的名称\"\r\n" + 
		"          }\r\n" + 
		"        }\r\n";
		String strToolSchema = "{\n" +
        "  \"type\": \"object\",\n" +
        "  \"id\": \"tool_get_entity_json_schema\",\n" +
        strCallSchema +
        "}";
		
		StringBuilder sb = new StringBuilder();
		sb.append("获取传入实体的JsonSchema，目前支持的实体如下：");
		for(IPSDataEntity iPSDataEntity : this.getTotalPSDataEntities()) {
			sb.append(String.format("\r\n`%1$s.json` : %2$s", iPSDataEntity.getCodeName(), iPSDataEntity.getLogicName()));
			if(StringUtils.hasLength(iPSDataEntity.getMemo())) {
				sb.append(String.format("，%1$s", iPSDataEntity.getMemo().replace("\r\n", " ").replace("\n", " ")));
			}
			sb.append(String.format(" "));
		}
		
		sb.append("\r\n## 注意事项\r\n 1.返回的JsonSchema会通过`enumSource`指定外部的枚举数据，可使用`get_enum`获取明细。");
		
		//sb.append("\r\n注意，JsonSchema中的枚举属性，输出时获取传入实体的JsonSchema，目前支持的实体如下：");
		
		SyncToolSpecification syncToolSpecification = new SyncToolSpecification(
			    new Tool("get_entity_json_schema", sb.toString(), strToolSchema),
			    (exchange, arguments) -> {
			    	String strEntityName = arguments.get("entity_name").toString();
			        return new CallToolResult(getEntityJsonSchema(strEntityName), false);
			    }
			);
		
		return syncToolSpecification;
	}
	
	protected String getEntityJsonSchema(String strEntityName) {
		int nPos = strEntityName.indexOf(".json");
		if(nPos != -1) {
			strEntityName = strEntityName.substring(0, nPos);
		}
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
	
	protected SyncToolSpecification getGetEnumSyncToolSpecification() throws Exception{
		String strCallSchema = "\"properties\": {\r\n" + 
		"          \"enum_name\": {\r\n" + 
		"            \"type\": \"string\",\r\n" + 
		"            \"description\": \"枚举的名称\"\r\n" + 
		"          }\r\n" + 
		"        }\r\n";
		String strToolSchema = "{\n" +
        "  \"type\": \"object\",\n" +
        "  \"id\": \"tool_get_enum\",\n" +
        strCallSchema +
        "}";
		
		StringBuilder sb = new StringBuilder();
		sb.append("获取传入枚举的明细，返回的");
		SyncToolSpecification syncToolSpecification = new SyncToolSpecification(
			    new Tool("get_enum", sb.toString(), strToolSchema),
			    (exchange, arguments) -> {
			    	String strEnumName = arguments.get("enum_name").toString();
			        return new CallToolResult(getEnum(strEnumName), false);
			    }
			);
		
		return syncToolSpecification;
	}
	
	protected String getEnum(String strEnumName) {
		
		Object param = new LinkedHashMap<String, Object>();
		int nMaxSize = 100;
		
		try {
			CodeList codeList;
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
			
			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				codeList = ((IHubSysExtensionUtilRuntime) iSysExtensionUtilRuntime).getCodeList(this.getSystemRuntime(), strEnumName, nMaxSize, param, true);
			} else {
				codeList = iSysExtensionUtilRuntime.getCodeList(strEnumName, nMaxSize, param, true);
			}
			
			if(codeList == null) {
				throw new Exception("指定枚举不存在");
			}
			
			return WebClientBase.getOutputMapper().writeValueAsString(codeList);
		}
		catch (Throwable ex) {
			log.error(String.format("获取枚举`%1$s`发生错误，%2$s", strEnumName, ex.getMessage()), ex);
			return String.format("获取枚举`%1$s`发生错误，%2$s", strEnumName, ex.getMessage());
		}
	}
	
	protected SyncToolSpecification getListEntityMethodsSyncToolSpecification() throws Exception{
		String strCallSchema = "\"properties\": {\r\n" + 
		"          \"entity_name\": {\r\n" + 
		"            \"type\": \"string\",\r\n" + 
		"            \"enum\": [\r\n" ;
		boolean bFirst = true;
		for(IDEServiceAPIRuntime iDEServiceAPIRuntime : this.getDEServiceAPIRuntimes()) {
			if(bFirst) {
				bFirst = false;
			}
			else {
				strCallSchema += ",\r\n";
			}
			strCallSchema += String.format("              \"%1$s\"", iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity().getCodeName());
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
		sb.append("获取传入实体的方法集合，目前支持的实体如下：");
		for(IDEServiceAPIRuntime iDEServiceAPIRuntime : this.getDEServiceAPIRuntimes()) {
			sb.append(String.format("\r\n`%1$s` : %2$s", iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity().getCodeName(), iDEServiceAPIRuntime.getPSDEServiceAPI().getLogicName()));
			if(StringUtils.hasLength(iDEServiceAPIRuntime.getPSDEServiceAPI().getMemo())) {
				sb.append(String.format("，%1$s", iDEServiceAPIRuntime.getPSDEServiceAPI().getMemo().replace("\r\n", " ").replace("\n", " ")));
			}
			else
				if(StringUtils.hasLength(iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity().getMemo())) {
					sb.append(String.format("，%1$s", iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity().getMemo().replace("\r\n", " ").replace("\n", " ")));
				}
			sb.append(String.format(" "));
		}
		sb.append("\r\n## 注意事项\r\n 1.实体方法包括两种类型：操作行为`DEACTION`和获取数据集`FETCH`。");
		sb.append("\r\n 2.通过数据主键获取数据一般使用`get`行为。");
		sb.append("\r\n## 数据集`FETCH`方法调用`过滤器`参数如下：\r\n");
		sb.append("{\r\n" + 
				"  \"page\": 0, // Current page number (0-indexed)\r\n" + 
				"  \"size\": 20, // Number of items per page， default is 20\r\n" + 
				"  \"sort\": \"field,dir\", // Sorting field and order\r\n" + 
				"  \"query\": \"keyword\" ,// Search keyword，可以不指定\r\n" + 
				"  // Additional search conditions，And condition\r\n" + 
				"  \"searchconds\":[\r\n" + 
				"    {\r\n" + 
				"      \"condtype\": \"DEFIELD\", // 属性条件\r\n" + 
				"      \"fieldname\": \"fieldName\", // Field name\r\n" + 
				"      \"condop\": \"eq\", // Operator, support EQ, GT, GTANDEQ, LT, LTANDEQ, NOTEQ, ISNULL, ISNOTNULL，LIKE, IN, NOTIN\r\n" + 
				"      \"value\": \"value\" // Field value，注意 `LIKE`操作无需添加 `%`,`ISNULL`及`ISNOTNULL`无需指定条件值\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"condtype\": \"GROUP\", // 组合条件\r\n" + 
				"      \"condop\": \"AND\", // Operator, support AND, OR\r\n" + 
				"      \"notmode\": false, // 是否取反，默认false\r\n" + 
				"      \"searchconds\": [ // Nested conditions\r\n" + 
				"        \r\n" + 
				"      ]\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}\r\n");
		sb.append("\r\n## 数据集`FETCH`返回结果一般为Spring的Page<DTO>对象。\r\n");
		
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
			IDEServiceAPIRuntime iDEServiceAPIRuntime = null;
			for(IDEServiceAPIRuntime item : this.getDEServiceAPIRuntimes()) {
				if(item.getPSDEServiceAPI().getCodeName().equalsIgnoreCase(strEntityName)) {
					iDEServiceAPIRuntime = item;
					break;
				}
			}
			if(iDEServiceAPIRuntime == null) {
				throw new Exception("指定实体不存在");
			}
			
			ArrayNode arrayNode = JsonUtils.createArrayNode();
			List<IPSDEServiceAPIMethod> psDEServiceAPIMethodList = iDEServiceAPIRuntime.getPSDEServiceAPI().getPSDEServiceAPIMethods();
			if(!ObjectUtils.isEmpty(psDEServiceAPIMethodList)) {
				for(IPSDEServiceAPIMethod iPSDEServiceAPIMethod : psDEServiceAPIMethodList) {
					if(SADEMethodType.DEACTION.value.equals(iPSDEServiceAPIMethod.getMethodType())) {
						if(!StringUtils.hasLength(iPSDEServiceAPIMethod.getDataAccessAction())) {
							continue;
						}
						IPSDEAction iPSDEAction = iPSDEServiceAPIMethod.getPSDEActionMust();
						ObjectNode node = arrayNode.addObject();
						node.put("name", iPSDEServiceAPIMethod.getName());
						node.put("type", SADEMethodType.DEACTION.value);
						if(StringUtils.hasLength(iPSDEServiceAPIMethod.getMemo())) {
							node.put("description", iPSDEServiceAPIMethod.getMemo());
						}
						else
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
								input_node.put("$ref", String.format("%1$s.json", iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity().getCodeName()));
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
									return_node.put("$ref", String.format("%1$s.json", iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity().getCodeName()));
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
								return_node.put("$ref", String.format("%1$s.json", iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity().getCodeName()));
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
				
				for(IPSDEServiceAPIMethod iPSDEServiceAPIMethod : psDEServiceAPIMethodList) {
					if(SADEMethodType.FETCH.value.equals(iPSDEServiceAPIMethod.getMethodType())) {
						
						IPSDEDataSet iPSDEDataSet = iPSDEServiceAPIMethod.getPSDEDataSetMust();
						ObjectNode node = arrayNode.addObject();
						node.put("name", iPSDEServiceAPIMethod.getName());
						node.put("type", SADEMethodType.FETCH.value);
						if(StringUtils.hasLength(iPSDEServiceAPIMethod.getMemo())) {
							node.put("description", iPSDEServiceAPIMethod.getMemo());
						}
						else
							if(StringUtils.hasLength(iPSDEDataSet.getMemo())) {
								node.put("description", iPSDEDataSet.getMemo());
							}
						
						ObjectNode input_node = node.putObject("input_schema");
						input_node.put("type", "object");
						input_node.put("description", "过滤器参数");
					
						
						if(iPSDEDataSet.getPSDEDataSetReturn() != null) {
							ObjectNode return_node = node.putObject("return_schema");
							return_node.put("type", "object");
							//return_node.put("$ref", String.format("%1$s.json", iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity().getCodeName()));
							//return_node.put("array", true);
							return_node.put("description", String.format("Spring的Page<DTO>对象，DTO引用`%1$s.json`", iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity().getCodeName()));
							
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
		for(IDEServiceAPIRuntime iDEServiceAPIRuntime : this.getDEServiceAPIRuntimes()) {
			if(bFirst) {
				bFirst = false;
			}
			else {
				strCallSchema += ",\r\n";
			}
			strCallSchema += String.format("              \"%1$s\"", iDEServiceAPIRuntime.getDataEntityRuntime().getPSDataEntity().getCodeName());
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
		sb.append("执行实体的方法，调用之前需要`list_entity_methods`获取实体支持的方法，包括方法名称，输入参数及返回值类型。输入参数定义的JsonSchema对象引用（$ref），需要调用`get_entity_json_schema`获取信息。");
		sb.append("\r\n## 注意事项\r\n 1.返回结果中的枚举值一般都会提供对应的文本，如属性`type`，则文本在属性`type_text`中");
		sb.append("\r\n 2.每次必须通过方法（get或是fetchXX）重新获取数据，不能从上下文中提取。");
		
		SyncToolSpecification syncToolSpecification = new SyncToolSpecification(
			    new Tool("execute_entity_method", sb.toString(), strToolSchema),
			    (exchange, arguments) -> {
			    	String strEntityName = arguments.get("entity_name").toString();
			    	String strMethodName = arguments.get("method_name").toString();
			    	Object input = arguments.get("input");
			    	
			    	return executeUserContextAction(arguments, new IAction() {
			    		@Override
						public Object execute(Object[] args) throws Throwable {
							return executeEntityMethod(strEntityName, strMethodName, input);
						}
			    		
			    	}, null, true);
			    }
			);
		
		return syncToolSpecification;
	}
	
	
	protected String executeEntityMethod(String strEntityName, String strMethodName, Object input) throws Throwable {
		
		try {
			IDEServiceAPIRuntime iDEServiceAPIRuntime = null;
			for(IDEServiceAPIRuntime item : this.getDEServiceAPIRuntimes()) {
				if(item.getPSDEServiceAPI().getCodeName().equalsIgnoreCase(strEntityName)) {
					iDEServiceAPIRuntime = item;
					break;
				}
			}
			if(iDEServiceAPIRuntime == null) {
				throw new Exception("指定实体不存在");
			}
			Object ret = this.onExecuteEntityMethod(iDEServiceAPIRuntime, strMethodName, input);
			return convertExecuteEntityMethodResult(ret, iDEServiceAPIRuntime, strMethodName, input);
		}
		catch (Throwable ex) {
			log.error(String.format("执行实体`%1$s`方法`%2$s`发生错误，%3$s", strEntityName, strMethodName, ex.getMessage()), ex);
			throw new Exception(String.format("执行实体`%1$s`方法`%2$s`发生错误，%3$s", strEntityName, strMethodName, ex.getMessage()));
		}
	}
	
	protected String convertExecuteEntityMethodResult(Object ret, IDEServiceAPIRuntime iDEServiceAPIRuntime, String strMethodName, Object input) throws Throwable{
		if(ret == null) {
			return String.format("执行成功");
		}
		
		if(ret instanceof String) {
			return (String)ret;
		}
		
		if(ret instanceof IEntityDTO) {
			iDEServiceAPIRuntime.getDataEntityRuntime().fillEntityCodeListTexts((IEntityDTO)ret, "_text");
		}
		else
			if(ret instanceof List) {
				for(Object item : (List)ret) {
					if(item instanceof IEntityDTO) {
						iDEServiceAPIRuntime.getDataEntityRuntime().fillEntityCodeListTexts((IEntityDTO)item, "_text");
					}
				}
			}
			else
				if(ret instanceof Map) {
					for(Object item : ((Map)ret).values()) {
						if(item instanceof IEntityDTO) {
							iDEServiceAPIRuntime.getDataEntityRuntime().fillEntityCodeListTexts((IEntityDTO)item, "_text");
						}
					}
				}
				else
					if(ret instanceof Page) {
						for(Object item : ((Page)ret)) {
							if(item instanceof IEntityDTO) {
								iDEServiceAPIRuntime.getDataEntityRuntime().fillEntityCodeListTexts((IEntityDTO)item, "_text");
							}
						}
					}
		
		return WebClientBase.getOutputMapper().writeValueAsString(ret);
	}
	
	protected Object onExecuteEntityMethod(IDEServiceAPIRuntime iDEServiceAPIRuntime, String strMethodName, Object input) throws Throwable{
		String strKey = null;
		Object body = null;
		if(input instanceof Map) {
			body = input;
		}
		else if(input instanceof List) {
			body = input;
		}
		else
			if(input != null) {
				strKey = input.toString();
			}
		
		return iDEServiceAPIRuntime.invokeMethod(null, null, null, strMethodName, body, strKey, null);
		
	}
}
