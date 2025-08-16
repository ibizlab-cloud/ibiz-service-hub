package net.ibizsys.model.util.transpiler.dataentity.jit;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.jit.PSDESampleDataImpl.*;



public class PSDESampleDataTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.jit.PSDESampleDataImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.jit.PSDESampleDataImpl realPSModelObject = (net.ibizsys.model.dataentity.jit.PSDESampleDataImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "data", realPSModelObject.getData(), realPSModelObject, "getData");
		this.setDomainValue(iPSModelTranspileContext, domain, "data", realPSModelObject.getDataJO(), realPSModelObject, "getDataJO");
		this.setDomainValue(iPSModelTranspileContext, domain, "datatype", realPSModelObject.getDataType(), realPSModelObject, "getDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicmode", realPSModelObject.getLogicMode(), realPSModelObject, "getLogicMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "randomcnt", realPSModelObject.getRandomCount(), realPSModelObject, "getRandomCount");
		this.setDomainValue(iPSModelTranspileContext, domain, "randommode", realPSModelObject.getRandomMode(), realPSModelObject, "getRandomMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "randomparam", realPSModelObject.getRandomParam(), realPSModelObject, "getRandomParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "randomparam2", realPSModelObject.getRandomParam2(), realPSModelObject, "getRandomParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "randomparam3", realPSModelObject.getRandomParam3(), realPSModelObject, "getRandomParam3");
		this.setDomainValue(iPSModelTranspileContext, domain, "randomparam4", realPSModelObject.getRandomParam4(), realPSModelObject, "getRandomParam4");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATA, domain, "data", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAJO, domain, "data", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATATYPE, domain, "datatype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICMODE, domain, "logicmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRANDOMCOUNT, domain, "randomcnt", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRANDOMMODE, domain, "randommode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRANDOMPARAM, domain, "randomparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRANDOMPARAM2, domain, "randomparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRANDOMPARAM3, domain, "randomparam3", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRANDOMPARAM4, domain, "randomparam4", int.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}