package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDESysBDTableActionLogicImpl.*;



public class PSDESysBDTableActionLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDESysBDTableActionLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDESysBDTableActionLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDESysBDTableActionLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getBDTableAction(), realPSModelObject, "getBDTableAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbdschemeid", realPSModelObject.getPSSysBDScheme(), realPSModelObject, "getPSSysBDScheme");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbdtableid", realPSModelObject.getPSSysBDTable(), realPSModelObject, "getPSSysBDTable");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBDTABLEACTION, domain, "param1", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBDSCHEME, domain, "pssysbdschemeid", net.ibizsys.model.ba.IPSSysBDScheme.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBDTABLE, domain, "pssysbdtableid", net.ibizsys.model.ba.IPSSysBDTable.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}