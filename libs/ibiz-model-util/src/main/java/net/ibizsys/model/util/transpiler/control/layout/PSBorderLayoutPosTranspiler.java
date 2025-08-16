package net.ibizsys.model.util.transpiler.control.layout;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.layout.PSBorderLayoutPosImpl.*;



public class PSBorderLayoutPosTranspiler extends net.ibizsys.model.util.transpiler.control.layout.PSLayoutPosTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.layout.PSBorderLayoutPosImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.layout.PSBorderLayoutPosImpl realPSModelObject = (net.ibizsys.model.control.layout.PSBorderLayoutPosImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "al_pos", realPSModelObject.getLayoutPos(), realPSModelObject, "getLayoutPos");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLAYOUTPOS, domain, "al_pos", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}