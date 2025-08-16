package net.ibizsys.model.util.transpiler.control.grid;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.grid.PSDEGridEditItemVRImpl.*;



public class PSDEGridEditItemVRTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.grid.PSDEGridEditItemVRImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.grid.PSDEGridEditItemVRImpl realPSModelObject = (net.ibizsys.model.control.grid.PSDEGridEditItemVRImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "checkmode", realPSModelObject.getCheckMode(), realPSModelObject, "getCheckMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefvrid", realPSModelObject.getPSDEFValueRule(), realPSModelObject, "getPSDEFValueRule");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysvalueruleid", realPSModelObject.getPSSysValueRule(), realPSModelObject, "getPSSysValueRule");
		this.setDomainValue(iPSModelTranspileContext, domain, "vrtype", realPSModelObject.getValueRuleType(), realPSModelObject, "getValueRuleType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCHECKMODE, domain, "checkmode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFVALUERULE, domain, "psdefvrid", net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSVALUERULE, domain, "pssysvalueruleid", net.ibizsys.model.valuerule.IPSSysValueRule.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUERULETYPE, domain, "vrtype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}