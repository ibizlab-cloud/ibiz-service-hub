package net.ibizsys.model.util.transpiler.control.chart;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSChartCoordinateSystemListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "CALENDAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemCalendarImpl.class, false);
			case "MAP":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemGeoImpl.class, false);
			case "NONE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemNoneImpl.class, false);
			case "PARALLEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemParallelImpl.class, false);
			case "POLAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemPolarImpl.class, false);
			case "RADAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemRadarImpl.class, false);
			case "SINGLE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemSingleImpl.class, false);
			case "XY":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartCoordinateSystemCartesian2DImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.chart.IPSChartCoordinateSystem iPSChartCoordinateSystem = (net.ibizsys.model.control.chart.IPSChartCoordinateSystem)iPSModelObject;
		Object type = iPSChartCoordinateSystem.getType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("type");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}