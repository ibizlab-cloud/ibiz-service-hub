package net.ibizsys.model.util.transpiler.dataentity.defield.valuerule;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRange2ConditionImpl.*;



public class PSDEFVRValueRange2ConditionTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.valuerule.PSDEFVRSingleConditionTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRange2ConditionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRange2ConditionImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRange2ConditionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param8", realPSModelObject.getMaxValue(), realPSModelObject, "getMaxValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "param7", realPSModelObject.getMinValue(), realPSModelObject, "getMinValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "param6", realPSModelObject.isIncludeMaxValue(), realPSModelObject, "isIncludeMaxValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "param5", realPSModelObject.isIncludeMinValue(), realPSModelObject, "isIncludeMinValue");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXVALUE, domain, "param8", java.lang.Double.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINVALUE, domain, "param7", java.lang.Double.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISINCLUDEMAXVALUE, domain, "param6", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISINCLUDEMINVALUE, domain, "param5", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}