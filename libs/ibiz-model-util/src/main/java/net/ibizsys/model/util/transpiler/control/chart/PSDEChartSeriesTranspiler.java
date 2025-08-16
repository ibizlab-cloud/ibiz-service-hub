package net.ibizsys.model.util.transpiler.control.chart;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.chart.PSDEChartSeriesImpl.*;



public class PSDEChartSeriesTranspiler extends net.ibizsys.model.util.transpiler.control.chart.PSChartSeriesTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.chart.PSDEChartSeriesImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.chart.PSDEChartSeriesImpl realPSModelObject = (net.ibizsys.model.control.chart.PSDEChartSeriesImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "xfield", realPSModelObject.getCatalogField(), realPSModelObject, "getCatalogField");
		this.setDomainValue(iPSModelTranspileContext, domain, "xfpscodelistid", realPSModelObject.getCatalogPSCodeList(), realPSModelObject, "getCatalogPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "datafield", realPSModelObject.getDataField(), realPSModelObject, "getDataField");
		this.setDomainValue(iPSModelTranspileContext, domain, "extfield2", realPSModelObject.getExtValue2Field(), realPSModelObject, "getExtValue2Field");
		this.setDomainValue(iPSModelTranspileContext, domain, "extfield3", realPSModelObject.getExtValue3Field(), realPSModelObject, "getExtValue3Field");
		this.setDomainValue(iPSModelTranspileContext, domain, "extfield4", realPSModelObject.getExtValue4Field(), realPSModelObject, "getExtValue4Field");
		this.setDomainValue(iPSModelTranspileContext, domain, "extfield", realPSModelObject.getExtValueField(), realPSModelObject, "getExtValueField");
		this.setDomainValue(iPSModelTranspileContext, domain, "timegroup", realPSModelObject.getGroupMode(), realPSModelObject, "getGroupMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "zfield", realPSModelObject.getIdField(), realPSModelObject, "getIdField");
		this.setDomainValue(iPSModelTranspileContext, domain, "sampledata", realPSModelObject.getSampleData(), realPSModelObject, "getSampleData");
		this.setDomainValue(iPSModelTranspileContext, domain, "seriesfield", realPSModelObject.getSeriesField(), realPSModelObject, "getSeriesField");
		this.setDomainValue(iPSModelTranspileContext, domain, "serieslayoutby", realPSModelObject.getSeriesLayoutBy(), realPSModelObject, "getSeriesLayoutBy");
		this.setDomainValue(iPSModelTranspileContext, domain, "sfpscodelistid", realPSModelObject.getSeriesPSCodeList(), realPSModelObject, "getSeriesPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "charttype", realPSModelObject.getSeriesType(), realPSModelObject, "getSeriesType");
		this.setDomainValue(iPSModelTranspileContext, domain, "tagfield", realPSModelObject.getTagField(), realPSModelObject, "getTagField");
		this.setDomainValue(iPSModelTranspileContext, domain, "yfield", realPSModelObject.getValueField(), realPSModelObject, "getValueField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCATALOGFIELD, domain, "xfield", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCATALOGPSCODELIST, domain, "xfpscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAFIELD, domain, "datafield", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXTVALUE2FIELD, domain, "extfield2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXTVALUE3FIELD, domain, "extfield3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXTVALUE4FIELD, domain, "extfield4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXTVALUEFIELD, domain, "extfield", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPMODE, domain, "timegroup", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIDFIELD, domain, "zfield", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSAMPLEDATA, domain, "sampledata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERIESFIELD, domain, "seriesfield", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERIESLAYOUTBY, domain, "serieslayoutby", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERIESPSCODELIST, domain, "sfpscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERIESTYPE, domain, "charttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTAGFIELD, domain, "tagfield", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEFIELD, domain, "yfield", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}