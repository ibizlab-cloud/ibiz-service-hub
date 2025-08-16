package net.ibizsys.model.util.transpiler.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.bi.PSSysBIReportMeasureImpl.*;



public class PSSysBIReportMeasureTranspiler extends net.ibizsys.model.util.transpiler.bi.PSSysBIReportItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.bi.PSSysBIReportMeasureImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.bi.PSSysBIReportMeasureImpl realPSModelObject = (net.ibizsys.model.bi.PSSysBIReportMeasureImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aggtype", realPSModelObject.getAggMode(), realPSModelObject, "getAggMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbicubemeasureid", realPSModelObject.getPSSysBICubeMeasure(), realPSModelObject, "getPSSysBICubeMeasure");
		this.setDomainValue(iPSModelTranspileContext, domain, "placetype", realPSModelObject.getPlaceType(), realPSModelObject, "getPlaceType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGGMODE, domain, "aggtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBICUBEMEASURE, domain, "pssysbicubemeasureid", net.ibizsys.model.bi.IPSSysBICubeMeasure.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLACETYPE, domain, "placetype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}