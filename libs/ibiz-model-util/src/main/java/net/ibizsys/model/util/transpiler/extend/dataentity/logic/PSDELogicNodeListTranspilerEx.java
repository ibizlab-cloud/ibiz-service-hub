package net.ibizsys.model.util.transpiler.extend.dataentity.logic;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDELNParam;
import net.ibizsys.psmodel.core.domain.PSDELogicNode;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDELogicNodeListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeListTranspiler{
	
	private static Map<String, String> SystemFieldMap = new HashMap<String, String>();
	static {
		SystemFieldMap.put("codename","");
		SystemFieldMap.put("createdate","");
		SystemFieldMap.put("createman","");
		SystemFieldMap.put("customdstparam","");
		SystemFieldMap.put("customsrcparam","");
		SystemFieldMap.put("debugmode","");
		SystemFieldMap.put("dstpsdeutildeid","");
		SystemFieldMap.put("dstpsdeutildename","");
		SystemFieldMap.put("dstindex","");
		SystemFieldMap.put("dstparamaction","");
		SystemFieldMap.put("dstpsdeactionid","");
		SystemFieldMap.put("dstpsdeactionname","");
		SystemFieldMap.put("dstpsdedataexpid","");
		SystemFieldMap.put("dstpsdedataexpname","");
		SystemFieldMap.put("dstpsdedataflowid","");
		SystemFieldMap.put("dstpsdedataflowname","");
		SystemFieldMap.put("dstpsdedataimpid","");
		SystemFieldMap.put("dstpsdedataimpname","");
		SystemFieldMap.put("dstpsdedataqueryid","");
		SystemFieldMap.put("dstpsdedataqueryname","");
		SystemFieldMap.put("dstpsdedatasetid","");
		SystemFieldMap.put("dstpsdedatasetname","");
		SystemFieldMap.put("dstpsdedatasyncid","");
		SystemFieldMap.put("dstpsdedatasyncname","");
		SystemFieldMap.put("dstpsdedtsqueueid","");
		SystemFieldMap.put("dstpsdedtsqueuename","");
		SystemFieldMap.put("dstpsdefgroupid","");
		SystemFieldMap.put("dstpsdefgroupname","");
		SystemFieldMap.put("dstpsdeformid","");
		SystemFieldMap.put("dstpsdeformname","");
		SystemFieldMap.put("dstpsdefvalueruleid","");
		SystemFieldMap.put("dstpsdefvaluerulename","");
		SystemFieldMap.put("dstpsdeid","");
		SystemFieldMap.put("dstpsdelogicid","");
		SystemFieldMap.put("dstpsdelogicname","");
		SystemFieldMap.put("dstpsdemapid","");
		SystemFieldMap.put("dstpsdemapname","");
		SystemFieldMap.put("dstpsdename","");
		SystemFieldMap.put("dstpsdenotifyid","");
		SystemFieldMap.put("dstpsdenotifyname","");
		SystemFieldMap.put("dstpsdeprintid","");
		SystemFieldMap.put("dstpsdeprintname","");
		SystemFieldMap.put("dstpsdereportid","");
		SystemFieldMap.put("dstpsdereportname","");
		SystemFieldMap.put("dstpsdesampledataid","");
		SystemFieldMap.put("dstpsdesampledataname","");
		SystemFieldMap.put("dstpsdeuagroupid","");
		SystemFieldMap.put("dstpsdeuagroupname","");
		SystemFieldMap.put("dstpsdeuilogicid","");
		SystemFieldMap.put("dstpsdeuilogicname","");
		SystemFieldMap.put("dstpsdeviewid","");
		SystemFieldMap.put("dstpsdeviewname","");
		SystemFieldMap.put("dstpsdevrgroupid","");
		SystemFieldMap.put("dstpsdevrgroupname","");
		SystemFieldMap.put("dstpsdewizardid","");
		SystemFieldMap.put("dstpsdewizardname","");
		SystemFieldMap.put("dstpsdlparamid","");
		SystemFieldMap.put("dstpsdlparamname","");
		SystemFieldMap.put("dstsortdir","");
		SystemFieldMap.put("dynamodelflag","");
		SystemFieldMap.put("ispsdlparamid","");
		SystemFieldMap.put("ispsdlparamname","");
		SystemFieldMap.put("leftpos","");
		SystemFieldMap.put("logicnodesubtype","");
		SystemFieldMap.put("logicnodetype","");
		SystemFieldMap.put("memo","");
		SystemFieldMap.put("msgpslanresid","");
		SystemFieldMap.put("msgpslanresname","");
		SystemFieldMap.put("nodeparams","");
		SystemFieldMap.put("optpsdlparamid","");
		SystemFieldMap.put("optpsdlparamname","");
		SystemFieldMap.put("ordervalue","");
		SystemFieldMap.put("ospsdlparamid","");
		SystemFieldMap.put("ospsdlparamname","");
		SystemFieldMap.put("paralleloutput","");
		SystemFieldMap.put("param1","");
		SystemFieldMap.put("param10","");
		SystemFieldMap.put("param11","");
		SystemFieldMap.put("param12","");
		SystemFieldMap.put("param13","");
		SystemFieldMap.put("param14","");
		SystemFieldMap.put("param2","");
		SystemFieldMap.put("param3","");
		SystemFieldMap.put("param4","");
		SystemFieldMap.put("param5","");
		SystemFieldMap.put("param6","");
		SystemFieldMap.put("param7","");
		SystemFieldMap.put("param8","");
		SystemFieldMap.put("param9","");
		SystemFieldMap.put("psdeid","");
		SystemFieldMap.put("psdelogicid","");
		SystemFieldMap.put("psdelogicname","");
		SystemFieldMap.put("psdelogicnodeid","");
		SystemFieldMap.put("psdelogicnodename","");
		SystemFieldMap.put("psdemainstateid","");
		SystemFieldMap.put("psdemainstatename","");
		SystemFieldMap.put("psdeuiactionid","");
		SystemFieldMap.put("psdeuiactionname","");
		SystemFieldMap.put("psdynainstid","");
		SystemFieldMap.put("pssubsyssadetailid","");
		SystemFieldMap.put("pssubsyssadetailname","");
		SystemFieldMap.put("pssubsysserviceapiid","");
		SystemFieldMap.put("pssubsysserviceapiname","");
		SystemFieldMap.put("pssysbackserviceid","");
		SystemFieldMap.put("pssysbackservicename","");
		SystemFieldMap.put("pssysbdschemeid","");
		SystemFieldMap.put("pssysbdschemename","");
		SystemFieldMap.put("pssysbdtableid","");
		SystemFieldMap.put("pssysbdtablename","");
		SystemFieldMap.put("pssysbireportid","");
		SystemFieldMap.put("pssysbireportname","");
		SystemFieldMap.put("pssysbischemeid","");
		SystemFieldMap.put("pssysbischemename","");
		SystemFieldMap.put("pssysdatasyncagentid","");
		SystemFieldMap.put("pssysdatasyncagentname","");
		SystemFieldMap.put("pssysdbschemeid","");
		SystemFieldMap.put("pssysdbschemename","");
		SystemFieldMap.put("pssysdbtableid","");
		SystemFieldMap.put("pssysdbtablename","");
		SystemFieldMap.put("pssysdelogicnodeid","");
		SystemFieldMap.put("pssysdelogicnodename","");
		SystemFieldMap.put("pssyseaielementid","");
		SystemFieldMap.put("pssyseaielementname","");
		SystemFieldMap.put("pssyseaischemeid","");
		SystemFieldMap.put("pssyseaischemename","");
		SystemFieldMap.put("pssysmsgtemplid","");
		SystemFieldMap.put("pssysmsgtemplname","");
		SystemFieldMap.put("pssyspfpluginid","");
		SystemFieldMap.put("pssyspfpluginname","");
		SystemFieldMap.put("pssysresourceid","");
		SystemFieldMap.put("pssysresourcename","");
		SystemFieldMap.put("pssyssearchdocid","");
		SystemFieldMap.put("pssyssearchdocname","");
		SystemFieldMap.put("pssyssearchschemeid","");
		SystemFieldMap.put("pssyssearchschemename","");
		SystemFieldMap.put("pssyssfpluginid","");
		SystemFieldMap.put("pssyssfpluginname","");
		SystemFieldMap.put("pssyssqlcmdid","");
		SystemFieldMap.put("pssyssqlcmdname","");
		SystemFieldMap.put("pssystemid","");
		SystemFieldMap.put("pssysunistateid","");
		SystemFieldMap.put("pssysunistatename","");
		SystemFieldMap.put("pssysutildeid","");
		SystemFieldMap.put("pssysutildename","");
		SystemFieldMap.put("psviewmsgid","");
		SystemFieldMap.put("psviewmsgname","");
		SystemFieldMap.put("pswfdeid","");
		SystemFieldMap.put("pswfdename","");
		SystemFieldMap.put("psworkflowid","");
		SystemFieldMap.put("psworkflowname","");
		SystemFieldMap.put("retpsdlparamid","");
		SystemFieldMap.put("retpsdlparamname","");
		SystemFieldMap.put("shapeparams","");
		SystemFieldMap.put("srcindex","");
		SystemFieldMap.put("srcpsdlparamid","");
		SystemFieldMap.put("srcpsdlparamname","");
		SystemFieldMap.put("srcsize","");
		SystemFieldMap.put("threadrunmode","");
		SystemFieldMap.put("threadruntimer","");
		SystemFieldMap.put("toppos","");
		SystemFieldMap.put("tsmode","");
		SystemFieldMap.put("updatedate","");
		SystemFieldMap.put("updateman","");
		SystemFieldMap.put("usercat","");
		SystemFieldMap.put("userparams","");
		SystemFieldMap.put("usertag","");
		SystemFieldMap.put("usertag2","");
		SystemFieldMap.put("usertag3","");
		SystemFieldMap.put("usertag4","");
	}
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSDELogicNode iPSDELogicNode = (IPSDELogicNode)iPSModelObject;
			PSDELogicNode psDELogicNode = (PSDELogicNode)domain;
			
			if(iPSDELogicNode.getPSDELogicNodeParams()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicNodeParam.class, false).decompile(iPSModelTranspileContext, iPSDELogicNode.getPSDELogicNodeParams(), psDELogicNode.getPSDELNParamsIf(), bFullMode);
				int nOrder = 100;
				for(PSDELNParam child : psDELogicNode.getPSDELNParamsIf()) {
					child.setPSDELogicNodeId(psDELogicNode.getId());
					child.setPSDELogicNodeName(psDELogicNode.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDELogicNode psDELogicNode = (PSDELogicNode)domain;
		if(!ObjectUtils.isEmpty(psDELogicNode.getPSDELNParams())) {
			ArrayNode arrayNode = objectNode.putArray(PSDELogicNodeImpl.ATTR_GETPSDELOGICNODEPARAMS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicNodeParam.class, false).compile(iPSModelTranspileContext, psDELogicNode.getPSDELNParams(), arrayNode);
		}
		
		//将数据对象中的值额外放入动态参数中
		ObjectNode paramsNode = null;
		if(objectNode.has(PSDELogicNodeImpl.ATTR_GETNODEPARAMS)) {
			paramsNode = (ObjectNode)objectNode.get(PSDELogicNodeImpl.ATTR_GETNODEPARAMS);
		}
		else {
			paramsNode = objectNode.putObject(PSDELogicNodeImpl.ATTR_GETNODEPARAMS);
		}
		
		Map<String, Object> map = psDELogicNode.any();
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
		
		//objectNode.
	}
}