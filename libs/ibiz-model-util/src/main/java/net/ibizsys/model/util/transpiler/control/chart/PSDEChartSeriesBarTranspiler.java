package net.ibizsys.model.util.transpiler.control.chart;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.chart.PSDEChartSeriesBarImpl.*;



public class PSDEChartSeriesBarTranspiler extends net.ibizsys.model.util.transpiler.control.chart.PSDEChartSeriesTranspiler2{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.chart.PSDEChartSeriesBarImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.chart.PSDEChartSeriesBarImpl realPSModelObject = (net.ibizsys.model.control.chart.PSDEChartSeriesBarImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "barcategorygap", realPSModelObject.getBarCategoryGap(), realPSModelObject, "getBarCategoryGap");
		this.setDomainValue(iPSModelTranspileContext, domain, "bargap", realPSModelObject.getBarGap(), realPSModelObject, "getBarGap");
		this.setDomainValue(iPSModelTranspileContext, domain, "barmaxwidth", realPSModelObject.getBarMaxWidth(), realPSModelObject, "getBarMaxWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "barminheight", realPSModelObject.getBarMinHeight(), realPSModelObject, "getBarMinHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "barminwidth", realPSModelObject.getBarMinWidth(), realPSModelObject, "getBarMinWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "barwidth", realPSModelObject.getBarWidth(), realPSModelObject, "getBarWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "stack", realPSModelObject.isStack(), realPSModelObject, "isStack");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBARCATEGORYGAP, domain, "barcategorygap", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBARGAP, domain, "bargap", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBARMAXWIDTH, domain, "barmaxwidth", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBARMINHEIGHT, domain, "barminheight", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBARMINWIDTH, domain, "barminwidth", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBARWIDTH, domain, "barwidth", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSTACK, domain, "stack", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}