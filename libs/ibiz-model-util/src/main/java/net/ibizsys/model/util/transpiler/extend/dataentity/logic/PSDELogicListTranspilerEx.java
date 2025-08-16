package net.ibizsys.model.util.transpiler.extend.dataentity.logic;

import java.util.ArrayList;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DELogicHolder;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.dataentity.logic.PSDELogicImpl;
import net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDELogic;
import net.ibizsys.psmodel.core.domain.PSDELogicLink;
import net.ibizsys.psmodel.core.domain.PSDELogicNode;
import net.ibizsys.psmodel.core.domain.PSDELogicParam;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.PSModelEnums.LogicNodeType;

public class PSDELogicListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		IPSDELogic iPSDELogic = (IPSDELogic)iPSModelObject;
		PSDELogic psDELogic = (PSDELogic)domain;
		
		int logicHolder = 0;
		if(iPSDELogic.isEnableFront()) {
			logicHolder |= DELogicHolder.FRONT.value;
		}
		if(iPSDELogic.isEnableBackend()) {
			logicHolder |= DELogicHolder.BACKEND.value;
		}
		psDELogic.setLogicHolder(logicHolder);
		
		
		if(bFullMode) {
			
			if(iPSDELogic.getPSDELogicParams()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicParam.class, false).decompile(iPSModelTranspileContext, iPSDELogic.getPSDELogicParams(), psDELogic.getPSDELogicParamsIf(), bFullMode);
				for(PSDELogicParam child : psDELogic.getPSDELogicParamsIf()) {
					child.setPSDELogicId(psDELogic.getId());
					child.setPSDELogicName(psDELogic.getName());
//					child.setOrderValue(nOrder);
//					nOrder += 100;
				}
			}
			
			if(iPSDELogic.getPSDELogicNodes()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicNode.class, false).decompile(iPSModelTranspileContext, iPSDELogic.getPSDELogicNodes(), psDELogic.getPSDELogicNodesIf(), bFullMode);
				for(PSDELogicNode child : psDELogic.getPSDELogicNodesIf()) {
					child.setPSDELogicId(psDELogic.getId());
					child.setPSDELogicName(psDELogic.getName());
				}
				
				for(IPSDELogicNode iPSDELogicNode : iPSDELogic.getPSDELogicNodes()) {
					if(iPSDELogicNode.getPSDELogicLinks()!=null) {
						iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicLink.class, false).decompile(iPSModelTranspileContext, iPSDELogicNode.getPSDELogicLinks(), psDELogic.getPSDELogicLinksIf(), bFullMode);
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
		int logicHolder = DataTypeUtils.getIntegerValue(psDELogic.getLogicHolder(), 0);
		if((logicHolder & DELogicHolder.FRONT.value) == DELogicHolder.FRONT.value) {
			objectNode.put(PSDELogicImpl.ATTR_ISENABLEFRONT, true);
		}
		else {
			objectNode.put(PSDELogicImpl.ATTR_ISENABLEFRONT, false);
		}
		
		if((logicHolder & DELogicHolder.BACKEND.value) == DELogicHolder.BACKEND.value) {
			objectNode.put(PSDELogicImpl.ATTR_ISENABLEBACKEND, true);
		}
		else {
			objectNode.put(PSDELogicImpl.ATTR_ISENABLEBACKEND, false);
		}
		
		if(!ObjectUtils.isEmpty(psDELogic.getPSDELogicParams())) {
			ArrayNode arrayNode = objectNode.putArray(PSDELogicImpl.ATTR_GETPSDELOGICPARAMS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicParam.class, false).compile(iPSModelTranspileContext, psDELogic.getPSDELogicParams(), arrayNode);
		}
		
		if(!ObjectUtils.isEmpty(psDELogic.getPSDELogicNodes())) {
			ArrayNode arrayNode = objectNode.putArray(PSDELogicImpl.ATTR_GETPSDELOGICNODES);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicNode.class, false).compile(iPSModelTranspileContext, psDELogic.getPSDELogicNodes(), arrayNode);
			
			for(int i = 0;i<psDELogic.getPSDELogicNodes().size();i++) {
				PSDELogicNode psDELogicNode = psDELogic.getPSDELogicNodes().get(i);
				
				if(LogicNodeType.BEGIN.value.equalsIgnoreCase(psDELogicNode.getLogicNodeType())) {
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicNode.class, false).getModelRef(iPSModelTranspileContext, psDELogicNode.getId(), false, objectNode.putObject(PSDELogicImpl.ATTR_GETSTARTPSDELOGICNODE));
				}
						
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
					ArrayNode arrayNode2 = node.putArray(PSDELogicNodeImpl.ATTR_GETPSDELOGICLINKS);
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicLink.class, false).compile(iPSModelTranspileContext, psDELogicLinkList, arrayNode2);
				}
			}
		}
	}
	
	
	
	@Override
	protected String[] getModelFolders() {
		return getDataEntityModelFolder("PSDELOGICS");
	}
}