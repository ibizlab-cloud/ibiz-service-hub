package net.ibizsys.model.util.transpiler.control.chart;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.chart.PSDEChartAxesImpl.*;



public class PSDEChartAxesTranspiler extends net.ibizsys.model.util.transpiler.control.chart.PSChartAxesTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.chart.PSDEChartAxesImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.chart.PSDEChartAxesImpl realPSModelObject = (net.ibizsys.model.control.chart.PSDEChartAxesImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "axespos", realPSModelObject.getAxesPos(), realPSModelObject, "getAxesPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "axestype", realPSModelObject.getAxesType(), realPSModelObject, "getAxesType");
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "coordinatesystemid", realPSModelObject.getCoordinateSystemIndex(), realPSModelObject, "getCoordinateSystemIndex");
		this.setDomainValue(iPSModelTranspileContext, domain, "datashowmode", realPSModelObject.getDataShowMode(), realPSModelObject, "getDataShowMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "axesmaxvalue", realPSModelObject.getMaxValue(), realPSModelObject, "getMaxValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "axesminvalue", realPSModelObject.getMinValue(), realPSModelObject, "getMinValue");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAXESPOS, domain, "axespos", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAXESTYPE, domain, "axestype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOORDINATESYSTEMINDEX, domain, "coordinatesystemid", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATASHOWMODE, domain, "datashowmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXVALUE, domain, "axesmaxvalue", java.lang.Double.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINVALUE, domain, "axesminvalue", java.lang.Double.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}