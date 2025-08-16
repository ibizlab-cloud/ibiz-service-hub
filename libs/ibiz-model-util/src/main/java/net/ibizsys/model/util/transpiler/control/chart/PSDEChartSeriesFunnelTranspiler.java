package net.ibizsys.model.util.transpiler.control.chart;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.chart.PSDEChartSeriesFunnelImpl.*;



public class PSDEChartSeriesFunnelTranspiler extends net.ibizsys.model.util.transpiler.control.chart.PSDEChartSeriesCSNoneTranspilerBase2{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.chart.PSDEChartSeriesFunnelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.chart.PSDEChartSeriesFunnelImpl realPSModelObject = (net.ibizsys.model.control.chart.PSDEChartSeriesFunnelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "funnelalign", realPSModelObject.getFunnelAlign(), realPSModelObject, "getFunnelAlign");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxsize", realPSModelObject.getMaxSize(), realPSModelObject, "getMaxSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxvalue", realPSModelObject.getMaxValue(), realPSModelObject, "getMaxValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "minsize", realPSModelObject.getMinSize(), realPSModelObject, "getMinSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "minvalue", realPSModelObject.getMinValue(), realPSModelObject, "getMinValue");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFUNNELALIGN, domain, "funnelalign", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXSIZE, domain, "maxsize", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXVALUE, domain, "maxvalue", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINSIZE, domain, "minsize", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINVALUE, domain, "minvalue", java.lang.Integer.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}