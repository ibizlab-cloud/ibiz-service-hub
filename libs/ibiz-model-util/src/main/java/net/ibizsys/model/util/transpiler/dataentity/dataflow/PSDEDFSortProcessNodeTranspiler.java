package net.ibizsys.model.util.transpiler.dataentity.dataflow;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataflow.PSDEDFSortProcessNodeImpl.*;



public class PSDEDFSortProcessNodeTranspiler extends net.ibizsys.model.util.transpiler.dataentity.dataflow.PSDEDataFlowProcessNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataflow.PSDEDFSortProcessNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataflow.PSDEDFSortProcessNodeImpl realPSModelObject = (net.ibizsys.model.dataentity.dataflow.PSDEDFSortProcessNodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param8", realPSModelObject.getLimit(), realPSModelObject, "getLimit");
		this.setDomainValue(iPSModelTranspileContext, domain, "param7", realPSModelObject.getSkip(), realPSModelObject, "getSkip");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLIMIT, domain, "param8", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSKIP, domain, "param7", int.class, new String[]{"-1"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}