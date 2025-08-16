package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEUICtrlFireEventLogicImpl.*;



public class PSDEUICtrlFireEventLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDEUILogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEUICtrlFireEventLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEUICtrlFireEventLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEUICtrlFireEventLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param2", realPSModelObject.getEventName(), realPSModelObject, "getEventName");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getEventParam(), realPSModelObject, "getEventParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdlparamid", realPSModelObject.getFireCtrl(), realPSModelObject, "getFireCtrl");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTNAME, domain, "param2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIRECTRL, domain, "srcpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}