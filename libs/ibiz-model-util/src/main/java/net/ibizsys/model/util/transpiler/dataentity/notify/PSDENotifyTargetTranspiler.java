package net.ibizsys.model.util.transpiler.dataentity.notify;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.notify.PSDENotifyTargetImpl.*;



public class PSDENotifyTargetTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.notify.PSDENotifyTargetImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.notify.PSDENotifyTargetImpl realPSModelObject = (net.ibizsys.model.dataentity.notify.PSDENotifyTargetImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "data", realPSModelObject.getData(), realPSModelObject, "getData");
		this.setDomainValue(iPSModelTranspileContext, domain, "filter", realPSModelObject.getFilter(), realPSModelObject, "getFilter");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgtargetid", realPSModelObject.getPSSysMsgTarget(), realPSModelObject, "getPSSysMsgTarget");
		this.setDomainValue(iPSModelTranspileContext, domain, "targetpsdefid", realPSModelObject.getTargetPSDEField(), realPSModelObject, "getTargetPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "targettype", realPSModelObject.getTargetType(), realPSModelObject, "getTargetType");
		this.setDomainValue(iPSModelTranspileContext, domain, "targettypepsdefid", realPSModelObject.getTargetTypePSDEField(), realPSModelObject, "getTargetTypePSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATA, domain, "data", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFILTER, domain, "filter", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMSGTARGET, domain, "pssysmsgtargetid", net.ibizsys.model.msg.IPSSysMsgTarget.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTARGETPSDEFIELD, domain, "targetpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTARGETTYPE, domain, "targettype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTARGETTYPEPSDEFIELD, domain, "targettypepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}