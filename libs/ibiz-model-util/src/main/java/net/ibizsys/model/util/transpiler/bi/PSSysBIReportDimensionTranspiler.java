package net.ibizsys.model.util.transpiler.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.bi.PSSysBIReportDimensionImpl.*;



public class PSSysBIReportDimensionTranspiler extends net.ibizsys.model.util.transpiler.bi.PSSysBIReportItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.bi.PSSysBIReportDimensionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.bi.PSSysBIReportDimensionImpl realPSModelObject = (net.ibizsys.model.bi.PSSysBIReportDimensionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbicubedimensionid", realPSModelObject.getPSSysBICubeDimension(), realPSModelObject, "getPSSysBICubeDimension");
		this.setDomainValue(iPSModelTranspileContext, domain, "placetype", realPSModelObject.getPlaceType(), realPSModelObject, "getPlaceType");
		this.setDomainValue(iPSModelTranspileContext, domain, "placement", realPSModelObject.getPlacement(), realPSModelObject, "getPlacement");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBICUBEDIMENSION, domain, "pssysbicubedimensionid", net.ibizsys.model.bi.IPSSysBICubeDimension.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLACETYPE, domain, "placetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLACEMENT, domain, "placement", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}