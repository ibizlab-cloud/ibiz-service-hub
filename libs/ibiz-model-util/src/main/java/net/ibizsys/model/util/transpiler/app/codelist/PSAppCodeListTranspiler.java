package net.ibizsys.model.util.transpiler.app.codelist;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.codelist.PSAppCodeListImpl.*;



public class PSAppCodeListTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.codelist.PSAppCodeListImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.codelist.PSAppCodeListImpl realPSModelObject = (net.ibizsys.model.app.codelist.PSAppCodeListImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "alltext", realPSModelObject.getAllText(), realPSModelObject, "getAllText");
		this.setDomainValue(iPSModelTranspileContext, domain, "bkcolorpsdefid", realPSModelObject.getBKColorPSAppDEField(), realPSModelObject, "getBKColorPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "beginvaluepsdefid", realPSModelObject.getBeginValuePSAppDEField(), realPSModelObject, "getBeginValuePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "cachetimeout", realPSModelObject.getCacheTimeout(), realPSModelObject, "getCacheTimeout");
		this.setDomainValue(iPSModelTranspileContext, domain, "clspsdefid", realPSModelObject.getClsPSAppDEField(), realPSModelObject, "getClsPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "colorpsdefid", realPSModelObject.getColorPSAppDEField(), realPSModelObject, "getColorPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcond", realPSModelObject.getCustomCond(), realPSModelObject, "getCustomCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "datapsdefid", realPSModelObject.getDataPSAppDEField(), realPSModelObject, "getDataPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "disablepsdefid", realPSModelObject.getDisablePSAppDEField(), realPSModelObject, "getDisablePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytext", realPSModelObject.getEmptyText(), realPSModelObject, "getEmptyText");
		this.setDomainValue(iPSModelTranspileContext, domain, "endvaluepsdefid", realPSModelObject.getEndValuePSAppDEField(), realPSModelObject, "getEndValuePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconclspsdefid", realPSModelObject.getIconClsPSAppDEField(), realPSModelObject, "getIconClsPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconclsxpsdefid", realPSModelObject.getIconClsXPSAppDEField(), realPSModelObject, "getIconClsXPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconpathpsdefid", realPSModelObject.getIconPathPSAppDEField(), realPSModelObject, "getIconPathPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconpathxpsdefid", realPSModelObject.getIconPathXPSAppDEField(), realPSModelObject, "getIconPathXPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "incbeginvalue", realPSModelObject.getIncBeginValueMode(), realPSModelObject, "getIncBeginValueMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "incendvalue", realPSModelObject.getIncEndValueMode(), realPSModelObject, "getIncEndValueMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortdir", realPSModelObject.getMinorSortDir(), realPSModelObject, "getMinorSortDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortpsdefid", realPSModelObject.getMinorSortPSAppDEField(), realPSModelObject, "getMinorSortPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "ormode", realPSModelObject.getOrMode(), realPSModelObject, "getOrMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSAppDEDataSet(), realPSModelObject, "getPSAppDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pvaluepsdefid", realPSModelObject.getPValuePSAppDEField(), realPSModelObject, "getPValuePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "textpsdefid", realPSModelObject.getTextPSAppDEField(), realPSModelObject, "getTextPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "seperator", realPSModelObject.getTextSeparator(), realPSModelObject, "getTextSeparator");
		this.setDomainValue(iPSModelTranspileContext, domain, "valuepsdefid", realPSModelObject.getValuePSAppDEField(), realPSModelObject, "getValuePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueseperator", realPSModelObject.getValueSeparator(), realPSModelObject, "getValueSeparator");
		this.setDomainValue(iPSModelTranspileContext, domain, "numberitem", realPSModelObject.isCodeItemValueNumber(), realPSModelObject, "isCodeItemValueNumber");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecache", realPSModelObject.isEnableCache(), realPSModelObject, "isEnableCache");
		this.setDomainValue(iPSModelTranspileContext, domain, "thresholdgroupflag", realPSModelObject.isThresholdGroup(), realPSModelObject, "isThresholdGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "userscope", realPSModelObject.isUserScope(), realPSModelObject, "isUserScope");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETALLTEXT, domain, "alltext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBKCOLORPSAPPDEFIELD, domain, "bkcolorpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBEGINVALUEPSAPPDEFIELD, domain, "beginvaluepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCACHETIMEOUT, domain, "cachetimeout", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCLSPSAPPDEFIELD, domain, "clspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLORPSAPPDEFIELD, domain, "colorpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMCOND, domain, "customcond", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAPSAPPDEFIELD, domain, "datapsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDISABLEPSAPPDEFIELD, domain, "disablepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXT, domain, "emptytext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENDVALUEPSAPPDEFIELD, domain, "endvaluepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONCLSPSAPPDEFIELD, domain, "iconclspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONCLSXPSAPPDEFIELD, domain, "iconclsxpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONPATHPSAPPDEFIELD, domain, "iconpathpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONPATHXPSAPPDEFIELD, domain, "iconpathxpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINCBEGINVALUEMODE, domain, "incbeginvalue", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINCENDVALUEMODE, domain, "incendvalue", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTDIR, domain, "minorsortdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTPSAPPDEFIELD, domain, "minorsortpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORMODE, domain, "ormode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATASET, domain, "psdedsid", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPVALUEPSAPPDEFIELD, domain, "pvaluepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTPSAPPDEFIELD, domain, "textpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTSEPARATOR, domain, "seperator", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEPSAPPDEFIELD, domain, "valuepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUESEPARATOR, domain, "valueseperator", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCODEITEMVALUENUMBER, domain, "numberitem", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECACHE, domain, "enablecache", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISTHRESHOLDGROUP, domain, "thresholdgroupflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISUSERSCOPE, domain, "userscope", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}