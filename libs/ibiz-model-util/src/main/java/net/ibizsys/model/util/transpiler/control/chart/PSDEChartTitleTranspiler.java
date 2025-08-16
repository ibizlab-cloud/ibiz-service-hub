package net.ibizsys.model.util.transpiler.control.chart;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.chart.PSDEChartTitleImpl.*;



public class PSDEChartTitleTranspiler extends net.ibizsys.model.util.transpiler.control.chart.PSDEChartObjectTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.chart.PSDEChartTitleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.chart.PSDEChartTitleImpl realPSModelObject = (net.ibizsys.model.control.chart.PSDEChartTitleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "subtitle", realPSModelObject.getSubTitle(), realPSModelObject, "getSubTitle");
		this.setDomainValue(iPSModelTranspileContext, domain, "subtitlepslanresid", realPSModelObject.getSubTitlePSLanguageRes(), realPSModelObject, "getSubTitlePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getTitle(), realPSModelObject, "getTitle");
		this.setDomainValue(iPSModelTranspileContext, domain, "lnpslanresid", realPSModelObject.getTitlePSLanguageRes(), realPSModelObject, "getTitlePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "titlepos", realPSModelObject.getTitlePos(), realPSModelObject, "getTitlePos");
		this.setDomainValue(iPSModelTranspileContext, domain, "showtitle", realPSModelObject.isShowTitle(), realPSModelObject, "isShowTitle");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBTITLE, domain, "subtitle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBTITLEPSLANGUAGERES, domain, "subtitlepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLE, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEPSLANGUAGERES, domain, "lnpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEPOS, domain, "titlepos", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWTITLE, domain, "showtitle", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}