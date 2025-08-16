package net.ibizsys.model.util.transpiler.dataentity.dataflow;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataflow.PSDEDFPrepareProcessNodeImpl.*;



public class PSDEDFPrepareProcessNodeTranspiler extends net.ibizsys.model.util.transpiler.dataentity.dataflow.PSDEDataFlowProcessNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataflow.PSDEDFPrepareProcessNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataflow.PSDEDFPrepareProcessNodeImpl realPSModelObject = (net.ibizsys.model.dataentity.dataflow.PSDEDFPrepareProcessNodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param9", realPSModelObject.isReselectColumn(), realPSModelObject, "isReselectColumn");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISRESELECTCOLUMN, domain, "param9", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}