package net.ibizsys.model.util.transpiler.testing;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.testing.PSSysTestCaseAssertImpl.*;



public class PSSysTestCaseAssertTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.testing.PSSysTestCaseAssertImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.testing.PSSysTestCaseAssertImpl realPSModelObject = (net.ibizsys.model.testing.PSSysTestCaseAssertImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "asserttag", realPSModelObject.getAssertTag(), realPSModelObject, "getAssertTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "asserttag2", realPSModelObject.getAssertTag2(), realPSModelObject, "getAssertTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "asserttag3", realPSModelObject.getAssertTag3(), realPSModelObject, "getAssertTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "asserttag4", realPSModelObject.getAssertTag4(), realPSModelObject, "getAssertTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "asserttype", realPSModelObject.getAssertType(), realPSModelObject, "getAssertType");
		this.setDomainValue(iPSModelTranspileContext, domain, "assertresult", realPSModelObject.getAssertValue(), realPSModelObject, "getAssertValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "exceptionname", realPSModelObject.getExceptionName(), realPSModelObject, "getExceptionName");
		this.setDomainValue(iPSModelTranspileContext, domain, "exceptiondata", realPSModelObject.getExceptionTag(), realPSModelObject, "getExceptionTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "exceptiondata2", realPSModelObject.getExceptionTag2(), realPSModelObject, "getExceptionTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssystestdataid", realPSModelObject.getPSSysTestData(), realPSModelObject, "getPSSysTestData");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETASSERTTAG, domain, "asserttag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETASSERTTAG2, domain, "asserttag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETASSERTTAG3, domain, "asserttag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETASSERTTAG4, domain, "asserttag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETASSERTTYPE, domain, "asserttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETASSERTVALUE, domain, "assertresult", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXCEPTIONNAME, domain, "exceptionname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXCEPTIONTAG, domain, "exceptiondata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXCEPTIONTAG2, domain, "exceptiondata2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTESTDATA, domain, "pssystestdataid", net.ibizsys.model.testing.IPSSysTestData.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}