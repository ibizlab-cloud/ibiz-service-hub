package net.ibizsys.model.util.transpiler.extend.app.bi;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.app.bi.PSAppBIReportDimensionImpl;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSSysBIReportItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppBIReportDimensionListTranspilerEx extends net.ibizsys.model.util.transpiler.app.bi.PSAppBIReportDimensionListTranspiler{
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode)
			throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSSysBIReportItem psSysBIReportItem = (PSSysBIReportItem)domain;
		if(StringUtils.hasLength(psSysBIReportItem.getPSSysBICubeDimensionId())) {
			objectNode.put(PSAppBIReportDimensionImpl.ATTR_GETDIMENSIONTAG, getSimpleId(psSysBIReportItem.getPSSysBICubeDimensionId()));
		}

		if(StringUtils.hasLength(psSysBIReportItem.getBIRepItemParams())) {
			objectNode.put(PSAppBIReportDimensionImpl.ATTR_GETDIMENSIONPARAMS, JsonUtils.toObjectNode(psSysBIReportItem.getBIRepItemParams()));
		}		
	}
	
}