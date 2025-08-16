package net.ibizsys.model.util.transpiler.extend.dataentity.action;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionParam;
import net.ibizsys.model.dataentity.action.IPSDEActionVR;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEAction;
import net.ibizsys.psmodel.core.domain.PSDEActionParam;
import net.ibizsys.psmodel.core.domain.PSDEActionVR;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEActionListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.action.PSDEActionListTranspiler{
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSDEAction iPSDEAction = (IPSDEAction)iPSModelObject;
			PSDEAction psDEAction = (PSDEAction)domain;
			
			if(iPSDEAction.getPSDEActionParams()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEActionParam.class, false).decompile(iPSModelTranspileContext, iPSDEAction.getPSDEActionParams(), psDEAction.getPSDEActionParamsIf(), bFullMode);
				int nOrder = 100;
				for(PSDEActionParam child : psDEAction.getPSDEActionParamsIf()) {
					child.setPSDEActionId(child.getId());
					child.setPSDEActionName(child.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
			if(iPSDEAction.getPSDEActionVRs()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEActionVR.class, false).decompile(iPSModelTranspileContext, iPSDEAction.getPSDEActionVRs(), psDEAction.getPSDEActionVRsIf(), bFullMode);
				int nOrder = 100;
				for(PSDEActionVR child : psDEAction.getPSDEActionVRsIf()) {
					child.setPSDEActionId(child.getId());
					child.setPSDEActionName(child.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
	
	
	@Override
	protected String[] getModelFolders() {
		return getDataEntityModelFolder("PSDEACTIONS");
	}
}