package net.ibizsys.model.util.transpiler.app.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.bi.PSAppBICubeDimensionImpl.*;



public class PSAppBICubeDimensionTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.bi.PSAppBICubeDimensionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.bi.PSAppBICubeDimensionImpl realPSModelObject = (net.ibizsys.model.app.bi.PSAppBICubeDimensionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dimensionformula", realPSModelObject.getDimensionFormula(), realPSModelObject, "getDimensionFormula");
		this.setDomainValue(iPSModelTranspileContext, domain, "bidimensiontype", realPSModelObject.getDimensionType(), realPSModelObject, "getDimensionType");
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodelistid", realPSModelObject.getPSAppCodeList(), realPSModelObject, "getPSAppCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSAppDEField(), realPSModelObject, "getPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "parampsdeuiactionid", realPSModelObject.getParamPSAppDEUIAction(), realPSModelObject, "getParamPSAppDEUIAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "stddatatype", realPSModelObject.getStdDataType(), realPSModelObject, "getStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "textpsdefid", realPSModelObject.getTextPSAppDEField(), realPSModelObject, "getTextPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "texttemplate", realPSModelObject.getTextTemplate(), realPSModelObject, "getTextTemplate");
		this.setDomainValue(iPSModelTranspileContext, domain, "tiptemplate", realPSModelObject.getTipTemplate(), realPSModelObject, "getTipTemplate");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDIMENSIONFORMULA, domain, "dimensionformula", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDIMENSIONTYPE, domain, "bidimensiontype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPCODELIST, domain, "pscodelistid", net.ibizsys.model.app.codelist.IPSAppCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEFIELD, domain, "psdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMPSAPPDEUIACTION, domain, "parampsdeuiactionid", net.ibizsys.model.app.dataentity.IPSAppDEUIAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTDDATATYPE, domain, "stddatatype", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTPSAPPDEFIELD, domain, "textpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTTEMPLATE, domain, "texttemplate", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIPTEMPLATE, domain, "tiptemplate", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}