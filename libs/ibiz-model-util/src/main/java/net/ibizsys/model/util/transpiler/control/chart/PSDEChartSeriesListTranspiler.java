package net.ibizsys.model.util.transpiler.control.chart;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEChartSeriesListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDEChartParam createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDEChartParam();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "area":
			case "line":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartSeriesLineImpl.class, false);
			case "bar":
			case "bar3d":
			case "column":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartSeriesBarImpl.class, false);
			case "candlestick":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartSeriesCandlestickImpl.class, false);
			case "custom":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartSeriesCustomImpl.class, false);
			case "funnel":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartSeriesFunnelImpl.class, false);
			case "gauge":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartSeriesGaugeImpl.class, false);
			case "map":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartSeriesMapImpl.class, false);
			case "pie":
			case "pie3d":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartSeriesPieImpl.class, false);
			case "radar":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartSeriesRadarImpl.class, false);
			case "scatter":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartSeriesScatterImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.chart.IPSDEChartSeries iPSDEChartSeries = (net.ibizsys.model.control.chart.IPSDEChartSeries)iPSModelObject;
		Object type = iPSDEChartSeries.getSeriesType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("seriestype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}