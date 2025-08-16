package net.ibizsys.model.util.transpiler.wx;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wx.PSWXAccountImpl.*;



public class PSWXAccountTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wx.PSWXAccountImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wx.PSWXAccountImpl realPSModelObject = (net.ibizsys.model.wx.PSWXAccountImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysresourceid", realPSModelObject.getPSSysResource(), realPSModelObject, "getPSSysResource");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSRESOURCE, domain, "pssysresourceid", net.ibizsys.model.res.IPSSysResource.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}