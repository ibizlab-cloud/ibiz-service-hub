package net.ibizsys.model.util.transpiler.extend.app.bi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.PSModelEnums.BIReportItemType;
import net.ibizsys.model.app.bi.IPSAppBIReportDimension;
import net.ibizsys.model.app.bi.IPSAppBIReportMeasure;
import net.ibizsys.model.app.bi.PSAppBIReportImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSSysBIReport;
import net.ibizsys.psmodel.core.domain.PSSysBIReportItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppBIReportListTranspilerEx extends net.ibizsys.model.util.transpiler.app.bi.PSAppBIReportListTranspiler{
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		
		PSSysBIReport psSysBIReport = (PSSysBIReport) domain;
		
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		objectNode.remove(PSAppBIReportImpl.ATTR_GETPSAPPBICUBE);
		if(StringUtils.hasLength(psSysBIReport.getPSSysBICubeId())) {
			ObjectNode refNode = objectNode.putObject(PSAppBIReportImpl.ATTR_GETPSAPPBICUBE);
			refNode.put("modelref", true);
			refNode.put("id", PSModelUtils.getSimpleId(psSysBIReport.getPSSysBICubeId()));
		}

		
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
				ArrayNode arrayNode = objectNode.putArray(PSAppBIReportImpl.ATTR_GETPSAPPBIREPORTDIMENSIONS);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSAppBIReportDimension.class, false).compile(iPSModelTranspileContext, psSysBIReportDimensionList, arrayNode);
			}
			
			if(!ObjectUtils.isEmpty(psSysBIReportMeasureList)) {
				ArrayNode arrayNode = objectNode.putArray(PSAppBIReportImpl.ATTR_GETPSAPPBIREPORTMEASURES);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSAppBIReportMeasure.class, false).compile(iPSModelTranspileContext, psSysBIReportMeasureList, arrayNode);
			}
		}
	}
	
}