package net.ibizsys.model.util.transpiler.codelist;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.codelist.PSCodeListImpl.*;



public class PSCodeListTranspiler extends net.ibizsys.model.util.transpiler.codelist.PSCodeItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.codelist.PSCodeListImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.codelist.PSCodeListImpl realPSModelObject = (net.ibizsys.model.codelist.PSCodeListImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "alltext", realPSModelObject.getAllText(), realPSModelObject, "getAllText");
		this.setDomainValue(iPSModelTranspileContext, domain, "bkcolorpsdefid", realPSModelObject.getBKColorPSDEField(), realPSModelObject, "getBKColorPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "clspsdefid", realPSModelObject.getClsPSDEField(), realPSModelObject, "getClsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "cltype", realPSModelObject.getCodeListType(), realPSModelObject, "getCodeListType");
		this.setDomainValue(iPSModelTranspileContext, domain, "colorpsdefid", realPSModelObject.getColorPSDEField(), realPSModelObject, "getColorPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "dsconditions", realPSModelObject.getCustomCond(), realPSModelObject, "getCustomCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "datapsdefid", realPSModelObject.getDataPSDEField(), realPSModelObject, "getDataPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "disablepsdefid", realPSModelObject.getDisablePSDEField(), realPSModelObject, "getDisablePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "enabledynasys", realPSModelObject.getDynaSysMode(), realPSModelObject, "getDynaSysMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytext", realPSModelObject.getEmptyText(), realPSModelObject, "getEmptyText");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconclspsdefid", realPSModelObject.getIconClsPSDEField(), realPSModelObject, "getIconClsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconclsxpsdefid", realPSModelObject.getIconClsXPSDEField(), realPSModelObject, "getIconClsXPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconpathxpsdefid", realPSModelObject.getIconPathXPSDEField(), realPSModelObject, "getIconPathXPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortdir", realPSModelObject.getMinorSortDir(), realPSModelObject, "getMinorSortDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortpsdefid", realPSModelObject.getMinorSortPSDEField(), realPSModelObject, "getMinorSortPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "ormode", realPSModelObject.getOrMode(), realPSModelObject, "getOrMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdemslogicid", realPSModelObject.getPSDEMSLogic(), realPSModelObject, "getPSDEMSLogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "pvaluepsdefid", realPSModelObject.getPValuePSDEField(), realPSModelObject, "getPValuePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "textpsdefid", realPSModelObject.getTextPSDEField(), realPSModelObject, "getTextPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "seperator", realPSModelObject.getTextSeparator(), realPSModelObject, "getTextSeparator");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata", realPSModelObject.getUserData(), realPSModelObject, "getUserData");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata2", realPSModelObject.getUserData2(), realPSModelObject, "getUserData2");
		this.setDomainValue(iPSModelTranspileContext, domain, "valuepsdefid", realPSModelObject.getValuePSDEField(), realPSModelObject, "getValuePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueseperator", realPSModelObject.getValueSeparator(), realPSModelObject, "getValueSeparator");
		this.setDomainValue(iPSModelTranspileContext, domain, "numberitem", realPSModelObject.isCodeItemValueNumber(), realPSModelObject, "isCodeItemValueNumber");
		this.setDomainValue(iPSModelTranspileContext, domain, "userscope", realPSModelObject.isUserScope(), realPSModelObject, "isUserScope");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETALLTEXT, domain, "alltext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBKCOLORPSDEFIELD, domain, "bkcolorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCLSPSDEFIELD, domain, "clspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODELISTTYPE, domain, "cltype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLORPSDEFIELD, domain, "colorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMCOND, domain, "dsconditions", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAPSDEFIELD, domain, "datapsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDISABLEPSDEFIELD, domain, "disablepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNASYSMODE, domain, "enabledynasys", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXT, domain, "emptytext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONCLSPSDEFIELD, domain, "iconclspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONCLSXPSDEFIELD, domain, "iconclsxpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONPATHXPSDEFIELD, domain, "iconpathxpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTDIR, domain, "minorsortdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTPSDEFIELD, domain, "minorsortpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORMODE, domain, "ormode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEMSLOGIC, domain, "psdemslogicid", net.ibizsys.model.dataentity.logic.IPSDEMSLogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPVALUEPSDEFIELD, domain, "pvaluepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTPSDEFIELD, domain, "textpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTSEPARATOR, domain, "seperator", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA, domain, "userdata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA2, domain, "userdata2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEPSDEFIELD, domain, "valuepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUESEPARATOR, domain, "valueseperator", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCODEITEMVALUENUMBER, domain, "numberitem", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISUSERSCOPE, domain, "userscope", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}