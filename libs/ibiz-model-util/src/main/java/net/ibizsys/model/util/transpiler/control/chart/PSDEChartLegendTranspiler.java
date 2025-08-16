package net.ibizsys.model.util.transpiler.control.chart;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.chart.PSDEChartLegendImpl.*;



public class PSDEChartLegendTranspiler extends net.ibizsys.model.util.transpiler.control.chart.PSDEChartObjectTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.chart.PSDEChartLegendImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.chart.PSDEChartLegendImpl realPSModelObject = (net.ibizsys.model.control.chart.PSDEChartLegendImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "legendpos", realPSModelObject.getLegendPos(), realPSModelObject, "getLegendPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "showlegend", realPSModelObject.isShowLegend(), realPSModelObject, "isShowLegend");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLEGENDPOS, domain, "legendpos", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWLEGEND, domain, "showlegend", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}