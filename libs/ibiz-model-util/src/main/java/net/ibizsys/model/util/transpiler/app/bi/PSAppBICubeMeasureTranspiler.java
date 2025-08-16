package net.ibizsys.model.util.transpiler.app.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.bi.PSAppBICubeMeasureImpl.*;



public class PSAppBICubeMeasureTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.bi.PSAppBICubeMeasureImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.bi.PSAppBICubeMeasureImpl realPSModelObject = (net.ibizsys.model.app.bi.PSAppBICubeMeasureImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "drilldetailpsdeviewid", realPSModelObject.getDrillDetailPSAppView(), realPSModelObject, "getDrillDetailPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "drilldownpsdeviewid", realPSModelObject.getDrillDownPSAppView(), realPSModelObject, "getDrillDownPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodelistid", realPSModelObject.getPSAppCodeList(), realPSModelObject, "getPSAppCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "parampsdeuiactionid", realPSModelObject.getParamPSAppDEUIAction(), realPSModelObject, "getParamPSAppDEUIAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "stddatatype", realPSModelObject.getStdDataType(), realPSModelObject, "getStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "texttemplate", realPSModelObject.getTextTemplate(), realPSModelObject, "getTextTemplate");
		this.setDomainValue(iPSModelTranspileContext, domain, "tiptemplate", realPSModelObject.getTipTemplate(), realPSModelObject, "getTipTemplate");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDRILLDETAILPSAPPVIEW, domain, "drilldetailpsdeviewid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDRILLDOWNPSAPPVIEW, domain, "drilldownpsdeviewid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPCODELIST, domain, "pscodelistid", net.ibizsys.model.app.codelist.IPSAppCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMPSAPPDEUIACTION, domain, "parampsdeuiactionid", net.ibizsys.model.app.dataentity.IPSAppDEUIAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTDDATATYPE, domain, "stddatatype", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTTEMPLATE, domain, "texttemplate", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIPTEMPLATE, domain, "tiptemplate", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}