package net.ibizsys.model.util.transpiler.dataentity.uiaction;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupDetailImpl.*;



public class PSDEUIActionGroupDetailTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupDetailImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupDetailImpl realPSModelObject = (net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupDetailImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "actionlevel", realPSModelObject.getActionLevel(), realPSModelObject, "getActionLevel");
		this.setDomainValue(iPSModelTranspileContext, domain, "aftercontent", realPSModelObject.getAfterContent(), realPSModelObject, "getAfterContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "afteritemtype", realPSModelObject.getAfterItemType(), realPSModelObject, "getAfterItemType");
		this.setDomainValue(iPSModelTranspileContext, domain, "afterpssyscssid", realPSModelObject.getAfterPSSysCss(), realPSModelObject, "getAfterPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "beforecontent", realPSModelObject.getBeforeContent(), realPSModelObject, "getBeforeContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "beforeitemtype", realPSModelObject.getBeforeItemType(), realPSModelObject, "getBeforeItemType");
		this.setDomainValue(iPSModelTranspileContext, domain, "beforepssyscssid", realPSModelObject.getBeforePSSysCss(), realPSModelObject, "getBeforePSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "buttonstyle", realPSModelObject.getButtonStyle(), realPSModelObject, "getButtonStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtag", realPSModelObject.getDetailTag(), realPSModelObject, "getDetailTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtag2", realPSModelObject.getDetailTag2(), realPSModelObject, "getDetailTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtype", realPSModelObject.getDetailType(), realPSModelObject, "getDetailType");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablelogic", realPSModelObject.getEnableScriptCode(), realPSModelObject, "getEnableScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscssid", realPSModelObject.getPSSysCss(), realPSModelObject, "getPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuiactionid", realPSModelObject.getPSUIAction(), realPSModelObject, "getPSUIAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "uiactionparams", realPSModelObject.getUIActionParamJO(), realPSModelObject, "getUIActionParamJO");
		this.setDomainValue(iPSModelTranspileContext, domain, "visiblelogic", realPSModelObject.getVisibleScriptCode(), realPSModelObject, "getVisibleScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "addseparator", realPSModelObject.isAddSeparator(), realPSModelObject, "isAddSeparator");
		this.setDomainValue(iPSModelTranspileContext, domain, "showmode", realPSModelObject.isShowCaption(), realPSModelObject, "isShowCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "showmode", realPSModelObject.isShowIcon(), realPSModelObject, "isShowIcon");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONLEVEL, domain, "actionlevel", int.class, new String[]{"100"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAFTERCONTENT, domain, "aftercontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAFTERITEMTYPE, domain, "afteritemtype", java.lang.String.class, new String[]{"NONE"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAFTERPSSYSCSS, domain, "afterpssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBEFORECONTENT, domain, "beforecontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBEFOREITEMTYPE, domain, "beforeitemtype", java.lang.String.class, new String[]{"NONE"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBEFOREPSSYSCSS, domain, "beforepssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONSTYLE, domain, "buttonstyle", java.lang.String.class, new String[]{"100"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILTAG, domain, "detailtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILTAG2, domain, "detailtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILTYPE, domain, "detailtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLESCRIPTCODE, domain, "enablelogic", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCSS, domain, "pssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSUIACTION, domain, "psdeuiactionid", net.ibizsys.model.view.IPSUIAction.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUIACTIONPARAMJO, domain, "uiactionparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVISIBLESCRIPTCODE, domain, "visiblelogic", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISADDSEPARATOR, domain, "addseparator", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWCAPTION, domain, "showmode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWICON, domain, "showmode", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}