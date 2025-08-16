package net.ibizsys.model.util.transpiler.dataentity.mainstate;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.mainstate.PSDEMainStateOPPrivImpl.*;



public class PSDEMainStateOPPrivTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.mainstate.PSDEMainStateOPPrivImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.mainstate.PSDEMainStateOPPrivImpl realPSModelObject = (net.ibizsys.model.dataentity.mainstate.PSDEMainStateOPPrivImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeopprivid", realPSModelObject.getPSDEOPPriv(), realPSModelObject, "getPSDEOPPriv");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEOPPRIV, domain, "psdeopprivid", net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, true);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}