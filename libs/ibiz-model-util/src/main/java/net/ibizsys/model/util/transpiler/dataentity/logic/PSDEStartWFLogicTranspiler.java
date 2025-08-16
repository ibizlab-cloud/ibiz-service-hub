package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEStartWFLogicImpl.*;



public class PSDEStartWFLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEStartWFLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEStartWFLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEStartWFLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "optpsdlparamid", realPSModelObject.getOptPSDELogicParam(), realPSModelObject, "getOptPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "psworkflowid", realPSModelObject.getPSAppWF(), realPSModelObject, "getPSAppWF");
		this.setDomainValue(iPSModelTranspileContext, domain, "pswfdeid", realPSModelObject.getPSDEWF(), realPSModelObject, "getPSDEWF");
		this.setDomainValue(iPSModelTranspileContext, domain, "psworkflowid", realPSModelObject.getPSWorkflow(), realPSModelObject, "getPSWorkflow");
		this.setDomainValue(iPSModelTranspileContext, domain, "retpsdlparamid", realPSModelObject.getRetPSDELogicParam(), realPSModelObject, "getRetPSDELogicParam");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOPTPSDELOGICPARAM, domain, "optpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPWF, domain, "psworkflowid", net.ibizsys.model.app.wf.IPSAppWF.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEWF, domain, "pswfdeid", net.ibizsys.model.dataentity.wf.IPSDEWF.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSWORKFLOW, domain, "psworkflowid", net.ibizsys.model.wf.IPSWorkflow.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETPSDELOGICPARAM, domain, "retpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}