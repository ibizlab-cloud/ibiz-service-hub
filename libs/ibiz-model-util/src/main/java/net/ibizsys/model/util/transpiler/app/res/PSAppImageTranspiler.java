package net.ibizsys.model.util.transpiler.app.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.res.PSAppImageImpl.*;



public class PSAppImageTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.res.PSAppImageImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.res.PSAppImageImpl realPSModelObject = (net.ibizsys.model.app.res.PSAppImageImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cssclass", realPSModelObject.getCssClass(), realPSModelObject, "getCssClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "cssclassx", realPSModelObject.getCssClassX(), realPSModelObject, "getCssClassX");
		this.setDomainValue(iPSModelTranspileContext, domain, "glyph", realPSModelObject.getGlyph(), realPSModelObject, "getGlyph");
		this.setDomainValue(iPSModelTranspileContext, domain, "height", realPSModelObject.getHeight(), realPSModelObject, "getHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "imagepath", realPSModelObject.getImagePath(), realPSModelObject, "getImagePath");
		this.setDomainValue(iPSModelTranspileContext, domain, "imagepathx", realPSModelObject.getImagePathX(), realPSModelObject, "getImagePathX");
		this.setDomainValue(iPSModelTranspileContext, domain, "rawcontent", realPSModelObject.getRawContent(), realPSModelObject, "getRawContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "width", realPSModelObject.getWidth(), realPSModelObject, "getWidth");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCSSCLASS, domain, "cssclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCSSCLASSX, domain, "cssclassx", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGLYPH, domain, "glyph", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEIGHT, domain, "height", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMAGEPATH, domain, "imagepath", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMAGEPATHX, domain, "imagepathx", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRAWCONTENT, domain, "rawcontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTH, domain, "width", int.class, new String[]{"0"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}