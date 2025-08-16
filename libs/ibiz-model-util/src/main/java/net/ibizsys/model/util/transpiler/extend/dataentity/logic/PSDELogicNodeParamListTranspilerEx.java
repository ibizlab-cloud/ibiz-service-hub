package net.ibizsys.model.util.transpiler.extend.dataentity.logic;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.dataentity.logic.PSDELogicNodeParamImpl;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDELNParam;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDELogicNodeParamListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeParamListTranspiler{
	
	private static Map<String, String> SystemFieldMap = new HashMap<String, String>();
	static {
		SystemFieldMap.put("aggmode","");
		SystemFieldMap.put("createdate","");
		SystemFieldMap.put("createman","");
		SystemFieldMap.put("customdstparam","");
		SystemFieldMap.put("customsrcparam","");
		SystemFieldMap.put("directcode","");
		SystemFieldMap.put("dstindex","");
		SystemFieldMap.put("dstparampsdeid","");
		SystemFieldMap.put("dstpsdefid","");
		SystemFieldMap.put("dstpsdefname","");
		SystemFieldMap.put("dstpsdlparamid","");
		SystemFieldMap.put("dstpsdlparamname","");
		SystemFieldMap.put("dstsortdir","");
		SystemFieldMap.put("dynamodelflag","");
		SystemFieldMap.put("inoutflag","");
		SystemFieldMap.put("memo","");
		SystemFieldMap.put("ordervalue","");
		SystemFieldMap.put("paramtag","");
		SystemFieldMap.put("paramtag2","");
		SystemFieldMap.put("paramtype","");
		SystemFieldMap.put("paramtypetext","");
		SystemFieldMap.put("psdeid","");
		SystemFieldMap.put("psdelnparamid","");
		SystemFieldMap.put("psdelnparamname","");
		SystemFieldMap.put("psdelogicid","");
		SystemFieldMap.put("psdelogicnodeid","");
		SystemFieldMap.put("psdelogicnodename","");
		SystemFieldMap.put("psdename","");
		SystemFieldMap.put("psdynainstid","");
		SystemFieldMap.put("psobjdata","");
		SystemFieldMap.put("psobjdata2","");
		SystemFieldMap.put("psobjid","");
		SystemFieldMap.put("psobjname","");
		SystemFieldMap.put("psobjtype","");
		SystemFieldMap.put("psobjtypename","");
		SystemFieldMap.put("pssysmsgtemplid","");
		SystemFieldMap.put("pssysmsgtemplname","");
		SystemFieldMap.put("pssyssequenceid","");
		SystemFieldMap.put("pssyssequencename","");
		SystemFieldMap.put("pssystranslatorid","");
		SystemFieldMap.put("pssystranslatorname","");
		SystemFieldMap.put("srcindex","");
		SystemFieldMap.put("srcparampsdeid","");
		SystemFieldMap.put("srcpsdefid","");
		SystemFieldMap.put("srcpsdefname","");
		SystemFieldMap.put("srcpsdlparamid","");
		SystemFieldMap.put("srcpsdlparamname","");
		SystemFieldMap.put("srcsize","");
		SystemFieldMap.put("srcvalue","");
		SystemFieldMap.put("srcvaluestddatatype","");
		SystemFieldMap.put("srcvaluetype","");
		SystemFieldMap.put("srcvaluetypetext","");
		SystemFieldMap.put("updatedate","");
		SystemFieldMap.put("updateman","");
		SystemFieldMap.put("usercat","");
		SystemFieldMap.put("usertag","");
		SystemFieldMap.put("usertag2","");
		SystemFieldMap.put("usertag3","");
		SystemFieldMap.put("usertag4","");
	}
	
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDELNParam psDELNParam = (PSDELNParam) domain;
		
		//将数据对象中的值额外放入动态参数中
		ObjectNode paramsNode = null;
		if(objectNode.has(PSDELogicNodeParamImpl.ATTR_GETPARAMS)) {
			paramsNode = (ObjectNode)objectNode.get(PSDELogicNodeParamImpl.ATTR_GETPARAMS);
		}
		else {
			paramsNode = objectNode.putObject(PSDELogicNodeParamImpl.ATTR_GETPARAMS);
		}
		
		Map<String, Object> map = psDELNParam.any();
		if(!ObjectUtils.isEmpty(map)) {
			ObjectNode entityNode = JsonUtils.toObjectNode(map);
			java.util.Iterator<String> fields = entityNode.fieldNames();
			if(fields!=null) {
				while(fields.hasNext()) {
					String strFieldName = fields.next();
					if(paramsNode.has(strFieldName)) {
						continue;
					}
					if(SystemFieldMap.containsKey(strFieldName)) {
						continue;
					}
					paramsNode.set(strFieldName, entityNode.get(strFieldName));
				}
			}
		}
	}

}