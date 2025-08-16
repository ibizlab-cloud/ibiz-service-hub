package net.ibizsys.model.util.transpiler.testing;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.testing.PSSysTestCaseInputImpl.*;



public class PSSysTestCaseInputTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.testing.PSSysTestCaseInputImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.testing.PSSysTestCaseInputImpl realPSModelObject = (net.ibizsys.model.testing.PSSysTestCaseInputImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeactionid", realPSModelObject.getInputPSDEAction(), realPSModelObject, "getInputPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputtag", realPSModelObject.getInputTag(), realPSModelObject, "getInputTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputtag2", realPSModelObject.getInputTag2(), realPSModelObject, "getInputTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputtag3", realPSModelObject.getInputTag3(), realPSModelObject, "getInputTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputtag4", realPSModelObject.getInputTag4(), realPSModelObject, "getInputTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputtype", realPSModelObject.getInputType(), realPSModelObject, "getInputType");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputvalues", realPSModelObject.getInputValue(), realPSModelObject, "getInputValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssystestdataid", realPSModelObject.getPSSysTestData(), realPSModelObject, "getPSSysTestData");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTPSDEACTION, domain, "psdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTTAG, domain, "inputtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTTAG2, domain, "inputtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTTAG3, domain, "inputtag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTTAG4, domain, "inputtag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTTYPE, domain, "inputtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTVALUE, domain, "inputvalues", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTESTDATA, domain, "pssystestdataid", net.ibizsys.model.testing.IPSSysTestData.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}