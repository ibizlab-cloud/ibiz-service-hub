package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFLinkCondImpl.*;



public abstract class PSWFLinkCondTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFLinkCondImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFLinkCondImpl realPSModelObject = (net.ibizsys.model.wf.PSWFLinkCondImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "logictype", realPSModelObject.getCondType(), realPSModelObject, "getCondType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONDTYPE, domain, "logictype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}