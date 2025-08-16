package net.ibizsys.model.util.transpiler.dataentity.uiaction;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.uiaction.PSDEUIActionImpl.*;



public class PSDEUIActionTranspiler extends net.ibizsys.model.util.transpiler.view.PSUIActionTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.uiaction.PSDEUIActionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.uiaction.PSDEUIActionImpl realPSModelObject = (net.ibizsys.model.dataentity.uiaction.PSDEUIActionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "actionlevel", realPSModelObject.getActionLevel(), realPSModelObject, "getActionLevel");
		this.setDomainValue(iPSModelTranspileContext, domain, "actiontarget", realPSModelObject.getActionTarget(), realPSModelObject, "getActionTarget");
		this.setDomainValue(iPSModelTranspileContext, domain, "noprivdm", realPSModelObject.getAppNoPrivDisplayMode(), realPSModelObject, "getAppNoPrivDisplayMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "buttonstyle", realPSModelObject.getButtonStyle(), realPSModelObject, "getButtonStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "cmpslanresid", realPSModelObject.getCMPSLanguageRes(), realPSModelObject, "getCMPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "confirminfo", realPSModelObject.getConfirmMsg(), realPSModelObject, "getConfirmMsg");
		this.setDomainValue(iPSModelTranspileContext, domain, "counterid", realPSModelObject.getCounterId(), realPSModelObject, "getCounterId");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeopprivid", realPSModelObject.getDataAccessAction(), realPSModelObject, "getDataAccessAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "closeeditview", realPSModelObject.getDialogResult(), realPSModelObject, "getDialogResult");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeviewbaseid", realPSModelObject.getFrontPSAppView(), realPSModelObject, "getFrontPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "frontprotype", realPSModelObject.getFrontProcessType(), realPSModelObject, "getFrontProcessType");
		this.setDomainValue(iPSModelTranspileContext, domain, "htmlpageurl", realPSModelObject.getHtmlPageUrl(), realPSModelObject, "getHtmlPageUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "nextpsdeuiactionid", realPSModelObject.getNextPSUIAction(), realPSModelObject, "getNextPSUIAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscounterid", realPSModelObject.getPSAppCounter(), realPSModelObject, "getPSAppCounter");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeacmodeid", realPSModelObject.getPSAppDEACMode(), realPSModelObject, "getPSAppDEACMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "no2psdedataexpid", realPSModelObject.getPSAppDEDataExport(), realPSModelObject, "getPSAppDEDataExport");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedataimpid", realPSModelObject.getPSAppDEDataImport(), realPSModelObject, "getPSAppDEDataImport");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeactionid", realPSModelObject.getPSAppDEMethod(), realPSModelObject, "getPSAppDEMethod");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeprintid", realPSModelObject.getPSAppDEPrint(), realPSModelObject, "getPSAppDEPrint");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeviewlogicid", realPSModelObject.getPSAppDEUILogic(), realPSModelObject, "getPSAppDEUILogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysviewlogicid", realPSModelObject.getPSAppUILogic(), realPSModelObject, "getPSAppUILogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeformid", realPSModelObject.getPSDEEditForm(), realPSModelObject, "getPSDEEditForm");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeopprivid", realPSModelObject.getPSDEOPPriv(), realPSModelObject, "getPSDEOPPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "paramitem", realPSModelObject.getParamItem(), realPSModelObject, "getParamItem");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuiactionid", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "reloaddata", realPSModelObject.getRefreshMode(), realPSModelObject, "getRefreshMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "smpslanresid", realPSModelObject.getSMPSLanguageRes(), realPSModelObject, "getSMPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "successinfo", realPSModelObject.getSuccessMsg(), realPSModelObject, "getSuccessMsg");
		this.setDomainValue(iPSModelTranspileContext, domain, "textitem", realPSModelObject.getTextItem(), realPSModelObject, "getTextItem");
		this.setDomainValue(iPSModelTranspileContext, domain, "timeout", realPSModelObject.getTimeout(), realPSModelObject, "getTimeout");
		this.setDomainValue(iPSModelTranspileContext, domain, "tooltipinfo", realPSModelObject.getTooltip(), realPSModelObject, "getTooltip");
		this.setDomainValue(iPSModelTranspileContext, domain, "tippslanresid", realPSModelObject.getTooltipPSLanguageRes(), realPSModelObject, "getTooltipPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "uiactiontype", realPSModelObject.getUIActionMode(), realPSModelObject, "getUIActionMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "uiactionparams", realPSModelObject.getUIActionParamJO(), realPSModelObject, "getUIActionParamJO");
		this.setDomainValue(iPSModelTranspileContext, domain, "codename", realPSModelObject.getUIActionTag(), realPSModelObject, "getUIActionTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "vlexecmode", realPSModelObject.getUILogicAttachMode(), realPSModelObject, "getUILogicAttachMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewlogictype", realPSModelObject.getUILogicType(), realPSModelObject, "getUILogicType");
		this.setDomainValue(iPSModelTranspileContext, domain, "dataitem", realPSModelObject.getValueItem(), realPSModelObject, "getValueItem");
		this.setDomainValue(iPSModelTranspileContext, domain, "closeeditview", realPSModelObject.isCloseEditView(), realPSModelObject, "isCloseEditView");
		this.setDomainValue(iPSModelTranspileContext, domain, "closeeditview", realPSModelObject.isClosePopupView(), realPSModelObject, "isClosePopupView");
		this.setDomainValue(iPSModelTranspileContext, domain, "userconfirm", realPSModelObject.isEnableConfirm(), realPSModelObject, "isEnableConfirm");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablertmodel", realPSModelObject.isEnableRuntimeModel(), realPSModelObject, "isEnableRuntimeModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "globalflag", realPSModelObject.isGlobalUIAction(), realPSModelObject, "isGlobalUIAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "reloaddata", realPSModelObject.isReloadData(), realPSModelObject, "isReloadData");
		this.setDomainValue(iPSModelTranspileContext, domain, "busyindicator", realPSModelObject.isShowBusyIndicator(), realPSModelObject, "isShowBusyIndicator");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONLEVEL, domain, "actionlevel", int.class, new String[]{"100"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONTARGET, domain, "actiontarget", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPPNOPRIVDISPLAYMODE, domain, "noprivdm", int.class, new String[]{"2"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONSTYLE, domain, "buttonstyle", java.lang.String.class, new String[]{"100"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCMPSLANGUAGERES, domain, "cmpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONFIRMMSG, domain, "confirminfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERID, domain, "counterid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAACCESSACTION, domain, "psdeopprivid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDIALOGRESULT, domain, "closeeditview", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFRONTPSAPPVIEW, domain, "psdeviewbaseid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFRONTPROCESSTYPE, domain, "frontprotype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHTMLPAGEURL, domain, "htmlpageurl", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNEXTPSUIACTION, domain, "nextpsdeuiactionid", net.ibizsys.model.view.IPSUIAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPCOUNTER, domain, "pssyscounterid", net.ibizsys.model.app.control.IPSAppCounter.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEACMODE, domain, "psdeacmodeid", net.ibizsys.model.app.dataentity.IPSAppDEACMode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATAEXPORT, domain, "no2psdedataexpid", net.ibizsys.model.app.dataentity.IPSAppDEDataExport.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATAIMPORT, domain, "psdedataimpid", net.ibizsys.model.app.dataentity.IPSAppDEDataImport.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEMETHOD, domain, "psdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEMethod.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEPRINT, domain, "psdeprintid", net.ibizsys.model.app.dataentity.IPSAppDEPrint.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEUILOGIC, domain, "psdeviewlogicid", net.ibizsys.model.app.dataentity.IPSAppDEUILogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPUILOGIC, domain, "pssysviewlogicid", net.ibizsys.model.app.logic.IPSAppUILogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEEDITFORM, domain, "psdeformid", net.ibizsys.model.control.form.IPSDEEditForm.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEOPPRIV, domain, "psdeopprivid", net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMITEM, domain, "paramitem", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "pssysuiactionid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFRESHMODE, domain, "reloaddata", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSMPSLANGUAGERES, domain, "smpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUCCESSMSG, domain, "successinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTITEM, domain, "textitem", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMEOUT, domain, "timeout", long.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIP, domain, "tooltipinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIPPSLANGUAGERES, domain, "tippslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUIACTIONMODE, domain, "uiactiontype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUIACTIONPARAMJO, domain, "uiactionparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUIACTIONTAG, domain, "codename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUILOGICATTACHMODE, domain, "vlexecmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUILOGICTYPE, domain, "viewlogictype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEITEM, domain, "dataitem", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCLOSEEDITVIEW, domain, "closeeditview", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCLOSEPOPUPVIEW, domain, "closeeditview", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECONFIRM, domain, "userconfirm", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLERUNTIMEMODEL, domain, "enablertmodel", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISGLOBALUIACTION, domain, "globalflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISRELOADDATA, domain, "reloaddata", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWBUSYINDICATOR, domain, "busyindicator", boolean.class, new String[]{"true"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}