package net.ibizsys.model.util.transpiler.app.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.bi.PSAppBIReportDimensionImpl.*;



public class PSAppBIReportDimensionTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.bi.PSAppBIReportDimensionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.bi.PSAppBIReportDimensionImpl realPSModelObject = (net.ibizsys.model.app.bi.PSAppBIReportDimensionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "birepitemtag", realPSModelObject.getItemTag(), realPSModelObject, "getItemTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "birepitemtag2", realPSModelObject.getItemTag2(), realPSModelObject, "getItemTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbicubedimensionid", realPSModelObject.getPSAppBICubeDimension(), realPSModelObject, "getPSAppBICubeDimension");
		this.setDomainValue(iPSModelTranspileContext, domain, "placetype", realPSModelObject.getPlaceType(), realPSModelObject, "getPlaceType");
		this.setDomainValue(iPSModelTranspileContext, domain, "placement", realPSModelObject.getPlacement(), realPSModelObject, "getPlacement");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTAG, domain, "birepitemtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTAG2, domain, "birepitemtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPBICUBEDIMENSION, domain, "pssysbicubedimensionid", net.ibizsys.model.app.bi.IPSAppBICubeDimension.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLACETYPE, domain, "placetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLACEMENT, domain, "placement", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}