package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppViewLogicImplBase.*;



public class PSAppViewLogicTranspilerBase extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppViewLogicImplBase)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppViewLogicImplBase realPSModelObject = (net.ibizsys.model.app.view.PSAppViewLogicImplBase)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "attrname", realPSModelObject.getAttrName(), realPSModelObject, "getAttrName");
		this.setDomainValue(iPSModelTranspileContext, domain, "eventarg", realPSModelObject.getEventArg(), realPSModelObject, "getEventArg");
		this.setDomainValue(iPSModelTranspileContext, domain, "eventarg2", realPSModelObject.getEventArg2(), realPSModelObject, "getEventArg2");
		this.setDomainValue(iPSModelTranspileContext, domain, "eventnames", realPSModelObject.getEventNames(), realPSModelObject, "getEventNames");
		this.setDomainValue(iPSModelTranspileContext, domain, "itemname", realPSModelObject.getItemName(), realPSModelObject, "getItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psappviewlogictype", realPSModelObject.getLogicTrigger(), realPSModelObject, "getLogicTrigger");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuiactionid", realPSModelObject.getPSAppDEUIAction(), realPSModelObject, "getPSAppDEUIAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicid", realPSModelObject.getPSAppDEUILogic(), realPSModelObject, "getPSAppDEUILogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicid", realPSModelObject.getPSAppUILogic(), realPSModelObject, "getPSAppUILogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysviewlogicid", realPSModelObject.getPSAppViewLogic(), realPSModelObject, "getPSAppViewLogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyspfpluginid", realPSModelObject.getPSSysPFPlugin(), realPSModelObject, "getPSSysPFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeviewctrlname", realPSModelObject.getPSViewCtrlName(), realPSModelObject, "getPSViewCtrlName");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "timer", realPSModelObject.getTimer(), realPSModelObject, "getTimer");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETATTRNAME, domain, "attrname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTARG, domain, "eventarg", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTARG2, domain, "eventarg2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTNAMES, domain, "eventnames", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMNAME, domain, "itemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTRIGGER, domain, "psappviewlogictype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEUIACTION, domain, "psdeuiactionid", net.ibizsys.model.app.dataentity.IPSAppDEUIAction.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEUILOGIC, domain, "psdelogicid", net.ibizsys.model.app.dataentity.IPSAppDEUILogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPUILOGIC, domain, "psdelogicid", net.ibizsys.model.app.logic.IPSAppUILogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPVIEWLOGIC, domain, "pssysviewlogicid", net.ibizsys.model.app.view.IPSAppViewLogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSPFPLUGIN, domain, "pssyspfpluginid", net.ibizsys.model.res.IPSSysPFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSVIEWCTRLNAME, domain, "psdeviewctrlname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMER, domain, "timer", int.class, new String[]{"0","-1"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}