package net.ibizsys.model.util.transpiler.control.layout;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.layout.PSFlexLayoutImpl.*;



public class PSFlexLayoutTranspiler extends net.ibizsys.model.util.transpiler.control.layout.PSLayoutTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.layout.PSFlexLayoutImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.layout.PSFlexLayoutImpl realPSModelObject = (net.ibizsys.model.control.layout.PSFlexLayoutImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "flexalign", realPSModelObject.getAlign(), realPSModelObject, "getAlign");
		this.setDomainValue(iPSModelTranspileContext, domain, "flexdir", realPSModelObject.getDir(), realPSModelObject, "getDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "flexvalign", realPSModelObject.getVAlign(), realPSModelObject, "getVAlign");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETALIGN, domain, "flexalign", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDIR, domain, "flexdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALIGN, domain, "flexvalign", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}