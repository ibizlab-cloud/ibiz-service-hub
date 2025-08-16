package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDECancelWFLogicImpl.*;



public class PSDECancelWFLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDECancelWFLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDECancelWFLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDECancelWFLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "pswfdeid", realPSModelObject.getPSDEWF(), realPSModelObject, "getPSDEWF");
		this.setDomainValue(iPSModelTranspileContext, domain, "psworkflowid", realPSModelObject.getPSWorkflow(), realPSModelObject, "getPSWorkflow");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEWF, domain, "pswfdeid", net.ibizsys.model.dataentity.wf.IPSDEWF.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSWORKFLOW, domain, "psworkflowid", net.ibizsys.model.wf.IPSWorkflow.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}