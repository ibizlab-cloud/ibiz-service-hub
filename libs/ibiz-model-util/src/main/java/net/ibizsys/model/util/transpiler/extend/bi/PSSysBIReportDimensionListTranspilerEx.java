package net.ibizsys.model.util.transpiler.extend.bi;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.bi.IPSSysBIReportDimension;
import net.ibizsys.model.bi.PSSysBIReportItemImpl;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSSysBIReportItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSSysBIReportDimensionListTranspilerEx extends net.ibizsys.model.util.transpiler.bi.PSSysBIReportDimensionListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);

		IPSSysBIReportDimension iPSSysBIReportDimension = (IPSSysBIReportDimension) iPSModelObject;
		PSSysBIReportItem psSysBIReportItem = (PSSysBIReportItem) domain;		
		
		if(iPSSysBIReportDimension.getItemParams() != null) {
			psSysBIReportItem.setBIRepItemParams(iPSSysBIReportDimension.getItemParams().toString());
		}
	}

	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSSysBIReportItem psSysBIReportItem = (PSSysBIReportItem) domain;	
		if(StringUtils.hasLength(psSysBIReportItem.getBIRepItemParams())) {
			objectNode.put(PSSysBIReportItemImpl.ATTR_GETITEMPARAMS, JsonUtils.toObjectNode(psSysBIReportItem.getBIRepItemParams()));
		}
	}
	
}

