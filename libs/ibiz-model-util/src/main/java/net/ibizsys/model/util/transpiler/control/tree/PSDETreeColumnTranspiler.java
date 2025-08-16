package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.tree.PSDETreeColumnImpl.*;



public class PSDETreeColumnTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.tree.PSDETreeColumnImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.tree.PSDETreeColumnImpl realPSModelObject = (net.ibizsys.model.control.tree.PSDETreeColumnImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "align", realPSModelObject.getAlign(), realPSModelObject, "getAlign");
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "cellpssyscssid", realPSModelObject.getCellPSSysCss(), realPSModelObject, "getCellPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "gridcolstyle", realPSModelObject.getColumnStyle(), realPSModelObject, "getColumnStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "gridcoltype", realPSModelObject.getColumnType(), realPSModelObject, "getColumnType");
		this.setDomainValue(iPSModelTranspileContext, domain, "headerpssyscssid", realPSModelObject.getHeaderPSSysCss(), realPSModelObject, "getHeaderPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "hidedefault", realPSModelObject.getHideMode(), realPSModelObject, "getHideMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "width", realPSModelObject.getWidth(), realPSModelObject, "getWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "widthunit", realPSModelObject.getWidthUnit(), realPSModelObject, "getWidthUnit");
		this.setDomainValue(iPSModelTranspileContext, domain, "nosort", realPSModelObject.isEnableSort(), realPSModelObject, "isEnableSort");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETALIGN, domain, "align", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCELLPSSYSCSS, domain, "cellpssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLUMNSTYLE, domain, "gridcolstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLUMNTYPE, domain, "gridcoltype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEADERPSSYSCSS, domain, "headerpssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHIDEMODE, domain, "hidedefault", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTH, domain, "width", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTHUNIT, domain, "widthunit", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLESORT, domain, "nosort", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}