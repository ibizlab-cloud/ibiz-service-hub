package net.ibizsys.model.util.merger.control.chart;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSDEChartSeriesListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.control.chart.IPSDEChartSeries.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.control.chart.IPSDEChartSeries.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.chart.IPSDEChartSeries.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.control.chart.IPSDEChartSeries.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("seriesType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "area":
			case "line":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartSeriesLineImpl.class, false);
			case "bar":
			case "bar3d":
			case "column":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartSeriesBarImpl.class, false);
			case "candlestick":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartSeriesCandlestickImpl.class, false);
			case "custom":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartSeriesCustomImpl.class, false);
			case "funnel":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartSeriesFunnelImpl.class, false);
			case "gauge":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartSeriesGaugeImpl.class, false);
			case "map":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartSeriesMapImpl.class, false);
			case "pie":
			case "pie3d":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartSeriesPieImpl.class, false);
			case "radar":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartSeriesRadarImpl.class, false);
			case "scatter":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartSeriesScatterImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
}