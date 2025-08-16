package net.ibizsys.model.util.transpiler.extend.dataentity.action;

import java.util.Collection;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEActionLogicListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.action.PSDEActionLogicListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, Collection<? extends IPSModelObject> psModelList, Collection<? extends IPSModel> domainList, boolean bFullMode) throws Exception {
		
		super.onDecompile(iPSModelTranspileContext, psModelList, domainList, bFullMode);
	}
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
}