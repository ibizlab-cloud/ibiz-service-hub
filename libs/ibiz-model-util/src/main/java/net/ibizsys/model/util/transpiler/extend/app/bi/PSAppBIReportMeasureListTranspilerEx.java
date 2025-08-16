package net.ibizsys.model.util.transpiler.extend.app.bi;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.app.bi.PSAppBIReportMeasureImpl;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSSysBIReportItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppBIReportMeasureListTranspilerEx extends net.ibizsys.model.util.transpiler.app.bi.PSAppBIReportMeasureListTranspiler{
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode)
			throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSSysBIReportItem psSysBIReportItem = (PSSysBIReportItem)domain;
		if(StringUtils.hasLength(psSysBIReportItem.getPSSysBICubeMeasureId())) {
			objectNode.put(PSAppBIReportMeasureImpl.ATTR_GETMEASURETAG, getSimpleId(psSysBIReportItem.getPSSysBICubeMeasureId()));
		}

		if(StringUtils.hasLength(psSysBIReportItem.getBIRepItemParams())) {
			objectNode.put(PSAppBIReportMeasureImpl.ATTR_GETMEASUREPARAMS, JsonUtils.toObjectNode(psSysBIReportItem.getBIRepItemParams()));
		}		
	}
}