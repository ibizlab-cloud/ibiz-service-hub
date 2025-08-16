package net.ibizsys.model.util.transpiler.dataentity.ba;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.ba.PSDEBDTableImpl.*;



public class PSDEBDTableTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.ba.PSDEBDTableImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.ba.PSDEBDTableImpl realPSModelObject = (net.ibizsys.model.dataentity.ba.PSDEBDTableImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflag", realPSModelObject.getBDTableDEType(), realPSModelObject, "getBDTableDEType");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbdschemeid", realPSModelObject.getPSSysBDScheme(), realPSModelObject, "getPSSysBDScheme");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbdtableid", realPSModelObject.getPSSysBDTable(), realPSModelObject, "getPSSysBDTable");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBDTABLEDETYPE, domain, "defaultflag", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBDSCHEME, domain, "pssysbdschemeid", net.ibizsys.model.ba.IPSSysBDScheme.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBDTABLE, domain, "pssysbdtableid", net.ibizsys.model.ba.IPSSysBDTable.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}