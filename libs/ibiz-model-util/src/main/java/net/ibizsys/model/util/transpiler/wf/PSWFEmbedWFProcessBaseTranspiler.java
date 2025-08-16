package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFEmbedWFProcessBaseImpl.*;



public abstract class PSWFEmbedWFProcessBaseTranspiler extends net.ibizsys.model.util.transpiler.wf.PSWFProcessTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFEmbedWFProcessBaseImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFEmbedWFProcessBaseImpl realPSModelObject = (net.ibizsys.model.wf.PSWFEmbedWFProcessBaseImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "multiinstmode", realPSModelObject.getMultiInstMode(), realPSModelObject, "getMultiInstMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMULTIINSTMODE, domain, "multiinstmode", java.lang.String.class, new String[]{"NONE"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}