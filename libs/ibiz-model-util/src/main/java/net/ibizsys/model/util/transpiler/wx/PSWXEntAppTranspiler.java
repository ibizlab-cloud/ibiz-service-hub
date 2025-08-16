package net.ibizsys.model.util.transpiler.wx;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wx.PSWXEntAppImpl.*;



public class PSWXEntAppTranspiler extends net.ibizsys.model.util.transpiler.wx.PSWXAccountObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wx.PSWXEntAppImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wx.PSWXEntAppImpl realPSModelObject = (net.ibizsys.model.wx.PSWXEntAppImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysresourceid", realPSModelObject.getPSSysResource(), realPSModelObject, "getPSSysResource");
		this.setDomainValue(iPSModelTranspileContext, domain, "repenterflag", realPSModelObject.isReportEnter(), realPSModelObject, "isReportEnter");
		this.setDomainValue(iPSModelTranspileContext, domain, "replocationflag", realPSModelObject.isReportLocation(), realPSModelObject, "isReportLocation");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSRESOURCE, domain, "pssysresourceid", net.ibizsys.model.res.IPSSysResource.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISREPORTENTER, domain, "repenterflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISREPORTLOCATION, domain, "replocationflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}