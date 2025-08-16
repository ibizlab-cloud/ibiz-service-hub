package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormItemImpl.*;



public class PSDEFormItemTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormDetailTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormItemImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "leveltag", realPSModelObject.getCaptionItemName(), realPSModelObject, "getCaptionItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "createdv", realPSModelObject.getCreateDV(), realPSModelObject, "getCreateDV");
		this.setDomainValue(iPSModelTranspileContext, domain, "createdvt", realPSModelObject.getCreateDVT(), realPSModelObject, "getCreateDVT");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecond", realPSModelObject.getEnableCond(), realPSModelObject, "getEnableCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldname", realPSModelObject.getFieldName(), realPSModelObject, "getFieldName");
		this.setDomainValue(iPSModelTranspileContext, domain, "ignoreinput", realPSModelObject.getIgnoreInput(), realPSModelObject, "getIgnoreInput");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputtip", realPSModelObject.getInputTip(), realPSModelObject, "getInputTip");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputtiplanrestag", realPSModelObject.getInputTipLanResTag(), realPSModelObject, "getInputTipLanResTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputtipuniquetag", realPSModelObject.getInputTipUniqueTag(), realPSModelObject, "getInputTipUniqueTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputtipurl", realPSModelObject.getInputTipUrl(), realPSModelObject, "getInputTipUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "labeldynaclass", realPSModelObject.getLabelDynaClass(), realPSModelObject, "getLabelDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "labelpos", realPSModelObject.getLabelPos(), realPSModelObject, "getLabelPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "labelwidth", realPSModelObject.getLabelWidth(), realPSModelObject, "getLabelWidth", new String[]{"130","0"});
		this.setDomainValue(iPSModelTranspileContext, domain, "noprivdm", realPSModelObject.getNoPrivDisplayMode(), realPSModelObject, "getNoPrivDisplayMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "codelistconfigmode", realPSModelObject.getOutputCodeListConfigMode(), realPSModelObject, "getOutputCodeListConfigMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSAppDEField(), realPSModelObject, "getPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefiupdateid", realPSModelObject.getPSDEFormItemUpdate(), realPSModelObject, "getPSDEFormItemUpdate");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainListValue(iPSModelTranspileContext, domain, "resetitemname", realPSModelObject.getResetItemNames(), realPSModelObject, "getResetItemNames", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "updatedv", realPSModelObject.getUpdateDV(), realPSModelObject, "getUpdateDV");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatedvt", realPSModelObject.getUpdateDVT(), realPSModelObject, "getUpdateDVT");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueformat", realPSModelObject.getValueFormat(), realPSModelObject, "getValueFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueitemname", realPSModelObject.getValueItemName(), realPSModelObject, "getValueItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "allowempty", realPSModelObject.isAllowEmpty(), realPSModelObject, "isAllowEmpty");
		this.setDomainValue(iPSModelTranspileContext, domain, "convertcitext", realPSModelObject.isConvertToCodeItemText(), realPSModelObject, "isConvertToCodeItemText");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptycaption", realPSModelObject.isEmptyCaption(), realPSModelObject, "isEmptyCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableanchor", realPSModelObject.isEnableAnchor(), realPSModelObject, "isEnableAnchor");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableinputtip", realPSModelObject.isEnableInputTip(), realPSModelObject, "isEnableInputTip");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableitempriv", realPSModelObject.isEnableItemPriv(), realPSModelObject, "isEnableItemPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "inputtipclosable", realPSModelObject.isInputTipClosable(), realPSModelObject, "isInputTipClosable");
		this.setDomainValue(iPSModelTranspileContext, domain, "needcodelistconfig", realPSModelObject.isNeedCodeListConfig(), realPSModelObject, "isNeedCodeListConfig");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTIONITEMNAME, domain, "leveltag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATEDV, domain, "createdv", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATEDVT, domain, "createdvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLECOND, domain, "enablecond", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDNAME, domain, "fieldname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIGNOREINPUT, domain, "ignoreinput", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTTIP, domain, "inputtip", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTTIPLANRESTAG, domain, "inputtiplanrestag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTTIPUNIQUETAG, domain, "inputtipuniquetag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPUTTIPURL, domain, "inputtipurl", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLABELDYNACLASS, domain, "labeldynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLABELPOS, domain, "labelpos", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLABELWIDTH, domain, "labelwidth", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNOPRIVDISPLAYMODE, domain, "noprivdm", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTPUTCODELISTCONFIGMODE, domain, "codelistconfigmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEFIELD, domain, "psdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFORMITEMUPDATE, domain, "psdefiupdateid", net.ibizsys.model.control.form.IPSDEFormItemUpdate.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETRESETITEMNAMES, domain, "resetitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEDV, domain, "updatedv", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEDVT, domain, "updatedvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEFORMAT, domain, "valueformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEITEMNAME, domain, "valueitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLOWEMPTY, domain, "allowempty", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCONVERTTOCODEITEMTEXT, domain, "convertcitext", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISEMPTYCAPTION, domain, "emptycaption", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEANCHOR, domain, "enableanchor", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEINPUTTIP, domain, "enableinputtip", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEITEMPRIV, domain, "enableitempriv", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISINPUTTIPCLOSABLE, domain, "inputtipclosable", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNEEDCODELISTCONFIG, domain, "needcodelistconfig", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}