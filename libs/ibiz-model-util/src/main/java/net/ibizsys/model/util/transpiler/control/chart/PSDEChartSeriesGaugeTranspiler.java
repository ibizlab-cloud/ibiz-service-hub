package net.ibizsys.model.util.transpiler.control.chart;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.chart.PSDEChartSeriesGaugeImpl.*;



public class PSDEChartSeriesGaugeTranspiler extends net.ibizsys.model.util.transpiler.control.chart.PSDEChartSeriesCSNoneTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.chart.PSDEChartSeriesGaugeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.chart.PSDEChartSeriesGaugeImpl realPSModelObject = (net.ibizsys.model.control.chart.PSDEChartSeriesGaugeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "endangle", realPSModelObject.getEndAngle(), realPSModelObject, "getEndAngle");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxvalue", realPSModelObject.getMaxValue(), realPSModelObject, "getMaxValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "minvalue", realPSModelObject.getMinValue(), realPSModelObject, "getMinValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "radius", realPSModelObject.getRadius(), realPSModelObject, "getRadius");
		this.setDomainValue(iPSModelTranspileContext, domain, "splitnumber", realPSModelObject.getSplitNumber(), realPSModelObject, "getSplitNumber");
		this.setDomainValue(iPSModelTranspileContext, domain, "startangle", realPSModelObject.getStartAngle(), realPSModelObject, "getStartAngle");
		this.setDomainValue(iPSModelTranspileContext, domain, "clockwise", realPSModelObject.isClockwise(), realPSModelObject, "isClockwise");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENDANGLE, domain, "endangle", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXVALUE, domain, "maxvalue", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINVALUE, domain, "minvalue", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRADIUS, domain, "radius", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSPLITNUMBER, domain, "splitnumber", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTARTANGLE, domain, "startangle", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCLOCKWISE, domain, "clockwise", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}