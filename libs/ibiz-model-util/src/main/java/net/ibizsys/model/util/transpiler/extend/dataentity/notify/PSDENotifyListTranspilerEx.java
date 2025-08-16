package net.ibizsys.model.util.transpiler.extend.dataentity.notify;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.dataentity.notify.IPSDENotifyTarget;
import net.ibizsys.model.dataentity.notify.PSDENotifyImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDENotify;
import net.ibizsys.psmodel.core.domain.PSDENotifyTarget;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDENotifyListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.notify.PSDENotifyListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		IPSDENotify iPSDENotify = (IPSDENotify)iPSModelObject;
		PSDENotify psDENotify = (PSDENotify)domain;
		
		
		
		if(bFullMode) {
			
			if(iPSDENotify.getPSDENotifyTargets()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDENotifyTarget.class, false).decompile(iPSModelTranspileContext, iPSDENotify.getPSDENotifyTargets(), psDENotify.getPSDENotifyTargetsIf(), bFullMode);
				for(PSDENotifyTarget child : psDENotify.getPSDENotifyTargetsIf()) {
					child.setPSDENotifyId(psDENotify.getId());
					child.setPSDENotifyName(psDENotify.getName());
//					child.setOrderValue(nOrder);
//					nOrder += 100;
				}
			}
			
			
		}
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDENotify psDENotify = (PSDENotify)domain;
		
		if(!ObjectUtils.isEmpty(psDENotify.getPSDENotifyTargets())) {
			ArrayNode arrayNode = objectNode.putArray(PSDENotifyImpl.ATTR_GETPSDENOTIFYTARGETS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDENotifyTarget.class, false).compile(iPSModelTranspileContext, psDENotify.getPSDENotifyTargets(), arrayNode);
		}
	}
	
	
	
	@Override
	protected String[] getModelFolders() {
		return getDataEntityModelFolder("PSDENOTIFIES");
	}
	
}