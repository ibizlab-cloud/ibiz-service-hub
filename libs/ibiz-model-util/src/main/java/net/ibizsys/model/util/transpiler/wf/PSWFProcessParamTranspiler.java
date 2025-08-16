package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFProcessParamImpl.*;



public class PSWFProcessParamTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFProcessParamImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFProcessParamImpl realPSModelObject = (net.ibizsys.model.wf.PSWFProcessParamImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "customdstdefname", realPSModelObject.getDstField(), realPSModelObject, "getDstField");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcvalue", realPSModelObject.getSrcValue(), realPSModelObject, "getSrcValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcvaluetype", realPSModelObject.getSrcValueType(), realPSModelObject, "getSrcValueType");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata", realPSModelObject.getUserData(), realPSModelObject, "getUserData");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata2", realPSModelObject.getUserData2(), realPSModelObject, "getUserData2");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTFIELD, domain, "customdstdefname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCVALUE, domain, "srcvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCVALUETYPE, domain, "srcvaluetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA, domain, "userdata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA2, domain, "userdata2", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}