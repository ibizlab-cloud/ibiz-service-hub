package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormRawItemImpl.*;



public class PSDEFormRawItemTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormDetailTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormRawItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormRawItemImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormRawItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "contenttype", realPSModelObject.getContentType(), realPSModelObject, "getContentType");
		this.setDomainValue(iPSModelTranspileContext, domain, "htmlcontent", realPSModelObject.getHtmlContent(), realPSModelObject, "getHtmlContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "rawcontent", realPSModelObject.getRawContent(), realPSModelObject, "getRawContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlheight", realPSModelObject.getRawItemHeight(), realPSModelObject, "getRawItemHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlwidth", realPSModelObject.getRawItemWidth(), realPSModelObject, "getRawItemWidth");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTTYPE, domain, "contenttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHTMLCONTENT, domain, "htmlcontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRAWCONTENT, domain, "rawcontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRAWITEMHEIGHT, domain, "ctrlheight", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRAWITEMWIDTH, domain, "ctrlwidth", double.class, new String[]{"0.0"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}