package net.ibizsys.central.plugin.ai.dataentity.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.plugin.groovy.support.DataEntityRuntimeExtension;
import net.ibizsys.codegen.core.util.StdDataTypeUtils;
import net.ibizsys.codegen.groovy.util.GroovyUtils;
import net.ibizsys.model.PSModelEnums.DEMethodInputType;
import net.ibizsys.model.PSModelEnums.DEMethodReturnType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.runtime.util.JsonUtils;

public class DEChatPromptUtil implements IDEChatPromptUtil {

	public String getPSDEActionPrompt(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction) throws Throwable{
		
		ObjectNode node = JsonUtils.createObjectNode();
		if(StringUtils.hasLength(iPSDEAction.getCodeName())) {
			node.put("name", iPSDEAction.getCodeName());
		}
		else {
			node.put("name", iPSDEAction.getName());
		}
		
		//node.put("type", SADEMethodType.DEACTION.value);
		if(StringUtils.hasLength(iPSDEAction.getMemo())) {
			node.put("description", iPSDEAction.getMemo());
		}
		
		Map<String, IDEMethodDTORuntime> deMethodDTORuntimeMap = new LinkedHashMap<String, IDEMethodDTORuntime>();
			
	
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
				
				IPSDEMethodDTO iPSDEMethodDTO = iPSDEAction.getPSDEActionInput().getPSDEMethodDTOMust();
				
				IDEMethodDTORuntime iDEMethodDTORuntime = iDataEntityRuntime.getDEMethodDTORuntime(iPSDEMethodDTO, false);
				deMethodDTORuntimeMap.put(iDEMethodDTORuntime.getPSDEMethodDTO().getCodeName(), iDEMethodDTORuntime);
				List<IDEMethodDTORuntime> nestedDEMethodDTORuntimeList = iDEMethodDTORuntime.getNestedDEMethodDTORuntimes();
				if(!ObjectUtils.isEmpty(nestedDEMethodDTORuntimeList)) {
					for(IDEMethodDTORuntime item : nestedDEMethodDTORuntimeList) {
						deMethodDTORuntimeMap.put(item.getPSDEMethodDTO().getCodeName(), item);
					}
				}
				
				//判断类型
				input_node.put("$ref", String.format("%1$s.json", iPSDEMethodDTO.getCodeName()));
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
					IPSDEMethodDTO iPSDEMethodDTO = iPSDEAction.getPSDEActionInput().getPSDEMethodDTOMust();
					return_node.put("type", "object");
					return_node.put("$ref", String.format("%1$s.json", iPSDEMethodDTO.getCodeName()));
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
				IPSDEMethodDTO iPSDEMethodDTO = iPSDEAction.getPSDEActionReturn().getPSDEMethodDTOMust();
				
				IDEMethodDTORuntime iDEMethodDTORuntime = iDataEntityRuntime.getDEMethodDTORuntime(iPSDEMethodDTO, false);
				deMethodDTORuntimeMap.put(iDEMethodDTORuntime.getPSDEMethodDTO().getCodeName(), iDEMethodDTORuntime);
				List<IDEMethodDTORuntime> nestedDEMethodDTORuntimeList = iDEMethodDTORuntime.getNestedDEMethodDTORuntimes();
				if(!ObjectUtils.isEmpty(nestedDEMethodDTORuntimeList)) {
					for(IDEMethodDTORuntime item : nestedDEMethodDTORuntimeList) {
						deMethodDTORuntimeMap.put(item.getPSDEMethodDTO().getCodeName(), item);
					}
				}
				
				return_node.put("type", "object");
				return_node.put("$ref", String.format("%1$s.json", iPSDEMethodDTO.getCodeName()));
				if(returnType == DEMethodReturnType.DTOS) {
					return_node.put("array", true);
				}
				break;
			default:
				break;
			}
		}
		
		if(!ObjectUtils.isEmpty(deMethodDTORuntimeMap)) {
			ObjectNode defs_node = node.putObject("$defs");
			for(IDEMethodDTORuntime item :deMethodDTORuntimeMap.values()) {
				ObjectNode jsonSchemeModel = this.getDEMethodDTORuntimeJsonSchemaModel(item);
				defs_node.set(String.format("%1$s.json", item.getPSDEMethodDTO().getCodeName()), jsonSchemeModel);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("实体行为`%1$s`(%2$s)定义规范如下，包括输入规范`input_schema`、返回规范`return_schema`及预定义集合`$defs`\n", iPSDEAction.getLogicName(), iPSDEAction.getCodeName()));
		sb.append(String.format("```json\n%1$s\n```\n", node.toPrettyString()));
		return sb.toString();
	}
	
	public String getPSDEDataSetPrompt(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet) throws Throwable{
		return "";
	}
	
	public ObjectNode getDEMethodDTORuntimeJsonSchemaModel(IDEMethodDTORuntime iDEMethodDTORuntime) throws Throwable{
		return DataEntityRuntimeExtension.getPSDEMethodDTOJsonSchemaModel((IDataEntityRuntime)iDEMethodDTORuntime.getDataEntityRuntime(), iDEMethodDTORuntime.getPSDEMethodDTO());
	}
}
