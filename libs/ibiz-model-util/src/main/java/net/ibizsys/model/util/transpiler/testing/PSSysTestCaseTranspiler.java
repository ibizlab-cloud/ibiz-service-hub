package net.ibizsys.model.util.transpiler.testing;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.testing.PSSysTestCaseImpl.*;



public class PSSysTestCaseTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.testing.PSSysTestCaseImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.testing.PSSysTestCaseImpl realPSModelObject = (net.ibizsys.model.testing.PSSysTestCaseImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "exceptiondata", realPSModelObject.getAssertExceptionData(), realPSModelObject, "getAssertExceptionData");
		this.setDomainValue(iPSModelTranspileContext, domain, "exceptiondata2", realPSModelObject.getAssertExceptionData2(), realPSModelObject, "getAssertExceptionData2");
		this.setDomainValue(iPSModelTranspileContext, domain, "exceptionname", realPSModelObject.getAssertExceptionName(), realPSModelObject, "getAssertExceptionName");
		this.setDomainValue(iPSModelTranspileContext, domain, "asserttype", realPSModelObject.getAssertType(), realPSModelObject, "getAssertType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeactionid", realPSModelObject.getPSDEAction(), realPSModelObject, "getPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSDEField(), realPSModelObject, "getPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssystestdataid", realPSModelObject.getPSSysTestData(), realPSModelObject, "getPSSysTestData");
		this.setDomainValue(iPSModelTranspileContext, domain, "testcasesn", realPSModelObject.getTestCaseSN(), realPSModelObject, "getTestCaseSN");
		this.setDomainValue(iPSModelTranspileContext, domain, "targettype", realPSModelObject.getTestCaseType(), realPSModelObject, "getTestCaseType");
		this.setDomainValue(iPSModelTranspileContext, domain, "rollbacktran", realPSModelObject.isRollbackTransaction(), realPSModelObject, "isRollbackTransaction");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETASSERTEXCEPTIONDATA, domain, "exceptiondata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETASSERTEXCEPTIONDATA2, domain, "exceptiondata2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETASSERTEXCEPTIONNAME, domain, "exceptionname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETASSERTTYPE, domain, "asserttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEACTION, domain, "psdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFIELD, domain, "psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTESTDATA, domain, "pssystestdataid", net.ibizsys.model.testing.IPSSysTestData.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTCASESN, domain, "testcasesn", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTCASETYPE, domain, "targettype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISROLLBACKTRANSACTION, domain, "rollbacktran", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}