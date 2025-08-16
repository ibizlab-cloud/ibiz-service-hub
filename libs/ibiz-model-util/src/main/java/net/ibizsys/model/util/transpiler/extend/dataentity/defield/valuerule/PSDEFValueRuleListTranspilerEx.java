package net.ibizsys.model.util.transpiler.extend.dataentity.defield.valuerule;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEFVRCond;
import net.ibizsys.psmodel.core.domain.PSDEFValueRule;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEFValueRuleListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.defield.valuerule.PSDEFValueRuleListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		if(bFullMode) {
			PSDEFValueRule psDEFValueRule = (PSDEFValueRule)domain;
			IPSDEFValueRule iPSDEFValueRule = (IPSDEFValueRule)iPSModelObject;
			
			if(iPSDEFValueRule.getPSDEFVRGroupCondition()!=null 
					&& iPSDEFValueRule.getPSDEFVRGroupCondition().getPSDEFVRConditions()!=null) {
				
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFVRCondition.class, false).decompile(iPSModelTranspileContext, iPSDEFValueRule.getPSDEFVRGroupCondition().getPSDEFVRConditions(), psDEFValueRule.getPSDEFVRCondsIf(), bFullMode);
				int nOrder = 100;
				for(PSDEFVRCond child : psDEFValueRule.getPSDEFVRCondsIf()) {
					child.setPSDEFVRId(child.getId());
					child.setPSDEFVRName(child.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
	
	@Override
	protected void onGetModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode, ObjectNode objectNode) throws Exception {
		if(childMode) {
			String strPSDEFieldId = PSModelUtils.getParentId(fullId);
			if(StringUtils.hasLength(strPSDEFieldId)) {
				String strPSDEId = PSModelUtils.getParentId(strPSDEFieldId);
				
				IPSDEField iPSDEField = getPSModelObject(iPSModelTranspileContext, IPSDEField.class, 
		    			getPSModelObject(iPSModelTranspileContext, IPSDataEntity.class, iPSModelTranspileContext.getPSSystem().getAllPSDataEntities(), strPSDEId, false).getAllPSDEFields(),
		    			strPSDEFieldId, false);
				
				IPSDEFValueRule iPSDEFValueRule = getPSModelObject(iPSModelTranspileContext, IPSDEFValueRule.class ,iPSDEField.getAllPSDEFValueRules() ,fullId, false);
				ObjectNode objectNode2 = iPSDEFValueRule.getObjectNode().deepCopy();
				objectNode.setAll(objectNode2);
			}
			
			return;
		}
		super.onGetModelRef(iPSModelTranspileContext, fullId, childMode, objectNode);
	}
}