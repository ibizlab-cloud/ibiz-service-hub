package net.ibizsys.model.util.transpiler.codelist;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.codelist.PSCodeItemImpl.*;



public class PSCodeItemTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.codelist.PSCodeItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.codelist.PSCodeItemImpl realPSModelObject = (net.ibizsys.model.codelist.PSCodeItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "bkcolor", realPSModelObject.getBKColor(), realPSModelObject, "getBKColor");
		this.setDomainValue(iPSModelTranspileContext, domain, "color", realPSModelObject.getColor(), realPSModelObject, "getColor");
		this.setDomainValue(iPSModelTranspileContext, domain, "data", realPSModelObject.getData(), realPSModelObject, "getData");
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodeitemname", realPSModelObject.getText(), realPSModelObject, "getText");
		this.setDomainValue(iPSModelTranspileContext, domain, "tooltipinfo", realPSModelObject.getTooltip(), realPSModelObject, "getTooltip");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata", realPSModelObject.getUserData(), realPSModelObject, "getUserData");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata2", realPSModelObject.getUserData2(), realPSModelObject, "getUserData2");
		this.setDomainValue(iPSModelTranspileContext, domain, "codeitemvalue", realPSModelObject.getValue(), realPSModelObject, "getValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflag", realPSModelObject.isDefault(), realPSModelObject, "isDefault");
		this.setDomainValue(iPSModelTranspileContext, domain, "disableselect", realPSModelObject.isDisableSelect(), realPSModelObject, "isDisableSelect");
		this.setDomainValue(iPSModelTranspileContext, domain, "showasempty", realPSModelObject.isShowAsEmtpy(), realPSModelObject, "isShowAsEmtpy");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBKCOLOR, domain, "bkcolor", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLOR, domain, "color", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATA, domain, "data", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXT, domain, "pscodeitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIP, domain, "tooltipinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA, domain, "userdata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA2, domain, "userdata2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUE, domain, "codeitemvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULT, domain, "defaultflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDISABLESELECT, domain, "disableselect", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWASEMTPY, domain, "showasempty", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}