package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFLinkSingleCondImpl.*;



public class PSWFLinkSingleCondTranspiler extends net.ibizsys.model.util.transpiler.wf.PSWFLinkCondTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFLinkSingleCondImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFLinkSingleCondImpl realPSModelObject = (net.ibizsys.model.wf.PSWFLinkSingleCondImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdbvalueopid", realPSModelObject.getCondOP(), realPSModelObject, "getCondOP");
		this.setDomainValue(iPSModelTranspileContext, domain, "customdstparam", realPSModelObject.getFieldName(), realPSModelObject, "getFieldName");
		this.setDomainValue(iPSModelTranspileContext, domain, "paramtype", realPSModelObject.getParamType(), realPSModelObject, "getParamType");
		this.setDomainValue(iPSModelTranspileContext, domain, "condvalue", realPSModelObject.getParamValue(), realPSModelObject, "getParamValue");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONDOP, domain, "psdbvalueopid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDNAME, domain, "customdstparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMTYPE, domain, "paramtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMVALUE, domain, "condvalue", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}