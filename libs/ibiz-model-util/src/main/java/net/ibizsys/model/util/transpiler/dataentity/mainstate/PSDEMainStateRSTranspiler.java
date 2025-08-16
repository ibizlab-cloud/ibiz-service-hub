package net.ibizsys.model.util.transpiler.dataentity.mainstate;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.mainstate.PSDEMainStateRSImpl.*;



public class PSDEMainStateRSTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.mainstate.PSDEMainStateRSImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.mainstate.PSDEMainStateRSImpl realPSModelObject = (net.ibizsys.model.dataentity.mainstate.PSDEMainStateRSImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "nextpsdemsid", realPSModelObject.getNextPSDEMainState(), realPSModelObject, "getNextPSDEMainState");
		this.setDomainValue(iPSModelTranspileContext, domain, "prevpsdemsid", realPSModelObject.getPrevPSDEMainState(), realPSModelObject, "getPrevPSDEMainState");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNEXTPSDEMAINSTATE, domain, "nextpsdemsid", net.ibizsys.model.dataentity.mainstate.IPSDEMainState.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREVPSDEMAINSTATE, domain, "prevpsdemsid", net.ibizsys.model.dataentity.mainstate.IPSDEMainState.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}