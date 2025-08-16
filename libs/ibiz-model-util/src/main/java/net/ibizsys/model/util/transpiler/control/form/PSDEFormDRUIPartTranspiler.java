package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormDRUIPartImpl.*;



public class PSDEFormDRUIPartTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormDetailTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormDRUIPartImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormDRUIPartImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormDRUIPartImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dritemtag", realPSModelObject.getDRItemTag(), realPSModelObject, "getDRItemTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "maskinfo", realPSModelObject.getMaskInfo(), realPSModelObject, "getMaskInfo");
		this.setDomainValue(iPSModelTranspileContext, domain, "maskmode", realPSModelObject.getMaskMode(), realPSModelObject, "getMaskMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "maskpslanresid", realPSModelObject.getMaskPSLanguageRes(), realPSModelObject, "getMaskPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefiupdateid", realPSModelObject.getPSDEFormItemUpdate(), realPSModelObject, "getPSDEFormItemUpdate");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueitemname", realPSModelObject.getParamItem(), realPSModelObject, "getParamItem");
		this.setDomainValue(iPSModelTranspileContext, domain, "resetitemname", realPSModelObject.getRefreshItems(), realPSModelObject, "getRefreshItems");
		this.setDomainValue(iPSModelTranspileContext, domain, "wbdefmode", realPSModelObject.isNeedSave(), realPSModelObject, "isNeedSave");
		this.setDomainValue(iPSModelTranspileContext, domain, "buildinaction", realPSModelObject.isRefreshItemsSetParamOnly(), realPSModelObject, "isRefreshItemsSetParamOnly");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDRITEMTAG, domain, "dritemtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMASKINFO, domain, "maskinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMASKMODE, domain, "maskmode", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMASKPSLANGUAGERES, domain, "maskpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFORMITEMUPDATE, domain, "psdefiupdateid", net.ibizsys.model.control.form.IPSDEFormItemUpdate.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMITEM, domain, "valueitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFRESHITEMS, domain, "resetitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNEEDSAVE, domain, "wbdefmode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISREFRESHITEMSSETPARAMONLY, domain, "buildinaction", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}