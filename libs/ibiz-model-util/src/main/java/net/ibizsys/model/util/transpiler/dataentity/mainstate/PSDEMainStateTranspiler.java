package net.ibizsys.model.util.transpiler.dataentity.mainstate;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.mainstate.PSDEMainStateImpl.*;



public class PSDEMainStateTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.mainstate.PSDEMainStateImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.mainstate.PSDEMainStateImpl realPSModelObject = (net.ibizsys.model.dataentity.mainstate.PSDEMainStateImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "deactiondenymsg", realPSModelObject.getActionDenyMsg(), realPSModelObject, "getActionDenyMsg");
		this.setDomainValue(iPSModelTranspileContext, domain, "enterpsdeactionid", realPSModelObject.getEnterPSDEAction(), realPSModelObject, "getEnterPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdemainstatename", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mstag", realPSModelObject.getMSTag(), realPSModelObject, "getMSTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "deopprivdenymsg", realPSModelObject.getOPPrivDenyMsg(), realPSModelObject, "getOPPrivDenyMsg");
		this.setDomainValue(iPSModelTranspileContext, domain, "msvalue2", realPSModelObject.getState2Value(), realPSModelObject, "getState2Value");
		this.setDomainValue(iPSModelTranspileContext, domain, "msvalue3", realPSModelObject.getState3Value(), realPSModelObject, "getState3Value");
		this.setDomainValue(iPSModelTranspileContext, domain, "msvalue", realPSModelObject.getStateValue(), realPSModelObject, "getStateValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewactions", realPSModelObject.getViewActions(), realPSModelObject, "getViewActions");
		this.setDomainValue(iPSModelTranspileContext, domain, "allowmode", realPSModelObject.isActionAllowMode(), realPSModelObject, "isActionAllowMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "allowmode", realPSModelObject.isAllowMode(), realPSModelObject, "isAllowMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultmode", realPSModelObject.isDefault(), realPSModelObject, "isDefault");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableviewactions", realPSModelObject.isEnableViewActions(), realPSModelObject, "isEnableViewActions");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldallowmode", realPSModelObject.isFieldAllowMode(), realPSModelObject, "isFieldAllowMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "opprivallowmode", realPSModelObject.isOPPrivAllowMode(), realPSModelObject, "isOPPrivAllowMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONDENYMSG, domain, "deactiondenymsg", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENTERPSDEACTION, domain, "enterpsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "psdemainstatename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSTAG, domain, "mstag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOPPRIVDENYMSG, domain, "deopprivdenymsg", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTATE2VALUE, domain, "msvalue2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTATE3VALUE, domain, "msvalue3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTATEVALUE, domain, "msvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWACTIONS, domain, "viewactions", long.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISACTIONALLOWMODE, domain, "allowmode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLOWMODE, domain, "allowmode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULT, domain, "defaultmode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEVIEWACTIONS, domain, "enableviewactions", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISFIELDALLOWMODE, domain, "fieldallowmode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISOPPRIVALLOWMODE, domain, "opprivallowmode", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}