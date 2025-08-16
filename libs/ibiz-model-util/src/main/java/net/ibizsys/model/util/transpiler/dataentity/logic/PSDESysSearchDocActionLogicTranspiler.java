package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDESysSearchDocActionLogicImpl.*;



public class PSDESysSearchDocActionLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDESysSearchDocActionLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDESysSearchDocActionLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDESysSearchDocActionLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssearchdocid", realPSModelObject.getPSSysSearchDoc(), realPSModelObject, "getPSSysSearchDoc");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssearchschemeid", realPSModelObject.getPSSysSearchScheme(), realPSModelObject, "getPSSysSearchScheme");
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getSearchDocAction(), realPSModelObject, "getSearchDocAction");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSEARCHDOC, domain, "pssyssearchdocid", net.ibizsys.model.search.IPSSysSearchDoc.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSEARCHSCHEME, domain, "pssyssearchschemeid", net.ibizsys.model.search.IPSSysSearchScheme.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEARCHDOCACTION, domain, "param1", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}