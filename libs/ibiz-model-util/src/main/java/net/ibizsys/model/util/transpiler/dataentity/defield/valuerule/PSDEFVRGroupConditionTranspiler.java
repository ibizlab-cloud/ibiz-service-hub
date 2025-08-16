package net.ibizsys.model.util.transpiler.dataentity.defield.valuerule;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRGroupConditionImpl.*;



public class PSDEFVRGroupConditionTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.valuerule.PSDEFVRConditionTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRGroupConditionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRGroupConditionImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRGroupConditionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "groupop", realPSModelObject.getCondOp(), realPSModelObject, "getCondOp");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONDOP, domain, "groupop", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}