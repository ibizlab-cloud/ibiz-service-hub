package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.StartPSWFProcessImpl.*;



public class StartPSWFProcessTranspiler extends net.ibizsys.model.util.transpiler.wf.PSWFProcessTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.StartPSWFProcessImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.StartPSWFProcessImpl realPSModelObject = (net.ibizsys.model.wf.StartPSWFProcessImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "formcodename", realPSModelObject.getFormCodeName(), realPSModelObject, "getFormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobformcodename", realPSModelObject.getMobFormCodeName(), realPSModelObject, "getMobFormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobviewcodename", realPSModelObject.getMobStartViewCodeName(), realPSModelObject, "getMobStartViewCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobpsdeviewname", realPSModelObject.getMobStartViewName(), realPSModelObject, "getMobStartViewName");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewcodename", realPSModelObject.getStartViewCodeName(), realPSModelObject, "getStartViewCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeviewbasename", realPSModelObject.getStartViewName(), realPSModelObject, "getStartViewName");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMCODENAME, domain, "formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBFORMCODENAME, domain, "mobformcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBSTARTVIEWCODENAME, domain, "mobviewcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBSTARTVIEWNAME, domain, "mobpsdeviewname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTARTVIEWCODENAME, domain, "viewcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTARTVIEWNAME, domain, "psdeviewbasename", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}