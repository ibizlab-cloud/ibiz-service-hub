package net.ibizsys.model.util.transpiler.extend.dataentity.logic;

import java.util.ArrayList;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DELogicHolder;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode;
import net.ibizsys.model.dataentity.logic.PSDEMSLogicImpl;
import net.ibizsys.model.dataentity.logic.PSDEMSLogicNodeImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDELogic;
import net.ibizsys.psmodel.core.domain.PSDELogicLink;
import net.ibizsys.psmodel.core.domain.PSDELogicNode;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEMSLogicListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDEMSLogicListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		IPSDEMSLogic iPSDEMSLogic = (IPSDEMSLogic)iPSModelObject;
		PSDELogic psDELogic = (PSDELogic)domain;
		
		
		psDELogic.setLogicHolder(DELogicHolder.BACKEND.value);
		
		
		if(bFullMode) {
		
			if(iPSDEMSLogic.getPSDEMSLogicNodes()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEMSLogicNode.class, false).decompile(iPSModelTranspileContext, iPSDEMSLogic.getPSDEMSLogicNodes(), psDELogic.getPSDELogicNodesIf(), bFullMode);
				for(PSDELogicNode child : psDELogic.getPSDELogicNodesIf()) {
					child.setPSDELogicId(psDELogic.getId());
					child.setPSDELogicName(psDELogic.getName());
				}
				
				for(IPSDEMSLogicNode iPSDEMSLogicNode : iPSDEMSLogic.getPSDEMSLogicNodes()) {
					if(iPSDEMSLogicNode.getPSDEMSLogicLinks()!=null) {
						iPSModelTranspileContext.getPSModelListTranspiler(IPSDEMSLogicLink.class, false).decompile(iPSModelTranspileContext, iPSDEMSLogicNode.getPSDEMSLogicLinks(), psDELogic.getPSDELogicLinksIf(), bFullMode);
						int nOrder = 100;
						for(PSDELogicLink child : psDELogic.getPSDELogicLinksIf()) {
							child.setPSDELogicId(psDELogic.getId());
							child.setPSDELogicName(psDELogic.getName());
							child.setOrderValue(nOrder);
							nOrder += 100;
						}
					}
				}
			}
		}
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDELogic psDELogic = (PSDELogic)domain;
//		int logicHolder = DataTypeUtils.getIntegerValue(psDELogic.getLogicHolder(), 0);
//		if((logicHolder & DELogicHolder.FRONT.value) == DELogicHolder.FRONT.value) {
//			objectNode.put(PSDEMSLogicImpl.ATTR_ISENABLEFRONT, true);
//		}
//		else {
//			objectNode.put(PSDEMSLogicImpl.ATTR_ISENABLEFRONT, false);
//		}
//		
//		if((logicHolder & DELogicHolder.BACKEND.value) == DELogicHolder.BACKEND.value) {
//			objectNode.put(PSDEMSLogicImpl.ATTR_ISENABLEBACKEND, true);
//		}
//		else {
//			objectNode.put(PSDEMSLogicImpl.ATTR_ISENABLEBACKEND, false);
//		}
		
		
		if(!ObjectUtils.isEmpty(psDELogic.getPSDELogicNodes())) {
			ArrayNode arrayNode = objectNode.putArray(PSDEMSLogicImpl.ATTR_GETPSDEMSLOGICNODES);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDEMSLogicNode.class, false).compile(iPSModelTranspileContext, psDELogic.getPSDELogicNodes(), arrayNode);
			
			for(int i = 0;i<psDELogic.getPSDELogicNodes().size();i++) {
				PSDELogicNode psDELogicNode = psDELogic.getPSDELogicNodes().get(i);
				ObjectNode node = (ObjectNode) arrayNode.get(i);
				java.util.List<PSDELogicLink> psDELogicLinkList = new ArrayList<PSDELogicLink>();
				if(!ObjectUtils.isEmpty(psDELogic.getPSDELogicLinks())) {
					for(PSDELogicLink psDELogicLink : psDELogic.getPSDELogicLinks()) {
						if(psDELogicNode.getId().equals(psDELogicLink.getSrcPSDELogicNodeId())) {
							psDELogicLinkList.add(psDELogicLink);
						}
					}
				}
				
				if(!ObjectUtils.isEmpty(psDELogicLinkList)) {
					ArrayNode arrayNode2 = node.putArray(PSDEMSLogicNodeImpl.ATTR_GETPSDEMSLOGICLINKS);
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEMSLogicLink.class, false).compile(iPSModelTranspileContext, psDELogicLinkList, arrayNode2);
				}
			}
		}
	}
	
	
	
	@Override
	protected String[] getModelFolders() {
		return getDataEntityModelFolder("PSDEMSLOGICS");
	}
}