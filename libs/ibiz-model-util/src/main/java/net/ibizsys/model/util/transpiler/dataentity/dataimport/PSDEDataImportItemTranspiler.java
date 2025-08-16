package net.ibizsys.model.util.transpiler.dataentity.dataimport;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataimport.PSDEDataImportItemImpl.*;



public class PSDEDataImportItemTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataimport.PSDEDataImportItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataimport.PSDEDataImportItemImpl realPSModelObject = (net.ibizsys.model.dataentity.dataimport.PSDEDataImportItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "createdv", realPSModelObject.getCreateDV(), realPSModelObject, "getCreateDV");
		this.setDomainValue(iPSModelTranspileContext, domain, "createdvt", realPSModelObject.getCreateDVT(), realPSModelObject, "getCreateDVT");
		this.setDomainValue(iPSModelTranspileContext, domain, "ordervalue", realPSModelObject.getOrderValue(), realPSModelObject, "getOrderValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSAppDEField(), realPSModelObject, "getPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodelistid", realPSModelObject.getPSCodeList(), realPSModelObject, "getPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSDEField(), realPSModelObject, "getPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatedv", realPSModelObject.getUpdateDV(), realPSModelObject, "getUpdateDV");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatedvt", realPSModelObject.getUpdateDVT(), realPSModelObject, "getUpdateDVT");
		this.setDomainValue(iPSModelTranspileContext, domain, "hiddendataitem", realPSModelObject.isHiddenDataItem(), realPSModelObject, "isHiddenDataItem");
		this.setDomainValue(iPSModelTranspileContext, domain, "keyflag", realPSModelObject.isUniqueItem(), realPSModelObject, "isUniqueItem");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATEDV, domain, "createdv", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATEDVT, domain, "createdvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORDERVALUE, domain, "ordervalue", int.class, new String[]{"99999"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEFIELD, domain, "psdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSCODELIST, domain, "pscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFIELD, domain, "psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEDV, domain, "updatedv", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEDVT, domain, "updatedvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISHIDDENDATAITEM, domain, "hiddendataitem", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISUNIQUEITEM, domain, "keyflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}