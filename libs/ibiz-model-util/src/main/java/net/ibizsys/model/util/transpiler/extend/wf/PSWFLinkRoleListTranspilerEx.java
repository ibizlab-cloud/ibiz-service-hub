package net.ibizsys.model.util.transpiler.extend.wf;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSWFLinkRoleListTranspilerEx extends net.ibizsys.model.util.transpiler.wf.PSWFLinkRoleListTranspiler{
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
	}
}