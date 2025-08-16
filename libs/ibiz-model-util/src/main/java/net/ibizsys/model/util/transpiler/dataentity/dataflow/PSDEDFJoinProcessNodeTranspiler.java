package net.ibizsys.model.util.transpiler.dataentity.dataflow;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataflow.PSDEDFJoinProcessNodeImpl.*;



public class PSDEDFJoinProcessNodeTranspiler extends net.ibizsys.model.util.transpiler.dataentity.dataflow.PSDEDataFlowProcessNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataflow.PSDEDFJoinProcessNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataflow.PSDEDFJoinProcessNodeImpl realPSModelObject = (net.ibizsys.model.dataentity.dataflow.PSDEDFJoinProcessNodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getJoinType(), realPSModelObject, "getJoinType");
		this.setDomainValue(iPSModelTranspileContext, domain, "param6", realPSModelObject.getPSDEDFJoinGroupCond(), realPSModelObject, "getPSDEDFJoinGroupCond");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETJOINTYPE, domain, "param1", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDFJOINGROUPCOND, domain, "param6", net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond.class, true);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}