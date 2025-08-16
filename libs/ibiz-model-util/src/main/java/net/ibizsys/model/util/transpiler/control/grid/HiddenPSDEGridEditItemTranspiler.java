package net.ibizsys.model.util.transpiler.control.grid;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.grid.HiddenPSDEGridEditItemImpl.*;



public class HiddenPSDEGridEditItemTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.grid.HiddenPSDEGridEditItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.grid.HiddenPSDEGridEditItemImpl realPSModelObject = (net.ibizsys.model.control.grid.HiddenPSDEGridEditItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "createdv", realPSModelObject.getCreateDV(), realPSModelObject, "getCreateDV");
		this.setDomainValue(iPSModelTranspileContext, domain, "createdvt", realPSModelObject.getCreateDVT(), realPSModelObject, "getCreateDVT");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecond", realPSModelObject.getEnableCond(), realPSModelObject, "getEnableCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "ignoreinput", realPSModelObject.getIgnoreInput(), realPSModelObject, "getIgnoreInput");
		this.setDomainValue(iPSModelTranspileContext, domain, "codelistconfigmode", realPSModelObject.getOutputCodeListConfigMode(), realPSModelObject, "getOutputCodeListConfigMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSAppDEField(), realPSModelObject, "getPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdegeiupdateid", realPSModelObject.getPSDEGridEditItemUpdate(), realPSModelObject, "getPSDEGridEditItemUpdate");
		this.setDomainValue(iPSModelTranspileContext, domain, "resetitemname", realPSModelObject.getResetItemName(), realPSModelObject, "getResetItemName");
		this.setDomainListValue(iPSModelTranspileContext, domain, "resetitemname", realPSModelObject.getResetItemNames(), realPSModelObject, "getResetItemNames", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "updatedv", realPSModelObject.getUpdateDV(), realPSModelObject, "getUpdateDV");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatedvt", realPSModelObject.getUpdateDVT(), realPSModelObject, "getUpdateDVT");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueitemname", realPSModelObject.getValueItemName(), realPSModelObject, "getValueItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "allowempty", realPSModelObject.isAllowEmpty(), realPSModelObject, "isAllowEmpty");
		this.setDomainValue(iPSModelTranspileContext, domain, "needcodelistconfig", realPSModelObject.isNeedCodeListConfig(), realPSModelObject, "isNeedCodeListConfig");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATEDV, domain, "createdv", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATEDVT, domain, "createdvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLECOND, domain, "enablecond", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIGNOREINPUT, domain, "ignoreinput", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTPUTCODELISTCONFIGMODE, domain, "codelistconfigmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEFIELD, domain, "psdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEGRIDEDITITEMUPDATE, domain, "psdegeiupdateid", net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRESETITEMNAME, domain, "resetitemname", java.lang.String.class);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETRESETITEMNAMES, domain, "resetitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEDV, domain, "updatedv", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEDVT, domain, "updatedvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEITEMNAME, domain, "valueitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLOWEMPTY, domain, "allowempty", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNEEDCODELISTCONFIG, domain, "needcodelistconfig", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}