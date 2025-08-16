package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSSysWFSettingImpl.*;



public class PSSysWFSettingTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSSysWFSettingImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSSysWFSettingImpl realPSModelObject = (net.ibizsys.model.wf.PSSysWFSettingImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgtemplid", realPSModelObject.getRemindPSSysMsgTempl(), realPSModelObject, "getRemindPSSysMsgTempl");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMINDPSSYSMSGTEMPL, domain, "pssysmsgtemplid", net.ibizsys.model.msg.IPSSysMsgTempl.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}