package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSSysPanelLogic2Impl.*;



public class PSSysPanelLogic2Transpiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSSysPanelLogic2Impl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSSysPanelLogic2Impl realPSModelObject = (net.ibizsys.model.control.panel.PSSysPanelLogic2Impl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "attrname", realPSModelObject.getAttrName(), realPSModelObject, "getAttrName");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrleventarg", realPSModelObject.getEventArg(), realPSModelObject, "getEventArg");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrleventarg2", realPSModelObject.getEventArg2(), realPSModelObject, "getEventArg2");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlevent", realPSModelObject.getEventNames(), realPSModelObject, "getEventNames");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicparam", realPSModelObject.getLogicTag(), realPSModelObject, "getLogicTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicparam2", realPSModelObject.getLogicTag2(), realPSModelObject, "getLogicTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstlogictype", realPSModelObject.getLogicType(), realPSModelObject, "getLogicType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicid", realPSModelObject.getPSAppDEUILogic(), realPSModelObject, "getPSAppDEUILogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysviewlogicid", realPSModelObject.getPSAppUILogic(), realPSModelObject, "getPSAppUILogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysviewpanelitemname", realPSModelObject.getPSSysPanelItemName(), realPSModelObject, "getPSSysPanelItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "logictype", realPSModelObject.getTriggerType(), realPSModelObject, "getTriggerType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETATTRNAME, domain, "attrname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTARG, domain, "ctrleventarg", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTARG2, domain, "ctrleventarg2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTNAMES, domain, "ctrlevent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG, domain, "logicparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG2, domain, "logicparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTYPE, domain, "dstlogictype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEUILOGIC, domain, "psdelogicid", net.ibizsys.model.app.dataentity.IPSAppDEUILogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPUILOGIC, domain, "pssysviewlogicid", net.ibizsys.model.app.logic.IPSAppUILogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSPANELITEMNAME, domain, "pssysviewpanelitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTRIGGERTYPE, domain, "logictype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}