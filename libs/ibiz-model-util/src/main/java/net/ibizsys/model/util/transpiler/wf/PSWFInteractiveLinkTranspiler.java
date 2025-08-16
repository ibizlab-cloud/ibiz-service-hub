package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFInteractiveLinkImpl.*;



public class PSWFInteractiveLinkTranspiler extends net.ibizsys.model.util.transpiler.wf.PSWFLinkTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFInteractiveLinkImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFInteractiveLinkImpl realPSModelObject = (net.ibizsys.model.wf.PSWFInteractiveLinkImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "formcodename", realPSModelObject.getFormCodeName(), realPSModelObject, "getFormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeformname", realPSModelObject.getFormName(), realPSModelObject, "getFormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "frompswfprocid", realPSModelObject.getFromPSWFProcess(), realPSModelObject, "getFromPSWFProcess");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobformcodename", realPSModelObject.getMobFormCodeName(), realPSModelObject, "getMobFormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobpsdeformname", realPSModelObject.getMobFormName(), realPSModelObject, "getMobFormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobviewcodename", realPSModelObject.getMobViewCodeName(), realPSModelObject, "getMobViewCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobviewcodename", realPSModelObject.getMobViewName(), realPSModelObject, "getMobViewName");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewcodename", realPSModelObject.getViewCodeName(), realPSModelObject, "getViewCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeviewbasename", realPSModelObject.getViewName(), realPSModelObject, "getViewName");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMCODENAME, domain, "formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMNAME, domain, "psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFROMPSWFPROCESS, domain, "frompswfprocid", net.ibizsys.model.wf.IPSWFInteractiveProcess.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBFORMCODENAME, domain, "mobformcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBFORMNAME, domain, "mobpsdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBVIEWCODENAME, domain, "mobviewcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBVIEWNAME, domain, "mobviewcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWCODENAME, domain, "viewcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWNAME, domain, "psdeviewbasename", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}