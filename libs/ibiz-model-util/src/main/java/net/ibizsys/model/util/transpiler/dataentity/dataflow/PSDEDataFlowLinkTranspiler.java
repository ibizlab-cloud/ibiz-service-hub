package net.ibizsys.model.util.transpiler.dataentity.dataflow;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataflow.PSDEDataFlowLinkImpl.*;



public class PSDEDataFlowLinkTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataflow.PSDEDataFlowLinkImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataflow.PSDEDataFlowLinkImpl realPSModelObject = (net.ibizsys.model.dataentity.dataflow.PSDEDataFlowLinkImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdelogicnodeid", realPSModelObject.getDstPSDEDataFlowNode(), realPSModelObject, "getDstPSDEDataFlowNode");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.getLinkType(), realPSModelObject, "getLinkType");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdelogicnodeid", realPSModelObject.getSrcPSDEDataFlowNode(), realPSModelObject, "getSrcPSDEDataFlowNode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEDATAFLOWNODE, domain, "dstpsdelogicnodeid", net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLINKTYPE, domain, "defaultlink", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDEDATAFLOWNODE, domain, "srcpsdelogicnodeid", net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}