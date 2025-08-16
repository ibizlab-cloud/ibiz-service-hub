package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormDetailImpl.*;



public class PSDEFormDetailTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormDetailImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormDetailImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormDetailImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "colalign", realPSModelObject.getColumnAlign(), realPSModelObject, "getColumnAlign");
		this.setDomainValue(iPSModelTranspileContext, domain, "counterid", realPSModelObject.getCounterId(), realPSModelObject, "getCounterId");
		this.setDomainValue(iPSModelTranspileContext, domain, "countermode", realPSModelObject.getCounterMode(), realPSModelObject, "getCounterMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "rawcssstyle", realPSModelObject.getCssStyle(), realPSModelObject, "getCssStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailstyle", realPSModelObject.getDetailStyle(), realPSModelObject, "getDetailStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtype", realPSModelObject.getDetailType(), realPSModelObject, "getDetailType");
		this.setDomainValue(iPSModelTranspileContext, domain, "dynaclass", realPSModelObject.getDynaClass(), realPSModelObject, "getDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "height", realPSModelObject.getHeight(), realPSModelObject, "getHeight", new String[]{"0.0"});
		this.setDomainValue(iPSModelTranspileContext, domain, "labelrawcssstyle", realPSModelObject.getLabelCssStyle(), realPSModelObject, "getLabelCssStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "labeldynaclass", realPSModelObject.getLabelDynaClass(), realPSModelObject, "getLabelDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "labelpssyscssid", realPSModelObject.getLabelPSSysCss(), realPSModelObject, "getLabelPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "modelstate", realPSModelObject.getModelState(), realPSModelObject, "getModelState");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscounterid", realPSModelObject.getPSAppCounterRef(), realPSModelObject, "getPSAppCounterRef");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscssid", realPSModelObject.getPSSysCss(), realPSModelObject, "getPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "showmoremode", realPSModelObject.getShowMoreMode(), realPSModelObject, "getShowMoreMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "width", realPSModelObject.getWidth(), realPSModelObject, "getWidth", new String[]{"0.0"});
		this.setDomainValue(iPSModelTranspileContext, domain, "showcaption", realPSModelObject.isShowCaption(), realPSModelObject, "isShowCaption");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLUMNALIGN, domain, "colalign", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERID, domain, "counterid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERMODE, domain, "countermode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCSSSTYLE, domain, "rawcssstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILSTYLE, domain, "detailstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILTYPE, domain, "detailtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNACLASS, domain, "dynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEIGHT, domain, "height", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLABELCSSSTYLE, domain, "labelrawcssstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLABELDYNACLASS, domain, "labeldynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLABELPSSYSCSS, domain, "labelpssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODELSTATE, domain, "modelstate", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPCOUNTERREF, domain, "pssyscounterid", net.ibizsys.model.app.control.IPSAppCounterRef.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCSS, domain, "pssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSHOWMOREMODE, domain, "showmoremode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTH, domain, "width", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWCAPTION, domain, "showcaption", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}