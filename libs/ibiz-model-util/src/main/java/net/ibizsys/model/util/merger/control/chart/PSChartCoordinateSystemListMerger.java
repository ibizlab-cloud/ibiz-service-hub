package net.ibizsys.model.util.merger.control.chart;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSChartCoordinateSystemListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.control.chart.IPSChartCoordinateSystem.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.control.chart.IPSChartCoordinateSystem.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.chart.IPSChartCoordinateSystem.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.control.chart.IPSChartCoordinateSystem.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("type");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "CALENDAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemCalendarImpl.class, false);
			case "MAP":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemGeoImpl.class, false);
			case "NONE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemNoneImpl.class, false);
			case "PARALLEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemParallelImpl.class, false);
			case "POLAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemPolarImpl.class, false);
			case "RADAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemRadarImpl.class, false);
			case "SINGLE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemSingleImpl.class, false);
			case "XY":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemCartesian2DImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
}