package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSDEFInputTipImpl.*;



public class PSDEFInputTipTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSDEFInputTipImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSDEFInputTipImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSDEFInputTipImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "contentpslanresid", realPSModelObject.getContentPSLanguageRes(), realPSModelObject, "getContentPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "content", realPSModelObject.getHtmlContent(), realPSModelObject, "getHtmlContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "moreurl", realPSModelObject.getMoreUrl(), realPSModelObject, "getMoreUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "rawcontent", realPSModelObject.getRawContent(), realPSModelObject, "getRawContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "tipmode", realPSModelObject.getTipMode(), realPSModelObject, "getTipMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "uniquetag", realPSModelObject.getUniqueTag(), realPSModelObject, "getUniqueTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflag", realPSModelObject.isDefault(), realPSModelObject, "isDefault");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableclose", realPSModelObject.isEnableClose(), realPSModelObject, "isEnableClose");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTPSLANGUAGERES, domain, "contentpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHTMLCONTENT, domain, "content", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOREURL, domain, "moreurl", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRAWCONTENT, domain, "rawcontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIPMODE, domain, "tipmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNIQUETAG, domain, "uniquetag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULT, domain, "defaultflag", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECLOSE, domain, "enableclose", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}