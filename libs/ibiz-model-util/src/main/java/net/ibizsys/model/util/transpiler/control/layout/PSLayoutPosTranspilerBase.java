package net.ibizsys.model.util.transpiler.control.layout;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.layout.PSLayoutPosImplBase.*;



public abstract class PSLayoutPosTranspilerBase extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.layout.PSLayoutPosImplBase)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.layout.PSLayoutPosImplBase realPSModelObject = (net.ibizsys.model.control.layout.PSLayoutPosImplBase)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "halignself", realPSModelObject.getHAlignSelf(), realPSModelObject, "getHAlignSelf");
		this.setDomainValue(iPSModelTranspileContext, domain, "height", realPSModelObject.getHeight(), realPSModelObject, "getHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "heightmode", realPSModelObject.getHeightMode(), realPSModelObject, "getHeightMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "spacingbottom", realPSModelObject.getSpacingBottom(), realPSModelObject, "getSpacingBottom");
		this.setDomainValue(iPSModelTranspileContext, domain, "spacingleft", realPSModelObject.getSpacingLeft(), realPSModelObject, "getSpacingLeft");
		this.setDomainValue(iPSModelTranspileContext, domain, "spacingright", realPSModelObject.getSpacingRight(), realPSModelObject, "getSpacingRight");
		this.setDomainValue(iPSModelTranspileContext, domain, "spacingtop", realPSModelObject.getSpacingTop(), realPSModelObject, "getSpacingTop");
		this.setDomainValue(iPSModelTranspileContext, domain, "valignself", realPSModelObject.getVAlignSelf(), realPSModelObject, "getVAlignSelf");
		this.setDomainValue(iPSModelTranspileContext, domain, "width", realPSModelObject.getWidth(), realPSModelObject, "getWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "widthmode", realPSModelObject.getWidthMode(), realPSModelObject, "getWidthMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHALIGNSELF, domain, "halignself", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEIGHT, domain, "height", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEIGHTMODE, domain, "heightmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSPACINGBOTTOM, domain, "spacingbottom", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSPACINGLEFT, domain, "spacingleft", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSPACINGRIGHT, domain, "spacingright", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSPACINGTOP, domain, "spacingtop", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALIGNSELF, domain, "valignself", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTH, domain, "width", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTHMODE, domain, "widthmode", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}