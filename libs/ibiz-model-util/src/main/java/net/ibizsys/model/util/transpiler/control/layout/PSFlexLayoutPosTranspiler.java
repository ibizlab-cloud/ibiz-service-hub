package net.ibizsys.model.util.transpiler.control.layout;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.layout.PSFlexLayoutPosImpl.*;



public class PSFlexLayoutPosTranspiler extends net.ibizsys.model.util.transpiler.control.layout.PSLayoutPosTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.layout.PSFlexLayoutPosImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.layout.PSFlexLayoutPosImpl realPSModelObject = (net.ibizsys.model.control.layout.PSFlexLayoutPosImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "flexbasis", realPSModelObject.getBasis(), realPSModelObject, "getBasis", new String[]{"-1"});
		this.setDomainValue(iPSModelTranspileContext, domain, "flexgrow", realPSModelObject.getGrow(), realPSModelObject, "getGrow", new String[]{"-1"});
		this.setDomainValue(iPSModelTranspileContext, domain, "flexshrink", realPSModelObject.getShrink(), realPSModelObject, "getShrink", new String[]{"1"});
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBASIS, domain, "flexbasis", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROW, domain, "flexgrow", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSHRINK, domain, "flexshrink", int.class, new String[]{"1"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}