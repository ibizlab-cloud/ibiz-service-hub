package net.ibizsys.model.util.transpiler.control.chart;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.chart.PSDEChartSeriesCSNoneImplBase2.*;



public class PSDEChartSeriesCSNoneTranspilerBase2 extends net.ibizsys.model.util.transpiler.control.chart.PSDEChartSeriesCSNoneTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.chart.PSDEChartSeriesCSNoneImplBase2)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.chart.PSDEChartSeriesCSNoneImplBase2 realPSModelObject = (net.ibizsys.model.control.chart.PSDEChartSeriesCSNoneImplBase2)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "bottompos", realPSModelObject.getBottom(), realPSModelObject, "getBottom");
		this.setDomainValue(iPSModelTranspileContext, domain, "height", realPSModelObject.getHeight(), realPSModelObject, "getHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "leftpos", realPSModelObject.getLeft(), realPSModelObject, "getLeft");
		this.setDomainValue(iPSModelTranspileContext, domain, "rightpos", realPSModelObject.getRight(), realPSModelObject, "getRight");
		this.setDomainValue(iPSModelTranspileContext, domain, "toppos", realPSModelObject.getTop(), realPSModelObject, "getTop");
		this.setDomainValue(iPSModelTranspileContext, domain, "width", realPSModelObject.getWidth(), realPSModelObject, "getWidth");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBOTTOM, domain, "bottompos", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEIGHT, domain, "height", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLEFT, domain, "leftpos", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRIGHT, domain, "rightpos", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOP, domain, "toppos", java.lang.Object.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTH, domain, "width", java.lang.Object.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}