package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEUICtrlInvokeLogicImpl.*;



public class PSDEUICtrlInvokeLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDEUILogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEUICtrlInvokeLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEUICtrlInvokeLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEUICtrlInvokeLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdlparamid", realPSModelObject.getInvokeCtrl(), realPSModelObject, "getInvokeCtrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "param2", realPSModelObject.getInvokeMethod(), realPSModelObject, "getInvokeMethod");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getInvokeParam(), realPSModelObject, "getInvokeParam");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINVOKECTRL, domain, "srcpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINVOKEMETHOD, domain, "param2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINVOKEPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}