package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDESysDBTableActionLogicImpl.*;



public class PSDESysDBTableActionLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDESysDBTableActionLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDESysDBTableActionLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDESysDBTableActionLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getDBTableAction(), realPSModelObject, "getDBTableAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysdbschemeid", realPSModelObject.getPSSysDBScheme(), realPSModelObject, "getPSSysDBScheme");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysdbtableid", realPSModelObject.getPSSysDBTable(), realPSModelObject, "getPSSysDBTable");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDBTABLEACTION, domain, "param1", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSDBSCHEME, domain, "pssysdbschemeid", net.ibizsys.model.database.IPSSysDBScheme.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSDBTABLE, domain, "pssysdbtableid", net.ibizsys.model.database.IPSSysDBTable.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}