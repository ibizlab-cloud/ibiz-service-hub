package net.ibizsys.model.util.transpiler.control.layout;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.layout.PSAbsoluteLayoutPosImpl.*;



public class PSAbsoluteLayoutPosTranspiler extends net.ibizsys.model.util.transpiler.control.layout.PSLayoutPosTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.layout.PSAbsoluteLayoutPosImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.layout.PSAbsoluteLayoutPosImpl realPSModelObject = (net.ibizsys.model.control.layout.PSAbsoluteLayoutPosImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "bottompos", realPSModelObject.getBottom(), realPSModelObject, "getBottom");
		this.setDomainValue(iPSModelTranspileContext, domain, "al_pos", realPSModelObject.getLayoutPos(), realPSModelObject, "getLayoutPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "leftpos", realPSModelObject.getLeft(), realPSModelObject, "getLeft");
		this.setDomainValue(iPSModelTranspileContext, domain, "rightpos", realPSModelObject.getRight(), realPSModelObject, "getRight");
		this.setDomainValue(iPSModelTranspileContext, domain, "toppos", realPSModelObject.getTop(), realPSModelObject, "getTop");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBOTTOM, domain, "bottompos", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLAYOUTPOS, domain, "al_pos", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLEFT, domain, "leftpos", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRIGHT, domain, "rightpos", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOP, domain, "toppos", int.class, new String[]{"0"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}