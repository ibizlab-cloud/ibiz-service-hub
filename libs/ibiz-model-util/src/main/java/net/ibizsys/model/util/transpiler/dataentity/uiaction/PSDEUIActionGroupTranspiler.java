package net.ibizsys.model.util.transpiler.dataentity.uiaction;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl.*;



public class PSDEUIActionGroupTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl realPSModelObject = (net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "actionlevelpsdefid", realPSModelObject.getActionLevelPSAppDEField(), realPSModelObject, "getActionLevelPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "actionlevelpsdefid", realPSModelObject.getActionLevelPSDEField(), realPSModelObject, "getActionLevelPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "buttonstylepsdefid", realPSModelObject.getButtonStylePSAppDEField(), realPSModelObject, "getButtonStylePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "buttonstylepsdefid", realPSModelObject.getButtonStylePSDEField(), realPSModelObject, "getButtonStylePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "clspsdefid", realPSModelObject.getClsPSAppDEField(), realPSModelObject, "getClsPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "clspsdefid", realPSModelObject.getClsPSDEField(), realPSModelObject, "getClsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailpsdedsid", realPSModelObject.getDetailPSAppDEDataSet(), realPSModelObject, "getDetailPSAppDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailpsdeid", realPSModelObject.getDetailPSAppDataEntity(), realPSModelObject, "getDetailPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailpsdedsid", realPSModelObject.getDetailPSDEDataSet(), realPSModelObject, "getDetailPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailpsdeid", realPSModelObject.getDetailPSDataEntity(), realPSModelObject, "getDetailPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "dynamicmode", realPSModelObject.getDynamicMode(), realPSModelObject, "getDynamicMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablelogicpsdefid", realPSModelObject.getEnableScriptPSAppDEField(), realPSModelObject, "getEnableScriptPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablelogicpsdefid", realPSModelObject.getEnableScriptPSDEField(), realPSModelObject, "getEnableScriptPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag", realPSModelObject.getGroupTag(), realPSModelObject, "getGroupTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag2", realPSModelObject.getGroupTag2(), realPSModelObject, "getGroupTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag3", realPSModelObject.getGroupTag3(), realPSModelObject, "getGroupTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag4", realPSModelObject.getGroupTag4(), realPSModelObject, "getGroupTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconclspsdefid", realPSModelObject.getIconClsPSAppDEField(), realPSModelObject, "getIconClsPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconclspsdefid", realPSModelObject.getIconClsPSDEField(), realPSModelObject, "getIconClsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "textpsdefid", realPSModelObject.getTextPSAppDEField(), realPSModelObject, "getTextPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "textpsdefid", realPSModelObject.getTextPSDEField(), realPSModelObject, "getTextPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "tipspsdefid", realPSModelObject.getTipsPSAppDEField(), realPSModelObject, "getTipsPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "tipspsdefid", realPSModelObject.getTipsPSDEField(), realPSModelObject, "getTipsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "uiactiontagpsdefid", realPSModelObject.getUIActionTagPSAppDEField(), realPSModelObject, "getUIActionTagPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "uiactiontagpsdefid", realPSModelObject.getUIActionTagPSDEField(), realPSModelObject, "getUIActionTagPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "visiblelogicpsdefid", realPSModelObject.getVisibleScriptPSAppDEField(), realPSModelObject, "getVisibleScriptPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "visiblelogicpsdefid", realPSModelObject.getVisibleScriptPSDEField(), realPSModelObject, "getVisibleScriptPSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONLEVELPSAPPDEFIELD, domain, "actionlevelpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONLEVELPSDEFIELD, domain, "actionlevelpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONSTYLEPSAPPDEFIELD, domain, "buttonstylepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONSTYLEPSDEFIELD, domain, "buttonstylepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCLSPSAPPDEFIELD, domain, "clspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCLSPSDEFIELD, domain, "clspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILPSAPPDEDATASET, domain, "detailpsdedsid", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILPSAPPDATAENTITY, domain, "detailpsdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILPSDEDATASET, domain, "detailpsdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILPSDATAENTITY, domain, "detailpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNAMICMODE, domain, "dynamicmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLESCRIPTPSAPPDEFIELD, domain, "enablelogicpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLESCRIPTPSDEFIELD, domain, "enablelogicpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG, domain, "uagtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG2, domain, "uagtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG3, domain, "uagtag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG4, domain, "uagtag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONCLSPSAPPDEFIELD, domain, "iconclspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONCLSPSDEFIELD, domain, "iconclspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTPSAPPDEFIELD, domain, "textpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTPSDEFIELD, domain, "textpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIPSPSAPPDEFIELD, domain, "tipspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIPSPSDEFIELD, domain, "tipspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUIACTIONTAGPSAPPDEFIELD, domain, "uiactiontagpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUIACTIONTAGPSDEFIELD, domain, "uiactiontagpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVISIBLESCRIPTPSAPPDEFIELD, domain, "visiblelogicpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVISIBLESCRIPTPSDEFIELD, domain, "visiblelogicpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}