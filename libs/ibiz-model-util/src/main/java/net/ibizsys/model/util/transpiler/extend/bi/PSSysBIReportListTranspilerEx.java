package net.ibizsys.model.util.transpiler.extend.bi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.BIReportItemType;
import net.ibizsys.model.bi.IPSSysBIReport;
import net.ibizsys.model.bi.IPSSysBIReportDimension;
import net.ibizsys.model.bi.IPSSysBIReportMeasure;
import net.ibizsys.model.bi.PSSysBIReportImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSSysBIReport;
import net.ibizsys.psmodel.core.domain.PSSysBIReportItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSSysBIReportListTranspilerEx extends net.ibizsys.model.util.transpiler.bi.PSSysBIReportListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);

		IPSSysBIReport iPSSysBIReport = (IPSSysBIReport) iPSModelObject;
		PSSysBIReport psSysBIReport = (PSSysBIReport) domain;
	

		if (bFullMode) {
			if (iPSSysBIReport.getAllPSSysBIReportDimensions() != null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSSysBIReportDimension.class, false).decompile(iPSModelTranspileContext, iPSSysBIReport.getAllPSSysBIReportDimensions(), psSysBIReport.getPSSysBIReportItemsIf(), bFullMode);
				
			}
			
			if (iPSSysBIReport.getAllPSSysBIReportMeasures() != null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSSysBIReportMeasure.class, false).decompile(iPSModelTranspileContext, iPSSysBIReport.getAllPSSysBIReportMeasures(), psSysBIReport.getPSSysBIReportItemsIf(), bFullMode);
			}
			
			int nOrder = 100;
			
			for (PSSysBIReportItem child : psSysBIReport.getPSSysBIReportItemsIf()) {
				child.setPSSysBIReportId(psSysBIReport.getId());
				child.setPSSysBIReportName(psSysBIReport.getName());
				child.setOrderValue(nOrder);
				nOrder += 100;
			}
		}
	}

	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		
		PSSysBIReport psSysBIReport = (PSSysBIReport) domain;

		
		super.onCompile(iPSModelTranspileContext, domain, objectNode);

		

		if (!ObjectUtils.isEmpty(psSysBIReport.getPSSysBIReportItems())) {
			
			List<PSSysBIReportItem> psSysBIReportDimensionList = new ArrayList<PSSysBIReportItem>();
			List<PSSysBIReportItem> psSysBIReportMeasureList = new ArrayList<PSSysBIReportItem>();
			
			for(PSSysBIReportItem psSysBIReportItem : psSysBIReport.getPSSysBIReportItems()) {
				if(BIReportItemType.DIMENSION.value.equalsIgnoreCase(psSysBIReportItem.getBIRepItemType())) {
					psSysBIReportDimensionList.add(psSysBIReportItem);
					continue;
				}
				
				if(BIReportItemType.MEASURE.value.equalsIgnoreCase(psSysBIReportItem.getBIRepItemType())) {
					psSysBIReportMeasureList.add(psSysBIReportItem);
					continue;
				}
			}
			
			if(!ObjectUtils.isEmpty(psSysBIReportDimensionList)) {
				ArrayNode arrayNode = objectNode.putArray(PSSysBIReportImpl.ATTR_GETALLPSSYSBIREPORTDIMENSIONS);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSSysBIReportDimension.class, false).compile(iPSModelTranspileContext, psSysBIReportDimensionList, arrayNode);
			}
			
			if(!ObjectUtils.isEmpty(psSysBIReportMeasureList)) {
				ArrayNode arrayNode = objectNode.putArray(PSSysBIReportImpl.ATTR_GETALLPSSYSBIREPORTMEASURES);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSSysBIReportMeasure.class, false).compile(iPSModelTranspileContext, psSysBIReportMeasureList, arrayNode);
			}
			
		
		}

	}
	
}
