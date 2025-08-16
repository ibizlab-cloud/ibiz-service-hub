package net.ibizsys.model.util.transpiler.dataentity.action;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.action.PSDERemoteActionImpl.*;



public class PSDERemoteActionTranspiler extends net.ibizsys.model.util.transpiler.dataentity.action.PSDEActionTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.action.PSDERemoteActionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.action.PSDERemoteActionImpl realPSModelObject = (net.ibizsys.model.dataentity.action.PSDERemoteActionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pssubsyssadetailid", realPSModelObject.getPSSubSysServiceAPIDEMethod(), realPSModelObject, "getPSSubSysServiceAPIDEMethod");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD, domain, "pssubsyssadetailid", net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}